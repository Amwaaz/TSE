package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import com.google.protobuf.dh;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/g.class */
public final /* synthetic */ class g implements Function {

    /* renamed from: a, reason: collision with root package name */
    private final int f1706a;

    public /* synthetic */ g(int i) {
        this.f1706a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f1706a) {
            case 0:
                return Function._CC.$default$andThen(this, function);
            case 1:
                return Function._CC.$default$andThen(this, function);
            case 2:
                return Function._CC.$default$andThen(this, function);
            case 3:
                return Function._CC.$default$andThen(this, function);
            case 4:
                return Function._CC.$default$andThen(this, function);
            case 5:
                return Function._CC.$default$andThen(this, function);
            case 6:
                return Function._CC.$default$andThen(this, function);
            case 7:
                return Function._CC.$default$andThen(this, function);
            case 8:
                return Function._CC.$default$andThen(this, function);
            case 9:
                return Function._CC.$default$andThen(this, function);
            case 10:
                return Function._CC.$default$andThen(this, function);
            case 11:
                return Function._CC.$default$andThen(this, function);
            case 12:
                return Function._CC.$default$andThen(this, function);
            default:
                return Function._CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional empty;
        FileInputStream fileInputStream;
        Iterable iterable;
        switch (this.f1706a) {
            case 0:
                return Integer.valueOf(((com.google.android.libraries.mdi.a) obj).e);
            case 1:
                return ((com.google.android.libraries.mdi.e) obj).h;
            case 2:
                return Long.valueOf(((com.google.android.libraries.mdi.e) obj).f);
            case 3:
                return Collection._EL.stream((List) obj).map(new g(4));
            case 4:
                return ((com.google.android.libraries.mdi.a) obj).d;
            case 5:
                return (String) ((Map.Entry) obj).getKey();
            case 6:
                return ha.o((java.util.Collection) ((Map.Entry) obj).getValue());
            case 7:
                return Collection._EL.stream(((com.google.android.libraries.mdi.e) obj).h);
            case 8:
                return Integer.valueOf(((f) obj).b);
            case 9:
                return ((f) obj).c;
            case 10:
                return Long.valueOf(Long.parseLong((String) obj));
            case 11:
                File file = (File) obj;
                com.google.common.f.a.d dVar = ai.f1701a;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException e) {
                    com.google.common.f.a.a f = ai.f1701a.f();
                    f.ak(15384);
                    f.s("Failed to read %s log event file", file);
                    empty = Optional.empty();
                } catch (ce e2) {
                    com.google.common.f.a.a f2 = ai.f1701a.f();
                    f2.ak(15383);
                    f2.s("Failed to parse %s log event file", file);
                    empty = Optional.empty();
                }
                try {
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    dh dhVar = dh.a;
                    empty = Optional.of(bi.parseFrom(am.a, fileInputStream, ExtensionRegistryLite.a));
                    fileInputStream.close();
                    return empty;
                } finally {
                }
            case 12:
                return (am) ((Optional) obj).get();
            default:
                File file2 = (File) obj;
                com.google.common.f.a.d dVar2 = ai.f1701a;
                try {
                    Stream map = DesugarArrays.stream(file2.getName().replaceAll("\\..*", "").split("_")).map(new g(10));
                    int i = fl.e;
                    iterable = (Iterable) map.collect(bs.a);
                } catch (NumberFormatException e3) {
                    int i2 = fl.e;
                    iterable = ni.a;
                }
                return iterable;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.f1706a) {
            case 0:
                return Function._CC.$default$compose(this, function);
            case 1:
                return Function._CC.$default$compose(this, function);
            case 2:
                return Function._CC.$default$compose(this, function);
            case 3:
                return Function._CC.$default$compose(this, function);
            case 4:
                return Function._CC.$default$compose(this, function);
            case 5:
                return Function._CC.$default$compose(this, function);
            case 6:
                return Function._CC.$default$compose(this, function);
            case 7:
                return Function._CC.$default$compose(this, function);
            case 8:
                return Function._CC.$default$compose(this, function);
            case 9:
                return Function._CC.$default$compose(this, function);
            case 10:
                return Function._CC.$default$compose(this, function);
            case 11:
                return Function._CC.$default$compose(this, function);
            case 12:
                return Function._CC.$default$compose(this, function);
            default:
                return Function._CC.$default$compose(this, function);
        }
    }
}
