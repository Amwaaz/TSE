package com.google.android.apps.gsa.search.core.ae.am.a;

import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.core.service.e.h;
import com.google.android.apps.gsa.v.c;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/am/a/a.class */
public final class a extends g {
    private final int c;

    public a(int i) {
        super("microdetection", "microdetection::initializeDataManager", h.FIRE_AND_FORGET, com.google.android.apps.gsa.search.core.service.e.a.IDLE);
        this.c = i;
    }

    @Override // com.google.android.apps.gsa.search.core.service.e.g
    public final cn g(Object obj) {
        ((com.google.android.apps.gsa.search.core.ae.am.a) obj).g(this.c);
        return c.b;
    }
}
