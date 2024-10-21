package androidx.room;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:androidx/room/y.class */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f139a;
    public final u b;
    public final Context c;
    public final kotlinx.coroutines.ag d;
    public int f;
    public o g;
    public final w h;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final l i = new k(this);
    public final ServiceConnection j = new x(this);

    public y(Context context, String str, u uVar) {
        this.f139a = str;
        this.b = uVar;
        this.c = context.getApplicationContext();
        this.d = uVar.f137a.o();
        this.h = new w(this, uVar.b);
    }
}
