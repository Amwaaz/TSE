package androidx.room;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes-dex2jar.jar:androidx/room/ab.class */
public final class ab {

    /* renamed from: a */
    public final ReentrantLock f83a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public boolean d;

    public ab(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final boolean a(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.f83a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.d = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.f83a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = (-1) + j;
                if (j == 1) {
                    z = true;
                    this.d = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
