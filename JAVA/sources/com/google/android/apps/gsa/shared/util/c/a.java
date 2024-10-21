package com.google.android.apps.gsa.shared.util.c;

import com.google.common.base.ca;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a.class */
public class a implements az, k {

    /* renamed from: a, reason: collision with root package name */
    private final int f1507a;
    private final int b;
    private final ca c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Class cls, String str, int i) {
        f.d(1);
        this.f1507a = 1;
        f.e(i);
        this.b = i;
        this.c = new e(cls, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, String str2, int i, int i2) {
        f.d(i);
        this.f1507a = i;
        f.e(i2);
        this.b = i2;
        this.c = new e(getClass(), str, str2);
    }

    @Override // com.google.android.apps.gsa.shared.util.c.k
    public final ca gl() {
        return this.c;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.az
    public final int hB() {
        return this.b;
    }

    @Override // com.google.android.apps.gsa.shared.util.c.az
    public final int hC() {
        return this.f1507a;
    }

    public final String toString() {
        return (String) this.c.a();
    }
}
