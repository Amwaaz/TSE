package com.google.android.apps.gsa.opa.smartspace;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.shared.g.h;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.libraries.search.t.k.b;
import com.google.common.b.ha;
import com.google.common.base.at;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.o.nk;
import com.google.common.o.nm;
import com.google.common.o.nn;
import com.google.g.c.ac;
import com.google.g.c.ay;
import com.google.g.c.b.f;
import com.google.g.q.b.cq;
import com.google.g.q.b.cr;
import com.google.g.q.b.cs;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import e.a;
import java.io.Serializable;
import java.net.URISyntaxException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/smartspace/c.class */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1026a = j.i("com.google.android.apps.gsa.opa.smartspace.c");
    public static final ha b = ha.w("com.google.android.apps.gsa.broadcastreceiver.CALENDAR_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_REFRESH", "com.google.android.apps.gsa.staticplugins.opa.smartspace.WEATHER_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.REMINDER_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ASSISTANT_DATA_UPDATE", new String[]{"com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_COMMUTE_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ALARM_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.FLIGHT_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.OOBE_INTRO_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.FETCH_HOLIDAYS_DEBUG", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_CARD_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_TIME_FENCES", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_MONITORING", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_GENERATE_ON_DEVICE_MODEL", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_REMOVE_ON_DEVICE_MODEL", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_TEST_UPDATE"});
    public final Context c;
    public final h d;
    public final com.google.android.apps.gsa.search.core.h.p e;
    public final e f;
    private final a g;

    public c(Context context, h hVar, com.google.android.apps.gsa.search.core.h.p pVar, e eVar, a aVar) {
        this.c = context;
        this.d = hVar;
        this.e = pVar;
        this.f = eVar;
        this.g = aVar;
    }

    public static nn a(Intent intent) {
        ba createBuilder = nn.a.createBuilder();
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.EXTRA_SURFACE_TYPE")) {
            nm a2 = nm.a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.EXTRA_SURFACE_TYPE", 0));
            createBuilder.copyOnWrite();
            nn nnVar = createBuilder.instance;
            nnVar.e = a2.h;
            nnVar.b |= 1;
            if (a2.equals(nm.b) && intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA")) {
                int dm = a.a.dm(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA", 0));
                createBuilder.copyOnWrite();
                nn nnVar2 = createBuilder.instance;
                if (dm == 0) {
                    throw null;
                }
                nnVar2.d = Integer.valueOf(dm - 1);
                nnVar2.c = 2;
            }
            if (a2.equals(nm.c) && intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA")) {
                nk a3 = nk.a(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA", 0));
                createBuilder.copyOnWrite();
                nn nnVar3 = createBuilder.instance;
                nnVar3.d = Integer.valueOf(a3.d);
                nnVar3.c = 3;
            }
        }
        return createBuilder.build();
    }

    private final void k(Intent intent, Intent intent2, ay ayVar) {
        ab abVar = e.a;
        String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA");
        if (stringExtra == null) {
            return;
        }
        bc createBuilder = cs.a.createBuilder();
        createBuilder.copyOnWrite();
        cs csVar = createBuilder.instance;
        csVar.b |= 8;
        csVar.g = stringExtra;
        createBuilder.copyOnWrite();
        cs csVar2 = createBuilder.instance;
        csVar2.e = 3;
        csVar2.b |= 1;
        cq cqVar = cq.k;
        createBuilder.copyOnWrite();
        cs csVar3 = createBuilder.instance;
        csVar3.h = cqVar.r;
        csVar3.b |= 16;
        cr crVar = ayVar == ay.e ? cr.Q : ayVar == ay.b ? cr.P : cr.a;
        createBuilder.copyOnWrite();
        cs csVar4 = createBuilder.instance;
        csVar4.i = crVar.aa;
        csVar4.b |= 32;
        if (intent2 != null) {
            String uri = intent2.toUri(1);
            createBuilder.copyOnWrite();
            cs csVar5 = createBuilder.instance;
            uri.getClass();
            csVar5.c = 3;
            csVar5.d = uri;
        }
        this.d.h(this.c, createBuilder.build());
    }

    private final boolean l(Intent intent, ay ayVar) {
        if (!intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA")) {
            return false;
        }
        if (!((ayVar.equals(ay.b) && this.e.w(az.dD)) || (ayVar.equals(ay.e) && this.e.w(az.dC))) || intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA") == null) {
            return false;
        }
        ab abVar = e.a;
        return true;
    }

    public final void b(ac acVar) {
        int dm = a.a.dm(acVar.d);
        int i = dm;
        if (dm == 0) {
            i = 1;
        }
        try {
            Intent parseUri = Intent.parseUri(acVar.c, 1);
            if (i == 3) {
                parseUri.addFlags(402653184);
                this.c.startActivity(parseUri, null);
            } else if (i == 2) {
                this.c.sendBroadcast(parseUri);
            }
        } catch (URISyntaxException e) {
            com.google.common.f.h e2 = f1026a.e();
            e2.aj(e.a, "OpaSSIntentUtils");
            com.google.common.f.h g = e2.g(e);
            g.ak(6055);
            g.s("Failed to create intent from URI: %s", acVar.c);
        }
    }

    public final void c(nn nnVar, ay ayVar) {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        nm a2 = nm.a(nnVar.e);
        nm nmVar = a2;
        if (a2 == null) {
            nmVar = nm.a;
        }
        if (nmVar.equals(nm.b)) {
            intent.setAction("com.google.android.systemui.smartspace.CLICK_EVENT");
        } else {
            intent.setAction("com.google.android.apps.gsa.smartspace.CLICK_EVENT");
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", (Serializable) f.c);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", ayVar.ad);
        intent.putExtra("com.google.android.apps.gsa.smartspace.EXTRA_SURFACE_TYPE", nmVar.h);
        if (nnVar.c == 2) {
            int dm = a.a.dm(((Integer) nnVar.d).intValue());
            int i = dm;
            if (dm == 0) {
                i = 1;
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA", i - 1);
        }
        if (nnVar.c == 3) {
            nk a3 = nk.a(((Integer) nnVar.d).intValue());
            nk nkVar = a3;
            if (a3 == null) {
                nkVar = nk.a;
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA", nkVar.d);
        }
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void d() {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_REFRESH");
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void e() {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_UPDATE");
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void f() {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.REMINDER_DATA_UPDATE");
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void g() {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.ALARM_DATA_UPDATE");
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void h(boolean z) {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.WEATHER_DATA_UPDATE");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_SEND_DEVICE_LOCATION_EXTRA", z);
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }

    public final void i(Context context, Intent intent) {
        Intent intent2;
        j jVar = f1026a;
        com.google.common.f.h d = jVar.d();
        d.aj(e.a, "OpaSSIntentUtils");
        com.google.common.f.h hVar = d;
        hVar.ak(6065);
        hVar.p("#startTargetActivity");
        ay ayVar = ay.a;
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE")) {
            ay a2 = ay.a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0));
            ayVar = a2;
            if (a2 == null) {
                ayVar = ay.a;
            }
        }
        if (!com.google.android.apps.gsa.smartspace.c.e(ayVar)) {
            com.google.common.f.h e = jVar.e();
            e.aj(e.a, "OpaSSIntentUtils");
            com.google.common.f.h hVar2 = e;
            hVar2.ak(6071);
            hVar2.p("Invalid card type in click intent.");
            return;
        }
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY")) {
            String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY");
            if (stringExtra != null) {
                this.f.a(stringExtra);
                return;
            }
            com.google.common.f.h f = jVar.f();
            f.aj(e.a, "OpaSSIntentUtils");
            com.google.common.f.h hVar3 = f;
            hVar3.ak(6070);
            hVar3.p("Assistant query for Smartspace card is null");
            return;
        }
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")) {
            Intent c = com.google.android.apps.gsa.shared.at.a.a.c(Query.b.m577do(intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")).q());
            c.addFlags(268959744);
            b.c(c, com.google.android.libraries.search.t.h.j.cL.a());
            if (l(intent, ayVar)) {
                k(intent, c, ayVar);
                return;
            } else {
                context.startActivity(c, null);
                return;
            }
        }
        if (!intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT")) {
            if (l(intent, ayVar)) {
                k(intent, null, ayVar);
                return;
            }
            com.google.common.f.h f2 = jVar.f();
            f2.aj(e.a, "OpaSSIntentUtils");
            com.google.common.f.h hVar4 = f2;
            hVar4.ak(6066);
            hVar4.p("Incomplete intent extra.");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            return;
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT");
        if (stringExtra2 == null) {
            com.google.common.f.h e2 = jVar.e();
            e2.aj(e.a, "OpaSSIntentUtils");
            com.google.common.f.h hVar5 = e2;
            hVar5.ak(6067);
            hVar5.p("Smartspace extra intent doesn't exist.");
            return;
        }
        try {
            if (ayVar != ay.j) {
                intent2 = Intent.parseUri(stringExtra2, 1);
            } else {
                Intent intent3 = (Intent) ar.e(com.google.common.l.j.e.l(stringExtra2), Intent.CREATOR);
                com.google.common.base.a k = intent3 == null ? com.google.common.base.a.a : at.k(intent3);
                if (k.h()) {
                    intent2 = new Intent(context, (Class<?>) ProxyActivity.class).putExtra("intent-sender", PendingIntent.getService(context, 0, (Intent) k.c(), 201326592).getIntentSender());
                } else {
                    com.google.common.f.h e3 = jVar.e();
                    e3.aj(e.a, "OpaSSIntentUtils");
                    com.google.common.f.h hVar6 = e3;
                    hVar6.ak(6048);
                    hVar6.p("Failed deserializing the base64 encoded tap intent.");
                    intent2 = null;
                }
            }
            Intent intent4 = intent2;
            if (ayVar == ay.i) {
                intent4 = intent2;
                if (intent2 != null) {
                    intent4 = intent2;
                    if (intent2.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA")) {
                        intent4 = com.google.android.apps.gsa.search.shared.inappwebpage.a.a.a(intent2);
                    }
                }
            }
            if (intent4 != null) {
                if (ayVar.ordinal() == 1 && !androidx.compose.ui.l.f.ar(intent4)) {
                    return;
                }
                intent4.addFlags(268435456);
                if (l(intent, ayVar)) {
                    k(intent, intent4, ayVar);
                    return;
                }
                if ("com.google.android.gm.intent.VIEW_PLID".equals(intent4.getAction())) {
                    String r = ((an) this.g.a()).r();
                    if (!TextUtils.isEmpty(r)) {
                        com.google.android.gms.identity.accounts.api.b.a(this.c, intent4, AccountData.a(r));
                    }
                }
                context.startActivity(intent4, null);
            }
        } catch (ActivityNotFoundException e4) {
            y e5 = f1026a.e();
            e5.aj(e.a, "OpaSSIntentUtils");
            aus.b(e5, "No Activity found to handle Smartspace click intent: %s", stringExtra2, (char) 6069, e4);
        } catch (URISyntaxException e6) {
            y e7 = f1026a.e();
            e7.aj(e.a, "OpaSSIntentUtils");
            aus.b(e7, "Failed to create intent from URI: %s", stringExtra2, (char) 6068, e6);
        }
    }

    public final void j(boolean z) {
        ab abVar = e.a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.OOBE_INTRO_UPDATE");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_DISCARD_EXTRA", z);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_LOCATION_ONLY", false);
        com.google.android.apps.gsa.broadcastreceiver.c.c(this.c, intent);
    }
}
