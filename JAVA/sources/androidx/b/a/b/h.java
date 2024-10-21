package androidx.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes-dex2jar.jar:androidx/b/a/b/h.class */
public class h implements Iterable {
    public d b;
    public d c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected d a(Object obj) {
        d dVar;
        d dVar2 = this.b;
        while (true) {
            dVar = dVar2;
            if (dVar == null || dVar.f41a.equals(obj)) {
                break;
            }
            dVar2 = dVar.c;
        }
        return dVar;
    }

    public Object b(Object obj) {
        d a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((g) it.next()).eq(a2);
            }
        }
        d dVar = a2.d;
        d dVar2 = a2.c;
        if (dVar != null) {
            dVar.c = dVar2;
        } else {
            this.b = dVar2;
        }
        d dVar3 = a2.c;
        if (dVar3 != null) {
            dVar3.d = dVar;
        } else {
            this.c = dVar;
        }
        a2.c = null;
        a2.d = null;
        return a2.b;
    }

    public final d c(Object obj, Object obj2) {
        d dVar = new d(obj, obj2);
        this.e++;
        d dVar2 = this.c;
        if (dVar2 == null) {
            this.b = dVar;
        } else {
            dVar2.c = dVar;
            dVar.d = dVar2;
        }
        this.c = dVar;
        return dVar;
    }

    public final e d() {
        e eVar = new e(this);
        this.d.put(eVar, false);
        return eVar;
    }

    public final Object e(Object obj, Object obj2) {
        d a2 = a(obj);
        if (a2 != null) {
            return a2.b;
        }
        c(obj, obj2);
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.e != hVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = hVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            Object obj2 = next;
            if (entry == null) {
                if (next != null) {
                    return false;
                }
                obj2 = null;
            }
            if (entry != null && !entry.equals(obj2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = i2 + ((Map.Entry) it.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.b, this.c);
        this.d.put(bVar, false);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
