package com.google.android.apps.gsa.shared.util;

import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.f.a.e;
import com.google.common.f.h;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/s.class */
public class s {

    /* renamed from: a */
    private static final com.google.common.f.j f1575a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.s");
    private final String b;
    private final String c;

    public s(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final fu a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(this.b)) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(this.c, -1);
                if (split.length != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Bad input '%s' in '%s' (entry separator: '%s'; key-value separator: '%s')", str2, str, this.b, this.c));
                }
                String str3 = split[0];
                if (hashMap.containsKey(str3) && !((String) hashMap.get(str3)).equals(split[1])) {
                    h d = f1575a.d();
                    d.aj(e.a, "MapSplitter");
                    h hVar = d;
                    hVar.ak(9287);
                    hVar.N("Duplicate key %s found in map with values %s and %s", str3, hashMap.get(str3), split[1]);
                }
                hashMap.put(split[0], split[1]);
            }
        }
        return fu.k(hashMap);
    }

    public final fu b(String str) {
        fq fqVar = new fq(4);
        for (String str2 : str.split(this.b)) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(this.c);
                if (split.length != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Bad input '%s' in '%s' (entry separator: '%s'; key-value separator: '%s')", str2, str, this.b, this.c));
                }
                fqVar.i(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            }
        }
        return fqVar.h(false);
    }
}
