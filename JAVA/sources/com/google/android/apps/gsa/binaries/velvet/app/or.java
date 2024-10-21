package com.google.android.apps.gsa.binaries.velvet.app;

import com.google.android.libraries.search.assistant.q.a.a.a.a.j;
import com.google.android.libraries.search.assistant.q.a.b.c.c.a.a.b;
import com.google.common.b.fu;
import com.google.frameworks.client.data.android.server.tiktok.y;
import e.b.b.a;
import e.c.c;
import e.c.h;
import e.c.m;
import io.grpc.cx;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/or.class */
public final class or implements y.b, a {

    /* renamed from: a, reason: collision with root package name */
    public final cx f330a;
    public final jo b;
    public final ik c;
    public h d;
    public h e;
    public h f;
    public h g;
    public h h;
    public h i;
    public h j;
    public h k;
    public h l;
    public h m;
    public h n;
    public h o;
    public h p;
    private h q;
    private h r;
    private h s;
    private h t;
    private final or u;

    public or() {
        throw null;
    }

    public or(jo joVar, ik ikVar, cx cxVar) {
        this.u = this;
        this.b = joVar;
        this.c = ikVar;
        this.f330a = cxVar;
        this.d = m.b(new hn(joVar, ikVar, this, 1));
        this.q = new hn(joVar, ikVar, this, 0);
        this.e = c.c(new hn(joVar, ikVar, this, 3));
        this.f = new hn(joVar, ikVar, this, 4);
        this.g = c.c(new hn(joVar, ikVar, this, 6));
        this.h = c.c(new hn(joVar, ikVar, this, 5));
        this.i = c.c(new hn(joVar, ikVar, this, 8));
        this.j = c.c(new hn(joVar, ikVar, this, 7));
        this.r = new hn(joVar, ikVar, this, 2);
        this.k = c.c(new hn(joVar, ikVar, this, 10));
        this.l = m.b(new hn(joVar, ikVar, this, 13));
        this.m = m.b(new hn(joVar, ikVar, this, 12));
        this.n = m.b(new hn(joVar, ikVar, this, 14));
        this.o = c.c(new hn(joVar, ikVar, this, 11));
        this.s = m.b(new hn(joVar, ikVar, this, 15));
        this.t = new hn(joVar, ikVar, this, 9);
        this.p = c.c(new hn(joVar, ikVar, this, 16));
    }

    public final com.google.android.libraries.search.assistant.q.a.c.a.a a() {
        return new com.google.android.libraries.search.assistant.q.a.c.a.a((j) this.s.a(), (com.google.android.libraries.search.assistant.invocation.u.a.a) this.j.a(), (b) this.i.a());
    }

    public final Map b() {
        return fu.o("java.com.google.android.libraries.search.assistant.invocation.triggering.api.ApaTriggeringService", this.q, "com.google.android.libraries.search.assistant.convocation.service.api.internal.proto.ConvocationActiveInvocationService", this.r, "com.google.android.libraries.search.assistant.convocation.service.api.internal.proto.ConvocationPersistentService", this.t);
    }
}
