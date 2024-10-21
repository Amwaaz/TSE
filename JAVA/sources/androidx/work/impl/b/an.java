package androidx.work.impl.b;

import android.database.Cursor;
import androidx.room.bb;
import java.util.concurrent.Callable;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/an.class */
public final class an implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final bb f191a;
    final aw b;

    public an(aw awVar, bb bbVar) {
        this.b = awVar;
        this.f191a = bbVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        Boolean bool;
        boolean z = false;
        Cursor i = androidx.room.g.m.i(this.b.f192a, this.f191a, false);
        try {
            if (i.moveToFirst()) {
                if (i.getInt(0) != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = false;
            }
            i.close();
            return bool;
        } catch (Throwable th) {
            i.close();
            throw th;
        }
    }

    protected final void finalize() {
        this.f191a.i();
    }
}
