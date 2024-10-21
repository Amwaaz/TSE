package com.google.android.apps.gsa.search.core.state.d;

import com.google.common.b.gy;
import com.google.common.b.nr;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/af.class */
public final class af extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1276a;
    public final Set b;
    public final Set c;

    public af(e.a aVar) {
        super(aVar, 17);
        HashMap hashMap = new HashMap();
        this.f1276a = hashMap;
        TreeSet treeSet = new TreeSet();
        this.b = treeSet;
        this.c = new TreeSet();
        hashMap.put("microdetection", 1);
        treeSet.add("microdetection");
    }

    public final Set c(int i, int i2) {
        gy gyVar = null;
        for (Map.Entry entry : this.f1276a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                gy gyVar2 = gyVar;
                if (gyVar == null) {
                    gyVar2 = new gy();
                }
                gyVar2.h((String) entry.getKey());
                entry.setValue(Integer.valueOf(i2));
                gyVar = gyVar2;
            }
        }
        return gyVar == null ? nr.a : gyVar.g();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        String str;
        fVar.q("ModuleState");
        fVar.q("Workers");
        for (Map.Entry entry : this.f1276a.entrySet()) {
            switch (((Integer) entry.getValue()).intValue()) {
                case 1:
                    str = "to be loaded";
                    break;
                case 2:
                    str = "loading";
                    break;
                case 3:
                    str = "loaded";
                    break;
                case 4:
                    str = "to be unloaded";
                    break;
                case 5:
                    str = "unloading";
                    break;
                case 6:
                    str = "failed to load";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            fVar.b((String) entry.getKey()).a(new com.google.android.apps.gsa.shared.util.b.d(str, false));
        }
    }
}
