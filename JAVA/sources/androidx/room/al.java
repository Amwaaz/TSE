package androidx.room;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes-dex2jar.jar:androidx/room/al.class */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public final Map f89a = new LinkedHashMap();

    public final void a(androidx.room.e.a aVar) {
        aVar.getClass();
        int i = aVar.f118a;
        Map map = this.f89a;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        Object obj2 = obj;
        if (obj == null) {
            obj2 = new TreeMap();
            map.put(valueOf, obj2);
        }
        TreeMap treeMap = (TreeMap) obj2;
        Integer valueOf2 = Integer.valueOf(aVar.b);
        if (treeMap.containsKey(valueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + aVar);
        }
        treeMap.put(valueOf2, aVar);
    }
}
