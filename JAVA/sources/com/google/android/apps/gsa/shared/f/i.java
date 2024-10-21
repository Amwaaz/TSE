package com.google.android.apps.gsa.shared.f;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.bi;
import com.google.android.apps.gsa.shared.k.d;
import com.google.android.apps.gsa.shared.k.ep;
import com.google.android.apps.gsa.shared.k.f;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.b.nr;
import com.google.common.base.bu;
import com.google.common.base.ca;
import com.google.common.base.cf;
import com.google.common.base.cl;
import com.google.common.base.l;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/f/i.class */
public class i implements e {
    private static final ca b;
    private static final ca c;
    private static final ca d;
    private final a f;
    private final com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.p g;

    /* renamed from: a, reason: collision with root package name */
    private static final j f1393a = j.i("com.google.android.apps.gsa.shared.f.i");
    private static final ca e = new cf(nn.a);

    static {
        final int i = 1;
        b = cl.d(new ca(i) { // from class: com.google.android.apps.gsa.shared.f.g

            /* renamed from: a, reason: collision with root package name */
            private final int f1391a;

            {
                this.f1391a = i;
            }

            public final Object a() {
                int i2 = this.f1391a;
                if (i2 == 0) {
                    fq fqVar = new fq(4);
                    fqVar.i("enabled_features", new h(ep.e, "GsaPrefs.Bisto__enabled_features"));
                    fqVar.i("user_group_name", new h(ep.j, "GsaPrefs.Bisto__user_group_name"));
                    fqVar.i("messaging_parsing_blacklist", new h(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist"));
                    return fqVar.h(false);
                }
                if (i2 != 1) {
                    fq fqVar2 = new fq(4);
                    fqVar2.i("enable_message_style_parser_for_whatsapp", new h(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp"));
                    fqVar2.i("enable_message_style_parser_for_messages_and_hangouts", new h(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts"));
                    fqVar2.i("enable_message_style_parser_for_facebook_messenger", new h(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger"));
                    return fqVar2.h(false);
                }
                fq fqVar3 = new fq(4);
                fqVar3.i("enabled_features", "");
                fqVar3.i("ota_min_battery", 20);
                fqVar3.i("user_group_name", "Unknown");
                fqVar3.i("min_aggregate_size", 3);
                fqVar3.i("recent_notifs_period_sec", 7);
                fqVar3.i("launch_interruptive_if_off_head_msec", Long.valueOf(TimeUnit.MINUTES.toMillis(5L)));
                fqVar3.i("notification_delivery_expiry_time_ms", Long.valueOf(TimeUnit.HOURS.toMillis(1L)));
                fqVar3.i("dnd_fetch_ann_freq", Long.valueOf(TimeUnit.MINUTES.toMillis(60L)));
                fqVar3.i("messaging_parsing_blacklist", "");
                fqVar3.i("calendar_max_words", 4);
                fqVar3.i("calendar_max_chars", 40);
                fqVar3.i("calendar_mins_after_event_start_to_remove", 1);
                fqVar3.i("tts_rate", Float.valueOf(-1.0f));
                fqVar3.i("audio_player_timeout_ms", 3000);
                fqVar3.i("min_volume_threshold_ratio", Float.valueOf(0.6f));
                fqVar3.i("volume_raise_delay", 300);
                fqVar3.i("ann_add_delay_time_msec", 100);
                fqVar3.i("ann_remove_delay_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("ann_wait_for_parent_or_child_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("clearcut_logging", true);
                fqVar3.i("bisto_spoken_notifications", true);
                fqVar3.i("key_send_diagnostics", false);
                fqVar3.i("enable_message_style_parser_for_whatsapp", false);
                fqVar3.i("enable_message_style_parser_for_messages_and_hangouts", false);
                fqVar3.i("enable_message_style_parser_for_facebook_messenger", false);
                fqVar3.i("key_personal_results_enabled", false);
                fqVar3.i("key_personal_results_headphones_enabled", false);
                return fqVar3.h(false);
            }
        });
        final int i2 = 0;
        c = cl.d(new ca(i2) { // from class: com.google.android.apps.gsa.shared.f.g

            /* renamed from: a, reason: collision with root package name */
            private final int f1391a;

            {
                this.f1391a = i2;
            }

            public final Object a() {
                int i22 = this.f1391a;
                if (i22 == 0) {
                    fq fqVar = new fq(4);
                    fqVar.i("enabled_features", new h(ep.e, "GsaPrefs.Bisto__enabled_features"));
                    fqVar.i("user_group_name", new h(ep.j, "GsaPrefs.Bisto__user_group_name"));
                    fqVar.i("messaging_parsing_blacklist", new h(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist"));
                    return fqVar.h(false);
                }
                if (i22 != 1) {
                    fq fqVar2 = new fq(4);
                    fqVar2.i("enable_message_style_parser_for_whatsapp", new h(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp"));
                    fqVar2.i("enable_message_style_parser_for_messages_and_hangouts", new h(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts"));
                    fqVar2.i("enable_message_style_parser_for_facebook_messenger", new h(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger"));
                    return fqVar2.h(false);
                }
                fq fqVar3 = new fq(4);
                fqVar3.i("enabled_features", "");
                fqVar3.i("ota_min_battery", 20);
                fqVar3.i("user_group_name", "Unknown");
                fqVar3.i("min_aggregate_size", 3);
                fqVar3.i("recent_notifs_period_sec", 7);
                fqVar3.i("launch_interruptive_if_off_head_msec", Long.valueOf(TimeUnit.MINUTES.toMillis(5L)));
                fqVar3.i("notification_delivery_expiry_time_ms", Long.valueOf(TimeUnit.HOURS.toMillis(1L)));
                fqVar3.i("dnd_fetch_ann_freq", Long.valueOf(TimeUnit.MINUTES.toMillis(60L)));
                fqVar3.i("messaging_parsing_blacklist", "");
                fqVar3.i("calendar_max_words", 4);
                fqVar3.i("calendar_max_chars", 40);
                fqVar3.i("calendar_mins_after_event_start_to_remove", 1);
                fqVar3.i("tts_rate", Float.valueOf(-1.0f));
                fqVar3.i("audio_player_timeout_ms", 3000);
                fqVar3.i("min_volume_threshold_ratio", Float.valueOf(0.6f));
                fqVar3.i("volume_raise_delay", 300);
                fqVar3.i("ann_add_delay_time_msec", 100);
                fqVar3.i("ann_remove_delay_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("ann_wait_for_parent_or_child_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("clearcut_logging", true);
                fqVar3.i("bisto_spoken_notifications", true);
                fqVar3.i("key_send_diagnostics", false);
                fqVar3.i("enable_message_style_parser_for_whatsapp", false);
                fqVar3.i("enable_message_style_parser_for_messages_and_hangouts", false);
                fqVar3.i("enable_message_style_parser_for_facebook_messenger", false);
                fqVar3.i("key_personal_results_enabled", false);
                fqVar3.i("key_personal_results_headphones_enabled", false);
                return fqVar3.h(false);
            }
        });
        final int i3 = 2;
        d = cl.d(new ca(i3) { // from class: com.google.android.apps.gsa.shared.f.g

            /* renamed from: a, reason: collision with root package name */
            private final int f1391a;

            {
                this.f1391a = i3;
            }

            public final Object a() {
                int i22 = this.f1391a;
                if (i22 == 0) {
                    fq fqVar = new fq(4);
                    fqVar.i("enabled_features", new h(ep.e, "GsaPrefs.Bisto__enabled_features"));
                    fqVar.i("user_group_name", new h(ep.j, "GsaPrefs.Bisto__user_group_name"));
                    fqVar.i("messaging_parsing_blacklist", new h(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist"));
                    return fqVar.h(false);
                }
                if (i22 != 1) {
                    fq fqVar2 = new fq(4);
                    fqVar2.i("enable_message_style_parser_for_whatsapp", new h(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp"));
                    fqVar2.i("enable_message_style_parser_for_messages_and_hangouts", new h(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts"));
                    fqVar2.i("enable_message_style_parser_for_facebook_messenger", new h(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger"));
                    return fqVar2.h(false);
                }
                fq fqVar3 = new fq(4);
                fqVar3.i("enabled_features", "");
                fqVar3.i("ota_min_battery", 20);
                fqVar3.i("user_group_name", "Unknown");
                fqVar3.i("min_aggregate_size", 3);
                fqVar3.i("recent_notifs_period_sec", 7);
                fqVar3.i("launch_interruptive_if_off_head_msec", Long.valueOf(TimeUnit.MINUTES.toMillis(5L)));
                fqVar3.i("notification_delivery_expiry_time_ms", Long.valueOf(TimeUnit.HOURS.toMillis(1L)));
                fqVar3.i("dnd_fetch_ann_freq", Long.valueOf(TimeUnit.MINUTES.toMillis(60L)));
                fqVar3.i("messaging_parsing_blacklist", "");
                fqVar3.i("calendar_max_words", 4);
                fqVar3.i("calendar_max_chars", 40);
                fqVar3.i("calendar_mins_after_event_start_to_remove", 1);
                fqVar3.i("tts_rate", Float.valueOf(-1.0f));
                fqVar3.i("audio_player_timeout_ms", 3000);
                fqVar3.i("min_volume_threshold_ratio", Float.valueOf(0.6f));
                fqVar3.i("volume_raise_delay", 300);
                fqVar3.i("ann_add_delay_time_msec", 100);
                fqVar3.i("ann_remove_delay_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("ann_wait_for_parent_or_child_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
                fqVar3.i("clearcut_logging", true);
                fqVar3.i("bisto_spoken_notifications", true);
                fqVar3.i("key_send_diagnostics", false);
                fqVar3.i("enable_message_style_parser_for_whatsapp", false);
                fqVar3.i("enable_message_style_parser_for_messages_and_hangouts", false);
                fqVar3.i("enable_message_style_parser_for_facebook_messenger", false);
                fqVar3.i("key_personal_results_enabled", false);
                fqVar3.i("key_personal_results_headphones_enabled", false);
                return fqVar3.h(false);
            }
        });
    }

    public i(a aVar, com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.p pVar) {
        this.f = aVar;
        this.g = pVar;
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final long a(String str) {
        h hVar = (h) ((fu) e.a).get(str);
        a aVar = this.f;
        if (aVar == null || hVar == null) {
            ca caVar = b;
            if (!((fu) caVar.a()).containsKey(str)) {
                return 0L;
            }
            Object obj = ((fu) caVar.a()).get(str);
            obj.getClass();
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException e2) {
                return ((Integer) obj).intValue();
            }
        }
        try {
            return this.f.c(hVar.b, aVar.d((f) hVar.f1392a));
        } catch (ClassCastException e3) {
            y f = f1393a.f();
            f.aj(com.google.common.f.a.e.a, "ConfigHelper");
            aus.b(f, "Wrong type for config key %s", str, (char) 8639, e3);
            return 0L;
        }
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final String b(String str) {
        a aVar = this.f;
        if (aVar == null) {
            ca caVar = b;
            return ((fu) caVar.a()).containsKey(str) ? (String) ((fu) caVar.a()).get(str) : "";
        }
        h hVar = (h) ((fu) c.a()).get(str);
        String str2 = "";
        if (hVar != null) {
            try {
                str2 = aVar.g(hVar.b, aVar.h((com.google.android.apps.gsa.shared.k.h) hVar.f1392a));
            } catch (ClassCastException e2) {
                y f = f1393a.f();
                f.aj(com.google.common.f.a.e.a, "ConfigHelper");
                aus.b(f, "Wrong type for config key %s", str, (char) 8640, e2);
                str2 = "";
            }
        }
        return str2;
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final String c(String str) {
        ca caVar = b;
        String str2 = ((fu) caVar.a()).containsKey(str) ? (String) ((fu) caVar.a()).get(str) : null;
        a aVar = this.f;
        if (aVar != null) {
            try {
                return aVar.g(str, str2);
            } catch (ClassCastException e2) {
                y f = f1393a.f();
                f.aj(com.google.common.f.a.e.a, "ConfigHelper");
                aus.b(f, "Wrong type for config key %s", str, (char) 8641, e2);
            }
        }
        return str2;
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final void d() {
        ab abVar = com.google.common.f.a.e.a;
        a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean e(String str) {
        h hVar = (h) ((fu) d.a()).get(str);
        a aVar = this.f;
        if (aVar == null || hVar == null) {
            ca caVar = b;
            if (!((fu) caVar.a()).containsKey(str)) {
                return false;
            }
            Object obj = ((fu) caVar.a()).get(str);
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }
        try {
            return this.f.j(hVar.b, aVar.i((d) hVar.f1392a));
        } catch (ClassCastException e2) {
            y f = f1393a.f();
            f.aj(com.google.common.f.a.e.a, "ConfigHelper");
            aus.b(f, "Wrong type for config key %s", str, (char) 8643, e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // com.google.android.apps.gsa.shared.f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.String r7) {
        /*
            r6 = this;
            com.google.common.base.ca r0 = com.google.android.apps.gsa.shared.f.i.b
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.a()
            com.google.common.b.fu r0 = (com.google.common.b.fu) r0
            r1 = r7
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L36
            r0 = r9
            java.lang.Object r0 = r0.a()
            com.google.common.b.fu r0 = (com.google.common.b.fu) r0
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            r0 = 1
            r8 = r0
            goto L38
        L36:
            r0 = 0
            r8 = r0
        L38:
            r0 = r6
            com.google.android.apps.gsa.shared.util.q.a r0 = r0.f
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6d
            r0 = r9
            r1 = r7
            r2 = r8
            boolean r0 = r0.j(r1, r2)     // Catch: java.lang.ClassCastException -> L4a
            r8 = r0
            r0 = r8
            return r0
        L4a:
            r9 = move-exception
            com.google.common.f.j r0 = com.google.android.apps.gsa.shared.f.i.f1393a
            com.google.common.f.y r0 = r0.f()
            r10 = r0
            r0 = r10
            com.google.common.f.ab r1 = com.google.common.f.a.e.a
            java.lang.String r2 = "ConfigHelper"
            r0.aj(r1, r2)
            r0 = r10
            java.lang.String r1 = "Wrong type for config key %s"
            r2 = r7
            r3 = 8644(0x21c4, float:1.2113E-41)
            r4 = r9
            com.google.ads.interactivemedia.v3.internal.aus.b(r0, r1, r2, r3, r4)
            r0 = 0
            return r0
        L6d:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.f.i.f(java.lang.String):boolean");
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean g() {
        String b2 = b("user_group_name");
        return b2 != null && b2.toLowerCase(Locale.getDefault()).startsWith("dogfood");
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean h(int i) {
        ha haVar;
        String b2 = b("enabled_features");
        if (h.a.a.p.b.a.f.f(b2, m.b)) {
            haVar = m.c;
        } else if (cl.L(b2)) {
            haVar = nr.a;
        } else {
            gy gyVar = new gy();
            for (String str : bu.c(new l(',')).h(b2)) {
                if (!str.isEmpty()) {
                    try {
                        gyVar.h(Integer.valueOf(Integer.parseInt(str)));
                    } catch (NumberFormatException e2) {
                        com.google.common.f.h f = m.f1394a.f();
                        f.aj(com.google.common.f.a.e.a, "FeatureHelper");
                        com.google.common.f.h hVar = f;
                        hVar.ak(8649);
                        hVar.s("Bad feature format: %s", str);
                        int i2 = com.google.android.apps.gsa.shared.util.b.h.a;
                    }
                }
            }
            m.c = gyVar.g();
            m.b = b2;
            haVar = m.c;
        }
        return haVar.contains(Integer.valueOf(i));
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean i() {
        return h(173);
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean j() {
        com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.p pVar = this.g;
        return pVar != null && pVar.f2007a;
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final boolean k() {
        String b2 = b("user_group_name");
        return b2 != null && b2.toLowerCase(Locale.getDefault()).startsWith("teamfood");
    }

    @Override // com.google.android.apps.gsa.shared.f.e
    public final double l() {
        ca caVar = b;
        if (!((fu) caVar.a()).containsKey("tts_rate")) {
            return 0.0d;
        }
        Object obj = ((fu) caVar.a()).get("tts_rate");
        obj.getClass();
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e2) {
            return ((Float) obj).floatValue();
        }
    }
}
