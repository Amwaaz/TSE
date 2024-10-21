package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.ae.u.a;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.common.f.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/z.class */
public class z extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1315a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.z");
    public final BitFlags b;
    public final a c;
    public final com.google.android.apps.gsa.search.core.h.p d;
    public final com.google.android.apps.gsa.search.core.ae.br.a e;
    public long f;
    public Query g;
    public Query h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    public z(e.a aVar, a aVar2, com.google.android.apps.gsa.search.core.h.p pVar, com.google.android.apps.gsa.search.core.ae.br.a aVar3) {
        super(aVar, 63);
        this.b = new BitFlags(getClass(), "FLAG_", 0L);
        this.g = Query.b;
        this.h = Query.b;
        this.c = aVar2;
        this.d = pVar;
        this.e = aVar3;
    }

    public final void a(boolean z) {
        if (this.d.w(df.bG)) {
            h d = f1315a.d();
            d.aj(com.google.common.f.a.e.a, "ConversationState");
            h hVar = d;
            hVar.ak(7521);
            hVar.s("handleAssistantConversationStateChange(): inAssistantConversation: %b", Boolean.valueOf(z));
        } else {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        }
        if (!z) {
            this.c.b();
            return;
        }
        this.c.d();
        if (this.l || !this.d.w(com.google.android.apps.gsa.shared.k.cp.cq)) {
            return;
        }
        this.e.g(false);
    }

    public final void b() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.i = false;
        this.j = false;
        a(false);
    }

    public final boolean c() {
        boolean e = this.b.e(7L);
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        return e;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.b("flags").a(new d(this.b.b(), false));
    }

    public final String toString() {
        return "ConversationState(flags=" + this.b.b() + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        this.k = false;
        if (this.d.w(dj.c)) {
            this.b.g();
        }
    }
}
