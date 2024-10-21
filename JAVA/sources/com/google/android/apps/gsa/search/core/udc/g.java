package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.libraries.aj.a.b.c.k;
import com.google.android.libraries.g.a;
import com.google.android.libraries.storage.a.j;
import com.google.common.base.ah;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/udc/g.class */
public final class g implements e.c.d {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.libraries.aj.a.b.c.j] */
    public static com.google.android.libraries.aj.a.b.a.d b(final Context context, com.google.android.apps.gsa.shared.util.c.a.g gVar, j jVar, a aVar, p pVar) {
        k kVar = new k();
        kVar.i = new Object() { // from class: com.google.android.libraries.aj.a.b.c.j
        };
        kVar.f = new com.google.android.libraries.g.a.e();
        com.google.android.libraries.aj.a.b.a.a.a.b(context, kVar);
        kVar.d(jVar);
        kVar.d = "AGSA_UDC_INSTANCE";
        kVar.e(gVar.a("FacsIoExecutor", gVar.c));
        kVar.c = new ah(context) { // from class: com.google.android.apps.gsa.search.core.udc.f

            /* renamed from: a, reason: collision with root package name */
            public final Context f1321a;

            {
                this.f1321a = context;
            }

            public final Object apply(Object obj) {
                Account account = (Account) obj;
                com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(this.f1321a);
                com.google.android.libraries.storage.a.a.e.a("managed");
                dVar.b = "managed";
                com.google.android.libraries.storage.a.a.e.b("facs");
                dVar.c = "facs";
                com.google.android.libraries.storage.a.a.a.b(account);
                dVar.d = account;
                return dVar.a();
            }
        };
        kVar.c(aVar);
        kVar.g = new e(pVar);
        return com.google.android.libraries.aj.a.b.a.a.a.a(kVar);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
