package androidx.room;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.a.b;
import kotlinx.coroutines.dc;
import m.a.a.r;
import m.a.an;

/* loaded from: classes-dex2jar.jar:androidx/room/by.class */
public final class by {
    public static final int e = 0;
    private static final String[] f = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final ao f107a;
    public final ab b;
    public final ad c;
    private final Map g;
    private final Map h;
    private final m.h.a.l i;
    private final String[] k;
    private final b l = new b(false, kotlinx.a.f.a);
    public m.h.a.a d = br.f101a;
    private final Map j = new LinkedHashMap();

    public by(ao aoVar, Map map, Map map2, String[] strArr, m.h.a.l lVar) {
        String str;
        this.f107a = aoVar;
        this.g = map;
        this.h = map2;
        this.i = lVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.j.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.g.get(strArr[i]);
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str == null) {
                str = lowerCase;
            }
            strArr2[i] = str;
        }
        this.k = strArr2;
        for (Map.Entry entry : this.g.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (this.j.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Map map3 = this.j;
                map3.put(lowerCase3, an.ap(map3, lowerCase2));
            }
        }
        this.b = new ab(this.k.length);
        this.c = new ad(this.k.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.room.af r6, m.c.g r7) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.by.a(androidx.room.af, m.c.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(m.c.g r6) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.by.b(m.c.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x01a0 -> B:13:0x01a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.room.af r6, int r7, m.c.g r8) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.by.c(androidx.room.af, int, m.c.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00f8 -> B:11:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.room.af r6, int r7, m.c.g r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.by.d(androidx.room.af, int, m.c.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(m.c.g r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof androidx.room.bv
            if (r0 == 0) goto L23
            r0 = r6
            androidx.room.bv r0 = (androidx.room.bv) r0
            r8 = r0
            r0 = r8
            int r0 = r0.c
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L23
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.c = r1
            goto L2d
        L23:
            androidx.room.bv r0 = new androidx.room.bv
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r8 = r0
        L2d:
            r0 = r8
            java.lang.Object r0 = r0.f104a
            r10 = r0
            m.c.a.a r0 = m.c.a.a.a
            r9 = r0
            r0 = r8
            int r0 = r0.c
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r8
            androidx.room.a.a r0 = r0.d
            r6 = r0
            r0 = r10
            m.k.b(r0)     // Catch: java.lang.Throwable -> L53
            goto La0
        L53:
            r8 = move-exception
            goto Lab
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r10
            m.k.b(r0)
            r0 = r5
            androidx.room.ao r0 = r0.f107a
            androidx.room.a.a r0 = r0.g
            r6 = r0
            r0 = r6
            boolean r0 = r0.c()
            if (r0 == 0) goto Lb1
            r0 = r5
            androidx.room.ao r0 = r0.f107a     // Catch: java.lang.Throwable -> Laa
            r11 = r0
            androidx.room.bx r0 = new androidx.room.bx     // Catch: java.lang.Throwable -> Laa
            r10 = r0
            r0 = r10
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Laa
            r0 = r8
            r1 = r6
            r0.d = r1     // Catch: java.lang.Throwable -> Laa
            r0 = r8
            r1 = 1
            r0.c = r1     // Catch: java.lang.Throwable -> Laa
            r0 = r11
            r1 = r10
            r2 = r8
            java.lang.Object r0 = r0.B(r1, r2)     // Catch: java.lang.Throwable -> Laa
            r8 = r0
            r0 = r8
            r1 = r9
            if (r0 == r1) goto La7
        La0:
            r0 = r6
            r0.b()
            goto Lb1
        La7:
            r0 = r9
            return r0
        Laa:
            r8 = move-exception
        Lab:
            r0 = r6
            r0.b()
            r0 = r8
            throw r0
        Lb1:
            m.w r0 = m.w.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.by.e(m.c.g):java.lang.Object");
    }

    public final m.h f(String[] strArr) {
        r rVar = new r();
        for (String str : strArr) {
            Map map = this.h;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                rVar.addAll(set);
            } else {
                rVar.add(str);
            }
        }
        String[] strArr2 = (String[]) an.ah(rVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = this.j;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        return new m.h(strArr2, iArr);
    }

    public final void g(m.h.a.a aVar, m.h.a.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.l.a(false, true)) {
            aVar.a();
            dc.P(this.f107a.o(), new kotlinx.coroutines.af("Room Invalidation Tracker Refresh"), 0, new bs(this, aVar2, null), 2);
        }
    }
}
