package com.google.android.apps.gsa.d;

import com.google.android.apps.gsa.s.c;
import com.google.common.b.oo;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/d/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f345a = true;
    public static volatile com.google.android.apps.gsa.w.a b;
    public static final Set c = oo.f(200);

    public static void a(com.google.android.apps.gsa.s.a aVar, int i) {
        if (f345a) {
            if (b != null) {
                c(b, aVar, i);
                return;
            }
            Set set = c;
            synchronized (set) {
                if (set.size() < 200) {
                    set.add(new d(aVar, i));
                }
            }
        }
    }

    public static void b(c cVar) {
        a(com.google.android.apps.gsa.s.a.ECBR_INTENT_ACTIONS_COUNT, cVar.v);
    }

    public static void c(com.google.android.apps.gsa.w.a aVar, com.google.android.apps.gsa.s.a aVar2, int i) {
        c cVar = c.CLASSIC_USAGE_ANALYSIS;
        aVar.h(aVar2, cVar, cVar, i).g(1L);
    }

    public static void d(int i) {
        a(com.google.android.apps.gsa.s.a.CBR_WORKER_CALLS_COUNT, i - 1);
    }

    public static void e(int i) {
        a(com.google.android.apps.gsa.s.a.CUSTOM_CODE_PATH_USAGE_COUNT, i - 1);
    }

    public static void f(int i) {
        a(com.google.android.apps.gsa.s.a.DEEPLINK_SESSION_CONTROLLER_WORKER_CALLS_COUNT, i - 1);
    }

    public static void g(int i) {
        a(com.google.android.apps.gsa.s.a.GCM_BROADCAST_RECEIVER_COUNT, i - 1);
    }

    public static void h(int i) {
        a(com.google.android.apps.gsa.s.a.SERVICE_ONCREATE_COUNT, i - 1);
    }

    public static void i(int i) {
        a(com.google.android.apps.gsa.s.a.DYNAMIC_RECEIVER_ON_RECEIVE_COUNT, i - 1);
    }

    public static void j(int i) {
        if (i == 0) {
            throw null;
        }
        a(com.google.android.apps.gsa.s.a.MANIFEST_RECEIVER_ON_RECEIVE_COUNT, i - 1);
    }

    public static void k(int i) {
        a(com.google.android.apps.gsa.s.a.PROVIDER_DELETE_COUNT, i - 1);
    }

    public static void l(int i) {
        a(com.google.android.apps.gsa.s.a.PROVIDER_INSERT_COUNT, i - 1);
    }

    public static void m(int i) {
        a(com.google.android.apps.gsa.s.a.PROVIDER_OPEN_FILE_COUNT, i - 1);
    }

    public static void n(int i) {
        a(com.google.android.apps.gsa.s.a.PROVIDER_QUERY_COUNT, i - 1);
    }

    public static void o(int i) {
        a(com.google.android.apps.gsa.s.a.PROVIDER_UPDATE_COUNT, i - 1);
    }

    public static void p(int i) {
        a(com.google.android.apps.gsa.s.a.PSS_FIRST_PARTY_USAGE_COUNT, i - 1);
    }
}
