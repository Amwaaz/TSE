package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.icu.text.BreakIterator;
import android.os.Bundle;
import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.education.pie.a.i;
import com.google.android.apps.gsa.nga.engine.education.pie.b.k;
import com.google.android.apps.gsa.nga.engine.education.pie.b.v;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.engine.education.pie.c;
import com.google.android.apps.gsa.nga.engine.education.pie.f;
import com.google.android.apps.gsa.nga.shared.ae.a.a.av;
import com.google.android.apps.gsa.nga.shared.ae.a.a.cm;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.u.d.a.aa;
import com.google.android.apps.gsa.nga.shared.u.d.a.ao;
import com.google.android.apps.gsa.nga.shared.u.d.a.aq;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.nga.shared.u.d.a.x;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.bs;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/al.class */
public class al implements c, com.google.android.apps.gsa.nga.engine.education.pie.d.b, com.google.android.apps.gsa.nga.engine.ar.c {
    private static final com.google.common.f.j i = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.education.pie.triggering.al");

    /* renamed from: a, reason: collision with root package name */
    public final a f598a;
    public final com.google.android.apps.gsa.nga.engine.education.pie.e.a.b g;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d h;
    private final k k;
    private final com.google.android.apps.gsa.nga.engine.education.pie.b.j l;
    private final y m;
    private final v n;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d o;
    private final com.google.android.apps.gsa.nga.engine.g.a.y p;
    private final com.google.android.apps.gsa.nga.engine.education.pie.b j = new com.google.android.apps.gsa.nga.engine.education.pie.b(this) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ai

        /* renamed from: a, reason: collision with root package name */
        public final al f597a;

        {
            this.f597a = this;
        }

        @Override // com.google.android.apps.gsa.nga.engine.education.pie.b
        public final void c(com.google.android.apps.gsa.nga.engine.m.b bVar) {
            al alVar = this.f597a;
            if (alVar.e()) {
                ((com.google.android.apps.gsa.assistant.shared.k.c) com.google.android.apps.gsa.nga.engine.ak.t.j.a(bVar.c).orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN)).name();
                if (alVar.b) {
                    Optional optional = (Optional) alVar.d.get();
                    Optional optional2 = (Optional) alVar.c.get();
                    if (optional.isPresent()) {
                        String b = bVar.a().b();
                        String str = ((cm) optional.get()).d;
                        Optional optional3 = (Optional) alVar.e.get();
                        if (alVar.f(str, b)) {
                            alVar.d((com.google.android.apps.gsa.nga.shared.u.d.a.q) optional3.orElse(com.google.android.apps.gsa.nga.shared.u.d.a.q.f1011a), Optional.of(str), Optional.of(b));
                            return;
                        } else {
                            alVar.g.b();
                            return;
                        }
                    }
                    if (optional2.isPresent()) {
                        ha haVar = (ha) Collection._EL.stream(com.google.android.apps.gsa.shared.k.b.d(alVar.f598a.h(br.bh))).map(new aj(0)).collect(bs.b);
                        if (((com.google.android.apps.gsa.assistant.shared.k.c) com.google.android.apps.gsa.nga.engine.ak.t.j.a(bVar.c).orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN)).equals(com.google.android.apps.gsa.assistant.shared.k.c.NGA_PIE_FOLLOW_UP_QUERY) || haVar.isEmpty() || ((Boolean) ((av) optional2.get()).i().map(new ak(haVar, 0)).orElse(true)).booleanValue()) {
                            String b2 = bVar.a().b();
                            String l = ((av) optional2.get()).l();
                            Optional optional4 = (Optional) alVar.e.get();
                            if (alVar.f(l, b2)) {
                                alVar.d((com.google.android.apps.gsa.nga.shared.u.d.a.q) optional4.orElse(com.google.android.apps.gsa.nga.shared.u.d.a.q.f1011a), Optional.of(l), Optional.of(b2));
                            } else {
                                alVar.g.b();
                            }
                        }
                    }
                }
            }
        }
    };
    public boolean b = false;
    public final AtomicReference c = new AtomicReference(Optional.empty());
    public final AtomicReference d = new AtomicReference(Optional.empty());
    public final AtomicReference e = new AtomicReference(Optional.empty());
    public final AtomicReference f = new AtomicReference(Optional.empty());

    public al(k kVar, v vVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, com.google.android.apps.gsa.nga.engine.education.pie.b.j jVar, a aVar, y yVar2, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar2) {
        this.k = kVar;
        this.n = vVar;
        this.p = yVar;
        this.l = jVar;
        this.f598a = aVar;
        this.m = yVar2;
        this.o = dVar;
        this.g = bVar;
        this.h = dVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.k.f584a.b(this.j);
        this.m.f589a.b(this);
        this.o.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(com.google.android.apps.gsa.nga.engine.ar.ah ahVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(x xVar) {
        if (e()) {
            int i2 = xVar.b;
            if (i2 == 10) {
                com.google.android.apps.gsa.nga.shared.u.d.a.q qVar = ((ao) xVar.c).b;
                com.google.android.apps.gsa.nga.shared.u.d.a.q qVar2 = qVar;
                if (qVar == null) {
                    qVar2 = com.google.android.apps.gsa.nga.shared.u.d.a.q.f1011a;
                }
                d(qVar2, Optional.empty(), Optional.empty());
                return;
            }
            if (i2 == 11) {
                AtomicReference atomicReference = this.e;
                com.google.android.apps.gsa.nga.shared.u.d.a.q qVar3 = ((aa) xVar.c).b;
                com.google.android.apps.gsa.nga.shared.u.d.a.q qVar4 = qVar3;
                if (qVar3 == null) {
                    qVar4 = com.google.android.apps.gsa.nga.shared.u.d.a.q.f1011a;
                }
                atomicReference.set(Optional.of(qVar4));
                return;
            }
            if (i2 == 1) {
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar = this.g;
                if (bVar.c()) {
                    return;
                }
                bVar.a(com.google.android.apps.gsa.shared.logger.b.w.MULTI_STEP_TRY_SAYING_FLOW_UI_DISMISSED);
                return;
            }
            if (i2 == 12) {
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = this.g;
                int i3 = ((aq) xVar.c).b;
                if (bVar2.c()) {
                    return;
                }
                bVar2.f591a.b(com.google.android.apps.gsa.shared.logger.b.w.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_UI_SHOWN);
                bVar2.c = 3;
            }
        }
    }

    public final void d(com.google.android.apps.gsa.nga.shared.u.d.a.q qVar, Optional optional, Optional optional2) {
        Bundle bundle = new Bundle();
        int i2 = i.d;
        ba builder = qVar.toBuilder();
        if (optional.isPresent() || optional2.isPresent()) {
            String str = (String) optional.orElse("");
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.u.d.a.q qVar2 = (com.google.android.apps.gsa.nga.shared.u.d.a.q) builder.instance;
            str.getClass();
            qVar2.b |= 2;
            qVar2.d = str;
            String str2 = (String) optional2.orElse("");
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.u.d.a.q qVar3 = (com.google.android.apps.gsa.nga.shared.u.d.a.q) builder.instance;
            str2.getClass();
            qVar3.b |= 4;
            qVar3.e = str2;
        }
        bundle.putByteArray("TRIGGER_CONTEXT", ((com.google.android.apps.gsa.nga.shared.u.d.a.q) builder.build()).toByteArray());
        try {
            g.c(bundle, l.MULTI_STEP_TRY_SAYING);
            v vVar = this.n;
            com.google.android.apps.gsa.nga.engine.education.pie.e a2 = f.a(15);
            a2.b(at.e);
            vVar.h(bundle, a2.a());
        } catch (com.google.android.apps.gsa.nga.shared.i.a.k e) {
            a.a.dB(i.d(), "Multi-step try saying triggering exception", (char) 3111, e);
        }
    }

    public final boolean e() {
        return this.l.d() == com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBLE && this.f598a.i(br.F);
    }

    public final boolean f(String str, String str2) {
        double d;
        double d2;
        double sqrt;
        double d3 = this.f598a.d(br.az) / 100.0d;
        if (this.f598a.i(br.aB)) {
            Locale locale = this.p.c().d;
            int max = Math.max(str.length(), str2.length());
            return ((double) (max - com.google.common.c.b.b.b(com.google.android.apps.gsa.assistant.shared.l.b.a(str, locale)).a(com.google.android.apps.gsa.assistant.shared.l.b.a(str2, locale), 100))) / ((double) max) >= d3;
        }
        if (!this.f598a.i(br.aA)) {
            return com.google.android.apps.gsa.assistant.shared.l.b.b(str, str2, this.p.c().d) >= d3;
        }
        Locale locale2 = this.p.c().d;
        String a2 = com.google.android.apps.gsa.assistant.shared.l.b.a(str, locale2);
        String a3 = com.google.android.apps.gsa.assistant.shared.l.b.a(str2, locale2);
        if (a3.length() == 0) {
            if (a2.length() == 0) {
                sqrt = 1.0d;
            }
            sqrt = 0.0d;
        } else {
            if (a2.length() != 0) {
                HashMap hashMap = new HashMap();
                BreakIterator m$1 = e$.ExternalSyntheticApiModelOutline0.m$1(locale2);
                e$.ExternalSyntheticApiModelOutline0.m(m$1, a2);
                int m = e$.ExternalSyntheticApiModelOutline0.m(m$1);
                int m$12 = e$.ExternalSyntheticApiModelOutline0.m$1(m$1);
                while (true) {
                    int i2 = m$12;
                    if (i2 == -1) {
                        break;
                    }
                    if (!a2.substring(m, i2).equals(" ")) {
                        Map._EL.merge(hashMap, a2.substring(m, i2), 1, new com.google.android.apps.gsa.assistant.shared.l.a());
                    }
                    m = i2;
                    m$12 = e$.ExternalSyntheticApiModelOutline0.m$1(m$1);
                }
                BreakIterator m$13 = e$.ExternalSyntheticApiModelOutline0.m$1(locale2);
                e$.ExternalSyntheticApiModelOutline0.m(m$13, a3);
                HashMap hashMap2 = new HashMap();
                int m2 = e$.ExternalSyntheticApiModelOutline0.m(m$13);
                int m$14 = e$.ExternalSyntheticApiModelOutline0.m$1(m$13);
                while (true) {
                    int i3 = m$14;
                    if (i3 == -1) {
                        break;
                    }
                    if (!a3.substring(m2, i3).equals(" ")) {
                        Map._EL.merge(hashMap2, a3.substring(m2, i3), 1, new com.google.android.apps.gsa.assistant.shared.l.a());
                    }
                    m2 = i3;
                    m$14 = e$.ExternalSyntheticApiModelOutline0.m$1(m$13);
                }
                Iterator it = hashMap2.keySet().iterator();
                double d4 = 0.0d;
                double d5 = 0.0d;
                while (true) {
                    d = d5;
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) hashMap2.get((String) it.next());
                    d4 += ((Integer) Map._EL.getOrDefault(hashMap, r0, 0)).intValue() * num.intValue();
                    d5 = d + (num.intValue() * num.intValue());
                }
                Iterator it2 = hashMap.keySet().iterator();
                double d6 = 0.0d;
                while (true) {
                    d2 = d6;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Integer num2 = (Integer) hashMap.get((String) it2.next());
                    d6 = d2 + (num2.intValue() * num2.intValue());
                }
                sqrt = d4 / Math.sqrt(d * d2);
            }
            sqrt = 0.0d;
        }
        return sqrt >= d3;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        com.google.common.f.h d = i.d();
        d.ak(3107);
        d.p("Nga state changed");
        if (!ajVar.k()) {
            if (ajVar.h()) {
                this.f.set(ajVar.e());
                return;
            }
            return;
        }
        this.e.set(Optional.empty());
        this.f.set(Optional.empty());
        com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar = this.g;
        if (bVar.c() || bVar.c == 2) {
            return;
        }
        bVar.a(com.google.android.apps.gsa.shared.logger.b.w.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_FAILED);
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.k.f584a.c(this.j);
        this.m.f589a.c(this);
        this.o.d(this);
    }
}
