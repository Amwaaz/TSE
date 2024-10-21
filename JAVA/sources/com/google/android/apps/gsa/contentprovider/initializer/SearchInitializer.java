package com.google.android.apps.gsa.contentprovider.initializer;

import android.os.Handler;
import androidx.annotation.a;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.gsa.shared.util.n.c;
import com.google.android.libraries.gsa.h.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/contentprovider/initializer/SearchInitializer.class */
public class SearchInitializer extends b {
    @Override // com.google.android.apps.gsa.contentprovider.initializer.b
    protected final boolean a() {
        com.google.android.apps.gsa.shared.util.n.b.a(c.SEARCH);
        d.f1553a = new com.google.android.apps.gsa.shared.o.a.a.b();
        i.b(a.class);
        new Handler().postAtFrontOfQueue(new Runnable() { // from class: com.google.android.apps.gsa.shared.util.debug.b.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
                i.b(androidx.annotation.a.class);
            }
        });
        return true;
    }
}
