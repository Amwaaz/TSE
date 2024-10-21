package com.google.android.apps.gsa.smartspace;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.aa.a.c;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.g.e;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.search.weather.b.b;
import com.google.common.b.ha;
import com.google.common.base.at;
import com.google.common.f.j;
import com.google.common.o.nm;
import com.google.g.c.ay;
import com.google.g.c.b.f;
import com.google.protobuf.ba;
import java.net.URISyntaxException;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/smartspace/k.class */
public class k {
    public final p b;
    public final Context c;
    public final h d;
    public final c e;
    private final SharedPreferences g;
    private static final j f = j.i("com.google.android.apps.gsa.smartspace.k");

    /* renamed from: a, reason: collision with root package name */
    public static final ha f1586a = ha.w("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_PREFERENCE_CHANGED", "com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_RESULT", "com.google.android.apps.gsa.broadcastreceiverACTION_SMARTSPACE_WEATHER_UNIT_CHANGED", "com.google.android.apps.oemsmartspace.DISABLE_UPDATE", "com.google.android.apps.oemsmartspace.ENABLE_UPDATE", "com.google.android.apps.gsa.smartspace.CLICK_EVENT", new String[]{"com.google.android.apps.gsa.smartspace.DISMISS_EVENT", "com.google.android.apps.gsa.smartspace.ENABLE_UPDATE", "com.google.android.apps.gsa.smartspace.EXPIRE_EVENT", "com.google.android.apps.gsa.smartspace.SETTINGS", "com.google.android.systemui.smartspace.CLICK_EVENT", "com.google.android.systemui.smartspace.EXPIRE_EVENT", "com.google.android.apps.gsa.weatherwidget.WEATHER_CLICK", "com.google.android.apps.gsa.weatherwidget.ENABLE_UPDATE"});

    public k(p pVar, c cVar, SharedPreferences sharedPreferences, Context context, i iVar) {
        this.b = pVar;
        this.e = cVar;
        this.g = sharedPreferences;
        this.c = context;
        this.d = iVar.a(new j(pVar));
    }

    public static Intent a(String str) {
        String languageTag = Locale.getDefault().toLanguageTag();
        Uri parse = Uri.parse(str);
        Uri uri = parse;
        if (!TextUtils.isEmpty(languageTag)) {
            uri = parse.buildUpon().appendQueryParameter("hl", languageTag).build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("full_screen", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("screen_orientation", true);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA", true);
        return intent;
    }

    public static Intent c(Intent intent, String str, String str2, ay ayVar, f fVar, boolean z) {
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", intent.toUri(1));
        } else if (str != null) {
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY", str);
        }
        n(intent2, str2, ayVar, fVar, z);
        return intent2;
    }

    public static com.google.g.c.b.g d(com.google.g.c.b.g gVar, nm nmVar) {
        com.google.g.c.b.g gVar2 = gVar;
        if ((gVar.b & 2) != 0) {
            Intent y = e.y(gVar.d);
            y.putExtra("com.google.android.apps.gsa.smartspace.EXTRA_SURFACE_TYPE", nmVar.h);
            ba builder = gVar.toBuilder();
            String uri = y.toUri(1);
            builder.copyOnWrite();
            com.google.g.c.b.g gVar3 = builder.instance;
            uri.getClass();
            gVar3.b |= 2;
            gVar3.d = uri;
            gVar2 = (com.google.g.c.b.g) builder.build();
        }
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if ((r0.applicationInfo.flags & 129) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r0.c(r0.packageName) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(android.content.Context r4) {
        /*
            com.google.android.apps.gsa.shared.o.a.a r0 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a
            r9 = r0
            r0 = r4
            com.google.android.gms.common.v r0 = com.google.android.gms.common.v.b(r0)
            r9 = r0
            r0 = r4
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = r0
            r0 = 0
            r8 = r0
            r0 = r4
            java.lang.String r1 = "com.google.android.apps.nexuslauncher"
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            r4 = r0
            r0 = r8
            r7 = r0
            r0 = r4
            android.content.pm.PermissionInfo[] r0 = r0.permissions     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            if (r0 == 0) goto L79
            r0 = r4
            android.content.pm.PermissionInfo[] r0 = r0.permissions     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            r10 = r0
            r0 = r10
            int r0 = r0.length     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            r6 = r0
            r0 = 0
            r5 = r0
        L33:
            r0 = r8
            r7 = r0
            r0 = r5
            r1 = r6
            if (r0 >= r1) goto L79
            java.lang.String r0 = "com.google.android.apps.nexuslauncher.permission.QSB"
            r1 = r10
            r2 = r5
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            if (r0 == 0) goto L70
            r0 = r8
            r7 = r0
            r0 = r4
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            r1 = 129(0x81, float:1.81E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L79
            r0 = r9
            r1 = r4
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            boolean r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L76 android.content.pm.PackageManager.NameNotFoundException -> L7b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = 1
            r7 = r0
            goto L79
        L6e:
            r0 = 0
            return r0
        L70:
            int r5 = r5 + 1
            goto L33
        L76:
            r4 = move-exception
            r0 = r4
            throw r0
        L79:
            r0 = r7
            return r0
        L7b:
            r4 = move-exception
            r0 = r8
            r7 = r0
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.smartspace.k.g(android.content.Context):boolean");
    }

    public static Intent k(String str, ay ayVar, f fVar) {
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", str);
        }
        n(intent, null, ayVar, fVar, false);
        return intent;
    }

    public static void l(Intent intent, f fVar) {
        if (fVar == f.b) {
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"));
        } else if (fVar == f.c) {
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.SmartspaceTrampolineActivity"));
        }
    }

    public static Intent m(String str, ay ayVar, f fVar, int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", str);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_LONG_PRESS_MENU_ITEM_TYPE", i - 1);
        n(intent, null, ayVar, fVar, true);
        return intent;
    }

    private static void n(Intent intent, String str, ay ayVar, f fVar, boolean z) {
        if (str != null) {
            intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID", str);
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", ayVar.ad);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", fVar.d);
        if (fVar == f.b) {
            intent.setAction("com.google.android.apps.gsa.smartspace.CLICK_EVENT").setPackage("com.google.android.googlequicksearchbox").addFlags(268435456);
        } else if (fVar == f.c) {
            if (z) {
                intent.putExtra("com.google.android.apps.gsa.smartspace.MAY_NEED_USER_UNLOCK", true);
            }
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ExportedSmartspaceTrampolineActivity")).addFlags(402653184);
        }
    }

    public final Intent b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        b.b(intent);
        com.google.android.libraries.search.t.k.b.c(intent, com.google.android.libraries.search.t.h.j.F.a());
        return intent;
    }

    public final void e() {
        Intent putExtra = new Intent().setAction("android.intent.action.MAIN").setClassName(this.c, "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").setFlags(1409810432).putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.smartspace.settingsui.SmartspaceSettingsFragment").putExtra(":android:show_fragment_title", 2132095562);
        a aVar = d.f1553a;
        this.c.startActivity(putExtra);
    }

    public final void f(Context context, Intent intent) {
        Intent intent2;
        ay ayVar = ay.a;
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE")) {
            ay a2 = ay.a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0));
            ayVar = a2;
            if (a2 == null) {
                ayVar = ay.a;
            }
        }
        if (!c.e(ayVar)) {
            com.google.common.f.h e = f.e();
            e.ak(9506);
            e.p("Invalid card type in click intent.");
            return;
        }
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")) {
            Intent c = com.google.android.apps.gsa.shared.at.a.a.c(Query.b.m577do(intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")).q());
            c.addFlags(268959744);
            context.startActivity(c, null);
            return;
        }
        if (!intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT")) {
            com.google.common.f.h f2 = f.f();
            f2.ak(9502);
            f2.p("Incomplete intent extra.");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT");
        if (stringExtra == null) {
            com.google.common.f.h e2 = f.e();
            e2.ak(9503);
            e2.p("Smartspace extra intent doesn't exist.");
            return;
        }
        try {
            if (ayVar != ay.j) {
                intent2 = Intent.parseUri(stringExtra, 1);
            } else {
                Intent intent3 = (Intent) ar.e(com.google.common.l.j.e.l(stringExtra), Intent.CREATOR);
                com.google.common.base.a k = intent3 == null ? com.google.common.base.a.a : at.k(intent3);
                if (k.h()) {
                    intent2 = new Intent(context, (Class<?>) ProxyActivity.class).putExtra("intent-sender", PendingIntent.getService(context, 0, (Intent) k.c(), 201326592).getIntentSender());
                } else {
                    com.google.common.f.h e3 = f.e();
                    e3.ak(9501);
                    e3.p("Failed deserializing the base64 encoded tap intent.");
                    intent2 = null;
                }
            }
            Intent intent4 = intent2;
            if (ayVar == ay.i) {
                intent4 = intent2;
                if (intent2 != null) {
                    intent4 = intent2;
                    if (intent2.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA")) {
                        intent4 = com.google.android.apps.search.assistant.verticals.reminders.a.b.b();
                    }
                }
            }
            if (intent4 != null) {
                if (ayVar.ordinal() == 1 && !androidx.compose.ui.l.f.ar(intent4)) {
                    return;
                }
                intent4.addFlags(268435456);
                context.startActivity(intent4, null);
            }
        } catch (ActivityNotFoundException e4) {
            aus.b(f.e(), "No Activity found to handle Smartspace click intent: %s", stringExtra, (char) 9505, e4);
        } catch (URISyntaxException e5) {
            aus.b(f.e(), "Failed to create intent from URI: %s", stringExtra, (char) 9504, e5);
        }
    }

    public final boolean h() {
        return this.d.g() && this.g.getBoolean("smartspace_alarm_enabled", true) && this.b.w(az.jg);
    }

    public final boolean i() {
        boolean z = true;
        if (!this.d.h()) {
            if (!this.d.c() || !this.d.n()) {
                z = false;
            } else {
                if (!this.e.u) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (h.a.a.p.b.a.f.w() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r2 = this;
            r0 = r2
            com.google.android.apps.gsa.smartspace.h r0 = r0.d
            boolean r0 = r0.d()
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r4
            r3 = r0
            boolean r0 = h.a.a.p.b.a.f.w()
            if (r0 != 0) goto L33
        L16:
            r0 = r2
            com.google.android.apps.gsa.smartspace.h r0 = r0.d
            boolean r0 = r0.c()
            if (r0 == 0) goto L31
            r0 = r2
            com.google.android.apps.gsa.search.core.aa.a.c r0 = r0.e
            boolean r0 = r0.u
            if (r0 == 0) goto L2f
            r0 = r4
            r3 = r0
            goto L33
        L2f:
            r0 = 0
            return r0
        L31:
            r0 = 0
            r3 = r0
        L33:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.smartspace.k.j():boolean");
    }
}
