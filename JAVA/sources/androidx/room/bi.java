package androidx.room;

import android.content.Context;
import androidx.u.a.b;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/room/bi.class */
public class bi {
    public static String b(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static Object c(af afVar, String str, m.c.g gVar) {
        Object a2 = afVar.a(str, bk.b, gVar);
        return a2 == m.c.a.a.a ? a2 : m.w.a;
    }

    public static bb d(String str, int i) {
        synchronized (bb.f94a) {
            Map.Entry ceilingEntry = bb.f94a.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                bb bbVar = new bb(i);
                bbVar.b = str;
                bbVar.h = i;
                return bbVar;
            }
            bb.f94a.remove(ceilingEntry.getKey());
            bb bbVar2 = (bb) ceilingEntry.getValue();
            bbVar2.b = str;
            bbVar2.h = i;
            bbVar2.getClass();
            return bbVar2;
        }
    }

    public static bb e(androidx.u.a.i iVar) {
        androidx.u.a.a aVar = (androidx.u.a.a) iVar;
        Object[] objArr = aVar.b;
        bb d = d(aVar.f142a, objArr != null ? objArr.length : 0);
        androidx.u.a.d.b(new ba(d), aVar.b);
        return d;
    }

    public static ak h(Context context, Class cls, String str) {
        context.getClass();
        if (str == null || m.p.s.F(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (h.a.a.p.b.a.f.h(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new ak(context, cls, str);
    }

    public static ak i(Context context, Class cls) {
        context.getClass();
        return new ak(context, cls, null);
    }

    public void a(b bVar) {
    }

    public void f() {
    }

    public void g() {
    }
}
