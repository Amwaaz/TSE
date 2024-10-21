package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gsa.assistant.shared.k.a;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.assistant.d.c.c.q;
import com.google.common.android.a.c;
import com.google.common.base.bx;
import com.google.common.base.ca;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/o.class */
public class o implements ca, com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1762a = j.i("com.google.android.apps.gsa.staticplugins.opa.appintegration.o");
    private a b;
    private a c = a.f280a;
    private final SharedPreferences d;

    public o(SharedPreferences sharedPreferences) {
        this.d = sharedPreferences;
    }

    private final void h(a aVar) {
        this.b = aVar;
        this.d.edit().putString("opa_app_integration_status", Base64.encodeToString(this.b.toByteArray(), 0)).apply();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a() {
        if (this.b == null) {
            bx d = bx.d(c.a);
            try {
                byte[] decode = Base64.decode(this.d.getString("opa_app_integration_status", ""), 0);
                if (decode != null) {
                    this.b = (a) bi.parseFrom(a.f280a, decode);
                }
                d.g();
                ab abVar = com.google.common.f.a.e.a;
                d.a(TimeUnit.MILLISECONDS);
            } catch (ce | IllegalArgumentException e) {
                y f = f1762a.f();
                f.aj(com.google.common.f.a.e.a, "OpaAIStatusSupplier");
                a.a.dB(f, "Failed to get OpaAppIntegrationStatus from cache", (char) 16476, e);
                this.b = a.f280a;
            }
        }
        return this.b;
    }

    public final void c() {
        ba builder = this.c.toBuilder();
        String str = a().c;
        builder.copyOnWrite();
        a aVar = (a) builder.instance;
        str.getClass();
        aVar.b |= 1;
        aVar.c = str;
        this.c = (a) builder.build();
        ba builder2 = a().toBuilder();
        builder2.copyOnWrite();
        a aVar2 = (a) builder2.instance;
        aVar2.b &= -2;
        aVar2.c = a.f280a.c;
        h((a) builder2.build());
    }

    public final void e() {
        ba builder = this.c.toBuilder();
        q qVar = a().d;
        q qVar2 = qVar;
        if (qVar == null) {
            qVar2 = q.a;
        }
        builder.copyOnWrite();
        a aVar = (a) builder.instance;
        qVar2.getClass();
        aVar.d = qVar2;
        aVar.b |= 2;
        this.c = (a) builder.build();
        ba builder2 = a().toBuilder();
        builder2.copyOnWrite();
        a aVar2 = (a) builder2.instance;
        aVar2.d = null;
        aVar2.b &= -3;
        h((a) builder2.build());
    }

    public final void f(String str) {
        ba builder = a().toBuilder();
        builder.copyOnWrite();
        a aVar = (a) builder.instance;
        str.getClass();
        aVar.b |= 1;
        aVar.c = str;
        h((a) builder.build());
    }

    public final void g(q qVar) {
        ba builder = a().toBuilder();
        builder.copyOnWrite();
        a aVar = (a) builder.instance;
        qVar.getClass();
        aVar.d = qVar;
        aVar.b |= 2;
        h((a) builder.build());
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("OpaAppIntegrationStatusSupplier");
        fVar.b("status").a(new d(this.b, false));
    }
}
