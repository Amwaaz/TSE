package com.google.android.apps.gsa.search.core.ae.bt;

import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.i;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bt/b.class */
public interface b {
    cn a(Query query);

    void b();

    void c();

    void d(int i, String str, Query query, i iVar, TtsRequest ttsRequest, boolean z, boolean z2, String str2, a aVar);
}
