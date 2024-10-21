package com.google.android.apps.gsa.search.shared.c;

import android.text.TextUtils;
import com.google.ad.c.l;
import com.google.android.apps.gsa.assist.a.i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.libraries.g.a;
import com.google.android.speech.embedded.TaggerResult;
import com.google.bf.a.h;
import com.google.bf.a.k;
import com.google.common.b.fl;
import com.google.knowledge.b.t;
import com.google.protobuf.v;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Stack;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/c/c.class */
public final class c implements com.google.android.apps.gsa.shared.util.debug.a.b {
    public a e;
    public boolean g;
    public boolean h;
    public final b j;
    public PlaybackStatus k;
    public l l;
    public final i m;
    public TaggerResult n;
    public boolean o;
    public t p;
    private v r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1324a = new Object();
    public final Deque b = new ArrayDeque(6);
    public final Stack c = new Stack();
    public final Stack d = new Stack();
    private Query q = Query.b.O();
    public d f = null;
    public h i = h.a;

    public c(i iVar, d dVar, a aVar) {
        this.m = iVar;
        dVar.a(this);
        this.j = new b(aVar);
    }

    public final int a() {
        synchronized (this.f1324a) {
            a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.e;
        }
    }

    public final VoiceAction b() {
        synchronized (this.f1324a) {
            a aVar = this.e;
            if (aVar == null) {
                return null;
            }
            return aVar.b;
        }
    }

    public final com.google.android.apps.gsa.search.shared.actions.modular.arguments.i c() {
        synchronized (this.f1324a) {
            VoiceAction b = b();
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.i iVar = null;
            if (b == null) {
                return null;
            }
            if (b.o()) {
                iVar = b.e();
            }
            return iVar;
        }
    }

    public final CardDecision e() {
        synchronized (this.f1324a) {
            a aVar = this.e;
            if (aVar == null) {
                return null;
            }
            return aVar.c;
        }
    }

    public final d f() {
        d dVar;
        synchronized (this.f1324a) {
            if (this.f == null) {
                fl m = fl.m(this.b);
                String aO = this.q.aO();
                String str = aO;
                if (true == TextUtils.isEmpty(aO)) {
                    str = null;
                }
                this.f = new d(m, str, this.q.be() ? this.q.A : 0L, this.p);
            }
            dVar = this.f;
        }
        return dVar;
    }

    public final PlaybackStatus g() {
        PlaybackStatus playbackStatus;
        synchronized (this.f1324a) {
            playbackStatus = this.k;
        }
        return playbackStatus;
    }

    public final Query h() {
        Query query;
        synchronized (this.f1324a) {
            query = this.q;
        }
        return query;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("DiscourseContext");
        synchronized (this.f1324a) {
            fVar.b("Displays").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.b.size()), false));
            for (t tVar : this.b) {
                f d = fVar.d((Object) null);
                d.q("Display");
                d.b("URI").a(e.c(tVar.h));
                d.b("Timestamp").a(e.b(new Date(tVar.c / 1000)));
                if ((tVar.b & 16) != 0) {
                    com.google.android.apps.gsa.shared.util.debug.a.e b = d.b("AppPkg");
                    com.google.knowledge.b.c cVar = tVar.e;
                    com.google.knowledge.b.c cVar2 = cVar;
                    if (cVar == null) {
                        cVar2 = com.google.knowledge.b.c.a;
                    }
                    b.a(e.c(cVar2.c));
                    com.google.android.apps.gsa.shared.util.debug.a.e b2 = d.b("AppURI");
                    com.google.knowledge.b.c cVar3 = tVar.e;
                    com.google.knowledge.b.c cVar4 = cVar3;
                    if (cVar3 == null) {
                        cVar4 = com.google.knowledge.b.c.a;
                    }
                    b2.a(e.c(cVar4.g));
                    com.google.android.apps.gsa.shared.util.debug.a.e b3 = d.b("Query");
                    com.google.knowledge.b.c cVar5 = tVar.e;
                    com.google.knowledge.b.c cVar6 = cVar5;
                    if (cVar5 == null) {
                        cVar6 = com.google.knowledge.b.c.a;
                    }
                    b3.a(e.c(cVar6.h));
                }
            }
            fVar.b("mIsGmmNavigating").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.g), false));
            fVar.b("mTriggeredActionType").a(new com.google.android.apps.gsa.shared.util.b.d(this.i, false));
            fVar.b("mTriggeredActionType").a(new com.google.android.apps.gsa.shared.util.b.d(this.i, false));
            fVar.b("mTriggeredActionPackage").a(new com.google.android.apps.gsa.shared.util.b.d((Object) null, false));
        }
    }

    public final TaggerResult i() {
        TaggerResult taggerResult;
        synchronized (this.f1324a) {
            taggerResult = this.n;
        }
        return taggerResult;
    }

    public final l j() {
        a aVar;
        l lVar;
        synchronized (this.f1324a) {
            aVar = this.e;
        }
        return (aVar == null || aVar.a == null || (lVar = aVar.d) == null) ? this.l : lVar;
    }

    public final k k() {
        synchronized (this.f1324a) {
            a aVar = this.e;
            if (aVar == null) {
                return null;
            }
            return aVar.a;
        }
    }

    public final v l() {
        v vVar;
        synchronized (this.f1324a) {
            vVar = this.r;
        }
        return vVar;
    }

    public final void m() {
        synchronized (this.f1324a) {
            this.e = null;
            this.d.clear();
            this.l = null;
            n();
        }
    }

    public final void n() {
        synchronized (this.f1324a) {
            this.i = h.a;
        }
    }

    public final void o(v vVar) {
        synchronized (this.f1324a) {
            this.r = vVar;
        }
    }

    public final void p(Query query) {
        synchronized (this.f1324a) {
            this.q = query;
            if (this.o) {
                this.o = false;
            }
        }
    }

    public final void q(com.google.bn.a.a.d dVar) {
        synchronized (this.f1324a) {
            b bVar = this.j;
            if (dVar != null) {
                bVar.b = dVar;
                bVar.c = bVar.f1323a.a();
            }
        }
    }

    public final void r(h hVar) {
        synchronized (this.f1324a) {
            this.i = hVar;
        }
    }

    public final boolean s() {
        a aVar = this.e;
        return aVar == null || aVar.b.u();
    }

    public final boolean t() {
        boolean z;
        synchronized (this.f1324a) {
            z = this.h;
        }
        return z;
    }

    public final boolean u() {
        boolean z;
        synchronized (this.f1324a) {
            z = this.g;
        }
        return z;
    }

    public final boolean v() {
        CardDecision e;
        return (b() == null || (e = e()) == null || !e.h) ? false : true;
    }
}
