package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.b.b;
import m.h.a.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/work/impl/aw.class */
public final /* synthetic */ class aw extends m.h.b.k implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final aw f188a = new aw();

    public aw() {
        super(6, m.h.b.k.d, ax.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        androidx.work.c cVar = (androidx.work.c) obj2;
        b bVar = (b) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        androidx.work.impl.a.b.p pVar = (androidx.work.impl.a.b.p) obj5;
        p pVar2 = (p) obj6;
        context.getClass();
        cVar.getClass();
        bVar.getClass();
        workDatabase.getClass();
        pVar.getClass();
        String str = u.f211a;
        androidx.work.impl.background.systemjob.c cVar2 = new androidx.work.impl.background.systemjob.c(context, workDatabase, cVar);
        androidx.work.impl.utils.g.a(context, SystemJobService.class, true);
        androidx.work.af.a().c(u.f211a, "Created SystemJobScheduler and enabled SystemJobService");
        return m.a.t.aO(new r[]{cVar2, new androidx.work.impl.background.a.d(context, cVar, pVar, pVar2, new at(pVar2, bVar), bVar)});
    }
}
