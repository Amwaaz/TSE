package com.google.android.apps.gsa.shared.notificationlistening.collection.a;

import a.a;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.f.e;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.base.ap;
import com.google.common.base.cl;
import com.google.common.f.h;
import com.google.common.f.j;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/notificationlistening/collection/a/z.class */
public class z {
    private static final j d = j.i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.z");
    private static final fu e;
    private static final fu f;
    private static final int g;

    /* renamed from: a, reason: collision with root package name */
    public final e f1475a;
    public final fu b = e;
    public final fu c = f;

    static {
        fq fqVar = new fq(4);
        fqVar.i("com.facebook.orca", new y(1, (List) null));
        fqVar.i("jp.naver.line.android", new y(3, fl.q(Locale.JAPAN, Locale.JAPANESE)));
        fqVar.i("com.whatsapp", new w(fl.q(Locale.JAPAN, Locale.JAPANESE)));
        fqVar.i("com.google.android.talk", new y(4, (List) null));
        fqVar.i("com.google.android.apps.dynamite", new y(9, (List) null));
        fqVar.i("com.google.android.apps.googlevoice", new y(5, fl.p(Locale.US)));
        fqVar.i("com.google.android.apps.messaging", new y(6, (List) null));
        e = fqVar.h(false);
        fq fqVar2 = new fq(4);
        fqVar2.i("com.facebook.orca", new y(1, (List) null));
        fqVar2.i("jp.naver.line.android", new y(3, fl.q(Locale.JAPAN, Locale.JAPANESE)));
        fqVar2.i("com.whatsapp", new w(fl.q(Locale.JAPAN, Locale.JAPANESE)));
        fqVar2.i("com.google.android.talk", new y(4, (List) null));
        fqVar2.i("com.google.android.apps.dynamite", new y(9, (List) null));
        fqVar2.i("com.google.android.apps.googlevoice", new y(5, fl.p(Locale.US)));
        fqVar2.i("com.google.android.apps.messaging", new y(6, (List) null));
        fqVar2.i("com.android.car.messenger", new y(7, (List) null));
        fqVar2.i("com.samsung.android.messaging", new y(8, (List) null));
        f = fqVar2.h(false);
        g = 9;
    }

    public z(e eVar) {
        this.f1475a = eVar;
    }

    public static boolean b(Context context, e eVar, String str, int i) {
        Map h;
        String b = eVar.b("messaging_parsing_blacklist");
        if (cl.L(b)) {
            h = Collections.emptyMap();
        } else {
            fq fqVar = new fq(4);
            for (String str2 : b.split(",")) {
                String[] split = str2.split(":");
                if (split.length != 2) {
                    h f2 = d.f();
                    f2.ak(9019);
                    f2.s("Bad blacklist: %s", b);
                    int i2 = com.google.android.apps.gsa.shared.util.b.h.a;
                } else {
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        if (parseInt >= 0) {
                            int i3 = g;
                            if (i3 == 0) {
                                throw null;
                                break;
                            }
                            if (parseInt <= i3 - 1) {
                                fqVar.i(Integer.valueOf(parseInt), Integer.valueOf(split[1]));
                            }
                        }
                        h f3 = d.f();
                        f3.ak(9017);
                        f3.s("Bad blacklist: %s", b);
                        int i4 = com.google.android.apps.gsa.shared.util.b.h.a;
                    } catch (NumberFormatException e2) {
                        aus.b(d.f(), "Bad blacklist: %s", b, (char) 9018, e2);
                        int i5 = com.google.android.apps.gsa.shared.util.b.h.a;
                    }
                }
            }
            h = fqVar.h(false);
        }
        Integer num = (Integer) h.get(Integer.valueOf(i - 1));
        if (num == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode >= num.intValue();
        } catch (PackageManager.NameNotFoundException e3) {
            a.dB(d.f(), "Not found", (char) 9020, e3);
            int i6 = com.google.android.apps.gsa.shared.util.b.h.a;
            return true;
        }
    }

    public final String a() {
        return ap.c(',').d(this.b.w());
    }
}
