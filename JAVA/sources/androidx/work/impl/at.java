package androidx.work.impl;

import androidx.work.bg;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/at.class */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public final p f185a;
    private final b b;

    public at(p pVar, b bVar) {
        pVar.getClass();
        bVar.getClass();
        this.f185a = pVar;
        this.b = bVar;
    }

    public final void a(v vVar, bg bgVar) {
        vVar.getClass();
        this.b.f216a.execute(new as(this, vVar, bgVar, 0));
    }

    public final void b(v vVar, int i) {
        this.b.f216a.execute(new androidx.work.impl.utils.p(this.f185a, vVar, false, i));
    }
}
