package com.google.android.apps.gsa.shared.logger;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/s.class */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1473a = TimeUnit.HOURS.toMillis(2);
    public static final long b = TimeUnit.HOURS.toMillis(2);
    public static final Object c = new Object();
    public final com.google.android.libraries.g.a d;
    public volatile List e = new ArrayList();
    public final Map f = new EnumMap(com.google.ap.e.c.b.e.class);

    public s(com.google.android.libraries.g.a aVar) {
        this.d = aVar;
    }
}
