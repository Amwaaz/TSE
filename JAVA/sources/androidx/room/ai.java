package androidx.room;

import androidx.u.a.b;
import androidx.work.impl.b.an;

/* loaded from: classes-dex2jar.jar:androidx/room/ai.class */
public final class ai extends m.h.b.n implements m.h.a.l {

    /* renamed from: a, reason: collision with root package name */
    final Object f86a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Object obj, int i) {
        super(1);
        this.b = i;
        this.f86a = obj;
    }

    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            b bVar = (b) obj;
            bVar.getClass();
            ((a) this.f86a).d = bVar;
            return m.w.a;
        }
        if (i == 1) {
            ((androidx.room.c.c) obj).getClass();
            return ((an) this.f86a).call();
        }
        c cVar = (c) obj;
        cVar.getClass();
        return ((ao) this.f86a).O(cVar);
    }
}
