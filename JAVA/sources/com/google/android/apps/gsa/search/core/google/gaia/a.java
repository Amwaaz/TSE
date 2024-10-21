package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.gsa.shared.util.debug.j;
import com.google.android.libraries.gcoreclient.d.d;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/a.class */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    private final AccountManager f1100a;

    public a(AccountManager accountManager) {
        this.f1100a = accountManager;
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final void a(String str) {
        this.f1100a.invalidateAuthToken("com.google", str);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String b(Account account, String str, j jVar) {
        try {
            try {
                try {
                    jVar.a("AccountManagerGoogleAuthAdapter: get token");
                    String blockingGetAuthToken = this.f1100a.blockingGetAuthToken(account, str, true);
                    jVar.c();
                    if (blockingGetAuthToken != null) {
                        return blockingGetAuthToken;
                    }
                    throw new com.google.android.libraries.gcoreclient.d.a("AccountManager returned a null token");
                } catch (AuthenticatorException e) {
                    if (e.getMessage() != null) {
                        throw new com.google.android.libraries.gcoreclient.d.e(e.getMessage(), e);
                    }
                    throw new com.google.android.libraries.gcoreclient.d.e("", e);
                } catch (SecurityException e2) {
                    e = e2;
                    throw new com.google.android.libraries.gcoreclient.d.a(e);
                }
            } catch (OperationCanceledException e3) {
                throw new IOException(e3);
            } catch (NullPointerException e4) {
                e = e4;
                throw new com.google.android.libraries.gcoreclient.d.a(e);
            }
        } catch (Throwable th) {
            jVar.c();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.apps.gsa.search.core.google.gaia.k
    public final String c(Account account, String str, j jVar) {
        try {
            try {
                try {
                    jVar.a("AccountManagerGoogleAuthAdapter: get token");
                    Bundle result = this.f1100a.getAuthToken(account, str, (Bundle) null, false, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult();
                    String string = result != null ? result.getString("authtoken") : null;
                    jVar.c();
                    if (string != null) {
                        return string;
                    }
                    Intent intent = null;
                    if (result != null) {
                        intent = (Intent) result.getParcelable("intent");
                    }
                    if (intent != null) {
                        throw new d("AccountManager returned a recovery intent", intent);
                    }
                    throw new com.google.android.libraries.gcoreclient.d.a("AccountManager returned a null token");
                } catch (AuthenticatorException e) {
                    throw new com.google.android.libraries.gcoreclient.d.a("Authenticator exception", e);
                } catch (SecurityException e2) {
                    e = e2;
                    throw new com.google.android.libraries.gcoreclient.d.a(e);
                }
            } catch (OperationCanceledException e3) {
                throw new IOException(e3);
            } catch (NullPointerException e4) {
                e = e4;
                throw new com.google.android.libraries.gcoreclient.d.a(e);
            }
        } catch (Throwable th) {
            jVar.c();
            throw th;
        }
    }
}
