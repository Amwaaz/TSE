package com.google.android.apps.gsa.nga.engine.ui.e.e;

import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.b.oo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/e/a.class */
public final class a {

    /* renamed from: a */
    public static final a f705a;
    public final com.google.android.apps.gsa.nga.shared.aa.a.a b;
    public final fl c;

    static {
        com.google.android.apps.gsa.nga.shared.aa.a.a aVar = com.google.android.apps.gsa.nga.shared.aa.a.a.f834a;
        int i = fl.e;
        f705a = new a(aVar, ni.a);
    }

    public a() {
        throw null;
    }

    public a(com.google.android.apps.gsa.nga.shared.aa.a.a aVar, fl flVar) {
        if (aVar == null) {
            throw new NullPointerException("Null presentation");
        }
        this.b = aVar;
        if (flVar == null) {
            throw new NullPointerException("Null chips");
        }
        this.c = flVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && oo.R(this.c, aVar.c);
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        fl flVar = this.c;
        return "AfterExecutionSuggestions{presentation=" + this.b.toString() + ", chips=" + flVar.toString() + "}";
    }
}
