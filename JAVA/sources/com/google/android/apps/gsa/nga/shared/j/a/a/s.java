package com.google.android.apps.gsa.nga.shared.j.a.a;

import com.google.common.util.concurrent.cn;
import kotlinx.coroutines.c.i;
import m.c.a.a;
import m.c.b.a.h;
import m.c.g;
import m.h.a.l;
import m.k;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/s.class */
final class s extends h implements l {

    /* renamed from: a, reason: collision with root package name */
    int f953a;
    final y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, g gVar) {
        super(1, gVar);
        this.b = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new s(this.b, (g) obj).b(m.w.a);
    }

    public final Object b(Object obj) {
        a aVar = a.a;
        int i = this.f953a;
        k.b(obj);
        if (i == 0) {
            cn d = this.b.c.d();
            this.f953a = 1;
            Object b = i.b(d, this);
            obj = b;
            if (b == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
