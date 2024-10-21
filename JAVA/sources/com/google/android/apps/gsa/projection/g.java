package com.google.android.apps.gsa.projection;

import com.google.android.gms.common.api.j;
import com.google.android.libraries.phenotype.client.ab;
import com.google.android.libraries.phenotype.client.af;
import com.google.android.libraries.phenotype.client.ah;
import com.google.android.libraries.phenotype.client.m;
import com.google.common.o.or;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/projection/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public ah f1032a;
    public ah b;

    public static ah a(String str) {
        j jVar = com.google.android.gms.phenotype.g.f2694a;
        return new ab(new af(m.a(str)), "__phenotype_server_token", "", false);
    }

    public static boolean b(String str) {
        return or.p.name().equals(str) || or.j.name().equals(str);
    }
}
