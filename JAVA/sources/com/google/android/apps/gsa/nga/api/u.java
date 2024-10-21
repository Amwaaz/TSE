package com.google.android.apps.gsa.nga.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Debug;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.a.b;
import com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.engine.ak.l.b.d;
import com.google.android.apps.gsa.nga.engine.ak.m.a.h;
import com.google.android.apps.gsa.nga.engine.ak.m.a.j;
import com.google.android.apps.gsa.nga.engine.ao.g;
import com.google.android.apps.gsa.nga.engine.b.d.i;
import com.google.android.apps.gsa.nga.engine.bisto.b.f;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.p;
import com.google.android.apps.gsa.nga.engine.viss.NgaService;
import com.google.android.apps.gsa.nga.engine.viss.aa;
import com.google.android.apps.gsa.nga.engine.viss.q;
import com.google.android.apps.gsa.nga.shared.ak.k;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.ai;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.c.e;
import com.google.android.apps.gsa.nga.shared.q.c.fg;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.r;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.apps.gsa.search.shared.service.d.b.l;
import com.google.android.apps.gsa.search.shared.service.d.b.m;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.proto.io.LargeProtoParcelable;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.search.d.dl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.f.a.a;
import com.google.common.o.ls;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import com.google.protobuf.cu;
import com.google.protobuf.v;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/api/u.class */
public final class u extends b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final NgaService f382a;

    public u() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NgaService ngaService) {
        super("com.google.android.apps.gsa.nga.api.INgaService");
        this.f382a = ngaService;
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void A(ProtoLiteParcelable protoLiteParcelable) {
        f fVar = (f) this.f382a.B.a();
        Optional f = fVar.f(fVar.e.a());
        if (f.isEmpty()) {
            a d = f.f513a.d();
            d.ak(2729);
            d.p("Unable to find invocation token. Event is not dispatched");
            return;
        }
        try {
            ak d2 = protoLiteParcelable.d(ak.a.getParserForType());
            if (d2 == null) {
                a e = f.f513a.e();
                e.ak(2728);
                e.p("Unexpected null QueryStatus proto in parcelable.");
                fVar.d.b();
                return;
            }
            x xVar = fVar.d.b;
            fg d3 = e.d();
            d3.b = "SUCCESS";
            xVar.b(d3.g());
            ba builder = d2.toBuilder();
            dl dlVar = (dl) f.get();
            builder.copyOnWrite();
            ak akVar = builder.instance;
            akVar.e = dlVar;
            akVar.b |= 1;
            fVar.g((ak) builder.build());
        } catch (IllegalArgumentException e2) {
            aus.f(f.f513a.f(), "Unable to parse QueryStatusProto", (char) 2727, e2);
            fVar.d.b();
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void B(String str) {
        ((com.google.android.apps.gsa.nga.engine.ar.b.v) this.f382a.e.a()).b(c.PIXEL_LAUNCHER_QSB, str, false);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void C(long j, com.google.android.apps.gsa.nga.shared.v.c.a.c cVar) {
        com.google.android.apps.gsa.nga.engine.recognition.i.a.a aVar = (com.google.android.apps.gsa.nga.engine.recognition.i.a.a) this.f382a.z.a();
        com.google.android.apps.gsa.nga.shared.v.c.b.a aVar2 = (com.google.android.apps.gsa.nga.shared.v.c.b.a) aVar.b.get();
        if (aVar2 == null) {
            a d = com.google.android.apps.gsa.nga.engine.recognition.i.a.a.a.d();
            d.ak(3858);
            d.p("onRemoteAudioRecordingRequest: recording is null");
            com.google.android.apps.gsa.nga.engine.recognition.i.a.a.a(cVar, (com.google.android.apps.gsa.nga.shared.v.c.b.a) null);
            return;
        }
        ah ahVar = aVar2.f;
        ah ahVar2 = ahVar;
        if (ahVar == null) {
            ahVar2 = ah.a;
        }
        if (j == com.google.android.libraries.search.t.k.a.a(aVar.c.a(ahVar2).b)) {
            com.google.android.apps.gsa.nga.engine.recognition.i.a.a.a(cVar, aVar2);
            return;
        }
        a d2 = com.google.android.apps.gsa.nga.engine.recognition.i.a.a.a.d();
        d2.ak(3856);
        d2.p("onRemoteAudioRecordingRequest: utteranceId does not match. Sending empty");
        com.google.android.apps.gsa.nga.engine.recognition.i.a.a.a(cVar, (com.google.android.apps.gsa.nga.shared.v.c.b.a) null);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void D(Bundle bundle, int i) {
        ((q) this.f382a.y.a()).g(bundle, i);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void E(String str, Bundle bundle, y yVar) {
        com.google.android.apps.gsa.nga.engine.ak.l.b.e eVar = (com.google.android.apps.gsa.nga.engine.ak.l.b.e) this.f382a.u.a();
        eVar.c.m(eVar.b.b(com.google.android.libraries.assistant.g.c.b.a.a(new d(str), bundle), ah.a), "[NGA] OpaDirectActionsNgaAdapter.performDirectAction", new com.google.android.apps.gsa.nga.engine.ak.l.b.a(yVar));
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void F(an anVar) {
        k kVar = new k(anVar);
        com.google.android.apps.gsa.nga.shared.aj.a.c cVar = (com.google.android.apps.gsa.nga.shared.aj.a.c) this.f382a.g.a();
        com.google.android.apps.gsa.nga.shared.aj.a aVar = (com.google.android.apps.gsa.nga.shared.aj.a) cVar.c.get();
        if (aVar != null) {
            kVar.a(aVar);
        } else {
            cVar.b.set(kVar);
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void G(ab abVar) {
        com.google.android.apps.gsa.nga.engine.ak.l.b.e eVar = (com.google.android.apps.gsa.nga.engine.ak.l.b.e) this.f382a.u.a();
        eVar.c.m(eVar.b.a(ah.a), "[NGA] OpaDirectActionsNgaAdapter.requestDirectActions", new com.google.android.apps.gsa.nga.engine.ak.l.b.c(abVar));
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void H(ForegroundSignalType foregroundSignalType, n nVar) {
        j jVar = (j) this.f382a.A.a();
        jVar.b.n("[NGA] handleRequest", new h(jVar, foregroundSignalType, nVar));
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void I(NgaState ngaState, int i) {
        ls a2 = ls.a(i);
        ls lsVar = a2;
        if (a2 == null) {
            lsVar = ls.a;
        }
        final i iVar = (i) this.f382a.b.a();
        if (!iVar.e.getAndSet(true)) {
            iVar.f.e(new ai(iVar) { // from class: com.google.android.apps.gsa.nga.engine.b.d.h

                /* renamed from: a, reason: collision with root package name */
                public final i f505a;

                {
                    this.f505a = iVar;
                }

                @Override // com.google.android.apps.gsa.nga.shared.q.a.ai
                public final NgaState a() {
                    return this.f505a.f506a;
                }
            });
        }
        NgaState ngaState2 = iVar.f506a;
        iVar.f506a = ngaState;
        iVar.b = lsVar;
        if ((ngaState2 == null && ngaState.b()) || (ngaState2 != null && ngaState2 != ngaState)) {
            com.google.android.apps.gsa.nga.engine.b.a aVar = new com.google.android.apps.gsa.nga.engine.b.a(ngaState2, ngaState);
            Iterator it = ((Set) iVar.c.a()).iterator();
            while (it.hasNext()) {
                ((com.google.android.apps.gsa.nga.engine.b.b) it.next()).hb(aVar);
            }
        }
        iVar.d.n((Object) null);
        if (ngaState.b()) {
            return;
        }
        this.f382a.stopSelf();
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void J(ak akVar, long j) {
        NgaService ngaService = this.f382a;
        synchronized (ngaService.G) {
            ngaService.H = new com.google.android.apps.gsa.nga.shared.ak.j(akVar);
            com.google.android.apps.gsa.nga.shared.aj.a aVar = ngaService.H;
            ngaService.I = j;
            ((com.google.android.apps.gsa.nga.shared.aj.a.c) ngaService.g.a()).c(aVar);
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void a() {
        ((com.google.android.apps.gsa.nga.engine.recognition.a.a.a.c) this.f382a.w.a()).c();
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void b(long j) {
        NgaService ngaService = this.f382a;
        synchronized (ngaService.G) {
            com.google.android.apps.gsa.nga.shared.ak.j jVar = ngaService.H;
            if (jVar == null) {
                a f = NgaService.f816a.f();
                f.ak(5025);
                f.r("No saved delegate is present when requested to clear callbackId=%d, skipping", j);
            } else if (j == ngaService.I) {
                h.a.a.p.b.a.f.I(((com.google.android.apps.gsa.nga.shared.aj.a.c) ngaService.g.a()).c, jVar);
                ngaService.H = null;
            } else {
                a f2 = NgaService.f816a.f();
                f2.ak(5024);
                f2.C("Provided callbackId(%d) to clear does not match currently saved one(%d), skipping", j, ngaService.I);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void c(p pVar) {
        a d = NgaService.f816a.d();
        d.ak(5017);
        d.p("Attempting to obtain the ModelVersion from the TcLibWrapper.");
        boolean z = ((y) this.f382a.C.a()).c().b;
        a f = NgaService.f816a.f();
        f.ak(5018);
        f.p("Attempted to obtain the ModelVersion from the TcLibWrapper when on-device is not eligible.");
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void d(final IBinder iBinder) {
        final aa aaVar = (aa) this.f382a.D.a();
        aaVar.b.n("[NGA] SearchProcessStateTracker.trackNewSearchProcessConnection", new com.google.android.libraries.gsa.h.f(aaVar, iBinder) { // from class: com.google.android.apps.gsa.nga.engine.viss.w

            /* renamed from: a, reason: collision with root package name */
            public final aa f819a;
            public final IBinder b;

            {
                this.f819a = aaVar;
                this.b = iBinder;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                aa aaVar2 = this.f819a;
                IBinder iBinder2 = this.b;
                y yVar = aaVar2.e;
                if (yVar != null && yVar.f820a.equals(iBinder2)) {
                    com.google.common.f.a.a d = aa.f817a.d();
                    d.ak(5040);
                    d.p("New :search process connection is already being tracked");
                    return;
                }
                y yVar2 = aaVar2.e;
                if (yVar2 != null) {
                    yVar2.a();
                    com.google.common.f.a.a d2 = aa.f817a.d();
                    d2.ak(5039);
                    d2.p("Process token changed, assuming :search process died");
                }
                if (iBinder2 == null) {
                    com.google.common.f.a.a f = aa.f817a.f();
                    f.ak(5044);
                    f.p("#onSearchProcessAlive: No process token provided");
                    return;
                }
                if (aaVar2.e != null) {
                    com.google.common.f.a.a f2 = aa.f817a.f();
                    f2.ak(5043);
                    f2.p("#onSearchProcessAlive: currentDeathRecipient is still set");
                    return;
                }
                try {
                    y yVar3 = new y(aaVar2, iBinder2);
                    iBinder2.linkToDeath(yVar3, 0);
                    aaVar2.e = yVar3;
                    ((v) aaVar2.c.a()).a(iBinder2);
                    com.google.android.apps.gsa.nga.engine.ak.v.a.e eVar = (com.google.android.apps.gsa.nga.engine.ak.v.a.e) aaVar2.d.a();
                    eVar.b.n("[NGA] notify search process listeners on alive", new com.google.android.libraries.gsa.h.f(eVar) { // from class: com.google.android.apps.gsa.nga.engine.ak.v.a.b

                        /* renamed from: a, reason: collision with root package name */
                        public final e f446a;

                        {
                            this.f446a = eVar;
                        }

                        @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                        public final void run() {
                            e eVar2 = this.f446a;
                            eVar2.f447a.size();
                            Iterator it = eVar2.f447a.iterator();
                            while (it.hasNext()) {
                                ((com.google.android.apps.gsa.nga.engine.ak.v.a) it.next()).c();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    com.google.common.f.a.a e2 = aa.f817a.e();
                    e2.ak(5042);
                    e2.s("New client is already dead: %s", e.getMessage());
                }
            }
        });
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        ak aiVar;
        an alVar;
        ae acVar;
        ae acVar2;
        p oVar;
        com.google.android.apps.gsa.nga.shared.s3.aidl.d bVar;
        y wVar;
        ab zVar;
        n lVar;
        com.google.android.apps.gsa.nga.shared.v.c.a.c aVar;
        k iVar;
        com.google.android.libraries.assistant.g.d.t tVar = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                enforceNoDataAvail(parcel);
                d(readStrongBinder);
                return true;
            case 2:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                B(readString);
                return true;
            case 3:
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                g(readString2);
                return true;
            case 4:
                NgaState ngaState = (NgaState) com.google.android.a.c.a(parcel, NgaState.CREATOR);
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                I(ngaState, readInt);
                return true;
            case 5:
                com.google.android.a.c.a(parcel, MorrisRunningStatus.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 6:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    aiVar = null;
                } else {
                    ak queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.apps.gsa.nga.api.IVissCallback");
                    aiVar = queryLocalInterface instanceof ak ? queryLocalInterface : new ai(readStrongBinder2);
                }
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                J(aiVar, readLong);
                return true;
            case 7:
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                b(readLong2);
                return true;
            case 8:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    alVar = null;
                } else {
                    an queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.apps.gsa.nga.api.IVissCallbackConsumer");
                    alVar = queryLocalInterface2 instanceof an ? queryLocalInterface2 : new al(readStrongBinder3);
                }
                enforceNoDataAvail(parcel);
                F(alVar);
                return true;
            case 9:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    acVar = null;
                } else {
                    ae queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.apps.gsa.nga.api.IUiScreenshotProvider");
                    acVar = queryLocalInterface3 instanceof ae ? queryLocalInterface3 : new ac(readStrongBinder4);
                }
                enforceNoDataAvail(parcel);
                ((com.google.android.apps.gsa.nga.engine.as.e) this.f382a.q.a()).f495a.set(acVar);
                return true;
            case 10:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    acVar2 = null;
                } else {
                    ae queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.apps.gsa.nga.api.IUiScreenshotProvider");
                    acVar2 = queryLocalInterface4 instanceof ae ? queryLocalInterface4 : new ac(readStrongBinder5);
                }
                enforceNoDataAvail(parcel);
                h.a.a.p.b.a.f.I(((com.google.android.apps.gsa.nga.engine.as.e) this.f382a.q.a()).f495a, acVar2);
                return true;
            case 11:
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                r(readInt2);
                return true;
            case 12:
                LargeProtoParcelable a2 = com.google.android.a.c.a(parcel, LargeProtoParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                try {
                    com.google.android.apps.gsa.nga.shared.u.h.b a3 = a2.a(com.google.android.apps.gsa.nga.shared.u.h.b.a.getParserForType());
                    if (a3 == null) {
                        a f = NgaService.f816a.f();
                        f.ak(5020);
                        f.p("Unexpected null payload in the parcelable");
                        return true;
                    }
                    com.google.android.apps.gsa.nga.engine.r.c cVar = (com.google.android.apps.gsa.nga.engine.r.c) this.f382a.i.a();
                    Locale locale = (Locale) cVar.f641a.get();
                    if (locale == null || !cVar.gV()) {
                        cVar.V();
                        return true;
                    }
                    cVar.b.a(a3.b, locale);
                    a3.b.size();
                    return true;
                } catch (IllegalArgumentException e) {
                    aus.f(NgaService.f816a.f(), "Unable to read NgaEmailData proto from the parcelable's payload", (char) 5021, e);
                    return true;
                }
            case 13:
                ArrayList readArrayList = parcel.readArrayList(com.google.android.a.c.f231a);
                enforceNoDataAvail(parcel);
                m(readArrayList);
                return true;
            case 14:
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                z(readInt3);
                return true;
            case 15:
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                com.google.android.apps.gsa.nga.engine.recognition.o.a.e eVar = (com.google.android.apps.gsa.nga.engine.recognition.o.a.e) this.f382a.o.a();
                eVar.b(new com.google.android.apps.gsa.nga.engine.v.d(eVar.f674a.a()).a(), com.google.android.apps.gsa.nga.engine.recognition.h.e, p.f, readString3, Optional.empty(), c.OPA_SUGGESTION_CHIP, Optional.empty());
                return true;
            case 16:
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                j(readString4);
                return true;
            case 17:
                byte[] createByteArray = parcel.createByteArray();
                Bundle bundle = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                o(createByteArray, bundle);
                return true;
            case 18:
                byte[] createByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                q(createByteArray2);
                return true;
            case 19:
                p();
                return true;
            case 20:
                boolean z = ((y) this.f382a.C.a()).c().b;
                return true;
            case 21:
                af afVar = ((com.google.android.apps.gsa.nga.shared.r.a) this.f382a.m.a()).a;
                bk bkVar = bk.MEMORY_STATS;
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                ba createBuilder = bj.a.createBuilder();
                ba createBuilder2 = r.a.createBuilder();
                createBuilder2.copyOnWrite();
                r rVar = createBuilder2.instance;
                rVar.c = 1;
                rVar.b |= 1;
                createBuilder2.copyOnWrite();
                r rVar2 = createBuilder2.instance;
                cu cuVar = rVar2.d;
                if (!cuVar.b) {
                    rVar2.d = cuVar.a();
                }
                rVar2.d.putAll(memoryStats);
                r build = createBuilder2.build();
                createBuilder.copyOnWrite();
                bj bjVar = createBuilder.instance;
                build.getClass();
                bjVar.c = build;
                bjVar.b = 41;
                afVar.b(bkVar, (bj) createBuilder.build(), ah.a);
                return true;
            case 22:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    oVar = null;
                } else {
                    p queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.apps.gsa.nga.api.IGellerGetModelVersionCallback");
                    oVar = queryLocalInterface5 instanceof p ? queryLocalInterface5 : new o(readStrongBinder6);
                }
                enforceNoDataAvail(parcel);
                c(oVar);
                return true;
            case 23:
                int readInt4 = parcel.readInt();
                boolean g = com.google.android.a.c.g(parcel);
                enforceNoDataAvail(parcel);
                u(readInt4, g);
                return true;
            case 24:
                String readString5 = parcel.readString();
                enforceNoDataAvail(parcel);
                com.google.android.apps.gsa.nga.engine.recognition.o.a.e eVar2 = (com.google.android.apps.gsa.nga.engine.recognition.o.a.e) this.f382a.o.a();
                eVar2.b(new com.google.android.apps.gsa.nga.engine.v.d(eVar2.f674a.a()).a(), com.google.android.apps.gsa.nga.engine.recognition.h.d, p.e, readString5, Optional.empty(), c.READ_EMAIL_ACTION, Optional.empty());
                return true;
            case 25:
                ((com.google.android.apps.gsa.nga.engine.ar.b.v) this.f382a.e.a()).b(c.READ_EMAIL_MIC_BUTTON, com.google.android.libraries.search.t.h.j.cK.a(), false);
                return true;
            case 26:
                Bundle bundle2 = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    bVar = null;
                } else {
                    com.google.android.apps.gsa.nga.shared.s3.aidl.d queryLocalInterface6 = readStrongBinder7.queryLocalInterface("com.google.android.apps.gsa.nga.shared.s3.aidl.ICloudFulfillmentCallback");
                    bVar = queryLocalInterface6 instanceof com.google.android.apps.gsa.nga.shared.s3.aidl.d ? queryLocalInterface6 : new com.google.android.apps.gsa.nga.shared.s3.aidl.b(readStrongBinder7);
                }
                enforceNoDataAvail(parcel);
                k(bundle2, bVar);
                return true;
            case 27:
                Bundle bundle3 = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                byte[] createByteArray3 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                l(bundle3, createByteArray3);
                return true;
            case 28:
                String readString6 = parcel.readString();
                Bundle bundle4 = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    wVar = null;
                } else {
                    y queryLocalInterface7 = readStrongBinder8.queryLocalInterface("com.google.android.apps.gsa.nga.api.IPerformDirectActionCallback");
                    wVar = queryLocalInterface7 instanceof y ? queryLocalInterface7 : new w(readStrongBinder8);
                }
                enforceNoDataAvail(parcel);
                E(readString6, bundle4, wVar);
                return true;
            case 29:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    zVar = null;
                } else {
                    ab queryLocalInterface8 = readStrongBinder9.queryLocalInterface("com.google.android.apps.gsa.nga.api.IRequestDirectActionsCallback");
                    zVar = queryLocalInterface8 instanceof ab ? queryLocalInterface8 : new z(readStrongBinder9);
                }
                enforceNoDataAvail(parcel);
                G(zVar);
                return true;
            case 30:
                ForegroundSignalType foregroundSignalType = (ForegroundSignalType) com.google.android.a.c.a(parcel, ForegroundSignalType.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    lVar = null;
                } else {
                    n queryLocalInterface9 = readStrongBinder10.queryLocalInterface("com.google.android.apps.gsa.nga.api.IForegroungSignalsRequestCallback");
                    lVar = queryLocalInterface9 instanceof n ? queryLocalInterface9 : new l(readStrongBinder10);
                }
                enforceNoDataAvail(parcel);
                H(foregroundSignalType, lVar);
                return true;
            case 31:
                ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) com.google.android.a.c.a(parcel, ProtoLiteParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                y(protoLiteParcelable);
                return true;
            case 32:
                a();
                return true;
            case 33:
                ProtoLiteParcelable protoLiteParcelable2 = (ProtoLiteParcelable) com.google.android.a.c.a(parcel, ProtoLiteParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                x(protoLiteParcelable2);
                return true;
            case 34:
                long readLong3 = parcel.readLong();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    aVar = null;
                } else {
                    com.google.android.apps.gsa.nga.shared.v.c.a.c queryLocalInterface10 = readStrongBinder11.queryLocalInterface("com.google.android.apps.gsa.nga.shared.recognition.recording.aidl.IRemoteAudioRecordingCallback");
                    aVar = queryLocalInterface10 instanceof com.google.android.apps.gsa.nga.shared.v.c.a.c ? queryLocalInterface10 : new com.google.android.apps.gsa.nga.shared.v.c.a.a(readStrongBinder11);
                }
                enforceNoDataAvail(parcel);
                C(readLong3, aVar);
                return true;
            case 35:
                ProtoLiteParcelable protoLiteParcelable3 = (ProtoLiteParcelable) com.google.android.a.c.a(parcel, ProtoLiteParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                A(protoLiteParcelable3);
                return true;
            case 36:
                int readInt5 = parcel.readInt();
                long readLong4 = parcel.readLong();
                enforceNoDataAvail(parcel);
                e(readInt5, readLong4);
                return true;
            case 37:
                Bundle bundle5 = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                int readInt6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                D(bundle5, readInt6);
                return true;
            case 38:
                Bundle bundle6 = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
                AssistStructure assistStructure = (AssistStructure) com.google.android.a.c.a(parcel, AssistStructure.CREATOR);
                AssistContent assistContent = (AssistContent) com.google.android.a.c.a(parcel, AssistContent.CREATOR);
                int readInt7 = parcel.readInt();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    com.google.android.libraries.assistant.g.d.t queryLocalInterface11 = readStrongBinder12.queryLocalInterface("com.google.android.libraries.assistant.directactions.sender.ISystemDirectActionsProxy");
                    tVar = queryLocalInterface11 instanceof com.google.android.libraries.assistant.g.d.t ? queryLocalInterface11 : new com.google.android.libraries.assistant.g.d.r(readStrongBinder12);
                }
                enforceNoDataAvail(parcel);
                s(bundle6, assistStructure, assistContent, readInt7, tVar);
                return true;
            case 39:
                Bitmap bitmap = (Bitmap) com.google.android.a.c.a(parcel, Bitmap.CREATOR);
                enforceNoDataAvail(parcel);
                t(bitmap);
                return true;
            case 40:
                int readInt8 = parcel.readInt();
                enforceNoDataAvail(parcel);
                n(readInt8);
                return true;
            case 41:
                i();
                return true;
            case 42:
                h();
                return true;
            case 43:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 == null) {
                    iVar = null;
                } else {
                    k queryLocalInterface12 = readStrongBinder13.queryLocalInterface("com.google.android.apps.gsa.nga.api.IAssistUiStateCallback");
                    iVar = queryLocalInterface12 instanceof k ? queryLocalInterface12 : new i(readStrongBinder13);
                }
                enforceNoDataAvail(parcel);
                v(iVar);
                return true;
            case 44:
                ProtoLiteParcelable protoLiteParcelable4 = (ProtoLiteParcelable) com.google.android.a.c.a(parcel, ProtoLiteParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                f(protoLiteParcelable4);
                return true;
            case 45:
                parcel.readInt();
                enforceNoDataAvail(parcel);
                synchronized (((com.google.android.apps.gsa.nga.engine.ak.f.a.a) this.f382a.E.a()).a) {
                }
                return true;
            case 46:
                w();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void e(int i, long j) {
        com.google.android.apps.gsa.nga.engine.v.i iVar = (com.google.android.apps.gsa.nga.engine.v.i) this.f382a.d.a();
        com.google.android.apps.gsa.shared.logger.b.e eVar = new com.google.android.apps.gsa.shared.logger.b.e();
        eVar.a = w.a(i);
        eVar.c = j;
        iVar.a(eVar.a());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void f(ProtoLiteParcelable protoLiteParcelable) {
        com.google.android.apps.gsa.nga.engine.ak.a.a aVar = (com.google.android.apps.gsa.nga.engine.ak.a.a) this.f382a.F.a();
        com.google.android.apps.gsa.assistant.settings.features.a.b.a d = protoLiteParcelable.d(com.google.android.apps.gsa.assistant.settings.features.a.b.a.a.getParserForType());
        if (d != null) {
            aVar.c.set(d.c);
            aVar.d.set(d.d);
        } else {
            a e = com.google.android.apps.gsa.nga.engine.ak.a.a.a.e();
            e.ak(4069);
            e.p("No changes on accessibility settings.");
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void g(String str) {
        ((com.google.android.apps.gsa.nga.engine.ar.b.v) this.f382a.e.a()).b(h.a.a.p.b.a.f.f(str, com.google.android.libraries.search.t.h.j.bg.a()) ? c.SHELL_APP : h.a.a.p.b.a.f.f(str, com.google.android.libraries.search.t.h.j.an.a()) ? c.LOCKSCREEN : h.a.a.p.b.a.f.f(str, com.google.android.libraries.search.t.h.j.k.a()) ? c.PIXEL_LAUNCHER_QSB : c.OPA_APP_ICON, str, false);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void h() {
        ((q) this.f382a.y.a()).a();
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void i() {
        ((q) this.f382a.y.a()).b();
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void j(String str) {
        com.google.android.apps.gsa.nga.engine.b.d.f fVar = (com.google.android.apps.gsa.nga.engine.b.d.f) this.f382a.c.a();
        fVar.c.ifPresent(new com.google.android.apps.gsa.nga.engine.b.d.a(str));
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void k(Bundle bundle, com.google.android.apps.gsa.nga.shared.s3.aidl.d dVar) {
        ((com.google.android.apps.gsa.nga.engine.ac.d) this.f382a.k.a()).a(bundle, dVar);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void l(Bundle bundle, byte[] bArr) {
        ((com.google.android.apps.gsa.nga.engine.ac.d) this.f382a.k.a()).d(bundle, bArr);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void m(List list) {
        final g gVar = (g) this.f382a.j.a();
        com.google.android.libraries.gsa.h.h hVar = gVar.h;
        final ha o = ha.o(list);
        hVar.n("[NGA] onNgaConfigFlagChanged", new com.google.android.libraries.gsa.h.f(gVar, o) { // from class: com.google.android.apps.gsa.nga.engine.ao.f

            /* renamed from: a, reason: collision with root package name */
            public final g f466a;
            public final ha b;

            {
                this.f466a = gVar;
                this.b = o;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                v f;
                g gVar2 = this.f466a;
                gVar2.b.a();
                boolean i = gVar2.b.i(eu.ch);
                ha haVar = this.b;
                ha haVar2 = haVar;
                if (i) {
                    gy gyVar = new gy();
                    qj j = haVar.j();
                    while (j.hasNext()) {
                        Integer num = (Integer) j.next();
                        int intValue = num.intValue();
                        Object b = gVar2.c.b(intValue);
                        if (b instanceof com.google.android.apps.gsa.shared.k.d) {
                            f = Boolean.valueOf(gVar2.b.i((com.google.android.apps.gsa.shared.k.d) b));
                        } else if (b instanceof com.google.android.apps.gsa.shared.k.f) {
                            f = Long.valueOf(gVar2.b.d((com.google.android.apps.gsa.shared.k.f) b));
                        } else if (b instanceof com.google.android.apps.gsa.shared.k.h) {
                            f = gVar2.b.h((com.google.android.apps.gsa.shared.k.h) b);
                        } else {
                            if (!(b instanceof com.google.android.apps.gsa.shared.k.g)) {
                                throw new AssertionError(a.a.dy(intValue, "Flag with ID=", " not found."));
                            }
                            f = gVar2.b.f((com.google.android.apps.gsa.shared.k.g) b);
                        }
                        if (!f.equals(gVar2.i.get(num))) {
                            gVar2.i.put(num, f);
                            gyVar.h(num);
                        }
                    }
                    haVar2 = gyVar.g();
                }
                if (haVar2.isEmpty()) {
                    return;
                }
                gVar2.d.a(haVar2);
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void n(int i) {
        ((q) this.f382a.y.a()).c(i);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void o(byte[] bArr, Bundle bundle) {
        ((com.google.android.apps.gsa.nga.engine.ac.d) this.f382a.k.a()).f(bArr, bundle);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void p() {
        ((com.google.android.apps.gsa.nga.engine.ar.b.b.d) this.f382a.f.a()).d();
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void q(byte[] bArr) {
        com.google.android.apps.gsa.nga.engine.ak.j.a.a aVar = (com.google.android.apps.gsa.nga.engine.ak.j.a.a) this.f382a.r.a();
        try {
            m parseFrom = bi.parseFrom(m.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            int i = parseFrom.b;
            if (i == 1) {
                com.google.android.apps.gsa.nga.engine.education.w wVar = aVar.b;
                if (wVar.m(((l) parseFrom.c).b)) {
                    ((com.google.android.apps.gsa.nga.engine.ar.b.b.y) wVar.k.a()).a();
                    return;
                }
                return;
            }
            if (i == 2) {
                aVar.c.a();
                return;
            }
            a f = com.google.android.apps.gsa.nga.engine.ak.j.a.a.a.f();
            f.ak(4118);
            f.p("External deeplink invoked, but no valid action was attached.");
        } catch (ce e) {
            aus.f(com.google.android.apps.gsa.nga.engine.ak.j.a.a.a.e(), "Invalid protobuf received", (char) 4119, e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void r(int i) {
        boolean z = ((y) this.f382a.C.a()).c().b;
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void s(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, com.google.android.libraries.assistant.g.d.t tVar) {
        ((q) this.f382a.y.a()).d(bundle, assistStructure, assistContent, i, tVar);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void t(Bitmap bitmap) {
        ((q) this.f382a.y.a()).e(bitmap);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void u(int i, boolean z) {
        ((com.google.android.apps.gsa.nga.engine.ar.c.a) this.f382a.t.a()).b();
        com.google.android.apps.gsa.nga.shared.a.b bVar = (com.google.android.apps.gsa.nga.shared.a.b) this.f382a.s.a();
        com.google.android.apps.gsa.nga.shared.a.a aVar = new com.google.android.apps.gsa.nga.shared.a.a();
        aVar.c(c.a(i));
        aVar.d();
        aVar.b();
        bVar.a(aVar.a());
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void v(k kVar) {
        ((q) this.f382a.y.a()).f(kVar);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void w() {
        g gVar = (g) this.f382a.j.a();
        com.google.android.libraries.gsa.h.h hVar = gVar.h;
        com.google.android.apps.gsa.shared.util.q.a aVar = gVar.b;
        aVar.getClass();
        hVar.n("[NGA] onLocationAccessChanged", new com.google.android.apps.gsa.nga.engine.ao.e(aVar));
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void x(ProtoLiteParcelable protoLiteParcelable) {
        com.google.android.apps.gsa.nga.engine.ac.a.at atVar = (com.google.android.apps.gsa.nga.engine.ac.a.at) this.f382a.x.a();
        try {
            com.google.android.apps.gsa.shared.ab.h d = protoLiteParcelable.d(com.google.android.apps.gsa.shared.ab.h.a.getParserForType());
            if (d == null) {
                a e = com.google.android.apps.gsa.nga.engine.ac.a.at.a.e();
                e.ak(3675);
                e.p("Unexpected null OpaVisibilityEventData proto in parcelable.");
                return;
            }
            if ((d.b & 1) != 0) {
                atVar.c.a(Boolean.valueOf(d.c));
            }
            if ((d.b & 2) != 0) {
                atVar.b.a(Boolean.valueOf(d.d));
            }
            if ((d.b & 32) != 0) {
                com.google.android.apps.gsa.nga.shared.n.e eVar = atVar.h;
                ev a2 = ev.a(d.h);
                ev evVar = a2;
                if (a2 == null) {
                    evVar = ev.UNKNOWN;
                }
                eVar.a(evVar);
            }
            if ((d.b & 4) != 0) {
                atVar.f.a(Boolean.valueOf(d.e));
            }
            if ((d.b & 16) != 0) {
                com.google.android.apps.gsa.nga.shared.n.e eVar2 = atVar.d;
                com.google.android.apps.gsa.shared.ab.i iVar = d.g;
                com.google.android.apps.gsa.shared.ab.i iVar2 = iVar;
                if (iVar == null) {
                    iVar2 = com.google.android.apps.gsa.shared.ab.i.f1365a;
                }
                eVar2.a(iVar2);
            }
            if ((d.b & 64) != 0) {
                com.google.android.apps.gsa.nga.shared.n.e eVar3 = atVar.e;
                com.google.android.apps.gsa.shared.ab.g gVar = d.i;
                com.google.android.apps.gsa.shared.ab.g gVar2 = gVar;
                if (gVar == null) {
                    gVar2 = com.google.android.apps.gsa.shared.ab.g.f1364a;
                }
                eVar3.a(gVar2);
            }
            if ((d.b & 8) != 0) {
                atVar.g.a(Boolean.valueOf(d.f));
            }
        } catch (IllegalArgumentException e2) {
            aus.f(com.google.android.apps.gsa.nga.engine.ac.a.at.a.e(), "Failed to read OpaVisibilityEventData proto from parcelable.", (char) 3676, e2);
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void y(ProtoLiteParcelable protoLiteParcelable) {
        ((com.google.android.apps.gsa.nga.engine.education.pie.b.y) this.f382a.v.a()).a(protoLiteParcelable);
    }

    @Override // com.google.android.apps.gsa.nga.api.v
    public final void z(int i) {
        g gVar = (g) this.f382a.j.a();
        com.google.android.apps.gsa.nga.shared.f.t tVar = com.google.android.apps.gsa.nga.shared.f.t.values()[i];
        new ae(gVar.f.a(tVar), gVar.g, "[NGA] NgaCrossProcessPrefsNotifier.onNgaDataStoreChanged").a(new com.google.android.apps.gsa.nga.engine.ao.c(gVar, tVar)).a(new com.google.android.apps.gsa.nga.engine.ao.d());
    }
}
