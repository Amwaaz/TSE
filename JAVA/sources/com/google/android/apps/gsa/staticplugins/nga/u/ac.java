package com.google.android.apps.gsa.staticplugins.nga.u;

import android.os.Build;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.staticplugins.nga.t.c;
import com.google.common.b.bs;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.base.bu;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.base.l;
import com.google.common.base.u;
import com.google.common.f.a.d;
import com.google.common.i.o;
import com.google.common.i.p;
import j$.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1712a = d.j();
    public final ca b = cl.d(new ca() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.z
        public final Object a() {
            String str = Build.MANUFACTURER;
            String str2 = Build.DEVICE;
            String str3 = "l6RFaYShT4Nts05EEDffKauUGpaV5sno|" + str.toLowerCase(Locale.ROOT) + "|" + str2.toLowerCase(Locale.ROOT);
            int i = p.b;
            return Long.valueOf(Long.reverseBytes(o.a.a(str3, StandardCharsets.UTF_8).c()));
        }
    });
    public final com.google.android.libraries.assistant.c.b.g.y c;
    private final com.google.android.apps.gsa.nga.shared.ab.f d;
    private final c e;

    public ac(c cVar, com.google.android.apps.gsa.nga.shared.ab.f fVar, com.google.android.libraries.assistant.c.b.g.y yVar) {
        this.d = fVar;
        this.e = cVar;
        this.c = yVar;
    }

    public final ha a(String str) {
        fl b;
        Locale d = this.e.d();
        fg fgVar = new fg(4);
        if (str.isEmpty()) {
            b = ni.a;
        } else {
            for (String str2 : bu.c(new l(';')).h(str)) {
                String[] split = str2.split("=", -1);
                if (split.length != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Could not parse %s, not a valid key=value pair.", str2));
                }
                String str3 = split[0];
                List j = bu.c(new l('+')).g(u.c).a().j(str3);
                if (j.isEmpty()) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Could not parse %s, not a valid key=value pair.", str2));
                }
                String str4 = (String) j.get(0);
                fl m = fl.m(j.subList(1, j.size()));
                String str5 = split[1];
                ha haVar = (ha) Collection._EL.stream(b.d(str5)).map(new d(this.d, 4)).collect(bs.b);
                if (haVar.contains(com.google.android.apps.gsa.nga.shared.ab.j.UNRECOGNIZED)) {
                    throw new IllegalArgumentException(String.format("Unrecognized group encountered in config value %s", str5));
                }
                if (str4 == null) {
                    throw new NullPointerException("Null languageRange");
                }
                if (m == null) {
                    throw new NullPointerException("Null deviceModels");
                }
                if (haVar == null) {
                    throw new NullPointerException("Null requiredGroups");
                }
                if (str3 == null) {
                    throw new NullPointerException("Null rawKey");
                }
                fgVar.h(new ab(str3, str4, m, haVar));
            }
            b = fgVar.g().b();
        }
        return (ha) Collection._EL.stream(b).filter(new ak(this, d, 1)).peek(new aa(0)).filter(new k(this, 2)).peek(new aa(2)).map(new c(6)).findFirst().orElse(nr.a);
    }
}
