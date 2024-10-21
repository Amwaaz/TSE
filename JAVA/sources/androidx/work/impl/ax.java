package androidx.work.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/ax.class */
public final class ax {
    public static final File a(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }
}
