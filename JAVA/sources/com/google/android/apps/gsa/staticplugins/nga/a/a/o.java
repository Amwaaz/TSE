package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.provider.Settings;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.common.base.ca;
import com.google.common.o.kh;
import j$.util.DesugarArrays;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/o.class */
public final /* synthetic */ class o implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1671a;
    private final int b;

    public /* synthetic */ o(Object obj, int i) {
        this.b = i;
        this.f1671a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [e.a, java.lang.Object] */
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            final x xVar = (x) this.f1671a;
            List list = (List) DesugarArrays.stream(((com.google.android.apps.gsa.search.core.google.gaia.an) xVar.b.a()).B()).map(new Function(xVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.g

                /* renamed from: a, reason: collision with root package name */
                public final x f1669a;

                {
                    this.f1669a = xVar;
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function._CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (kh) this.f1669a.m.g((String) obj).map(new q(1)).orElse(kh.b);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                    return Function._CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            return list.contains(kh.d) ? kh.d : list.contains(kh.b) ? kh.b : kh.c;
        }
        boolean z = true;
        if (i != 1) {
            return ((aw) this.f1671a.a()).a(bn.class);
        }
        String string = Settings.Secure.getString(((c) this.f1671a).f1668a.getContentResolver(), "enabled_accessibility_services");
        if (string == null || !string.contains("com.google.android.apps.accessibility.voiceaccess")) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
