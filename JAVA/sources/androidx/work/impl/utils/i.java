package androidx.work.impl.utils;

import android.content.Context;
import androidx.slice.b$;
import androidx.work.af;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/i.class */
public final class i {
    static {
        af.b("ProcessUtils");
    }

    public static final boolean a(Context context, androidx.work.c cVar) {
        context.getClass();
        cVar.getClass();
        String m = b$.ExternalSyntheticApiModelOutline0.m();
        m.getClass();
        String str = cVar.i;
        return (str == null || str.length() == 0) ? h.a.a.p.b.a.f.h(m, context.getApplicationInfo().processName) : h.a.a.p.b.a.f.h(m, cVar.i);
    }
}
