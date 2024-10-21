package com.google.android.apps.gsa.speech.k.b.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.speech.k.b.e.a;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.storage.a.j;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.base.ah;
import com.google.common.f.h;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.r;
import com.google.protobuf.ba;
import com.google.protobuf.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/c/d.class */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f1602a;
    public final String b;
    public final com.google.android.apps.gsa.shared.speech.hotword.b.c c;
    public volatile boolean d = false;
    final e e;

    public d(e eVar, String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        this.e = eVar;
        this.f1602a = "MicroDataManager - loadResources: " + str + "  modelType: " + cVar.d;
        this.b = str;
        this.c = cVar;
    }

    public final cn a(String str, String str2, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        int length;
        cn g;
        int length2;
        if (str == null) {
            h f = e.f1603a.f();
            f.aj(com.google.common.f.a.e.a, "MicroDataManager");
            h hVar = f;
            hVar.ak(10037);
            hVar.H("MicroDataManager found null model location, so returning null hotword model for locale: %s, type: %s", str2, cVar.name());
            ba createBuilder = a.f1604a.createBuilder();
            createBuilder.copyOnWrite();
            a aVar = (a) createBuilder.instance;
            aVar.b |= 2;
            aVar.d = "Model location is null!";
            return dl.n((a) createBuilder.build());
        }
        if (!this.e.n.w(df.aQ)) {
            byte[] e = com.google.android.apps.gsa.speech.k.b.e.f.e(this.e.b, str, str2, cVar);
            if (e == null || (length = e.length) == 0) {
                ba createBuilder2 = a.f1604a.createBuilder();
                createBuilder2.copyOnWrite();
                a aVar2 = (a) createBuilder2.instance;
                aVar2.b |= 2;
                aVar2.d = "Legacy downloaded model is null!";
                return dl.n((a) createBuilder2.build());
            }
            ba createBuilder3 = a.f1604a.createBuilder();
            v x = v.x(e, 0, length);
            createBuilder3.copyOnWrite();
            a aVar3 = (a) createBuilder3.instance;
            aVar3.b |= 1;
            aVar3.c = x;
            return dl.n((a) createBuilder3.build());
        }
        bz bzVar = (bz) this.e.o.a();
        final j jVar = (j) this.e.p.a();
        e eVar = this.e;
        h d = com.google.android.apps.gsa.speech.k.b.e.f.f1607a.d();
        d.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
        h hVar2 = d;
        hVar2.ak(10078);
        hVar2.H("#getHotwordModel [locale: %s, modelType: %s]", str2, cVar);
        if (com.google.android.apps.gsa.speech.k.b.e.f.b.containsKey(str)) {
            ba createBuilder4 = a.f1604a.createBuilder();
            byte[] bArr = (byte[]) com.google.android.apps.gsa.speech.k.b.e.f.b.get(str);
            v vVar = v.b;
            v x2 = v.x(bArr, 0, bArr.length);
            createBuilder4.copyOnWrite();
            a aVar4 = (a) createBuilder4.instance;
            aVar4.b |= 1;
            aVar4.c = x2;
            g = dl.n((a) createBuilder4.build());
        } else if (URLUtil.isValidUrl(str)) {
            g = i.g(com.google.android.apps.gsa.speech.k.b.e.f.a(str2, cVar, bzVar), ex.b(new ah(jVar) { // from class: com.google.android.apps.gsa.speech.k.b.e.c

                /* renamed from: a, reason: collision with root package name */
                public final j f1605a;

                {
                    this.f1605a = jVar;
                }

                public final Object apply(Object obj) {
                    a aVar5;
                    int length3;
                    String str3 = (String) obj;
                    if (str3 != null) {
                        byte[] f2 = f.f(this.f1605a, Uri.parse(str3));
                        if (f2 == null || (length3 = f2.length) == 0) {
                            h d2 = f.f1607a.d();
                            d2.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
                            h hVar3 = d2;
                            hVar3.ak(10077);
                            hVar3.p("Returning null hotword model or zero byte count!");
                            ba createBuilder5 = a.f1604a.createBuilder();
                            createBuilder5.copyOnWrite();
                            a aVar6 = (a) createBuilder5.instance;
                            aVar6.b |= 2;
                            aVar6.d = "Mdd downloaded model is null or empty!";
                            aVar5 = (a) createBuilder5.build();
                        } else {
                            ba createBuilder6 = a.f1604a.createBuilder();
                            v x3 = v.x(f2, 0, length3);
                            createBuilder6.copyOnWrite();
                            a aVar7 = (a) createBuilder6.instance;
                            aVar7.b |= 1;
                            aVar7.c = x3;
                            aVar5 = (a) createBuilder6.build();
                        }
                    } else {
                        h f3 = f.f1607a.f();
                        f3.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
                        h hVar4 = f3;
                        hVar4.ak(10076);
                        hVar4.p("Returning null hotword model because MDD did not contain a valid URI. This can indicate that the model download did not finish or that it was not downloaded at all.");
                        ba createBuilder7 = a.f1604a.createBuilder();
                        createBuilder7.copyOnWrite();
                        a aVar8 = (a) createBuilder7.instance;
                        aVar8.b |= 2;
                        aVar8.d = "Mobstore Uri is null!";
                        aVar5 = (a) createBuilder7.build();
                    }
                    return aVar5;
                }
            }), eVar.q);
        } else {
            byte[] g2 = com.google.android.apps.gsa.speech.k.b.e.f.g(eVar.b, str);
            if (g2 == null || (length2 = g2.length) == 0) {
                ba createBuilder5 = a.f1604a.createBuilder();
                createBuilder5.copyOnWrite();
                a aVar5 = (a) createBuilder5.instance;
                aVar5.b |= 2;
                aVar5.d = "Model location is not a valid url and the model from asset file is null or empty!";
                g = dl.n((a) createBuilder5.build());
            } else {
                ba createBuilder6 = a.f1604a.createBuilder();
                v x3 = v.x(g2, 0, length2);
                createBuilder6.copyOnWrite();
                a aVar6 = (a) createBuilder6.instance;
                aVar6.b |= 1;
                aVar6.c = x3;
                g = dl.n((a) createBuilder6.build());
            }
        }
        return g;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        e eVar = this.e;
        String a2 = eVar.a(this.b, this.c);
        eVar.k = false;
        cn h = i.h(a(a2, this.b, this.c), ex.e(new r(this) { // from class: com.google.android.apps.gsa.speech.k.b.c.b

            /* renamed from: a, reason: collision with root package name */
            public final d f1600a;

            {
                this.f1600a = this;
            }

            public final cn apply(Object obj) {
                cn a3;
                a aVar = (a) obj;
                if ((aVar.b & 1) != 0) {
                    a3 = dl.n(aVar);
                } else {
                    d dVar = this.f1600a;
                    String str = (String) com.google.android.apps.gsa.speech.hotword.d.b.getOrDefault(dVar.b, "");
                    dVar.e.k = true;
                    if (str.isEmpty()) {
                        h f = e.f1603a.f();
                        f.aj(com.google.common.f.a.e.a, "MicroDataManager");
                        h hVar = f;
                        hVar.ak(10039);
                        hVar.s("Locale %s unrecognized. hotword detection will likely fail.", dVar.b);
                        ba createBuilder = a.f1604a.createBuilder();
                        createBuilder.copyOnWrite();
                        a aVar2 = (a) createBuilder.instance;
                        aVar2.b |= 2;
                        aVar2.d = "No hotword model and locale after remap is empty!";
                        a3 = dl.n((a) createBuilder.build());
                    } else {
                        h d = e.f1603a.d();
                        d.aj(com.google.common.f.a.e.a, "MicroDataManager");
                        h hVar2 = d;
                        hVar2.ak(10038);
                        hVar2.H("Changing locale %s to %s for hotword detection.", dVar.b, str);
                        a3 = dVar.a(dVar.e.a(str, dVar.c), str, dVar.c);
                    }
                }
                return a3;
            }
        }), this.e.r);
        e eVar2 = this.e;
        byte[] g = com.google.android.apps.gsa.speech.k.b.e.f.g(eVar2.b, "endpointer.data");
        synchronized (eVar2) {
            e eVar3 = this.e;
            bArr = eVar3.g;
            if (bArr == null) {
                bArr = com.google.android.apps.gsa.speech.k.b.e.f.g(eVar3.b, "echo_canceller_config.data");
            }
            e eVar4 = this.e;
            bArr2 = eVar4.h;
            if (bArr2 == null) {
                bArr2 = com.google.android.apps.gsa.speech.k.b.e.f.g(eVar4.b, "echo_nuller_config.data");
            }
        }
        dl.y(h, ex.h(new c(this, a2, g, bArr, bArr2)), this.e.r);
    }
}
