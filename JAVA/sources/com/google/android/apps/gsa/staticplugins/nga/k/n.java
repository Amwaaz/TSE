package com.google.android.apps.gsa.staticplugins.nga.k;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.k;
import com.google.android.apps.gsa.opa.f.a.l;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import com.google.android.libraries.gsa.h.f;
import com.google.common.o.ls;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/k/n.class */
public final class n implements com.google.android.apps.gsa.nga.api.s {

    /* renamed from: a, reason: collision with root package name */
    public final u f1687a;
    public NgaState b = null;
    public ls c = null;
    private final com.google.android.libraries.gsa.h.h d;

    public n(com.google.android.libraries.gsa.h.h hVar, u uVar) {
        this.d = hVar;
        this.f1687a = uVar;
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void a() {
        this.f1687a.f(new g(4));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return null;
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void b() {
        this.f1687a.f(new g(1));
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void c(int i) {
        this.f1687a.f(new i(i, 1));
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void d(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, com.google.android.libraries.assistant.g.d.t tVar) {
        this.f1687a.f(new b(bundle, assistStructure, assistContent, i, tVar));
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void e(Bitmap bitmap) {
        this.f1687a.f(new e(bitmap, 2));
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void f(k kVar) {
        this.f1687a.f(new e(kVar, 10));
    }

    @Override // com.google.android.apps.gsa.nga.api.s
    public final void g(Bundle bundle, int i) {
        this.f1687a.f(new f(bundle, i, 1));
    }

    public final void h() {
        this.f1687a.e(new g(3));
    }

    public final void i(ac acVar) {
        int ordinal = acVar.ordinal();
        this.f1687a.e(new e(ordinal != 55 ? ordinal != 80 ? acVar.name() : com.google.android.libraries.search.t.h.j.bg.a() : com.google.android.libraries.search.t.h.j.an.a(), 3));
    }

    public final void j(int i) {
        this.f1687a.d(new i(i, 0));
    }

    public final void k(ProtoLiteParcelable protoLiteParcelable) {
        this.f1687a.d(new e(protoLiteParcelable, 4));
    }

    public final void l(String str) {
        this.f1687a.e(new e(str, 9));
    }

    public final void m(l lVar, Bundle bundle) {
        this.f1687a.d(new c(lVar.toByteArray(), bundle, 1));
    }

    public final void n(final NgaState ngaState, final ls lsVar, final boolean z) {
        this.d.n("[NGA] NgaInteractorConnection::setState", new f(this, ngaState, z, lsVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.k.h

            /* renamed from: a, reason: collision with root package name */
            public final n f1685a;
            public final NgaState b;
            public final boolean c;
            public final ls d;

            {
                this.f1685a = this;
                this.b = ngaState;
                this.c = z;
                this.d = lsVar;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                NgaState ngaState2;
                n nVar = this.f1685a;
                NgaState ngaState3 = this.b;
                if (this.c || (ngaState2 = nVar.b) == null || ngaState3.b() || ngaState2.b()) {
                    nVar.f1687a.b(new d(nVar, ngaState3, this.d, 1));
                }
            }
        });
    }
}
