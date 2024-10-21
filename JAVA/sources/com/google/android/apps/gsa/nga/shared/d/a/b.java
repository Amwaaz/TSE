package com.google.android.apps.gsa.nga.shared.d.a;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.api.a.ai;
import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.ar;
import com.google.android.apps.gsa.nga.api.a.n;
import com.google.android.apps.gsa.nga.api.au;
import com.google.android.libraries.search.d.dl;
import com.google.common.b.oo;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/d/a/b.class */
public final class b implements au {
    private static final d b = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Set f854a = oo.j();

    @Override // com.google.android.apps.gsa.nga.api.au
    public final Optional b(dl dlVar) {
        if (!this.f854a.isEmpty()) {
            a d = b.d();
            d.ak(5085);
            d.q("RohanFollowOn with token %d", dlVar.c);
        }
        Set set = this.f854a;
        Optional empty = Optional.empty();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                Optional b2 = ((au) it.next()).b(dlVar);
                if (b2.isPresent()) {
                    if (empty.isPresent()) {
                        a f = b.f();
                        f.ak(5083);
                        f.q("rohanFollowOn with token %d returned more than one RohanToken", dlVar.c);
                    }
                    empty = b2;
                }
            } catch (Exception e) {
                aus.f(b.f(), "Client exception on query status error", (char) 5084, e);
            }
        }
        return empty;
    }

    @Override // com.google.android.apps.gsa.nga.api.au
    public final void c(n nVar) {
        Object obj;
        if (!this.f854a.isEmpty()) {
            a d = b.d();
            d.ak(5087);
            int e = ar.e(nVar.c);
            switch (e) {
                case 1:
                    obj = "PUSH_TO_TALK_ERROR";
                    break;
                case 2:
                    obj = "CLIENT_HOTWORD_RESULT";
                    break;
                case 3:
                    obj = "TRANSCRIPTION_FAILURE";
                    break;
                case 4:
                    obj = "MOBILE_ASSISTANT_RESULT";
                    break;
                case 5:
                    obj = "WATCH_ERROR";
                    break;
                case 6:
                    obj = "TEXT_QUERY_ERROR";
                    break;
                case 7:
                    obj = "TYPE_NOT_SET";
                    break;
                default:
                    obj = "null";
                    break;
            }
            if (e == 0) {
                throw null;
            }
            dl dlVar = nVar.e;
            dl dlVar2 = dlVar;
            if (dlVar == null) {
                dlVar2 = dl.f5109a;
            }
            d.H("InvocationError %s with %s", obj, com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar2)));
        }
        Iterator it = this.f854a.iterator();
        while (it.hasNext()) {
            try {
                ((au) it.next()).c(nVar);
            } catch (Exception e2) {
                aus.f(b.f(), "Client exception on query status error", (char) 5086, e2);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.au
    public final void d(ai aiVar) {
        if (!this.f854a.isEmpty()) {
            a d = b.d();
            d.ak(5089);
            int cN = a.a.cN(aiVar.d);
            int i = cN;
            if (cN == 0) {
                i = 1;
            }
            dl dlVar = aiVar.c;
            dl dlVar2 = dlVar;
            if (dlVar == null) {
                dlVar2 = dl.f5109a;
            }
            d.H("ErrorAfterAcceptingInvocation %s with %s", ar.c(i), com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar2)));
        }
        Iterator it = this.f854a.iterator();
        while (it.hasNext()) {
            try {
                ((au) it.next()).d(aiVar);
            } catch (Exception e) {
                aus.f(b.f(), "Client exception for ErrorAfterAcceptingInvocation", (char) 5088, e);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.api.au
    public final void e(ak akVar) {
        Object obj;
        if (!this.f854a.isEmpty()) {
            a d = b.d();
            d.ak(5091);
            int b2 = ar.b(akVar.c);
            switch (b2) {
                case 1:
                    obj = "HOTWORD_VERIFIED";
                    break;
                case 2:
                    obj = "LISTENING";
                    break;
                case 3:
                    obj = "RECOGNITION";
                    break;
                case 4:
                    obj = "NO_SPEECH_DETECTED";
                    break;
                case 5:
                    obj = "DEVICE_ACTION";
                    break;
                case 6:
                    obj = "MEDIA_CONTROL";
                    break;
                case 7:
                    obj = "AUDIO_FOCUS_LOSS";
                    break;
                case 8:
                    obj = "EXECUTING";
                    break;
                case 9:
                    obj = "IDLE";
                    break;
                case 10:
                    obj = "PARTIAL_RECOGNITION";
                    break;
                case 11:
                    obj = "GACS_EXECUTE_RESULT";
                    break;
                case 12:
                    obj = "QUERY_REQUEST_ID";
                    break;
                case 13:
                    obj = "GACS_PR_REQUEST_PERMISSION";
                    break;
                case 14:
                    obj = "QUERYSTATUSDATA_NOT_SET";
                    break;
                default:
                    obj = "null";
                    break;
            }
            if (b2 == 0) {
                throw null;
            }
            dl dlVar = akVar.e;
            dl dlVar2 = dlVar;
            if (dlVar == null) {
                dlVar2 = dl.f5109a;
            }
            d.H("Query status update %s with %s", obj, com.google.android.apps.gsa.nga.shared.d.d.d.b(Optional.of(dlVar2)));
        }
        Iterator it = this.f854a.iterator();
        while (it.hasNext()) {
            try {
                ((au) it.next()).e(akVar);
            } catch (Exception e) {
                aus.f(b.f(), "Client exception on query status update", (char) 5090, e);
            }
        }
    }
}
