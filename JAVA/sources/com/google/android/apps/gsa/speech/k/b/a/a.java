package com.google.android.apps.gsa.speech.k.b.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/a/a.class */
public final class a {
    private static a c;

    /* renamed from: a */
    public final Object f1599a = new Object();
    public boolean b = false;

    private a() {
    }

    public static a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            } finally {
            }
        }
        return aVar;
    }
}
