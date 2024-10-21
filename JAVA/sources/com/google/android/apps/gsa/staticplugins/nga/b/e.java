package com.google.android.apps.gsa.staticplugins.nga.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.Settings;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.aq;
import com.google.android.apps.gsa.nga.api.at;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.o.ls;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/b/e.class */
public final class e implements at {
    private static final com.google.common.f.a.d g = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f1677a;
    public final a b;
    public final a c;
    public final k d;
    public boolean e = false;
    public final ContentObserver f = new c(this);
    private final h h;

    public e(ContentResolver contentResolver, aw awVar, a aVar, a aVar2, k kVar) {
        this.f1677a = contentResolver;
        this.h = awVar.a(d.class);
        this.b = aVar;
        this.c = aVar2;
        this.d = kVar;
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void a(NgaState ngaState) {
        throw null;
    }

    public final void c() {
        this.h.n("[NGA] AssistAppChecker.onAssistAppChanged.notifyListeners", new a(this));
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void ir(NgaState ngaState, boolean z) {
        if (!z) {
            this.h.n("[NGA] onNgaStateChanged", new f(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.b.b

                /* renamed from: a, reason: collision with root package name */
                public final e f1675a;

                {
                    this.f1675a = this;
                }

                @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                public final void run() {
                    e eVar = this.f1675a;
                    if (!((aq) eVar.c.a()).a().equals(ls.b)) {
                        if (eVar.e) {
                            eVar.f1677a.unregisterContentObserver(eVar.f);
                        }
                        eVar.e = false;
                    } else {
                        if (eVar.e) {
                            return;
                        }
                        eVar.f1677a.registerContentObserver(Settings.Secure.getUriFor("voice_interaction_service"), false, eVar.f);
                        eVar.e = true;
                    }
                }
            });
            return;
        }
        com.google.common.f.a.a d = g.d();
        d.ak(15060);
        d.p("TNG is active skip registration");
    }
}
