package com.google.android.apps.gsa.speech.p;

import com.google.ap.e.c.b.m;
import com.google.ap.e.c.b.p;
import com.google.ap.e.c.b.v;
import com.google.common.f.h;
import com.google.common.f.j;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/p/a.class */
public class a {

    /* renamed from: a */
    private static final j f1617a = j.i("com.google.android.apps.gsa.speech.p.a");

    public static String a(String str, m mVar) {
        Iterator it = mVar.d.iterator();
        while (it.hasNext()) {
            for (p pVar : ((v) it.next()).d) {
                Iterator it2 = pVar.e.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).equals(str)) {
                        return pVar.d;
                    }
                }
            }
        }
        return str.contains("_") ? a(str.substring(0, str.lastIndexOf(95)), mVar) : "en-001";
    }

    public static String b(m mVar, String str) {
        Iterator it = mVar.d.iterator();
        while (it.hasNext()) {
            for (p pVar : ((v) it.next()).d) {
                if (pVar.d.equals(str)) {
                    return pVar.c;
                }
            }
        }
        h e = f1617a.e();
        e.ak(10271);
        e.s("No display name for: %s", str);
        return "";
    }
}
