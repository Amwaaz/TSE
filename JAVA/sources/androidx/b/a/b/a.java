package androidx.b.a.b;

import java.util.HashMap;

/* loaded from: classes-dex2jar.jar:androidx/b/a/b/a.class */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f40a = new HashMap();

    @Override // androidx.b.a.b.h
    public final d a(Object obj) {
        return (d) this.f40a.get(obj);
    }

    @Override // androidx.b.a.b.h
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.f40a.remove(obj);
        return b;
    }
}
