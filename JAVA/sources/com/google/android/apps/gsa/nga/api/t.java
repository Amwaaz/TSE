package com.google.android.apps.gsa.nga.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;
import com.google.android.apps.gsa.nga.shared.s3.aidl.d;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/api/t.class */
public final class t extends a implements v {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.nga.api.INgaService");
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void A(ProtoLiteParcelable protoLiteParcelable) {
        Parcel Z = Z();
        c.d(Z, protoLiteParcelable);
        ac(35, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void B(String str) {
        Parcel Z = Z();
        Z.writeString(str);
        ac(2, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void C(long j, com.google.android.apps.gsa.nga.shared.v.c.a.c cVar) {
        Parcel Z = Z();
        Z.writeLong(j);
        c.f(Z, cVar);
        ac(34, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void D(Bundle bundle, int i) {
        Parcel Z = Z();
        c.d(Z, bundle);
        Z.writeInt(i);
        ac(37, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void E(String str, Bundle bundle, y yVar) {
        Parcel Z = Z();
        Z.writeString(str);
        c.d(Z, bundle);
        c.f(Z, yVar);
        ac(28, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void F(an anVar) {
        Parcel Z = Z();
        c.f(Z, anVar);
        ac(8, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void G(ab abVar) {
        Parcel Z = Z();
        c.f(Z, abVar);
        ac(29, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void H(ForegroundSignalType foregroundSignalType, n nVar) {
        Parcel Z = Z();
        c.d(Z, foregroundSignalType);
        c.f(Z, nVar);
        ac(30, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void I(NgaState ngaState, int i) {
        Parcel Z = Z();
        c.d(Z, ngaState);
        Z.writeInt(i);
        ac(4, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void J(ak akVar, long j) {
        Parcel Z = Z();
        c.f(Z, akVar);
        Z.writeLong(j);
        ac(6, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void a() {
        ac(32, Z());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void b(long j) {
        Parcel Z = Z();
        Z.writeLong(j);
        ac(7, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void c(p pVar) {
        Parcel Z = Z();
        c.f(Z, pVar);
        ac(22, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void d(IBinder iBinder) {
        Parcel Z = Z();
        Z.writeStrongBinder(iBinder);
        ac(1, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void e(int i, long j) {
        Parcel Z = Z();
        Z.writeInt(i);
        Z.writeLong(j);
        ac(36, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void f(ProtoLiteParcelable protoLiteParcelable) {
        Parcel Z = Z();
        c.d(Z, protoLiteParcelable);
        ac(44, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void g(String str) {
        Parcel Z = Z();
        Z.writeString(str);
        ac(3, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void h() {
        ac(42, Z());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void i() {
        ac(41, Z());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void j(String str) {
        Parcel Z = Z();
        Z.writeString(str);
        ac(16, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void k(Bundle bundle, d dVar) {
        Parcel Z = Z();
        c.d(Z, bundle);
        c.f(Z, dVar);
        ac(26, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void l(Bundle bundle, byte[] bArr) {
        Parcel Z = Z();
        c.d(Z, bundle);
        Z.writeByteArray(bArr);
        ac(27, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void m(List list) {
        Parcel Z = Z();
        Z.writeList(list);
        ac(13, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void n(int i) {
        Parcel Z = Z();
        Z.writeInt(i);
        ac(40, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void o(byte[] bArr, Bundle bundle) {
        Parcel Z = Z();
        Z.writeByteArray(bArr);
        c.d(Z, bundle);
        ac(17, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void p() {
        ac(19, Z());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void q(byte[] bArr) {
        Parcel Z = Z();
        Z.writeByteArray(bArr);
        ac(18, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void r(int i) {
        Parcel Z = Z();
        Z.writeInt(i);
        ac(11, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void s(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, com.google.android.libraries.assistant.g.d.t tVar) {
        Parcel Z = Z();
        c.d(Z, bundle);
        c.d(Z, assistStructure);
        c.d(Z, assistContent);
        Z.writeInt(i);
        c.f(Z, tVar);
        ac(38, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void t(Bitmap bitmap) {
        Parcel Z = Z();
        c.d(Z, bitmap);
        ac(39, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void u(int i, boolean z) {
        Parcel Z = Z();
        Z.writeInt(i);
        ClassLoader classLoader = c.f231a;
        Z.writeInt(z ? 1 : 0);
        ac(23, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void v(k kVar) {
        Parcel Z = Z();
        c.f(Z, kVar);
        ac(43, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void w() {
        ac(46, Z());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void x(ProtoLiteParcelable protoLiteParcelable) {
        Parcel Z = Z();
        c.d(Z, protoLiteParcelable);
        ac(33, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void y(ProtoLiteParcelable protoLiteParcelable) {
        Parcel Z = Z();
        c.d(Z, protoLiteParcelable);
        ac(31, Z);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void z(int i) {
        Parcel Z = Z();
        Z.writeInt(i);
        ac(14, Z);
    }
}
