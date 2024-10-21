package androidx.room.c;

import androidx.room.af;
import androidx.room.bh;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:androidx/room/c/f.class */
public final class f implements af {

    /* renamed from: a, reason: collision with root package name */
    public final c f114a;
    private bh b;

    public f(c cVar) {
        this.f114a = cVar;
    }

    @Override // androidx.room.af
    public final Object a(String str, l lVar, m.c.g gVar) {
        j a2 = this.f114a.a(str);
        try {
            return lVar.a(a2);
        } finally {
            a2.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.u.a.b] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.u.a.b] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [m.h.a.p] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.u.a.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.room.bh r6, m.h.a.p r7, m.c.g r8) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.f.b(androidx.room.bh, m.h.a.p, m.c.g):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.u.a.b, java.lang.Object] */
    public final Object c() {
        return Boolean.valueOf(this.f114a.f111a.l());
    }
}
