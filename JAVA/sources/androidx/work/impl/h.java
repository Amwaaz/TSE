package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/h.class */
public final class h extends androidx.room.e.a {
    public static final h c = new h();

    private h() {
        super(1, 2);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        bVar.j("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        bVar.j("DROP TABLE IF EXISTS alarmInfo");
        bVar.j("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
