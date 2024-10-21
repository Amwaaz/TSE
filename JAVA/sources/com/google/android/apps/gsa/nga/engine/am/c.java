package com.google.android.apps.gsa.nga.engine.am;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.n.d;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c.class */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f453a = new Object();
    public final Map b = new b();
    public final Set c = new HashSet();

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final void c(com.google.android.apps.gsa.nga.engine.m.b bVar) {
        ab abVar = e.a;
        v vVar = bVar.c.a.a;
        synchronized (this.f453a) {
            this.c.add(vVar);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void d(com.google.android.apps.gsa.nga.engine.m.b bVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void f() {
    }
}
