package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.a.g;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.o.c;
import com.google.android.apps.gsa.shared.util.o.f;
import com.google.android.apps.gsa.staticplugins.x.c.b;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.j;
import com.google.common.o.gn;
import com.google.common.o.hb;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import e.a;
import j$.util.Collection;
import java.util.concurrent.Future;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/aj.class */
public class aj extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1151a = j.i("com.google.android.apps.gsa.search.core.service.aj");
    private final Context b;
    private final a c;
    private final a e;
    private final a f;
    private final h g;

    public aj(Context context, a aVar, a aVar2, a aVar3, h hVar) {
        super(context);
        this.b = context;
        this.c = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = hVar;
    }

    private final void i() {
        com.google.common.base.at atVar = (com.google.common.base.at) this.e.a();
        if (atVar.h()) {
            this.d = ((com.google.android.apps.gsa.staticplugins.bx.a) atVar.c()).a(this.b, "SearchServiceIntentStar");
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.o.c, com.google.android.apps.gsa.shared.util.o.g
    public final boolean b(Intent intent, f fVar) {
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", true);
        return ib(intent);
    }

    @Override // com.google.android.apps.gsa.shared.util.o.c, com.google.android.apps.gsa.shared.util.o.g
    public final boolean c() {
        o oVar = ((x) this.c.a()).i;
        return (oVar == null || BitFlags.f(oVar.f.b.b, 65536L)) ? false : true;
    }

    public final boolean g(Intent intent, o oVar) {
        if (((x) this.c.a()).i == oVar) {
            oVar.l(intent);
            return true;
        }
        com.google.common.f.h f = f1151a.f();
        f.aj(e.a, "SearchServiceIntentStar");
        com.google.common.f.h hVar = f;
        hVar.ak(7299);
        hVar.p("Client changed after Custom Tabs processing finished. Falling back to no-client");
        return super.ib(intent);
    }

    public final boolean h(Intent intent) {
        return super.ib(intent);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // com.google.android.apps.gsa.shared.util.o.c, com.google.android.apps.gsa.shared.util.o.g
    public final boolean ib(Intent intent) {
        com.google.android.apps.gsa.search.core.i.a a2;
        com.google.common.f.h d = f1151a.d();
        d.aj(e.a, "SearchServiceIntentStar");
        com.google.common.f.h hVar = d;
        hVar.ak(7300);
        hVar.s("startActivity: %s", intent.toUri(0));
        o oVar = ((x) this.c.a()).i;
        if (oVar == null) {
            i();
        } else {
            if (intent.getBooleanExtra("on_lockscreen", false)) {
                if (intent.getComponent().getClassName().contains("LockscreenEntryActivity")) {
                    return true;
                }
                oVar.l(intent);
                com.google.common.base.at atVar = (com.google.common.base.at) this.e.a();
                if (!atVar.h()) {
                    return true;
                }
                ((com.google.android.apps.gsa.staticplugins.bx.a) atVar.c()).d(intent.toUri(0));
                return true;
            }
            if (intent.getBooleanExtra("launch_in_current_process", false)) {
                i();
                return super.ib(intent);
            }
        }
        ag agVar = oVar == null ? new ag(this) : new ah(this, oVar);
        if (intent.hasCategory("android.intent.category.BROWSABLE") && !intent.hasExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED") && ((com.google.common.base.at) this.f.a()).h()) {
            b bVar = (b) ((com.google.android.apps.gsa.staticplugins.x.b) ((com.google.common.base.at) this.f.a()).c()).a.a();
            Uri data = intent.getData();
            if (data != null && intent.filterEquals(new Intent("android.intent.action.VIEW", data).addCategory("android.intent.category.BROWSABLE"))) {
                g a3 = new androidx.browser.a.f().a();
                a3.a.addFlags(268435456);
                ba createBuilder = gn.a.createBuilder();
                createBuilder.copyOnWrite();
                gn gnVar = createBuilder.instance;
                gnVar.b |= 4096;
                gnVar.m = true;
                gn build = createBuilder.build();
                bc createBuilder2 = hb.a.createBuilder();
                createBuilder2.copyOnWrite();
                hb hbVar = createBuilder2.instance;
                hbVar.b |= 2;
                hbVar.n = 624;
                createBuilder2.copyOnWrite();
                hb hbVar2 = createBuilder2.instance;
                build.getClass();
                hbVar2.an = build;
                hbVar2.f |= 67108864;
                com.google.android.apps.gsa.shared.logger.k.g(createBuilder2.build(), null, null, null);
                intent.putExtras(a3.a);
                intent.addFlags(a3.a.getFlags());
                ha haVar = b.a;
                intent.getClass();
                Collection._EL.forEach(haVar, new com.google.android.apps.gsa.staticplugins.x.c.a(intent));
                ((com.google.android.apps.gsa.shared.logger.b.h) bVar.b.a()).b(com.google.android.apps.gsa.shared.logger.b.w.CCT_VANILLA_CCT_LAUNCHED);
                a2 = new com.google.android.apps.gsa.search.core.i.a(true, com.google.common.base.at.k(dl.n(intent)));
            } else {
                a2 = com.google.android.apps.gsa.search.core.i.a.a(intent);
            }
        } else {
            a2 = com.google.android.apps.gsa.search.core.i.a.a(intent);
        }
        cl.a(true);
        return agVar.a((Intent) dl.x((Future) a2.b.a));
    }
}
