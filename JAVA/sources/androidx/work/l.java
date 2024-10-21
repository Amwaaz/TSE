package androidx.work;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/l.class */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f224a = au.d(new LinkedHashMap());
    public final Map b;

    public l(l lVar) {
        lVar.getClass();
        this.b = new HashMap(lVar.b);
    }

    public l(Map map) {
        this.b = new HashMap(map);
    }

    public final int a(String str, int i) {
        Map map = this.b;
        Object valueOf = Integer.valueOf(i);
        Object obj = map.get(str);
        Object obj2 = valueOf;
        if (true == (obj instanceof Integer)) {
            obj2 = obj;
        }
        return ((Number) obj2).intValue();
    }

    public final long b(String str, long j) {
        Map map = this.b;
        Object valueOf = Long.valueOf(j);
        Object obj = map.get(str);
        Object obj2 = valueOf;
        if (true == (obj instanceof Long)) {
            obj2 = obj;
        }
        return ((Number) obj2).longValue();
    }

    public final String c(String str) {
        str.getClass();
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map d() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.b);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final boolean e(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            if (r0 == 0) goto Lc7
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            boolean r0 = h.a.a.p.b.a.f.h(r0, r1)
            if (r0 != 0) goto L1c
            goto Lc7
        L1c:
            r0 = r4
            androidx.work.l r0 = (androidx.work.l) r0
            r4 = r0
            r0 = r3
            java.util.Map r0 = r0.b
            r7 = r0
            r0 = r4
            java.util.Map r0 = r0.b
            r6 = r0
            r0 = r7
            java.util.Set r0 = r0.keySet()
            r7 = r0
            r0 = r7
            r1 = r6
            java.util.Set r1 = r1.keySet()
            boolean r0 = h.a.a.p.b.a.f.h(r0, r1)
            if (r0 != 0) goto L45
            r0 = 0
            return r0
        L45:
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L4d:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc5
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r3
            java.util.Map r0 = r0.b
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r4
            java.util.Map r0 = r0.b
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto Lbc
            r0 = r8
            if (r0 != 0) goto L88
            goto Lbc
        L88:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Object[]
            if (r0 == 0) goto Lad
            r0 = r7
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r9 = r0
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Object[]
            if (r0 == 0) goto Lad
            r0 = r9
            r1 = r8
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r0 = m.a.an.bt(r0, r1)
            r5 = r0
            goto Lb5
        Lad:
            r0 = r7
            r1 = r8
            boolean r0 = h.a.a.p.b.a.f.h(r0, r1)
            r5 = r0
        Lb5:
            r0 = r5
            if (r0 != 0) goto L4d
            goto Lc3
        Lbc:
            r0 = r7
            r1 = r8
            if (r0 == r1) goto L4d
        Lc3:
            r0 = 0
            return r0
        Lc5:
            r0 = 1
            return r0
        Lc7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.l.equals(java.lang.Object):boolean");
    }

    public final byte[] f(String str) {
        Object obj = this.b.get(str);
        byte[] bArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            bArr = null;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                j jVar = new j(obj, 1);
                bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) jVar.a(Integer.valueOf(i))).byteValue();
                }
            }
        }
        return bArr;
    }

    public final boolean g(String str) {
        Object obj = this.b.get(str);
        Object obj2 = false;
        if (true == (obj instanceof Boolean)) {
            obj2 = obj;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public final int hashCode() {
        Iterator it = this.b.entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2 * 31;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            i = i2 + (value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode());
        }
    }

    public final String toString() {
        return "Data {" + t.ae(this.b.entrySet(), (CharSequence) null, (CharSequence) null, (CharSequence) null, k.a, 31) + "}";
    }
}
