package com.google.android.apps.gsa.speech.hotword;

import com.google.android.apps.gsa.shared.speech.hotword.b.c;
import com.google.common.b.fq;
import com.google.common.b.fu;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/hotword/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f1595a = com.google.common.f.a.d.j();
    public static final fu b;

    static {
        fq fqVar = new fq(4);
        fqVar.i("zh-Hant-TW", "cmn-Hant-TW");
        fqVar.i("zh-TW", "cmn-Hant-TW");
        fqVar.i("zh-Hans-CN", "cmn-Hans-CN");
        fqVar.i("zh-CN", "cmn-Hans-CN");
        fqVar.i("zh-Hant-HK", "yue-Hant-HK");
        fqVar.i("zh-HK", "yue-Hant-HK");
        b = fqVar.h(false);
    }

    public static String a(String str, c cVar) {
        String str2 = (String) b.getOrDefault(str, str);
        if (!str2.equals(str)) {
            com.google.common.f.a.a d = f1595a.d();
            d.ak(9938);
            d.H("Changing locale %s to %s for hotword model lookup in MDD.", str, str2);
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            com.google.common.f.a.a e = f1595a.e();
            e.ak(9937);
            e.p("FileGroup queried for hotword model type `unknown`. This is undefined behavior; please use a specific model type.");
            return String.format(Locale.US, "hotword_model_%s_%s", str2, "unk");
        }
        if (ordinal == 1) {
            return String.format(Locale.US, "hotword_model_%s_%s", str2, "okg");
        }
        if (ordinal == 2) {
            return String.format(Locale.US, "hotword_model_%s_%s", str2, "okhey");
        }
        throw new AssertionError("This line is unreachable because the enum switch is exhaustive.");
    }

    public static String b(int i, String str) {
        int i2 = i - 1;
        if (i2 == 100) {
            return String.format("dsp_model_%s_%s", "ok-google", str);
        }
        if (i2 == 101) {
            return String.format("dsp_model_%s_%s", "x-google", str);
        }
        throw new AssertionError("This line is unreachable because the enum switch is exhaustive.");
    }
}
