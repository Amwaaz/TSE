package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.f.a.d;
import j$.util.Optional;
import java.net.URISyntaxException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final d f845a = d.j();
    private final PackageManager b;
    private final c c;

    public a(PackageManager packageManager, c cVar) {
        this.b = packageManager;
        this.c = cVar;
    }

    public final Optional a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        try {
            return Optional.of(Intent.parseUri(str, 0));
        } catch (URISyntaxException e) {
            aus.i(f845a.f(), "Can't parse Intent from  uri: %s", str, (char) 5066, e);
            return Optional.empty();
        }
    }

    public final Optional b(Intent intent, boolean z) {
        ResolveInfo resolveActivity = this.b.resolveActivity(intent, 0);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName == null) {
            return Optional.empty();
        }
        String str = resolveActivity.activityInfo.packageName;
        return (z || !this.c.b(str)) ? Optional.of(str) : Optional.empty();
    }
}
