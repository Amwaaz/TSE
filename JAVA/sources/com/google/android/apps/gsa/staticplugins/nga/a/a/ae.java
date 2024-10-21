package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.q.a.y;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.apps.gsa.staticplugins.nga.l.e;
import com.google.android.libraries.phenotype.client.a.i;
import com.google.common.f.h;
import com.google.common.o.ls;
import e.a;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ae.class */
public class ae implements com.google.android.apps.gsa.nga.api.aq, e, com.google.android.apps.gsa.shared.util.debug.a.b {
    public static final int b = 0;
    private static final com.google.common.f.j c = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.nga.a.a.ae");
    private static final Locale d = new Locale("en", "AU");
    private final Context e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final a k;
    private final Supplier l;
    private final d m;
    private final a n;
    private final a o;
    private final a p;
    private final a q;
    private final a r;
    private final AtomicBoolean s = new AtomicBoolean(false);

    public ae(Context context, a aVar, d dVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12) {
        this.e = context;
        this.f = aVar;
        this.g = aVar2;
        this.h = aVar3;
        this.i = aVar4;
        this.n = aVar5;
        this.o = aVar6;
        this.p = aVar7;
        this.j = aVar9;
        this.k = aVar10;
        this.q = aVar8;
        this.m = dVar;
        this.r = aVar12;
        this.l = new ab(aVar11, 1);
    }

    public static ls g(Locale locale) {
        return Locale.UK.equals(locale) ? ls.p : Locale.CANADA.equals(locale) ? ls.q : d.equals(locale) ? ls.r : Locale.JAPAN.equals(locale) ? ls.s : ls.t;
    }

    public static /* synthetic */ Boolean h(a aVar) {
        boolean z = false;
        if (Settings.Global.getInt((ContentResolver) aVar.a(), "device_demo_mode", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean j(com.google.android.apps.gsa.shared.k.c cVar, Locale locale) {
        return a.a.ch(cVar.m(eu.jZ), locale.toLanguageTag());
    }

    private final void k() {
        if (this.s.getAndSet(true)) {
            return;
        }
        this.m.a(this);
        ((y) this.j.a()).c(new ab(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.api.aq
    public final ls a() {
        if (!((Boolean) this.k.a()).booleanValue() || !af.a()) {
            if (!((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.fb)) {
                com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                return ls.e;
            }
            if (!a.a.ch(((com.google.android.apps.gsa.shared.k.c) this.f.a()).m(eu.jY), Build.MODEL) && !this.e.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_TABLET_2023_EXPERIENCE")) {
                com.google.common.f.ab abVar2 = com.google.common.f.a.e.a;
                return ls.i;
            }
            if (!this.e.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_TABLET_2023_EXPERIENCE") && com.google.android.apps.gsa.shared.ui.b.a.c(this.e, (com.google.android.apps.gsa.shared.k.c) this.f.a()) && !((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.fg)) {
                com.google.common.f.ab abVar3 = com.google.common.f.a.e.a;
                return ls.i;
            }
        }
        return ls.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d6  */
    /* JADX WARN: Type inference failed for: r0v13, types: [e.a, java.lang.Object] */
    @Override // com.google.android.apps.gsa.nga.api.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.o.ls b() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.a.a.ae.b():com.google.common.o.ls");
    }

    @Override // com.google.android.apps.gsa.nga.api.aq
    public final boolean c() {
        return b() == ls.b;
    }

    @Override // com.google.android.apps.gsa.nga.api.aq
    public final boolean e() {
        if (!c()) {
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        if (((Boolean) this.k.a()).booleanValue()) {
            return false;
        }
        return f();
    }

    @Override // com.google.android.apps.gsa.nga.api.aq
    public final boolean f() {
        if (!((x) this.q.a()).l.get()) {
            if (((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.dd)) {
                ((com.google.android.apps.gsa.staticplugins.nga.u.av) this.h.a()).g();
            }
            com.google.common.f.ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        h f = c.f();
        f.aj(com.google.common.f.a.e.a, "NgaEligibility");
        h hVar = f;
        hVar.ak(15022);
        hVar.p("Invalid OAuth token. Skipping initial downloader.");
        ((x) this.q.a()).i();
        return false;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        boolean z;
        ls b2 = b();
        String name = b2.name();
        fVar.q("NgaEligibility");
        com.google.android.apps.gsa.shared.util.debug.a.e a2 = fVar.a("NGA eligibility");
        String str = name;
        if (TextUtils.isEmpty(name)) {
            str = String.valueOf(b2.y);
        }
        a2.a(new com.google.android.apps.gsa.shared.util.b.d(str, false));
        if (b2 == ls.b) {
            z = true;
        } else {
            z = false;
        }
        boolean w = ((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.jk);
        fVar.a("Panthera enabled").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.toString(z), false));
        fVar.a("Panthera DF enabled").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.toString(z && !w), false));
        fVar.a("Sierra DF account").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.toString(((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.jl)), false));
        String t = ((com.google.android.apps.gsa.shared.k.c) this.f.a()).t(eu.ka);
        if (!t.isEmpty()) {
            fVar.a("NGAv2 Enabled Features").a(new com.google.android.apps.gsa.shared.util.b.d(t.trim(), false));
        }
        ((x) this.q.a()).hq(fVar);
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.e
    public final void i() {
        k();
        ArrayList arrayList = new ArrayList();
        if (c()) {
            arrayList.add(46679653);
        } else {
            arrayList.add(46679651);
        }
        if (((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.hx)) {
            arrayList.add(46707638);
        }
        if (((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.eW)) {
            arrayList.add(46741981);
        }
        if (((com.google.android.apps.gsa.shared.k.c) this.f.a()).w(eu.eX)) {
            arrayList.add(46741982);
        }
        ((i) this.r.a()).h(Collection._EL.stream(arrayList).mapToInt(new ToIntFunction(1) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ac

            /* renamed from: a, reason: collision with root package name */
            private final int f1643a;

            {
                this.f1643a = r4;
            }

            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                if (this.f1643a != 0) {
                    int i = ae.b;
                    return ((Integer) obj).intValue();
                }
                int i2 = ae.b;
                return ((Integer) obj).intValue();
            }
        }).toArray(), "com.google.android.googlequicksearchbox", "STREAMZ_NGA");
        ((i) this.r.a()).h(Collection._EL.stream(arrayList).mapToInt(new ToIntFunction(0) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ac

            /* renamed from: a, reason: collision with root package name */
            private final int f1643a;

            {
                this.f1643a = r4;
            }

            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                if (this.f1643a != 0) {
                    int i = ae.b;
                    return ((Integer) obj).intValue();
                }
                int i2 = ae.b;
                return ((Integer) obj).intValue();
            }
        }).toArray(), "com.google.android.googlequicksearchbox_primes", "ANDROID_GSA_ANDROID_PRIMES");
    }
}
