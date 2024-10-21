package androidx.work.impl.a.b;

import android.content.Context;
import androidx.work.impl.utils.b.b;
import java.util.LinkedHashSet;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/i.class */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f171a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final b e;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(Context context, b bVar) {
        this.e = bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f171a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !h.a.a.p.b.a.f.h(obj2, obj)) {
                this.d = obj;
                this.e.d.execute(new h(t.N(this.c), this));
            }
        }
    }
}
