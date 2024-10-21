package com.google.android.apps.gsa.nga.engine.recognition.l;

import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ar.c;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.ae;
import com.google.android.apps.gsa.nga.engine.recognition.h;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.b;
import com.google.android.apps.gsa.nga.shared.q.c.br;
import com.google.android.apps.gsa.nga.shared.q.c.du;
import com.google.android.apps.gsa.nga.shared.q.d.ad;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.ct;
import com.google.android.apps.gsa.nga.shared.q.d.cu;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.o.fp;
import com.google.common.o.fq;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.protobuf.ba;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/l/a.class */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final i f657a;
    public final b b;
    public final com.google.android.libraries.g.a c;
    public final e.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final af f;
    public final x g;
    public final y h;

    public a(i iVar, af afVar, b bVar, com.google.android.libraries.g.a aVar, x xVar, e.a aVar2, y yVar) {
        this.f657a = iVar;
        this.f = afVar;
        this.b = bVar;
        this.c = aVar;
        this.g = xVar;
        this.d = aVar2;
        this.h = yVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(ah ahVar) {
    }

    public final void c(w wVar, h hVar) {
        e eVar = new e();
        eVar.a = wVar;
        qn createBuilder = r.a.createBuilder();
        String name = hVar.name();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        name.getClass();
        rVar.d |= 8;
        rVar.Y = name;
        eVar.b = createBuilder.build();
        this.f657a.a(eVar.a());
    }

    public final void d(ad adVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        w wVar = w.NGA_ESTIMATED_END_OF_SPEECH;
        qn createBuilder = r.a.createBuilder();
        fq fqVar = adVar.e;
        fq fqVar2 = fqVar;
        if (fqVar == null) {
            fqVar2 = fq.a;
        }
        fp a2 = fp.a(fqVar2.d);
        fp fpVar = a2;
        if (a2 == null) {
            fpVar = fp.a;
        }
        i iVar = this.f657a;
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        rVar.ae = fpVar.l;
        rVar.d |= 1024;
        iVar.n(wVar, ahVar, createBuilder, adVar.d);
        af afVar = this.f;
        bk bkVar = bk.END_OF_USER_SPEECH;
        ba createBuilder2 = bj.a.createBuilder();
        createBuilder2.copyOnWrite();
        bj bjVar = createBuilder2.instance;
        adVar.getClass();
        bjVar.c = adVar;
        bjVar.b = 49;
        afVar.b(bkVar, (bj) createBuilder2.build(), ahVar);
    }

    public final void e(Duration duration, fp fpVar, com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        ba createBuilder = ad.a.createBuilder();
        long millis = duration.toMillis();
        long a2 = this.c.a();
        long epochMilli = this.c.f().toEpochMilli();
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        adVar.b |= 1;
        adVar.c = (millis - a2) + epochMilli;
        long nanos = duration.toNanos();
        createBuilder.copyOnWrite();
        ad adVar2 = createBuilder.instance;
        adVar2.b |= 2;
        adVar2.d = nanos;
        ba createBuilder2 = fq.a.createBuilder();
        createBuilder2.copyOnWrite();
        fq fqVar = createBuilder2.instance;
        fqVar.d = fpVar.l;
        fqVar.b |= 2;
        createBuilder.copyOnWrite();
        ad adVar3 = createBuilder.instance;
        fq build = createBuilder2.build();
        build.getClass();
        adVar3.e = build;
        adVar3.b |= 4;
        d((ad) createBuilder.build(), ahVar);
    }

    public final void f(HotwordResult hotwordResult, boolean z) {
        String name = hotwordResult.v().name();
        if (name == null) {
            throw new NullPointerException("Null deviceType");
        }
        this.g.b(new br("NGA_HOTWORD_DECISION_LOCAL_MDA", name, true != z ? "REJECTED" : "ACCEPTED"));
    }

    public final void g(Duration duration, com.google.android.apps.gsa.nga.shared.q.ah ahVar, com.google.android.apps.gsa.nga.shared.u.j.b.a aVar) {
        w wVar = w.NGA_TRUE_END_OF_QUERY;
        qn createBuilder = r.a.createBuilder();
        String name = aVar.name();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        name.getClass();
        rVar.d |= 8;
        rVar.Y = name;
        this.f657a.n(wVar, ahVar, createBuilder, duration.toNanos());
        bk bkVar = bk.SPEECH_EVENT;
        ba createBuilder2 = bj.a.createBuilder();
        ba createBuilder3 = cu.a.createBuilder();
        ct ctVar = ct.i;
        createBuilder3.copyOnWrite();
        cu cuVar = createBuilder3.instance;
        cuVar.c = ctVar.k;
        cuVar.b |= 1;
        createBuilder3.copyOnWrite();
        cu cuVar2 = createBuilder3.instance;
        cuVar2.f = aVar.getNumber();
        cuVar2.b |= 16;
        long nanos = duration.toNanos();
        createBuilder3.copyOnWrite();
        cu cuVar3 = createBuilder3.instance;
        cuVar3.b |= 64;
        cuVar3.h = nanos;
        createBuilder2.copyOnWrite();
        bj bjVar = createBuilder2.instance;
        cu build = createBuilder3.build();
        build.getClass();
        bjVar.c = build;
        bjVar.b = 13;
        this.f.b(bkVar, createBuilder2.build(), ahVar);
    }

    public final void h(h hVar, int i) {
        if (i == 0) {
            throw null;
        }
        String name = hVar.name();
        if (name == null) {
            throw new NullPointerException("Null speechRecognizer");
        }
        String a2 = ae.a(i);
        boolean z = this.h.c().b;
        this.g.b(new com.google.android.apps.gsa.nga.shared.q.c.c("AUDIO_BUFFER_OVERFLOW", false, a2, name));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        if (ajVar2.k() && ajVar.h() && !ajVar.j()) {
            this.e.set(true);
        } else {
            this.e.set(false);
        }
    }

    public final void i(int i, Duration duration, String str, com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        ct ctVar = i == 1 ? ct.b : ct.c;
        ba createBuilder = cu.a.createBuilder();
        createBuilder.copyOnWrite();
        cu cuVar = createBuilder.instance;
        cuVar.c = ctVar.k;
        cuVar.b |= 1;
        createBuilder.copyOnWrite();
        cu cuVar2 = createBuilder.instance;
        str.getClass();
        cuVar2.b |= 4;
        cuVar2.d = str;
        if (!duration.isZero()) {
            duration.toMillis();
            long millis = duration.toMillis();
            createBuilder.copyOnWrite();
            cu cuVar3 = createBuilder.instance;
            cuVar3.b |= 32;
            cuVar3.g = millis;
        }
        af afVar = this.f;
        bk bkVar = bk.SPEECH_EVENT;
        ba createBuilder2 = bj.a.createBuilder();
        createBuilder2.copyOnWrite();
        bj bjVar = createBuilder2.instance;
        cu build = createBuilder.build();
        build.getClass();
        bjVar.c = build;
        bjVar.b = 13;
        afVar.b(bkVar, (bj) createBuilder2.build(), ahVar);
        String str2 = ahVar.d;
    }

    public final void j(int i) {
        String str;
        boolean z = this.h.c().b;
        if (i == 1) {
            str = "START_SODA_WITH_NON_VALID_SPEECH_PARAMS";
        } else if (i == 4) {
            str = "RESET_SODA_WITH_NON_VALID_SPEECH_PARAMS";
        } else if (i == 6) {
            str = "START_SODA_FAILED_SODA_NOT_INITIALIZED";
        } else if (i == 7) {
            str = "STOP_SODA_FAILED_SODA_NOT_INITIALIZED";
        } else if (i != 8) {
            switch (i) {
                case 11:
                    str = "STOP_SODA_BY_UTTERANCE_IDENTIFIER_FAILED";
                    break;
                case 12:
                    str = "EMPTY_SODA_FINAL_RECOGNITION";
                    break;
                case 13:
                    str = "SODA_UNEXPECTEDLY_STOPPED";
                    break;
                default:
                    str = "null";
                    break;
            }
        } else {
            str = "RESET_SODA_FAILED_SODA_NOT_INITIALIZED";
        }
        this.g.b(new du("NGA_SPEECH_ERROR", false, str));
    }
}
