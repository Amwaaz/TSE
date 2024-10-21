package androidx.work;

import com.google.common.util.concurrent.cn;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes-dex2jar.jar:androidx/work/av.class */
public abstract class av {
    public abstract ak a(String str);

    public abstract ak b(String str);

    public abstract ak c(UUID uuid);

    public final ak d(ay ayVar) {
        ayVar.getClass();
        List singletonList = Collections.singletonList(ayVar);
        singletonList.getClass();
        return e(singletonList);
    }

    public abstract ak e(List list);

    public abstract ak f();

    public abstract cn g(aw awVar);

    public abstract cn h(String str);

    public abstract ak i(String str, int i, List list);

    public abstract ak j(String str, r rVar, ay ayVar);

    public final ak k(String str, int i, ay ayVar) {
        ayVar.getClass();
        List singletonList = Collections.singletonList(ayVar);
        singletonList.getClass();
        return i(str, i, singletonList);
    }
}
