package com.google.android.apps.gsa.nga.shared.android;

import android.content.Context;
import androidx.compose.ui.l.f;
import com.google.common.base.ca;
import com.google.common.base.cl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/u.class */
public final class u {

    /* renamed from: a */
    public final ca f852a;
    public final boolean b;

    public u(Context context, boolean z) {
        this.f852a = cl.d(new ca(context) { // from class: com.google.android.apps.gsa.nga.shared.android.t

            /* renamed from: a, reason: collision with root package name */
            public final Context f851a;

            {
                this.f851a = context;
            }

            public final Object a() {
                return Boolean.valueOf(f.aj(this.f851a));
            }
        });
        this.b = z;
    }
}
