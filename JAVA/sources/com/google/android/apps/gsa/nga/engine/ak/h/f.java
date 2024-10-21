package com.google.android.apps.gsa.nga.engine.ak.h;

import android.database.ContentObserver;
import android.provider.ContactsContract;
import android.util.LruCache;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/h/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final fl f430a = fl.t(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, ContactsContract.Contacts.CONTENT_URI, ContactsContract.Data.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI, ContactsContract.CommonDataKinds.Email.CONTENT_URI);
    public final LruCache c;
    public final LruCache d;
    public final LruCache e;
    public final LruCache f;
    public final LruCache g;
    public final LruCache h;
    public final LruCache i;
    public final LruCache j;
    public final LruCache k;
    public final LruCache l;
    public final LruCache m;
    public final LruCache n;
    public final LruCache o;
    public final ap p;
    public final h q;
    private final LruCache s;
    private final a t;
    private final AtomicInteger v;
    public final ContentObserver b = new c(this);
    private final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public f(a aVar, ap apVar, h hVar) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.v = atomicInteger;
        this.c = new LruCache(atomicInteger.get());
        this.d = new LruCache(atomicInteger.get());
        this.e = new LruCache(atomicInteger.get());
        this.f = new LruCache(atomicInteger.get());
        this.g = new LruCache(atomicInteger.get());
        this.h = new LruCache(atomicInteger.get());
        this.i = new LruCache(atomicInteger.get());
        this.j = new LruCache(atomicInteger.get());
        this.k = new LruCache(atomicInteger.get());
        this.l = new LruCache(atomicInteger.get());
        this.m = new LruCache(atomicInteger.get());
        this.n = new LruCache(atomicInteger.get());
        this.o = new LruCache(atomicInteger.get());
        this.s = new LruCache(atomicInteger.get());
        this.t = aVar;
        this.p = apVar;
        this.q = hVar;
    }

    private final void d(int i) {
        if (i == this.v.get()) {
            return;
        }
        this.v.set(i);
        this.c.resize(i);
        this.d.resize(i);
        this.e.resize(i);
        this.f.resize(i);
        this.g.resize(i);
        this.h.resize(i);
        this.i.resize(i);
        this.j.resize(i);
        this.k.resize(i);
        this.l.resize(i);
        this.m.resize(i);
        this.n.resize(i);
        this.o.resize(i);
        this.s.resize(i);
    }

    public final Object a(LruCache lruCache, Object obj, e eVar) {
        if (!this.u.get()) {
            return eVar.a();
        }
        Object obj2 = lruCache.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object a2 = eVar.a();
        lruCache.put(obj, a2);
        return a2;
    }

    public final void b() {
        this.c.evictAll();
        this.d.evictAll();
        this.e.evictAll();
        this.f.evictAll();
        this.g.evictAll();
        this.h.evictAll();
        this.i.evictAll();
        this.j.evictAll();
        this.k.evictAll();
        this.l.evictAll();
        this.m.evictAll();
        this.n.evictAll();
        this.o.evictAll();
        this.s.evictAll();
    }

    public final void c() {
        int d = (int) this.t.d(eu.S);
        if (d > 0 && this.r.get()) {
            this.u.set(true);
            d(d);
        } else if (this.u.compareAndSet(true, false)) {
            b();
            d(1);
        }
    }
}
