package com.google.android.apps.gsa.nga.engine.bisto;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.nga.engine.bisto.b.y;
import com.google.apps.tiktok.i.x;
import j$.util.Optional;
import java.io.FileNotFoundException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/bisto/TranscriptionAudioProvider.class */
public class TranscriptionAudioProvider extends com.google.android.apps.gsa.shared.search.a {

    /* renamed from: a, reason: collision with root package name */
    public y f511a;
    private boolean b = false;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/bisto/TranscriptionAudioProvider$a.class */
    public interface a {
        void ZN(TranscriptionAudioProvider transcriptionAudioProvider);
    }

    private final void a() {
        Context context;
        synchronized (this) {
            if (this.b || (context = getContext()) == null) {
                return;
            }
            ((a) x.c(context, a.class)).ZN(this);
            this.b = true;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        e.k(4);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "audio";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        e.l(4);
        return null;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        e.m(4);
        if (!"r".equals(str)) {
            throw new FileNotFoundException("Mode is not read.");
        }
        a();
        int parseId = (int) ContentUris.parseId(uri);
        y yVar = this.f511a;
        if (yVar == null) {
            throw new FileNotFoundException("Audio provider injection failed.");
        }
        Optional ofNullable = Optional.ofNullable((ParcelFileDescriptor) yVar.b.a.e(Integer.valueOf(parseId)));
        if (ofNullable.isEmpty()) {
            throw new FileNotFoundException("Unable to get read pipe.");
        }
        return (ParcelFileDescriptor) ofNullable.get();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        e.n(4);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        e.o(4);
        return 0;
    }
}
