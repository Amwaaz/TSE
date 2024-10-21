package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ab.class */
public final class ab extends ae {

    /* renamed from: a, reason: collision with root package name */
    public Query f1229a;
    public SearchError b;
    public SearchError c;
    public SearchError d;
    private final a e;
    private final a f;
    private final a g;

    public ab(a aVar, a aVar2, a aVar3, a aVar4) {
        super(aVar, 74);
        this.f1229a = Query.b;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
    }

    public final SearchError a(Query query) {
        if (this.f1229a.co(query)) {
            return this.d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(SearchError searchError) {
        this.b = searchError;
        if (c()) {
            an();
        }
    }

    public final boolean c() {
        SearchError searchError;
        boolean e;
        SearchError searchError2;
        Query query = ((bk) this.f.a()).m;
        if (!query.dg()) {
            ActionData a2 = ((ba) this.e.a()).a(query);
            if (a2 != null && !a2.equals(ActionData.a)) {
                return e(null);
            }
            if ((!((ba) this.e.a()).f(query) || a2 != null || this.c == null) && (searchError = this.c) != null) {
                return e(searchError);
            }
            return e(null);
        }
        Query query2 = ((bk) this.f.a()).m;
        SearchError searchError3 = this.b;
        boolean z = false;
        boolean z2 = query2.cS() || query2.ca();
        if (this.c != null || ((bk) this.f.a()).J(query2)) {
            z = true;
        }
        if (searchError3 != null && z2 && z) {
            e = e(this.c);
        } else {
            e = (!z2 || ((bn) this.g.a()).g(query2) || (searchError2 = this.c) == null || !searchError2.Q(4L)) ? e(this.b) : e(searchError2);
        }
        return e;
    }

    public final boolean e(SearchError searchError) {
        if (this.d == searchError) {
            return false;
        }
        this.d = searchError;
        return true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ErrorState");
        fVar.n("Error", this.d);
        SearchError searchError = this.d;
        if (searchError != null) {
            fVar.j("Search Error", searchError.O());
        }
    }

    public final String toString() {
        SearchError searchError = this.d;
        return a.a.dC(searchError == null ? "null" : searchError.toString(), "ErrorState{Error={", "}}");
    }
}
