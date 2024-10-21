package com.google.android.apps.gsa.shared.v;

import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.common.base.cl;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/v/d.class */
public final class d implements b {
    private final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1577a = new Object();
    private final Queue i = new ArrayDeque();
    public final Queue b = new ArrayDeque();
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicInteger m = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger n = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);
    public final Map g = null;

    public final c a(ByteBuffer byteBuffer) {
        f.e(byteBuffer.isDirect());
        f.e(byteBuffer.position() > 0);
        f.e(byteBuffer.limit() == 32768);
        byteBuffer.flip();
        this.n.incrementAndGet();
        this.o.addAndGet(byteBuffer.remaining());
        return new c(this, byteBuffer);
    }

    public final ByteBuffer b() {
        ByteBuffer byteBuffer;
        synchronized (this.h) {
            byteBuffer = (ByteBuffer) this.i.poll();
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer == null) {
            byteBuffer2 = ByteBuffer.allocateDirect(32768);
        }
        cl.v(byteBuffer2.isDirect(), "");
        cl.v(byteBuffer2.capacity() == 32768, "");
        cl.v(byteBuffer2.position() == 0, "");
        cl.v(byteBuffer2.limit() == 32768, "");
        this.j.incrementAndGet();
        return byteBuffer2;
    }

    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() == 32768 && byteBuffer.isDirect()) {
            this.l.incrementAndGet();
        } else {
            this.m.incrementAndGet();
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() != 32768 || !byteBuffer.isDirect()) {
            this.m.incrementAndGet();
            return;
        }
        byteBuffer.clear();
        synchronized (this.h) {
            if (this.i.size() < 28) {
                this.i.add(byteBuffer);
                this.k.incrementAndGet();
            } else {
                this.l.incrementAndGet();
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        int size;
        int size2;
        fVar.q("ChunkPool");
        synchronized (this.h) {
            size = this.i.size();
        }
        fVar.s("Buffers: %d in pool, %d obtained, %d recycled, %d discarded, %d invalid.", new e[]{new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(size), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.j.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.k.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.l.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.m.get()), false)});
        synchronized (this.f1577a) {
            size2 = this.b.size();
        }
        fVar.s("Arrays: %d in pool, %d obtained, %d recycled, %d discarded, %d invalid.", new e[]{new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(size2), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.c.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.d.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.e.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f.get()), false)});
        fVar.s("Chunks: %d, %.2f utilization rate.", new e[]{new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.n.get()), false), new com.google.android.apps.gsa.shared.util.b.d(Double.valueOf(this.o.get() / (this.n.get() * 32768.0d)), false)});
    }
}
