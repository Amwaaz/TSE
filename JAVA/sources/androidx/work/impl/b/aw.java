package androidx.work.impl.b;

import android.database.Cursor;
import androidx.room.bb;
import androidx.room.bi;
import androidx.room.g.u;
import androidx.u.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/aw.class */
public final class aw implements ad {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.ao f192a;
    private final androidx.room.h b;
    private final androidx.room.f c;
    private final androidx.room.bc d;
    private final androidx.room.bc e;
    private final androidx.room.bc f;
    private final androidx.room.bc g;
    private final androidx.room.bc h;
    private final androidx.room.bc i;
    private final androidx.room.bc j;
    private final androidx.room.bc k;
    private final androidx.room.bc l;
    private final androidx.room.bc m;
    private final androidx.room.bc n;
    private final androidx.room.bc o;
    private final androidx.room.bc p;

    public aw(androidx.room.ao aoVar) {
        this.f192a = aoVar;
        this.b = new am(aoVar);
        this.c = new ao(aoVar);
        this.d = new ap(aoVar);
        this.e = new aq(aoVar);
        this.f = new ar(aoVar);
        this.g = new as(aoVar);
        this.h = new at(aoVar);
        this.i = new au(aoVar);
        this.j = new av(aoVar);
        this.k = new ae(aoVar);
        new af(aoVar);
        this.l = new ag(aoVar);
        this.m = new ah(aoVar);
        this.n = new ai(aoVar);
        this.o = new aj(aoVar);
        new ak(aoVar);
        this.p = new al(aoVar);
    }

    @Override // androidx.work.impl.b.ad
    public final void A(String str, long j) {
        this.f192a.q();
        j c = this.m.c();
        c.c(1, j);
        c.e(2, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.m.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void B() {
        this.f192a.q();
        j c = this.n.c();
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.n.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void C(String str) {
        this.f192a.q();
        j c = this.k.c();
        c.e(1, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.k.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void D(String str) {
        this.f192a.q();
        j c = this.f.c();
        c.e(1, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.f.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void E(androidx.work.as asVar, String str) {
        this.f192a.q();
        j c = this.e.c();
        c.c(1, bc.b(asVar));
        c.e(2, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.e.f(c);
        }
    }

    public final void F(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            u.j(hashMap, new i(this, 3));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        u.i(sb, size);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = bb.f94a;
        bb d = bi.d(sb2, size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            d.e(i, (String) it.next());
            i++;
        }
        Cursor i2 = androidx.room.g.m.i(this.f192a, d, false);
        try {
            int j = androidx.room.g.m.j(i2, "work_spec_id");
            if (j != -1) {
                while (i2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(i2.getString(j));
                    if (arrayList != null) {
                        byte[] blob = i2.getBlob(0);
                        androidx.work.l lVar = androidx.work.l.f224a;
                        arrayList.add(androidx.work.au.b(blob));
                    }
                }
            }
        } finally {
            i2.close();
        }
    }

    public final void G(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            u.j(hashMap, new i(this, 2));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        u.i(sb, size);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = bb.f94a;
        bb d = bi.d(sb2, size);
        Iterator it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            d.e(i, (String) it.next());
            i++;
        }
        Cursor i2 = androidx.room.g.m.i(this.f192a, d, false);
        try {
            int j = androidx.room.g.m.j(i2, "work_spec_id");
            if (j != -1) {
                while (i2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(i2.getString(j));
                    if (arrayList != null) {
                        arrayList.add(i2.getString(0));
                    }
                }
            }
        } finally {
            i2.close();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final int a() {
        TreeMap treeMap = bb.f94a;
        int i = 0;
        bb d = bi.d("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f192a.q();
        Cursor i2 = androidx.room.g.m.i(this.f192a, d, false);
        try {
            if (i2.moveToFirst()) {
                i = i2.getInt(0);
            }
            i2.close();
            d.i();
            return i;
        } catch (Throwable th) {
            i2.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final androidx.work.as b(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT state FROM workspec WHERE id=?", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            androidx.work.as asVar = null;
            if (i.moveToFirst()) {
                Integer valueOf = i.isNull(0) ? null : Integer.valueOf(i.getInt(0));
                asVar = valueOf == null ? null : bc.d(valueOf.intValue());
            }
            i.close();
            d.i();
            return asVar;
        } catch (Throwable th) {
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final ac c(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE id=?", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            int k = androidx.room.g.m.k(i, "id");
            int k2 = androidx.room.g.m.k(i, "state");
            int k3 = androidx.room.g.m.k(i, "worker_class_name");
            int k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            int k5 = androidx.room.g.m.k(i, "input");
            int k6 = androidx.room.g.m.k(i, "output");
            int k7 = androidx.room.g.m.k(i, "initial_delay");
            int k8 = androidx.room.g.m.k(i, "interval_duration");
            int k9 = androidx.room.g.m.k(i, "flex_duration");
            int k10 = androidx.room.g.m.k(i, "run_attempt_count");
            int k11 = androidx.room.g.m.k(i, "backoff_policy");
            int k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            int k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            int k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
            try {
                int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
                int k16 = androidx.room.g.m.k(i, "run_in_foreground");
                int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
                int k18 = androidx.room.g.m.k(i, "period_count");
                int k19 = androidx.room.g.m.k(i, "generation");
                int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
                int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
                int k22 = androidx.room.g.m.k(i, "stop_reason");
                int k23 = androidx.room.g.m.k(i, "trace_tag");
                int k24 = androidx.room.g.m.k(i, "required_network_type");
                int k25 = androidx.room.g.m.k(i, "required_network_request");
                int k26 = androidx.room.g.m.k(i, "requires_charging");
                int k27 = androidx.room.g.m.k(i, "requires_device_idle");
                int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
                int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
                int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
                int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
                int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
                ac acVar = null;
                if (i.moveToFirst()) {
                    String string = i.getString(k);
                    androidx.work.as d2 = bc.d(i.getInt(k2));
                    String string2 = i.getString(k3);
                    String string3 = i.getString(k4);
                    byte[] blob = i.getBlob(k5);
                    androidx.work.l lVar = androidx.work.l.f224a;
                    acVar = new ac(string, d2, string2, string3, androidx.work.au.b(blob), androidx.work.au.b(i.getBlob(k6)), i.getLong(k7), i.getLong(k8), i.getLong(k9), new androidx.work.g(bc.e(i.getBlob(k25)), bc.j(i.getInt(k24)), i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i.getInt(k10), bc.c(i.getInt(k11)), i.getLong(k12), i.getLong(k13), i.getLong(k14), i.getLong(k15), i.getInt(k16) != 0, bc.l(i.getInt(k17)), i.getInt(k18), i.getInt(k19), i.getLong(k20), i.getInt(k21), i.getInt(k22), i.isNull(k23) ? null : i.getString(k23));
                }
                i.close();
                d.i();
                return acVar;
            } catch (Throwable th) {
                th = th;
                i.close();
                d.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List d() {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List e(int i) {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        d.c(1, i);
        this.f192a.q();
        Cursor i2 = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i2, "id");
            k2 = androidx.room.g.m.k(i2, "state");
            k3 = androidx.room.g.m.k(i2, "worker_class_name");
            k4 = androidx.room.g.m.k(i2, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i2, "input");
            k6 = androidx.room.g.m.k(i2, "output");
            k7 = androidx.room.g.m.k(i2, "initial_delay");
            k8 = androidx.room.g.m.k(i2, "interval_duration");
            k9 = androidx.room.g.m.k(i2, "flex_duration");
            k10 = androidx.room.g.m.k(i2, "run_attempt_count");
            k11 = androidx.room.g.m.k(i2, "backoff_policy");
            k12 = androidx.room.g.m.k(i2, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i2, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i2, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i2, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i2, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i2, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i2, "period_count");
            int k19 = androidx.room.g.m.k(i2, "generation");
            int k20 = androidx.room.g.m.k(i2, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i2, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i2, "stop_reason");
            int k23 = androidx.room.g.m.k(i2, "trace_tag");
            int k24 = androidx.room.g.m.k(i2, "required_network_type");
            int k25 = androidx.room.g.m.k(i2, "required_network_request");
            int k26 = androidx.room.g.m.k(i2, "requires_charging");
            int k27 = androidx.room.g.m.k(i2, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i2, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i2, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i2, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i2, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i2, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i2.getCount());
            while (i2.moveToNext()) {
                String string = i2.getString(k);
                androidx.work.as d2 = bc.d(i2.getInt(k2));
                String string2 = i2.getString(k3);
                String string3 = i2.getString(k4);
                byte[] blob = i2.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                arrayList.add(new ac(string, d2, string2, string3, androidx.work.au.b(blob), androidx.work.au.b(i2.getBlob(k6)), i2.getLong(k7), i2.getLong(k8), i2.getLong(k9), new androidx.work.g(bc.e(i2.getBlob(k25)), bc.j(i2.getInt(k24)), i2.getInt(k26) != 0, i2.getInt(k27) != 0, i2.getInt(k28) != 0, i2.getInt(k29) != 0, i2.getLong(k30), i2.getLong(k31), bc.f(i2.getBlob(k32))), i2.getInt(k10), bc.c(i2.getInt(k11)), i2.getLong(k12), i2.getLong(k13), i2.getLong(k14), i2.getLong(k15), i2.getInt(k16) != 0, bc.l(i2.getInt(k17)), i2.getInt(k18), i2.getInt(k19), i2.getLong(k20), i2.getInt(k21), i2.getInt(k22), i2.isNull(k23) ? null : i2.getString(k23)));
            }
            i2.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i2.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List f() {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i, "id");
            k2 = androidx.room.g.m.k(i, "state");
            k3 = androidx.room.g.m.k(i, "worker_class_name");
            k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i, "input");
            k6 = androidx.room.g.m.k(i, "output");
            k7 = androidx.room.g.m.k(i, "initial_delay");
            k8 = androidx.room.g.m.k(i, "interval_duration");
            k9 = androidx.room.g.m.k(i, "flex_duration");
            k10 = androidx.room.g.m.k(i, "run_attempt_count");
            k11 = androidx.room.g.m.k(i, "backoff_policy");
            k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i, "period_count");
            int k19 = androidx.room.g.m.k(i, "generation");
            int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i, "stop_reason");
            int k23 = androidx.room.g.m.k(i, "trace_tag");
            int k24 = androidx.room.g.m.k(i, "required_network_type");
            int k25 = androidx.room.g.m.k(i, "required_network_request");
            int k26 = androidx.room.g.m.k(i, "requires_charging");
            int k27 = androidx.room.g.m.k(i, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                String string = i.getString(k);
                androidx.work.as d2 = bc.d(i.getInt(k2));
                String string2 = i.getString(k3);
                String string3 = i.getString(k4);
                byte[] blob = i.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                androidx.work.l b = androidx.work.au.b(blob);
                androidx.work.l b2 = androidx.work.au.b(i.getBlob(k6));
                long j = i.getLong(k7);
                long j2 = i.getLong(k8);
                long j3 = i.getLong(k9);
                int i2 = i.getInt(k10);
                androidx.work.a c = bc.c(i.getInt(k11));
                long j4 = i.getLong(k12);
                long j5 = i.getLong(k13);
                long j6 = i.getLong(k14);
                long j7 = i.getLong(k15);
                boolean z = i.getInt(k16) != 0;
                int l = bc.l(i.getInt(k17));
                int i3 = i.getInt(k18);
                int i4 = i.getInt(k19);
                long j8 = i.getLong(k20);
                int i5 = i.getInt(k21);
                int i6 = i.getInt(k22);
                String string4 = i.isNull(k23) ? null : i.getString(k23);
                int j9 = bc.j(i.getInt(k24));
                arrayList.add(new ac(string, d2, string2, string3, b, b2, j, j2, j3, new androidx.work.g(bc.e(i.getBlob(k25)), j9, i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i2, c, j4, j5, j6, j7, z, l, i3, i4, j8, i5, i6, string4));
            }
            i.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List g(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                byte[] blob = i.getBlob(0);
                androidx.work.l lVar = androidx.work.l.f224a;
                arrayList.add(androidx.work.au.b(blob));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List h(long j) {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        d.c(1, j);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i, "id");
            k2 = androidx.room.g.m.k(i, "state");
            k3 = androidx.room.g.m.k(i, "worker_class_name");
            k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i, "input");
            k6 = androidx.room.g.m.k(i, "output");
            k7 = androidx.room.g.m.k(i, "initial_delay");
            k8 = androidx.room.g.m.k(i, "interval_duration");
            k9 = androidx.room.g.m.k(i, "flex_duration");
            k10 = androidx.room.g.m.k(i, "run_attempt_count");
            k11 = androidx.room.g.m.k(i, "backoff_policy");
            k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i, "period_count");
            int k19 = androidx.room.g.m.k(i, "generation");
            int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i, "stop_reason");
            int k23 = androidx.room.g.m.k(i, "trace_tag");
            int k24 = androidx.room.g.m.k(i, "required_network_type");
            int k25 = androidx.room.g.m.k(i, "required_network_request");
            int k26 = androidx.room.g.m.k(i, "requires_charging");
            int k27 = androidx.room.g.m.k(i, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                String string = i.getString(k);
                androidx.work.as d2 = bc.d(i.getInt(k2));
                String string2 = i.getString(k3);
                String string3 = i.getString(k4);
                byte[] blob = i.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                androidx.work.l b = androidx.work.au.b(blob);
                androidx.work.l b2 = androidx.work.au.b(i.getBlob(k6));
                long j2 = i.getLong(k7);
                long j3 = i.getLong(k8);
                long j4 = i.getLong(k9);
                int i2 = i.getInt(k10);
                androidx.work.a c = bc.c(i.getInt(k11));
                long j5 = i.getLong(k12);
                long j6 = i.getLong(k13);
                long j7 = i.getLong(k14);
                long j8 = i.getLong(k15);
                boolean z = i.getInt(k16) != 0;
                int l = bc.l(i.getInt(k17));
                int i3 = i.getInt(k18);
                int i4 = i.getInt(k19);
                long j9 = i.getLong(k20);
                int i5 = i.getInt(k21);
                int i6 = i.getInt(k22);
                String string4 = i.isNull(k23) ? null : i.getString(k23);
                int j10 = bc.j(i.getInt(k24));
                arrayList.add(new ac(string, d2, string2, string3, b, b2, j2, j3, j4, new androidx.work.g(bc.e(i.getBlob(k25)), j10, i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i2, c, j5, j6, j7, j8, z, l, i3, i4, j9, i5, i6, string4));
            }
            i.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List i() {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE state=1", 0);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i, "id");
            k2 = androidx.room.g.m.k(i, "state");
            k3 = androidx.room.g.m.k(i, "worker_class_name");
            k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i, "input");
            k6 = androidx.room.g.m.k(i, "output");
            k7 = androidx.room.g.m.k(i, "initial_delay");
            k8 = androidx.room.g.m.k(i, "interval_duration");
            k9 = androidx.room.g.m.k(i, "flex_duration");
            k10 = androidx.room.g.m.k(i, "run_attempt_count");
            k11 = androidx.room.g.m.k(i, "backoff_policy");
            k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i, "period_count");
            int k19 = androidx.room.g.m.k(i, "generation");
            int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i, "stop_reason");
            int k23 = androidx.room.g.m.k(i, "trace_tag");
            int k24 = androidx.room.g.m.k(i, "required_network_type");
            int k25 = androidx.room.g.m.k(i, "required_network_request");
            int k26 = androidx.room.g.m.k(i, "requires_charging");
            int k27 = androidx.room.g.m.k(i, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                String string = i.getString(k);
                androidx.work.as d2 = bc.d(i.getInt(k2));
                String string2 = i.getString(k3);
                String string3 = i.getString(k4);
                byte[] blob = i.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                androidx.work.l b = androidx.work.au.b(blob);
                androidx.work.l b2 = androidx.work.au.b(i.getBlob(k6));
                long j = i.getLong(k7);
                long j2 = i.getLong(k8);
                long j3 = i.getLong(k9);
                int i2 = i.getInt(k10);
                androidx.work.a c = bc.c(i.getInt(k11));
                long j4 = i.getLong(k12);
                long j5 = i.getLong(k13);
                long j6 = i.getLong(k14);
                long j7 = i.getLong(k15);
                boolean z = i.getInt(k16) != 0;
                int l = bc.l(i.getInt(k17));
                int i3 = i.getInt(k18);
                int i4 = i.getInt(k19);
                long j8 = i.getLong(k20);
                int i5 = i.getInt(k21);
                int i6 = i.getInt(k22);
                String string4 = i.isNull(k23) ? null : i.getString(k23);
                int j9 = bc.j(i.getInt(k24));
                arrayList.add(new ac(string, d2, string2, string3, b, b2, j, j2, j3, new androidx.work.g(bc.e(i.getBlob(k25)), j9, i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i2, c, j4, j5, j6, j7, z, l, i3, i4, j8, i5, i6, string4));
            }
            i.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List j() {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i, "id");
            k2 = androidx.room.g.m.k(i, "state");
            k3 = androidx.room.g.m.k(i, "worker_class_name");
            k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i, "input");
            k6 = androidx.room.g.m.k(i, "output");
            k7 = androidx.room.g.m.k(i, "initial_delay");
            k8 = androidx.room.g.m.k(i, "interval_duration");
            k9 = androidx.room.g.m.k(i, "flex_duration");
            k10 = androidx.room.g.m.k(i, "run_attempt_count");
            k11 = androidx.room.g.m.k(i, "backoff_policy");
            k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i, "period_count");
            int k19 = androidx.room.g.m.k(i, "generation");
            int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i, "stop_reason");
            int k23 = androidx.room.g.m.k(i, "trace_tag");
            int k24 = androidx.room.g.m.k(i, "required_network_type");
            int k25 = androidx.room.g.m.k(i, "required_network_request");
            int k26 = androidx.room.g.m.k(i, "requires_charging");
            int k27 = androidx.room.g.m.k(i, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                String string = i.getString(k);
                androidx.work.as d2 = bc.d(i.getInt(k2));
                String string2 = i.getString(k3);
                String string3 = i.getString(k4);
                byte[] blob = i.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                androidx.work.l b = androidx.work.au.b(blob);
                androidx.work.l b2 = androidx.work.au.b(i.getBlob(k6));
                long j = i.getLong(k7);
                long j2 = i.getLong(k8);
                long j3 = i.getLong(k9);
                int i2 = i.getInt(k10);
                androidx.work.a c = bc.c(i.getInt(k11));
                long j4 = i.getLong(k12);
                long j5 = i.getLong(k13);
                long j6 = i.getLong(k14);
                long j7 = i.getLong(k15);
                boolean z = i.getInt(k16) != 0;
                int l = bc.l(i.getInt(k17));
                int i3 = i.getInt(k18);
                int i4 = i.getInt(k19);
                long j8 = i.getLong(k20);
                int i5 = i.getInt(k21);
                int i6 = i.getInt(k22);
                String string4 = i.isNull(k23) ? null : i.getString(k23);
                int j9 = bc.j(i.getInt(k24));
                arrayList.add(new ac(string, d2, string2, string3, b, b2, j, j2, j3, new androidx.work.g(bc.e(i.getBlob(k25)), j9, i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i2, c, j4, j5, j6, j7, z, l, i3, i4, j8, i5, i6, string4));
            }
            i.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List k(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List l(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List m(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d.e(1, str);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(new aa(i.getString(0), bc.d(i.getInt(1))));
            }
            return arrayList;
        } finally {
            i.close();
            d.i();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List n(String str) {
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d.e(1, str);
        this.f192a.q();
        this.f192a.r();
        try {
            Cursor i = androidx.room.g.m.i(this.f192a, d, true);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (i.moveToNext()) {
                    String string = i.getString(0);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = i.getString(0);
                    if (!hashMap2.containsKey(string2)) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                i.moveToPosition(-1);
                G(hashMap);
                F(hashMap2);
                ArrayList arrayList = new ArrayList(i.getCount());
                while (i.moveToNext()) {
                    String string3 = i.getString(0);
                    androidx.work.as d2 = bc.d(i.getInt(1));
                    byte[] blob = i.getBlob(2);
                    androidx.work.l lVar = androidx.work.l.f224a;
                    androidx.work.l b = androidx.work.au.b(blob);
                    int i2 = i.getInt(3);
                    int i3 = i.getInt(4);
                    long j = i.getLong(14);
                    long j2 = i.getLong(15);
                    long j3 = i.getLong(16);
                    androidx.work.a c = bc.c(i.getInt(17));
                    long j4 = i.getLong(18);
                    long j5 = i.getLong(19);
                    int i4 = i.getInt(20);
                    long j6 = i.getLong(21);
                    int i5 = i.getInt(22);
                    int j7 = bc.j(i.getInt(5));
                    arrayList.add(new ab(string3, d2, b, j, j2, j3, new androidx.work.g(bc.e(i.getBlob(6)), j7, i.getInt(7) != 0, i.getInt(8) != 0, i.getInt(9) != 0, i.getInt(10) != 0, i.getLong(11), i.getLong(12), bc.f(i.getBlob(13))), i2, c, j4, j5, i4, i3, j6, i5, (ArrayList) hashMap.get(i.getString(0)), (ArrayList) hashMap2.get(i.getString(0))));
                }
                this.f192a.w();
                return arrayList;
            } finally {
                i.close();
                d.i();
            }
        } finally {
            this.f192a.s();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final kotlinx.coroutines.b.m o() {
        TreeMap treeMap = bb.f94a;
        return androidx.room.b.e.a(this.f192a, new String[]{"workspec"}, new androidx.room.ai(new an(this, bi.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)), 1));
    }

    @Override // androidx.work.impl.b.ad
    public final void p(String str) {
        this.f192a.q();
        j c = this.d.c();
        c.e(1, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.d.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void q(String str) {
        this.f192a.q();
        j c = this.g.c();
        c.e(1, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.g.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void r(ac acVar) {
        this.f192a.q();
        this.f192a.r();
        try {
            this.b.b(acVar);
            this.f192a.w();
        } finally {
            this.f192a.s();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void s() {
        this.f192a.q();
        j c = this.o.c();
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.o.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void t(String str, int i) {
        this.f192a.q();
        j c = this.l.c();
        c.e(1, str);
        c.c(2, i);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.l.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void u(String str, long j) {
        this.f192a.q();
        j c = this.i.c();
        c.c(1, j);
        c.e(2, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.i.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void v(String str, androidx.work.l lVar) {
        this.f192a.q();
        j c = this.h.c();
        c.a(1, androidx.work.au.c(lVar));
        c.e(2, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.h.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void w(String str, int i) {
        this.f192a.q();
        j c = this.p.c();
        c.c(1, i);
        c.e(2, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.p.f(c);
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void x(ac acVar) {
        this.f192a.q();
        this.f192a.r();
        try {
            androidx.room.f fVar = this.c;
            j c = fVar.c();
            try {
                c.e(1, acVar.b);
                c.c(2, bc.b(acVar.c));
                c.e(3, acVar.d);
                c.e(4, acVar.e);
                androidx.work.l lVar = acVar.f;
                androidx.work.l lVar2 = androidx.work.l.f224a;
                c.a(5, androidx.work.au.c(lVar));
                c.a(6, androidx.work.au.c(acVar.g));
                c.c(7, acVar.h);
                c.c(8, acVar.i);
                c.c(9, acVar.j);
                c.c(10, acVar.l);
                c.c(11, bc.a(acVar.m));
                c.c(12, acVar.n);
                c.c(13, acVar.o);
                c.c(14, acVar.p);
                c.c(15, acVar.q);
                c.c(16, acVar.r ? 1L : 0L);
                c.c(17, bc.k(acVar.y));
                c.c(18, acVar.s);
                c.c(19, acVar.t);
                c.c(20, acVar.u);
                c.c(21, acVar.v);
                c.c(22, acVar.w);
                String str = acVar.x;
                if (str == null) {
                    c.d(23);
                } else {
                    c.e(23, str);
                }
                androidx.work.g gVar = acVar.k;
                c.c(24, bc.i(gVar.j));
                c.a(25, bc.g(gVar.b));
                c.c(26, gVar.c ? 1L : 0L);
                c.c(27, gVar.d ? 1L : 0L);
                c.c(28, gVar.e ? 1L : 0L);
                c.c(29, gVar.f ? 1L : 0L);
                c.c(30, gVar.g);
                c.c(31, gVar.h);
                c.a(32, bc.h(gVar.i));
                c.e(33, acVar.b);
                c.f();
                fVar.f(c);
                this.f192a.w();
            } catch (Throwable th) {
                fVar.f(c);
                throw th;
            }
        } finally {
            this.f192a.s();
        }
    }

    @Override // androidx.work.impl.b.ad
    public final List y() {
        int k;
        int k2;
        int k3;
        int k4;
        int k5;
        int k6;
        int k7;
        int k8;
        int k9;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        TreeMap treeMap = bb.f94a;
        bb d = bi.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        d.c(1, 200L);
        this.f192a.q();
        Cursor i = androidx.room.g.m.i(this.f192a, d, false);
        try {
            k = androidx.room.g.m.k(i, "id");
            k2 = androidx.room.g.m.k(i, "state");
            k3 = androidx.room.g.m.k(i, "worker_class_name");
            k4 = androidx.room.g.m.k(i, "input_merger_class_name");
            k5 = androidx.room.g.m.k(i, "input");
            k6 = androidx.room.g.m.k(i, "output");
            k7 = androidx.room.g.m.k(i, "initial_delay");
            k8 = androidx.room.g.m.k(i, "interval_duration");
            k9 = androidx.room.g.m.k(i, "flex_duration");
            k10 = androidx.room.g.m.k(i, "run_attempt_count");
            k11 = androidx.room.g.m.k(i, "backoff_policy");
            k12 = androidx.room.g.m.k(i, "backoff_delay_duration");
            k13 = androidx.room.g.m.k(i, "last_enqueue_time");
            k14 = androidx.room.g.m.k(i, "minimum_retention_duration");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int k15 = androidx.room.g.m.k(i, "schedule_requested_at");
            int k16 = androidx.room.g.m.k(i, "run_in_foreground");
            int k17 = androidx.room.g.m.k(i, "out_of_quota_policy");
            int k18 = androidx.room.g.m.k(i, "period_count");
            int k19 = androidx.room.g.m.k(i, "generation");
            int k20 = androidx.room.g.m.k(i, "next_schedule_time_override");
            int k21 = androidx.room.g.m.k(i, "next_schedule_time_override_generation");
            int k22 = androidx.room.g.m.k(i, "stop_reason");
            int k23 = androidx.room.g.m.k(i, "trace_tag");
            int k24 = androidx.room.g.m.k(i, "required_network_type");
            int k25 = androidx.room.g.m.k(i, "required_network_request");
            int k26 = androidx.room.g.m.k(i, "requires_charging");
            int k27 = androidx.room.g.m.k(i, "requires_device_idle");
            int k28 = androidx.room.g.m.k(i, "requires_battery_not_low");
            int k29 = androidx.room.g.m.k(i, "requires_storage_not_low");
            int k30 = androidx.room.g.m.k(i, "trigger_content_update_delay");
            int k31 = androidx.room.g.m.k(i, "trigger_max_content_delay");
            int k32 = androidx.room.g.m.k(i, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                String string = i.getString(k);
                androidx.work.as d2 = bc.d(i.getInt(k2));
                String string2 = i.getString(k3);
                String string3 = i.getString(k4);
                byte[] blob = i.getBlob(k5);
                androidx.work.l lVar = androidx.work.l.f224a;
                androidx.work.l b = androidx.work.au.b(blob);
                androidx.work.l b2 = androidx.work.au.b(i.getBlob(k6));
                long j = i.getLong(k7);
                long j2 = i.getLong(k8);
                long j3 = i.getLong(k9);
                int i2 = i.getInt(k10);
                androidx.work.a c = bc.c(i.getInt(k11));
                long j4 = i.getLong(k12);
                long j5 = i.getLong(k13);
                long j6 = i.getLong(k14);
                long j7 = i.getLong(k15);
                boolean z = i.getInt(k16) != 0;
                int l = bc.l(i.getInt(k17));
                int i3 = i.getInt(k18);
                int i4 = i.getInt(k19);
                long j8 = i.getLong(k20);
                int i5 = i.getInt(k21);
                int i6 = i.getInt(k22);
                String string4 = i.isNull(k23) ? null : i.getString(k23);
                int j9 = bc.j(i.getInt(k24));
                arrayList.add(new ac(string, d2, string2, string3, b, b2, j, j2, j3, new androidx.work.g(bc.e(i.getBlob(k25)), j9, i.getInt(k26) != 0, i.getInt(k27) != 0, i.getInt(k28) != 0, i.getInt(k29) != 0, i.getLong(k30), i.getLong(k31), bc.f(i.getBlob(k32))), i2, c, j4, j5, j6, j7, z, l, i3, i4, j8, i5, i6, string4));
            }
            i.close();
            d.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            i.close();
            d.i();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.ad
    public final void z(String str) {
        this.f192a.q();
        j c = this.j.c();
        c.e(1, str);
        try {
            this.f192a.r();
            try {
                c.f();
                this.f192a.w();
            } finally {
                this.f192a.s();
            }
        } finally {
            this.j.f(c);
        }
    }
}
