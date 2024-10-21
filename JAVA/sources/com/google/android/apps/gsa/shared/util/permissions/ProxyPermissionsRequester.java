package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.o.g;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/permissions/ProxyPermissionsRequester.class */
public final class ProxyPermissionsRequester implements f {

    /* renamed from: a, reason: collision with root package name */
    private final g f1572a;
    private final Context b;

    public ProxyPermissionsRequester(g gVar, Context context) {
        this.f1572a = gVar;
        this.b = context;
    }

    public final void a(String[] strArr, int i, e eVar) {
        this.f1572a.ib(new Intent(this.b, (Class<?>) ProxyActivity.class).putExtra("permissions", strArr).putExtra("permission-source", i - 1).putExtra("receiver", (Parcelable) new WrapperPermissionsCallback(eVar)));
    }
}
