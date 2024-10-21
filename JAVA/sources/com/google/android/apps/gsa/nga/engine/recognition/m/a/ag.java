package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.nga.engine.d.a.bb;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.f.a.d;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.speech.i.di;
import com.google.speech.i.gr;
import com.google.speech.i.gs;
import j$.util.Optional;
import java.io.File;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/ag.class */
public final class ag implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f660a = d.j();
    public final i b;
    public final com.google.android.libraries.gsa.h.h c;
    public final bb d;
    public final a e;
    public final Random f;
    public Optional g = Optional.empty();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final af j;
    public final x k;
    public final f l;
    private final com.google.android.apps.gsa.nga.engine.recognition.l.a m;

    public ag(af afVar, com.google.android.apps.gsa.nga.engine.recognition.l.a aVar, i iVar, x xVar, com.google.android.libraries.gsa.h.h hVar, bb bbVar, f fVar, a aVar2, Random random) {
        this.j = afVar;
        this.m = aVar;
        this.b = iVar;
        this.k = xVar;
        this.c = hVar;
        this.d = bbVar;
        this.l = fVar;
        this.e = aVar2;
        this.f = random;
    }

    public static long a(File file) {
        long j;
        long j2 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            j = 0;
            if (listFiles != null) {
                int i = 0;
                while (true) {
                    j = j2;
                    if (i >= listFiles.length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    j2 += file2.isFile() ? file2.length() : a(file2);
                    i++;
                }
            }
        } else {
            if (file.isFile()) {
                return file.length();
            }
            j = 0;
        }
        return j;
    }

    public final Optional b() {
        return this.g.map(new b(10));
    }

    public final Optional c() {
        return this.g.map(new b(8));
    }

    public final void e(com.google.android.apps.gsa.shared.logger.b.f fVar) {
        r rVar = fVar.d;
        com.google.android.apps.gsa.nga.engine.recognition.h hVar = com.google.android.apps.gsa.nga.engine.recognition.h.b;
        qn builder = rVar != null ? rVar.toBuilder() : r.a.createBuilder();
        i iVar = this.m.f657a;
        e eVar = new e();
        eVar.b(fVar);
        String name = hVar.name();
        builder.copyOnWrite();
        r rVar2 = builder.instance;
        name.getClass();
        rVar2.d |= 8;
        rVar2.Y = name;
        eVar.b = builder.build();
        iVar.a(eVar.a());
    }

    public final void f(di diVar, gr grVar) {
        this.c.n("[NGA] SodaLogger.onSodaInit", new o(this, grVar, diVar, 3));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("NGA Soda information");
        gs gsVar = (gs) this.h.get();
        this.g.ifPresent(new m(fVar, 3));
        if (gsVar != null) {
            fVar.a("Soda config status").a(new com.google.android.apps.gsa.shared.util.b.d(gsVar.name(), false));
        }
    }
}
