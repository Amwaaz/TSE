package com.google.android.apps.gsa.staticplugins.nga.u;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.nga.api.aq;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.as;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.c;
import com.google.android.libraries.ao.g$;
import com.google.android.libraries.assistant.c.b.g.ae;
import com.google.android.libraries.assistant.c.b.g.u;
import com.google.android.libraries.mdi.download.aa;
import com.google.android.libraries.mdi.download.au;
import com.google.android.libraries.mdi.download.ax;
import com.google.android.libraries.mdi.download.bz;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import io.grpc.j.e;
import io.grpc.j.n;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/t.class */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1722a = d.j();
    private static final Pattern j = Pattern.compile("\\d+(\\.\\d+)*");
    public final Context b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final f g;
    public final com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.g h;
    public final ae i;
    private final a k;
    private final com.google.android.libraries.gsa.h.h l;
    private final com.google.android.libraries.gsa.h.h m;

    public t(Context context, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, f fVar, com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.g gVar, ae aeVar) {
        this.b = context;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.k = aVar5;
        this.l = hVar;
        this.m = hVar2;
        this.g = fVar;
        this.h = gVar;
        this.i = aeVar;
    }

    public static String f(f fVar, Context context) {
        try {
            String a2 = as.a(context);
            Matcher matcher = j.matcher(a2);
            if (matcher.find()) {
                return matcher.group();
            }
            fVar.a(5, String.format(Locale.US, "Failed to parse APK version '%s'.", a2));
            return "0";
        } catch (PackageManager.NameNotFoundException e) {
            fVar.a(6, "Failed to get APK version.");
            return "0";
        }
    }

    private final cn g(cn cnVar) {
        return this.l.f(cnVar, "[NGA] NgaDownloadConfigManager.catchError", Exception.class, new l(3));
    }

    private final cn h() {
        cn a2;
        synchronized (this) {
            a2 = this.m.a("[NGA] NgaDownloadConfigManager.getLocalDownloadConfig", new r(this, 1));
        }
        return a2;
    }

    public final cn a(aa aaVar) {
        return this.l.k(((bz) this.c.a()).d(aaVar), "[NGA] NgaDownloadConfigManager.downloadFileGroup", new l(2));
    }

    public final cn b(ax axVar) {
        com.google.protobuf.ba createBuilder = c.a.createBuilder();
        Optional ofNullable = Optional.ofNullable(axVar.e.f());
        com.google.common.f.j jVar = ae.f2856a;
        String str = (String) ofNullable.map(new com.google.android.libraries.assistant.c.b.g.z(4)).orElse("");
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        str.getClass();
        cVar.f = str;
        String str2 = (String) axVar.c.e("");
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        str2.getClass();
        cVar2.e = str2;
        String languageTag = ((com.google.android.apps.gsa.staticplugins.nga.t.c) this.d.a()).d().toLanguageTag();
        createBuilder.copyOnWrite();
        c cVar3 = createBuilder.instance;
        languageTag.getClass();
        cVar3.c = languageTag;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = axVar.f3131a;
        createBuilder.copyOnWrite();
        createBuilder.instance.d = axVar.b;
        c build = createBuilder.build();
        com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.g gVar = this.h;
        return this.l.k(u.a(n.a(((e) gVar).a.a(com.google.android.apps.search.assistant.platform.ondevice.datadownload.a.a.j.b(), ((e) gVar).b), build)), "[NGA] getClientFileGroups.parse", new l(6));
    }

    public final cn c() {
        s sVar;
        if (((p) this.f.a()).w(eu.aK)) {
            int i = fl.e;
            return dl.n(ni.a);
        }
        com.google.android.libraries.gsa.h.h hVar = this.l;
        long i2 = ((p) this.f.a()).i(eu.Z);
        s[] values = s.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                com.google.common.f.a.a d = f1722a.d();
                d.ak(15295);
                d.r("Failed to parse SourceMode: flagValue=%d", i2);
                sVar = s.c;
                break;
            }
            sVar = values[i3];
            if (sVar.e == i2) {
                break;
            }
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        if (sVar.f) {
            arrayList.add(g(h()));
        }
        if (g$.ExternalSyntheticApiModelOutline0.m(sVar.g, Boolean.valueOf(!((aq) this.k.a()).e()))) {
            bz bzVar = (bz) this.c.a();
            au a2 = com.google.android.libraries.mdi.download.av.a();
            a2.f3128a = "nga_sot_configs";
            arrayList.add(g(this.m.k(bzVar.g(a2.a()), "[NGA] NgaDownloadConfigManager.fetchDownloadConfig", new b(this, 7))));
        }
        return hVar.l(this.l.k(dl.j(arrayList), "[NGA] NgaDownloadConfigManager.getDownloadConfig.mergeConfigs", new l(4)), "[NGA] NgaDownloadConfigManager.getLatestDataGroups", new b(this, 8));
    }

    public final cn d(com.google.android.libraries.mdi.download.ae aeVar) {
        return aeVar.b((bz) this.c.a());
    }

    public final cn e() {
        return !((p) this.f.a()).w(eu.ef) ? ci.a : this.l.f(this.m.b("[NGA] NgaDownloadConfigManager.verifyAllPendingGroups", new r(this, 0)), "[NGA] NgaDownloadConfigManager.verifyAllPendingGroups.catchError", Exception.class, new l(5));
    }
}
