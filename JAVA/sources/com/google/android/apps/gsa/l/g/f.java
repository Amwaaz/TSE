package com.google.android.apps.gsa.l.g;

import com.google.android.apps.gsa.l.b;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.base.ca;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.r;
import com.google.protobuf.MessageLite;
import com.google.protos.ap.a.a.s;
import com.google.protos.e.v.a.y;
import com.google.protos.o.b.v;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/g/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ca f366a;

    @Deprecated
    public f(final b bVar) {
        bVar.getClass();
        this.f366a = new ca(bVar) { // from class: com.google.android.apps.gsa.l.g.e

            /* renamed from: a, reason: collision with root package name */
            public final b f365a;

            {
                this.f365a = bVar;
            }

            public final Object a() {
                return this.f365a.b();
            }
        };
    }

    public f(ca caVar) {
        this.f366a = caVar;
    }

    public final cn a(final String str, final v vVar, final String str2, final s sVar, final MessageLite messageLite) {
        cn h = i.h((cn) this.f366a.a(), new r(str, vVar, str2, sVar, messageLite) { // from class: com.google.android.apps.gsa.l.g.a

            /* renamed from: a, reason: collision with root package name */
            public final String f364a;
            public final v b;
            public final String c;
            public final s d;
            public final MessageLite e;

            {
                this.f364a = str;
                this.b = vVar;
                this.c = str2;
                this.d = sVar;
                this.e = messageLite;
            }

            public final cn apply(Object obj) {
                return ((Geller) obj).g(this.f364a, this.b, this.c, y.a, this.d, com.google.android.libraries.geller.e.a.a(), this.e);
            }
        }, ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return h;
    }

    public final cn b(String str, v vVar) {
        cn h = i.h((cn) this.f366a.a(), new l(str, vVar, 1), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return h;
    }

    public final cn c(String str, v vVar, String str2, s sVar, MessageLite messageLite) {
        cn h = i.h((cn) this.f366a.a(), new c(str, vVar, str2, sVar, messageLite), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return h;
    }
}
