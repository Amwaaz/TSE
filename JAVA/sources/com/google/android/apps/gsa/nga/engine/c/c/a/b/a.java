package com.google.android.apps.gsa.nga.engine.c.c.a.b;

import com.google.g.ab.e.b.c;
import com.google.g.ab.e.b.d;
import com.google.g.ab.e.b.e;
import com.google.g.ab.e.b.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/c/a/b/a.class */
public final class a {

    /* renamed from: a */
    public final Object f523a;

    public a() {
        this.f523a = new Random();
    }

    public a(a aVar) {
        this.f523a = aVar;
    }

    public final d a(c cVar, d dVar) {
        com.google.g.ab.e.b.a aVar = cVar.g;
        com.google.g.ab.e.b.a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = com.google.g.ab.e.b.a.a;
        }
        if (!aVar2.c) {
            return dVar;
        }
        Object obj = this.f523a;
        HashMap hashMap = new HashMap();
        for (e eVar : dVar.b) {
            if (hashMap.containsKey(eVar.c)) {
                ((List) hashMap.get(eVar.c)).add(eVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eVar);
                hashMap.put(eVar.c, arrayList);
            }
        }
        o createBuilder = d.a.createBuilder();
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList2.get(i);
            if (hashMap.get(str) != null && !((List) hashMap.get(str)).isEmpty()) {
                createBuilder.r((e) ((List) hashMap.get(str)).get(((Random) ((a) obj).f523a).nextInt(((List) hashMap.get(str)).size())));
            }
        }
        return createBuilder.build();
    }
}
