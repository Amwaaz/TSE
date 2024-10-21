package androidx.room;

import androidx.u.b;
import m.a.a.r;
import m.a.an;

/* loaded from: classes-dex2jar.jar:androidx/room/bk.class */
final class bk extends m.h.b.n implements m.h.a.l {
    private final int c;
    public static final bk b = new bk(1);

    /* renamed from: a */
    public static final bk f100a = new bk(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(int i) {
        super(1);
        this.c = i;
    }

    public final /* synthetic */ Object a(Object obj) {
        if (this.c != 0) {
            b bVar = (b) obj;
            bVar.getClass();
            return Boolean.valueOf(bVar.n());
        }
        b bVar2 = (b) obj;
        bVar2.getClass();
        r rVar = new r();
        while (bVar2.n()) {
            rVar.add(Integer.valueOf((int) bVar2.c(0)));
        }
        return an.ah(rVar);
    }
}
