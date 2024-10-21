package com.google.android.apps.gsa.nga.engine.ak.r;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ah.p;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.bs;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/r/k.class */
public final class k {
    private static final d d = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Context f437a;
    public final b b;
    public final h c;

    public k(Context context, b bVar, h hVar) {
        this.f437a = context;
        this.b = bVar;
        this.c = hVar;
    }

    public static cn a(h hVar, p pVar, List list, String str) {
        h hVar2 = new h(str, 2);
        fg fgVar = new fg(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgVar.h(new f(hVar, pVar, (Long) it.next()));
        }
        return hVar.k(z.e(hVar, "[NGA] NotificationsHelper.contactMatch.firtMatch", hVar2, fgVar.g()), "[NGA] NotificationsHelper.contactMatch", new i(0));
    }

    public static Optional b(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return Optional.empty();
        }
        String string = bundle.getString("android.conversationTitle", bundle.getString("android.title"));
        if (bundle.getBoolean("android.isGroupConversation", false)) {
            return Optional.ofNullable(string);
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        return (parcelableArray == null || parcelableArray.length == 0) ? Optional.ofNullable(string) : Optional.ofNullable(((Bundle) parcelableArray[0]).getString("sender", string));
    }

    public final Optional c(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        if (notification.actions == null) {
            return Optional.empty();
        }
        Stream filter = DesugarArrays.stream(notification.actions).filter(new d(1));
        int i = fl.e;
        fl flVar = (fl) filter.collect(bs.a);
        Optional findFirst = Collection._EL.stream(flVar).filter(new d(0)).findFirst();
        return findFirst.isPresent() ? findFirst : Collection._EL.stream(flVar).filter(new h(this, 1)).findFirst();
    }

    public final String d(Notification notification, Locale locale) {
        return (String) b(notification).map(new b(this, locale)).orElseGet(new c(this, locale));
    }

    public final void e(Notification notification) {
        try {
            notification.contentIntent.send();
        } catch (PendingIntent.CanceledException e) {
            aus.i(d.e(), "Content intent was cancelled for notification(%s)", notification, (char) 4182, e);
        }
    }

    public final boolean f(String str, Notification.Action action) {
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        Bundle bundle = new Bundle();
        bundle.putCharSequence(remoteInputs[0].getResultKey(), str);
        Intent intent = new Intent();
        RemoteInput.addResultsToIntent(remoteInputs, intent, bundle);
        try {
            action.actionIntent.send(this.f437a, 0, intent);
            return true;
        } catch (PendingIntent.CanceledException e) {
            aus.f(d.e(), "Reply intent was cancelled", (char) 4184, e);
            return false;
        }
    }
}
