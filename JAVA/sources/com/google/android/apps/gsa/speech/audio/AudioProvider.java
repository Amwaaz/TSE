package com.google.android.apps.gsa.speech.audio;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.d.b.b;
import com.google.android.apps.gsa.shared.search.a;
import com.google.android.libraries.speech.b.c;
import com.google.common.f.h;
import com.google.common.f.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/audio/AudioProvider.class */
public final class AudioProvider extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1588a = j.i("com.google.android.apps.gsa.speech.audio.AudioProvider");
    private boolean c;
    private final Object b = new Object();
    private final UriMatcher d = new UriMatcher(-1);

    private final File a(Uri uri) {
        return getContext().getFileStreamPath(uri.getLastPathSegment());
    }

    private final void b() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            String b = i.b(getContext());
            h d = f1588a.d();
            d.ak(9566);
            d.s("authority: %s", b);
            UriMatcher uriMatcher = this.d;
            c cVar = c.a;
            c cVar2 = c.b;
            c cVar3 = c.c;
            c cVar4 = c.d;
            for (int i = 0; i < 5; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    c cVar5 = new c[]{cVar, cVar2, cVar3, cVar4}[i2];
                    uriMatcher.addURI(b, "VoiceSearchOriginalAudioRecording" + i + "." + cVar5.f, cVar5.g);
                }
            }
            this.c = true;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        b();
        int match = this.d.match(uri);
        for (c cVar : c.values()) {
            if (cVar.g == match) {
                return cVar.e;
            }
        }
        throw new IllegalArgumentException("invalid code: " + match);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        com.google.android.apps.gsa.d.e.l(6);
        b.c(6);
        b();
        if (this.d.match(uri) <= 0) {
            throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        if (this.d.match(uri) != c.c.g) {
            byte[] asByteArray = contentValues.getAsByteArray("data");
            File a2 = a(uri);
            try {
                try {
                    new FileOutputStream(a2).write(asByteArray);
                    return uri;
                } finally {
                }
            } catch (FileNotFoundException e) {
                aus.b(f1588a.e(), "Failed to open audio file %s", a2, (char) 9567, e);
                return null;
            } catch (IOException e2) {
                aus.b(f1588a.e(), "Failed to write audio file %s", a2, (char) 9568, e2);
                return null;
            }
        }
        byte[] asByteArray2 = contentValues.getAsByteArray("data");
        File a3 = a(uri);
        try {
            byte[] bArr = com.google.audio.a.a.a;
            int length = asByteArray2.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(asByteArray2, 0, bArr2, 0, length);
            Integer asInteger = contentValues.getAsInteger("sample-rate");
            int intValue = asInteger.intValue();
            boolean z = intValue > 0;
            a.b.au(z, "Sample rate must be positive, got: %s", new Object[]{asInteger});
            Integer asInteger2 = contentValues.getAsInteger("channel-count");
            int intValue2 = asInteger2.intValue();
            a.b.au(intValue2 > 0, "Number of channels must be positive, got: %s", new Object[]{asInteger2});
            FileOutputStream fileOutputStream = new FileOutputStream(a3);
            try {
                a.b.au(z, "Sample rate must be set", new Object[0]);
                int i = intValue2 + intValue2;
                int i2 = length - (length % i);
                int i3 = intValue2 <= 2 ? 16 : 40;
                fileOutputStream.write("RIFF".getBytes());
                int i4 = i2 % 2;
                com.google.audio.a.a.a(fileOutputStream, i3 + 20 + i2 + i4);
                fileOutputStream.write("WAVE".getBytes());
                fileOutputStream.write("fmt ".getBytes());
                com.google.audio.a.a.a(fileOutputStream, i3);
                com.google.audio.a.a.b(fileOutputStream, intValue2 <= 2 ? 1 : -2);
                com.google.audio.a.a.b(fileOutputStream, intValue2);
                com.google.audio.a.a.a(fileOutputStream, intValue);
                int i5 = intValue * intValue2;
                com.google.audio.a.a.a(fileOutputStream, i5 + i5);
                com.google.audio.a.a.b(fileOutputStream, i);
                com.google.audio.a.a.b(fileOutputStream, 16);
                if (intValue2 > 2) {
                    com.google.audio.a.a.b(fileOutputStream, 22);
                    com.google.audio.a.a.b(fileOutputStream, 16);
                    com.google.audio.a.a.a(fileOutputStream, 0);
                    com.google.audio.a.a.b(fileOutputStream, 1);
                    fileOutputStream.write(com.google.audio.a.a.a);
                }
                fileOutputStream.write("data".getBytes());
                com.google.audio.a.a.a(fileOutputStream, i2);
                fileOutputStream.write(bArr2, 0, i2);
                if (i4 == 1) {
                    fileOutputStream.write(0);
                }
                fileOutputStream.flush();
                return uri;
            } finally {
            }
        } catch (FileNotFoundException e3) {
            aus.b(f1588a.e(), "Failed to open audio file %s", a3, (char) 9569, e3);
            return null;
        } catch (IOException e4) {
            aus.b(f1588a.e(), "Failed to write audio file %s", a3, (char) 9570, e4);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        com.google.android.apps.gsa.d.e.m(6);
        b.d(6);
        b();
        if (this.d.match(uri) <= 0) {
            throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        if ("r".equals(str)) {
            return ParcelFileDescriptor.open(a(uri), 268435456);
        }
        throw new IllegalArgumentException("Bad mode: ".concat(String.valueOf(str)));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.google.android.apps.gsa.d.e.n(6);
        b.e(6);
        b();
        if (this.d.match(uri) <= 0) {
            throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name", "_size"}, 1);
        matrixCursor.addRow(new Object[]{uri.getLastPathSegment(), Long.valueOf(a(uri).length())});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
