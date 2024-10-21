package com.google.android.apps.gsa.shared.util.c.a;

import com.google.common.base.ca;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/aq.class */
final class aq implements ca {

    /* renamed from: a */
    private final ThreadPoolExecutor f1517a;

    public aq(ThreadPoolExecutor threadPoolExecutor) {
        this.f1517a = threadPoolExecutor;
    }

    /* renamed from: b */
    public final Integer a() {
        return Integer.valueOf(this.f1517a.getPoolSize());
    }
}
