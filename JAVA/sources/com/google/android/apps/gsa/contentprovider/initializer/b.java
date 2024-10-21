package com.google.android.apps.gsa.contentprovider.initializer;

import com.google.android.apps.gsa.contentprovider.d;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.f.h;
import com.google.common.f.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/contentprovider/initializer/b.class */
public abstract class b extends d {

    /* renamed from: a */
    private static final j f338a = j.i("com.google.android.apps.gsa.contentprovider.initializer.b");
    private static boolean b = false;

    protected abstract boolean a();

    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a aVar = new a(getContext());
        f e = f.e(aVar.b);
        e.l(aVar.a);
        e.t(printWriter, "");
    }

    @Override // com.google.android.apps.gsa.contentprovider.d, android.content.ContentProvider
    public final boolean onCreate() {
        if (b) {
            h f = f338a.f();
            f.ak(1850);
            f.p("Process already initialized!");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
        } else {
            b = a();
        }
        return b;
    }
}
