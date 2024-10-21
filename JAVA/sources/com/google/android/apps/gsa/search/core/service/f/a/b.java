package com.google.android.apps.gsa.search.core.service.f.a;

import com.google.android.apps.gsa.search.core.service.g.b.a.a.j;
import com.google.android.apps.gsa.search.core.state.cl;
import com.google.android.apps.gsa.search.core.state.d.af;
import com.google.android.apps.gsa.search.core.state.d.x;
import com.google.common.base.at;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/f/a/b.class */
public final class b extends com.google.android.apps.gsa.search.core.service.f.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final af f1195a;
    public final e.a b;
    private final com.google.android.libraries.gsa.h.h c;
    private final x f;
    private final e.a g;
    private final j h;
    private boolean i;

    public b(com.google.android.libraries.gsa.h.h hVar, x xVar, af afVar, e.a aVar, e.a aVar2, j jVar) {
        super(com.google.android.apps.gsa.s.c.WORKER_MODULE, "module");
        this.c = hVar;
        this.f = xVar;
        this.f1195a = afVar;
        this.b = aVar;
        this.g = aVar2;
        this.h = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.gsa.search.core.service.f.b.a
    public final void a(cl clVar) {
        af afVar = this.f1195a;
        for (String str : afVar.c) {
            Integer num = (Integer) afVar.f1276a.get(str);
            if (num == null || num.intValue() == 4 || num.intValue() == 5) {
                afVar.f1276a.put(str, 1);
            }
        }
        Set c = afVar.c(1, 2);
        Set<String> set = c;
        if (c.contains("searchgraphlegacy")) {
            LinkedList linkedList = new LinkedList(c);
            linkedList.remove("searchgraphlegacy");
            linkedList.addFirst("searchgraphlegacy");
            set = linkedList;
        }
        for (String str2 : set) {
            this.c.m(((e) this.g.a()).a(str2), "Mark worker after loading", new a(this, str2));
        }
        if (clVar.a(6)) {
            x xVar = this.f;
            int i = xVar.f1297a;
            xVar.f1297a = 0;
            if (i != 0) {
                af afVar2 = this.f1195a;
                for (Map.Entry entry : afVar2.f1276a.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (((Integer) entry.getValue()).intValue() == 3 && !afVar2.b.contains(str3) && !afVar2.c.contains(str3)) {
                        entry.setValue(4);
                    }
                }
                Set<String> c2 = afVar2.c(4, 5);
                if (c2.isEmpty()) {
                    return;
                }
                for (String str4 : c2) {
                    at a2 = ((i) this.b.a()).a(str4);
                    if (a2.h()) {
                        com.google.android.apps.gsa.search.core.service.f.b bVar = (com.google.android.apps.gsa.search.core.service.f.b) a2.c();
                        j jVar = this.h;
                        if (jVar.c(bVar)) {
                            jVar.b(bVar, true);
                            i iVar = (i) this.b.a();
                            if (!str4.equals("module")) {
                                iVar.d.remove(str4);
                                iVar.c.remove(str4);
                            }
                            af afVar3 = this.f1195a;
                            afVar3.f1276a.remove(str4);
                            afVar3.an();
                        }
                    }
                }
            }
        }
    }

    public final boolean c() {
        return this.i;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.search.core.service.f.b
    public final void gR() {
        this.i = true;
    }
}
