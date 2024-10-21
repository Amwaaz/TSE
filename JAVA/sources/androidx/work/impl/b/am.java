package androidx.work.impl.b;

import androidx.u.a.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/am.class */
public final class am extends androidx.room.h {
    public am(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.h
    protected final /* bridge */ /* synthetic */ void a(j jVar, Object obj) {
        ac acVar = (ac) obj;
        jVar.e(1, acVar.b);
        jVar.c(2, bc.b(acVar.c));
        jVar.e(3, acVar.d);
        jVar.e(4, acVar.e);
        androidx.work.l lVar = acVar.f;
        androidx.work.l lVar2 = androidx.work.l.f224a;
        jVar.a(5, androidx.work.au.c(lVar));
        jVar.a(6, androidx.work.au.c(acVar.g));
        jVar.c(7, acVar.h);
        jVar.c(8, acVar.i);
        jVar.c(9, acVar.j);
        jVar.c(10, acVar.l);
        jVar.c(11, bc.a(acVar.m));
        jVar.c(12, acVar.n);
        jVar.c(13, acVar.o);
        jVar.c(14, acVar.p);
        jVar.c(15, acVar.q);
        jVar.c(16, acVar.r ? 1L : 0L);
        jVar.c(17, bc.k(acVar.y));
        jVar.c(18, acVar.s);
        jVar.c(19, acVar.t);
        jVar.c(20, acVar.u);
        jVar.c(21, acVar.v);
        jVar.c(22, acVar.w);
        String str = acVar.x;
        if (str == null) {
            jVar.d(23);
        } else {
            jVar.e(23, str);
        }
        androidx.work.g gVar = acVar.k;
        jVar.c(24, bc.i(gVar.j));
        jVar.a(25, bc.g(gVar.b));
        jVar.c(26, gVar.c ? 1L : 0L);
        jVar.c(27, gVar.d ? 1L : 0L);
        jVar.c(28, gVar.e ? 1L : 0L);
        jVar.c(29, gVar.f ? 1L : 0L);
        jVar.c(30, gVar.g);
        jVar.c(31, gVar.h);
        jVar.a(32, bc.h(gVar.i));
    }

    @Override // androidx.room.bc
    protected final String e() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
