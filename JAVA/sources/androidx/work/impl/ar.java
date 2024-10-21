package androidx.work.impl;

import androidx.u.a.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/ar.class */
public final class ar extends androidx.room.aw {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f184a;

    public ar(WorkDatabase_Impl workDatabase_Impl) {
        this.f184a = workDatabase_Impl;
    }

    @Override // androidx.room.aw
    public final androidx.room.ax a(b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new androidx.room.g.p("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap.put("prerequisite_id", new androidx.room.g.p("prerequisite_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new androidx.room.g.r("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new androidx.room.g.r("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        androidx.room.g.s sVar = new androidx.room.g.s("Dependency", hashMap, hashSet, hashSet2);
        androidx.room.g.s h = androidx.room.g.u.h(bVar, "Dependency");
        if (!androidx.room.g.u.g(sVar, h)) {
            return new androidx.room.ax(false, a.a.dJ(h, sVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put("id", new androidx.room.g.p("id", "TEXT", true, 1, (String) null, 1));
        hashMap2.put("state", new androidx.room.g.p("state", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("worker_class_name", new androidx.room.g.p("worker_class_name", "TEXT", true, 0, (String) null, 1));
        hashMap2.put("input_merger_class_name", new androidx.room.g.p("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
        hashMap2.put("input", new androidx.room.g.p("input", "BLOB", true, 0, (String) null, 1));
        hashMap2.put("output", new androidx.room.g.p("output", "BLOB", true, 0, (String) null, 1));
        hashMap2.put("initial_delay", new androidx.room.g.p("initial_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("interval_duration", new androidx.room.g.p("interval_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("flex_duration", new androidx.room.g.p("flex_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("run_attempt_count", new androidx.room.g.p("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("backoff_policy", new androidx.room.g.p("backoff_policy", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("backoff_delay_duration", new androidx.room.g.p("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("last_enqueue_time", new androidx.room.g.p("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new androidx.room.g.p("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("schedule_requested_at", new androidx.room.g.p("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("run_in_foreground", new androidx.room.g.p("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("out_of_quota_policy", new androidx.room.g.p("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("period_count", new androidx.room.g.p("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new androidx.room.g.p("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("next_schedule_time_override", new androidx.room.g.p("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new androidx.room.g.p("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("stop_reason", new androidx.room.g.p("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("trace_tag", new androidx.room.g.p("trace_tag", "TEXT", false, 0, (String) null, 1));
        hashMap2.put("required_network_type", new androidx.room.g.p("required_network_type", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("required_network_request", new androidx.room.g.p("required_network_request", "BLOB", true, 0, "x''", 1));
        hashMap2.put("requires_charging", new androidx.room.g.p("requires_charging", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_device_idle", new androidx.room.g.p("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_battery_not_low", new androidx.room.g.p("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("requires_storage_not_low", new androidx.room.g.p("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("trigger_content_update_delay", new androidx.room.g.p("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("trigger_max_content_delay", new androidx.room.g.p("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
        hashMap2.put("content_uri_triggers", new androidx.room.g.p("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new androidx.room.g.r("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new androidx.room.g.r("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        androidx.room.g.s sVar2 = new androidx.room.g.s("WorkSpec", hashMap2, hashSet3, hashSet4);
        androidx.room.g.s h2 = androidx.room.g.u.h(bVar, "WorkSpec");
        if (!androidx.room.g.u.g(sVar2, h2)) {
            return new androidx.room.ax(false, a.a.dJ(h2, sVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new androidx.room.g.p("tag", "TEXT", true, 1, (String) null, 1));
        hashMap3.put("work_spec_id", new androidx.room.g.p("work_spec_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new androidx.room.g.r("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        androidx.room.g.s sVar3 = new androidx.room.g.s("WorkTag", hashMap3, hashSet5, hashSet6);
        androidx.room.g.s h3 = androidx.room.g.u.h(bVar, "WorkTag");
        if (!androidx.room.g.u.g(sVar3, h3)) {
            return new androidx.room.ax(false, a.a.dJ(h3, sVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new androidx.room.g.p("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap4.put("generation", new androidx.room.g.p("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new androidx.room.g.p("system_id", "INTEGER", true, 0, (String) null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        androidx.room.g.s sVar4 = new androidx.room.g.s("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        androidx.room.g.s h4 = androidx.room.g.u.h(bVar, "SystemIdInfo");
        if (!androidx.room.g.u.g(sVar4, h4)) {
            return new androidx.room.ax(false, a.a.dJ(h4, sVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new androidx.room.g.p("name", "TEXT", true, 1, (String) null, 1));
        hashMap5.put("work_spec_id", new androidx.room.g.p("work_spec_id", "TEXT", true, 2, (String) null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new androidx.room.g.r("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        androidx.room.g.s sVar5 = new androidx.room.g.s("WorkName", hashMap5, hashSet8, hashSet9);
        androidx.room.g.s h5 = androidx.room.g.u.h(bVar, "WorkName");
        if (!androidx.room.g.u.g(sVar5, h5)) {
            return new androidx.room.ax(false, a.a.dJ(h5, sVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new androidx.room.g.p("work_spec_id", "TEXT", true, 1, (String) null, 1));
        hashMap6.put("progress", new androidx.room.g.p("progress", "BLOB", true, 0, (String) null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new androidx.room.g.q("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        androidx.room.g.s sVar6 = new androidx.room.g.s("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        androidx.room.g.s h6 = androidx.room.g.u.h(bVar, "WorkProgress");
        if (!androidx.room.g.u.g(sVar6, h6)) {
            return new androidx.room.ax(false, a.a.dJ(h6, sVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new androidx.room.g.p("key", "TEXT", true, 1, (String) null, 1));
        hashMap7.put("long_value", new androidx.room.g.p("long_value", "INTEGER", false, 0, (String) null, 1));
        androidx.room.g.s sVar7 = new androidx.room.g.s("Preference", hashMap7, new HashSet(0), new HashSet(0));
        androidx.room.g.s h7 = androidx.room.g.u.h(bVar, "Preference");
        return !androidx.room.g.u.g(sVar7, h7) ? new androidx.room.ax(false, a.a.dJ(h7, sVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new androidx.room.ax(true, (String) null);
    }

    @Override // androidx.room.aw
    public final void b(b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }
}
