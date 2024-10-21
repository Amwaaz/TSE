package com.google.android.apps.gsa.search.core.aa;

import com.google.android.apps.gsa.binaries.velvet.app.lt;
import com.google.android.apps.gsa.search.core.aa.a.c;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.m;
import com.google.android.apps.search.assistant.surfaces.voice.j.e.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/aa/b.class */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f1046a;
    private final int b;

    public b(lt ltVar, c cVar, int i) {
        this.b = i;
        ltVar.getClass();
        cVar.getClass();
        this.f1046a = ltVar.v(new a(cVar, 1), new a(cVar, 0));
    }

    public b(lt ltVar, c cVar, int i, byte[] bArr) {
        this.b = i;
        ltVar.getClass();
        cVar.getClass();
        this.f1046a = ltVar.w(new a(cVar, 2), new a(cVar, 3));
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.j.b.m
    public final /* synthetic */ f a(Object obj) {
        return this.b != 0 ? this.f1046a.a(obj) : this.f1046a.a(obj);
    }
}
