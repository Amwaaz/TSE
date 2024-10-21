package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.af;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/n.class */
public final class n extends f {
    public n(Context context, b bVar) {
        super(context, bVar);
    }

    @Override // androidx.work.impl.a.b.f
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    @Override // androidx.work.impl.a.b.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r4 = this;
            r0 = r4
            android.content.IntentFilter r0 = r0.a()
            r8 = r0
            r0 = r4
            android.content.Context r0 = r0.f171a
            r1 = 0
            r2 = r8
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r8
            java.lang.String r0 = r0.getAction()
            if (r0 != 0) goto L28
            r0 = r7
            r6 = r0
            goto L62
        L28:
            r0 = r8
            java.lang.String r0 = r0.getAction()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L60
            r0 = r8
            int r0 = r0.hashCode()
            r5 = r0
            r0 = r5
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L58
            r0 = r5
            r1 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r0 == r1) goto L49
            goto L60
        L49:
            r0 = r7
            r6 = r0
            r0 = r8
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L60
        L58:
            r0 = r8
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L60:
            r0 = 0
            r6 = r0
        L62:
            r0 = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.a.b.n.b():java.lang.Object");
    }

    @Override // androidx.work.impl.a.b.f
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        af.a().c(o.a, "Received ".concat(String.valueOf(intent.getAction())));
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    f(false);
                }
            } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                f(true);
            }
        }
    }
}
