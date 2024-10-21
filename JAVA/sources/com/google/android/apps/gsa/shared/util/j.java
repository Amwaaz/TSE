package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/j.class */
public final class j {

    /* renamed from: a */
    private final Context f1558a;
    private final Object b = new Object();
    private Boolean c;
    private Boolean d;

    public j(Context context) {
        this.f1558a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r0.booleanValue() != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.b
            r9 = r0
            r0 = r9
            monitor-enter(r0)
            r0 = r4
            java.lang.Boolean r0 = r0.c     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L66
            r0 = r4
            android.content.Context r0 = r0.f1558a     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L73
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> L73
            r10 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r10
            if (r0 == 0) goto L5e
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r1 = "isVoiceCapable"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L34 java.lang.Throwable -> L73
            r8 = r0
            goto L39
        L34:
            r8 = move-exception
            r0 = 0
            r8 = r0
        L39:
            r0 = r8
            if (r0 == 0) goto L5c
            r0 = r8
            r1 = r10
            r2 = 0
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L7b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L7b
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5c
            r0 = r8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L7b java.lang.Throwable -> L7b java.lang.Throwable -> L7b
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L5e
        L5c:
            r0 = 1
            r5 = r0
        L5e:
            r0 = r4
            r1 = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L73
            r0.c = r1     // Catch: java.lang.Throwable -> L73
        L66:
            r0 = r4
            java.lang.Boolean r0 = r0.c     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            r5 = r0
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            r0 = r5
            return r0
        L73:
            r8 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            r0 = r8
            throw r0
        L7b:
            r8 = move-exception
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.j.a():boolean");
    }

    public final boolean b() {
        boolean booleanValue;
        Object obj = this.b;
        PackageManager packageManager = this.f1558a.getPackageManager();
        synchronized (obj) {
            if (this.d == null) {
                this.d = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
            }
            booleanValue = this.d.booleanValue();
        }
        return booleanValue;
    }
}
