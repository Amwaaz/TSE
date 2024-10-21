package androidx.d;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:androidx/d/g.class */
public class g extends bk implements Map, j$.util.Map {

    /* renamed from: a, reason: collision with root package name */
    a f50a;
    c b;
    e c;

    public g() {
        super(0);
    }

    public g(int i) {
        super(i);
    }

    public g(bk bkVar) {
        super(0);
        if (bkVar != null) {
            j(bkVar);
        }
    }

    public final boolean a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(e(i2))) {
                f(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map._CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map._CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map._CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f50a;
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new a(this);
            this.f50a = aVar2;
        }
        return aVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map._CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.b;
        c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = new c(this);
            this.b = cVar2;
        }
        return cVar2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map._CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        i(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map._CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.c;
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = new e(this);
            this.c = eVar2;
        }
        return eVar2;
    }
}
