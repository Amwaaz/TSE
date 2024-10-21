package com.google.android.apps.gsa.nga.shared.f.a;

import com.google.android.apps.gsa.nga.shared.f.ac;
import com.google.android.apps.gsa.nga.shared.f.o;
import com.google.common.base.ah;
import com.google.common.base.at;
import com.google.protobuf.ba;
import com.google.protobuf.cu;
import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/p.class */
public final /* synthetic */ class p implements ah {

    /* renamed from: a */
    public final at f866a;

    public final Object apply(Object obj) {
        o oVar = (o) obj;
        String str = (String) this.f866a.e("");
        ac acVar = oVar.d;
        ac acVar2 = acVar;
        if (acVar == null) {
            acVar2 = ac.a;
        }
        ba builder = acVar2.toBuilder();
        str.getClass();
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(builder.instance.e);
        int intValue = unmodifiableMap.containsKey(str) ? ((Integer) unmodifiableMap.get(str)).intValue() : 0;
        ba builder2 = oVar.toBuilder();
        str.getClass();
        builder.copyOnWrite();
        ac acVar3 = builder.instance;
        cu cuVar = acVar3.e;
        if (!cuVar.b) {
            acVar3.e = cuVar.a();
        }
        acVar3.e.put(str, Integer.valueOf(intValue + 1));
        ac build = builder.build();
        builder2.copyOnWrite();
        o oVar2 = (o) builder2.instance;
        build.getClass();
        oVar2.d = build;
        oVar2.b |= 4;
        return (o) builder2.build();
    }
}
