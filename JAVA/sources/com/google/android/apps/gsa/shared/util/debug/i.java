package com.google.android.apps.gsa.shared.util.debug;

import com.google.android.apps.gsa.shared.util.debug.a.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/debug/i.class */
final class i {

    /* renamed from: a */
    public final i f1555a;
    public long b;
    public List c;
    private final String d;
    private final long e;

    public i(String str, long j, i iVar) {
        this.d = str;
        this.e = j;
        this.f1555a = iVar;
    }

    public final void a(f fVar, long j) {
        Object valueOf;
        long j2 = this.b;
        if (j2 == 0) {
            valueOf = (j - this.e) + "+";
        } else {
            valueOf = Long.valueOf(j2 - this.e);
        }
        fVar.b(this.d).a(new com.google.android.apps.gsa.shared.util.b.d(valueOf.toString(), false));
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(fVar.d((Object) null), j);
            }
        }
    }
}
