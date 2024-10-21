package com.google.android.apps.gsa.nga.engine.ak.u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.v.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/u/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f445a = d.j();
    public static final boolean b;
    private static final ComponentName f;
    public final Context c;
    public final f d;
    public final h e;

    static {
        b = Build.VERSION.SDK_INT >= 29;
        f = ComponentName.createRelative("com.google.android.markup", ".AnnotateActivity");
    }

    public c(Context context, f fVar, h hVar) {
        this.c = context;
        this.d = fVar;
        this.e = hVar;
    }

    private static Intent c(Uri uri) {
        return new Intent("android.intent.action.EDIT").setDataAndType(uri, "image/png").addFlags(1).addFlags(2).addFlags(268435456);
    }

    public final Intent a(Uri uri) {
        Intent component = c(uri).setComponent(f);
        return this.c.getPackageManager().resolveActivity(component, 65536) != null ? component : c(uri);
    }

    public final cn b(Bitmap bitmap) {
        return this.e.a("[NGA] saveScreenshotToDisk", new a(this, bitmap));
    }
}
