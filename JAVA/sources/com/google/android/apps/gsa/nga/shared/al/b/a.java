package com.google.android.apps.gsa.nga.shared.al.b;

import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.eu;
import com.google.android.apps.gsa.nga.shared.q.c.ev;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/al/b/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x f844a;

    public a(x xVar) {
        this.f844a = xVar;
    }

    public final void a(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fileId");
        }
        this.f844a.b(new eu("NGA_WARM_ACTIONS_RESOURCE_FILE_STATUS", str, z));
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fileId");
        }
        this.f844a.b(new ev("NGA_WARM_ACTIONS_RESOURCE_URI_STATUS", str, z));
    }
}
