package com.google.android.apps.gsa.nga.engine.m.d;

import com.google.common.b.fl;
import com.google.common.b.fu;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/m/d/ac.class */
public final class ac {

    /* renamed from: a */
    private final Map f622a = new HashMap();

    public final fl a() {
        fl m;
        synchronized (this) {
            m = fl.m(this.f622a.values());
            this.f622a.clear();
        }
        return m;
    }

    public final Optional b(String str) {
        Optional ofNullable;
        synchronized (this) {
            ofNullable = Optional.ofNullable((fu) this.f622a.remove(str));
        }
        return ofNullable;
    }

    public final void c(String str, fu fuVar) {
        synchronized (this) {
            this.f622a.put(str, fuVar);
        }
    }
}
