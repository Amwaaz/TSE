package com.google.android.apps.gsa.nga.engine.am;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.aa.a.h;
import com.google.android.apps.gsa.nga.shared.ag.a;
import com.google.common.b.eg;
import com.google.common.b.pw;
import com.google.common.f.j;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/g.class */
public class g {
    private static final j c = j.i("com.google.android.apps.gsa.nga.engine.am.g");
    private static final Pattern d = Pattern.compile("[\\p{Punct}]");

    /* renamed from: a */
    public final Object f461a = new Object();
    public final pw b = eg.o();

    static String b(String str) {
        return a.a(d.matcher(str).replaceAll(" ").trim());
    }

    public final Optional a(String str) {
        String b = b(str);
        synchronized (this.f461a) {
            Iterator it = this.b.s().entrySet().iterator();
            while (it.hasNext()) {
                h hVar = (h) ((Map) ((Map.Entry) it.next()).getValue()).get(b);
                if (hVar != null) {
                    return Optional.of(hVar);
                }
            }
            return Optional.empty();
        }
    }

    public final void c(List list) {
        synchronized (this.f461a) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                com.google.android.apps.gsa.nga.shared.aa.a.j jVar = hVar.d;
                com.google.android.apps.gsa.nga.shared.aa.a.j jVar2 = jVar;
                if (jVar == null) {
                    jVar2 = com.google.android.apps.gsa.nga.shared.aa.a.j.a;
                }
                String b = b(jVar2.d);
                if (!TextUtils.isEmpty(b)) {
                    com.google.android.apps.gsa.nga.shared.aa.a.g a2 = com.google.android.apps.gsa.nga.shared.aa.a.g.a(hVar.i);
                    com.google.android.apps.gsa.nga.shared.aa.a.g gVar = a2;
                    if (a2 == null) {
                        gVar = com.google.android.apps.gsa.nga.shared.aa.a.g.e;
                    }
                    if (!gVar.equals(com.google.android.apps.gsa.nga.shared.aa.a.g.a)) {
                        pw pwVar = this.b;
                        com.google.android.apps.gsa.nga.shared.aa.a.g a3 = com.google.android.apps.gsa.nga.shared.aa.a.g.a(hVar.i);
                        com.google.android.apps.gsa.nga.shared.aa.a.g gVar2 = a3;
                        if (a3 == null) {
                            gVar2 = com.google.android.apps.gsa.nga.shared.aa.a.g.e;
                        }
                        pwVar.b(gVar2, b, hVar);
                        com.google.android.apps.gsa.nga.shared.aa.a.f fVar = hVar.e;
                        com.google.android.apps.gsa.nga.shared.aa.a.f fVar2 = fVar;
                        if (fVar == null) {
                            fVar2 = com.google.android.apps.gsa.nga.shared.aa.a.f.a;
                        }
                        String b2 = b(fVar2.b == 2 ? (String) fVar2.c : "");
                        if (!TextUtils.isEmpty(b2) && !b.equals(b2)) {
                            pw pwVar2 = this.b;
                            com.google.android.apps.gsa.nga.shared.aa.a.g a4 = com.google.android.apps.gsa.nga.shared.aa.a.g.a(hVar.i);
                            com.google.android.apps.gsa.nga.shared.aa.a.g gVar3 = a4;
                            if (a4 == null) {
                                gVar3 = com.google.android.apps.gsa.nga.shared.aa.a.g.e;
                            }
                            if (pwVar2.b(gVar3, b2, hVar) != null) {
                                com.google.common.f.h f = c.f();
                                f.ak(4218);
                                f.s("Detected two suggestions with the same secondary key, dropping previous one from mapping: %s", b2);
                            }
                        }
                    }
                }
                com.google.common.f.h f2 = c.f();
                f2.ak(4217);
                com.google.android.apps.gsa.nga.shared.aa.a.g a5 = com.google.android.apps.gsa.nga.shared.aa.a.g.a(hVar.i);
                com.google.android.apps.gsa.nga.shared.aa.a.g gVar4 = a5;
                if (a5 == null) {
                    gVar4 = com.google.android.apps.gsa.nga.shared.aa.a.g.e;
                }
                f2.H("Ignoring suggestion '%s' for display %s.", b, gVar4.name());
            }
        }
    }

    public final void d(com.google.android.apps.gsa.nga.shared.aa.a.g gVar) {
        gVar.name();
        synchronized (this.f461a) {
            this.b.s().remove(gVar);
        }
    }
}
