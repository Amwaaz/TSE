package androidx.work.impl.b;

import android.database.Cursor;
import androidx.room.bb;
import androidx.room.bi;
import java.util.TreeMap;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/g.class */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.ao f194a;
    private final androidx.room.h b;

    public g(androidx.room.ao aoVar) {
        this.f194a = aoVar;
        this.b = new f(aoVar);
    }

    @Override // androidx.work.impl.b.e
    public final Long a(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT long_value FROM Preference where `key`=?", 1);
        d.e(1, str);
        this.f194a.q();
        Cursor i = androidx.room.g.m.i(this.f194a, d, false);
        try {
            Long l = null;
            if (i.moveToFirst()) {
                l = i.isNull(0) ? null : Long.valueOf(i.getLong(0));
            }
            i.close();
            d.i();
            return l;
        } catch (Throwable th) {
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.e
    public final void b(d dVar) {
        this.f194a.q();
        this.f194a.r();
        try {
            this.b.b(dVar);
            this.f194a.w();
        } finally {
            this.f194a.s();
        }
    }
}
