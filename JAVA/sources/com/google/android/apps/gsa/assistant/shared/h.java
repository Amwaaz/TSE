package com.google.android.apps.gsa.assistant.shared;

import com.google.android.apps.gsa.assistant.shared.f.a.q;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.libraries.g.a;
import com.google.common.base.bu;
import com.google.common.base.l;
import com.google.common.f.a.e;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.common.v.g;
import j$.time.Duration;
import j$.time.LocalDate;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/h.class */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f272a = com.google.common.f.j.i("com.google.android.apps.gsa.assistant.shared.h");
    public final a b;
    public final e.a c;
    public final e.a d;
    private final com.google.android.apps.gsa.shared.util.q.a e;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(com.google.android.apps.gsa.shared.util.q.a aVar, a aVar2, e.a aVar3, e.a aVar4) {
        this.e = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    private static final String f(LocalDate localDate) {
        return new SimpleDateFormat("yyyyMMdd", Locale.US).format(DesugarDate.from(localDate.atStartOfDay(g.a).toInstant()));
    }

    public abstract cn a(int i);

    public abstract cn b();

    public final cn c() {
        long millis = Duration.ofDays(this.e.d(br.cj)).toMillis();
        return millis > 0 ? i.g(((q) this.d.a()).a(), new g(millis), ay.a) : dl.n(false);
    }

    protected final Map d(String str, int i) {
        int i2;
        ArrayList arrayList = new ArrayList(bu.c(new l(',')).a().j(str));
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        LocalDate localDate = this.b.f().atZone(g.a).toLocalDate();
        long d = this.e.d(br.as);
        HashMap hashMap = new HashMap();
        long j = i;
        if (d > j) {
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = 0;
            long j2 = 1;
            while (true) {
                long j3 = j2;
                if (j3 > j) {
                    break;
                }
                if (hashSet.contains(f(localDate.minusDays(j3)))) {
                    arrayDeque.add(true);
                    i3++;
                } else {
                    arrayDeque.add(false);
                }
                j2 = j3 + 1;
            }
            Integer valueOf = Integer.valueOf(i3);
            hashMap.put("yesterday", valueOf);
            hashMap.put(f(localDate.minusDays(1L)), valueOf);
            long j4 = 2;
            while (true) {
                long j5 = j4;
                if (j5 > d - j) {
                    break;
                }
                if (hashSet.contains(f(localDate.minusDays((j5 + j) - 1)))) {
                    arrayDeque.add(true);
                    i2 = i3 + 1;
                } else {
                    arrayDeque.add(false);
                    i2 = i3;
                }
                i3 = i2;
                if (((Boolean) arrayDeque.remove()).booleanValue()) {
                    i3 = i2 - 1;
                }
                String f = f(localDate.minusDays(j5));
                com.google.common.f.ab abVar = e.a;
                hashMap.put(f, Integer.valueOf(i3));
                j4 = j5 + 1;
            }
        } else {
            com.google.common.f.h d2 = f272a.d();
            d2.aj(e.a, "ActivatedStatusHelper");
            com.google.common.f.h hVar = d2;
            hVar.ak(1461);
            hVar.B("Not enough OPA active dates (%d) stored to compute Last%d metric", d, i);
        }
        return hashMap;
    }

    public abstract void e(boolean z);
}
