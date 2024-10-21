package androidx.room.f;

import android.os.SystemClock;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.dc;
import m.c.b.a.h;
import m.k;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/room/f/a.class */
final class a extends h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f119a;
    final b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m.c.g gVar) {
        super(2, gVar);
        this.b = bVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((ag) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        w wVar;
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f119a;
        k.b(obj);
        if (i == 0) {
            b bVar = this.b;
            this.f119a = 1;
            if (dc.s(bVar.e, this) == aVar) {
                return aVar;
            }
        }
        b bVar2 = this.b;
        synchronized (bVar2.d) {
            if (SystemClock.uptimeMillis() - bVar2.g.get() >= bVar2.e) {
                if (bVar2.f.get() == 0) {
                    m.h.a.a aVar2 = bVar2.c;
                    if (aVar2 != null) {
                        aVar2.a();
                        wVar = w.a;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                    androidx.u.a.b bVar3 = bVar2.h;
                    if (bVar3 != null && bVar3.m()) {
                        bVar3.close();
                    }
                    bVar2.h = null;
                }
            }
        }
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new a(this.b, gVar);
    }
}
