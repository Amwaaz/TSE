package com.google.android.apps.gsa.speech.k.b.c;

import android.content.Context;
import android.util.LruCache;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.speech.o.g;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.cq;
import e.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/c/e.class */
public class e implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1603a = j.i("com.google.android.apps.gsa.speech.k.b.c.e");
    private static LruCache u;
    public final Context b;
    public boolean i;
    public boolean k;
    String l;
    public final com.google.android.apps.gsa.shared.k.c n;
    public final a o;
    public final a p;
    public final cq q;
    public final Executor r;
    private final h v;
    private final a w;
    private final g y;
    private String x = null;
    com.google.android.apps.gsa.shared.speech.hotword.b.c c = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE;
    public String d = null;
    public byte[] e = null;
    public byte[] f = null;
    public byte[] g = null;
    public byte[] h = null;
    public d j = null;
    public int s = 1;
    public int t = 1;
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();

    public e(Context context, h hVar, g gVar, a aVar, com.google.android.apps.gsa.shared.k.c cVar, com.google.android.apps.gsa.shared.util.debug.d dVar, a aVar2, a aVar3, cq cqVar, Executor executor) {
        this.b = context;
        this.v = hVar;
        this.y = gVar;
        this.w = aVar;
        if (u == null) {
            u = new LruCache(true != ar.r(context) ? 10 : 2);
        }
        this.n = cVar;
        this.o = aVar2;
        this.p = aVar3;
        this.q = cqVar;
        this.r = executor;
        dVar.a(this);
    }

    private static String i(com.google.android.apps.gsa.shared.speech.hotword.b.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.d;
    }

    private final com.google.android.apps.gsa.shared.speech.hotword.b.a j(String str) {
        if (str == null) {
            return null;
        }
        return (com.google.android.apps.gsa.shared.speech.hotword.b.a) ((com.google.android.apps.gsa.speech.hotword.b.a) this.w.a()).a().get(com.google.android.apps.gsa.speech.hotword.d.b.getOrDefault(str, ""));
    }

    public final String a(String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        com.google.android.apps.gsa.shared.speech.hotword.b.a aVar = (com.google.android.apps.gsa.shared.speech.hotword.b.a) ((com.google.android.apps.gsa.speech.hotword.b.a) this.w.a()).a().get(str);
        if (aVar != null) {
            com.google.common.f.h d = f1603a.d();
            d.aj(com.google.common.f.a.e.a, "MicroDataManager");
            com.google.common.f.h hVar = d;
            hVar.ak(10059);
            hVar.N("Location for model with model type: %s and locale: %s, is : %s", cVar, str, aVar.d);
            return aVar.d;
        }
        j jVar = f1603a;
        com.google.common.f.h d2 = jVar.d();
        d2.aj(com.google.common.f.a.e.a, "MicroDataManager");
        com.google.common.f.h hVar2 = d2;
        hVar2.ak(10057);
        hVar2.s("locale is %s", str);
        com.google.android.apps.gsa.shared.speech.hotword.b.a j = j(str);
        com.google.common.f.h e = jVar.e();
        e.aj(com.google.common.f.a.e.a, "MicroDataManager");
        com.google.common.f.h hVar3 = e;
        hVar3.ak(10058);
        hVar3.O("Location of model with model type: %s and locale: %s is null. HotwordLocaleConfig for re-mapped Chinese locale is null: %b, and getLocationForReMappedLocale is %s", cVar.name(), str, Boolean.valueOf(j == null), i(j));
        return null;
    }

    public final void b(String str, Runnable runnable, boolean z, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        synchronized (this) {
            ab abVar = com.google.common.f.a.e.a;
            if (!z && str.equals(this.x) && cVar == this.c && f()) {
                if (this.i) {
                    this.m.add(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            d dVar = this.j;
            if (dVar != null) {
                com.google.common.f.h d = f1603a.d();
                d.aj(com.google.common.f.a.e.a, "MicroDataManager");
                com.google.common.f.h hVar = d;
                hVar.ak(10061);
                hVar.p("Cancelling previous initialization task.");
                dVar.d = true;
            }
            if (z) {
                u.evictAll();
                this.t = 3;
            }
            this.e = null;
            this.s = 2;
            this.d = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.x = str;
            this.c = cVar;
            this.i = true;
            this.m.clear();
            this.m.add(runnable);
            d dVar2 = new d(this, str, cVar);
            this.j = dVar2;
            this.v.n(dVar2.f1602a, dVar2);
        }
    }

    public final boolean c(String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        synchronized (this) {
            boolean e = e(str, cVar);
            if (this.e == null) {
                com.google.common.f.h e2 = f1603a.e();
                e2.aj(com.google.common.f.a.e.a, "MicroDataManager");
                com.google.common.f.h hVar = e2;
                hVar.ak(10063);
                hVar.N("Both hotwordModel and googleHotwordData are null! sourceLocationOfCurrentHotwordModel is %s, modelLocationForLocale(locale, modelType) is %s, paramsForCurrentGoogleHotwordData is %s ", this.d, a(str, cVar), (Object) null);
            }
            boolean z = false;
            if (e) {
                if (this.e == null) {
                    return false;
                }
                z = true;
            }
            return z;
        }
    }

    public final boolean e(String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        synchronized (this) {
            boolean equals = str.equals(this.x);
            com.google.android.apps.gsa.shared.speech.hotword.b.c cVar2 = this.c;
            ab abVar = com.google.common.f.a.e.a;
            return !this.i && equals && cVar == cVar2;
        }
    }

    public final boolean f() {
        String str;
        synchronized (this) {
            String str2 = this.d;
            if (str2 == null || (str = this.x) == null) {
                com.google.common.f.h f = f1603a.f();
                f.aj(com.google.common.f.a.e.a, "MicroDataManager");
                com.google.common.f.h hVar = f;
                hVar.ak(10065);
                hVar.O("isInitializedWithLatestHotwordModel is false sourceLocationOfCurrentHotwordModel is %s, locale is %s, hotwordModel is null %b, googleHotwordData is null %b ", this.d, this.x, Boolean.valueOf(this.e == null), true);
                return false;
            }
            if (str2.equals(a(str, this.c))) {
                return true;
            }
            com.google.common.f.h d = f1603a.d();
            d.aj(com.google.common.f.a.e.a, "MicroDataManager");
            com.google.common.f.h hVar2 = d;
            hVar2.ak(10066);
            String str3 = this.d;
            String str4 = this.x;
            str4.getClass();
            String a2 = a(str4, this.c);
            boolean z = this.e == null;
            int i = this.s;
            String a3 = a.a(i);
            if (i == 0) {
                throw null;
            }
            int i2 = this.t;
            String b = a.b(i2);
            if (i2 == 0) {
                throw null;
            }
            hVar2.Q("sourceLocationOfCurrentHotwordModel is %s, modelLocationForLocale(locale, modelType) is %s, hotwordModel is null %b, googleHotwordData is null %b , howDidWeGetHotwordModel: %s,  howDidWeGetGoogleHotwordData: %s", str3, a2, Boolean.valueOf(z), true, a3, b);
            return false;
        }
    }

    public final byte[] g(String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        byte[] bArr;
        synchronized (this) {
            ab abVar = com.google.common.f.a.e.a;
            cl.u(e(str, cVar));
            bArr = this.f;
        }
        return bArr;
    }

    public final com.google.android.apps.gsa.speech.k.b.a h(String str) {
        int i;
        synchronized (this) {
            com.google.android.apps.gsa.shared.speech.hotword.b.a aVar = (com.google.android.apps.gsa.shared.speech.hotword.b.a) ((com.google.android.apps.gsa.speech.hotword.b.a) this.w.a()).a().get(str);
            if (aVar == null) {
                com.google.common.f.h d = f1603a.d();
                d.aj(com.google.common.f.a.e.a, "MicroDataManager");
                com.google.common.f.h hVar = d;
                hVar.ak(10040);
                hVar.s("Hotword configuration not present for the given locale %s", str);
                return com.google.android.apps.gsa.speech.k.b.a.b;
            }
            String str2 = aVar.e;
            com.google.android.apps.gsa.shared.speech.hotword.b.c a2 = com.google.android.apps.gsa.shared.speech.hotword.b.c.a(aVar.g);
            com.google.android.apps.gsa.shared.speech.hotword.b.c cVar = a2;
            if (a2 == null) {
                cVar = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE;
            }
            boolean z = aVar.f;
            ab abVar = com.google.common.f.a.e.a;
            if (!e(str, cVar)) {
                i = 0;
            } else {
                if (this.e == null) {
                    return new com.google.android.apps.gsa.speech.k.b.a(aVar.e, 2, z, cVar);
                }
                i = 1;
            }
            return new com.google.android.apps.gsa.speech.k.b.a(str2, i, z, cVar);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q(getClass().getSimpleName());
        if (this.y != null) {
            com.google.android.apps.gsa.shared.util.debug.a.e b = fVar.b("Speaker model present=");
            g gVar = this.y;
            b.a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(gVar.g(gVar.q()) != null), false));
        }
        synchronized (this) {
            fVar.b("Last known locale=").a(new com.google.android.apps.gsa.shared.util.b.d(this.x, false));
            fVar.b("re-mapped Chinese locale=").a(new com.google.android.apps.gsa.shared.util.b.d((CharSequence) com.google.android.apps.gsa.speech.hotword.d.b.getOrDefault(this.x, ""), false));
            fVar.b("Last known model type=").a(new com.google.android.apps.gsa.shared.util.b.d(this.c, false));
            fVar.b("Hotword model present=").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.e != null), false));
            com.google.android.apps.gsa.shared.util.debug.a.e b2 = fVar.b("How did we get hotword model=");
            int i = this.s;
            String a2 = a.a(i);
            if (i == 0) {
                throw null;
            }
            b2.a(new com.google.android.apps.gsa.shared.util.b.d(a2, false));
            com.google.android.apps.gsa.shared.util.debug.a.e b3 = fVar.b("How did we get hotword data=");
            int i2 = this.t;
            String b4 = a.b(i2);
            if (i2 == 0) {
                throw null;
            }
            b3.a(new com.google.android.apps.gsa.shared.util.b.d(b4, false));
            fVar.b("model location config is null").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(!((com.google.android.apps.gsa.speech.hotword.b.a) this.w.a()).a().containsKey(this.x)), false));
            if (this.x != null) {
                com.google.android.apps.gsa.shared.util.debug.a.e b5 = fVar.b("model location is null=");
                String str = this.x;
                str.getClass();
                b5.a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(a(str, this.c) == null), false));
                com.google.android.apps.gsa.shared.util.debug.a.e b6 = fVar.b("mdd group name =");
                String str2 = this.x;
                str2.getClass();
                b6.a(new com.google.android.apps.gsa.shared.util.b.d(com.google.android.apps.gsa.speech.hotword.d.a(str2, this.c), false));
            }
            fVar.b("model location for re-mapped locale is null=").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(i(j(this.x)) == null), false));
            fVar.b("model location config for re-mapped locale is null=").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(j(this.x) == null), false));
            fVar.b("locale remap happened =").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.k), false));
            fVar.b("hotword model error =").a(new com.google.android.apps.gsa.shared.util.b.d(this.l, false));
        }
    }
}
