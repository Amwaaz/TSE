package com.google.android.apps.gsa.speech.k.b.c;

import com.google.android.apps.gsa.speech.k.b.e.a;
import com.google.common.base.cl;
import com.google.common.f.h;
import com.google.common.util.concurrent.bq;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/c/c.class */
final class c implements bq {

    /* renamed from: a, reason: collision with root package name */
    final String f1601a;
    final byte[] b;
    final byte[] c;
    final byte[] d;
    final d e;

    public c(d dVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f1601a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = dVar;
    }

    public final void gJ(Throwable th) {
        h e = e.f1603a.e();
        e.aj(com.google.common.f.a.e.a, "MicroDataManager");
        h g = e.g(th);
        g.ak(10033);
        d dVar = this.e;
        g.H("MicroDataManager InitializationTask failed due to hotword model load failure! Locale: %s, type: %s", dVar.b, dVar.c.name());
    }

    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        a aVar = (a) obj;
        boolean z = true;
        if ((aVar.b & 1) == 0 || aVar.c.E().length == 0) {
            h f = e.f1603a.f();
            f.aj(com.google.common.f.a.e.a, "MicroDataManager");
            h hVar = f;
            hVar.ak(10034);
            d dVar = this.e;
            hVar.H("MicroDataManager using no hotword model for locale: %s, type: %s!", dVar.b, dVar.c.name());
            this.e.e.s = 3;
        }
        if (this.e.d) {
            h e = e.f1603a.e();
            e.aj(com.google.common.f.a.e.a, "MicroDataManager");
            h hVar2 = e;
            hVar2.ak(10036);
            hVar2.p("MicroDataManager InitializationTask has been cancelled! Skipping config assignment and callbacks.");
            this.e.e.s = 4;
            return;
        }
        synchronized (this.e.e) {
            if ((aVar.b & 1) == 0 || aVar.c.E().length == 0) {
                e eVar = this.e.e;
                eVar.l = aVar.d;
                eVar.e = null;
                if (cl.L(eVar.l)) {
                    this.e.e.l = "Hotword model is null or empty!";
                }
            } else {
                this.e.e.e = aVar.c.E();
                this.e.e.s = 5;
            }
            this.e.e.d = this.f1601a;
            h d = e.f1603a.d();
            d.aj(com.google.common.f.a.e.a, "MicroDataManager");
            h hVar3 = d;
            hVar3.ak(10035);
            if (aVar != null) {
                z = false;
            }
            hVar3.L("MicroDataManager InitializationTask. googleHotwordData is null: true, hotwordModel is null: %b , sourceLocationOfCurrentHotwordModel %s", z, this.e.e.d);
            e eVar2 = this.e.e;
            eVar2.f = this.b;
            eVar2.g = this.c;
            eVar2.h = this.d;
            eVar2.t = 2;
            eVar2.j = null;
            eVar2.i = false;
            Iterator it = eVar2.m.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.e.e.m.clear();
        }
    }
}
