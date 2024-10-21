package androidx.work.impl;

import android.content.Context;
import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/q.class */
public final class q extends androidx.room.e.a {
    private final Context c;

    public q(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        if (this.b >= 10) {
            bVar.o(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
