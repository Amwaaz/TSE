package com.google.android.apps.gsa.search.core.service.e;

import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a.class */
public enum a {
    IDLE(Long.MAX_VALUE, com.google.android.apps.gsa.s.c.UNKNOWN_WORKLOAD),
    SEARCH_TEXT(25000, com.google.android.apps.gsa.s.c.USER_ADVOCATE_STATE_SEARCH_TEXT),
    SEARCH_VOICE(3000, com.google.android.apps.gsa.s.c.USER_ADVOCATE_STATE_SEARCH_VOICE),
    STARTUP_G_ICON(1000, com.google.android.apps.gsa.s.c.UNKNOWN_WORKLOAD),
    STARTUP_QSB_TEXT(5000, com.google.android.apps.gsa.s.c.USER_ADVOCATE_STATE_STARTUP_QSB_TEXT),
    STARTUP_QSB_VOICE(1500, com.google.android.apps.gsa.s.c.UNKNOWN_WORKLOAD);

    public final long h;
    public final com.google.android.apps.gsa.s.c i;
    public static final ha g = ha.s(SEARCH_TEXT, SEARCH_VOICE);

    a(long j2, com.google.android.apps.gsa.s.c cVar) {
        this.h = j2;
        this.i = cVar;
    }
}
