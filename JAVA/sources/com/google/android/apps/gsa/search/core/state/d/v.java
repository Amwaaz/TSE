package com.google.android.apps.gsa.search.core.state.d;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.state.ap;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.speech.k.c;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/v.class */
public final class v extends com.google.android.apps.gsa.search.core.state.ae implements ap {

    /* renamed from: a, reason: collision with root package name */
    public long f1295a;
    private final e.a b;
    private int c;
    private String d;
    private String e;
    private String f;
    private final Resources g;

    public v(e.a aVar, e.a aVar2, Resources resources) {
        super(aVar2, 4);
        this.d = "";
        this.f1295a = 0L;
        this.b = aVar;
        this.g = resources;
    }

    private final String k() {
        String t = ((com.google.android.apps.gsa.search.core.h.p) this.b.a()).t(com.google.android.apps.gsa.shared.k.ac.c);
        String str = t;
        if (TextUtils.isEmpty(t)) {
            str = this.g.getString(2132095206);
        }
        return str;
    }

    public final String c() {
        String str;
        int i = this.c;
        if ((i & 2) != 0) {
            if (this.f == null) {
                this.f = this.g.getString(2132095206);
            }
            str = this.f;
        } else if ((i & 1) != 0) {
            if (this.e == null) {
                this.e = k();
            }
            str = this.e;
        } else {
            if (this.e == null) {
                this.e = k();
            }
            str = this.e;
        }
        return str;
    }

    public final boolean f(String str) {
        if (this.d.equals(str)) {
            return false;
        }
        this.d = str;
        return true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("HintState");
        fVar.b("Hint mode").a(new com.google.android.apps.gsa.shared.util.b.d(String.valueOf(this.c), false));
        fVar.b("Hotword text").a(new com.google.android.apps.gsa.shared.util.b.d(this.d, false));
    }

    public final boolean i(h hVar, ae aeVar) {
        int i = this.c;
        this.c = 0;
        if (hVar.f) {
            this.c = 2;
        }
        if (aeVar.B()) {
            ab abVar = e.a;
        } else if (!aeVar.z()) {
            ab abVar2 = e.a;
        } else if (!((com.google.android.apps.gsa.speech.o.g) aeVar.c.a()).aa()) {
            ab abVar3 = e.a;
        } else if (!aeVar.j.a()) {
            ab abVar4 = e.a;
        } else if (!aeVar.A() && !aeVar.q) {
            ab abVar5 = e.a;
        } else if (aeVar.f.e(96L)) {
            ab abVar6 = e.a;
        } else {
            if (aeVar.d.w(en.c)) {
                ab abVar7 = e.a;
            } else if (aeVar.B()) {
                ab abVar8 = e.a;
            } else if (!aeVar.z()) {
                ab abVar9 = e.a;
            } else if (((c) aeVar.h.a()).a() >= 2) {
                ab abVar10 = e.a;
            } else {
                long j = aeVar.g.getLong("first_hotword_hint_shown_at", 0L);
                long epochMilli = aeVar.e.f().toEpochMilli();
                if (j == 0) {
                    aeVar.g.edit().putLong("first_hotword_hint_shown_at", aeVar.e.f().toEpochMilli()).apply();
                } else if (epochMilli - j > aeVar.d.i(en.ad) * 86400000) {
                    ab abVar11 = e.a;
                }
                ab abVar12 = e.a;
            }
            this.c |= 1;
        }
        return i != this.c;
    }
}
