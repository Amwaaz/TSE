package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.af;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/systemjob/b.class */
final class b {

    /* renamed from: a */
    public static final String f207a = af.b("SystemJobInfoConverter");
    public final ComponentName b;

    public b(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
