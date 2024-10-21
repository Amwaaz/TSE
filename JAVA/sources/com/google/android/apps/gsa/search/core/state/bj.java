package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import e.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/bj.class */
public final class bj implements com.google.android.apps.gsa.shared.util.debug.a.g {

    /* renamed from: a, reason: collision with root package name */
    int f1247a = 0;
    public Query b = Query.b;
    public SearchError c;
    public ActionData d;
    public boolean e;
    private final a f;

    public bj(a aVar) {
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SearchError a(Query query) {
        if (h(query)) {
            return this.c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Query query) {
        com.google.common.f.j jVar = bk.f1248a;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        this.b = query;
        this.d = null;
        e(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        com.google.common.f.j jVar = bk.f1248a;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        e(0);
        this.b = Query.b;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        SearchError searchError;
        com.google.common.f.j jVar = bk.f1248a;
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        int i2 = i;
        if (i == 1) {
            this.e = false;
            i2 = 1;
        }
        if (i2 == 4) {
            searchError = this.c;
            searchError.getClass();
            i2 = 4;
        } else {
            searchError = null;
        }
        this.c = searchError;
        ab abVar2 = (ab) this.f.a();
        abVar2.c = this.c;
        if (abVar2.c()) {
            abVar2.an();
        }
        this.f1247a = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return this.f1247a == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(Query query) {
        boolean z = false;
        if (h(query)) {
            int i = this.f1247a;
            if (i == 2) {
                z = true;
            } else {
                if (i == 1) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(Query query) {
        return this.b.r == query.r;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q(a.a.bh(this.f1247a));
        fVar.n("Current Query", this.b);
        fVar.n("Loaded data", this.d);
        fVar.b("Voice done").a(new d(Boolean.valueOf(this.e), false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(Query query) {
        boolean z = false;
        if (h(query)) {
            int i = this.f1247a;
            if (i == 5) {
                z = true;
            } else {
                if (i == 6) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        return a.a.bh(this.f1247a) + ":" + String.valueOf(this.b) + " D=" + String.valueOf(this.d) + " VoiceDone=" + this.e;
    }
}
