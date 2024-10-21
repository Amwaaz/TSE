package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.an.c.c;
import com.google.android.apps.gsa.nga.engine.recognition.m.b;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import java.io.File;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/v.class */
public final class v implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f667a = {"/system/usr/srec", "/product/usr/srec"};
    private static final d c = d.j();
    public final Context b;
    private final com.google.android.apps.gsa.nga.engine.an.c.d d;
    private final String[] e;

    public v(Context context, com.google.android.apps.gsa.nga.engine.an.c.d dVar, String[] strArr) {
        this.b = context;
        this.d = dVar;
        this.e = strArr;
    }

    private static String c(File file) {
        return String.valueOf(file.getPath()).concat(String.valueOf(File.separator));
    }

    private static boolean d(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equals("metadata")) {
                a d = c.d();
                d.ak(3961);
                d.s("Found LP metadata file: %s", file2.getAbsolutePath());
                return true;
            }
        }
        a d2 = c.d();
        d2.ak(3960);
        d2.s("No LP metadata found in: %s", file.getAbsolutePath());
        return false;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.m.b
    public final String a(Locale locale) {
        String c2;
        int i = 0;
        Optional findFirst = Collection._EL.stream(this.d.f463a).sorted(Comparator._CC.comparing(new com.google.android.apps.gsa.nga.engine.an.c.b(1))).map(new com.google.android.apps.gsa.nga.engine.an.c.b(0)).filter(new c()).map(new com.google.android.apps.gsa.nga.engine.an.c.b(2)).findFirst();
        if (findFirst.isPresent()) {
            return findFirst.get().toString().concat(String.valueOf(File.separator));
        }
        if (locale.equals(Locale.ROOT)) {
            return "";
        }
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        File file = new File(this.b.getDir("g3_models", 0), locale.toLanguageTag());
        if (!d(file)) {
            a f = c.f();
            f.ak(3957);
            f.s("SODA model not found in g3_models for %s", locale.toLanguageTag());
            String[] strArr = this.e;
            while (true) {
                if (i >= 2) {
                    c2 = c(file);
                    break;
                }
                String str = strArr[i];
                File file2 = new File(str, locale.toLanguageTag());
                if (d(file2)) {
                    a d = c.d();
                    d.ak(3958);
                    d.H("SODA model found in system image (%s) for %s", str, locale.toLanguageTag());
                    c2 = c(file2);
                    break;
                }
                a f2 = c.f();
                f2.ak(3959);
                f2.H("SODA model not found in system image (%s) for %s", str, locale.toLanguageTag());
                i++;
            }
        } else {
            c2 = c(file);
        }
        return c2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.m.b
    public final String b() {
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return com.google.common.util.b.a(new String[]{this.b.getCacheDir().getAbsolutePath(), "soda/"});
    }
}
