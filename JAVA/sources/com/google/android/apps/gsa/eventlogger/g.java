package com.google.android.apps.gsa.eventlogger;

import com.google.android.apps.gsa.shared.logger.f;
import com.google.android.apps.gsa.shared.logger.p;
import com.google.android.apps.gsa.shared.logger.w;
import com.google.common.o.ew;
import com.google.common.o.hb;
import com.google.protobuf.bc;
import j$.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/eventlogger/g.class */
public final class g implements p {
    private static g b;

    /* renamed from: a, reason: collision with root package name */
    volatile com.google.android.apps.gsa.eventlogger.a.b f356a;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private final a d = new a();

    private g() {
    }

    public static g a() {
        g gVar;
        synchronized (g.class) {
            try {
                if (b == null) {
                    b = new g();
                }
                gVar = b;
            } finally {
            }
        }
        return gVar;
    }

    private final void e(f fVar) {
        a aVar = this.d;
        aVar.b++;
        if (aVar.f346a == null) {
            int i = com.google.android.apps.gsa.eventlogger.a.b.f347a;
            w wVar = fVar.b;
            String str = null;
            if (wVar != null) {
                com.google.android.apps.gsa.shared.logger.b bVar = wVar.e;
                str = null;
                if (bVar != null) {
                    str = bVar.a;
                }
            }
            aVar.f346a = str;
        }
        this.c.add(fVar);
    }

    @Override // com.google.android.apps.gsa.shared.logger.p
    public final f b(w wVar) {
        f fVar;
        synchronized (this) {
            fVar = new f(null, wVar);
            e(fVar);
        }
        return fVar;
    }

    @Override // com.google.android.apps.gsa.shared.logger.p
    public final f c(hb hbVar, ew ewVar, com.google.protos.ah.b.a aVar, String str) {
        synchronized (this) {
            bc builder = hbVar.toBuilder();
            com.google.android.apps.gsa.eventlogger.a.d dVar = com.google.android.apps.gsa.eventlogger.a.e.b;
            if (!dVar.f349a.contains(Integer.valueOf(builder.instance.n))) {
                Integer num = (Integer) dVar.b.get(Integer.valueOf(builder.instance.n));
                Integer num2 = num;
                if (num == null) {
                    int i = dVar.c;
                    num2 = 1000;
                }
                if (dVar.d <= num2.intValue()) {
                    int intValue = num2.intValue();
                    com.google.android.apps.gsa.eventlogger.a.e.f350a.intValue();
                    if (intValue < 1000 && num2.intValue() > 0) {
                        com.google.android.apps.gsa.eventlogger.a.e.f350a.intValue();
                        int intValue2 = 1000 / num2.intValue();
                        builder.copyOnWrite();
                        hb hbVar2 = builder.instance;
                        hbVar2.g |= 1073741824;
                        hbVar2.aH = intValue2;
                    }
                    f fVar = new f(builder.build(), null);
                    e(fVar);
                    return fVar;
                }
            }
            int i2 = hbVar.n;
            return new f(builder.build(), null);
        }
    }

    public final void d() {
        synchronized (this) {
        }
    }
}
