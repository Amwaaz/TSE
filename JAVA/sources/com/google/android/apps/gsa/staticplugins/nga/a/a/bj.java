package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.settings.shared.s;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.staticplugins.nga.l.e;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.account.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bj.class */
public final class bj implements SharedPreferences.OnSharedPreferenceChangeListener, com.google.android.apps.gsa.search.core.h.c, s, e, a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1667a;
    public final e.a b;
    public final e.a c;
    public final e.a d;
    public final boolean e;
    public final e.a f;
    private final h g;

    public bj(Context context, e.a aVar, e.a aVar2, e.a aVar3, h hVar, boolean z, e.a aVar4) {
        this.f1667a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.g = hVar;
        this.e = z;
        this.f = aVar4;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(com.google.android.apps.gsa.search.core.h.p pVar, i iVar) {
        c();
    }

    public final void c() {
        this.g.n("[NGA] NgaStateInvalidatorImpl.invalidateNgaState", new ap(this, 2));
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.e
    public final void i() {
        this.g.n("[NGA] NgaStateInvalidatorImpl.NgaStateInvalidatorImpl", new ap(this, 3));
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(com.google.android.apps.gsa.search.core.h.p pVar) {
        i iVar = i.f1123a;
        c();
    }

    @Override // com.google.android.libraries.search.account.a
    public final void is() {
        c();
    }

    @Override // com.google.android.apps.gsa.assistant.settings.shared.s
    public final void it(String str) {
        if (str.startsWith("language_settings_primary_assistant_language:")) {
            c();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.startsWith("opa_preferred_languages:") || str.equals("opa_enabled")) {
            c();
        }
    }
}
