package com.google.android.apps.gsa.nga.engine.education.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/a.class */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final int f553a;

    public a(int i) {
        this.f553a = i;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.a.c, com.google.android.apps.gsa.nga.engine.education.a.v
    public final int a() {
        return this.f553a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.a.v
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == 2 && this.f553a == vVar.a();
    }

    public final int hashCode() {
        return this.f553a;
    }

    public final String toString() {
        return "Text{resourceId=" + this.f553a + "}";
    }
}
