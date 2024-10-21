package com.google.android.apps.gsa.nga.shared.ak;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.webkit.k$;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.i.i;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ak/e.class */
public final class e {

    /* renamed from: a */
    private static final d f843a = d.c("AssistantForeground");
    private final Optional b;
    private final Context c;
    private final i d;

    public e(Context context, i iVar) {
        this.c = context;
        this.b = Optional.ofNullable((ActivityManager) context.getSystemService(ActivityManager.class));
        this.d = iVar;
    }

    public static Optional c(Optional optional) {
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        ComponentName m = k$.ExternalSyntheticApiModelOutline0.m((ActivityManager.RunningTaskInfo) optional.get());
        if (m != null) {
            return Optional.of(m);
        }
        a f = f843a.f();
        f.ak(5856);
        f.p("ComponentName for the foreground activity is null.");
        return Optional.empty();
    }

    public final c a(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                a d = f843a.d();
                d.ak(5853);
                d.s("Get launcher package: %s", resolveActivity.activityInfo.packageName);
            }
            if (resolveActivity != null) {
                return str.equals(resolveActivity.activityInfo.packageName) ? c.b : c.c;
            }
            a f = f843a.f();
            f.ak(5854);
            f.p("Getting launcher as null");
            return c.a;
        } catch (RuntimeException e) {
            a f2 = f843a.f();
            f2.ak(5855);
            f2.s("Exception at getting launcher: %s", e.getMessage());
            return c.a;
        }
    }

    public final c b() {
        return g() ? c.c : (c) d().map(new b(this, 0)).orElse(c.a);
    }

    public final Optional d() {
        return c(e()).map(new a());
    }

    public final Optional e() {
        List f = f(2);
        for (int i = 0; i < f.size(); i++) {
            ComponentName m = k$.ExternalSyntheticApiModelOutline0.m((ActivityManager.RunningTaskInfo) f.get(i));
            if (m == null || !this.d.a(m)) {
                return Optional.of((ActivityManager.RunningTaskInfo) f.get(i));
            }
        }
        return Optional.empty();
    }

    final List f(int i) {
        if (this.b.isEmpty()) {
            a f = f843a.f();
            f.ak(5858);
            f.p("Could not get an instance of ActivityManager.");
            int i2 = fl.e;
            return ni.a;
        }
        try {
            fl runningTasks = ((ActivityManager) this.b.get()).getRunningTasks(i);
            fl flVar = runningTasks;
            if (runningTasks.isEmpty()) {
                a f2 = f843a.f();
                f2.ak(5857);
                f2.p("ActivityManager returned no foreground tasks.");
                int i3 = fl.e;
                flVar = ni.a;
            }
            return flVar;
        } catch (RuntimeException e) {
            int i4 = fl.e;
            return ni.a;
        }
    }

    public final boolean g() {
        return ((Boolean) c(Collection._EL.stream(f(1)).findFirst()).map(new b(this.d, 2)).orElse(false)).booleanValue();
    }
}
