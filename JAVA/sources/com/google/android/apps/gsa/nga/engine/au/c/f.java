package com.google.android.apps.gsa.nga.engine.au.c;

import android.content.Context;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.storage.a.g.e;
import com.google.common.b.fu;
import com.google.common.f.a.d;
import com.google.common.n.b.ah;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.v;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/au/c/f.class */
public final class f implements b {
    public static final int c = 0;
    private final Context e;
    private final h f;
    private final Optional g;
    private final a h;
    private final y i;
    private final com.google.android.apps.gsa.nga.shared.al.b.a j;
    private static final d d = d.j();

    /* renamed from: a, reason: collision with root package name */
    static final fu f501a = fu.s("en", 2132017490, "ja", 2132017495, "de", 2132017489, "fr-CA", 2132017492, "fr-FR", 2132017493, "es", 2132017491, "it", 2132017494);
    static final fu b = fu.m("en", "dev_config_en");

    public f(Context context, y yVar, h hVar, com.google.android.apps.gsa.nga.shared.al.b.a aVar, Optional optional, a aVar2) {
        this.i = yVar;
        this.e = context;
        this.f = hVar;
        this.j = aVar;
        this.g = optional;
        this.h = aVar2;
    }

    public static String b(String str) {
        return a.a.dC(str, "embedded_config_", ".pb");
    }

    static final Optional c(com.google.android.apps.gsa.nga.engine.au.b.n nVar, byte[] bArr) {
        ba builder = nVar.toBuilder();
        com.google.android.apps.gsa.nga.engine.au.b.m mVar = builder.instance.d;
        com.google.android.apps.gsa.nga.engine.au.b.m mVar2 = mVar;
        if (mVar == null) {
            mVar2 = com.google.android.apps.gsa.nga.engine.au.b.m.a;
        }
        int length = bArr.length;
        ba builder2 = mVar2.toBuilder();
        v x = v.x(bArr, 0, length);
        builder2.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.au.b.m mVar3 = builder2.instance;
        mVar3.b |= 4;
        mVar3.c = x;
        builder.copyOnWrite();
        com.google.android.apps.gsa.nga.engine.au.b.n nVar2 = builder.instance;
        com.google.android.apps.gsa.nga.engine.au.b.m build = builder2.build();
        build.getClass();
        nVar2.d = build;
        nVar2.b |= 4;
        return Optional.of(builder.build());
    }

    private final Optional e() {
        Optional ofNullable;
        Optional empty;
        Locale locale = this.i.c().d;
        String b2 = b(locale.getLanguage());
        String language = locale.getLanguage();
        if (this.h.i(eu.mU) && this.h.i(eu.mR)) {
            com.google.common.f.a.a e = d.e();
            e.ak(5051);
            e.p("#MWW Using dev resources");
            fu fuVar = b;
            if (fuVar.containsKey(language)) {
                int identifier = this.e.getResources().getIdentifier((String) fuVar.get(language), "raw", this.e.getPackageName());
                ofNullable = identifier == 0 ? Optional.empty() : Optional.of(Integer.valueOf(identifier));
            } else {
                ofNullable = Optional.empty();
            }
        } else {
            fu fuVar2 = f501a;
            ofNullable = Optional.ofNullable((Integer) fuVar2.get(language));
            if (!ofNullable.isPresent()) {
                ofNullable = Optional.ofNullable((Integer) fuVar2.get(locale.toLanguageTag()));
            }
        }
        this.j.b(b2, ofNullable.isPresent());
        if (ofNullable.isEmpty()) {
            com.google.common.f.a.a e2 = d.e();
            e2.ak(5058);
            e2.s("#MWW Missing resource id for resource: %s", b2);
            return Optional.empty();
        }
        Optional flatMap = ofNullable.flatMap(new e(this, b2));
        Optional optional = flatMap;
        if (flatMap.isPresent()) {
            optional = flatMap;
            if (this.h.i(eu.mU)) {
                optional = flatMap;
                if (this.h.i(eu.nc)) {
                    Context context = this.e;
                    int identifier2 = context.getResources().getIdentifier("hotword", "raw", context.getPackageName());
                    if (identifier2 == 0) {
                        empty = Optional.empty();
                    } else {
                        try {
                            InputStream openRawResource = this.e.getResources().openRawResource(identifier2);
                            try {
                                empty = Optional.of(org.a.a.a.h.a(openRawResource));
                                if (openRawResource != null) {
                                    openRawResource.close();
                                }
                            } finally {
                            }
                        } catch (IOException e3) {
                            aus.f(d.e(), "#MWW Failed to load MWW hotword.data resource", (char) 5050, e3);
                            empty = Optional.empty();
                        }
                    }
                    optional = flatMap;
                    if (empty.isPresent()) {
                        optional = c((com.google.android.apps.gsa.nga.engine.au.b.n) flatMap.get(), (byte[]) empty.get());
                    }
                }
            }
        }
        this.j.a(b2, optional.isPresent());
        return optional;
    }

    public final Optional a(int i, String str) {
        try {
            InputStream openRawResource = this.e.getResources().openRawResource(i);
            try {
                Optional of = Optional.of(bi.parseFrom(com.google.android.apps.gsa.nga.engine.au.b.n.a, openRawResource, ExtensionRegistryLite.getGeneratedRegistry()));
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return of;
            } finally {
            }
        } catch (IOException e) {
            aus.i(d.e(), "#MWW Failed to open resource: %s", str, (char) 5056, e);
            return Optional.empty();
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        Optional optional;
        fVar.q("MWW embedded resources validity");
        ah.w(f501a).h(new a(this, fVar));
        if (((Boolean) this.g.map(new c(1)).orElse(false)).booleanValue()) {
            if (this.h.i(eu.mU)) {
                optional = e();
            } else {
                Optional j = this.f.j(g.CONFIG_FILE, new com.google.android.libraries.storage.a.g.g(com.google.android.apps.gsa.nga.engine.au.b.n.a.getParserForType()));
                Optional optional2 = j;
                if (this.h.i(eu.nd)) {
                    optional2 = j;
                    if (j.isPresent()) {
                        optional2 = j;
                        if (this.f.k(g.HOTWORD_DATA)) {
                            Optional j2 = this.f.j(g.HOTWORD_DATA, new e(0));
                            if (j2.isPresent()) {
                                optional2 = c((com.google.android.apps.gsa.nga.engine.au.b.n) j.get(), (byte[]) j2.get());
                            } else {
                                com.google.common.f.a.a f = d.f();
                                f.ak(5054);
                                f.p("#MWW failed to load hotword model.");
                                optional2 = j;
                            }
                        }
                    }
                }
                optional = optional2;
                if (!optional2.isPresent()) {
                    com.google.common.f.a.a f2 = d.f();
                    f2.ak(5053);
                    f2.p("#MWW MDD config unavailable, reading embedded config as fallback.");
                    optional = e();
                }
            }
            optional.ifPresent(new b(fVar));
        }
        fVar.a("MWW Embedded config settings").a(new com.google.android.apps.gsa.shared.util.b.d("force embedded config: " + this.h.i(eu.mU) + ", use dev config: " + this.h.i(eu.mR), false));
    }
}
