package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/room/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f108a;
    public final String b;
    public final androidx.u.a.f c;
    public final al d;
    public final List e;
    public final boolean f;
    public final Executor g;
    public final Executor h;
    public final Intent i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;
    public final m.c.n o;
    public final int p;

    public c(Context context, String str, androidx.u.a.f fVar, al alVar, List list, boolean z, int i, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, List list2, List list3, m.c.n nVar) {
        this.f108a = context;
        this.b = str;
        this.c = fVar;
        this.d = alVar;
        this.e = list;
        this.f = z;
        this.p = i;
        this.g = executor;
        this.h = executor2;
        this.i = intent;
        this.j = z2;
        this.k = z3;
        this.l = set;
        this.m = list2;
        this.n = list3;
        this.o = nVar;
    }
}
