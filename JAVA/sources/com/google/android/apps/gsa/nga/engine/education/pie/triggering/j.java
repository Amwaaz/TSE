package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.education.pie.b.v;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.engine.education.pie.c;
import com.google.android.apps.gsa.nga.shared.i.a.f;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.i.a.k;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.fd;
import com.google.android.apps.gsa.nga.shared.q.c.fe;
import com.google.android.apps.gsa.nga.shared.u.d.a.af;
import com.google.android.apps.gsa.nga.shared.u.d.a.an;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.nga.shared.u.d.a.m;
import com.google.android.apps.gsa.nga.shared.u.d.a.u;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/j.class */
public final class j implements c, com.google.android.apps.gsa.nga.engine.education.pie.d.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f602a;
    private final com.google.android.apps.gsa.nga.engine.education.pie.d b;
    private final a c;
    private final y d;
    private final t e;
    private final v f;
    private final x g;

    public j(Context context, y yVar, t tVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, v vVar, a aVar, x xVar) {
        this.f602a = context;
        this.d = yVar;
        this.e = tVar;
        this.b = dVar;
        this.f = vVar;
        this.c = aVar;
        this.g = xVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.d.f589a.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(com.google.android.apps.gsa.nga.shared.u.d.a.x xVar) {
        int i;
        if (xVar.b == 8) {
            an anVar = (an) xVar.c;
            if (this.c.i(eu.kC)) {
                Bundle bundle = new Bundle();
                g.c(bundle, l.GENERIC_TRY_SAYING);
                g.d(bundle, at.c);
                com.google.android.apps.gsa.nga.engine.education.pie.a.e.e(bundle, this.f602a.getString(2132093066), 1);
                try {
                    if (anVar.b == 2) {
                        com.google.android.apps.gsa.nga.shared.i.a.j d = k.d();
                        d.d(13);
                        d.c(l.GENERIC_TRY_SAYING);
                        d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_INVALID_REQUEST);
                        throw d.a();
                    }
                    com.google.android.apps.gsa.nga.shared.i.a.a a2 = f.a();
                    a2.a = bundle;
                    a2.g(2132093051);
                    a2.c(2132093050);
                    a2.c = 13;
                    a2.d(this.c.i(eu.fX));
                    this.e.a(a2.a(), 1);
                    return;
                } catch (k e) {
                    this.b.b(e, false);
                    return;
                }
            }
            fl flVar = (fl) Collection._EL.stream(fl.s(Pair.create(2132093035, 2132093034), Pair.create(2132093037, 2132093036), Pair.create(2132093039, 2132093038), Pair.create(2132093041, 2132093040))).map(new ak(this, 1)).map(new aj(1)).collect(bs.a);
            if (anVar.b == 2) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = i3;
                    if (i2 >= flVar.size()) {
                        break;
                    }
                    if (((ba) flVar.get(i2)).instance.d.hashCode() == (anVar.b == 2 ? (af) anVar.c : af.a).b) {
                        i3 = i2;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            ba createBuilder = m.f1010a.createBuilder();
            for (int i4 = 0; i4 < flVar.size(); i4++) {
                if (i4 != i) {
                    createBuilder.cB((ba) flVar.get(i4));
                }
            }
            i iVar = new i(((ba) flVar.get(i)).instance.d, (m) createBuilder.build());
            Bundle bundle2 = new Bundle();
            g.c(bundle2, l.APP_EDUCATION);
            g.d(bundle2, at.c);
            String str = iVar.a;
            m mVar = iVar.b;
            boolean z = anVar.b == 2;
            int i5 = com.google.android.apps.gsa.nga.engine.education.pie.a.b.a;
            bundle2.putString("APP_PACKAGE", "com.google.android.apps.maps");
            bundle2.putString("QUERY", str);
            bundle2.putStringArrayList("FOLLOWUP_QUERY_TITLES", new ArrayList<>((java.util.Collection) Collection._EL.stream(mVar.b).map(new com.google.android.apps.gsa.nga.engine.education.pie.a.a(1)).collect(Collectors.toList())));
            bundle2.putStringArrayList("FOLLOWUP_QUERY_QUERIES", new ArrayList<>((java.util.Collection) Collection._EL.stream(mVar.b).map(new com.google.android.apps.gsa.nga.engine.education.pie.a.a(0)).collect(Collectors.toList())));
            bundle2.putBoolean("SKIP_INVOCATION", z);
            boolean i6 = this.c.i(eu.fX);
            try {
                if (anVar.b == 2) {
                    if (this.c.i(eu.kA)) {
                        bundle2 = new Bundle();
                        g.c(bundle2, l.GENERIC_TRY_SAYING);
                        g.d(bundle2, at.c);
                        com.google.android.apps.gsa.nga.engine.education.pie.a.e.e(bundle2, iVar.a, 2);
                    }
                    v vVar = this.f;
                    com.google.android.apps.gsa.nga.engine.education.pie.e a3 = com.google.android.apps.gsa.nga.engine.education.pie.f.a(14);
                    a3.b(at.c);
                    a3.c = iVar.a;
                    vVar.h(bundle2, a3.a());
                    return;
                }
                com.google.android.apps.gsa.nga.shared.i.a.a a4 = f.a();
                a4.a = bundle2;
                a4.g(2132093049);
                a4.c(2132093048);
                a4.c = 13;
                a4.e((anVar.b == 1 ? (u) anVar.c : u.a).c);
                a4.d(i6);
                this.e.a(a4.a(), 1);
                x xVar2 = this.g;
                fd d2 = fe.d();
                d2.b = "NOTIFICATION_SHOWN";
                d2.b(i6);
                xVar2.b(d2.a());
            } catch (k e2) {
                this.b.b(e2, anVar.b == 2);
                if (anVar.b != 2) {
                    x xVar3 = this.g;
                    fd d3 = fe.d();
                    d3.b = "NOTIFICATION_FAILED_TO_SHOW_".concat(String.valueOf(e2.a().name()));
                    d3.b(i6);
                    xVar3.b(d3.a());
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.d.f589a.c(this);
    }
}
