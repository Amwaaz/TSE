package androidx.room;

import androidx.room.f.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/s.class */
public final class s extends m.h.b.n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f135a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Object obj, int i) {
        super(0);
        this.b = i;
        this.f135a = obj;
    }

    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            b bVar = ((u) this.f135a).f;
            if (bVar != null) {
                bVar.d();
            }
            return m.w.a;
        }
        if (i == 1) {
            boolean z = true;
            if (((u) this.f135a).f137a.x()) {
                z = ((u) this.f135a).f137a.z();
            }
            return Boolean.valueOf(z);
        }
        if (i != 2) {
            return ((bc) this.f135a).d();
        }
        b bVar2 = ((u) this.f135a).f;
        if (bVar2 != null) {
            bVar2.a();
        }
        return m.w.a;
    }
}
