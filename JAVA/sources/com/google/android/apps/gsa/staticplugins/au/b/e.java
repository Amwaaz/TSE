package com.google.android.apps.gsa.staticplugins.au.b;

import android.webkit.URLUtil;
import com.google.android.apps.gsa.s.a;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.speech.hotword.b.c;
import com.google.android.apps.gsa.shared.util.j;
import com.google.android.apps.gsa.speech.o.g;
import com.google.android.libraries.mdi.download.ae;
import com.google.android.libraries.mdi.download.bg;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.mdi.download.i;
import com.google.android.libraries.mdi.download.k;
import com.google.android.libraries.mdi.download.m;
import com.google.android.libraries.mdi.download.n;
import com.google.apps.tiktok.tracing.contrib.c.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/au/b/e.class */
public final class e implements ae {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1623a = d.c("HotwordModelPopulator");
    private static final fl f = fl.s(a.HOTWORD_MODEL_MDD_ADD_PENDING, a.HOTWORD_MODEL_MDD_ADD_FAILED, a.HOTWORD_MODEL_MDD_ADD_ALREADY_DOWNLOADED, a.HOTWORD_MODEL_MDD_ADD_LOST);
    public final e.a b;
    public final e.a c;
    public final cq d;
    public final e.a e;
    private final e.a g;
    private final e.a h;
    private final e.a i;
    private final cr j;
    private final j k;

    public e(e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, e.a aVar5, cr crVar, cq cqVar, j jVar, e.a aVar6) {
        this.g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.b = aVar4;
        this.c = aVar5;
        this.j = crVar;
        this.d = cqVar;
        this.k = jVar;
        this.e = aVar6;
    }

    private final cn c(String str, c cVar, Map map, bz bzVar) {
        String str2 = (String) com.google.android.apps.gsa.speech.hotword.d.b.getOrDefault(str, str);
        if (!str2.equals(str)) {
            com.google.common.f.a.a d = f1623a.d();
            d.ak(14853);
            d.H("Changing locale %s to %s for hotword model download.", str, str2);
        }
        com.google.android.apps.gsa.shared.speech.hotword.b.a aVar = (com.google.android.apps.gsa.shared.speech.hotword.b.a) map.get(str2);
        if (aVar == null) {
            com.google.common.f.a.a e = f1623a.e();
            e.ak(14852);
            e.H("HotwordLocaleConfig does not exist for model %s, type %s! This model will not be downloaded or updated; please ensure that hotword config flags contain URLs for all supported assistant locales.", str2, cVar.name());
            return dl.n(false);
        }
        String str3 = aVar.d;
        if (!URLUtil.isValidUrl(str3)) {
            com.google.common.f.a.a e2 = f1623a.e();
            e2.ak(14851);
            e2.N("HotwordLocaleConfig does not have a valid URL for model %s, type %s: %s! This model will not be downloaded or updated", str2, cVar.name(), str3);
            return dl.n(false);
        }
        String a2 = com.google.android.apps.gsa.speech.hotword.d.a(str2, cVar);
        com.google.common.f.a.a d2 = f1623a.d();
        d2.ak(14850);
        d2.N("#updateHotwordFileGroup group name: %s, raw locale: %s, locale: %s", a2, str, str2);
        int hashCode = str3.hashCode();
        bg bgVar = (bg) k.f3282a.createBuilder();
        bgVar.copyOnWrite();
        k kVar = (k) bgVar.instance;
        a2.getClass();
        kVar.b |= 1;
        kVar.c = a2;
        bgVar.copyOnWrite();
        k kVar2 = (k) bgVar.instance;
        kVar2.b |= 4;
        kVar2.e = hashCode;
        ba createBuilder = n.f3286a.createBuilder();
        m mVar = m.DOWNLOAD_ON_ANY_NETWORK;
        createBuilder.copyOnWrite();
        n nVar = (n) createBuilder.instance;
        nVar.d = mVar.d;
        nVar.b |= 2;
        createBuilder.copyOnWrite();
        n nVar2 = (n) createBuilder.instance;
        nVar2.c = 2;
        nVar2.b |= 1;
        bgVar.copyOnWrite();
        k kVar3 = (k) bgVar.instance;
        n nVar3 = (n) createBuilder.build();
        nVar3.getClass();
        kVar3.i = nVar3;
        kVar3.b |= 2048;
        ba createBuilder2 = com.google.android.libraries.mdi.download.j.f3280a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar = (com.google.android.libraries.mdi.download.j) createBuilder2.instance;
        jVar.b |= 1;
        jVar.c = "hotword.data";
        createBuilder2.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar2 = (com.google.android.libraries.mdi.download.j) createBuilder2.instance;
        str3.getClass();
        jVar2.b |= 2;
        jVar2.d = str3;
        i iVar = i.NONE;
        createBuilder2.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar3 = (com.google.android.libraries.mdi.download.j) createBuilder2.instance;
        jVar3.f = iVar.d;
        jVar3.b |= 8;
        bgVar.t(createBuilder2);
        bgVar.copyOnWrite();
        k kVar4 = (k) bgVar.instance;
        kVar4.b |= 512;
        kVar4.h = 86400L;
        k kVar5 = (k) bgVar.build();
        com.google.android.libraries.mdi.download.a aVar2 = new com.google.android.libraries.mdi.download.a(null);
        aVar2.b(kVar5);
        cn a3 = bzVar.a(aVar2.a());
        String str4 = kVar5.c;
        dl.y(com.google.common.util.concurrent.i.h(cf.i(a3), new c(bzVar, str4), this.d), new d(this, str4, ((com.google.android.libraries.mdi.download.j) kVar5.j.get(0)).d, hashCode, bzVar), this.j);
        return a3;
    }

    public final void a(a aVar) {
        fl flVar = f;
        if (!flVar.contains(aVar)) {
            com.google.common.f.a.a f2 = f1623a.f();
            f2.ak(14854);
            f2.q("Metric type %s is not recognized by MDD model updates! Is this metric correct?", aVar.kI);
        }
        Collection._EL.stream(flVar).forEach(new b(this, aVar));
    }

    @Override // com.google.android.libraries.mdi.download.ae
    public final cn b(bz bzVar) {
        if ((((p) this.b.a()).w(df.aQ) || ((p) this.b.a()).w(df.aR)) && !this.k.b()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c(((g) this.i.a()).o(), c.OK_HEY_GOOGLE, ((com.google.android.apps.gsa.speech.hotword.b.a) this.g.a()).a(), bzVar));
            arrayList.add(c(((com.google.android.apps.gsa.speech.hotword.c.d) this.h.a()).b(), c.OK_HEY_GOOGLE, ((com.google.android.apps.gsa.speech.hotword.b.a) this.g.a()).a(), bzVar));
            return h.a(arrayList).a(new a(), ay.a);
        }
        return ci.a;
    }
}
