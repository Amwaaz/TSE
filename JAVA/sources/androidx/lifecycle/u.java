package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/u.class */
public enum u {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final t Companion = new t();

    public final v a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return v.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return v.DESTROYED;
                        }
                        toString();
                        throw new IllegalArgumentException(toString().concat(" has no target state"));
                    }
                }
            }
            return v.STARTED;
        }
        return v.CREATED;
    }
}
