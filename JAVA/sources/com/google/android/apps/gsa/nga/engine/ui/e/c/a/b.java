package com.google.android.apps.gsa.nga.engine.ui.e.c.a;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/c/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f700a;
    public final com.google.android.apps.gsa.assistant.shared.k.c b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    private final Optional g;

    public b() {
        throw null;
    }

    public b(int i, int i2, Optional optional, Optional optional2, com.google.android.apps.gsa.assistant.shared.k.c cVar, int i3, boolean z) {
        this.f = i;
        this.d = i2;
        this.g = optional;
        this.f700a = optional2;
        this.b = cVar;
        this.e = i3;
        this.c = z;
    }

    public static a a() {
        a aVar = new a(null);
        aVar.c = 1;
        aVar.c(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN);
        aVar.b(false);
        aVar.d = 1;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i = this.f;
        int i2 = bVar.f;
        if (i == 0) {
            throw null;
        }
        if (i != i2) {
            return false;
        }
        int i3 = this.d;
        int i4 = bVar.d;
        if (i3 == 0) {
            throw null;
        }
        if (i3 != i4 || !this.g.equals(bVar.g) || !this.f700a.equals(bVar.f700a) || !this.b.equals(bVar.b)) {
            return false;
        }
        int i5 = this.e;
        int i6 = bVar.e;
        if (i5 != 0) {
            return i5 == i6 && this.c == bVar.c;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        a.a.dv(i);
        int i2 = this.d;
        a.a.cR(i2);
        int hashCode = this.g.hashCode();
        int hashCode2 = this.f700a.hashCode();
        int hashCode3 = this.b.hashCode();
        int i3 = this.e;
        a.a.cR(i3);
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        int i = this.f;
        String str2 = "null";
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "EXECUTING" : "IDLE" : "HALF_LISTENING" : "FULL_LISTENING";
        switch (this.d) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "CANCELLATION";
                break;
            case 3:
                str = "OPENING_ZEROSTATE";
                break;
            case 4:
                str = "OPENING_TYPING_MODE";
                break;
            case 5:
                str = "NON_VOICE_INTERACTION";
                break;
            case 6:
                str = "UTTERANCE_DONE";
                break;
            case 7:
                str = "CLOSE_MIC_MUSIC_SEARCH_REQUEST";
                break;
            case 8:
                str = "RETRY";
                break;
            case 9:
                str = "RETRY_WHILE_NOT_LISTENING";
                break;
            case 10:
                str = "TACTILE_SHELF_OPENED";
                break;
            case 11:
                str = "OAUTH_USER_RECOVERABLE_ERROR";
                break;
            default:
                str = "null";
                break;
        }
        Optional optional = this.g;
        Optional optional2 = this.f700a;
        com.google.android.apps.gsa.assistant.shared.k.c cVar = this.b;
        int i2 = this.e;
        String valueOf = String.valueOf(optional);
        String valueOf2 = String.valueOf(optional2);
        String valueOf3 = String.valueOf(cVar);
        if (i2 == 1) {
            str2 = "NGA_INPUT_PLATE";
        } else if (i2 == 2) {
            str2 = "TITAN_INPUT_PLATE";
        } else if (i2 == 3) {
            str2 = "NO_UI";
        }
        return "AssistantState{state=" + str3 + ", cause=" + str + ", invocationTime=" + valueOf + ", identifier=" + valueOf2 + ", opaTriggerType=" + valueOf3 + ", uiType=" + str2 + ", isOptimizedOnShowInvcation=" + this.c + "}";
    }
}
