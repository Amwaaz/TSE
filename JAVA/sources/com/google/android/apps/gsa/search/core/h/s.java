package com.google.android.apps.gsa.search.core.h;

import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.base.ca;
import com.google.common.base.cf;
import com.google.common.base.cl;
import com.google.common.r.k;
import java.util.List;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/s.class */
public final class s implements b {
    private static final ca b = cl.d(new cf(new op("zero_query_web_results")));

    /* renamed from: a, reason: collision with root package name */
    public final v f1127a;

    public s(v vVar, com.google.android.apps.gsa.shared.util.debug.d dVar) {
        this.f1127a = vVar;
        dVar.a(this);
    }

    private static void a(com.google.android.apps.gsa.shared.util.debug.a.f fVar, String str, n nVar) {
        com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
        d.q(str);
        for (Map.Entry entry : nVar.getAll().entrySet()) {
            String str2 = (String) entry.getKey();
            if (((ha) b.a()).contains(str2)) {
                d.s("%s: %s", new com.google.android.apps.gsa.shared.util.b.e[]{com.google.android.apps.gsa.shared.util.b.e.c(str2), new com.google.android.apps.gsa.shared.util.b.d("REDACTED", false)});
            } else {
                d.s("%s: %s", new com.google.android.apps.gsa.shared.util.b.e[]{com.google.android.apps.gsa.shared.util.b.e.c(str2), com.google.android.apps.gsa.shared.util.b.e.c(String.valueOf(entry.getValue()))});
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        String sb;
        fVar.q("GsaPreferenceController");
        Object b2 = this.f1127a.d().b("server_experiment_ids");
        int[] u = b2 != null ? k.u((List) b2) : new int[0];
        com.google.android.apps.gsa.shared.util.debug.a.f d = fVar.d((Object) null);
        d.q("GWS Experiment Ids");
        int length = u.length;
        if (length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(length * 5);
            sb2.append(u[0]);
            for (int i = 1; i < u.length; i++) {
                sb2.append(",");
                sb2.append(u[i]);
            }
            sb = sb2.toString();
        }
        d.s("%s", new com.google.android.apps.gsa.shared.util.b.e[]{new com.google.android.apps.gsa.shared.util.b.d(sb, false)});
        a(fVar, "MainPreferences", this.f1127a.d());
        a(fVar, "StartupPreferences", this.f1127a.b);
    }
}
