package com.google.android.apps.gsa.assistant.shared.j;

import j$.time.Instant;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/j/n.class */
public final class n {

    /* renamed from: a */
    public final int f278a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    private final long g;
    private final long h;

    public n() {
        throw null;
    }

    public n(int i, int i2, int i3, long j, int i4, boolean z, long j2, int i5) {
        this.f278a = i;
        this.b = i2;
        this.c = i3;
        this.g = j;
        this.d = i4;
        this.e = z;
        this.h = j2;
        this.f = i5;
    }

    public final boolean a(long j, TemporalUnit temporalUnit) {
        return Instant.ofEpochSecond(this.g).plus(j, temporalUnit).isAfter(Instant.now());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f278a == nVar.f278a && this.b == nVar.b && this.c == nVar.c && this.g == nVar.g && this.d == nVar.d && this.e == nVar.e && this.h == nVar.h && this.f == nVar.f;
    }

    public final int hashCode() {
        int i = true != this.e ? 1237 : 1231;
        int i2 = this.f278a;
        int i3 = this.b;
        long j = this.g;
        int i4 = this.c;
        int i5 = this.d;
        long j2 = this.h;
        return ((((i ^ ((((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i5) * 1000003)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "OverappSuggestionStateData{nudgeUiCount=" + this.f278a + ", suggestionShownCount=" + this.b + ", appLaunchCount=" + this.c + ", timeStampWhenNudgeWasShownInEpochSec=" + this.g + ", lockScreenEntryPointDismissCount=" + this.d + ", wasAssistantEverActivated=" + this.e + ", lastLockScreenAppFlowTimestampInEpochSec=" + this.h + ", nudgeUiCountOverAllApps=" + this.f + "}";
    }
}
