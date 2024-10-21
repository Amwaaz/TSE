package com.google.android.apps.gsa.search.core.ae.bj.a;

import com.google.android.apps.gsa.search.core.service.e.a;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.search.core.service.e.h;
import com.google.android.apps.gsa.v.c;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bj/a/f.class */
public final class f extends g {
    private final int c;
    private final String d;
    private final String e;

    public f(int i, String str, String str2) {
        super("searchplate", "searchplate::updateSearchPlateUiFlags", h.FIRE_AND_FORGET, a.SEARCH_TEXT);
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    @Override // com.google.android.apps.gsa.search.core.service.e.g
    public final cn g(Object obj) {
        ((com.google.android.apps.gsa.search.core.ae.bj.a) obj).g(this.c, this.d, this.e);
        return c.b;
    }
}
