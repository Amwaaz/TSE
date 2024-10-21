package com.google.android.apps.gsa.nga.engine.recognition.d;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.recognition.ac;
import com.google.android.apps.gsa.nga.shared.a.b;
import com.google.common.f.a.d;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/d/a.class */
public final class a {
    private static final d c = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final b f648a;
    public final ad b;
    private final Context d;

    public a(Context context, b bVar, ad adVar) {
        this.d = context;
        this.f648a = bVar;
        this.b = adVar;
    }

    public final void a(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.d.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
        } catch (IOException e) {
            aus.f(c.f(), "Failed to open/close file descriptor", (char) 3848, e);
        }
    }

    public final void b(ac acVar) {
        if (acVar.f.isPresent()) {
            a((Uri) acVar.f.get());
        }
    }
}
