package androidx.work.impl.b;

import android.database.Cursor;
import androidx.room.bb;
import androidx.room.bi;
import androidx.u.a.j;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/p.class */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.ao f196a;
    public final androidx.room.bc b;
    private final androidx.room.h c;
    private final androidx.room.bc d;

    public p(androidx.room.ao aoVar) {
        this.f196a = aoVar;
        this.c = new m(aoVar);
        this.b = new n(aoVar);
        this.d = new o(aoVar);
    }

    @Override // androidx.work.impl.b.l
    public final /* synthetic */ k a(r rVar) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        d.e(1, rVar.f197a);
        d.c(2, rVar.b);
        this.f196a.q();
        Cursor i = androidx.room.g.m.i(this.f196a, d, false);
        try {
            k kVar = i.moveToFirst() ? new k(i.getString(androidx.room.g.m.k(i, "work_spec_id")), i.getInt(androidx.room.g.m.k(i, "generation")), i.getInt(androidx.room.g.m.k(i, "system_id"))) : null;
            i.close();
            d.i();
            return kVar;
        } catch (Throwable th) {
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.l
    public final List b() {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f196a.q();
        Cursor i = androidx.room.g.m.i(this.f196a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.l
    public final void c(k kVar) {
        this.f196a.q();
        this.f196a.r();
        try {
            this.c.b(kVar);
            this.f196a.w();
        } finally {
            this.f196a.s();
        }
    }

    @Override // androidx.work.impl.b.l
    public final /* synthetic */ void d(r rVar) {
        this.f196a.q();
        j c = this.b.c();
        c.e(1, rVar.f197a);
        c.c(2, rVar.b);
        try {
            this.f196a.r();
            try {
                c.f();
                this.f196a.w();
            } finally {
                this.f196a.s();
            }
        } finally {
            this.b.f(c);
        }
    }

    @Override // androidx.work.impl.b.l
    public final void e(String str) {
        this.f196a.q();
        j c = this.d.c();
        c.e(1, str);
        try {
            this.f196a.r();
            try {
                c.f();
                this.f196a.w();
            } finally {
                this.f196a.s();
            }
        } finally {
            this.d.f(c);
        }
    }
}
