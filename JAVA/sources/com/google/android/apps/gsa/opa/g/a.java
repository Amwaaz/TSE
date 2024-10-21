package com.google.android.apps.gsa.opa.g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.c;
import com.google.android.apps.gsa.search.shared.service.c.o;
import com.google.common.b.ha;
import com.google.common.f.a.e;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.g.af.a.be;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/g/a.class */
public class a {

    /* renamed from: a */
    public static final j f1025a = j.i("com.google.android.apps.gsa.opa.g.a");
    public static final ha b = ha.v("ACTION_SHOW_NOTIFICATION", "ACTION_PROACTIVEAPI_SYNC_REQUEST", "ACTION_DISMISS_NOTIFICATION", "USER_DISMISSAL_ACTION", "ACTION_START_ZS_PARTIAL_REQUEST");
    public final Context c;

    public a(Context context) {
        this.c = context;
    }

    public static Intent a(o oVar) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("ACTION_PROACTIVEAPI_SYNC_REQUEST");
        intent.putExtra("PROACTIVEAPI_CLIENT_EVENT_DATA_EXTRA", oVar.toByteArray());
        return intent;
    }

    public final void b(be beVar) {
        h d = f1025a.d();
        d.aj(e.a, "ProactiveapiIntUtils");
        h hVar = d;
        hVar.ak(6035);
        hVar.p("#sendUserActionDismissalIntent");
        Intent intent = new Intent();
        intent.setAction("USER_DISMISSAL_ACTION");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("CONTENT_SELECTOR_EXTRA", beVar.toByteArray());
        intent.putExtra("CLIENT_UI_OBJECT_TYPE_EXTRA", 200);
        c.c(this.c, intent);
    }
}
