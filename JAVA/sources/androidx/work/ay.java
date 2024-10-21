package androidx.work;

import androidx.work.impl.b.ac;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes-dex2jar.jar:androidx/work/ay.class */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f164a;
    public final ac b;
    public final Set c;

    public ay(ag agVar) {
        this(agVar.b, agVar.c, agVar.d);
    }

    public ay(UUID uuid, ac acVar, Set set) {
        uuid.getClass();
        acVar.getClass();
        this.f164a = uuid;
        this.b = acVar;
        this.c = set;
    }

    public final String a() {
        String uuid = this.f164a.toString();
        uuid.getClass();
        return uuid;
    }
}
