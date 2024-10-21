package com.google.android.apps.gsa.nga.engine.c.c.a;

import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.search.assistant.verticals.a.d.a.j;
import com.google.android.apps.search.assistant.verticals.a.d.a.m;
import com.google.android.apps.search.assistant.verticals.a.d.a.n;
import com.google.g.ab.e.b.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/c/a/l.class */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final a f526a;

    public l(a aVar) {
        this.f526a = aVar;
    }

    private static boolean b(e eVar, String str, String str2) {
        return eVar.i.equals(str) && eVar.c.equals(str2);
    }

    public final boolean a(String str, String str2) {
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.k.a, str, str2)) {
            return this.f526a.i(eu.gZ);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.k.b, str, str2)) {
            return this.f526a.i(eu.gK);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.k.c, str, str2)) {
            return this.f526a.i(eu.gN);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.k.d, str, str2)) {
            return this.f526a.i(eu.gI);
        }
        if (b(j.a, str, str2)) {
            return this.f526a.i(eu.cn);
        }
        if (b(j.b, str, str2)) {
            return this.f526a.i(eu.cM);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.l.a, str, str2)) {
            return this.f526a.i(eu.hw);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.l.b, str, str2)) {
            return this.f526a.i(eu.cN);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.l.c, str, str2)) {
            return this.f526a.i(eu.bg);
        }
        if (b(m.a, str, str2)) {
            return this.f526a.i(eu.hb);
        }
        if (b(m.b, str, str2)) {
            return this.f526a.i(eu.gM);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.i.a, str, str2)) {
            return this.f526a.i(eu.gY);
        }
        if (b(com.google.android.apps.search.assistant.verticals.a.d.a.i.b, str, str2)) {
            return this.f526a.i(eu.gJ);
        }
        if (b(n.a, str, str2)) {
            return this.f526a.i(eu.hc);
        }
        if (b(n.b, str, str2)) {
            return this.f526a.i(eu.gO);
        }
        return false;
    }
}
