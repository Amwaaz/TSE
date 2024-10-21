package com.google.android.apps.gsa.search.core.ac;

import android.util.Base64;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.h.c;
import com.google.android.apps.gsa.search.core.h.f;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.Cdo;
import com.google.android.apps.gsa.shared.k.aw;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.ba;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.k.bi;
import com.google.android.apps.gsa.shared.k.bl;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.bz;
import com.google.android.apps.gsa.shared.k.dd;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.k.ef;
import com.google.android.apps.gsa.shared.k.ep;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.k.l;
import com.google.android.apps.gsa.shared.k.n;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.gsa.shared.util.d.b;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.libraries.gsa.h.g;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.j;
import e.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ac/ad.class */
public class ad implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1049a = j.i("com.google.android.apps.gsa.search.core.ac.ad");
    public static final ha b = ha.w(Integer.valueOf(l.f1454a.f1434a), Integer.valueOf(l.b.f1434a), Integer.valueOf(n.f1455a.f1434a), Integer.valueOf(n.b.f1434a), Integer.valueOf(n.c.f1434a), Integer.valueOf(n.d.f1434a), new Integer[]{Integer.valueOf(n.e.f1434a), Integer.valueOf(n.f.f1434a), Integer.valueOf(n.g.f1451a), Integer.valueOf(n.h.f1451a), Integer.valueOf(n.i.f1434a), Integer.valueOf(n.j.f1451a), Integer.valueOf(n.k.f1434a), Integer.valueOf(n.l.f1434a), Integer.valueOf(n.m.f1434a), Integer.valueOf(n.n.f1434a), Integer.valueOf(n.o.f1434a), Integer.valueOf(n.p.f1434a), Integer.valueOf(n.q.f1434a), Integer.valueOf(com.google.android.apps.gsa.shared.k.ac.b.f1434a), Integer.valueOf(aw.c.f1434a), Integer.valueOf(aw.d.f1434a), Integer.valueOf(az.v.f1453a), Integer.valueOf(az.B.f1434a), Integer.valueOf(az.C.f1434a), Integer.valueOf(az.cX.f1434a), Integer.valueOf(az.cY.f1434a), Integer.valueOf(az.dX.f1434a), Integer.valueOf(az.et.f1453a), Integer.valueOf(az.gO.f1434a), Integer.valueOf(az.hh.f1434a), Integer.valueOf(az.hj.f1453a), Integer.valueOf(az.hn.f1451a), Integer.valueOf(az.ie.f1453a), Integer.valueOf(az.kZ.f1434a), Integer.valueOf(ba.f1408a.f1452a), Integer.valueOf(bc.u.f1434a), Integer.valueOf(bi.f.f1434a), Integer.valueOf(bi.B.f1453a), Integer.valueOf(bl.af.f1434a), Integer.valueOf(bl.aK.f1434a), Integer.valueOf(bl.aL.f1434a), Integer.valueOf(br.t.f1434a), Integer.valueOf(br.u.f1434a), Integer.valueOf(br.z.f1434a), Integer.valueOf(br.Q.f1434a), Integer.valueOf(br.R.f1434a), Integer.valueOf(br.T.f1434a), Integer.valueOf(br.aT.f1434a), Integer.valueOf(br.aU.f1451a), Integer.valueOf(br.aV.f1453a), Integer.valueOf(br.aW.f1434a), Integer.valueOf(br.aX.f1453a), Integer.valueOf(br.aY.f1434a), Integer.valueOf(br.aZ.f1434a), Integer.valueOf(br.ba.f1434a), Integer.valueOf(br.bb.f1434a), Integer.valueOf(bz.f1421a.f1434a), Integer.valueOf(dd.b.f1434a), Integer.valueOf(dj.av.f1434a), Integer.valueOf(Cdo.f.f1434a), Integer.valueOf(ef.e.f1434a), Integer.valueOf(ef.g.f1451a), Integer.valueOf(ef.j.f1434a), Integer.valueOf(ef.k.f1434a), Integer.valueOf(ef.l.f1434a), Integer.valueOf(ef.o.f1453a), Integer.valueOf(eu.iu.f1434a), Integer.valueOf(eu.jW.f1434a), Integer.valueOf(eu.kW.f1453a)});
    public final a c;
    public final ca d;
    public final ca e;
    public final ca f;
    public final ca g;
    public final a h;
    public final h i;
    private final h j;
    private final h k;

    public ad(a aVar, a aVar2, final a aVar3, h hVar, h hVar2, h hVar3) {
        ca d = cl.d(new ca(aVar3) { // from class: com.google.android.apps.gsa.search.core.ac.x

            /* renamed from: a, reason: collision with root package name */
            public final a f1053a;

            {
                this.f1053a = aVar3;
            }

            public final Object a() {
                j jVar = ad.f1049a;
                Set set = (Set) this.f1053a.a();
                gy gyVar = new gy();
                gyVar.j(ad.b);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    gyVar.j(((v) it.next()).a());
                }
                return gyVar.g();
            }
        });
        final int i = 1;
        ca d2 = cl.d(new ca(i) { // from class: com.google.android.apps.gsa.search.core.ac.y

            /* renamed from: a, reason: collision with root package name */
            private final int f1054a;

            {
                this.f1054a = i;
            }

            public final Object a() {
                int i2 = this.f1054a;
                if (i2 == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(br.aP, "GsaPrefs.AgsaOpaGrowth__nudge_ui_per_app_display_cap");
                    hashMap.put(br.bd, "GsaPrefs.AgsaOpaGrowth__overapp_suggestions_shown_per_app_display_cap");
                    hashMap.put(br.bv, "GsaPrefs.AgsaOpaGrowth__required_app_launch_count_to_show_nudge_ui");
                    hashMap.put(br.aw, "GsaPrefs.AgsaOpaGrowth__minimum_gap_in_minutes_between_nudges");
                    hashMap.put(br.aq, "GsaPrefs.AgsaOpaGrowth__lock_screen_entry_point_dismiss_count_threshold");
                    hashMap.put(br.aO, "GsaPrefs.AgsaOpaGrowth__nudge_ui_over_all_apps_display_cap");
                    return hashMap;
                }
                if (i2 != 1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(ep.j, "GsaPrefs.Bisto__user_group_name");
                    hashMap2.put(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist");
                    hashMap2.put(ep.e, "GsaPrefs.Bisto__enabled_features");
                    hashMap2.put(ep.k, "GsaPrefs.Bisto__viable_hotword_models");
                    hashMap2.put(br.cm, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_nudge_ui_display");
                    hashMap2.put(br.cn, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_overapp_suggestions_display");
                    return hashMap2;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp");
                hashMap3.put(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger");
                hashMap3.put(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts");
                hashMap3.put(br.K, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui");
                hashMap3.put(br.L, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_appflow_logging");
                hashMap3.put(br.M, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_couterfactual_appflow_logging");
                hashMap3.put(br.X, "GsaPrefs.AgsaOpaGrowth__enable_personalized_suggestions_on_chalkboard");
                hashMap3.put(br.U, "GsaPrefs.AgsaOpaGrowth__enable_only_personalized_suggestions_on_chalkboard");
                return hashMap3;
            }
        });
        final int i2 = 0;
        ca d3 = cl.d(new ca(i2) { // from class: com.google.android.apps.gsa.search.core.ac.y

            /* renamed from: a, reason: collision with root package name */
            private final int f1054a;

            {
                this.f1054a = i2;
            }

            public final Object a() {
                int i22 = this.f1054a;
                if (i22 == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(br.aP, "GsaPrefs.AgsaOpaGrowth__nudge_ui_per_app_display_cap");
                    hashMap.put(br.bd, "GsaPrefs.AgsaOpaGrowth__overapp_suggestions_shown_per_app_display_cap");
                    hashMap.put(br.bv, "GsaPrefs.AgsaOpaGrowth__required_app_launch_count_to_show_nudge_ui");
                    hashMap.put(br.aw, "GsaPrefs.AgsaOpaGrowth__minimum_gap_in_minutes_between_nudges");
                    hashMap.put(br.aq, "GsaPrefs.AgsaOpaGrowth__lock_screen_entry_point_dismiss_count_threshold");
                    hashMap.put(br.aO, "GsaPrefs.AgsaOpaGrowth__nudge_ui_over_all_apps_display_cap");
                    return hashMap;
                }
                if (i22 != 1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(ep.j, "GsaPrefs.Bisto__user_group_name");
                    hashMap2.put(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist");
                    hashMap2.put(ep.e, "GsaPrefs.Bisto__enabled_features");
                    hashMap2.put(ep.k, "GsaPrefs.Bisto__viable_hotword_models");
                    hashMap2.put(br.cm, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_nudge_ui_display");
                    hashMap2.put(br.cn, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_overapp_suggestions_display");
                    return hashMap2;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp");
                hashMap3.put(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger");
                hashMap3.put(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts");
                hashMap3.put(br.K, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui");
                hashMap3.put(br.L, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_appflow_logging");
                hashMap3.put(br.M, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_couterfactual_appflow_logging");
                hashMap3.put(br.X, "GsaPrefs.AgsaOpaGrowth__enable_personalized_suggestions_on_chalkboard");
                hashMap3.put(br.U, "GsaPrefs.AgsaOpaGrowth__enable_only_personalized_suggestions_on_chalkboard");
                return hashMap3;
            }
        });
        final int i3 = 2;
        ca d4 = cl.d(new ca(i3) { // from class: com.google.android.apps.gsa.search.core.ac.y

            /* renamed from: a, reason: collision with root package name */
            private final int f1054a;

            {
                this.f1054a = i3;
            }

            public final Object a() {
                int i22 = this.f1054a;
                if (i22 == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(br.aP, "GsaPrefs.AgsaOpaGrowth__nudge_ui_per_app_display_cap");
                    hashMap.put(br.bd, "GsaPrefs.AgsaOpaGrowth__overapp_suggestions_shown_per_app_display_cap");
                    hashMap.put(br.bv, "GsaPrefs.AgsaOpaGrowth__required_app_launch_count_to_show_nudge_ui");
                    hashMap.put(br.aw, "GsaPrefs.AgsaOpaGrowth__minimum_gap_in_minutes_between_nudges");
                    hashMap.put(br.aq, "GsaPrefs.AgsaOpaGrowth__lock_screen_entry_point_dismiss_count_threshold");
                    hashMap.put(br.aO, "GsaPrefs.AgsaOpaGrowth__nudge_ui_over_all_apps_display_cap");
                    return hashMap;
                }
                if (i22 != 1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(ep.j, "GsaPrefs.Bisto__user_group_name");
                    hashMap2.put(ep.h, "GsaPrefs.Bisto__messaging_parsing_blacklist");
                    hashMap2.put(ep.e, "GsaPrefs.Bisto__enabled_features");
                    hashMap2.put(ep.k, "GsaPrefs.Bisto__viable_hotword_models");
                    hashMap2.put(br.cm, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_nudge_ui_display");
                    hashMap2.put(br.cn, "GsaPrefs.AgsaOpaGrowth__supported_apps_for_overapp_suggestions_display");
                    return hashMap2;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(az.cY, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_whatsapp");
                hashMap3.put(bi.r, "GsaPrefs.AgsaOpaComms__enable_message_style_parser_for_facebook_messenger");
                hashMap3.put(az.cX, "GsaPrefs.AgsaOpa__enable_message_style_parser_for_messages_and_hangouts");
                hashMap3.put(br.K, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui");
                hashMap3.put(br.L, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_appflow_logging");
                hashMap3.put(br.M, "GsaPrefs.AgsaOpaGrowth__enable_nudge_ui_couterfactual_appflow_logging");
                hashMap3.put(br.X, "GsaPrefs.AgsaOpaGrowth__enable_personalized_suggestions_on_chalkboard");
                hashMap3.put(br.U, "GsaPrefs.AgsaOpaGrowth__enable_only_personalized_suggestions_on_chalkboard");
                return hashMap3;
            }
        });
        this.c = aVar;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = aVar2;
        this.j = hVar;
        this.k = hVar2;
        this.i = hVar3;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(final p pVar, final i iVar) {
        new com.google.android.apps.gsa.shared.util.c.ae(this.j.h("Process and commit synced startup config flag changes", new g(this, pVar) { // from class: com.google.android.apps.gsa.search.core.ac.z

            /* renamed from: a, reason: collision with root package name */
            public final ad f1055a;
            public final p b;

            {
                this.f1055a = this;
                this.b = pVar;
            }

            /* JADX WARN: Type inference failed for: r0v111, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v119, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v122, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v125, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v130, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v80, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
            @Override // com.google.android.libraries.gsa.h.g
            public final void run() {
                p pVar2;
                ad adVar = this.f1055a;
                ae aeVar = (ae) adVar.c.a();
                com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
                Set<String> keySet = aeVar.e().getAll().keySet();
                HashSet hashSet = new HashSet();
                for (String str : keySet) {
                    if (str != null && str.startsWith("flag.")) {
                        try {
                            hashSet.add(Integer.valueOf(Integer.parseInt(str.substring(5))));
                        } catch (NumberFormatException e) {
                            aus.b(com.google.android.apps.gsa.shared.util.q.a.f1574a.e(), "Invalid flag key: %s", str, (char) 9409, e);
                        }
                    }
                }
                af b2 = aeVar.b();
                Iterator it = ((Set) adVar.d.a()).iterator();
                while (true) {
                    pVar2 = this.b;
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) it.next();
                    num.intValue();
                    f fVar = (f) pVar2.f.get(num);
                    if (fVar != null) {
                        String str2 = "flag." + fVar.f;
                        int i = fVar.c;
                        if (i == 2) {
                            b2.f1050a.putBoolean(str2, ((Boolean) fVar.d).booleanValue());
                        } else if (i == 4) {
                            b2.f1050a.putLong(str2, ((Long) fVar.d).longValue());
                        } else if (i == 3) {
                            b2.f1050a.putString(str2, (String) fVar.d);
                        } else if (i == 7) {
                            b2.f1050a.putLong(str2, Double.doubleToRawLongBits(((Double) fVar.d).doubleValue()));
                        } else if (i == 6) {
                            b2.f1050a.putString(str2, Base64.encodeToString(((com.google.protobuf.v) fVar.d).E(), 2));
                        }
                        hashSet.remove(Integer.valueOf(fVar.f));
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Integer) it2.next()).intValue();
                    b2.f1050a.remove("flag." + intValue);
                }
                for (Map.Entry entry : ((Map) adVar.e.a()).entrySet()) {
                    b2.c((String) entry.getValue(), pVar2.w((com.google.android.apps.gsa.shared.k.d) entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) adVar.f.a()).entrySet()) {
                    b2.d((String) entry2.getValue(), pVar2.i((com.google.android.apps.gsa.shared.k.f) entry2.getKey()));
                }
                for (Map.Entry entry3 : ((Map) adVar.g.a()).entrySet()) {
                    b2.e((String) entry3.getValue(), pVar2.t((com.google.android.apps.gsa.shared.k.h) entry3.getKey()));
                }
                ni niVar = com.google.android.apps.gsa.shared.util.q.a.b;
                int i2 = niVar.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    b2.f((String) niVar.get(i3));
                }
                b2.b();
            }
        }), this.k, "Notify listener").b(new com.google.android.libraries.gsa.h.f(this, iVar) { // from class: com.google.android.apps.gsa.search.core.ac.aa

            /* renamed from: a, reason: collision with root package name */
            public final ad f1048a;
            public final i b;

            {
                this.f1048a = this;
                this.b = iVar;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                i iVar2;
                ad adVar = this.f1048a;
                Iterator it = ((Set) adVar.h.a()).iterator();
                while (true) {
                    iVar2 = this.b;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ((w) it.next()).d(iVar2);
                    }
                }
                if (iVar2.a(ef.e.f1434a) || iVar2.a(ef.g.f1451a)) {
                    adVar.i.n("UpdateDarkModeFlags", new com.google.android.libraries.gsa.h.f() { // from class: com.google.android.apps.gsa.search.core.ac.ac
                        @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                        public final void run() {
                            android.support.v7.app.u.o(b.a());
                        }
                    });
                }
            }
        }).a(new be() { // from class: com.google.android.apps.gsa.search.core.ac.ab
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                com.google.common.f.y f = ad.f1049a.f();
                f.aj(e.a, "StartupCfgFlagsUpdater");
                aus.c(f, obj, "Committing synced startup config flag changes failed", (char) 8140);
            }
        });
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        a(pVar, new i(ha.o(pVar.f.keySet()), nr.a));
    }
}
