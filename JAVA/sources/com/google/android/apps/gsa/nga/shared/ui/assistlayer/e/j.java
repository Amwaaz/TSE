package com.google.android.apps.gsa.nga.shared.ui.assistlayer.e;

import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.y;
import com.google.android.apps.gsa.search.core.ac.w;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ui/assistlayer/e/j.class */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    protected final e f1015a;
    protected final e b;
    protected final e c;
    protected final e d;
    protected final e e;
    protected final com.google.android.apps.gsa.nga.shared.s.f f;
    private final h g;
    private final a h;

    public j(h hVar, a aVar) {
        long d = aVar.d(bt.y);
        boolean i = aVar.i(bt.q);
        boolean i2 = aVar.i(br.Q);
        boolean i3 = aVar.i(br.z);
        boolean i4 = aVar.i(br.t);
        this.g = hVar;
        this.b = new com.google.android.apps.gsa.nga.shared.s.i(Long.valueOf(d), com.google.android.apps.gsa.nga.shared.ui.assistlayer.a.a.class);
        com.google.android.apps.gsa.nga.shared.s.i iVar = new com.google.android.apps.gsa.nga.shared.s.i(Boolean.valueOf(i2), com.google.android.apps.gsa.nga.shared.ui.assistlayer.a.a.class);
        this.c = iVar;
        com.google.android.apps.gsa.nga.shared.s.i iVar2 = new com.google.android.apps.gsa.nga.shared.s.i(Boolean.valueOf(i3), com.google.android.apps.gsa.nga.shared.ui.assistlayer.a.a.class);
        this.d = iVar2;
        this.f1015a = new com.google.android.apps.gsa.nga.shared.s.i(Boolean.valueOf(i), com.google.android.apps.gsa.nga.shared.ui.assistlayer.a.a.class);
        com.google.android.apps.gsa.nga.shared.s.i iVar3 = new com.google.android.apps.gsa.nga.shared.s.i(Boolean.valueOf(i4), com.google.android.apps.gsa.nga.shared.ui.assistlayer.a.a.class);
        this.e = iVar3;
        this.f = ad.i(iVar, iVar2, iVar3, new y() { // from class: com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.i
            @Override // com.google.android.apps.gsa.nga.shared.s.y
            public final Object a(Object obj, Object obj2, Object obj3) {
                return a.a.aX(obj, obj2, obj3);
            }
        });
        this.h = aVar;
    }

    public final com.google.android.apps.gsa.nga.shared.s.f a() {
        return this.f1015a;
    }

    public final com.google.android.apps.gsa.nga.shared.s.f b() {
        return this.f;
    }

    protected final void c(e eVar, Object obj, String str) {
        getClass().getSimpleName();
        ad.b(this.g, eVar, obj, str);
    }

    @Override // com.google.android.apps.gsa.search.core.ac.w
    public final void d(com.google.android.apps.gsa.search.core.h.i iVar) {
        if (iVar.a(bt.y.f1451a)) {
            c(this.b, Long.valueOf(this.h.d(bt.y)), "expandedContentScreenHeightPercent");
        }
        if (iVar.a(bt.q.f1434a)) {
            c(this.f1015a, Boolean.valueOf(this.h.i(bt.q)), "enableShowingContentAsSignalForTransparentActivity");
        }
        if (iVar.a(br.Q.f1434a)) {
            c(this.c, Boolean.valueOf(this.h.i(br.Q)), "learningCenterIconOnInputPlateEnabled");
        }
        if (iVar.a(br.z.f1434a)) {
            c(this.d, Boolean.valueOf(this.h.i(br.z)), "exploreIconOnInputPlateEnabled");
        }
        if (iVar.a(br.t.f1434a)) {
            c(this.e, Boolean.valueOf(this.h.i(br.t)), "doraIconOnInputPlateEnabled");
        }
    }
}
