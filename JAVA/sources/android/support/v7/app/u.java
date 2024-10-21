package android.support.v7.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.d.e;
import androidx.d.h;
import androidx.d.i;
import java.lang.ref.WeakReference;

/* loaded from: classes-dex2jar.jar:android/support/v7/app/u.class */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    static final s f35a = new s(new t());
    public static int b = -100;
    public static e c = null;
    public static e d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final i f = new i(0);
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void k(u uVar) {
        synchronized (g) {
            h hVar = new h(f);
            while (hVar.hasNext()) {
                u uVar2 = (u) ((WeakReference) hVar.next()).get();
                if (uVar2 == uVar || uVar2 == null) {
                    hVar.remove();
                }
            }
        }
    }

    public static void o(int i2) {
        if (b != i2) {
            b = i2;
            synchronized (g) {
                h hVar = new h(f);
                while (hVar.hasNext()) {
                    u uVar = (u) ((WeakReference) hVar.next()).get();
                    if (uVar != null) {
                        uVar.t();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) aq.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract MenuInflater b();

    public abstract View c(int i2);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void l(int i2);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void p(int i2);

    public abstract void q(Toolbar toolbar);

    public abstract void r(CharSequence charSequence);

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w(int i2);
}
