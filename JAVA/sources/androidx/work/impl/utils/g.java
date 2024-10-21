package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.af;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/g.class */
public final class g {

    /* renamed from: a */
    private static final String f220a = af.b("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                af.a().c(f220a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            af a2 = af.a();
            String str = f220a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            a2.c(str, sb.toString());
        } catch (Exception e) {
            af a3 = af.a();
            String str2 = f220a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(true != z ? "disabled" : "enabled");
            a3.d(str2, sb2.toString(), e);
        }
    }
}
