package android.support.v7.app;

import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:android/support/v7/app/t.class */
final class t implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
