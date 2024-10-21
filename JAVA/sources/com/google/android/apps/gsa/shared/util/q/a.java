package com.google.android.apps.gsa.shared.util.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gsa.shared.k.f;
import com.google.android.apps.gsa.shared.k.g;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.common.b.fl;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/q/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1574a = j.i("com.google.android.apps.gsa.shared.util.q.a");
    public static final fl b = fl.A("GSAPrefs.customtabs_no_session_in_now", "GSAPrefs.Bisto__enable_bisto_feature", "GEL.GSAPrefs.now_opted_in_version", "GSAPrefs.last_optin_error_time", "GSAPrefs.first_run_screens_shown", "GSAPrefs.show_first_run_optin", "GSAPrefs.show_express_optin", "GSAPrefs.np_stream_allowed", "GSAPrefs.now_promo_dismissed", "GSAPrefs.search_gesture_used", "GEL.GSAPrefs.can_optin_to_now", "GEL.GSAPrefs.is_trying_to_optin_to_now", new String[]{"GSAPrefs.should_show_now_cards", "GsaPrefs.Bisto__apollo_ota_minimum_system_version", "GsaPrefs.Bisto__apollo_ota_system_url", "GsaPrefs.Bisto__apollo_ota_system_version", "GsaPrefs.Bisto__apollo_configurable_double_tap", "GsaPrefs.Bisto__baywolf_ota_system_url", "GsaPrefs.Bisto__baywolf_ota_system_version", "GsaPrefs.Bisto__scout_ota_system_url", "GsaPrefs.Bisto__scout_ota_system_version", "GsaPrefs.Bisto__bisto_hotwording", "GsaPrefs.Bisto__first_stage_hotwording", "GsaPrefs.bisto_query_migrate_to_session", "GsaPrefs.splash_animation_times_to_show", "GsaPrefs.Bisto__notification_fetch_clientop", "GsaPrefs.Bisto__enable_hotword_helper_speaker_id_nullness_checker", "GsaPrefs.Bisto__enable_audio_cache", "GSAPrefs.Bisto__service_shutdown_delay_ms", "GsaPrefs.Bisto__hotword_activation_timeout_ms", "GSAPrefs.TNG_MINUS_ONE_ENABLED", "GSAPrefs.TNG_ACETONE_ENABLED", "GSAPrefs.TNG_HOMESCREEN_ENABLED"});
    protected final Context c;
    private SharedPreferences d;

    public a(Context context) {
        this.c = context;
    }

    public void a() {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        this.c.getSharedPreferences("GEL.GSAPrefs", 4);
    }

    public final long c(String str, long j) {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        SharedPreferences e = e();
        try {
            j = e.getLong(str, j);
        } catch (ClassCastException e2) {
            if (e.contains(str)) {
                return e.getInt(str, -1);
            }
        }
        return j;
    }

    public final long d(f fVar) {
        return c("flag." + fVar.f1451a, fVar.b);
    }

    public final SharedPreferences e() {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            if (this.d == null) {
                this.d = this.c.getSharedPreferences("GEL.GSAPrefs", 0);
            }
            sharedPreferences = this.d;
        }
        return sharedPreferences;
    }

    public final v f(g gVar) {
        String g = g("flag." + gVar.f1452a, null);
        if (g != null) {
            try {
                byte[] decode = Base64.decode(g, 2);
                v vVar = v.b;
                return v.x(decode, 0, decode.length);
            } catch (IllegalArgumentException e) {
                h g2 = f1574a.e().g(e);
                g2.ak(9408);
                g2.q("Invalid byte flag: %d", gVar.f1452a);
            }
        }
        return v.b;
    }

    public final String g(String str, String str2) {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return e().getString(str, str2);
    }

    public final String h(com.google.android.apps.gsa.shared.k.h hVar) {
        return g("flag." + hVar.f1453a, hVar.b);
    }

    public final boolean i(com.google.android.apps.gsa.shared.k.d dVar) {
        return j("flag." + dVar.f1434a, dVar.b);
    }

    public final boolean j(String str, boolean z) {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return e().getBoolean(str, z);
    }
}
