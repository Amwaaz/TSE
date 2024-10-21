package android.support.v7.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ak;
import android.support.v7.view.c;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ah;
import androidx.core.app.aq;
import androidx.core.app.f;
import androidx.lifecycle.ay;
import androidx.t.j;

/* loaded from: classes-dex2jar.jar:android/support/v7/app/p.class */
public class p extends ak implements q {
    private u aaI;

    public p() {
        gu();
    }

    public p(int i) {
        super(i);
        gu();
    }

    private final void gu() {
        this.g.b.b("androidx:appcompat", new n(this));
        this.f.a(new o(this));
    }

    private final void gv() {
        ay.h(getWindow().getDecorView(), this);
        ay.f(getWindow().getDecorView(), this);
        j.a(getWindow().getDecorView(), this);
        ah.c(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        gv();
        r().d(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r0 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.p.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        al r = r();
        r.J();
        d dVar = r.n;
        if (getWindow().hasFeature(0)) {
            if (dVar == null || !dVar.r()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.app.cu, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        al r = r();
        r.J();
        d dVar = r.n;
        if (keyCode == 82 && dVar != null && dVar.v(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return r().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return r().b();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        r().f();
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r().v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ak, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r().g();
    }

    @Override // android.support.v4.app.ak, androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        al r = r();
        r.J();
        d dVar = r.n;
        if (menuItem.getItemId() != 16908332 || dVar == null || (dVar.a() & 4) == 0) {
            return false;
        }
        return t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        r().I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ak, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        r().h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ak, android.app.Activity
    public void onStart() {
        super.onStart();
        r().i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ak, android.app.Activity
    public void onStop() {
        super.onStop();
        r().j();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        r().r(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        al r = r();
        r.J();
        d dVar = r.n;
        if (getWindow().hasFeature(0)) {
            if (dVar == null || !dVar.w()) {
                super.openOptionsMenu();
            }
        }
    }

    public final u r() {
        if (this.aaI == null) {
            int i = u.b;
            this.aaI = new al(this, (Window) null, this, this);
        }
        return this.aaI;
    }

    @Override // android.support.v7.app.q
    public void s(c cVar) {
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(int i) {
        gv();
        r().l(i);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view) {
        gv();
        r().m(view);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        gv();
        r().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        r().F = i;
    }

    public boolean t() {
        Intent b = f.b(this);
        if (b == null) {
            return false;
        }
        if (!shouldUpRecreateTask(b)) {
            navigateUpTo(b);
            return true;
        }
        aq aqVar = new aq(this);
        Intent b2 = f.b(this);
        Intent intent = b2;
        if (b2 == null) {
            intent = f.b(this);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            ComponentName componentName = component;
            if (component == null) {
                componentName = intent.resolveActivity(aqVar.b.getPackageManager());
            }
            aqVar.b(componentName);
            aqVar.a.add(intent);
        }
        aqVar.c();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException e) {
            finish();
            return true;
        }
    }

    protected void u() {
    }

    protected void v() {
    }

    @Override // android.support.v7.app.q
    public final c w() {
        return null;
    }

    @Override // android.support.v7.app.q
    public void x() {
    }
}
