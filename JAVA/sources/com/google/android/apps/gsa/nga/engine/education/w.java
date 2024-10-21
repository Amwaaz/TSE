package com.google.android.apps.gsa.nga.engine.education;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.engine.ae.ab;
import com.google.android.apps.gsa.nga.engine.education.a.s;
import com.google.android.apps.gsa.nga.engine.education.b.o;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.aa.a.k;
import com.google.android.apps.gsa.nga.shared.ae.a.a.at;
import com.google.android.apps.gsa.nga.shared.ae.a.a.au;
import com.google.android.apps.gsa.nga.shared.ae.a.a.cj;
import com.google.android.apps.gsa.nga.shared.ae.a.a.cl;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.f.a.l;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.k.ce;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.k.g;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.util.concurrent.ay;
import com.google.common.v.f;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/w.class */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f609a = com.google.common.f.a.d.j();
    public static final ha b = ha.t(c.UNKNOWN, c.INLINE_REFINEMENT, c.FOLLOW_ON);
    public final f c;
    public final ag d;
    public final Optional e;
    public final i f;
    public final o g;
    public final a h;
    public final e.a i;
    public final ab j;
    public final e.a k;
    public final e.a l;
    public final e.a m;
    public final e n;
    public final AtomicReference o = new AtomicReference(Optional.empty());
    public final m p;
    public final x q;
    private final Context r;
    private final e.a s;
    private final com.google.android.apps.gsa.nga.engine.education.b.d t;

    public w(Context context, f fVar, ag agVar, Optional optional, i iVar, o oVar, e.a aVar, m mVar, a aVar2, e.a aVar3, ab abVar, e.a aVar4, e.a aVar5, e.a aVar6, e eVar, com.google.android.apps.gsa.nga.engine.education.b.d dVar, x xVar) {
        this.r = context;
        this.c = fVar;
        this.d = agVar;
        this.e = optional;
        this.f = iVar;
        this.g = oVar;
        this.s = aVar;
        this.p = mVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = abVar;
        this.k = aVar4;
        this.l = aVar5;
        this.m = aVar6;
        this.n = eVar;
        this.t = dVar;
        this.q = xVar;
    }

    public final v a(Locale locale, com.google.android.apps.gsa.nga.engine.education.a.w wVar, com.google.g.aa.d.e eVar) {
        int b2 = wVar.d.b();
        int i = b2 - 1;
        if (b2 == 0) {
            throw null;
        }
        if (i == 0) {
            String c = wVar.d.c();
            Optional map = wVar.b(locale).map(new n(eVar));
            s sVar = wVar.i;
            return new v(c, map, sVar.f558a ? new s(true, Optional.of((String) sVar.b.orElse(this.h.h(bt.b)))) : new s(false, Optional.empty()));
        }
        if (i != 1) {
            throw new AssertionError("Unknown suggestion type.");
        }
        String string = ((b) this.l.a()).a(locale).getString(wVar.d.a(), new Object[0]);
        Optional b3 = wVar.b(locale);
        com.google.g.aa.d.a createBuilder = com.google.g.aa.d.b.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.g.aa.d.b bVar = createBuilder.instance;
        string.getClass();
        bVar.d = 1 | bVar.d;
        bVar.e = string;
        createBuilder.copyOnWrite();
        com.google.g.aa.d.b bVar2 = createBuilder.instance;
        bVar2.g = 5;
        bVar2.d |= 4;
        String languageTag = locale.toLanguageTag();
        createBuilder.copyOnWrite();
        com.google.g.aa.d.b bVar3 = createBuilder.instance;
        languageTag.getClass();
        bVar3.d |= 32;
        bVar3.i = languageTag;
        createBuilder.copyOnWrite();
        com.google.g.aa.d.b bVar4 = createBuilder.instance;
        bVar4.l = eVar.h;
        bVar4.d |= 64;
        return new v(string, Optional.of((com.google.g.aa.d.b) b3.orElse(createBuilder.build())), new s(false, Optional.empty()));
    }

    public final k b() {
        long d = this.h.d(br.cl);
        return d == 1 ? k.c : d == 2 ? k.d : k.b;
    }

    public final at c(Locale locale, Optional optional) {
        String str = (String) optional.orElse(this.h.h(bt.b));
        ba createBuilder = com.google.android.apps.gsa.nga.shared.aa.a.e.a.createBuilder();
        createBuilder.copyOnWrite();
        createBuilder.instance.d = a.a.cX(3);
        String uri = new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(0);
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.aa.a.e eVar = createBuilder.instance;
        uri.getClass();
        eVar.b = uri;
        com.google.android.apps.gsa.nga.shared.aa.a.e build = createBuilder.build();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.aa.a.f.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.aa.a.f fVar = createBuilder2.instance;
        build.getClass();
        fVar.c = build;
        fVar.b = 3;
        Optional of = Optional.of(createBuilder2.build());
        cj cjVar = new cj((byte[]) null, (byte[]) null);
        cjVar.e(((b) this.l.a()).a(locale).getString(2132093123, ((b) this.l.a()).a(locale).getString(2132093122, new Object[0]), ((b) this.l.a()).a(locale).getString(2132093165, new Object[0])));
        cjVar.a = of;
        return cjVar.d();
    }

    public final au d() {
        long d = this.h.d(br.cg);
        return d == 1 ? au.c : d == 2 ? au.b : d == 3 ? au.d : au.a;
    }

    public final cl e(Locale locale) {
        Intent d = g.d(this.h);
        ba createBuilder = com.google.android.apps.gsa.nga.shared.aa.a.e.a.createBuilder();
        createBuilder.copyOnWrite();
        createBuilder.instance.d = a.a.cX(3);
        String uri = d.toUri(0);
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.aa.a.e eVar = createBuilder.instance;
        uri.getClass();
        eVar.b = uri;
        com.google.android.apps.gsa.nga.shared.aa.a.e build = createBuilder.build();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.aa.a.f.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.aa.a.f fVar = createBuilder2.instance;
        build.getClass();
        fVar.c = build;
        fVar.b = 3;
        com.google.android.apps.gsa.nga.shared.aa.a.f build2 = createBuilder2.build();
        ba createBuilder3 = cl.a.createBuilder();
        String string = ((b) this.l.a()).a(locale).getString(2132093263, new Object[0]);
        createBuilder3.copyOnWrite();
        cl clVar = createBuilder3.instance;
        string.getClass();
        clVar.c = string;
        createBuilder3.copyOnWrite();
        cl clVar2 = createBuilder3.instance;
        build2.getClass();
        clVar2.d = build2;
        clVar2.b |= 1;
        return createBuilder3.build();
    }

    public final Optional f(Locale locale) {
        com.google.g.aa.d.e b2 = this.g.b();
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        j(b2);
        if (b2 == com.google.g.aa.d.e.a) {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_SELECTED_MODE_SUGGESTION_FETCH_FAILED);
            return Optional.empty();
        }
        Optional findFirst = Collection._EL.stream(this.g.h(locale)).findFirst();
        if (findFirst.isPresent()) {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_SELECTED_MODE_SUGGESTION_FETCH_SUCCESS);
            m mVar = this.p;
            z.g(mVar.b.l(mVar.c.a(new com.google.android.apps.gsa.nga.shared.f.a.b(((com.google.android.apps.gsa.nga.engine.education.a.w) findFirst.get()).b, 8), ay.a), "[NGA] EducationPreferences.recordHomescreenImpression", new l(mVar, 8)), new h(1));
        } else {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_SELECTED_MODE_SUGGESTION_FETCH_FAILED);
        }
        return findFirst.map(new m(this, locale, b2, 1));
    }

    public final Optional g(Optional optional, com.google.g.aa.d.e eVar, Locale locale) {
        Optional empty = Optional.empty();
        if (eVar != com.google.g.aa.d.e.a) {
            empty = optional.map(new m(this, locale, eVar, 2));
        }
        if (!empty.isEmpty() || !this.h.i(eu.dT)) {
            return empty;
        }
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_OVERAPP_MODE_SUGGESTION_FETCH_FAILED_SHOW_FALLBACK);
        return f(locale);
    }

    public final Optional h(c cVar) {
        if (cVar.equals(c.DEEPLINK) || cVar.equals(c.NOTIFICATION) || cVar.equals(c.NGA_PIE_FOLLOW_UP_QUERY)) {
            return (Optional) this.o.getAndSet(Optional.empty());
        }
        this.o.set(Optional.empty());
        return Optional.empty();
    }

    public final Optional i() {
        return ((com.google.android.apps.gsa.nga.shared.ak.e) this.i.a()).d();
    }

    public final void j(com.google.g.aa.d.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_UNKNOWN_DISPLAY_MODE_SELECTED);
            return;
        }
        if (ordinal == 1) {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_NEW_USER_DISPLAY_MODE_SELECTED);
        } else if (ordinal == 2) {
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_ACTIVATED_USER_MODE_SELECTED);
        } else {
            if (ordinal != 3) {
                return;
            }
            this.f.b(com.google.android.apps.gsa.shared.logger.b.w.FRE_OVERAPP_DISPLAY_MODE_SELECTED);
        }
    }

    public final void k(Optional optional, Optional optional2, Locale locale) {
        optional.ifPresent(new g(this, locale, optional2));
    }

    public final boolean l() {
        int dh;
        bu buVar = ((com.google.android.apps.gsa.nga.engine.ar.b.d) this.s.a()).a().c;
        return !((buVar.b & 256) == 0 || (dh = a.a.dh(buVar.k)) == 0 || dh != 2) || this.h.i(br.aa);
    }

    public final boolean m(String str) {
        if (((com.google.android.apps.gsa.nga.engine.ar.b.d) this.s.a()).a().f473a.a()) {
            return false;
        }
        this.o.set(Optional.of(new v(str, Optional.empty(), new s(false, Optional.empty()))));
        return true;
    }

    public final boolean n(com.google.g.aa.d.e eVar) {
        if (!this.h.i(bt.E) || eVar == com.google.g.aa.d.e.b || eVar == com.google.g.aa.d.e.a) {
            return false;
        }
        o oVar = this.g;
        int i = oVar.h.b().i;
        return ((long) oVar.f.a()) < oVar.d.d(eu.bc);
    }

    public final boolean o() {
        if (!this.h.i(bt.K) || this.r.getResources().getConfiguration().orientation == 2) {
            return false;
        }
        return this.h.i(bt.J) ? this.t.b() : ((long) this.p.b().j) < this.h.d(bt.L);
    }

    public final boolean p(c cVar) {
        if ((!this.h.i(ce.h) || !cVar.equals(c.LONG_PRESS_POWER_BUTTON)) && (!this.h.i(ce.i) || !cVar.equals(c.LOCKSCREEN_LONG_PRESS_POWER_BUTTON))) {
            return false;
        }
        String h = this.h.h(ce.v);
        if (TextUtils.isEmpty(h)) {
            return ((long) this.p.b().x) < this.h.d(ce.A);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(h.split(",")));
        int i = this.p.b().y;
        m mVar = this.p;
        z.g(mVar.b.l(mVar.c.a(new com.google.android.apps.gsa.nga.shared.f.a.c(13), ay.a), "[NGA] EducationPreferences.recordLongPressPowerInvocation", new l(mVar, 7)), new h(2));
        return arrayList.contains(String.valueOf(i));
    }
}
