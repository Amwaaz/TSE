package com.google.android.apps.gsa.publicsearch;

import android.content.Context;
import com.google.apps.tiktok.i.x;
import com.google.common.base.ca;
import com.google.common.base.cl;
import j$.util.Map;
import j$.util.function.BiConsumer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1039a;
    public e.a b;
    public Map c;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final Map d = new HashMap();

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/k$a.class */
    public interface a {
        void ZV(k kVar);
    }

    public k(Context context) {
        this.f1039a = context;
    }

    public final void a() {
        synchronized (this) {
            if (this.e.getAndSet(true)) {
                return;
            }
            ((a) x.c(this.f1039a, a.class)).ZV(this);
            Map._EL.forEach(this.c, new BiConsumer(this) { // from class: com.google.android.apps.gsa.publicsearch.h

                /* renamed from: a, reason: collision with root package name */
                public final k f1036a;

                {
                    this.f1036a = this;
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    final k.a.a aVar = (k.a.a) obj2;
                    aVar.getClass();
                    final ca d = cl.d(new ca(aVar) { // from class: com.google.android.apps.gsa.publicsearch.i

                        /* renamed from: a, reason: collision with root package name */
                        public final k.a.a f1037a;

                        {
                            this.f1037a = aVar;
                        }

                        public final Object a() {
                            return (com.google.android.apps.gsa.publicsearch.a.a) this.f1037a.a();
                        }
                    });
                    d.getClass();
                    e.a aVar2 = new e.a(d) { // from class: com.google.android.apps.gsa.publicsearch.j

                        /* renamed from: a, reason: collision with root package name */
                        public final ca f1038a;

                        {
                            this.f1038a = d;
                        }

                        public final Object a() {
                            return (com.google.android.apps.gsa.publicsearch.a.a) this.f1038a.a();
                        }
                    };
                    this.f1036a.d.put((String) obj, aVar2);
                }

                @Override // java.util.function.BiConsumer
                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer._CC.$default$andThen(this, biConsumer);
                }
            });
        }
    }
}
