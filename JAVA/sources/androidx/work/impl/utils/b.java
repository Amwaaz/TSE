package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.av;
import m.h.a.a;
import m.h.b.n;
import m.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/b.class */
public final class b extends n implements a {

    /* renamed from: a, reason: collision with root package name */
    final av f214a;
    final Object b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(av avVar, Object obj, int i) {
        super(0);
        this.c = i;
        this.f214a = avVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, av avVar, int i) {
        super(0);
        this.c = i;
        this.b = str;
        this.f214a = avVar;
    }

    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            o.m((String) this.b, this.f214a);
            o.n(this.f214a);
            return w.a;
        }
        if (i != 1) {
            av avVar = this.f214a;
            WorkDatabase workDatabase = avVar.e;
            workDatabase.getClass();
            workDatabase.v(new c(workDatabase, (String) this.b, avVar, 0));
            o.n(this.f214a);
            return w.a;
        }
        av avVar2 = this.f214a;
        WorkDatabase workDatabase2 = avVar2.e;
        workDatabase2.getClass();
        workDatabase2.v(new a(avVar2, this.b, 0));
        o.n(this.f214a);
        return w.a;
    }
}
