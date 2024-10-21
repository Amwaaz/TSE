package androidx.v;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import androidx.tracing.a;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:androidx/v/b.class */
public class b extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new d();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (a.a == null) {
            synchronized (a.b) {
                if (a.a == null) {
                    a.a = new a(context);
                }
            }
        }
        Class<?> cls = getClass();
        a aVar = a.a;
        try {
            try {
                a.a("Startup");
                Bundle bundle = aVar.e.getPackageManager().getProviderInfo(new ComponentName(aVar.e, cls), 128).metaData;
                String string = aVar.e.getString(2132083067);
                if (bundle != null) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls2 = Class.forName(str);
                                if (c.class.isAssignableFrom(cls2)) {
                                    aVar.d.add(cls2);
                                }
                            }
                        }
                        Iterator it = aVar.d.iterator();
                        while (it.hasNext()) {
                            aVar.a((Class) it.next(), hashSet);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new d(e);
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new d(e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
