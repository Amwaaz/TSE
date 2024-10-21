package com.google.android.apps.gsa.publicsearch;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.apps.gsa.shared.k.cy;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.gms.common.v;
import com.google.common.base.at;
import j$.util.DesugarArrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/publicsearch/c.class */
public final class c extends com.google.android.a.b implements d {

    /* renamed from: a, reason: collision with root package name */
    final PublicSearchService f1035a;

    public c() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PublicSearchService publicSearchService) {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
        this.f1035a = publicSearchService;
    }

    private final boolean b() {
        String[] packagesForUid = this.f1035a.b.f1039a.getPackageManager().getPackagesForUid(getCallingUid());
        if (packagesForUid == null) {
            return false;
        }
        v vVar = (v) this.f1035a.c.a();
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return DesugarArrays.stream(packagesForUid).allMatch(new l(vVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final IBinder a(String str, IBinder iBinder, Bundle bundle) {
        boolean z;
        int i;
        com.google.common.f.h d = PublicSearchService.f1033a.d();
        d.ak(6305);
        d.p("Calling beginBinderSession().");
        k kVar = this.f1035a.b;
        kVar.a();
        if (!((p) kVar.b.a()).m(cy.e).contains(str)) {
            return null;
        }
        boolean b = b();
        if (!b && !str.equals("opa_ambient_mode")) {
            return null;
        }
        k kVar2 = this.f1035a.b;
        kVar2.a();
        e.a aVar = (e.a) kVar2.d.get(str);
        com.google.android.apps.gsa.publicsearch.a.a aVar2 = aVar == null ? null : (com.google.android.apps.gsa.publicsearch.a.a) aVar.a();
        if (aVar2 == null) {
            return null;
        }
        com.google.common.f.h d2 = PublicSearchService.f1033a.d();
        d2.ak(6306);
        d2.p("beginBinderSession(): calling binder");
        int callingUid = getCallingUid();
        int myUid = Process.myUid();
        switch (str.hashCode()) {
            case -2022457460:
                if (str.equals("nga_entry_point")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case -1374972966:
                if (str.equals("opa_dreamliner")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1104785492:
                if (str.equals("opa_broadcast_receiver")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case -930551529:
                if (str.equals("opa_app_integration")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -400688006:
                if (str.equals("opa_wifi_receiver")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case -35556589:
                if (str.equals("opa_amb_device_integration")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 1542020649:
                if (str.equals("opa_ambient_mode")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1867227667:
                if (str.equals("opa_entry")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                i = 6;
                break;
            case true:
                i = 7;
                break;
            case true:
                i = 8;
                break;
            case true:
                i = 9;
                break;
            case true:
                i = 10;
                break;
            case true:
                i = 11;
                break;
            case true:
                i = 12;
                break;
            case true:
                i = 13;
                break;
            default:
                i = 1;
                break;
        }
        int i2 = i - 1;
        if (callingUid == myUid) {
            boolean z2 = e.f345a;
            e.a(com.google.android.apps.gsa.s.a.PSS_AGSA_USAGE_COUNT, i2);
        } else if (b) {
            e.p(i);
        } else {
            boolean z3 = e.f345a;
            e.a(com.google.android.apps.gsa.s.a.PSS_THIRD_PARTY_USAGE_COUNT, i2);
        }
        com.google.android.apps.gsa.d.b.b.f(14, i2);
        return aVar2.a(at.j(iBinder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        g gVar;
        boolean z;
        com.google.android.apps.gsa.smartspace.c.d hVar;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            IBinder a2 = a(readString, readStrongBinder, bundle);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(a2);
            return true;
        }
        String readString2 = parcel.readString();
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 == null) {
            gVar = null;
        } else {
            g queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
            gVar = queryLocalInterface instanceof g ? queryLocalInterface : new g(readStrongBinder2);
        }
        parcel.createByteArray();
        enforceNoDataAvail(parcel);
        int hashCode = readString2.hashCode();
        if (hashCode == -1199764068) {
            if (readString2.equals("LENS_BACKGROUND_SERVICE_SESSION")) {
                z = false;
            }
            z = -1;
        } else if (hashCode != 389355050) {
            if (hashCode == 2059195787 && readString2.equals("LENS_SERVICE_SESSION")) {
                z = true;
            }
            z = -1;
        } else {
            if (readString2.equals("SMARTSPACE_GENERIC_UPDATE_SESSION")) {
                z = 2;
            }
            z = -1;
        }
        if (!z || z) {
            com.google.android.apps.search.lens.e.j jVar = this.f1035a.d;
            readString2.getClass();
            gVar.getClass();
            Context context = (Context) jVar.f2517a.a();
            context.getClass();
            hVar = new com.google.android.apps.search.lens.e.h(readString2, gVar, context, jVar.b, jVar.c);
        } else if (z != 2) {
            hVar = null;
        } else if (getCallingUid() == Process.myUid()) {
            hVar = null;
        } else if (b()) {
            com.google.common.f.h d = PublicSearchService.f1033a.d();
            d.ak(6311);
            d.p("New Smartspace PSS started.");
            com.google.android.apps.gsa.smartspace.c.e eVar = this.f1035a.e;
            x xVar = (x) eVar.f1582a.a();
            xVar.getClass();
            gVar.getClass();
            com.google.android.libraries.gsa.h.h hVar2 = (com.google.android.libraries.gsa.h.h) eVar.b.a();
            hVar2.getClass();
            hVar = new com.google.android.apps.gsa.smartspace.c.d(xVar, gVar, hVar2);
            hVar.c.n("Connect searchServiceClient", new com.google.android.apps.gsa.smartspace.c.b(hVar, 0));
            e.p(5);
            com.google.android.apps.gsa.d.b.b.f(14, 4);
        } else {
            hVar = null;
        }
        parcel2.writeNoException();
        com.google.android.a.c.f(parcel2, hVar);
        return true;
    }
}
