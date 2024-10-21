package com.google.android.apps.gsa.nga.engine.recognition.n.a;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.aa;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.engine.recognition.ae;
import com.google.android.apps.gsa.nga.engine.recognition.l.a;
import com.google.android.apps.gsa.nga.engine.v.d;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.ai;
import com.google.android.apps.gsa.nga.shared.u.i.b;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/n/a/m.class */
public final class m implements aa, com.google.android.apps.gsa.nga.engine.recognition.n.c {

    /* renamed from: a, reason: collision with root package name */
    private final aa f672a;
    private final Optional b;
    private final Optional c;
    private final a d;
    private b e = b.S3;

    public m(Optional optional, Optional optional2, aa aaVar, a aVar) {
        this.b = optional;
        this.c = optional2;
        this.f672a = aaVar;
        this.d = aVar;
    }

    private final Optional g() {
        synchronized (this) {
            if (b.SODA.equals(this.e)) {
                return this.b;
            }
            if (b.S3.equals(this.e)) {
                return Optional.of(this.f672a);
            }
            if (b.ROHAN_SODA.equals(this.e)) {
                return this.c;
            }
            return Optional.empty();
        }
    }

    private final void h(ac acVar) {
        synchronized (this) {
            String name = this.e.name();
            x xVar = this.d.g;
            int bitCount = Integer.bitCount(acVar.c);
            int i = acVar.l;
            if (i == 0) {
                throw null;
            }
            if (name == null) {
                throw new NullPointerException("Null engine");
            }
            xVar.b(new ai("NGA_AUDIO_FORMAT", ae.a(i), bitCount, acVar.d, acVar.b, name));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final void a(v vVar) {
        g().ifPresent(new k(vVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean b() {
        return ((Boolean) g().map(new j(0)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean c(ac acVar, d dVar) {
        h(acVar);
        return ((Boolean) g().map(new l(acVar, dVar, 1)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean d(ac acVar, d dVar) {
        h(acVar);
        return ((Boolean) g().map(new l(acVar, dVar, 0)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.aa
    public final boolean e() {
        return ((Boolean) g().map(new j(2)).orElse(false)).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n.c
    public final void f(b bVar) {
        synchronized (this) {
            e();
            this.e = bVar;
        }
    }
}
