package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.common.b.fu;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/av.class */
final class av {

    /* renamed from: a, reason: collision with root package name */
    public final fu f532a;
    public final ha b;
    public final boolean c;

    public av() {
        throw null;
    }

    public av(fu fuVar, ha haVar, boolean z) {
        if (fuVar == null) {
            throw new NullPointerException("Null freshContacts");
        }
        this.f532a = fuVar;
        if (haVar == null) {
            throw new NullPointerException("Null allContacts");
        }
        this.b = haVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return this.f532a.equals(avVar.f532a) && this.b.equals(avVar.b) && this.c == avVar.c;
    }

    public final int hashCode() {
        int am = com.google.android.libraries.assistant.assistantactions.rendering.b.f.am(this.f532a.v());
        return ((((am ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        ha haVar = this.b;
        return "FreshContactsData{freshContacts=" + this.f532a.toString() + ", allContacts=" + haVar.toString() + ", isInitialized=" + this.c + "}";
    }
}
