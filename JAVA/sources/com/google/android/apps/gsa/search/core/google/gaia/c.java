package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.j;
import com.google.common.util.concurrent.cn;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/c.class */
public interface c {
    cn a(String str, long j);

    cn b(String str, Account account, j jVar);

    cn c(String str, Account account, boolean z, j jVar);

    String e(String str, long j);

    String f(Account account, String str, long j);

    Set g(String str, long j);

    Set h(String str, long j, boolean z);

    void i(String str);

    void j(Collection collection);
}
