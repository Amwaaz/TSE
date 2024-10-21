package androidx.work.impl.utils.b;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.l;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ac;
import kotlinx.coroutines.dc;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/b/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final l f216a;
    public final ac b;
    final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new a(this);

    public b(Executor executor) {
        l lVar = new l(executor);
        this.f216a = lVar;
        this.b = dc.m(lVar);
    }
}
