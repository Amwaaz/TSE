package androidx.work.impl;

import android.text.TextUtils;
import android.util.Log;
import androidx.work.bf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/af.class */
public final class af extends bf {
    private static final String h = androidx.work.af.b("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final av f181a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public boolean f;
    public final int g;
    private final List i = new ArrayList();
    private androidx.work.ak j;

    public af(av avVar, String str, int i, List list, List list2) {
        this.f181a = avVar;
        this.b = str;
        this.g = i;
        this.c = list;
        this.e = list2;
        this.d = new ArrayList(list.size());
        int i2 = 0;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                this.i.addAll(((af) it.next()).i);
            }
        }
        while (i2 < list.size()) {
            if (i == 1 && ((androidx.work.ay) list.get(i2)).b.u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String a2 = ((androidx.work.ay) list.get(i2)).a();
            this.d.add(a2);
            this.i.add(a2);
            i2++;
        }
    }

    public static Set j(af afVar) {
        HashSet hashSet = new HashSet();
        List list = afVar.e;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((af) it.next()).d);
            }
        }
        return hashSet;
    }

    public static boolean k(af afVar, Set set) {
        set.addAll(afVar.d);
        Set j = j(afVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (j.contains((String) it.next())) {
                return true;
            }
        }
        List list = afVar.e;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (k((af) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(afVar.d);
        return false;
    }

    public final androidx.work.ak i() {
        if (this.f) {
            androidx.work.af.a();
            Log.w(h, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
        } else {
            av avVar = this.f181a;
            androidx.work.au auVar = avVar.d.l;
            int i = this.g;
            String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "APPEND_OR_REPLACE" : "APPEND" : "KEEP" : "REPLACE";
            if (i == 0) {
                throw null;
            }
            this.j = bf.h(auVar, "EnqueueRunnable_".concat(str), avVar.m.f216a, new m.h.a.a(this) { // from class: androidx.work.impl.ae

                /* renamed from: a, reason: collision with root package name */
                public final af f180a;

                {
                    this.f180a = this;
                }

                public final Object a() {
                    androidx.work.impl.utils.d.a(this.f180a);
                    return w.a;
                }
            });
        }
        return this.j;
    }
}
