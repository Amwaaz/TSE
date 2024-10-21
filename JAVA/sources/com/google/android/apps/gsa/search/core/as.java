package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.google.am;
import com.google.android.apps.gsa.shared.k.c;
import com.google.common.base.ca;
import e.a;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/as.class */
public final class as implements ca {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1097a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private String f;
    private boolean g;

    public as(Context context, a aVar, a aVar2, a aVar3, a aVar4) {
        this.f1097a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    private final String d(String str) {
        return str + " GSA/" + ((String) this.c.a());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        String str;
        String str2;
        synchronized (this) {
            boolean c = com.google.android.apps.gsa.shared.ui.b.a.c(this.f1097a, (c) this.e.a());
            if (this.f == null) {
                String string = ((SharedPreferences) this.b.a()).getString("user_agent", null);
                String str3 = string;
                if (string == null) {
                    Locale locale = Locale.getDefault();
                    StringBuilder sb = new StringBuilder();
                    String str4 = Build.VERSION.RELEASE;
                    if (str4.length() <= 0) {
                        sb.append("1.0");
                    } else if (Character.isDigit(str4.charAt(0))) {
                        sb.append(str4);
                    } else {
                        sb.append("8.1.0");
                    }
                    sb.append("; ");
                    String language = locale.getLanguage();
                    if (language != null) {
                        int i = am.t;
                        if ("iw".equals(language)) {
                            str2 = "he";
                        } else if ("in".equals(language)) {
                            str2 = "id";
                        } else {
                            str2 = language;
                            if ("ji".equals(language)) {
                                str2 = "yi";
                            }
                        }
                        sb.append(str2);
                        String country = locale.getCountry();
                        if (country != null) {
                            sb.append("-");
                            sb.append(country.toLowerCase(Locale.US));
                        }
                    } else {
                        sb.append("en");
                    }
                    sb.append(";");
                    if ("REL".equals(Build.VERSION.CODENAME)) {
                        String str5 = Build.MODEL;
                        if (str5.length() > 0) {
                            sb.append(" ");
                            sb.append(str5);
                        }
                    }
                    String str6 = Build.ID;
                    if (str6.length() > 0) {
                        sb.append(" Build/");
                        sb.append(str6);
                    }
                    str3 = String.format(Locale.US, "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 %sSafari/534.30", sb, true != c ? "Mobile " : "");
                }
                this.g = true;
                this.f = d(str3);
            }
            str = this.f;
        }
        return str;
    }

    public final void c(WebView webView) {
        synchronized (this) {
            if (this.f == null || this.g) {
                WebSettings settings = webView.getSettings();
                String userAgentString = settings.getUserAgentString();
                ((SharedPreferences) this.b.a()).edit().putString("user_agent", userAgentString).apply();
                String d = d(userAgentString);
                this.f = d;
                this.g = false;
                settings.setUserAgentString(d);
                settings.setAllowFileAccess(false);
            }
        }
    }
}
