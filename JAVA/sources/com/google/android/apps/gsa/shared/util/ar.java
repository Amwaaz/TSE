package com.google.android.apps.gsa.shared.util;

import a.a;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.bu;
import com.google.common.base.cl;
import com.google.common.base.l;
import com.google.common.f.h;
import com.google.common.l.m;
import com.google.common.l.r;
import com.google.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/ar.class */
public class ar {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1501a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.ar");
    public static final Charset b = Charset.forName("UTF-8");

    public static Intent a(Intent intent) {
        if (intent != null && x(intent.getExtras())) {
            return intent;
        }
        return null;
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bundle c(Bundle bundle) {
        if (x(bundle)) {
            return bundle;
        }
        return null;
    }

    public static Bundle d(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    public static Parcelable e(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (Exception e) {
                h g = f1501a.e().g(e);
                g.ak(9300);
                g.p("Failed to unmarshall");
                parcelable = null;
            }
            obtain.recycle();
            return parcelable;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public static v f(Parcelable parcelable) {
        byte[] bArr;
        try {
            bArr = w(parcelable);
        } catch (RuntimeException e) {
            a.dB(f1501a.f(), "Failed to marshall Parcelable ", (char) 9301, e);
            bArr = null;
        }
        return bArr == null ? v.b : v.x(bArr, 0, bArr.length);
    }

    public static String g(String str) {
        List j = bu.c(new l('-')).j(str);
        return j.size() == 1 ? str : (String) j.get(0);
    }

    public static String h() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder(locale.getLanguage().toLowerCase(Locale.US));
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country.toUpperCase(Locale.US));
        }
        return sb.toString();
    }

    public static String i(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append("-");
            sb.append(variant);
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append("-");
            sb.append(country);
        }
        return sb.toString();
    }

    public static Locale j(String str) {
        String[] split = str.split("-");
        int length = split.length;
        if (length == 1) {
            return new Locale(split[0]);
        }
        if (length == 2) {
            return (split[1].equals("Hant") || split[1].equals("Hans")) ? new Locale(split[0], "", split[1]) : new Locale(split[0], split[1]);
        }
        if (length == 3) {
            return new Locale(split[0], split[2], split[1]);
        }
        h f = f1501a.f();
        f.ak(9303);
        f.s("Unsupported locale format: %s", str);
        return null;
    }

    public static Map k(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static boolean l(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean m(Uri uri) {
        return cl.V(uri.getAuthority(), "/android_asset") && cl.V(uri.getScheme(), "file");
    }

    public static boolean n(Context context) {
        BluetoothAdapter defaultAdapter;
        return (context == null || context.getApplicationContext() == null || androidx.core.content.a.c(context.getApplicationContext(), "android.permission.BLUETOOTH") != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) ? false : true;
    }

    public static boolean o(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        String T = cl.T(scheme);
        return "file".equals(T) || "content".equals(T) || "android.resource".equals(T);
    }

    public static boolean p(Context context) {
        return (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "airplane_mode_on", 0) == 0) ? false : true;
    }

    public static boolean q(Context context) {
        return (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "zen_mode", 0) == 0) ? false : true;
    }

    public static boolean r(Context context) {
        boolean z;
        try {
            z = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        } catch (VerifyError e) {
            h g = f1501a.e().g(e);
            g.ak(9307);
            g.w("API version: %d, Kitkat API version: %d", Build.VERSION.SDK_INT, 19);
            z = false;
        }
        return z;
    }

    public static boolean s(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled();
    }

    public static boolean t(String str, String str2) {
        return TextUtils.equals(g(str), g(str2));
    }

    public static boolean u(Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 29 && context != null && context.getApplicationContext() != null && androidx.core.content.a.c(context.getApplicationContext(), "android.permission.CHANGE_WIFI_STATE") == 0) {
            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
        }
        return false;
    }

    public static byte[] v(Resources resources, int i) {
        InputStream inputStream;
        InputStream inputStream2;
        try {
            inputStream2 = resources.openRawResource(i);
            inputStream = inputStream2;
        } catch (IOException e) {
            e = e;
            inputStream2 = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
            r.a(inputStream);
            throw th;
        }
        try {
            try {
                byte[] c = m.c(inputStream2);
                r.a(inputStream2);
                return c;
            } catch (Throwable th2) {
                th = th2;
                r.a(inputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            h g = f1501a.e().g(e);
            InputStream inputStream3 = inputStream2;
            g.ak(9309);
            inputStream = inputStream2;
            g.q("Failed to load raw resource %d", i);
            r.a(inputStream2);
            return null;
        }
    }

    public static byte[] w(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    private static boolean x(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        try {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                bundle.get(it.next());
            }
            return true;
        } catch (RuntimeException e) {
            a.dB(f1501a.f(), "Error probing the bundle", (char) 9305, e);
            return false;
        }
    }
}
