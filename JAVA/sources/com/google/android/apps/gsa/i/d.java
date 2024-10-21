package com.google.android.apps.gsa.i;

import android.content.Context;
import com.google.android.apps.gsa.c.a.b;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.l.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/i/d.class */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f358a = j.i("com.google.android.apps.gsa.i.d");
    public final b b;
    private final Context c;

    public d(Context context, b bVar) {
        this.c = context;
        this.b = bVar;
    }

    public final byte[] a(String str) {
        FileInputStream fileInputStream;
        byte[] bArr;
        File file;
        int i;
        FileInputStream fileInputStream2 = null;
        try {
            file = new File(this.c.getFilesDir(), str);
        } catch (IOException e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            r.a(fileInputStream2);
            throw th;
        }
        if (file.isFile()) {
            long length = file.length();
            if (length < 524288) {
                fileInputStream = this.c.openFileInput(str);
                int i2 = (int) length;
                fileInputStream2 = fileInputStream;
                try {
                    try {
                        byte[] bArr2 = new byte[i2];
                        int i3 = 0;
                        do {
                            int read = fileInputStream.read(bArr2, i3, i2);
                            if (read <= 0) {
                                break;
                            }
                            i = i2 - read;
                            i3 += read;
                            i2 = i;
                        } while (i > 0);
                        r.a(fileInputStream);
                        bArr = bArr2;
                    } catch (Throwable th2) {
                        th = th2;
                        r.a(fileInputStream2);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    h g = f358a.e().g(e);
                    FileInputStream fileInputStream3 = fileInputStream;
                    g.ak(1913);
                    fileInputStream2 = fileInputStream;
                    g.s("Failed to read file: %s", str);
                    r.a(fileInputStream);
                    bArr = null;
                    return bArr;
                }
                return bArr;
            }
            h e3 = f358a.e();
            e3.ak(1914);
            e3.D("Data is too large (%d bytes) to read to disk: %s", length, str);
        }
        r.a((InputStream) null);
        return null;
    }
}
