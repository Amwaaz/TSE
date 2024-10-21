package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import com.google.android.apps.gsa.search.core.aa.a.k;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.Cdo;
import com.google.android.apps.gsa.shared.util.ao;
import com.google.android.apps.gsa.shared.util.v;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.util.concurrent.dl;
import com.google.cr.b.a.a.b;
import com.google.cr.b.a.a.c;
import e.a;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/i.class */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1118a;
    private final p b;
    private final a c;

    public i(Context context, p pVar, a aVar) {
        this.f1118a = context;
        this.b = pVar;
        this.c = aVar;
    }

    public final b a(boolean z, Collection collection) {
        c createBuilder = b.a.createBuilder();
        long j = this.b.g.d;
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        bVar.b |= 2;
        bVar.e = j;
        createBuilder.r(this.b.u());
        createBuilder.t(this.b.g.f);
        if (this.b.w(Cdo.f1440a)) {
            createBuilder.s(collection);
        }
        if (z) {
            com.google.cr.b.a.a.d m = ao.m(this.f1118a);
            createBuilder.copyOnWrite();
            b bVar2 = createBuilder.instance;
            m.getClass();
            bVar2.h = m;
            bVar2.b |= 16;
        }
        String s = this.b.s();
        if (s != null) {
            createBuilder.u(s);
        }
        ab abVar = e.a;
        createBuilder.build();
        return createBuilder.build();
    }

    public final Collection b() {
        if (!this.b.w(Cdo.b)) {
            return ((k) this.c.a()).c();
        }
        try {
            return (Collection) dl.a(((k) this.c.a()).a(), this.b.i(Cdo.c) + 100, TimeUnit.MILLISECONDS);
        } catch (CancellationException e) {
            return new HashSet();
        } catch (ExecutionException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    public final void c(com.google.android.apps.gsa.search.core.google.e.c cVar, boolean z, boolean z2, Collection collection) {
        byte[] byteArray = a(z2, collection).toByteArray();
        byte[] bArr = byteArray;
        if (z) {
            c createBuilder = b.a.createBuilder();
            byte[] b = v.b(byteArray);
            com.google.protobuf.v vVar = com.google.protobuf.v.b;
            com.google.protobuf.v x = com.google.protobuf.v.x(b, 0, b.length);
            createBuilder.copyOnWrite();
            b bVar = createBuilder.instance;
            bVar.b |= 1;
            bVar.c = x;
            bArr = createBuilder.build().toByteArray();
        }
        cVar.c(cVar.f, "X-Client-Data", bArr);
    }
}
