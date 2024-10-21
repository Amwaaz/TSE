package com.google.android.apps.gsa.speech.o;

import android.content.Context;
import android.database.DataSetObservable;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.ap.e.c.b.m;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bi;
import com.google.protobuf.ce;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/o/i.class */
public final class i extends DataSetObservable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1616a;
    public final Object b = new Object();
    public m c;
    public final n d;

    public i(Context context, n nVar) {
        this.f1616a = context;
        this.d = nVar;
        m mVar = null;
        byte[] e = nVar.e("voice_search_configuration_data", null);
        if (e != null) {
            try {
                mVar = bi.parseFrom(m.a, e, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (ce e2) {
            }
        }
        if (mVar != null && c(mVar)) {
            this.c = mVar;
            return;
        }
        m b = b(context);
        this.c = b;
        d(nVar, b);
    }

    public static m b(Context context) {
        ab abVar = e.a;
        try {
            return bi.parseFrom(m.a, ar.v(context.getResources(), 2132017500), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (ce e) {
            throw new RuntimeException("Unable to parse default configuration from asset", e);
        }
    }

    public static boolean c(m mVar) {
        return !mVar.c.isEmpty();
    }

    public static void d(n nVar, m mVar) {
        com.google.android.apps.gsa.search.core.preferences.i f = nVar.f();
        f.c("voice_search_configuration_data", mVar.toByteArray());
        f.b(false);
    }

    public final m a() {
        m mVar;
        synchronized (this.b) {
            mVar = this.c;
        }
        return mVar;
    }
}
