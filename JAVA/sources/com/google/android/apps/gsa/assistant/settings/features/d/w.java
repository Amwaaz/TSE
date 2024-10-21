package com.google.android.apps.gsa.assistant.settings.features.d;

import android.accounts.Account;
import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.gsa.assistant.settings.devices.d.b.l;
import com.google.android.apps.gsa.assistant.settings.shared.f;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.smartspace.g;
import com.google.android.apps.gsa.smartspace.h;
import com.google.android.apps.gsa.smartspace.i;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bo;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.g.ab.a.b.e;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/features/d/w.class */
public final class w implements b, a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f247a = j.i("com.google.android.apps.gsa.assistant.settings.features.d.w");
    public final Context b;
    public final f c;
    public final e.a d;
    public final Optional e;
    public final cr f;
    public final h g;
    public final a h;
    public final g i;
    private final e.a j;
    private final l k;
    private final Set l = new HashSet();

    public w(Context context, e.a aVar, cr crVar, f fVar, e.a aVar2, Optional optional, i iVar, d dVar, l lVar, com.google.android.apps.gsa.shared.util.debug.d dVar2, g gVar) {
        this.b = context;
        this.j = aVar;
        this.f = crVar;
        this.c = fVar;
        this.d = aVar2;
        this.e = optional;
        this.g = iVar.a(gVar);
        e.a b = e.c.c.b(dVar.f246a.a);
        b.getClass();
        cr crVar2 = (cr) dVar.b.a();
        crVar2.getClass();
        this.h = new c(b, crVar2, gVar);
        this.i = gVar;
        this.k = lVar;
        dVar2.a(this);
    }

    public final cn a() {
        return ((cg) this.j.a()).d();
    }

    public final cn b() {
        Account a2 = this.c.a();
        return a2 != null ? com.google.common.util.concurrent.i.g(this.k.a(a2), ex.b(new q(0)), ay.a) : dl.n(Optional.empty());
    }

    public final cn c(e eVar) {
        return com.google.common.util.concurrent.i.g(a(), ex.b(new p(this, eVar)), this.f);
    }

    public final cn e(e eVar, boolean z) {
        ab abVar = com.google.common.f.a.e.a;
        eVar.name();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(com.google.android.apps.search.assistant.verticals.ambient.s.a.c.b.contains(eVar));
        cn a2 = ((cg) this.j.a()).a(new r(this, eVar, z, atomicBoolean2, atomicBoolean), ay.a);
        if (!this.i.b(bc.ae) && !this.i.b(bc.ap)) {
            return a2;
        }
        s sVar = new s(this, eVar, atomicBoolean2, z, atomicBoolean, atomicBoolean3);
        return com.google.common.util.concurrent.i.g(a2, ex.b(sVar), this.f);
    }

    public final void f() {
        synchronized (this) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.g gVar = ((com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.f) it.next()).f1745a;
                com.google.android.apps.gsa.staticplugins.opa.ambient.i.a.b.a(gVar.f1746a, gVar.a(), "onChange.onFailure()", new Object[0]);
            }
        }
    }

    public final boolean g(com.google.android.apps.search.assistant.platform.g.b.a.a aVar, e eVar) {
        ab abVar = com.google.common.f.a.e.a;
        eVar.name();
        switch (eVar.ordinal()) {
            case 2:
                return this.g.e();
            case 3:
                return this.g.h();
            case 4:
                return this.g.f();
            case 5:
                return this.g.i();
            case 6:
                return this.g.m();
            case 7:
                return (aVar.b & 64) == 0 || aVar.j;
            case 8:
                return (aVar.b & 128) == 0 || aVar.k;
            case 9:
            case 36:
                return (aVar.b & 256) == 0 || aVar.l;
            case 10:
                return (aVar.b & 512) == 0 || aVar.m;
            case 11:
                return (aVar.b & 1024) == 0 || aVar.n;
            case 12:
                return (aVar.b & 2048) == 0 || aVar.o;
            case 13:
                return (aVar.b & 4096) == 0 || aVar.p;
            case 14:
                return (aVar.b & 8192) == 0 || aVar.q;
            case 15:
                return (aVar.b & 16384) == 0 || aVar.r;
            case 16:
                return (aVar.b & 32768) == 0 || aVar.s;
            case 17:
                return (aVar.b & 65536) == 0 || aVar.t;
            case 18:
                return (aVar.b & 131072) == 0 || aVar.u;
            case 19:
                return (aVar.b & 262144) == 0 || aVar.v;
            case 20:
                return (aVar.b & 524288) == 0 || aVar.w;
            case 21:
                return (aVar.b & 1048576) == 0 || aVar.x;
            case 22:
                return (aVar.b & 2097152) == 0 || aVar.y;
            case 23:
                return this.g.l();
            case 24:
                return (aVar.b & 8388608) == 0 || aVar.A;
            case 25:
                return m.b(aVar).booleanValue();
            case 26:
                return (aVar.b & 33554432) == 0 || aVar.C;
            case 27:
                return true;
            case 28:
                return (aVar.b & 67108864) == 0 || aVar.D;
            case 29:
                return (aVar.b & 134217728) == 0 || aVar.E;
            case 30:
                return false;
            case 31:
                return this.g.j();
            case 32:
                h hVar = this.g;
                return hVar.g() && hVar.f1584a.b(az.ji) && hVar.b.b("smartspace_birthday_enabled");
            case 33:
                return this.g.k();
            case 34:
            case 35:
            case 44:
            default:
                com.google.common.f.h f = f247a.f();
                f.aj(com.google.common.f.a.e.a, "AmbientOptInHelper");
                com.google.common.f.h hVar2 = f;
                hVar2.ak(530);
                hVar2.q("no case for handling featuretype:%d", eVar.W);
                return true;
            case 37:
                return (aVar.c & 4) == 0 || aVar.K;
            case 38:
                return (aVar.c & 8) == 0 || aVar.L;
            case 39:
                return (aVar.c & 16) == 0 || aVar.M;
            case 40:
                return (aVar.c & 64) == 0 || aVar.N;
            case 41:
                return (aVar.c & 128) == 0 || aVar.O;
            case 42:
                return (aVar.c & 256) == 0 || aVar.P;
            case 43:
                return (aVar.c & 512) == 0 || aVar.Q;
            case 45:
                return (aVar.c & 1024) == 0 || aVar.R;
            case 46:
                return (aVar.c & 2048) == 0 || aVar.S;
            case 47:
                return (aVar.c & 4096) == 0 || aVar.T;
        }
    }

    public final void h(com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.f fVar) {
        synchronized (this) {
            this.l.add(fVar);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("Smartspace Preferences");
        dl.y(((bo) com.google.apps.tiktok.tracing.contrib.c.e.g(((cg) this.j.a()).d())).b, ex.h(new t(this, fVar)), this.f);
        dl.y(((bo) com.google.apps.tiktok.tracing.contrib.c.e.g(b())).b, ex.h(new u(fVar)), this.f);
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Smartspace Preferences: Uber Toggle: " + Settings.Secure.getInt(this.b.getContentResolver(), "smartspace", -1), false));
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Smartspace Preferences: Content Capture Enabled: " + Settings.Secure.getInt(this.b.getContentResolver(), "content_capture_enabled", -1), false));
    }

    public final void i(com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.f fVar) {
        synchronized (this) {
            this.l.remove(fVar);
        }
    }
}
