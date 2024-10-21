package com.google.android.apps.gsa.d;

import android.content.Context;
import com.google.android.apps.gsa.search.core.h.c;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.aa;
import com.google.android.libraries.search.t.i.y;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/b.class */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    final e.a f341a;
    final e.a b;
    final e.a c;

    public b(e.a aVar, e.a aVar2, e.a aVar3) {
        this.f341a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final /* synthetic */ void a(p pVar, i iVar) {
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (pVar.w(aa.f)) {
            com.google.android.apps.gsa.w.a aVar = (com.google.android.apps.gsa.w.a) this.f341a.a();
            a.b = aVar;
            synchronized (a.c) {
                arrayList3 = new ArrayList(a.c);
                a.c.clear();
            }
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                a.b(aVar, (f) arrayList3.get(i));
            }
        } else {
            a.f339a = false;
        }
        if (pVar.w(aa.g)) {
            com.google.android.apps.gsa.w.a aVar2 = (com.google.android.apps.gsa.w.a) this.f341a.a();
            e.b = aVar2;
            synchronized (e.c) {
                arrayList2 = new ArrayList(e.c);
                e.c.clear();
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                d dVar = (d) arrayList2.get(i2);
                e.c(aVar2, dVar.f344a, dVar.b);
            }
        } else {
            e.f345a = false;
        }
        if (pVar.w(aa.i)) {
            com.google.android.apps.gsa.w.a aVar3 = (com.google.android.apps.gsa.w.a) this.f341a.a();
            com.google.android.apps.gsa.d.a.a.b = aVar3;
            synchronized (com.google.android.apps.gsa.d.a.a.c) {
                arrayList = new ArrayList(com.google.android.apps.gsa.d.a.a.c);
                com.google.android.apps.gsa.d.a.a.c.clear();
            }
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                com.google.android.apps.gsa.d.a.a.b(aVar3, (com.google.android.apps.gsa.d.a.b) arrayList.get(i3));
            }
        } else {
            com.google.android.apps.gsa.d.a.a.f340a = false;
        }
        if (pVar.w(aa.j)) {
            com.google.android.apps.gsa.d.b.b.a((y) this.b.a(), (Context) this.c.a());
        } else {
            com.google.android.apps.gsa.d.b.b.f343a = false;
            com.google.android.apps.gsa.d.b.b.b.clear();
        }
    }
}
