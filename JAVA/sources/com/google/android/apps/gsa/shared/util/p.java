package com.google.android.apps.gsa.shared.util;

import android.net.Uri;
import com.google.common.b.fl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/p.class */
public final class p {
    public static final String[] b;
    public static final Uri k;
    private static final String[] l;

    /* renamed from: a */
    public static final fl f1571a = fl.q("com.google.android.googlequicksearchbox", "com.google.android.carassistant");
    public static final fl c = fl.p("com.waze");
    public static final fl d = fl.q("com.google.android.apps.messaging", "com.google.android.libraries.assistant.appintegration.sample");
    public static final fl e = fl.t("com.google.stadia.android.dev", "com.google.stadia.android", "com.google.chrome.cloudcast.client.mobile.dev", "com.google.chrome.cloudcast.client.mobile.enterprise", "com.google.chrome.cloudcast.client.mobile");
    public static final fl f = fl.u("com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps");
    public static final fl g = fl.s("com.google.atap.jacquard", "com.google.android.apps.jacquard.devint", "com.google.android.apps.jacquard.qa", "com.google.android.apps.jacquard");
    public static final fl h = fl.r("com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.canary", "com.google.android.inputmethod.latin.dev");
    public static final fl i = fl.t("com.google.android.apps.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");
    public static final Uri j = Uri.parse("android-app://com.google.android.googlequicksearchbox/https/www.google.com");

    static {
        String[] strArr = {"com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"};
        l = strArr;
        b = (String[]) strArr.clone();
        Uri.parse(String.format("content://%s", "com.google.android.apps.gsa.voiceinteraction.hotword.HotwordAudioProvider"));
        k = Uri.parse(String.format("content://%s", "com.google.android.apps.gsa.nga.engine.bisto.TranscriptionAudioProvider"));
        Uri.parse("package:com.google.android.googlequicksearchbox");
    }
}
