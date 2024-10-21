package com.google.android.apps.gsa.opa.smartspace;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import androidx.slice.b$;
import com.google.android.apps.gsa.search.core.ac;
import com.google.android.apps.gsa.search.core.ae;
import com.google.android.apps.gsa.shared.k.am;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.libraries.g.a;
import com.google.common.b.ha;
import com.google.common.f.a.e;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.g.c.ay;
import com.google.g.c.az;
import com.google.g.c.bf;
import com.google.g.c.bn;
import com.google.g.q.b.v;
import com.google.protobuf.ba;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/smartspace/d.class */
public class d {
    public final com.google.android.apps.gsa.search.core.h.p e;
    public final c f;
    public final Context g;
    private final a i;
    private final com.google.android.apps.gsa.search.core.aa.a.c j;
    private static final long h = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public static final j f1027a = j.i("com.google.android.apps.gsa.opa.smartspace.d");
    public static final ha b = ha.s(v.d, v.e);
    public static final ha c = ha.w(ay.h, ay.c, ay.j, ay.o, ay.i, ay.k, new ay[]{ay.d, ay.l, ay.m, ay.p, ay.r, ay.s});
    public static final ha d = ha.w(ay.b, ay.h, ay.m, ay.o, ay.n, ay.q, new ay[]{ay.Q, ay.R, ay.X, ay.Y});

    public d(c cVar, com.google.android.apps.gsa.search.core.h.p pVar, a aVar, Context context, com.google.android.apps.gsa.search.core.aa.a.c cVar2) {
        this.f = cVar;
        this.e = pVar;
        this.i = aVar;
        this.g = context;
        this.j = cVar2;
    }

    public static Intent a() {
        return new Intent("android.settings.ASI_SMARTSPACE_SETTINGS").setPackage("com.google.android.as");
    }

    public static boolean k(ae aeVar) {
        return aeVar.a(new ac[]{ac.d}).f(ac.d);
    }

    public static boolean u(ae aeVar) {
        return aeVar.a(new ac[]{ac.g}).f(ac.g);
    }

    public static boolean w(Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        return appWidgetManager != null && appWidgetManager.getAppWidgetIds(com.google.android.apps.search.assistant.verticals.ambient.s.a.d.f).length > 0;
    }

    public final bf b() {
        bn createBuilder = bf.a.createBuilder();
        createBuilder.copyOnWrite();
        bf bfVar = createBuilder.instance;
        bfVar.b |= 1;
        bfVar.d = true;
        createBuilder.copyOnWrite();
        bf bfVar2 = createBuilder.instance;
        bfVar2.e = 1;
        bfVar2.b |= 2;
        ba createBuilder2 = az.a.createBuilder();
        long epochMilli = this.i.f().toEpochMilli();
        long j = h;
        createBuilder2.copyOnWrite();
        az azVar = createBuilder2.instance;
        azVar.b = 1 | azVar.b;
        azVar.c = epochMilli + j;
        createBuilder.copyOnWrite();
        bf bfVar3 = createBuilder.instance;
        az build = createBuilder2.build();
        build.getClass();
        bfVar3.u = build;
        bfVar3.b |= 131072;
        return createBuilder.build();
    }

    public final String c() {
        return r() ? "Pixel" : Build.MODEL;
    }

    public final boolean d() {
        return this.e.w(am.e);
    }

    public final boolean e() {
        return this.e.w(bc.r);
    }

    public final boolean f() {
        return this.e.w(am.h);
    }

    public final boolean g() {
        if (r() && Build.VERSION.SDK_INT >= 31) {
            try {
                if (b$.ExternalSyntheticApiModelOutline0.m(this.g.getPackageManager().getPackageInfo("com.google.android.as", 0)) > 6488361) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                y f = f1027a.f();
                f.aj(e.a, "OpaSsSharedUtils");
                a.a.dB(f, "Error obtaining package info", (char) 6077, e);
            }
        }
        return this.e.w(bc.as);
    }

    public final boolean h() {
        PowerManager powerManager = (PowerManager) this.g.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isDeviceIdleMode();
        }
        h f = f1027a.f();
        f.aj(e.a, "OpaSsSharedUtils");
        h hVar = f;
        hVar.ak(6078);
        hVar.p("Context.POWER_SERVICE was not available.");
        return false;
    }

    public final boolean i() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.ic);
    }

    public final boolean j() {
        return this.e.w(bc.M);
    }

    public final boolean l() {
        return this.g.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
    }

    public final boolean m() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.js);
    }

    public final boolean n() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.jA);
    }

    public final boolean o() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.dz);
    }

    public final boolean p() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.dA) || this.j.q;
    }

    public final boolean q() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.dB);
    }

    public final boolean r() {
        String str = Build.MODEL;
        return str.startsWith("Pixel") || this.g.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE") || this.e.m(com.google.android.apps.gsa.shared.k.az.hT).contains(str);
    }

    public final boolean s() {
        return w(this.g) || r() || l();
    }

    public final boolean t() {
        return this.e.w(am.m);
    }

    public final boolean v() {
        return this.e.w(am.p);
    }

    public final boolean x() {
        return this.e.w(com.google.android.apps.gsa.shared.k.az.jk);
    }

    public final boolean y() {
        return this.j.F && !r() && w(this.g);
    }
}
