package com.google.android.apps.gsa.search.core.j;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.o;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.common.f.j;
import com.google.g.e.i.ei;
import com.google.protobuf.ba;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/j/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1129a = j.i("com.google.android.apps.gsa.search.core.j.a");
    public final h b;
    private final PackageManager c;
    private final o d;

    public a(Context context, o oVar, h hVar) {
        this.b = hVar;
        this.c = context.getPackageManager();
        oVar.getClass();
        this.d = oVar;
    }

    public static ei b(s.a.a.a aVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "search.mdi.search.SchemaOrgProperty";
        v byteString = aVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return createBuilder.build();
    }

    public static String d(UsageInfo usageInfo) {
        Account account;
        DocumentContents documentContents = usageInfo.e;
        if (documentContents == null || (account = documentContents.d) == null || !"com.google".equals(account.type)) {
            return null;
        }
        String str = account.name;
        return account.name;
    }

    public static boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return TextUtils.equals(str, str2);
    }

    public final Bundle a() {
        String a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.ASSIST_PACKAGE", a2);
        return bundle;
    }

    public final com.google.knowledge.b.a c(String str) {
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 0);
            boolean g = this.d.g(str);
            ba createBuilder = com.google.knowledge.b.a.a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.knowledge.b.a aVar = createBuilder.instance;
            str.getClass();
            aVar.b |= 1;
            aVar.c = str;
            long j = packageInfo.versionCode;
            createBuilder.copyOnWrite();
            com.google.knowledge.b.a aVar2 = createBuilder.instance;
            aVar2.b |= 2;
            aVar2.d = j;
            createBuilder.copyOnWrite();
            com.google.knowledge.b.a aVar3 = createBuilder.instance;
            aVar3.b |= 4;
            aVar3.e = g;
            return createBuilder.build();
        } catch (PackageManager.NameNotFoundException e) {
            a.a.dB(f1129a.e(), "Could not find package", (char) 6640, e);
            return null;
        }
    }
}
