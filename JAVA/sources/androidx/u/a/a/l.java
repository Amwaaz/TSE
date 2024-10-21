package androidx.u.a.a;

import android.content.Context;
import androidx.u.a.c;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/l.class */
public final class l implements androidx.u.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f152a;
    public final String b;
    public final c c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final m.e g = new m.m(new k(this));

    public l(Context context, String str, c cVar, boolean z, boolean z2) {
        this.f152a = context;
        this.b = str;
        this.c = cVar;
        this.d = z;
        this.e = z2;
    }

    private final j a() {
        return (j) this.g.b();
    }

    @Override // androidx.u.a.g
    public final androidx.u.a.b b() {
        return a().b();
    }

    @Override // androidx.u.a.g
    public final String c() {
        return this.b;
    }

    @Override // androidx.u.a.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.c()) {
            a().close();
        }
    }

    @Override // androidx.u.a.g
    public final void d(boolean z) {
        if (this.g.c()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
