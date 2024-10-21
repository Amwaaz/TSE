package com.google.android.apps.gsa.speech.k.b.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.speech.hotword.d;
import com.google.android.libraries.mdi.download.au;
import com.google.android.libraries.mdi.download.av;
import com.google.android.libraries.mdi.download.bz;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fq;
import com.google.common.base.ah;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.l.v;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/e/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1607a = j.i("com.google.android.apps.gsa.speech.k.b.e.f");
    public static final Map b = new HashMap();
    public static final com.google.android.apps.gsa.shared.speech.hotword.b.c c = com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE;
    public static final Map d;
    private static final Map e;

    static {
        fq fqVar = new fq(4);
        fqVar.i("Ok Google", com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE);
        fqVar.i("X Google", com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE);
        d = fqVar.h(false);
        fq fqVar2 = new fq(4);
        fqVar2.i(com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_GOOGLE, "hotword.data");
        fqVar2.i(com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE, "x_hotword.data");
        e = fqVar2.h(false);
    }

    public static cn a(final String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar, bz bzVar) {
        final String a2 = d.a(str, cVar);
        au a3 = av.a();
        a3.c(a2);
        cn g = bzVar.g(a3.a());
        ah ahVar = new ah(a2, str) { // from class: com.google.android.apps.gsa.speech.k.b.e.e

            /* renamed from: a, reason: collision with root package name */
            public final String f1606a;
            public final String b;

            {
                this.f1606a = a2;
                this.b = str;
            }

            public final Object apply(Object obj) {
                String str2;
                com.google.android.libraries.mdi.e eVar = (com.google.android.libraries.mdi.e) obj;
                j jVar = f.f1607a;
                if (eVar == null) {
                    String str3 = this.b;
                    String str4 = this.f1606a;
                    h e2 = f.f1607a.e();
                    e2.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
                    h hVar = e2;
                    hVar.ak(10083);
                    hVar.H("Hotword file group is null with group name: %s, locale: %s", str4, str3);
                    str2 = null;
                } else {
                    str2 = ((com.google.android.libraries.mdi.a) eVar.h.get(0)).d;
                }
                return str2;
            }
        };
        return i.g(g, ex.b(ahVar), ay.a);
    }

    public static File b(Context context, String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        String c2 = c(context, str, cVar);
        if (c2.isEmpty()) {
            return null;
        }
        return new File(c2);
    }

    public static String c(Context context, String str, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        boolean z = context == null;
        if (z || str == null) {
            h f = f1607a.f();
            f.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
            h hVar = f;
            hVar.ak(10079);
            hVar.N("Cannot load hotword model [isNullContext: %b, locale: %s, modelType: %s]", Boolean.valueOf(z), str, cVar);
            return "";
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            h f2 = f1607a.f();
            f2.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
            h hVar2 = f2;
            hVar2.ak(10082);
            hVar2.p("getFilesDir returned null");
            return "";
        }
        String absolutePath = filesDir.getAbsolutePath();
        if (absolutePath == null) {
            h f3 = f1607a.f();
            f3.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
            h hVar3 = f3;
            hVar3.ak(10081);
            hVar3.p("Absolute path is null");
            return "";
        }
        File file = new File(a.a.dx(str, absolutePath, "/"));
        file.mkdirs();
        String str2 = (String) e.get(cVar);
        if (str2 != null) {
            return file.getAbsolutePath() + "/" + str2;
        }
        h f4 = f1607a.f();
        f4.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
        h hVar4 = f4;
        hVar4.ak(10080);
        hVar4.p("Incorrect model type");
        int i = com.google.android.apps.gsa.shared.util.b.h.a;
        return "";
    }

    public static void d(Context context, String str, at atVar) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.interactor.HOTWORD_MODEL_DOWNLOADED");
        intent.setPackage(str);
        context.sendBroadcast(intent);
        ab abVar = com.google.common.f.a.e.a;
        if (atVar.h()) {
            ((com.google.android.libraries.search.ah.e.a.f) atVar.c()).a();
            h d2 = f1607a.d();
            d2.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
            h hVar = d2;
            hVar.ak(10085);
            hVar.p("Notified HDM of new hotword model.");
        }
    }

    @Deprecated
    public static byte[] e(Context context, String str, String str2, com.google.android.apps.gsa.shared.speech.hotword.b.c cVar) {
        Map map = b;
        if (map.containsKey(str)) {
            return (byte[]) map.get(str);
        }
        ab abVar = com.google.common.f.a.e.a;
        if (!URLUtil.isValidUrl(str)) {
            return g(context, str);
        }
        File b2 = b(context, str2, cVar);
        byte[] bArr = null;
        if (b2 != null) {
            try {
                bArr = new v(b2).b();
            } catch (IOException e2) {
                h e3 = f1607a.e();
                e3.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
                h g = e3.g(e2);
                g.ak(10090);
                g.s("No model available at %s", b2.getAbsolutePath());
            }
        }
        return bArr;
    }

    public static byte[] f(com.google.android.libraries.storage.a.j jVar, Uri uri) {
        h d2 = f1607a.d();
        d2.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
        h hVar = d2;
        hVar.ak(10087);
        hVar.s("#getHotwordModelFromMobstore [mobstoreUri: %s]", uri);
        try {
            return (byte[]) jVar.c(uri, new com.google.android.libraries.storage.a.g.e(0));
        } catch (IOException e2) {
            y e3 = f1607a.e();
            e3.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
            aus.b(e3, "Mobstore dereference of hotword model failed: %s", uri, (char) 10088, e2);
            return null;
        }
    }

    public static byte[] g(Context context, String str) {
        byte[] bArr;
        InputStream open;
        try {
            open = context.getAssets().open(str);
            bArr = new byte[open.available()];
        } catch (IOException e2) {
            e = e2;
            bArr = null;
        }
        try {
            try {
                open.read(bArr);
                open.close();
            } catch (IOException e3) {
                e = e3;
                y e4 = f1607a.e();
                e4.aj(com.google.common.f.a.e.a, "MicroModelsUtil");
                aus.b(e4, "No model available at location: %s", str, (char) 10089, e);
                return bArr;
            }
            return bArr;
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }
}
