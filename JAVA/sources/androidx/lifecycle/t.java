package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/t.class */
public final class t {
    public static final u a(v vVar) {
        vVar.getClass();
        int ordinal = vVar.ordinal();
        if (ordinal == 2) {
            return u.ON_DESTROY;
        }
        if (ordinal == 3) {
            return u.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return u.ON_PAUSE;
    }

    public static final u b(v vVar) {
        vVar.getClass();
        int ordinal = vVar.ordinal();
        if (ordinal == 1) {
            return u.ON_CREATE;
        }
        if (ordinal == 2) {
            return u.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return u.ON_RESUME;
    }

    public static final u c(v vVar) {
        vVar.getClass();
        int ordinal = vVar.ordinal();
        if (ordinal == 2) {
            return u.ON_CREATE;
        }
        if (ordinal == 3) {
            return u.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return u.ON_RESUME;
    }

    public static final v d(v vVar, v vVar2) {
        vVar.getClass();
        return (vVar2 == null || vVar2.compareTo(vVar) >= 0) ? vVar : vVar2;
    }
}
