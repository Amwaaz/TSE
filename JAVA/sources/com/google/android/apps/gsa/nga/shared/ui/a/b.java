package com.google.android.apps.gsa.nga.shared.ui.a;

import android.content.Context;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ui/a/b.class */
public abstract class b implements a {

    /* renamed from: a */
    private final boolean f1014a;

    public b(Context context) {
        this.f1014a = context.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_TABLET_2023_EXPERIENCE");
    }

    protected abstract boolean a();

    @Override // com.google.android.apps.gsa.nga.shared.ui.a.a
    public final int b() {
        return (this.f1014a || a()) ? 2 : 1;
    }
}
