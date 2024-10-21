package com.google.android.apps.gsa.nga.shared.q.e.a;

import com.google.android.apps.gsa.nga.shared.q.d.ap;
import com.google.android.apps.gsa.nga.shared.q.d.ar;
import com.google.protobuf.ba;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/e/a/d.class */
public final class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    private final e f988a;
    private final g b;
    private final e c;

    public d(e eVar, g gVar, e eVar2) {
        this.f988a = eVar;
        this.b = gVar;
        this.c = eVar2;
    }

    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ar apply(ar arVar) {
        int i;
        ba createBuilder = ar.a.createBuilder();
        switch (arVar.f) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
            case 5:
            default:
                i = 0;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
        }
        int i2 = i;
        if (i == 0) {
            i2 = 1;
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.f = ap.a(i2);
        boolean z = 1 == (arVar.b & 1);
        arVar.getClass();
        l.d(z, new a(arVar, 5), new b(createBuilder, 5), this.f988a);
        l.d((arVar.b & 2) != 0, new a(arVar, 6), new b(createBuilder, 6), this.b);
        boolean z2 = false;
        if ((arVar.b & 8) != 0) {
            z2 = true;
        }
        l.d(z2, new a(arVar, 7), new b(createBuilder, 7), this.c);
        return createBuilder.build();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Function._CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function._CC.$default$compose(this, function);
    }
}
