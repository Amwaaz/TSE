package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/ac.class */
final class ac extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    boolean f178a;
    final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(Context context, m.c.g gVar) {
        super(2, gVar);
        this.b = context;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return c(bool, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        androidx.work.impl.utils.g.a(this.b, RescheduleReceiver.class, this.f178a);
        return w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        ac acVar = new ac(this.b, gVar);
        acVar.f178a = ((Boolean) obj).booleanValue();
        return acVar;
    }
}
