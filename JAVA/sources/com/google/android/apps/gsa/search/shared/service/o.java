package com.google.android.apps.gsa.search.shared.service;

import a.a;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.c.eq;
import com.google.android.apps.gsa.search.shared.service.c.er;
import com.google.android.apps.gsa.search.shared.service.c.es;
import com.google.android.apps.gsa.search.shared.service.c.et;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hj;
import com.google.android.apps.gsa.search.shared.service.c.hk;
import com.google.android.apps.gsa.search.shared.service.c.hl;
import com.google.android.apps.gsa.search.shared.service.c.hm;
import com.google.android.apps.gsa.search.shared.service.c.hp;
import com.google.android.apps.gsa.search.shared.service.c.hq;
import com.google.android.apps.gsa.search.shared.service.c.hr;
import com.google.android.apps.gsa.search.shared.service.c.hs;
import com.google.android.apps.gsa.search.shared.service.c.ie;
import com.google.android.apps.gsa.search.shared.service.c.if;
import com.google.android.apps.gsa.search.shared.service.c.ig;
import com.google.android.apps.gsa.search.shared.service.c.ih;
import com.google.android.apps.gsa.search.shared.service.c.js;
import com.google.android.apps.gsa.search.shared.service.c.jt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.f.ab;
import java.util.List;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/o.class */
public class o implements ad, com.google.android.apps.gsa.shared.util.ae {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1354a = com.google.common.f.j.i("com.google.android.apps.gsa.search.shared.service.o");

    protected void a(ServiceEventData serviceEventData) {
    }

    public void c(int i, String str, String str2) {
    }

    public void d(String str, String str2) {
    }

    public void e(ParcelableVoiceAction parcelableVoiceAction) {
    }

    public void f(int i) {
    }

    public void g(Query query, List list, CardDecision cardDecision, int i) {
    }

    @Override // com.google.android.apps.gsa.search.shared.service.ad
    public final void gm(ServiceEventData serviceEventData) {
        try {
            ab abVar = com.google.common.f.a.e.a;
            hf a2 = hf.a(serviceEventData.f1330a.c);
            hf hfVar = a2;
            if (a2 == null) {
                hfVar = hf.ATTACH_WEBVIEW;
            }
            int ordinal = hfVar.ordinal();
            if (ordinal == 34) {
                l();
            } else if (ordinal == 51) {
                ShowVoiceActionsEventParcelable b = serviceEventData.b(ShowVoiceActionsEventParcelable.class);
                g(b.a, b.b, b.c, ((ih) serviceEventData.e(ig.a)).c);
            } else if (ordinal != 138) {
                switch (ordinal) {
                    case 37:
                        serviceEventData.b(HotwordResult.class);
                        break;
                    case 38:
                        serviceEventData.b(Response.class);
                        break;
                    case 39:
                        if (serviceEventData.d(SoundSearchResult.class)) {
                            serviceEventData.b(SoundSearchResult.class);
                            break;
                        }
                        break;
                    default:
                        String str = null;
                        switch (ordinal) {
                            case 41:
                                hm hmVar = (hm) serviceEventData.e(hl.a);
                                String str2 = hmVar.c;
                                String str3 = null;
                                if ((hmVar.b & 2) != 0) {
                                    str3 = hmVar.d;
                                }
                                d(str2, str3);
                                break;
                            case 42:
                                jt jtVar = (jt) serviceEventData.e(js.a);
                                String str4 = jtVar.c;
                                String str5 = jtVar.d;
                                if ((jtVar.b & 4) != 0) {
                                    str = jtVar.e;
                                }
                                h(str4, str5, str);
                                break;
                            case 43:
                                f(((if) serviceEventData.e(ie.a)).c);
                                break;
                            case 44:
                                e((ParcelableVoiceAction) serviceEventData.b(ParcelableVoiceAction.class));
                                break;
                            case 45:
                                Uri.parse(((er) serviceEventData.e(eq.a)).b);
                                break;
                            case 46:
                                hq hqVar = (hq) serviceEventData.e(hp.a);
                                int i = hqVar.c;
                                int i2 = hqVar.d;
                                boolean z = hqVar.e;
                                j(i2);
                                break;
                            case 47:
                                k((Intent) serviceEventData.b(Intent.class));
                                break;
                            case 48:
                                hk hkVar = (hk) serviceEventData.e(hj.a);
                                c(hkVar.c, hkVar.d, hkVar.e);
                                break;
                            case 49:
                                OnTranscriptionUpdateEventParcelable b2 = serviceEventData.b(OnTranscriptionUpdateEventParcelable.class);
                                et etVar = (et) serviceEventData.e(es.a);
                                Query query = b2.a;
                                List list = b2.b;
                                String str6 = etVar.b;
                                boolean z2 = etVar.c;
                                String str7 = etVar.d;
                                break;
                        }
                }
            } else {
                int i3 = ((hs) serviceEventData.e(hr.a)).b;
            }
            a(serviceEventData);
        } catch (RemoteException e) {
            com.google.common.f.y f = f1354a.f();
            f.aj(com.google.common.f.a.e.a, "ISearchServiceUCAdapter");
            a.dB(f, "Unexpected exception in onServiceEvent.", (char) 8328, e);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.ae
    public final void gn(int i) {
        try {
            i(i);
        } catch (RemoteException e) {
            com.google.common.f.y f = f1354a.f();
            f.aj(com.google.common.f.a.e.a, "ISearchServiceUCAdapter");
            a.dB(f, "Unexpected exception in onSpeechLevel.", (char) 8329, e);
        }
    }

    public void h(String str, String str2, String str3) {
    }

    public void i(int i) {
    }

    public void j(int i) {
    }

    public void k(Intent intent) {
    }

    public void l() {
    }
}
