package com.google.android.apps.gsa.shared.ui.b;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.k.cy;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ui/b/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1496a = j.i("com.google.android.apps.gsa.shared.ui.b.a");

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean b(Context context) {
        try {
            return context.getApplicationContext().getResources().getBoolean(2131034173);
        } catch (Resources.NotFoundException e) {
            h e2 = f1496a.e();
            e2.ak(9269);
            e2.q("Resource not found: R.bool.is_tablet = %d", 2131034173);
            return false;
        }
    }

    public static boolean c(Context context, c cVar) {
        if (cVar.w(cy.b)) {
            return false;
        }
        return cVar.w(cy.c) || b(context);
    }
}
