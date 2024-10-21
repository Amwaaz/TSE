package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.nga.engine.recognition.m.b;
import com.google.android.apps.gsa.shared.k.as;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.assistant.soda.ak;
import com.google.common.base.bu;
import com.google.common.base.cl;
import com.google.common.base.l;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.br;
import com.google.speech.i.ax;
import com.google.speech.i.bf;
import com.google.speech.i.bg;
import com.google.speech.i.d;
import com.google.speech.i.dh;
import com.google.speech.i.di;
import com.google.speech.i.gj;
import com.google.speech.i.gk;
import com.google.speech.i.q;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/s.class */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final a f665a;
    private final b b;
    private final String c;
    private final com.google.android.apps.gsa.nga.engine.recognition.m.a d;

    public s(b bVar, a aVar, String str, com.google.android.apps.gsa.nga.engine.recognition.m.a aVar2) {
        this.b = bVar;
        this.f665a = aVar;
        this.c = str;
        this.d = aVar2;
    }

    public final di a() {
        com.google.android.apps.gsa.nga.engine.recognition.m.a aVar = this.d;
        b bVar = this.b;
        Locale a2 = aVar.a();
        bc h = ak.h(bVar.a(a2), "", this.b.b(), bf.b, this.c);
        ba createBuilder = bg.a.createBuilder();
        int i = true != this.f665a.i(eu.bA) ? 1 : 2;
        createBuilder.copyOnWrite();
        bg bgVar = createBuilder.instance;
        bgVar.c = i - 1;
        bgVar.b |= 1;
        createBuilder.copyOnWrite();
        bg bgVar2 = createBuilder.instance;
        bgVar2.b |= 64;
        bgVar2.d = true;
        bg build = createBuilder.build();
        h.copyOnWrite();
        di diVar = h.instance;
        di diVar2 = di.a;
        build.getClass();
        diVar.j = build;
        diVar.b |= 128;
        bc createBuilder2 = dh.a.createBuilder();
        createBuilder2.copyOnWrite();
        dh dhVar = createBuilder2.instance;
        dhVar.b |= 512;
        dhVar.h = false;
        boolean i2 = this.f665a.i(eu.hR);
        createBuilder2.copyOnWrite();
        dh dhVar2 = createBuilder2.instance;
        dhVar2.b |= 1024;
        dhVar2.i = i2;
        boolean i3 = this.f665a.i(eu.ki);
        createBuilder2.copyOnWrite();
        dh dhVar3 = createBuilder2.instance;
        dhVar3.b |= 4096;
        dhVar3.j = i3;
        boolean i4 = this.f665a.i(eu.ir);
        createBuilder2.copyOnWrite();
        dh dhVar4 = createBuilder2.instance;
        dhVar4.b |= 524288;
        dhVar4.p = i4;
        String a3 = this.b.a(a2);
        createBuilder2.copyOnWrite();
        dh dhVar5 = createBuilder2.instance;
        a3.getClass();
        dhVar5.b |= 65536;
        dhVar5.m = a3;
        d dVar = d.b;
        createBuilder2.copyOnWrite();
        dh dhVar6 = createBuilder2.instance;
        dhVar6.r = dVar.m;
        dhVar6.b |= 4194304;
        createBuilder2.w(com.google.speech.i.ak.b, com.google.speech.i.ak.a);
        boolean i5 = this.f665a.i(as.g);
        createBuilder2.copyOnWrite();
        dh dhVar7 = createBuilder2.instance;
        dhVar7.b |= 64;
        dhVar7.f = i5;
        ba createBuilder3 = gj.a.createBuilder();
        ba createBuilder4 = gk.a.createBuilder();
        b bVar2 = this.b;
        com.google.android.apps.gsa.shared.o.a.a aVar2 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        String a4 = com.google.common.util.b.a(new String[]{((v) bVar2).b.getDir("tisid", 0).getAbsolutePath(), a2.toLanguageTag(), "speaker.profiles"});
        createBuilder4.copyOnWrite();
        gk gkVar = createBuilder4.instance;
        gkVar.b |= 2;
        gkVar.d = a4;
        createBuilder3.copyOnWrite();
        gj gjVar = createBuilder3.instance;
        gk build2 = createBuilder4.build();
        build2.getClass();
        gjVar.d = build2;
        gjVar.b = 2 | gjVar.b;
        createBuilder2.copyOnWrite();
        dh dhVar8 = createBuilder2.instance;
        gj build3 = createBuilder3.build();
        build3.getClass();
        dhVar8.g = build3;
        dhVar8.b |= 256;
        String h2 = this.f665a.h(eu.kl);
        String h3 = this.f665a.h(eu.km);
        if (h2 != null && !h2.isEmpty()) {
            Iterator it = bu.c(new l(',')).g(com.google.common.base.u.c).h(h2).iterator();
            while (it.hasNext()) {
                float parseFloat = Float.parseFloat((String) it.next());
                createBuilder2.copyOnWrite();
                dh dhVar9 = createBuilder2.instance;
                br brVar = dhVar9.l;
                if (!brVar.c()) {
                    dhVar9.l = bi.mutableCopy(brVar);
                }
                dhVar9.l.g(parseFloat);
            }
        }
        if (h3 != null && !h3.isEmpty()) {
            Iterator it2 = bu.c(new l(',')).g(com.google.common.base.u.c).h(h3).iterator();
            while (it2.hasNext()) {
                float parseFloat2 = Float.parseFloat((String) it2.next());
                createBuilder2.copyOnWrite();
                dh dhVar10 = createBuilder2.instance;
                br brVar2 = dhVar10.k;
                if (!brVar2.c()) {
                    dhVar10.k = bi.mutableCopy(brVar2);
                }
                dhVar10.k.g(parseFloat2);
            }
        }
        dh build4 = createBuilder2.build();
        h.copyOnWrite();
        di diVar3 = h.instance;
        build4.getClass();
        diVar3.e = build4;
        diVar3.b |= 4;
        ba createBuilder5 = ax.a.createBuilder();
        String h4 = this.f665a.h(eu.lQ);
        if (!cl.L(h4)) {
            createBuilder5.copyOnWrite();
            ax axVar = createBuilder5.instance;
            h4.getClass();
            axVar.b |= 8;
            axVar.d = h4;
        }
        if (((int) this.f665a.d(eu.lR)) != 0) {
            createBuilder5.copyOnWrite();
            ax axVar2 = createBuilder5.instance;
            axVar2.b |= 1;
            axVar2.c = true;
        }
        ax build5 = createBuilder5.build();
        h.copyOnWrite();
        di diVar4 = h.instance;
        build5.getClass();
        diVar4.n = build5;
        diVar4.b |= 2048;
        String b = this.b.b();
        h.copyOnWrite();
        di diVar5 = h.instance;
        b.getClass();
        diVar5.b |= 64;
        diVar5.i = b;
        h.w(q.b, q.a);
        return h.build();
    }
}
