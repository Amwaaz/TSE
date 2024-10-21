package com.google.android.apps.gsa.search.core.service.d.a;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.libraries.gsa.h.h;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/a/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f1162a = new EnumMap(hf.class);
    public final h b;

    public c(h hVar) {
        this.b = hVar;
    }

    public final void a(ServiceEventData serviceEventData) {
        hf a2 = hf.a(serviceEventData.f1330a.c);
        hf hfVar = a2;
        if (a2 == null) {
            hfVar = hf.ATTACH_WEBVIEW;
        }
        List list = (List) this.f1162a.get(hfVar);
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }
}
