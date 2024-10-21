package com.google.android.apps.gsa.smartspace;

import a.a;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.u.b.e;
import com.google.common.f.j;
import com.google.common.f.y;
import h.a.a.p.b.a.f;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/smartspace/h.class */
public final class h {
    private static final j c = j.i("com.google.android.apps.gsa.smartspace.h");
    private static final ComponentName d = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider");

    /* renamed from: a, reason: collision with root package name */
    public final g f1584a;
    public final e b;
    private final SharedPreferences e;
    private final Context f;

    public h(SharedPreferences sharedPreferences, Context context, e eVar, g gVar) {
        this.e = sharedPreferences;
        this.f = context;
        this.f1584a = gVar;
        this.b = eVar;
    }

    public final void a(boolean z) {
        this.b.a("smartspace_calendar_enabled", z);
    }

    public final void b(boolean z) {
        this.b.a("smartspace_reminder_enabled", z);
    }

    public final boolean c() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f);
        return appWidgetManager != null && appWidgetManager.getAppWidgetIds(d).length > 0;
    }

    public final boolean d() {
        String str = Build.MODEL;
        return str.startsWith("Pixel") || this.f.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE") || this.f1584a.a(az.hT).contains(str);
    }

    public final boolean e() {
        if (!g()) {
            return false;
        }
        try {
            Boolean bool = (Boolean) PackageManager.class.getMethod("isPackageSuspended", String.class).invoke(this.f.getPackageManager(), "com.google.android.calendar");
            if (bool != null) {
                if (bool.booleanValue()) {
                    return false;
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            y f = c.f();
            f.aj(com.google.common.f.a.e.a, "SmartspaceIntentLgUtils");
            a.dB(f, "Failed to check package suspension status.", (char) 9499, e);
        }
        return this.b.b("smartspace_calendar_enabled");
    }

    public final boolean f() {
        return g() && this.b.b("smartspace_commute_enabled");
    }

    public final boolean g() {
        return this.e.getBoolean("smartspace_enabled", false) || c() || d() || this.f.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
    }

    public final boolean h() {
        return d() && f.w() && n();
    }

    public final boolean i() {
        return g() && this.b.b("smartspace_reminder_enabled");
    }

    public final boolean j() {
        return g() && this.f1584a.b(az.jx) && this.b.b("smartspace_stock_price_change_enabled");
    }

    public final boolean k() {
        return g() && this.f1584a.b(az.jz) && this.b.b("smartspace_weather_alert_enabled");
    }

    public final boolean l() {
        return g() && this.b.b("smartspace_weather_enabled");
    }

    public final boolean m() {
        return g() && this.b.b("smartspace_work_profile_access_enabled") && this.f1584a.b(az.jA);
    }

    public final boolean n() {
        return this.b.b("smartspace_flight_enabled");
    }
}
