package com.google.android.apps.gsa.search.core.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.af.b;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.j.g;
import com.google.android.apps.gsa.search.core.service.f.a;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.ig;
import com.google.android.apps.gsa.search.shared.service.c.ih;
import com.google.android.apps.gsa.shared.k.cs;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.y;
import com.google.common.o.hb;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/au.class */
public final class au extends a implements com.google.android.apps.gsa.search.core.ae.bk.a {

    /* renamed from: a, reason: collision with root package name */
    public final e.a f1157a;
    public final h b;
    public final ai c;
    private final e.a f;
    private final Context g;
    private final b h;
    private final e.a i;
    private final p j;
    private final BroadcastReceiver k;
    private final ai l;
    private final ak m;

    public au(ai aiVar, ai aiVar2, e.a aVar, e.a aVar2, ak akVar, Context context, e.a aVar3, e.a aVar4, h hVar, p pVar) {
        super(c.WORKER_SERVICE, "service");
        at atVar = new at(this);
        this.k = atVar;
        this.l = aiVar;
        this.c = aiVar2;
        this.f = aVar2;
        this.m = akVar;
        this.g = context;
        this.f1157a = aVar3;
        this.i = aVar4;
        this.b = hVar;
        b bVar = new b(aVar, hVar);
        this.h = bVar;
        if (context.getPackageManager().checkPermission("com.google.android.googlequicksearchbox.permission.LAUNCH_FROM_GMM", "com.google.android.apps.maps") == 0) {
            androidx.core.content.a.f(context, bVar, new IntentFilter("com.google.android.apps.gmm.NAVIGATION_STATE"), "com.google.android.googlequicksearchbox.permission.LAUNCH_FROM_GMM", 2);
        } else {
            androidx.core.content.a.f(context, bVar, new IntentFilter("com.google.android.apps.gmm.NAVIGATION_STATE"), null, 2);
        }
        this.j = pVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(atVar, intentFilter);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void a(long j) {
        this.b.n("clientFocusLost", new ar(this, j, 0));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void c() {
        if (this.l.n()) {
            this.c.h = true;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void f() {
        o oVar = ((x) this.f.a()).i;
        if (oVar != null) {
            oVar.e.a(new ae(hf.BACK_PRESS).a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void g(long j) {
        this.b.n("setClientFocused", new ar(this, j, 2));
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.search.core.service.f.b
    public final void gR() {
        this.g.unregisterReceiver(this.h);
        this.g.unregisterReceiver(this.k);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void h(com.google.android.ssb.b bVar) {
        ((g) this.i.a()).g = bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("ServiceWorker");
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void i(long j, boolean z) {
        this.b.n("setKeepServiceStartedForSession", new ap(this, j, z, 0));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void j(boolean z) {
        if (this.j.w(cs.h)) {
            return;
        }
        this.b.n("setShouldShowForegroundingNotification", new as(this, z, 0));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void k(Query query, List list, CardDecision cardDecision, int i) {
        x xVar = (x) this.f.a();
        if (xVar.h()) {
            k kVar = xVar.i.e;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ParcelableVoiceAction((VoiceAction) it.next()));
                }
            }
            ae aeVar = new ae(hf.SHOW_VOICE_ACTIONS);
            aeVar.c(new ShowVoiceActionsEventParcelable(query, arrayList, cardDecision));
            bg bgVar = ig.a;
            ba createBuilder = ih.a.createBuilder();
            createBuilder.copyOnWrite();
            ih ihVar = createBuilder.instance;
            ihVar.b |= 1;
            ihVar.c = i;
            aeVar.b(bgVar, createBuilder.build());
            kVar.a(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void l() {
        x xVar = (x) this.f.a();
        if (xVar.h()) {
            xVar.i.e.a(new ae(hf.UPDATE_ACTION_UI).a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void m(int i) {
        Intent a2;
        ab abVar = e.a;
        ak akVar = this.m;
        if ((i & 1) != 0) {
            akVar.f.a(131073, com.google.android.apps.gsa.handsfree.c.a(akVar.b));
        } else {
            akVar.f.b(true);
        }
        Notification notification = null;
        if ((i & 2) != 0) {
            com.google.android.apps.gsa.assistant.a.a.b a3 = com.google.android.apps.gsa.assistant.a.a.b.a(akVar.e.getInt("hands_free_hotword_retraining_notification_source", 4));
            com.google.android.apps.gsa.speech.o.g gVar = (com.google.android.apps.gsa.speech.o.g) akVar.c.a();
            if (gVar.aj() && ((gVar.am() || gVar.X()) && a3 != com.google.android.apps.gsa.assistant.a.a.b.G && akVar.e.getInt("hands_free_hotword_retraining_notification_state", 1) == 2)) {
                com.google.common.f.h d = ak.f1152a.d();
                d.aj(e.a, "ServiceForegroundHelper");
                com.google.common.f.h hVar = d;
                hVar.ak(7304);
                hVar.s("Auto dismissed notification %s", "hands_free_hotword_retraining_notification_state");
                akVar.e.edit().putInt("hands_free_hotword_retraining_notification_state", 3).apply();
            }
            akVar.g.b.cancelAll();
            bc createBuilder = hb.a.createBuilder();
            createBuilder.copyOnWrite();
            hb hbVar = createBuilder.instance;
            hbVar.b |= 2;
            hbVar.n = 347;
            createBuilder.copyOnWrite();
            hb hbVar2 = createBuilder.instance;
            hbVar2.ar = a3.aB;
            hbVar2.g |= 32;
            com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
            if (a3.ordinal() != 4) {
                int i2 = a3.aB;
                com.google.android.apps.search.speechenroll.f.e b = com.google.android.apps.search.speechenroll.f.f.b();
                b.a = (com.google.android.apps.search.speechenroll.f.x) cl.O(com.google.android.apps.search.speechenroll.f.x.a(i2), com.google.android.apps.search.speechenroll.f.x.a);
                a2 = b.a();
            } else {
                com.google.android.apps.search.speechenroll.f.e b2 = com.google.android.apps.search.speechenroll.f.f.b();
                b2.d(com.google.android.apps.search.speechenroll.f.x.e);
                com.google.android.apps.search.speechenroll.f.s a4 = com.google.android.apps.search.speechenroll.f.t.a();
                a4.d = 3;
                b2.d = a4.a();
                a2 = b2.a();
            }
            PendingIntent a5 = akVar.a(a2);
            Intent putExtra = new Intent().setClassName(akVar.b, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 2);
            String[] strArr = new String[2];
            String b3 = akVar.h.b();
            int ordinal = a3.ordinal();
            if (ordinal == 4) {
                strArr[0] = akVar.b.getString(2132095221, b3);
                strArr[1] = akVar.b.getString(2132095220);
            } else if (ordinal == 32) {
                Context context = akVar.b;
                com.google.android.apps.gsa.speech.k.a aVar = akVar.h;
                ((com.google.android.apps.gsa.speech.o.g) akVar.c.a()).o().hashCode();
                strArr[0] = context.getString(2132095223, "Hey Google");
                strArr[1] = akVar.b.getString(2132095222);
            } else if (ordinal == 9) {
                strArr[0] = akVar.b.getString(2132095215);
                strArr[1] = akVar.b.getString(2132095214, b3);
            } else if (ordinal != 10) {
                strArr[0] = akVar.b.getString(2132095225, b3);
                strArr[1] = akVar.b.getString(2132095224);
            } else {
                strArr[0] = akVar.b.getString(2132095219);
                strArr[1] = akVar.b.getString(2132095218, b3);
            }
            PendingIntent service = PendingIntent.getService(akVar.b, 0, putExtra, 335544320);
            androidx.core.app.k a6 = com.google.android.apps.gsa.shared.y.b.a(akVar.b, (String) null);
            a6.e = androidx.core.app.k.c(strArr[0]);
            a6.f = androidx.core.app.k.c(strArr[1]);
            a6.L.icon = 2131233681;
            a6.g = a5;
            a6.L.deleteIntent = service;
            a6.d(16, true);
            notification = a6.a();
        } else if ((i & 32) != 0) {
            notification = akVar.d.q();
        } else if ((i & 128) != 0) {
            com.google.android.apps.gsa.shared.logger.k.f(1362);
            Intent intent = new Intent(akVar.b, (Class<?>) ProxyActivity.class);
            com.google.android.libraries.assistant.s.a b4 = com.google.android.libraries.assistant.s.b.b();
            b4.a = "language";
            b4.e("opa");
            PendingIntent a7 = akVar.a(intent.putExtra("android.intent.extra.INTENT", b4.b().a()));
            PendingIntent service2 = PendingIntent.getService(akVar.b, 0, new Intent().setClassName(akVar.b, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128), 335544320);
            String string = akVar.b.getString(2132095217);
            String string2 = akVar.b.getString(2132095216);
            androidx.core.app.k a8 = com.google.android.apps.gsa.shared.y.b.a(akVar.b, (String) null);
            a8.e = androidx.core.app.k.c(string);
            a8.f = androidx.core.app.k.c(string2);
            a8.L.icon = 2131233348;
            a8.g = a7;
            a8.L.deleteIntent = service2;
            a8.d(16, true);
            notification = a8.a();
        }
        if (notification == null) {
            akVar.g.b.cancel("s", 131074);
            return;
        }
        try {
            com.google.android.apps.gsa.sidekick.a.c.a.a(akVar.g.b, notification);
        } catch (SecurityException e) {
            y e2 = com.google.android.apps.gsa.sidekick.a.c.c.f1580a.e();
            e2.aj(e.a, "SystemNotificationMana");
            a.a.dB(e2, "Failed to notify", (char) 9472, e);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void n(Notification notification) {
        this.b.n("startForegroundNotification", new aq(this, notification, 2));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void o(boolean z) {
        this.b.n("stopForegroundNotification", new as(this, z, 1));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bk.a
    public final void p(Notification notification) {
        this.b.n("updateNotification", new aq(this, notification, 0));
    }
}
