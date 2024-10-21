package com.google.android.apps.gsa.nga.engine.ak.y;

import com.google.common.b.bu;
import com.google.common.base.ah;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/y/f.class */
public final class f {

    /* renamed from: a */
    public final Map f450a = new HashMap();

    public final f a() {
        f fVar = new f();
        for (e eVar : new bu(this.f450a.entrySet(), new ah() { // from class: com.google.android.apps.gsa.nga.engine.ak.y.d
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return new e((c) entry.getKey(), entry.getValue());
            }
        })) {
            fVar.d(eVar.a, eVar.b);
        }
        return fVar;
    }

    public final Object b(c cVar) {
        return this.f450a.get(cVar);
    }

    public final Object c(c cVar, Object obj) {
        Object b = b(cVar);
        return b == null ? obj : b;
    }

    public final void d(c cVar, Object obj) {
        this.f450a.put(cVar, obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f450a.equals(((f) obj).f450a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f450a.hashCode();
    }
}
