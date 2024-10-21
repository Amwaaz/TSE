package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.at;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ag.class */
public final class ag extends ae {

    /* renamed from: a, reason: collision with root package name */
    public Query f1232a;
    public at b;
    public boolean c;
    public int d;

    public ag(a aVar) {
        super(aVar, 72);
        this.f1232a = Query.b;
    }

    public final com.google.android.apps.gsa.search.core.l.aq a() {
        at atVar = this.b;
        if (atVar == null || !atVar.h()) {
            return null;
        }
        return (com.google.android.apps.gsa.search.core.l.aq) atVar.c();
    }

    public final void b() {
        this.b = null;
        this.d = 1;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("SearchResultState");
    }

    public final String toString() {
        return "SRS";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        b();
    }
}
