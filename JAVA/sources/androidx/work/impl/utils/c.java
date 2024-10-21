package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.av;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/c.class */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f217a;
    public final String b;
    public final av c;
    private final int d;

    public /* synthetic */ c(WorkDatabase workDatabase, String str, av avVar, int i) {
        this.d = i;
        this.f217a = workDatabase;
        this.b = str;
        this.c = avVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            Iterator it = this.f217a.J().k(this.b).iterator();
            while (it.hasNext()) {
                o.l(this.c, (String) it.next());
            }
        } else {
            Iterator it2 = this.f217a.J().l(this.b).iterator();
            while (it2.hasNext()) {
                o.l(this.c, (String) it2.next());
            }
        }
    }
}
