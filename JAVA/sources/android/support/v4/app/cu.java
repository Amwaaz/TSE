package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.h.ar;
import androidx.core.h.bc;
import androidx.core.h.r;
import androidx.d.bk;
import androidx.lifecycle.ae;
import androidx.lifecycle.ag;
import androidx.lifecycle.bg;
import androidx.lifecycle.bi;
import androidx.lifecycle.v;
import androidx.lifecycle.w;

/* loaded from: classes-dex2jar.jar:android/support/v4/app/cu.class */
public class cu extends Activity implements ae, r {
    private final ag aaK;

    public cu() {
        new bk(0);
        this.aaK = new ag(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = bc.a;
        return ar.h(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = bc.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.ae
    public w getLifecycle() {
        return this.aaK;
    }

    @Override // androidx.core.h.r
    public final boolean l(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = bi.b;
        bg.d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.aaK.g(v.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
