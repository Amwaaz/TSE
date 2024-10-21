package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.a.a;
import com.google.common.o.or;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/ClientConfig.class */
public class ClientConfig implements Parcelable, a {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final ClientConfig f1327a;
    public final BitFlags b;
    public final BitFlags c;
    public final or d;
    public final String e;

    static {
        d dVar = new d();
        dVar.f1344a = 4398047069697L;
        dVar.c = or.d;
        dVar.d = "none";
        f1327a = new ClientConfig(dVar);
        CREATOR = new c(0);
    }

    public ClientConfig(d dVar) {
        this.b = new BitFlags(ClientConfig.class, "FLAG_", dVar.f1344a);
        this.c = new BitFlags(e.class, "FLAG_", dVar.b);
        or orVar = dVar.c;
        orVar.getClass();
        this.d = orVar;
        String str = dVar.d;
        str.getClass();
        this.e = str;
    }

    public ClientConfig(BitFlags bitFlags, BitFlags bitFlags2, or orVar, String str) {
        this.b = bitFlags;
        this.c = bitFlags2;
        this.d = orVar;
        this.e = str;
    }

    public final boolean A() {
        return BitFlags.f(this.b.b, 32768L);
    }

    public final boolean B() {
        return BitFlags.f(this.b.b, 2L);
    }

    public final boolean C() {
        return BitFlags.f(this.b.b, 512L);
    }

    public final boolean D() {
        return BitFlags.f(this.b.b, 17592186044416L);
    }

    public final boolean E() {
        return BitFlags.f(this.b.b, 524288L);
    }

    public final boolean F() {
        return BitFlags.f(this.b.b, 1048576L);
    }

    public final boolean G() {
        return BitFlags.f(this.b.b, 34359738368L);
    }

    public final boolean a() {
        return BitFlags.f(this.c.b, 16L);
    }

    public final boolean b() {
        return BitFlags.f(this.b.b, 8589934592L);
    }

    public final boolean c() {
        return BitFlags.f(this.b.b, 137438953472L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return BitFlags.f(this.b.b, 4L);
    }

    public final boolean f() {
        return BitFlags.f(this.b.b, 256L);
    }

    public final boolean g() {
        return BitFlags.f(this.b.b, 268435456L);
    }

    public final boolean h() {
        return BitFlags.f(this.b.b, 67108864L);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ClientConfig");
        fVar.b("flags").a(new com.google.android.apps.gsa.shared.util.b.d(this.b.b(), false));
        fVar.b("suggest flags").a(new com.google.android.apps.gsa.shared.util.b.d(this.c.b(), false));
        fVar.b("client stats").a(new com.google.android.apps.gsa.shared.util.b.d(this.d.name(), false));
        fVar.b("session controller").a(new com.google.android.apps.gsa.shared.util.b.d(this.e, false));
    }

    public final boolean i() {
        return BitFlags.f(this.b.b, 2147483648L);
    }

    public final boolean j() {
        return BitFlags.f(this.b.b, 4503599627370496L);
    }

    public final boolean k() {
        return BitFlags.f(this.b.b, 140737488355328L);
    }

    public final boolean l() {
        return this.d.equals(or.S);
    }

    public final boolean m() {
        return this.d.equals(or.q);
    }

    public final boolean n() {
        return BitFlags.f(this.b.b, 33554432L);
    }

    public final boolean o() {
        return BitFlags.f(this.b.b, 64L);
    }

    public final boolean p() {
        return BitFlags.f(this.b.b, 1L);
    }

    public final boolean q() {
        return this.d.equals(or.m);
    }

    public final boolean r() {
        return this.d.equals(or.ak);
    }

    public final boolean s() {
        return BitFlags.f(this.b.b, 128L);
    }

    public final boolean t() {
        return BitFlags.f(this.b.b, 131072L);
    }

    public final String toString() {
        or orVar = this.d;
        BitFlags bitFlags = this.c;
        return "ClientConfig[mFlags=" + this.b.b() + " mSuggestFlags=" + bitFlags.b() + " mClientId=" + orVar.name() + " mSessionType=" + this.e + "]";
    }

    public final boolean u() {
        return BitFlags.f(this.b.b, 8192L);
    }

    public final boolean v() {
        return BitFlags.f(this.b.b, 16384L);
    }

    public final boolean w() {
        return BitFlags.f(this.b.b, 32L);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d.as);
        parcel.writeString(this.e);
    }

    public final boolean x() {
        return BitFlags.f(this.b.b, 70368744177664L);
    }

    public final boolean y() {
        return BitFlags.f(this.b.b, 4096L);
    }

    public final boolean z() {
        return BitFlags.f(this.b.b, 8L);
    }
}
