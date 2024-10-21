package androidx.b.a.a;

import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/b/a/a/b.class */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f37a = new a();
    private static volatile b c;
    public final e b;
    private final e d;

    private b() {
        d dVar = new d();
        this.d = dVar;
        this.b = dVar;
    }

    public static b a() {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
