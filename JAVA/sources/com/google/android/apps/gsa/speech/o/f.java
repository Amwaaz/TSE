package com.google.android.apps.gsa.speech.o;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/o/f.class */
public final class f extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final g f1613a;

    public f(g gVar) {
        this.f1613a = gVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        g gVar = this.f1613a;
        if (gVar.f1614a == null || gVar.b == null) {
            return;
        }
        gVar.P();
    }
}
