package com.google.android.apps.gsa.search.core.state.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ad.class */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1274a;
    private static aa b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aa aaVar) {
        if (f1274a) {
            b = aaVar;
            return;
        }
        f1274a = true;
        aaVar.f1272a.c();
        f1274a = false;
        aa aaVar2 = b;
        if (aaVar2 != null) {
            b = null;
            a(aaVar2);
        }
    }
}
