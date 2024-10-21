package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/morris2/framework/b.class */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a f1779a;
    public final Map b;
    public final cr c;
    public List d;
    private final com.google.android.libraries.assistant.auto.tng.morris.framework.a e;
    private final com.google.android.libraries.assistant.auto.tng.morris.framework.a f;
    private final com.google.android.libraries.assistant.auto.tng.morris.framework.a g;

    public b(c cVar, Map map, a aVar, cr crVar) {
        this.e = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a(cVar);
        this.f = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a(cVar);
        this.g = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a(cVar);
        this.f1779a = aVar;
        this.c = crVar;
        this.b = map;
    }

    public final /* synthetic */ void a() {
    }

    public final /* synthetic */ void b() {
    }

    public final /* synthetic */ void c() {
    }

    public final void d() {
        List list = this.d;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cn) it.next()).cancel(true);
        }
        this.d = null;
    }

    public final /* synthetic */ void e() {
    }

    public final /* synthetic */ void f() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r7.n != 12) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        if (r7.n != 11) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f6, code lost:
    
        if (r7.n != 9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02ac, code lost:
    
        if (r7.n != 7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d2, code lost:
    
        if (r7.n != 6) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x00b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:89:0x0362. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.libraries.assistant.auto.tng.morris.e.ek r7) {
        /*
            Method dump skipped, instructions count: 1771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.g(com.google.android.libraries.assistant.auto.tng.morris.e.ek):boolean");
    }
}
