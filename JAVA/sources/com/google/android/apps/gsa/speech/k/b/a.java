package com.google.android.apps.gsa.speech.k.b;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.speech.hotword.b.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1598a;
    public static final a b;
    public final int c;
    public final String d;
    private final boolean e;
    private final c f;

    static {
        c cVar = c.UNKNOWN;
        f1598a = new a(null, 0, false, cVar);
        b = new a(null, 1, false, cVar);
    }

    public a(String str, int i, boolean z, c cVar) {
        this.d = str;
        this.c = i;
        this.e = z;
        this.f = cVar;
    }

    public final boolean a() {
        return this == b;
    }

    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && TextUtils.equals(this.d, aVar.d) && this.f == aVar.f;
    }

    public final int hashCode() {
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) + this.c;
    }

    public final String toString() {
        return "HotwordModelInfo[prompt: " + this.d + ", state: " + this.c + ", speaker-id supported: " + this.e + ", modelType: " + this.f + "]";
    }
}
