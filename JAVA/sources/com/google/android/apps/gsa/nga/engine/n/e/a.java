package com.google.android.apps.gsa.nga.engine.n.e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.nga.engine.ae.q;
import com.google.android.apps.gsa.nga.shared.aj.a.c;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.gms.common.v;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import io.grpc.ar;
import io.grpc.cb;
import io.grpc.cy;
import io.grpc.da;
import io.grpc.dd;
import io.grpc.h;
import io.grpc.i;
import io.grpc.j.e;
import io.grpc.j.n;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/e/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f625a = d.j();
    public final Context b;
    public final q c;
    private final com.google.android.apps.gsa.shared.util.q.a d;
    private final PackageManager e;
    private final c f;
    private final t g;
    private final com.google.android.libraries.assistant.w.b.c h;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d i;

    public a(Context context, q qVar, c cVar, t tVar, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.assistant.w.b.c cVar2, PackageManager packageManager, com.google.android.apps.gsa.nga.engine.ar.b.d dVar) {
        this.b = context;
        this.c = qVar;
        this.f = cVar;
        this.g = tVar;
        this.d = aVar;
        this.h = cVar2;
        this.e = packageManager;
        this.i = dVar;
    }

    public final boolean a(Intent intent) {
        return b(intent, true, 1, "");
    }

    public final boolean b(Intent intent, boolean z, int i, String str) {
        intent.addFlags(268435456);
        if (!z) {
            intent.addFlags(32768);
        }
        if (this.d.i(eu.mQ) && this.i.a().e().orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN) == com.google.android.apps.gsa.assistant.shared.k.c.NGA_WARM_ACTIONS) {
            intent.putExtra("EXTRA_DISMISS_KEYGUARD", false);
        }
        com.google.common.f.a.a b = f625a.b(Level.INFO);
        b.ak(3269);
        b.N("Starting intent: %s, data=%s, extras=%s", intent, intent.getData(), intent.getExtras());
        if (intent.resolveActivity(this.g.f628a) == null) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            fl d = b.d(this.d.h(eu.jV));
            if (!d.isEmpty()) {
                String str2 = intent.getPackage();
                String str3 = str2;
                if (str2 == null) {
                    ResolveInfo resolveActivity = this.e.resolveActivity(intent, 65536);
                    str3 = str2;
                    if (resolveActivity != null) {
                        str3 = str2;
                        if (resolveActivity.activityInfo != null) {
                            str3 = resolveActivity.activityInfo.packageName;
                        }
                    }
                }
                if (d.contains(str3)) {
                    intent.putExtra("utterance_id", str);
                    this.f.f(intent);
                    return true;
                }
            }
            if (!this.d.i(eu.io) || !intent.getBooleanExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", false)) {
                this.f.d(intent);
                return true;
            }
            c cVar = this.f;
            cVar.f842a.startActivity(new Intent().putExtra("android.intent.extra.INTENT", intent).setClass(cVar.f842a, ProxyActivity.class).addFlags(32768).addFlags(268435456));
            return true;
        }
        if (i2 == 1) {
            intent.putExtra("utterance_id", str);
            this.f.f(intent);
            return true;
        }
        if (i2 == 2) {
            intent.putExtra("utterance_id", str);
            this.f.e(intent);
            return true;
        }
        com.google.android.libraries.assistant.w.b.c cVar2 = this.h;
        com.google.frameworks.client.data.android.b.d dVar = new com.google.frameworks.client.data.android.b.d(v.b(cVar2.b));
        io.grpc.b.a c = io.grpc.b.a.c(intent.getPackage(), "com.google.android.libraries.assistant.trustedintent.dagger.TrustedIntentService");
        com.google.android.libraries.assistant.w.b.a aVar = cVar2.e;
        ar c2 = ar.c(c, aVar.f2952a);
        c2.d(aVar.b);
        c2.a.e(aVar.b);
        c2.a.i(aVar.b);
        c2.b.e = dVar;
        c2.a.f(5L, TimeUnit.SECONDS);
        cb a2 = c2.a();
        ba createBuilder = com.google.android.libraries.assistant.w.a.a.a.createBuilder();
        String uri = intent.toUri(0);
        createBuilder.copyOnWrite();
        com.google.android.libraries.assistant.w.a.a aVar2 = createBuilder.instance;
        uri.getClass();
        aVar2.b |= 1;
        aVar2.c = uri;
        com.google.android.libraries.assistant.w.a.a build = createBuilder.build();
        com.google.android.libraries.assistant.w.a.d H = io.grpc.j.c.g(new com.google.android.libraries.assistant.w.a.c(), a2, h.a).H(1000L, TimeUnit.MILLISECONDS);
        i iVar = ((e) H).a;
        dd ddVar = com.google.android.libraries.assistant.w.a.e.a;
        dd ddVar2 = ddVar;
        if (ddVar == null) {
            synchronized (com.google.android.libraries.assistant.w.a.e.class) {
                try {
                    dd ddVar3 = com.google.android.libraries.assistant.w.a.e.a;
                    ddVar2 = ddVar3;
                    if (ddVar3 == null) {
                        cy e = dd.e();
                        e.c = da.a;
                        e.d = dd.d("java.com.google.android.libraries.assistant.trustedintent.TrustedIntent", "Send");
                        e.e = true;
                        com.google.android.libraries.assistant.w.a.a aVar3 = com.google.android.libraries.assistant.w.a.a.a;
                        ExtensionRegistryLite extensionRegistryLite = io.grpc.i.a.d.a;
                        e.a = new io.grpc.i.a.b(aVar3);
                        e.b = new io.grpc.i.a.b(com.google.android.libraries.assistant.w.a.b.a);
                        ddVar2 = e.a();
                        com.google.android.libraries.assistant.w.a.e.a = ddVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        dl.y(n.a(iVar.a(ddVar2, ((e) H).b), build), cVar2.d, cVar2.c);
        return true;
    }

    public final boolean c(Intent intent, int i) {
        return b(intent, false, i, "");
    }
}
