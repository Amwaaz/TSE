package androidx.room;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes-dex2jar.jar:androidx/room/p.class */
final class p {

    /* renamed from: a */
    public final Context f133a;
    public final String b;
    public final Intent c;

    public p(Context context, String str, Intent intent) {
        this.f133a = context;
        this.b = str;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a.a.p.b.a.f.h(this.f133a, pVar.f133a) && h.a.a.p.b.a.f.h(this.b, pVar.b) && h.a.a.p.b.a.f.h(this.c, pVar.c);
    }

    public final int hashCode() {
        return (((this.f133a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MultiInstanceClientInitState(context=" + this.f133a + ", name=" + this.b + ", serviceIntent=" + this.c + ')';
    }
}
