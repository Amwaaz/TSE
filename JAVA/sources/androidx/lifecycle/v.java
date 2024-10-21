package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/v.class */
public enum v {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(v vVar) {
        vVar.getClass();
        return compareTo(vVar) >= 0;
    }
}
