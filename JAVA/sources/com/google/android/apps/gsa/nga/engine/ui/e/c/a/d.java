package com.google.android.apps.gsa.nga.engine.ui.e.c.a;

import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/c/a/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ha f702a = ha.s(com.google.android.apps.gsa.assistant.shared.k.c.LONG_PRESS_POWER_BUTTON, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_POWER_BUTTON);
    public final b b;
    public final b c;

    static {
        ha.w(com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_DIAG_SWIPE_GESTURE, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_ELMYRA, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_COLUMBUS, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_HOME, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_HOTWORD, new com.google.android.apps.gsa.assistant.shared.k.c[]{com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_NOW_PLAYING, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_POWER_BUTTON});
    }

    public d() {
        throw null;
    }

    public d(b bVar, b bVar2) {
        this.b = bVar;
        this.c = bVar2;
    }

    public final boolean a() {
        b bVar = this.c;
        int i = bVar.f;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            int i2 = bVar.d;
            if (i2 != 0) {
                return i2 == 8;
            }
        }
        throw null;
    }

    public final boolean b() {
        int i = this.c.f;
        boolean z = i == 2;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean c() {
        int i = this.c.e;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean d() {
        b bVar = this.c;
        int i = bVar.f;
        if (i != 0) {
            if (i != 3) {
                return false;
            }
            int i2 = bVar.d;
            if (i2 != 0) {
                return i2 == 4;
            }
        }
        throw null;
    }

    public final boolean e() {
        b bVar = this.c;
        int i = bVar.f;
        if (i != 0) {
            if (i != 3) {
                return false;
            }
            int i2 = bVar.d;
            if (i2 != 0) {
                return i2 == 3;
            }
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b.equals(dVar.b) && this.c.equals(dVar.c);
    }

    public final boolean f() {
        b bVar = this.c;
        int i = bVar.f;
        if (i != 0) {
            if (i != 3) {
                return false;
            }
            int i2 = bVar.d;
            if (i2 != 0) {
                return i2 == 9;
            }
        }
        throw null;
    }

    public final boolean g() {
        int i = this.c.d;
        boolean z = i == 6;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return String.format("previousState: %s\nstate: %s", this.b, this.c);
    }
}
