package com.google.android.apps.gsa.assistant.settings.shared;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.k.bw;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.k.cl;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.g.ar.br;
import com.google.protobuf.cb;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/shared/p.class */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Map f256a = new LinkedHashMap();
    private final List b;
    private final boolean c;
    private final c d;
    private final Map e;

    public p(List list, boolean z, c cVar) {
        this.b = list;
        this.c = z;
        this.d = cVar;
        this.e = cVar.o(bw.q);
    }

    public static boolean h(String str, c cVar) {
        boolean z = true;
        if (!cVar.m(bw.b).contains(str)) {
            z = true;
            if (!cVar.o(bw.q).containsKey(str)) {
                if (!cVar.w(bw.t)) {
                    z = false;
                } else {
                    if (!cVar.m(bw.f1419a).contains(ar.g(str))) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    public final String a(br brVar) {
        String b = b(brVar);
        if (b != null) {
            return b;
        }
        cb cbVar = brVar.g;
        if (!cbVar.isEmpty() && (!this.d.w(bw.D) ? !g((String) cbVar.get(0)) : !h((String) cbVar.get(0), this.d))) {
            return (String) cbVar.get(0);
        }
        String d = d();
        if (this.d.w(bw.D)) {
            if (!h(d, this.d)) {
                return "en-US";
            }
        } else if (!g(d)) {
            return "en-US";
        }
        return d;
    }

    public final String b(br brVar) {
        cb cbVar = brVar.f;
        if (cbVar.isEmpty()) {
            return null;
        }
        if (this.d.w(bw.D)) {
            if (!h((String) cbVar.get(0), this.d)) {
                return null;
            }
        } else if (!g((String) cbVar.get(0))) {
            return null;
        }
        return (String) cbVar.get(0);
    }

    public final String c(br brVar) {
        cb cbVar = brVar.f;
        if (cbVar.size() <= 1) {
            return null;
        }
        String str = (String) cbVar.get(1);
        if (this.d.w(bw.D)) {
            if (!h(str, this.d)) {
                return null;
            }
        } else if (!g(str)) {
            return null;
        }
        return str;
    }

    public final String d() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Map map = this.e;
        String str = languageTag;
        if (map != null) {
            str = languageTag;
            if (map.containsKey(languageTag)) {
                str = (String) this.e.get(languageTag);
            }
        }
        return str;
    }

    public final String e(String str) {
        String str2 = (String) this.d.o(bw.x).get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        return forLanguageTag.getDisplayName(forLanguageTag);
    }

    public final void f() {
        if (!this.f256a.isEmpty() || this.b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (Locale locale : Locale.getAvailableLocales()) {
            hashSet.add(new Locale(locale.getLanguage(), locale.getCountry()).toLanguageTag());
        }
        hashSet.addAll(this.d.m(cl.d));
        HashSet hashSet2 = new HashSet((Collection) this.d.m(bw.C));
        hashSet2.addAll(this.d.m(cl.d));
        HashSet hashSet3 = new HashSet();
        for (String str : this.b) {
            if (!this.d.w(bw.c) || hashSet.contains(str)) {
                Locale forLanguageTag = Locale.forLanguageTag(str);
                String language = forLanguageTag.getLanguage();
                if (!this.c || hashSet2.contains(str)) {
                    String e = e(str);
                    if (!TextUtils.isEmpty(e)) {
                        this.f256a.put(str, e);
                    }
                } else if (!hashSet3.contains(language) && !forLanguageTag.getDisplayLanguage(forLanguageTag).isEmpty()) {
                    this.f256a.put(str, forLanguageTag.getDisplayLanguage(forLanguageTag));
                    hashSet3.add(language);
                }
            }
        }
    }

    public final boolean g(String str) {
        f();
        return this.f256a.containsKey(str);
    }
}
