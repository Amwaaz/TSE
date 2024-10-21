package com.google.android.apps.gsa.search.core.ac;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.base.at;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ac/ai.class */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1051a;
    public final p b;
    public final com.google.android.apps.gsa.assistant.shared.z c;
    public final at d;
    public final t e;
    public final at f;
    public final com.google.android.apps.gsa.search.core.state.d.t g;
    private final at h;

    public ai(Context context, p pVar, com.google.android.apps.gsa.assistant.shared.z zVar, at atVar, at atVar2, t tVar, com.google.android.apps.gsa.search.core.state.d.t tVar2, at atVar3) {
        this.f1051a = context;
        this.b = pVar;
        this.c = zVar;
        this.d = atVar;
        this.h = atVar2;
        this.e = tVar;
        this.g = tVar2;
        this.f = atVar3;
    }

    public static final boolean g(boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            z3 = true;
            if (!z2) {
                z3 = false;
            }
        }
        return z3;
    }

    public final Query a(boolean z, boolean z2, boolean z3, Uri uri, boolean z4) {
        Query query = Query.b;
        Query aC = z ? Query.P(query.j(), z3, false, false, false, false, false).aC(QueryTriggerType.PROXY_VOICE_BUTTON) : z2 ? Query.P(query.j(), z3, false, false, false, false, false).aC(QueryTriggerType.WIRED_HEADSET_BUTTON) : Query.P(query.j(), z3, false, false, false, false, false).aC(QueryTriggerType.BT_HEADSET_BUTTON);
        Query query2 = aC;
        if (c()) {
            query2 = aC.x();
        }
        Query query3 = query2;
        if (uri != null) {
            query3 = query2.U(uri, 0, z4);
        }
        return query3;
    }

    public final Query b(boolean z, boolean z2, boolean z3, boolean z4, Uri uri, boolean z5) {
        Query query;
        Query a2 = a(z, z2, z4, uri, z5);
        if (z4) {
            query = a2;
        } else {
            query = a2;
            if (z3) {
                query = a2.aF(6);
            }
        }
        return query;
    }

    public final boolean c() {
        com.google.android.apps.gsa.search.core.state.d.t tVar = this.g;
        return g(tVar.f(), tVar.c());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    public final boolean d() {
        return com.google.android.apps.gsa.shared.util.p.f.contains(this.d.a.l());
    }

    public final boolean e() {
        return this.c.u() && !this.c.n();
    }

    public final boolean f(boolean z) {
        return (((Boolean) this.h.b(new ah()).e(Boolean.FALSE)).booleanValue() && z) || d();
    }
}
