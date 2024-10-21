package com.google.android.apps.gsa.nga.shared.android;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.apps.gsa.shared.k.eu;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f848a;
    private volatile AtomicReference b = new AtomicReference(new HashSet());

    public c(Context context, PackageManager packageManager, com.google.android.apps.gsa.shared.util.q.a aVar) {
        this.f848a = packageManager;
        m mVar = new m(new l(this) { // from class: com.google.android.apps.gsa.nga.shared.android.b

            /* renamed from: a, reason: collision with root package name */
            public final c f847a;

            {
                this.f847a = this;
            }

            @Override // com.google.android.apps.gsa.nga.shared.android.l
            public final void a(Intent intent) {
                this.f847a.a();
            }
        }, aVar, eu.bM);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(mVar, intentFilter);
        a();
    }

    public final void a() {
        Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("http:"));
        HashSet hashSet = new HashSet();
        hashSet.add("com.android.browser");
        for (ResolveInfo resolveInfo : this.f848a.queryIntentActivities(data, 131072)) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName != null) {
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
        }
        this.b.set(hashSet);
    }

    public final boolean b(String str) {
        return ((Set) this.b.get()).contains(str);
    }
}
