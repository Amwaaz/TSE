package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.o.c;
import com.google.android.apps.gsa.staticplugins.opa.morris2.h.h;
import com.google.android.libraries.assistant.auto.tng.morris.b.g;
import com.google.android.libraries.assistant.auto.tng.morris.c.t;
import com.google.android.libraries.assistant.auto.tng.morris.d.a.s;
import com.google.android.libraries.assistant.auto.tng.morris.e.ef;
import com.google.android.libraries.assistant.auto.tng.morris.e.eg;
import com.google.android.libraries.assistant.auto.tng.morris.e.ek;
import com.google.android.libraries.assistant.auto.tng.morris.e.en;
import com.google.android.libraries.assistant.auto.tng.morris.e.fs;
import com.google.android.libraries.assistant.auto.tng.morris.e.u;
import com.google.android.libraries.assistant.auto.tng.morris.framework.b;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.g.e.k.a.z;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/morris2/framework/controllers/features/a.class */
public final class a implements com.google.android.libraries.assistant.auto.tng.morris.framework.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1781a = j.i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.controllers.features.a");
    public final Context b;
    public final g c;
    public final t d;
    public final c e;
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public final h h;

    public a(Context context, h hVar, t tVar, g gVar) {
        this.b = context;
        this.h = hVar;
        this.d = tVar;
        this.c = gVar;
        this.e = new c(context);
    }

    public final /* synthetic */ void a() {
    }

    public final /* synthetic */ void b() {
    }

    public final /* synthetic */ void c() {
    }

    public final void d() {
        ab abVar = e.a;
        this.f = Optional.empty();
    }

    public final /* synthetic */ void e() {
    }

    public final /* synthetic */ void f() {
    }

    public final z g(com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h hVar) {
        Optional b = hVar.b(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.e());
        if (b.isPresent()) {
            u uVar = (u) b.get();
            com.google.android.libraries.assistant.auto.tng.morris.e.z zVar = uVar.b == 13 ? (com.google.android.libraries.assistant.auto.tng.morris.e.z) uVar.c : com.google.android.libraries.assistant.auto.tng.morris.e.z.a;
            if ((zVar.b & 1) != 0) {
                z zVar2 = zVar.c;
                z zVar3 = zVar2;
                if (zVar2 == null) {
                    zVar3 = z.a;
                }
                return zVar3;
            }
            com.google.common.f.h e = f1781a.e();
            e.aj(e.a, "Morris.SettingsCtrl");
            com.google.common.f.h hVar2 = e;
            hVar2.ak(17520);
            hVar2.p("Missing driving settings data from datasource");
        } else {
            com.google.common.f.h e2 = f1781a.e();
            e2.aj(e.a, "Morris.SettingsCtrl");
            com.google.common.f.h hVar3 = e2;
            hVar3.ak(17519);
            hVar3.p("Failed to retrieve driving settings response");
        }
        return z.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00f9. Please report as an issue. */
    public final boolean h(ek ekVar, com.google.android.libraries.assistant.auto.tng.morris.e.c cVar, b bVar, com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h hVar) {
        int i = 17;
        ef efVar = ekVar.d == 17 ? (ef) ekVar.e : ef.a;
        switch (efVar.c) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
            case 13:
            case 14:
            default:
                i = 0;
                break;
            case 15:
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
        }
        int i2 = i;
        if (i == 0) {
            i2 = 1;
        }
        boolean z = false;
        switch (i2 - 2) {
            case -1:
            case 0:
                return z;
            case 1:
                if (efVar.d) {
                    Context context = this.b;
                    fl flVar = s.a;
                    if (!com.google.android.libraries.search.assistant.ai.d.a.a.e(context)) {
                        this.f = Optional.of(en.NOTIFICATION_PERMISSIONS_TASK);
                        this.c.e(true);
                        z = true;
                        return z;
                    }
                }
                ba builder = g(hVar).toBuilder();
                boolean z2 = efVar.d;
                builder.copyOnWrite();
                z zVar = builder.instance;
                zVar.b |= 2048;
                zVar.e = z2;
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(builder.build()));
                z = false;
                return z;
            case 2:
                if (!efVar.d && !s.b(this.b)) {
                    this.f = Optional.of(en.NOTIFICATION_PERMISSIONS_TASK);
                    this.c.b(true);
                    z = true;
                    return z;
                }
                ba builder2 = g(hVar).toBuilder();
                boolean z3 = efVar.d;
                builder2.copyOnWrite();
                z zVar2 = builder2.instance;
                zVar2.b |= 1024;
                zVar2.d = z3;
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(builder2.build()));
                z = false;
                return z;
            case 3:
            case 12:
            case 13:
            case 14:
            default:
                return false;
            case 4:
                Intent intent = new Intent(this.b, (Class<?>) AssistantSettingsIntentLauncherActivity.class);
                intent.putExtra("screenKey", "driving");
                this.e.ib(intent);
                return false;
            case 5:
                this.f = Optional.of(en.DISABLE_MORRIS_TASK);
                return true;
            case 6:
                this.f = Optional.empty();
                ba builder3 = g(hVar).toBuilder();
                com.google.g.e.k.a.ab abVar = com.google.g.e.k.a.ab.d;
                builder3.copyOnWrite();
                z zVar3 = builder3.instance;
                zVar3.l = abVar.g;
                zVar3.b |= 2097152;
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(builder3.build()));
                this.d.d(com.google.android.libraries.search.b.a.c.a.kD.j());
                h hVar2 = this.h;
                ba createBuilder = ek.a.createBuilder();
                ba createBuilder2 = eg.a.createBuilder();
                createBuilder2.copyOnWrite();
                createBuilder2.instance.b = 16;
                createBuilder.copyOnWrite();
                ek ekVar2 = createBuilder.instance;
                eg build = createBuilder2.build();
                build.getClass();
                ekVar2.c = build;
                ekVar2.b = 1;
                hVar2.g((ek) createBuilder.build());
                return false;
            case 7:
            case 9:
                this.f = Optional.empty();
                return true;
            case 8:
                this.f = Optional.empty();
                com.google.android.libraries.search.assistant.ai.d.a.a.d(this.b);
                Intent c = com.google.android.libraries.search.assistant.ai.d.a.a.c(this.b);
                Intent intent2 = c;
                if (c == null) {
                    com.google.common.f.h f = f1781a.f();
                    f.aj(e.a, "Morris.SettingsCtrl");
                    com.google.common.f.h hVar3 = f;
                    hVar3.ak(17518);
                    hVar3.p("Gsa Notification Util provided null intent.");
                    intent2 = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                    intent2.setFlags(268435456);
                }
                ex.o(this.b, intent2);
                z = true;
                return z;
            case 10:
                this.g = Optional.empty();
                return true;
            case 11:
                this.g = Optional.empty();
                return true;
            case 15:
                z g = g(hVar);
                ba builder4 = g.toBuilder();
                int dj = a.a.dj(efVar.e);
                builder4.copyOnWrite();
                z zVar4 = builder4.instance;
                if (dj == 0) {
                    throw null;
                }
                zVar4.g = dj - 1;
                zVar4.b |= 8192;
                int dj2 = a.a.dj(g.g);
                if (dj2 == 0) {
                    dj2 = 2;
                }
                builder4.copyOnWrite();
                z zVar5 = builder4.instance;
                zVar5.h = dj2 - 1;
                zVar5.b |= 16384;
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(builder4.build()));
                z = false;
                return z;
            case 16:
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(z.a));
                return false;
            case 17:
                if (efVar.d && !s.b(this.b)) {
                    this.f = Optional.of(en.NOTIFICATION_PERMISSIONS_TASK);
                    this.c.d(true);
                    z = true;
                    return z;
                }
                ba builder5 = g(hVar).toBuilder();
                boolean z4 = efVar.d;
                builder5.copyOnWrite();
                z zVar6 = builder5.instance;
                zVar6.b |= 1048576;
                zVar6.k = z4;
                hVar.c(com.google.android.libraries.assistant.auto.tng.morris.framework.f.a.l(builder5.build()));
                z = false;
                return z;
        }
    }

    public final void i(en enVar, Optional optional, com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h hVar) {
        if (this.f.isPresent() && ((en) this.f.get()).equals(enVar)) {
            this.f = Optional.empty();
        }
    }

    public final void j(com.google.android.libraries.assistant.auto.tng.morris.e.c cVar, com.google.android.libraries.assistant.auto.tng.morris.framework.b.a aVar, fs fsVar, com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h hVar) {
        if (this.f.isPresent()) {
            if (aVar.a()) {
                this.f = Optional.empty();
            } else {
                fsVar.t((en) this.f.get());
            }
        }
    }
}
