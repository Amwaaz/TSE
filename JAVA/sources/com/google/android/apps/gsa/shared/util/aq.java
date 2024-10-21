package com.google.android.apps.gsa.shared.util;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import com.google.common.b.oo;
import com.google.common.base.cl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/aq.class */
public final class aq {
    public static boolean a(Context context, UserHandleCompat userHandleCompat) {
        ArrayList N;
        ArrayList arrayList;
        List<UserHandle> userProfiles = ((UserManager) context.getSystemService("user")).getUserProfiles();
        if (userProfiles == null) {
            N = new ArrayList();
        } else {
            N = oo.N(userProfiles.size());
            Iterator<UserHandle> it = userProfiles.iterator();
            while (it.hasNext()) {
                N.add(new UserHandleCompat(it.next()));
            }
        }
        if (N.size() > 1) {
            ArrayList K = oo.K(N);
            Iterator it2 = N.iterator();
            while (true) {
                arrayList = K;
                if (!it2.hasNext()) {
                    break;
                }
                UserHandleCompat userHandleCompat2 = (UserHandleCompat) it2.next();
                if (userHandleCompat2.b()) {
                    K.remove(userHandleCompat2);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        return arrayList.contains(userHandleCompat);
    }

    public static String b(AccountManager accountManager) {
        int i = 0;
        cl.u(accountManager != null);
        Account[] accountsByType = accountManager.getAccountsByType("com.google");
        int length = accountsByType.length;
        String str = null;
        while (true) {
            String str2 = str;
            if (i >= length) {
                return str2;
            }
            Account account = accountsByType[i];
            String str3 = str2;
            if (account.name.endsWith("@google.com")) {
                if (str2 != null) {
                    return null;
                }
                str3 = account.name;
            }
            i++;
            str = str3;
        }
    }
}
