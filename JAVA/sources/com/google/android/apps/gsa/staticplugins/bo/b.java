package com.google.android.apps.gsa.staticplugins.bo;

import android.text.TextUtils;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.service.f.a;
import com.google.android.apps.gsa.search.core.service.o;
import com.google.android.apps.gsa.search.core.service.x;
import com.google.android.apps.gsa.search.core.state.d.ah;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hj;
import com.google.android.apps.gsa.search.shared.service.c.hk;
import com.google.android.apps.gsa.search.shared.service.c.hl;
import com.google.android.apps.gsa.search.shared.service.c.hm;
import com.google.android.apps.gsa.search.shared.service.c.hp;
import com.google.android.apps.gsa.search.shared.service.c.hq;
import com.google.android.apps.gsa.search.shared.service.c.ie;
import com.google.android.apps.gsa.search.shared.service.c.if;
import com.google.android.apps.gsa.search.shared.service.c.js;
import com.google.android.apps.gsa.search.shared.service.c.jt;
import com.google.android.apps.gsa.search.shared.service.c.ju;
import com.google.android.apps.gsa.search.shared.service.c.jv;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.gsa.h.h;
import com.google.protobuf.ba;
import com.google.protobuf.bg;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bo/b.class */
public final class b extends a implements com.google.android.apps.gsa.search.core.ae.bj.a {

    /* renamed from: a, reason: collision with root package name */
    public final ah f1636a;
    private final x b;
    private final h c;

    public b(x xVar, ah ahVar, h hVar) {
        super(c.WORKER_SEARCH_PLATE, "searchplate");
        this.b = xVar;
        this.f1636a = ahVar;
        this.c = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void a() {
        if (this.b.h()) {
            o oVar = this.b.i;
            oVar.e.a(new ae(hf.NO_SPEECH_DETECTED).a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void b(String str, String str2) {
        if (this.b.h()) {
            ba createBuilder = hm.a.createBuilder();
            createBuilder.copyOnWrite();
            hm hmVar = createBuilder.instance;
            str.getClass();
            hmVar.b |= 1;
            hmVar.c = str;
            if (str2 != null) {
                createBuilder.copyOnWrite();
                hm hmVar2 = createBuilder.instance;
                hmVar2.b |= 2;
                hmVar2.d = str2;
            }
            x xVar = this.b;
            ae aeVar = new ae(hf.SET_FINAL_RECOGNIZED_TEXT);
            aeVar.b(hl.a, createBuilder.build());
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void c(SearchError searchError) {
        if (this.b.h()) {
            x xVar = this.b;
            ae aeVar = new ae(hf.SHOW_ERROR);
            aeVar.c(new ParcelableVoiceAction(searchError));
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void f(int i) {
        if (this.b.h() && !this.b.i.f.e.equals("transcription")) {
            x xVar = this.b;
            ae aeVar = new ae(hf.SHOW_RECOGNITION_STATE);
            bg bgVar = ie.a;
            ba createBuilder = if.a.createBuilder();
            createBuilder.copyOnWrite();
            if ifVar = createBuilder.instance;
            ifVar.b |= 1;
            ifVar.c = i;
            aeVar.b(bgVar, createBuilder.build());
            xVar.k(aeVar.a());
        }
        this.c.n("setRecognitionState", new a(this, i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void g(int i, String str, String str2) {
        if (this.b.h()) {
            x xVar = this.b;
            ae aeVar = new ae(hf.SET_EXTERNAL_FLAGS);
            bg bgVar = hj.a;
            ba createBuilder = hk.a.createBuilder();
            createBuilder.copyOnWrite();
            hk hkVar = createBuilder.instance;
            hkVar.b |= 1;
            hkVar.c = i;
            createBuilder.copyOnWrite();
            hk hkVar2 = createBuilder.instance;
            str.getClass();
            hkVar2.b |= 2;
            hkVar2.d = str;
            createBuilder.copyOnWrite();
            hk hkVar3 = createBuilder.instance;
            str2.getClass();
            hkVar3.b |= 4;
            hkVar3.e = str2;
            aeVar.b(bgVar, createBuilder.build());
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void h(int i, int i2) {
        if (this.b.h()) {
            x xVar = this.b;
            ae aeVar = new ae(hf.SET_SEARCH_PLATE_MODE);
            bg bgVar = hp.a;
            ba createBuilder = hq.a.createBuilder();
            createBuilder.copyOnWrite();
            hq hqVar = createBuilder.instance;
            hqVar.b |= 1;
            hqVar.c = i;
            createBuilder.copyOnWrite();
            hq hqVar2 = createBuilder.instance;
            hqVar2.b |= 2;
            hqVar2.d = i2;
            createBuilder.copyOnWrite();
            hq hqVar3 = createBuilder.instance;
            hqVar3.b |= 4;
            hqVar3.e = true;
            aeVar.b(bgVar, createBuilder.build());
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("SearchPlateWorker");
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void i(Query query) {
        if (this.b.h()) {
            x xVar = this.b;
            ae aeVar = new ae(hf.SET_QUERY);
            aeVar.c(query);
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void j(String str, String str2, String str3) {
        if (this.b.h()) {
            ba createBuilder = jt.a.createBuilder();
            createBuilder.copyOnWrite();
            jt jtVar = createBuilder.instance;
            str.getClass();
            jtVar.b |= 1;
            jtVar.c = str;
            createBuilder.copyOnWrite();
            jt jtVar2 = createBuilder.instance;
            str2.getClass();
            jtVar2.b |= 2;
            jtVar2.d = str2;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                jt jtVar3 = createBuilder.instance;
                jtVar3.b |= 4;
                jtVar3.e = str3;
            }
            x xVar = this.b;
            ae aeVar = new ae(hf.UPDATE_RECOGNIZED_TEXT);
            aeVar.b(js.a, createBuilder.build());
            xVar.k(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.bj.a
    public final void k() {
        ba createBuilder = jv.a.createBuilder();
        if (!TextUtils.isEmpty(null)) {
            createBuilder.copyOnWrite();
            jv jvVar = createBuilder.instance;
            throw null;
        }
        ae aeVar = new ae(hf.UPDATE_SEARCHBOX_HINT_TEXT);
        aeVar.b(ju.a, createBuilder.build());
        this.b.k(aeVar.a());
    }
}
