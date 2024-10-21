package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.app.cm;
import android.support.v4.app.cn;
import android.support.v4.app.co;
import android.support.v4.app.cu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.a.a;
import androidx.activity.result.i;
import androidx.core.content.c;
import androidx.core.content.d;
import androidx.core.h.s;
import androidx.core.h.t;
import androidx.lifecycle.ag;
import androidx.lifecycle.ay;
import androidx.lifecycle.b.b;
import androidx.lifecycle.bg;
import androidx.lifecycle.bi;
import androidx.lifecycle.bq;
import androidx.lifecycle.cd;
import androidx.lifecycle.ce;
import androidx.lifecycle.ci;
import androidx.lifecycle.cj;
import androidx.lifecycle.q;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.t.g;
import androidx.t.h;
import androidx.t.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.e;

/* loaded from: classes-dex2jar.jar:androidx/activity/m.class */
public class m extends cu implements androidx.lifecycle.ae, cj, q, h, ae, i, c, d, cm, cn, s, u {

    /* renamed from: a, reason: collision with root package name */
    private final t f36a;
    private final CopyOnWriteArrayList aaJ;
    private ci b;
    private final e c;
    private int d;
    private final AtomicInteger e;
    public final a f;
    public final g g;
    public final androidx.activity.result.h h;
    public final CopyOnWriteArrayList i;
    public final i j;
    private final CopyOnWriteArrayList l;
    private final CopyOnWriteArrayList m;
    private final CopyOnWriteArrayList n;
    private final CopyOnWriteArrayList o;
    private boolean p;
    private boolean q;
    private final e r;
    private final e s;

    public m() {
        a aVar = new a();
        this.f = aVar;
        this.f36a = new t(new h(this, 1));
        g b = j.b(this);
        this.g = b;
        this.j = new i(this);
        this.c = new m.m(new k(this, 0));
        this.e = new AtomicInteger();
        this.h = new androidx.activity.result.h(this);
        this.aaJ = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().c(new c(this, 1));
        getLifecycle().c(new c(this, 0));
        getLifecycle().c(new c(this, 2, (char[]) null));
        b.a.a();
        bq.c(this);
        b.b.b("android:support:activity-result", new d(this));
        aVar.a(new e(this));
        this.r = new m.m(new k(this, 1));
        this.s = new m.m(new k(this, 2));
    }

    public m(int i) {
        this();
        this.d = i;
    }

    public final void B(ac acVar) {
        getLifecycle().c(new f(acVar, this));
    }

    public final void C() {
        if (this.b == null) {
            g gVar = (g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this.b = gVar.a;
            }
            if (this.b == null) {
                this.b = new ci();
            }
        }
    }

    public final void D() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ay.h(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        ay.f(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        j.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        ah.c(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        ah.d(decorView5, this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.q
    public androidx.lifecycle.b.c getDefaultViewModelCreationExtras() {
        androidx.lifecycle.b.e eVar = new androidx.lifecycle.b.e(androidx.lifecycle.b.a.a);
        if (getApplication() != null) {
            b bVar = cd.b;
            Application application = getApplication();
            application.getClass();
            eVar.b(bVar, application);
        }
        eVar.b(bq.a, this);
        eVar.b(bq.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            eVar.b(bq.c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.q
    public ce getDefaultViewModelProviderFactory() {
        return (ce) this.r.b();
    }

    @Override // androidx.t.h
    public final androidx.t.e getSavedStateRegistry() {
        return this.g.b;
    }

    @Override // androidx.lifecycle.cj
    public final ci getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        C();
        ci ciVar = this.b;
        ciVar.getClass();
        return ciVar;
    }

    @Override // androidx.activity.ae
    public final ac gq() {
        return (ac) this.s.b();
    }

    @Override // androidx.activity.result.i
    public final androidx.activity.result.h gr() {
        return this.h;
    }

    @Override // androidx.core.h.s
    public final void iA(androidx.core.h.u uVar) {
        uVar.getClass();
        this.f36a.a(uVar);
    }

    @Override // android.support.v4.app.cn
    public final void iB(androidx.core.g.b bVar) {
        bVar.getClass();
        this.n.remove(bVar);
    }

    @Override // androidx.core.content.d
    public final void k(androidx.core.g.b bVar) {
        bVar.getClass();
        this.l.add(bVar);
    }

    @Override // androidx.core.content.c
    public final void lf(androidx.core.g.b bVar) {
        bVar.getClass();
        this.aaJ.add(bVar);
    }

    @Override // android.support.v4.app.cm
    public final void lg(androidx.core.g.b bVar) {
        bVar.getClass();
        this.m.add(bVar);
    }

    @Override // android.support.v4.app.cn
    public final void lh(androidx.core.g.b bVar) {
        bVar.getClass();
        this.n.add(bVar);
    }

    @Override // androidx.core.h.s
    public final void m(androidx.core.h.u uVar) {
        uVar.getClass();
        this.f36a.d(uVar);
    }

    @Override // androidx.core.content.c
    public final void n(androidx.core.g.b bVar) {
        bVar.getClass();
        this.aaJ.remove(bVar);
    }

    @Override // android.support.v4.app.cm
    public final void o(androidx.core.g.b bVar) {
        bVar.getClass();
        this.m.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @m.a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @m.a
    public void onBackPressed() {
        gq().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.aaJ.iterator();
        while (it.hasNext()) {
            ((androidx.core.g.b) it.next()).accept(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.cu, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.g.a.b(bundle);
        this.f.b(this);
        super.onCreate(bundle);
        int i = bi.b;
        bg.d(this);
        int i2 = this.d;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.f36a.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f36a.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @m.a
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((androidx.core.g.b) it.next()).accept(new co(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((androidx.core.g.b) it.next()).accept(new co(z));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((androidx.core.g.b) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.f36a.a.iterator();
        while (it.hasNext()) {
            ((androidx.core.h.u) it.next()).b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @m.a
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((androidx.core.g.b) it.next()).accept(new co(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((androidx.core.g.b) it.next()).accept(new co(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.f36a.c(menu);
        return true;
    }

    @Override // android.app.Activity
    @m.a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ci ciVar = this.b;
        ci ciVar2 = ciVar;
        if (ciVar == null) {
            g gVar = (g) getLastNonConfigurationInstance();
            ciVar2 = ciVar;
            if (gVar != null) {
                ciVar2 = gVar.a;
            }
        }
        if (ciVar2 == null) {
            return null;
        }
        g gVar2 = new g();
        gVar2.a = ciVar2;
        return gVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.cu, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof ag) {
            w lifecycle = getLifecycle();
            lifecycle.getClass();
            ((ag) lifecycle).g(v.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.g.a(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((androidx.core.g.b) it.next()).accept(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // androidx.core.content.d
    public final void q(androidx.core.g.b bVar) {
        bVar.getClass();
        this.l.remove(bVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (androidx.tracing.a.c()) {
                androidx.tracing.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            t y = y();
            synchronized (y.a) {
                y.b = true;
                Iterator it = y.c.iterator();
                while (it.hasNext()) {
                    ((m.h.a.a) it.next()).a();
                }
                y.c.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        D();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        D();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @m.a
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @m.a
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @m.a
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @m.a
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final t y() {
        return (t) this.c.b();
    }

    public final androidx.activity.result.b z(androidx.activity.result.a.b bVar, androidx.activity.result.a aVar) {
        aVar.getClass();
        androidx.activity.result.h hVar = this.h;
        hVar.getClass();
        return hVar.b("activity_rq#" + this.e.getAndIncrement(), this, bVar, aVar);
    }
}
