package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.m;
import androidx.lifecycle.ag;
import androidx.lifecycle.u;
import androidx.lifecycle.v;

/* loaded from: classes-dex2jar.jar:android/support/v4/app/ak.class */
public class ak extends m {

    /* renamed from: a, reason: collision with root package name */
    public final an f33a;
    final ag b;
    boolean c;
    boolean d;
    boolean e;

    public ak() {
        this.f33a = new an(new aj(this));
        this.b = new ag(this);
        this.e = true;
        r();
    }

    public ak(int i) {
        super(i);
        this.f33a = new an(new aj(this));
        this.b = new ag(this);
        this.e = true;
        r();
    }

    private static boolean gw(bk bkVar, v vVar) {
        boolean z = false;
        for (ag agVar : bkVar.c.i()) {
            if (agVar != null) {
                boolean z2 = z;
                if (agVar.getHost() != null) {
                    z2 = z | gw(agVar.getChildFragmentManager(), vVar);
                }
                cf cfVar = agVar.mViewLifecycleOwner;
                z = z2;
                if (cfVar != null) {
                    cfVar.a();
                    z = z2;
                    if (cfVar.a.c.a(v.STARTED)) {
                        agVar.mViewLifecycleOwner.a.g(vVar);
                        z = true;
                    }
                }
                if (agVar.mLifecycleRegistry.c.a(v.STARTED)) {
                    agVar.mLifecycleRegistry.g(vVar);
                    z = true;
                }
            }
        }
        return z;
    }

    private final void r() {
        this.g.b.b("android:support:lifecycle", new au(this, 1));
        lf(new ah(this, 1));
        this.i.add(new ah(this, 0));
        this.f.a(new ai(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r0.equals("--list-dumpables") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ak.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    final void iC() {
        do {
        } while (gw(ix(), v.CREATED));
    }

    public final bk ix() {
        return this.f33a.a.e;
    }

    public void iy(ag agVar, Intent intent) {
        agVar.startActivityForResult(intent, 66, (Bundle) null);
    }

    @Deprecated
    public void iz() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f33a.i();
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.m, android.support.v4.app.cu, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.e(u.ON_CREATE);
        this.f33a.c();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = this.f33a.a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = this.f33a.a((View) null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f33a.d();
        this.b.e(u.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f33a.a.e.X(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.d = false;
        this.f33a.e();
        this.b.e(u.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.b.e(u.ON_RESUME);
        this.f33a.f();
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f33a.i();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.f33a.i();
        super.onResume();
        this.d = true;
        this.f33a.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.f33a.i();
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            this.f33a.b();
        }
        this.f33a.k();
        this.b.e(u.ON_START);
        this.f33a.g();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f33a.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.e = true;
        iC();
        this.f33a.h();
        this.b.e(u.ON_STOP);
    }
}
