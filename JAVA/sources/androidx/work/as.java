package androidx.work;

/* loaded from: classes-dex2jar.jar:androidx/work/as.class */
public enum as {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
