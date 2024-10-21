package androidx.work;

import android.net.Uri;
import androidx.work.impl.utils.f;
import java.util.LinkedHashSet;
import java.util.Set;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f167a;
    public boolean b;
    public boolean d;
    public boolean e;
    public f c = new f(null);
    public int h = 1;
    public long f = -1;
    public long g = -1;
    private final Set i = new LinkedHashSet();

    public final g a() {
        Set W = t.W(this.i);
        return new g(this.c, this.h, this.f167a, this.b, this.d, this.e, this.f, this.g, W);
    }

    public final void b(Uri uri, boolean z) {
        uri.getClass();
        this.i.add(new f(uri, z));
    }

    public final void c(int i) {
        this.h = i;
        this.c = new f(null);
    }
}
