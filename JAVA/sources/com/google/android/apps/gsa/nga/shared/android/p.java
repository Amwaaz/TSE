package com.google.android.apps.gsa.nga.shared.android;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/p.class */
public final class p extends Enum {

    /* renamed from: a */
    public static final p f850a;
    public static final p b;
    public static final p c;
    public static final p d;
    private static final p[] e;

    static {
        p pVar = new p("ACCOUNT_CHECKER_DISABLED", 0);
        f850a = pVar;
        p pVar2 = new p("UNKNOWN", 1);
        b = pVar2;
        p pVar3 = new p("PRESENT", 2);
        c = pVar3;
        p pVar4 = new p("NOT_PRESENT", 3);
        d = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        e = pVarArr;
        m.d.a.a(pVarArr);
    }

    private p(String str, int i) {
        super(str, i);
    }

    public static p[] values() {
        return (p[]) e.clone();
    }
}
