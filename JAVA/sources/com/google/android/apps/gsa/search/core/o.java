package com.google.android.apps.gsa.search.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.gms.common.u;
import com.google.android.libraries.gcoreclient.f.c.c;
import com.google.common.base.at;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.gz;
import com.google.common.o.hb;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/o.class */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1134a = j.i("com.google.android.apps.gsa.search.core.o");
    public final com.google.android.libraries.gsa.h.h b;
    public final an c;
    private final Context d;
    private final a e;
    private final a f;
    private final a g;
    private final List h = new ArrayList();
    private at i;
    private at j;
    private at k;
    private BroadcastReceiver l;

    public o(Context context, an anVar, com.google.android.libraries.gsa.h.h hVar, a aVar, a aVar2, a aVar3) {
        this.d = context;
        this.c = anVar;
        this.b = hVar;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        com.google.common.base.a aVar4 = com.google.common.base.a.a;
        this.i = aVar4;
        this.j = aVar4;
        this.k = aVar4;
    }

    private final int h() {
        return u.a(this.d);
    }

    @Deprecated
    public final int a() {
        int intValue;
        synchronized (this) {
            if (this.l == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addDataScheme("package");
                intentFilter.addDataSchemeSpecificPart("com.google.android.gms", 0);
                intentFilter.addDataSchemeSpecificPart("com.android.vending", 0);
                BroadcastReceiver mVar = new m(this);
                this.l = mVar;
                this.d.registerReceiver(mVar, intentFilter);
            }
            if (!this.j.h()) {
                this.j = at.k(Integer.valueOf(((com.google.android.libraries.gcoreclient.f.c.a) this.g.a()).a(this.d)));
                this.k = at.k(Integer.valueOf(h()));
                bc createBuilder = hb.a.createBuilder();
                createBuilder.copyOnWrite();
                hb hbVar = createBuilder.instance;
                hbVar.b |= 2;
                hbVar.n = 109;
                ba createBuilder2 = gz.a.createBuilder();
                int intValue2 = ((Integer) this.j.c()).intValue();
                createBuilder2.copyOnWrite();
                gz gzVar = createBuilder2.instance;
                gzVar.b |= 1;
                gzVar.c = intValue2;
                int intValue3 = ((Integer) this.k.c()).intValue();
                createBuilder2.copyOnWrite();
                gz gzVar2 = createBuilder2.instance;
                gzVar2.b |= 2;
                gzVar2.d = intValue3;
                createBuilder.copyOnWrite();
                hb hbVar2 = createBuilder.instance;
                gz build = createBuilder2.build();
                build.getClass();
                hbVar2.x = build;
                hbVar2.b |= 1073741824;
                k.g(createBuilder.build(), null, null, null);
            }
            Integer num = (Integer) this.j.c();
            intValue = num.intValue();
            if (!this.i.h() || intValue != ((Integer) this.i.c()).intValue()) {
                ab abVar = e.a;
                synchronized (this.h) {
                    Iterator it = this.h.iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).a(intValue);
                    }
                }
                this.i = at.k(num);
            }
        }
        return intValue;
    }

    public final int b() {
        int intValue;
        synchronized (this) {
            if (!this.k.h()) {
                this.k = at.k(Integer.valueOf(h()));
            }
            intValue = ((Integer) this.k.c()).intValue();
        }
        return intValue;
    }

    public final void c(n nVar) {
        synchronized (this.h) {
            f.f(!this.h.contains(nVar), "listener already added");
            this.h.add(nVar);
        }
    }

    public final void d() {
        synchronized (this) {
            com.google.common.base.a aVar = com.google.common.base.a.a;
            this.j = aVar;
            this.k = aVar;
        }
    }

    public final boolean e(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return false;
        }
        return g(callingActivity.getPackageName());
    }

    public final boolean f() {
        return a() == 0;
    }

    public final boolean g(String str) {
        c cVar = (c) this.f.a();
        this.d.getPackageManager();
        return cVar.a.c(str);
    }
}
