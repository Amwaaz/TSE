package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.nga.shared.n.e;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.common.b.bs;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.speech.i.a.w;
import com.google.speech.i.gs;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final d f664a = d.j();
    public final a b;
    public final e.a c;
    public final e d;
    public final ag e;
    public final com.google.android.apps.gsa.nga.engine.recognition.m.a f;
    public final SodaTransportFactory g;
    public final Optional h;
    public final y i;
    public final AtomicReference j = new AtomicReference();
    public final ReadWriteLock k = new ReentrantReadWriteLock();
    public final e.a l;
    public Soda m;
    private final f n;

    public k(y yVar, a aVar, e.a aVar2, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.shared.n.k kVar, ag agVar, SodaTransportFactory sodaTransportFactory, Optional optional, com.google.android.apps.gsa.nga.engine.recognition.m.a aVar3, e.a aVar4, f fVar) {
        this.i = yVar;
        this.l = aVar4;
        this.n = fVar;
        this.d = kVar.a(hVar, new com.google.android.apps.gsa.shared.util.c.d() { // from class: com.google.android.apps.gsa.nga.engine.recognition.m.a.h
            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                ((com.google.android.apps.gsa.nga.engine.ak.i.k) obj).b((gs) obj2);
            }
        });
        this.b = aVar;
        this.c = aVar2;
        this.e = agVar;
        this.g = sodaTransportFactory;
        this.h = optional;
        this.f = aVar3;
    }

    public final Soda a() {
        Soda soda = this.m;
        if (soda != null) {
            return soda;
        }
        throw new j();
    }

    public final void b(w wVar) {
        Lock readLock = this.k.readLock();
        readLock.lock();
        try {
            a().w(wVar);
            f fVar = this.n;
            if (fVar.b.i(eu.F)) {
                com.google.common.f.h d = f.f663a.d();
                d.ak(3935);
                d.p("initialize");
                fVar.c = (ha) Stream._CC.concat(Collection._EL.stream(wVar.c).filter(new e(1)).map(new b(4)).map(new b(5)).flatMap(new b(6)).map(new b(7)), Collection._EL.stream(wVar.c).filter(new e(0)).map(new b(1)).map(new b(0)).flatMap(new b(6)).map(new b(2))).flatMap(new d(fVar)).collect(bs.b);
            }
        } finally {
            readLock.unlock();
        }
    }
}
