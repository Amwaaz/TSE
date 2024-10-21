package com.google.android.apps.gsa.nga.engine.ak.h;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.q.c.aq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/h/ap.class */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f428a;
    private final Context b;
    private final com.google.android.apps.gsa.nga.shared.q.a.x c;

    public ap(ContentResolver contentResolver, Context context, com.google.android.apps.gsa.nga.shared.q.a.x xVar) {
        this.b = context;
        this.f428a = contentResolver;
        this.c = xVar;
    }

    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!b()) {
            return null;
        }
        this.c.b(new aq((byte[]) null));
        return this.f428a.query(uri, strArr, str, strArr2, str2);
    }

    public final boolean b() {
        return this.b.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
    }
}
