package com.google.android.apps.gsa.search.shared.service.d.a;

import android.os.Bundle;
import com.google.android.apps.gsa.p.e;
import com.google.android.apps.gsa.p.f;
import com.google.android.apps.gsa.p.g;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.oo;
import com.google.common.f.j;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/d/a/b.class */
public class b extends e {
    private static final j b = j.i("com.google.android.apps.gsa.search.shared.service.d.a.b");
    private h c;
    private final a d;

    public b(a aVar, h hVar) {
        this.d = aVar;
        this.c = hVar;
    }

    @Override // com.google.android.apps.gsa.p.e
    public final Bundle a(int i) {
        synchronized (this) {
            if (i != 4) {
                return null;
            }
            Bundle bundle = new Bundle();
            int i2 = 4;
            switch (this.d.a()) {
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                case 10:
                    i2 = 2;
                    break;
                case 4:
                case 9:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 3;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            bundle.putInt("state", i2);
            return bundle;
        }
    }

    @Override // com.google.android.apps.gsa.p.e
    public boolean c() {
        return true;
    }

    public final void d() {
        synchronized (this) {
            h hVar = this.c;
            if (hVar != null) {
                g.f1031a.add(this);
                Iterator it = oo.e(g.b).iterator();
                while (it.hasNext()) {
                    hVar.n("addDebuggableComponent", new com.google.android.apps.gsa.p.b((f) it.next()));
                }
                this.c = null;
                return;
            }
            com.google.common.f.h f = b.f();
            f.aj(com.google.common.f.a.e.a, "SessionDebugComp");
            com.google.common.f.h hVar2 = f;
            hVar2.ak(8371);
            hVar2.p("#register: Component is already registered");
        }
    }
}
