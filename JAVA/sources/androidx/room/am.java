package androidx.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.dc;
import m.h.b.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/am.class */
public final /* synthetic */ class am extends m.h.b.k implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f90a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(Object obj, int i) {
        super(0, obj, ao.class, "onClosed", "onClosed()V", 0);
        this.f90a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(Object obj, int i, byte[] bArr) {
        super(0, obj, u.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        this.f90a = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, androidx.u.a.g] */
    public final /* synthetic */ Object a() {
        if (this.f90a == 0) {
            ao aoVar = (ao) this.e;
            kotlinx.coroutines.ag agVar = aoVar.b;
            kotlinx.coroutines.ag agVar2 = agVar;
            if (agVar == null) {
                m.b("coroutineScope");
                agVar2 = null;
            }
            dc.C(agVar2, (CancellationException) null);
            aoVar.N().c();
            a aVar = aoVar.l;
            if (aVar == null) {
                m.b("connectionManager");
                aVar = null;
            }
            aVar.e.f110a.f111a.close();
            return m.w.a;
        }
        u uVar = (u) this.e;
        synchronized (uVar.k) {
            ReentrantLock reentrantLock = uVar.e;
            reentrantLock.lock();
            try {
                List N = m.a.t.N(uVar.d.keySet());
                reentrantLock.unlock();
                ArrayList arrayList = new ArrayList();
                for (Object obj : N) {
                    if (!((q) obj).a()) {
                        arrayList.add(obj);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                if (uVar.j != null && isEmpty) {
                    uVar.c();
                }
                ab abVar = uVar.c.b;
                ReentrantLock reentrantLock2 = abVar.f83a;
                reentrantLock2.lock();
                try {
                    boolean[] zArr = abVar.c;
                    Arrays.fill(zArr, 0, zArr.length, false);
                    abVar.d = true;
                } finally {
                    reentrantLock2.unlock();
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return m.w.a;
    }
}
