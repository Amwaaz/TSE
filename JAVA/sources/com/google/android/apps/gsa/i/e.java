package com.google.android.apps.gsa.i;

import android.content.Context;
import com.google.android.apps.gsa.c.a.b;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.l.x;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/i/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f359a = j.i("com.google.android.apps.gsa.i.e");
    public final com.google.android.apps.gsa.shared.logger.e b;
    public final b c;
    private final Context d;

    public e(Context context, b bVar, com.google.android.apps.gsa.shared.logger.e eVar) {
        this.d = context;
        this.c = bVar;
        this.b = eVar;
    }

    public final void a(String str) {
        new File(this.d.getFilesDir(), str).delete();
    }

    public final void b(String str, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        BufferedOutputStream bufferedOutputStream3;
        FileOutputStream openFileOutput;
        BufferedOutputStream bufferedOutputStream4;
        int length = bArr.length;
        String concat = str.concat(".new");
        try {
            openFileOutput = this.d.openFileOutput(concat, 0);
            bufferedOutputStream4 = new BufferedOutputStream(openFileOutput);
            bufferedOutputStream3 = bufferedOutputStream4;
        } catch (IOException | NullPointerException e) {
            bufferedOutputStream2 = null;
        } catch (Throwable th) {
            th = th;
            bufferedOutputStream = null;
            x.a(bufferedOutputStream);
            throw th;
        }
        try {
            try {
                bufferedOutputStream4.write(bArr);
                bufferedOutputStream4.flush();
                openFileOutput.getFD().sync();
                x.a(bufferedOutputStream4);
                if (new File(this.d.getFilesDir(), concat).renameTo(new File(this.d.getFilesDir(), str))) {
                    return;
                }
                h e2 = f359a.e();
                e2.ak(1919);
                e2.s("Renaming new file to %s failed", str);
                this.b.c(null, 63625513);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream3;
                x.a(bufferedOutputStream);
                throw th;
            }
        } catch (IOException | NullPointerException e3) {
            bufferedOutputStream2 = bufferedOutputStream4;
            h e4 = f359a.e();
            BufferedOutputStream bufferedOutputStream5 = bufferedOutputStream2;
            e4.ak(1920);
            BufferedOutputStream bufferedOutputStream6 = bufferedOutputStream2;
            e4.s("Failed to write new file: %s", concat);
            bufferedOutputStream3 = bufferedOutputStream2;
            this.b.c(null, 63625266);
            x.a(bufferedOutputStream2);
        }
    }
}
