package com.google.android.apps.gsa.nga.engine.ak.s;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.education.w;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.ui.answer.aq;
import com.google.android.apps.gsa.nga.shared.f.a.a;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.common.base.ah;
import com.google.common.util.concurrent.ay;
import com.google.protobuf.ba;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/s/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f444a = com.google.common.f.a.d.j();
    public final Context b;
    public final com.google.android.apps.gsa.nga.shared.ad.a.d c;
    public final w d;
    public final h e;
    public final ag f;
    public final y g;
    public final com.google.android.apps.gsa.nga.shared.f.a.m h;
    public final ad i;
    private final aq j;
    private final com.google.android.libraries.gsa.h.h k;

    public m(aq aqVar, Context context, ag agVar, y yVar, com.google.android.apps.gsa.nga.shared.f.a.m mVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.shared.ad.a.d dVar, ad adVar, w wVar, h hVar2) {
        this.j = aqVar;
        this.b = context;
        this.f = agVar;
        this.g = yVar;
        this.h = mVar;
        this.k = hVar;
        this.c = dVar;
        this.i = adVar;
        this.d = wVar;
        this.e = hVar2;
    }

    private final com.google.android.apps.gsa.nga.shared.u.e.h e(String str, Locale locale) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.e.h.a.createBuilder();
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", str);
        Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        intent.putExtra(":settings:show_fragment_args", bundle);
        this.j.b(2132092952, createBuilder, intent, locale);
        return createBuilder.build();
    }

    public final l a() {
        Context context = this.b;
        return new l(n.a(context, "assist_structure_enabled"), n.a(context, "assist_screenshot_enabled"));
    }

    public final com.google.android.apps.gsa.nga.shared.u.e.h b(l lVar, Locale locale) {
        return !lVar.a ? e("context", locale) : com.google.android.apps.gsa.nga.shared.u.e.h.a;
    }

    public final com.google.android.apps.gsa.nga.shared.u.e.h c(l lVar, Locale locale) {
        return !lVar.b ? e("screenshot", locale) : b(lVar, locale);
    }

    public final void d() {
        ah cVar = new com.google.android.apps.gsa.nga.shared.f.a.c(8);
        Executor executor = ay.a;
        com.google.android.apps.gsa.nga.shared.f.a.m mVar = this.h;
        new ae(mVar.b.l(mVar.c.a(cVar, executor), "[NGA] EducationPreferences.recordScreenContextExplanationShown", new a(mVar, 20)), this.k, "[NGA] recordPermissionExplanationShown").b(new i()).a(new j());
    }
}
