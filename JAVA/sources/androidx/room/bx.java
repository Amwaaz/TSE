package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/bx.class */
public final class bx extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f106a;
    Object b;
    final by c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(by byVar, m.c.g gVar) {
        super(2, gVar);
        this.c = byVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((androidx.room.c.f) obj, (m.c.g) obj2).b(m.w.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (r9.b(r0, r0, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r7 != r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            m.c.a.a r0 = m.c.a.a.a
            r10 = r0
            r0 = r6
            int r0 = r0.f106a
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L29
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L1a
            r0 = r7
            m.k.b(r0)
            goto L85
        L1a:
            r0 = r6
            java.lang.Object r0 = r0.b
            androidx.room.c.f r0 = (androidx.room.c.f) r0
            r9 = r0
            r0 = r7
            m.k.b(r0)
            goto L4a
        L29:
            r0 = r7
            m.k.b(r0)
            r0 = r6
            java.lang.Object r0 = r0.b
            androidx.room.c.f r0 = (androidx.room.c.f) r0
            r9 = r0
            r0 = r6
            r1 = r9
            r0.b = r1
            r0 = r6
            r1 = 1
            r0.f106a = r1
            r0 = r9
            java.lang.Object r0 = r0.c()
            r7 = r0
            r0 = r7
            r1 = r10
            if (r0 == r1) goto L89
        L4a:
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L85
            r0 = r6
            androidx.room.by r0 = r0.c
            r11 = r0
            androidx.room.bh r0 = androidx.room.bh.IMMEDIATE
            r7 = r0
            androidx.room.bw r0 = new androidx.room.bw
            r1 = r0
            r2 = r11
            r3 = r9
            r4 = 0
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r6
            r1 = 0
            r0.b = r1
            r0 = r6
            r1 = 2
            r0.f106a = r1
            r0 = r9
            r1 = r7
            r2 = r11
            r3 = r6
            java.lang.Object r0 = r0.b(r1, r2, r3)
            r1 = r10
            if (r0 != r1) goto L85
            goto L89
        L85:
            m.w r0 = m.w.a
            return r0
        L89:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.bx.b(java.lang.Object):java.lang.Object");
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        bx bxVar = new bx(this.c, gVar);
        bxVar.b = obj;
        return bxVar;
    }
}
