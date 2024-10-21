package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/aa.class */
public final class aa extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f888a;
    int b;
    final ac c;
    private Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ac acVar, m.c.g gVar) {
        super(2, gVar);
        this.c = acVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((kotlinx.coroutines.a.ae) obj, (m.c.g) obj2).b(m.w.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00af, code lost:
    
        if (kotlinx.coroutines.a.ac.a(r7, r0, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r7.a(false, r6) != r0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            m.c.a.a r0 = m.c.a.a.a
            r11 = r0
            r0 = r6
            int r0 = r0.b
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L32
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L1a
            r0 = r7
            m.k.b(r0)
            goto Lb5
        L1a:
            r0 = r6
            java.lang.Object r0 = r0.f888a
            r9 = r0
            r0 = r6
            java.lang.Object r0 = r0.d
            kotlinx.coroutines.a.ae r0 = (kotlinx.coroutines.a.ae) r0
            r10 = r0
            r0 = r7
            m.k.b(r0)
            r0 = r10
            r7 = r0
            goto L8a
        L32:
            r0 = r7
            m.k.b(r0)
            r0 = r6
            java.lang.Object r0 = r0.d
            kotlinx.coroutines.a.ae r0 = (kotlinx.coroutines.a.ae) r0
            r7 = r0
            com.google.android.apps.gsa.nga.shared.j.a.a.a.z r0 = new com.google.android.apps.gsa.nga.shared.j.a.a.a.z
            r1 = r0
            r2 = r6
            com.google.android.apps.gsa.nga.shared.j.a.a.a.ac r2 = r2.c
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            com.google.android.apps.gsa.nga.shared.j.a.a.a.ac r0 = r0.c
            r10 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r1 = r0
            java.lang.String r2 = "com.google.android.googlequicksearchbox.action.HOTWORD_ENROLLMENT"
            r1.<init>(r2)
            r12 = r0
            r0 = r10
            android.content.Context r0 = r0.b
            r1 = r9
            r2 = r12
            java.lang.String r3 = "android.permission.MANAGE_VOICE_KEYPHRASES"
            r4 = 2
            android.content.Intent r0 = androidx.core.content.a.f(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r0.d = r1
            r0 = r6
            r1 = r9
            r0.f888a = r1
            r0 = r6
            r1 = 1
            r0.b = r1
            r0 = r7
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = r6
            java.lang.Object r0 = r0.a(r1, r2)
            r1 = r11
            if (r0 == r1) goto Lb9
        L8a:
            com.google.android.apps.gsa.nga.shared.j.a.a.a.au r0 = new com.google.android.apps.gsa.nga.shared.j.a.a.a.au
            r1 = r0
            r2 = r6
            com.google.android.apps.gsa.nga.shared.j.a.a.a.ac r2 = r2.c
            r3 = r9
            r4 = 1
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r6
            r1 = 0
            r0.d = r1
            r0 = r6
            r1 = 0
            r0.f888a = r1
            r0 = r6
            r1 = 2
            r0.b = r1
            r0 = r7
            r1 = r9
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.a.ac.a(r0, r1, r2)
            r1 = r11
            if (r0 != r1) goto Lb5
            goto Lb9
        Lb5:
            m.w r0 = m.w.a
            return r0
        Lb9:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.j.a.a.a.aa.b(java.lang.Object):java.lang.Object");
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        aa aaVar = new aa(this.c, gVar);
        aaVar.d = obj;
        return aaVar;
    }
}
