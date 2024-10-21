package com.google.android.apps.gsa.nga.shared.f.b;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.nga.shared.f.ah;
import com.google.android.apps.gsa.nga.shared.f.ar;
import com.google.android.apps.gsa.nga.shared.f.n;
import com.google.android.apps.gsa.nga.shared.f.o;
import com.google.android.apps.gsa.nga.shared.f.p;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.libraries.storage.a.a.e;
import com.google.android.libraries.storage.a.j;
import com.google.android.libraries.storage.protostore.ab;
import com.google.android.libraries.storage.protostore.ac;
import com.google.android.libraries.storage.protostore.af;
import com.google.android.libraries.storage.protostore.an;
import com.google.android.libraries.storage.protostore.aq;
import com.google.android.libraries.storage.protostore.b.b;
import com.google.android.libraries.storage.protostore.bb;
import com.google.android.libraries.storage.protostore.bi;
import com.google.android.libraries.storage.protostore.bo;
import com.google.android.libraries.storage.protostore.bv;
import com.google.android.libraries.storage.protostore.bz;
import com.google.android.libraries.storage.protostore.c.h;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.base.at;
import com.google.common.util.concurrent.cr;
import com.google.g.an.a.e.aj;
import java.util.HashMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/b/d.class */
public final class d implements e.c.d {
    public static cg b(Context context, af afVar) {
        return f.aC(context, afVar);
    }

    public static af c(g gVar, j jVar) {
        h hVar = h.f5590a;
        HashMap hashMap = new HashMap();
        cr a2 = gVar.a("BlockingE-ProtoDataStore", gVar.d);
        bz.c(bv.f5586a, hashMap);
        bz.c(bo.f5580a, hashMap);
        bz.c(bb.i(), hashMap);
        bz.c(new an(bv.f5586a), hashMap);
        return new af(a2, jVar, hVar, hashMap, null);
    }

    public static cg d(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("NgaGboardPreferences.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(n.f879a);
        return afVar.a(a3.a());
    }

    public static cg e(Context context, com.google.android.libraries.storage.protostore.e eVar, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("NgaInputPlatePreferences.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(o.f880a);
        a3.b = new bi(eVar);
        return afVar.a(a3.a());
    }

    public static cg f(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("NgaLegalNotice.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(p.f881a);
        return afVar.a(a3.a());
    }

    public static cg g(Uri uri, af afVar) {
        ab a2 = ac.a();
        a2.e(uri);
        a2.d(com.google.android.apps.gsa.nga.shared.f.af.f871a);
        a2.b = aq.f5565a;
        return afVar.a(a2.a());
    }

    public static cg h(Context context, com.google.android.libraries.storage.protostore.e eVar, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("NgaUdcBits.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(ah.f873a);
        a3.b = new bi(eVar);
        return afVar.a(a3.a());
    }

    public static cg i(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("OndeviceSuggestionsUserProfile.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(aj.a);
        return afVar.a(a3.a());
    }

    public static cg j(Context context, com.google.android.libraries.storage.protostore.e eVar, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("ReadOnlyLogsBasedTopContacts.pb");
        dVar.e.h(com.google.android.libraries.storage.a.i.d.b(com.google.android.libraries.storage.a.i.d.f5535a));
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(ar.f874a);
        a3.b = new bi(eVar);
        a3.f5561a = at.k(new b(ar.f874a));
        return afVar.a(a3.a());
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
