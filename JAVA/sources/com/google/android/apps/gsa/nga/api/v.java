package com.google.android.apps.gsa.nga.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.nga.shared.s3.aidl.d;
import com.google.android.apps.gsa.nga.shared.v.c.a.c;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/api/v.class */
public interface v extends IInterface {
    void A(ProtoLiteParcelable protoLiteParcelable);

    void B(String str);

    void C(long j, c cVar);

    void D(Bundle bundle, int i);

    void E(String str, Bundle bundle, y yVar);

    void F(an anVar);

    void G(ab abVar);

    void H(ForegroundSignalType foregroundSignalType, n nVar);

    void I(NgaState ngaState, int i);

    void J(ak akVar, long j);

    void a();

    void b(long j);

    void c(p pVar);

    void d(IBinder iBinder);

    void e(int i, long j);

    void f(ProtoLiteParcelable protoLiteParcelable);

    void g(String str);

    void h();

    void i();

    void j(String str);

    void k(Bundle bundle, d dVar);

    void l(Bundle bundle, byte[] bArr);

    void m(List list);

    void n(int i);

    void o(byte[] bArr, Bundle bundle);

    void p();

    void q(byte[] bArr);

    void r(int i);

    void s(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, com.google.android.libraries.assistant.g.d.t tVar);

    void t(Bitmap bitmap);

    void u(int i, boolean z);

    void v(k kVar);

    void w();

    void x(ProtoLiteParcelable protoLiteParcelable);

    void y(ProtoLiteParcelable protoLiteParcelable);

    void z(int i);
}
