package com.google.android.apps.gsa.search.core.preferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/preferences/m.class */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final n f1143a;

    public m(n nVar) {
        this.f1143a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1143a.d();
    }

    public final String toString() {
        return "SharedPreferencesProto.WriteToFile";
    }
}
