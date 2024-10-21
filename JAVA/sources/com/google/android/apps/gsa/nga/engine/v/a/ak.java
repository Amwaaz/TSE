package com.google.android.apps.gsa.nga.engine.v.a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.nga.shared.q.i;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.ha;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/ak.class */
public final class ak implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a f807a;
    private final i b;
    private final com.google.android.libraries.g.a c;
    private final y d;

    public ak(a aVar, y yVar, i iVar, com.google.android.libraries.g.a aVar2) {
        this.f807a = aVar;
        this.d = yVar;
        this.b = iVar;
        this.c = aVar2;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        if (this.f807a.i(eu.lI)) {
            fVar.a("NGA issue").a(new d(true, false));
        }
        fVar.a("submitter-locale-code").a(new d(this.d.c().d.toLanguageTag(), false));
        Optional optional = this.d.c().c;
        if (this.f807a.i(az.fh) && optional.isPresent()) {
            fl a2 = this.b.a(false);
            ha haVar = aj.a;
            f d = fVar.d((Object) null);
            Object obj = optional.get();
            Stream limit = Collection._EL.stream(((fu) Collection._EL.stream(a2).filter(new g(8)).collect(bs.e(new d(7), Function._CC.identity(), new af()))).g()).filter(new g(9)).filter(new ag(this.c.f().toEpochMilli() - TimeUnit.MINUTES.toMillis(this.f807a.d(az.ib)), 0)).sorted(Comparator._EL.reversed(Comparator._CC.comparingLong(new ah()))).limit(this.f807a.d(az.fQ));
            int i = fl.e;
            fl flVar = (fl) limit.collect(bs.a);
            ha haVar2 = (ha) Collection._EL.stream(a2).filter(new g(10)).filter(new g(11)).map(new d(8)).collect(bs.b);
            d.q("Sherlog links for recent NGA queries");
            String str = (String) obj;
            d.a("released sherlog logs").a(e.c(new Uri.Builder().scheme("http").authority("go").appendPath("assistant-sherlog-link").appendQueryParameter("account", str).build().toString()));
            d.a("client sync: zerostate").a(e.c(ai.e.a(str, Optional.empty())));
            int size = flVar.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i2 >= size) {
                    break;
                }
                bl blVar = (bl) flVar.get(i2);
                bj bjVar = blVar.e;
                bj bjVar2 = bjVar;
                if (bjVar == null) {
                    bjVar2 = bj.a;
                }
                String str2 = (bjVar2.b == 1 ? (com.google.android.apps.gsa.nga.shared.u.j.b.f) bjVar2.c : com.google.android.apps.gsa.nga.shared.u.j.b.f.a).c;
                int i5 = i4;
                if (!str2.isEmpty()) {
                    String format = String.format(Locale.ENGLISH, "query[%d] ", Integer.valueOf(i4));
                    d.a(String.valueOf(format).concat("text")).a(e.c(str2));
                    bj bjVar3 = blVar.e;
                    bj bjVar4 = bjVar3;
                    if (bjVar3 == null) {
                        bjVar4 = bj.a;
                    }
                    com.google.android.apps.gsa.nga.shared.u.j.b.a a3 = com.google.android.apps.gsa.nga.shared.u.j.b.a.a((bjVar4.b == 1 ? (com.google.android.apps.gsa.nga.shared.u.j.b.f) bjVar4.c : com.google.android.apps.gsa.nga.shared.u.j.b.f.a).h);
                    com.google.android.apps.gsa.nga.shared.u.j.b.a aVar = a3;
                    if (a3 == null) {
                        aVar = com.google.android.apps.gsa.nga.shared.u.j.b.a.o;
                    }
                    if (aVar == com.google.android.apps.gsa.nga.shared.u.j.b.a.i || aVar == com.google.android.apps.gsa.nga.shared.u.j.b.a.c) {
                        d.a(String.valueOf(format).concat("S3 sherlog")).a(e.c(aVar == com.google.android.apps.gsa.nga.shared.u.j.b.a.i ? ai.a.a(str, Optional.of(str2)) : "on-device asr"));
                        ah ahVar = blVar.h;
                        ah ahVar2 = ahVar;
                        if (ahVar == null) {
                            ahVar2 = ah.a;
                        }
                        d.a(String.valueOf(format).concat("assistant server sherlog")).a(e.c(haVar2.contains(ahVar2.d) ? ai.b.a(str, Optional.of(str2)) : "on-device execution"));
                    }
                    i5 = i4 + 1;
                }
                i2++;
                i3 = i5;
            }
            if (Collection._EL.stream(flVar).map(new d(9)).filter(new g(13)).anyMatch(new g(14))) {
                d.a("assistant voiceless query").a(e.c(ai.c.a(str, Optional.empty())));
            }
            if (Collection._EL.stream(flVar).anyMatch(new g(12))) {
                d.a("empty query").a(e.c(ai.d.a(str, Optional.empty())));
            }
        }
    }
}
