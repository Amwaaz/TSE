package com.google.android.apps.gsa.contentprovider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.d.e;
import com.google.apps.tiktok.i.x;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/contentprovider/CommonContentProvider.class */
public class CommonContentProvider extends com.google.android.apps.gsa.shared.search.a {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.apps.gsa.contentprovider.a f335a;
    private boolean b = false;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/contentprovider/CommonContentProvider$a.class */
    public interface a {
        void ZJ(CommonContentProvider commonContentProvider);
    }

    private static Uri a(Uri uri) {
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Invalid uri: ".concat(String.valueOf(String.valueOf(uri))));
        }
        Uri.Builder encodedQuery = new Uri.Builder().scheme("content").authority((String) arrayList.remove(0)).encodedQuery(uri.getEncodedQuery());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            encodedQuery.appendPath((String) arrayList.get(i));
        }
        return encodedQuery.build();
    }

    private final void b() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            ((a) x.c(getContext(), a.class)).ZJ(this);
            this.b = true;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        b();
        return this.f335a.d(a(uri));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        e.l(3);
        b();
        return this.f335a.a(a(uri), contentValues);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        e.m(3);
        b();
        return this.f335a.b(a(uri), str);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        e.n(3);
        b();
        return this.f335a.e(a(uri), strArr2);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
