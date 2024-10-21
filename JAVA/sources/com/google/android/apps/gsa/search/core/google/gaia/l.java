package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.libraries.gcoreclient.d.b;
import com.google.common.f.j;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/l.class */
public class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1111a = j.i("com.google.android.apps.gsa.search.core.google.gaia.l");
    private final e.a b;

    public l(e.a aVar) {
        this.b = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final void a(String str) {
        try {
            ((b) this.b.a()).d(str);
        } catch (IOException e) {
            a.a.dB(f1111a.e(), "Failed to invalidate token!", (char) 6974, e);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String b(Account account, String str, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        try {
            jVar.a("GoogleAuthAdapter: get token with auth-util");
            return ((b) this.b.a()).c(account, str, new Bundle());
        } finally {
            jVar.c();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String c(Account account, String str, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        try {
            jVar.a("GoogleAuthAdapter: get token with auth-util");
            return ((b) this.b.a()).b(account.name, str, new Bundle());
        } finally {
            jVar.c();
        }
    }
}
