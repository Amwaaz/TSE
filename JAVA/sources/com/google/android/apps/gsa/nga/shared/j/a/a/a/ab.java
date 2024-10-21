package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ab.class */
final class ab extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f889a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i, byte[] bArr) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i, char[] cArr) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i, int[] iArr) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i, short[] sArr) {
        super(2, gVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(m.c.g gVar, int i, boolean[] zArr) {
        super(2, gVar);
        this.b = i;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return c((Throwable) obj, (m.c.g) obj2).b(m.w.a);
        }
        if (i == 1) {
            return c((Throwable) obj, (m.c.g) obj2).b(m.w.a);
        }
        if (i == 2) {
            return c((Throwable) obj, (m.c.g) obj2).b(m.w.a);
        }
        if (i == 3) {
            return c((o) obj, (m.c.g) obj2).b(m.w.a);
        }
        if (i != 4) {
            return c((Throwable) obj, (m.c.g) obj2).b(m.w.a);
        }
        return c((Throwable) obj, (m.c.g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        int i = this.b;
        if (i == 0) {
            m.k.b(obj);
            Throwable th = (Throwable) this.f889a;
            com.google.common.f.h f = ac.f890a.f();
            f.aj(com.google.common.f.a.e.a, "TRG.IEStatusProv");
            com.google.common.f.h g = f.g(th);
            g.ak(5170);
            g.p("Retrying hotword in-enrollment status flow after failure.");
            return m.w.a;
        }
        if (i == 1) {
            m.k.b(obj);
            Throwable th2 = (Throwable) this.f889a;
            com.google.common.f.h f2 = x.a.f();
            f2.aj(com.google.common.f.a.e.a, "TRG.HW.EnrollmentState");
            com.google.common.f.h g2 = f2.g(th2);
            g2.ak(5165);
            g2.p("Retrying hotword enrollment state flow after failure.");
            return m.w.a;
        }
        if (i == 2) {
            m.k.b(obj);
            Throwable th3 = (Throwable) this.f889a;
            com.google.common.f.h f3 = ah.f895a.f();
            f3.aj(com.google.common.f.a.e.a, "TRG.HotwordConsumer");
            com.google.common.f.h g3 = f3.g(th3);
            g3.ak(5171);
            g3.p("Retrying legacy external hotword consumer configuration flow after failure.");
            return m.w.a;
        }
        if (i == 3) {
            m.k.b(obj);
            o oVar = (o) this.f889a;
            com.google.common.f.h d = aq.f903a.d();
            d.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
            d.ak(5172);
            d.s("On legacy external hotword status change: %s.", oVar);
            return m.w.a;
        }
        if (i != 4) {
            m.k.b(obj);
            Throwable th4 = (Throwable) this.f889a;
            com.google.common.f.h f4 = bc.f916a.f();
            f4.aj(com.google.common.f.a.e.a, "TRG.VMConfigProv");
            com.google.common.f.h g4 = f4.g(th4);
            g4.ak(5175);
            g4.p("Retrying bisto voice match config flow after failure.");
            return m.w.a;
        }
        m.k.b(obj);
        Throwable th5 = (Throwable) this.f889a;
        com.google.common.f.h e = aq.f903a.e();
        e.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
        com.google.common.f.h g5 = e.g(th5);
        g5.ak(5173);
        g5.p("Retrying legacy external hotword status flow after failure.");
        return m.w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        int i = this.b;
        if (i == 0) {
            ab abVar = new ab(gVar, 0);
            abVar.f889a = obj;
            return abVar;
        }
        if (i == 1) {
            ab abVar2 = new ab(gVar, 1, (byte[]) null);
            abVar2.f889a = obj;
            return abVar2;
        }
        if (i == 2) {
            ab abVar3 = new ab(gVar, 2, (char[]) null);
            abVar3.f889a = obj;
            return abVar3;
        }
        if (i == 3) {
            ab abVar4 = new ab(gVar, 3, (short[]) null);
            abVar4.f889a = obj;
            return abVar4;
        }
        if (i != 4) {
            ab abVar5 = new ab(gVar, 5, (boolean[]) null);
            abVar5.f889a = obj;
            return abVar5;
        }
        ab abVar6 = new ab(gVar, 4, (int[]) null);
        abVar6.f889a = obj;
        return abVar6;
    }
}
