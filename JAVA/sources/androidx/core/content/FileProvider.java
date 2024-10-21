package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes-dex2jar.jar:androidx/core/content/FileProvider.class */
public class FileProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f44a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private final Object d;
    private String e;
    private final int f;
    private b g;

    public FileProvider() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FileProvider(int i) {
        this.d = new Object();
        this.f = i;
    }

    public static Uri a(Context context, String str, File file) {
        b d = d(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : d.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (b.b(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(d.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException e) {
            Objects.toString(file);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
        }
    }

    public static String b(String str) {
        String str2 = str;
        if (str.length() > 0) {
            str2 = str;
            if (str.charAt(str.length() - 1) == '/') {
                str2 = str.substring(0, str.length() - 1);
            }
        }
        return str2;
    }

    private final b c() {
        b bVar;
        synchronized (this.d) {
            a.a.cl(this.e, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.g == null) {
                this.g = d(getContext(), this.e, this.f);
            }
            bVar = this.g;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89 */
    private static b d(Context context, String str, int i) {
        b bVar;
        File file;
        HashMap hashMap = c;
        synchronized (hashMap) {
            b bVar2 = (b) hashMap.get(str);
            bVar = bVar2;
            if (bVar2 == null) {
                try {
                    try {
                        b bVar3 = new b(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (resolveContentProvider == null) {
                            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                        }
                        if (resolveContentProvider.metaData == null && i != 0) {
                            resolveContentProvider.metaData = new Bundle(1);
                            resolveContentProvider.metaData.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData == null) {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        while (true) {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                c.put(str, bVar3);
                                bVar = bVar3;
                                break;
                            }
                            if (next == 2) {
                                String name = loadXmlMetaData.getName();
                                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    file = b;
                                } else if ("files-path".equals(name)) {
                                    file = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    file = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    file = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                    file = null;
                                    if (externalFilesDirs.length > 0) {
                                        file = externalFilesDirs[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    File[] externalCacheDirs = context.getExternalCacheDirs();
                                    file = null;
                                    if (externalCacheDirs.length > 0) {
                                        file = externalCacheDirs[0];
                                    }
                                } else {
                                    file = null;
                                    if ("external-media-path".equals(name)) {
                                        File[] externalMediaDirs = context.getExternalMediaDirs();
                                        file = null;
                                        if (externalMediaDirs.length > 0) {
                                            file = externalMediaDirs[0];
                                        }
                                    }
                                }
                                if (file != null) {
                                    boolean z = false;
                                    while (z <= 0) {
                                        String str2 = new String[]{attributeValue2}[0];
                                        File file2 = file;
                                        if (str2 != null) {
                                            file2 = new File(file, str2);
                                        }
                                        z = true;
                                        file = file2;
                                    }
                                    if (TextUtils.isEmpty(attributeValue)) {
                                        throw new IllegalArgumentException("Name must not be empty");
                                    }
                                    try {
                                        bVar3.b.put(attributeValue, file.getCanonicalFile());
                                    } catch (IOException e) {
                                        Objects.toString(file);
                                        throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file.toString()), e);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return bVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.d) {
            this.e = str;
        }
        HashMap hashMap = c;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return c().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a2 = c().a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a2 = c().a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(a2, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        int i2;
        File a2 = c().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        String[] strArr3 = strArr;
        if (strArr == null) {
            strArr3 = f44a;
        }
        int length = strArr3.length;
        String[] strArr4 = new String[length];
        Object[] objArr = new Object[length];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i3 >= strArr3.length) {
                String[] strArr5 = new String[i5];
                System.arraycopy(strArr4, 0, strArr5, 0, i5);
                Object[] objArr2 = new Object[i5];
                System.arraycopy(objArr, 0, objArr2, 0, i5);
                MatrixCursor matrixCursor = new MatrixCursor(strArr5, 1);
                matrixCursor.addRow(objArr2);
                return matrixCursor;
            }
            String str3 = strArr3[i3];
            if ("_display_name".equals(str3)) {
                int i6 = i5 + 1;
                strArr4[i5] = "_display_name";
                objArr[i5] = queryParameter == null ? a2.getName() : queryParameter;
                i2 = i6;
            } else {
                i = i5;
                if ("_size".equals(str3)) {
                    strArr4[i5] = "_size";
                    objArr[i5] = Long.valueOf(a2.length());
                    i2 = i5 + 1;
                } else {
                    i3++;
                    i4 = i;
                }
            }
            i = i2;
            i3++;
            i4 = i;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
