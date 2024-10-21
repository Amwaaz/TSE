package com.google.android.apps.gsa.nga.engine.ui.answer;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.ak.l;
import com.google.android.apps.gsa.nga.shared.k.f;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.g.e.c.c.cu;
import com.google.g.e.i.d.ca;
import com.google.g.e.i.d.cd;
import com.google.g.e.i.d.cg;
import com.google.protobuf.ba;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/answer/aq.class */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f682a;
    public final b b;

    public aq(Context context, b bVar) {
        this.f682a = context;
        this.b = bVar;
    }

    public final cd a(Intent intent, Locale locale) {
        ca createBuilder = cd.a.createBuilder();
        ba createBuilder2 = cg.a.createBuilder();
        String string = this.b.a(locale).getString(2132092951, new Object[0]);
        createBuilder2.copyOnWrite();
        cg cgVar = createBuilder2.instance;
        string.getClass();
        cgVar.b |= 8;
        cgVar.f = string;
        ba createBuilder3 = cu.a.createBuilder();
        ba createBuilder4 = com.google.g.e.c.c.cd.a.createBuilder();
        String uri = intent.toUri(1);
        createBuilder4.copyOnWrite();
        com.google.g.e.c.c.cd cdVar = createBuilder4.instance;
        uri.getClass();
        cdVar.b |= 64;
        cdVar.i = uri;
        createBuilder3.copyOnWrite();
        cu cuVar = createBuilder3.instance;
        com.google.g.e.c.c.cd build = createBuilder4.build();
        build.getClass();
        cuVar.d = build;
        cuVar.c = 1;
        createBuilder2.copyOnWrite();
        cg cgVar2 = createBuilder2.instance;
        cu build2 = createBuilder3.build();
        build2.getClass();
        cgVar2.h = build2;
        cgVar2.b |= 32;
        createBuilder.copyOnWrite();
        cd cdVar2 = createBuilder.instance;
        cg build3 = createBuilder2.build();
        build3.getClass();
        cdVar2.a();
        cdVar2.c.add(build3);
        return createBuilder.build();
    }

    public final void b(int i, ba baVar, Intent intent, Locale locale) {
        f.r(baVar, l.m(this.b.a(locale).getString(i, new Object[0])));
        f.r(baVar, l.i(a(intent, locale)));
    }
}
