package com.google.android.apps.gsa.shared.search;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.search.a.d;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.android.apps.gsa.shared.util.ac;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.k;
import com.google.android.libraries.g.a.e;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.nn;
import com.google.common.base.an;
import com.google.common.base.ao;
import com.google.common.base.ap;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.gd;
import com.google.common.o.or;
import com.google.protobuf.ba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/Query.class */
public class Query implements Parcelable, k, com.google.android.apps.gsa.shared.util.debug.a.a {
    public final long A;
    public final LatencyEvents B;
    public final long C;
    public final long D;
    public final long E;
    public final int F;
    public final long G;
    public final long H;
    public final long I;
    public final String J;
    public final HotwordResultMetadata K;
    public final String L;
    public final String M;
    public final String N;
    public final or O;
    public final int P;
    public final com.google.android.apps.gsa.shared.search.a.b Q;
    private final String S;
    private final String T;
    private final int U;
    public final long d;
    public final long e;
    public final QueryTriggerType f;
    public final CharSequence g;
    public final String h;
    public final String i;
    public final fl j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final String p;
    public final fu q;
    public final long r;
    public final Long s;
    public final byte[] t;
    public final gd u;
    public final int v;
    public final Bundle w;
    public final Uri x;
    public final int y;
    public final boolean z;

    /* renamed from: a, reason: collision with root package name */
    public static final j f1478a = j.i("com.google.android.apps.gsa.shared.search.Query");
    private static final ThreadLocal R = new ThreadLocal();

    @Deprecated
    public static volatile Query b = new Query();
    public static final Parcelable.Creator CREATOR = new h(1);
    public static final com.google.android.apps.gsa.shared.s.a c = new com.google.android.apps.gsa.shared.s.a(new e());

    public Query() {
        this(0L, 0L, "", null, null, null, 0, 0, 0, null, null, 0L, null, null, null, null, null, 0L, new LatencyEvents(0L, 0L, 0L, 0L, 0L), 0L, 0L, 0L, 0, 0L, 0L, 0L, 0, false, QueryTriggerType.USER, 0, null, null, null, null, null, null, null, 1, null, 0, com.google.android.apps.gsa.shared.search.a.b.f1481a);
        ba createBuilder = d.f1483a.createBuilder();
        createBuilder.copyOnWrite();
        d dVar = (d) createBuilder.instance;
        dVar.b |= 32;
        dVar.e = "web";
        ba createBuilder2 = com.google.android.apps.gsa.shared.search.a.b.f1481a.createBuilder(this.Q);
        createBuilder2.copyOnWrite();
        com.google.android.apps.gsa.shared.search.a.b bVar = (com.google.android.apps.gsa.shared.search.a.b) createBuilder2.instance;
        d dVar2 = (d) createBuilder.build();
        dVar2.getClass();
        bVar.f = dVar2;
        bVar.b |= 8;
        this.Q = (com.google.android.apps.gsa.shared.search.a.b) createBuilder2.build();
    }

    public Query(long j, long j2, CharSequence charSequence, fl flVar, String str, String str2, int i, int i2, int i3, String str3, Map map, long j3, Long l, byte[] bArr, gd gdVar, Bundle bundle, Uri uri, long j4, LatencyEvents latencyEvents, long j5, long j6, long j7, int i4, long j8, long j9, long j10, int i5, boolean z, QueryTriggerType queryTriggerType, int i6, String str4, String str5, HotwordResultMetadata hotwordResultMetadata, String str6, String str7, String str8, or orVar, int i7, String str9, int i8, com.google.android.apps.gsa.shared.search.a.b bVar) {
        this.d = j;
        this.e = j2;
        charSequence = charSequence == null ? "" : charSequence;
        this.g = charSequence;
        this.j = flVar;
        this.k = str;
        if (str == null || !str.contains("#")) {
            this.S = str;
        } else {
            this.S = str.split("#")[0];
        }
        this.l = str2;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = str3;
        if (map == null) {
            this.q = nn.a;
        } else if (map instanceof fu) {
            this.q = (fu) map;
        } else {
            this.q = fu.k(map);
        }
        this.r = j3;
        this.s = l;
        this.t = bArr;
        this.u = gdVar;
        this.w = bundle;
        this.x = uri;
        this.y = i5;
        this.z = z;
        this.A = j4;
        this.B = latencyEvents;
        this.C = j5;
        this.D = j6;
        this.E = j7;
        this.F = i4;
        this.G = j8;
        this.I = j10;
        this.f = queryTriggerType;
        this.v = i6;
        this.J = str4;
        this.h = str5;
        this.K = hotwordResultMetadata;
        this.L = str6;
        long j11 = 0;
        if (j9 != 0) {
            j11 = j9;
        } else if (j3 != 0) {
            j11 = j3;
        }
        this.H = j11;
        this.i = charSequence.length() == 0 ? charSequence.toString() : com.google.android.libraries.gsa.util.d.d(charSequence);
        this.M = str7;
        this.N = str8;
        this.O = orVar;
        this.U = i7;
        this.T = str9;
        this.P = i8;
        this.Q = bVar;
    }

    public static Query P(b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        bVar.J(1);
        bVar.d(131072L, 0L);
        bVar.d(2199023255552L, 0L);
        bVar.d(8192L, 0L);
        bVar.d(512L, 0L);
        bVar.d(137438953472L, 0L);
        bVar.d(281474976710656L, 0L);
        bVar.e(16L, 0L);
        bVar.e(16384L, 0L);
        bVar.A(-2, -2);
        bVar.d(16384L, true != z ? 0L : 16384L);
        bVar.d(2097152L, true != z2 ? 0L : 2097152L);
        bVar.d(134217728L, true != z4 ? 0L : 134217728L);
        bVar.d(128L, true != z5 ? 0L : 128L);
        bVar.d(549755813888L, true != z3 ? 0L : 549755813888L);
        bVar.d(1024L, true != z6 ? 1024L : 0L);
        bVar.e(4096L, true != z6 ? 0L : 4096L);
        bVar.h();
        bVar.L(0);
        bVar.y(null);
        bVar.k = null;
        bVar.B = true;
        if (bVar.t) {
            ab abVar = com.google.common.f.a.e.a;
        } else {
            ab abVar2 = com.google.common.f.a.e.a;
            bVar.w(null, 0, false);
        }
        Bundle bundle = bVar.q;
        if (bundle != null) {
            if (bundle.containsKey("android.opa.extra.CONVERSATION_DELTA")) {
                bVar.q.remove("android.opa.extra.CONVERSATION_DELTA");
            }
            if (bVar.q.containsKey("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
                bVar.q.remove("android.opa.extra.QUERY_INITIATED_BY_NGA");
            }
            if (bVar.q.containsKey("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI")) {
                bVar.q.remove("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI");
            }
            if (bVar.q.containsKey("android.opa.extra.AUDIO_SESSION_ID")) {
                bVar.q.remove("android.opa.extra.AUDIO_SESSION_ID");
            }
        }
        return bVar.a();
    }

    public static boolean aY(Query query, Query query2) {
        boolean z;
        if (query.aI() == null) {
            if (query2.aI() != null) {
                return false;
            }
        } else if (!query.aI().equals(query2.aI())) {
            return false;
        }
        CharSequence charSequence = query.g;
        CharSequence charSequence2 = query2.g;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = length;
        if (length == 0) {
            if (length2 == 0) {
                z = true;
                return z;
            }
            i = 0;
        }
        int a2 = com.google.android.libraries.gsa.util.d.a(charSequence, 0, i);
        int a3 = com.google.android.libraries.gsa.util.d.a(charSequence2, 0, length2);
        if (a2 >= 0) {
            int i2 = a3;
            if (a3 < 0) {
                z = false;
            } else {
                while (a2 >= 0 && i2 >= 0) {
                    if (Character.toLowerCase(charSequence.charAt(a2)) != Character.toLowerCase(charSequence2.charAt(i2))) {
                        z = false;
                        break;
                    }
                    a2 = com.google.android.libraries.gsa.util.d.a(charSequence, a2 + 1, i);
                    i2 = com.google.android.libraries.gsa.util.d.a(charSequence2, i2 + 1, length2);
                }
                z = false;
                if (a2 < 0) {
                    if (i2 >= 0) {
                        z = false;
                    } else {
                        if (Character.isWhitespace(charSequence.charAt(i - 1)) == Character.isWhitespace(charSequence2.charAt(length2 - 1))) {
                            return true;
                        }
                        z = false;
                    }
                }
            }
        } else {
            if (a3 < 0) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public static boolean cQ(CharSequence charSequence, int i) {
        if (i != -2) {
            return i >= 0 && i <= charSequence.length();
        }
        return true;
    }

    private final String ds() {
        ArrayList arrayList = new ArrayList();
        if (bf()) {
            arrayList.add("action-expected");
        }
        if (bi()) {
            arrayList.add("assist");
        }
        if (bk()) {
            arrayList.add("auto-retried");
        }
        if (bm()) {
            arrayList.add("captcha-requested");
        }
        if (bp()) {
            arrayList.add("device-triggered");
        }
        if (bq()) {
            arrayList.add("dialog-turn");
        }
        if (br()) {
            arrayList.add("direct-embedded");
        }
        if (bt()) {
            arrayList.add("embedded-text");
        }
        if (bu()) {
            arrayList.add("embedded-voice");
        }
        if (TextUtils.isEmpty(aO())) {
            arrayList.add("empty-suggest");
        }
        if (bv()) {
            arrayList.add("external-audio");
        }
        if (bw()) {
            arrayList.add("eyes-free");
        }
        if (bE()) {
            arrayList.add("back-stack");
        }
        if (bF()) {
            arrayList.add("barge-in");
        }
        if (bI()) {
            arrayList.add("now-screen");
        }
        if (bJ()) {
            arrayList.add("opa");
        }
        if (bH()) {
            arrayList.add("gmm");
        }
        if (bS()) {
            arrayList.add("gearhead");
        }
        if (bT()) {
            arrayList.add("gearhead-demand-space");
        }
        if (bV()) {
            arrayList.add("hybrid-query");
        }
        if (bZ()) {
            arrayList.add("md-hotword-detection");
        }
        if (cc()) {
            arrayList.add("native-music-with-mid");
        }
        if (ck()) {
            arrayList.add("query-text-from-voice");
        }
        if (this.z) {
            arrayList.add("reopen-for-followon");
        }
        if (cm()) {
            arrayList.add("restored-state");
        }
        if (cn()) {
            arrayList.add("rewritten");
        }
        if (cp()) {
            arrayList.add("secondary-search");
        }
        if (cr()) {
            arrayList.add("speech-endpointing");
        }
        if (cN()) {
            arrayList.add("untrusted");
        }
        if (cV()) {
            arrayList.add("voice-unlock");
        }
        if (this.f == QueryTriggerType.UNIFIED_IME) {
            arrayList.add("unified-ime");
        }
        if (this.f == QueryTriggerType.VOICE_IME) {
            arrayList.add("voice-ime");
        }
        if (cY()) {
            arrayList.add("full-srp");
        }
        if (cZ()) {
            arrayList.add("opaque-actions");
        }
        if (dd()) {
            arrayList.add("play-tts");
        }
        if ((this.d & 512) != 0) {
            arrayList.add("resend-last-recording");
        }
        if (dg()) {
            arrayList.add("search-graph");
        }
        if (bM()) {
            arrayList.add("pixel-launcher-apps-search");
        }
        if (bL()) {
            arrayList.add("pixel-launcher-all-apps-search");
        }
        return new ap(", ").d(arrayList);
    }

    private static String dt(int i) {
        return i != -2 ? Integer.toString(i) : "end";
    }

    private final String du() {
        QueryTriggerType queryTriggerType = QueryTriggerType.USER;
        QueryTriggerType queryTriggerType2 = this.f;
        int ordinal = queryTriggerType2.ordinal();
        if (ordinal == 37) {
            return "opa-srp-result-click";
        }
        if (ordinal == 42) {
            return "inspire-refresh";
        }
        switch (ordinal) {
            case 0:
                return "user";
            case 1:
                return "intent";
            case 2:
                return "prefetch";
            case 3:
                return "predictive";
            case 4:
                return "webview";
            case 5:
                return "hotword";
            case 6:
                return "bthandsfree";
            case 7:
                return "wiredheadset";
            case 8:
                return "follow-on";
            case 9:
                return "history-refresh";
            case 10:
                return "corpus-selector";
            case 11:
                return "conversational-follow-on";
            case 12:
                return "doodle";
            default:
                switch (ordinal) {
                    case 15:
                        return "proxy-voice-button";
                    case 16:
                        return "action-escape-hatch";
                    case 17:
                        return "intent-api";
                    default:
                        switch (ordinal) {
                            case 19:
                                return "voice-action";
                            case 20:
                                return "music-search-intent";
                            case 21:
                                return "bisto";
                            case 22:
                                return "gearhead-screen-mic";
                            case 23:
                                return "gearhead-controller";
                            case 24:
                                return "gearhead-hardware-mic";
                            case 25:
                                return "gearhead-direct-action";
                            case 26:
                                return "unified-ime";
                            case 27:
                                return "voice-ime";
                            case 28:
                                return "opa-suggestion-chip";
                            case 29:
                                return "opa-text-editor";
                            case 30:
                                return "opa-hq-suggestion-chip";
                            case 31:
                                return "opa-proactive-notification";
                            default:
                                return a.a.eg(queryTriggerType2, "unknown(", ")");
                        }
                }
        }
    }

    private final String dv() {
        long j = this.d & 15;
        return j == 0 ? "text" : j == 1 ? "voice" : j == 2 ? "music" : j == 3 ? "sentinel" : j == 6 ? "notificationAnnouncement" : j == 10 ? "networkTtsRequest" : j == 11 ? "localTtsRequest" : j == 7 ? "transcription" : j == 9 ? "assistData" : j == 12 ? "lobby" : a.a.dZ(j, "unknown(", ")");
    }

    private static String dw(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private static void dx(f fVar, String str, String str2) {
        if (str2 != null) {
            fVar.b(str).a(new com.google.android.apps.gsa.shared.util.b.d(str2, false));
        }
    }

    private static void dy(f fVar, String str, String str2) {
        if (str2 != null) {
            fVar.b(str).a(com.google.android.apps.gsa.shared.util.b.e.c(str2));
        }
    }

    public final Query A(int i, boolean z, QueryTriggerType queryTriggerType) {
        b j = j();
        j.J(i);
        j.d(0L, 562949953421312L);
        j.d(131072L, 0L);
        j.d(2199023255552L, 0L);
        j.d(8192L, 0L);
        j.d(512L, 0L);
        j.A(-2, -2);
        j.d(16384L, 0L);
        j.d(2097152L, 0L);
        j.L(0);
        j.y(null);
        if (queryTriggerType != null) {
            j.I(queryTriggerType);
        }
        if (z) {
            j.d(0L, 1024L);
        }
        return j.a();
    }

    public final Query B() {
        return x().z(true);
    }

    public final Query C() {
        b j = j();
        j.g();
        j.j();
        j.d(1024L, 0L);
        j.P();
        j.G(SystemClock.elapsedRealtime());
        j.O();
        return j.a();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.k
    public final String D() {
        return "Velvet.Query";
    }

    public final Query E(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        b j = j();
        j.J(11);
        j.d(0L, 1024L);
        j.o(bundle);
        return j.a();
    }

    public final Query F(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        b j = j();
        j.J(10);
        j.d(0L, 1024L);
        j.o(bundle);
        return j.a();
    }

    public final Query G() {
        b j = j();
        j.j();
        return j.a();
    }

    public final Query H() {
        b j = j();
        j.g();
        j.j();
        j.d(0L, 8192L);
        j.O();
        return j.a();
    }

    public final Query I() {
        b j = j();
        j.J(3);
        return j.a();
    }

    public final Query J(boolean z) {
        Query a2;
        if (z) {
            b j = j();
            j.d(0L, 16384L);
            a2 = j.a();
        } else {
            b j2 = j();
            j2.d(16384L, 0L);
            a2 = j2.a();
        }
        return a2;
    }

    public final Query K(boolean z) {
        b j = j();
        j.d(140737488355328L, true != z ? 140737488355328L : 0L);
        return j.a();
    }

    public final Query L() {
        b j = j();
        j.J(0);
        return j.a();
    }

    public final Query M(boolean z) {
        com.google.android.apps.gsa.d.e.e(6);
        return A(0, z, null);
    }

    public final Query N(boolean z, QueryTriggerType queryTriggerType) {
        com.google.android.apps.gsa.d.e.e(7);
        return A(0, z, queryTriggerType);
    }

    public final Query O() {
        b j = j();
        j.d(0L, 2147483648L);
        j.t(this.k);
        return j.a();
    }

    public final Query Q() {
        b j = j();
        j.O();
        j.d(9007199254740992L, 0L);
        j.d(35184372088832L, 0L);
        j.E(0);
        if (ba("android.speech.extra.ACTION_DATA")) {
            Bundle bundle = new Bundle(this.w);
            bundle.remove("android.speech.extra.ACTION_DATA");
            j.o(bundle);
        }
        return P(j, bw(), bS(), bT(), bg(), cv(), cz()).aC(QueryTriggerType.FOLLOW_ON);
    }

    public final Query R() {
        return P(j(), bw(), bS(), bT(), bg(), cv(), cz()).aC(QueryTriggerType.CONVERSATIONAL_FOLLOW_ON);
    }

    public final Query S() {
        return P(j(), false, false, false, false, false, false).aC(QueryTriggerType.USER);
    }

    public final Query T() {
        return P(j(), false, false, false, false, false, false).aC(QueryTriggerType.HOTWORD);
    }

    public final Query U(Uri uri, int i, boolean z) {
        b j = j();
        j.J(1);
        j.d(512L, 0L);
        j.w(uri, i, z);
        j.y(null);
        return j.a();
    }

    public final Query V(int i) {
        b j = j();
        if (j.O != i) {
            j.O = i;
            j.B = true;
        }
        return j.a();
    }

    public final Query W() {
        b j = j();
        j.e(0L, 2L);
        j.d(0L, 16384L);
        return j.a();
    }

    public final Query X(String str, boolean z) {
        b j = j();
        if (j.q == null) {
            j.q = new Bundle();
        }
        j.q.putBoolean(str, z);
        j.B = true;
        return j.a();
    }

    public final Query Y(String str, byte[] bArr) {
        b j = j();
        j.k(str, bArr);
        return j.a();
    }

    public final Query Z(byte[] bArr) {
        b j = j();
        j.k("android.opa.extra.CONVERSATION_DELTA", bArr);
        return j.a();
    }

    public final int a(String str) {
        Bundle bundle = this.w;
        if (bundle != null) {
            return bundle.getInt(str, 0);
        }
        return 0;
    }

    public final Query aA() {
        b j = j();
        j.d(0L, 72057594037927936L);
        return j.a();
    }

    public final Query aB(boolean z) {
        if (z) {
            b j = j();
            j.d(0L, 128L);
            return j.a();
        }
        b j2 = j();
        j2.d(128L, 0L);
        return j2.a();
    }

    public final Query aC(QueryTriggerType queryTriggerType) {
        b j = j();
        j.I(queryTriggerType);
        return j.a();
    }

    public final Query aD() {
        b j = j();
        j.e(0L, 32L);
        return j.a();
    }

    public final Query aE(byte[] bArr) {
        b j = j();
        j.K(bArr);
        return j.a();
    }

    public final Query aF(int i) {
        cl.u(cS());
        b j = j();
        j.L(i);
        return j.a();
    }

    public final Query aG(boolean z) {
        if (z) {
            b j = j();
            j.d(0L, 274877906944L);
            return j.a();
        }
        b j2 = j();
        j2.d(274877906944L, 0L);
        return j2.a();
    }

    public final Query aH(String str) {
        b j = j();
        j.M(str);
        return j.a();
    }

    public final String aI() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        return dVar2.e;
    }

    public final String aJ(String str) {
        Bundle bundle = this.w;
        if (bundle != null) {
            return bundle.getString(str, null);
        }
        return null;
    }

    public final String aK() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 256) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.g;
    }

    public final String aL() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 128) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.f;
    }

    public final String aM() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 1024) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.i;
    }

    public final String aN() {
        return (String) at.j(aJ("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME")).a(at.j(aJ("android.opa.extra.FOREGROUND_APP_TRIGGERED_ON"))).f();
    }

    public final String aO() {
        return this.g.length() == 0 ? this.g.toString() : com.google.android.libraries.gsa.util.d.e(this.g);
    }

    public final String aP() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 512) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.h;
    }

    public final String aQ() {
        com.google.android.apps.gsa.shared.search.a.b bVar = this.Q;
        if ((bVar.b & 16) != 0) {
            return bVar.g;
        }
        return null;
    }

    public final String aR() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 2048) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.j;
    }

    public final String aS() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 1) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.c;
    }

    public final String aT() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 4096) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.k;
    }

    public final String aU() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        if ((dVar2.b & 2) == 0) {
            return null;
        }
        d dVar3 = this.Q.f;
        d dVar4 = dVar3;
        if (dVar3 == null) {
            dVar4 = d.f1483a;
        }
        return dVar4.d;
    }

    public final String aV(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (equals(b)) {
            return "Query[EMPTY]";
        }
        String aJ = aJ("android.search.extra.PARENT_EVENT_ID");
        LatencyEvents latencyEvents = this.B;
        StringBuilder sb = new StringBuilder("{");
        ap c2 = ap.c(',');
        an anVar = new an(c2, c2);
        long j = latencyEvents.f1469a;
        String str5 = null;
        String dT = j != 0 ? a.a.dT(j, "applicationCreate=") : null;
        long j2 = latencyEvents.b;
        String dT2 = j2 != 0 ? a.a.dT(j2, "newSearchIntent=") : null;
        long j3 = latencyEvents.d;
        String dT3 = j3 != 0 ? a.a.dT(j3, "activityCreate=") : null;
        long j4 = latencyEvents.e;
        String dT4 = j4 != 0 ? a.a.dT(j4, "queryEntryBegin=") : null;
        long j5 = latencyEvents.c;
        if (j5 != 0) {
            str5 = a.a.dT(j5, "externalSearchIntent=");
        }
        anVar.g(sb, new ao(new Object[]{dT3, dT4, str5}, dT, dT2));
        sb.append('}');
        String sb2 = sb.toString();
        String dv = dv();
        String du = du();
        String obj2 = obj.toString();
        String aI = aI();
        int i = this.o;
        long j6 = this.r;
        Long l = this.s;
        if (l != null) {
            Objects.toString(l);
            str = " mResendAudioRequestId=".concat(l.toString());
        } else {
            str = "";
        }
        String dt = dt(c());
        String dt2 = dt(b());
        String ds = ds();
        String concat = aR() != null ? ", source=".concat(String.valueOf(aR())) : "";
        or orVar = this.O;
        if (orVar != null) {
            str2 = ", searchClient=" + orVar.as;
        } else {
            str2 = "";
        }
        String concat2 = aS() != null ? ", stick=".concat(String.valueOf(aS())) : "";
        String concat3 = aL() != null ? ", ludocid=".concat(String.valueOf(aL())) : "";
        String concat4 = aJ != null ? ", ei=".concat(aJ) : "";
        String concat5 = aK() != null ? ", immersiveBasePage=".concat(String.valueOf(aK())) : "";
        String concat6 = aM() != null ? ", miniappLandingPage=".concat(String.valueOf(aM())) : "";
        String str6 = true != ci() ? "" : ", ignore prefetching";
        String concat7 = aP() != null ? ", richCardImmersiveVertical=".concat(String.valueOf(aP())) : "";
        String concat8 = !this.q.isEmpty() ? ", persist-cgi-parameters=".concat(String.valueOf(String.valueOf(this.q))) : "";
        Uri uri = this.x;
        String concat9 = uri != null ? ", recording-uri=".concat(uri.toString()) : "";
        int i2 = this.y;
        String dA = i2 != 0 ? a.a.dA(i2, ", audio-sampling-rate=") : "";
        if (be()) {
            str3 = ", submission-time=" + this.A;
        } else {
            str3 = "";
        }
        String concat10 = sb2.length() > 2 ? ", latency-events=".concat(sb2) : "";
        if (bd()) {
            str4 = ", submission-elapsed-time=" + this.C;
        } else {
            str4 = "";
        }
        int i3 = this.v;
        String dA2 = i3 != 0 ? a.a.dA(i3, ", speechie-mode=") : "";
        long j7 = this.D;
        String dT5 = j7 > 0 ? a.a.dT(j7, ", speech-duration-ms=") : "";
        int i4 = this.F;
        String dA3 = i4 != 0 ? a.a.dA(i4, ", uiToLaunchForVoiceSearch=") : "";
        String str7 = this.k;
        String concat11 = str7 != null ? ", original-url=".concat(str7) : "";
        String str8 = this.l;
        String concat12 = str8 != null ? ", non-search-url=".concat(str8) : "";
        String concat13 = aU() != null ? ", fragment=".concat(String.valueOf(aU())) : "";
        String str9 = this.p;
        String concat14 = str9 != null ? ", PageToken=".concat(str9) : "";
        String str10 = this.J;
        String concat15 = str10 != null ? ", LanguageOverride=".concat(str10) : "";
        String str11 = this.h;
        String concat16 = str11 != null ? ", Mid=".concat(str11) : "";
        HotwordResultMetadata hotwordResultMetadata = this.K;
        String concat17 = hotwordResultMetadata != null ? ", hotwordMetadata=".concat(hotwordResultMetadata.toString()) : "";
        String str12 = this.L;
        String concat18 = str12 != null ? ", toolbeltState=".concat(str12) : "";
        String concat19 = aT() != null ? ", ved=".concat(String.valueOf(aT())) : "";
        String concat20 = aQ() != null ? ", sessionType=".concat(String.valueOf(aQ())) : "";
        String str13 = this.N;
        String concat21 = str13 != null ? ", seiParamForLocationPromptReload=".concat(str13) : "";
        String str14 = true != ba("android.opa.extra.CONVERSATION_DELTA") ? "" : ", has ConversationDelta";
        byte[] dl = dl();
        boolean bN = bN();
        StringBuilder sb3 = new StringBuilder("Query[");
        sb3.append(dv);
        sb3.append(" from ");
        sb3.append(du);
        sb3.append(": \"");
        sb3.append(obj2);
        sb3.append("\"/");
        sb3.append(aI);
        sb3.append("@");
        sb3.append(i);
        sb3.append(" CID=");
        sb3.append(j6);
        sb3.append(str);
        sb3.append(", sel-");
        sb3.append(dt);
        sb3.append(":");
        sb3.append(dt2);
        sb3.append(", ");
        sb3.append(ds);
        sb3.append(concat);
        sb3.append(str2);
        sb3.append(concat2);
        sb3.append(concat3);
        sb3.append(concat4);
        sb3.append(concat5);
        sb3.append(concat6);
        sb3.append(str6);
        sb3.append(concat7);
        sb3.append(concat8);
        sb3.append(concat9);
        sb3.append(dA);
        sb3.append(str3);
        sb3.append(concat10);
        sb3.append(str4);
        sb3.append(dA2);
        sb3.append(dT5);
        sb3.append(dA3);
        sb3.append(concat11);
        sb3.append(concat12);
        sb3.append(concat13);
        sb3.append(concat14);
        sb3.append(concat15);
        sb3.append(concat16);
        sb3.append(concat17);
        sb3.append(concat18);
        sb3.append(concat19);
        sb3.append(concat20);
        sb3.append(concat21);
        sb3.append(str14);
        sb3.append(dl != null ? ", has SuggestionsParams" : "");
        sb3.append("] is from QSB? ");
        sb3.append(bN);
        return sb3.toString();
    }

    public final boolean aW() {
        boolean z = true;
        if (!bq()) {
            z = true;
            if (!bJ()) {
                if (!cf()) {
                    z = false;
                } else {
                    if (!ba("android.speech.extra.ACTION_DATA")) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean aX() {
        return (cx() && this.i.isEmpty()) ? false : true;
    }

    public final boolean aZ(String str) {
        Bundle bundle = this.w;
        return bundle != null && bundle.getBoolean(str, false);
    }

    public final Query aa(String str) {
        b j = j();
        Bundle h = h();
        Bundle bundle = h;
        if (h == null) {
            bundle = new Bundle();
        }
        bundle.putString("android.search.extra.EVENT_ID", str);
        j.o(bundle);
        j.C = true;
        return j.a();
    }

    public final Query ab(Bundle bundle) {
        b j = j();
        j.o(bundle);
        j.t(this.k);
        return j.a();
    }

    public final Query ac() {
        b j = j();
        j.e(0L, 2048L);
        j.e(0L, 2L);
        j.d(16384L, 0L);
        return j.a();
    }

    public final Query ad() {
        b j = j();
        j.d(0L, 2097152L);
        j.d(0L, 16384L);
        return j.a();
    }

    public final Query ae(HotwordResultMetadata hotwordResultMetadata) {
        b j = j();
        HotwordResultMetadata hotwordResultMetadata2 = j.J;
        boolean z = true;
        if (hotwordResultMetadata2 != null) {
            z = !hotwordResultMetadata2.equals(hotwordResultMetadata);
        }
        j.B = z;
        j.J = hotwordResultMetadata;
        return j.a();
    }

    public final Query af(String str, int i) {
        b j = j();
        j.l(str, i);
        return j.a();
    }

    public final Query ag(String str) {
        b j = j();
        j.q(str);
        return j.a();
    }

    public final Query ah(String str, long j) {
        b j2 = j();
        if (j2.q == null) {
            j2.q = new Bundle();
        }
        j2.q.putLong(str, j);
        j2.B = true;
        return j2.a();
    }

    public final Query ai() {
        b j = j();
        j.d(0L, 1152921504606846976L);
        return j.a();
    }

    @Deprecated
    public final Query aj(String str, Bundle bundle) {
        Bundle h = h();
        Bundle bundle2 = h;
        if (h == null) {
            bundle2 = new Bundle();
        }
        bundle2.putAll(bundle);
        boolean z = true;
        bundle2.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        b j = j();
        j.C(str, false);
        j.z(or.m);
        j.o(bundle2);
        Uri uri = (Uri) bundle.getParcelable("android.speech.extra.AUDIO_CONTENT_URI");
        if (uri != null) {
            int i = bundle.getInt("android.speech.extra.AUDIO_FREQUENCY");
            if (i == 0) {
                z = false;
            }
            androidx.compose.ui.l.f.f(z, "Please set audioFrequency");
            j.w(uri, i, false);
        }
        return j.a();
    }

    public final Query ak() {
        b j = j();
        j.d(0L, 1073741824L);
        j.t(this.k);
        return j.a();
    }

    public final Query al(String str, g gVar) {
        b j = j();
        j.J(0);
        j.v(gVar.a);
        int length = gVar.a.length();
        j.A(length, length);
        d dVar = (d) j.Q.instance;
        int i = dVar.b;
        String str2 = dVar.e;
        boolean z = (i & 32) != 0;
        String str3 = gVar.b;
        if (b.c(z, str2, str3)) {
            j.B = true;
            j.b();
            j.J(0);
        }
        if (str3 != null) {
            ba baVar = j.Q;
            baVar.copyOnWrite();
            d dVar2 = (d) baVar.instance;
            dVar2.b |= 32;
            dVar2.e = str3;
        } else {
            ba baVar2 = j.Q;
            baVar2.copyOnWrite();
            d dVar3 = (d) baVar2.instance;
            dVar3.b &= -33;
            dVar3.e = d.f1483a.e;
        }
        int i2 = gVar.c;
        if (i2 != j.j) {
            j.b();
            j.J(0);
            j.j = i2;
            j.B = true;
        }
        j.F(gVar.d);
        String str4 = gVar.e;
        j.B |= !TextUtils.equals(j.K, str4);
        j.K = str4;
        j.u(gVar.f);
        j.q(gVar.g);
        j.t(str);
        j.N(gVar.k);
        j.d(137438953472L, 0L);
        j.h();
        if (gVar.h) {
            j.d(0L, 1125899906842624L);
        }
        if (gVar.i) {
            j.d(0L, 536870912L);
            j.e(0L, 72057594037927936L);
            j.l("query-header-visibility", 2);
        } else if (gVar.j) {
            j.d(0L, 536870912L);
            j.l("query-header-visibility", 1);
        } else {
            j.d(536870912L, 0L);
            j.e(72057594037927936L, 0L);
            j.f("query-header-visibility");
        }
        return j.a();
    }

    public final Query am(Map map) {
        b j = j();
        j.u(map);
        return j.a();
    }

    public final Query an() {
        b j = j();
        j.e(0L, 4194304L);
        return j.a();
    }

    public final Query ao(CharSequence charSequence, fl flVar, long j, boolean z) {
        b j2 = j();
        j2.v(charSequence);
        if (!h.a.a.p.b.a.f.f(flVar, j2.e)) {
            j2.e = flVar;
            j2.B = true;
        }
        j2.D(j);
        j2.A(-2, -2);
        j2.d(0L, (true != z ? 0L : 17179869184L) | 2048);
        j2.z(this.O);
        j2.I(this.f);
        return j2.a();
    }

    public final Query ap(long j) {
        androidx.compose.ui.l.f.e(j != 0);
        b j2 = j();
        j2.x(j);
        j2.e(0L, 1024L);
        return j2.a();
    }

    public final Query aq(or orVar) {
        b j = j();
        j.z(orVar);
        return j.a();
    }

    public final Query ar(boolean z) {
        if (z) {
            b j = j();
            j.d(0L, 144115188075855872L);
            j.t(this.k);
            return j.a();
        }
        b j2 = j();
        j2.d(144115188075855872L, 0L);
        j2.t(this.k);
        return j2.a();
    }

    public final Query as(String str) {
        b j = j();
        j.B(str);
        return j.a();
    }

    public final Query at(String str) {
        b j = j();
        j.C(str, false);
        j.t(this.k);
        return j.a();
    }

    public final Query au(int i) {
        b j = j();
        j.E(i);
        return j.a();
    }

    public final Query av() {
        b j = j();
        j.d(0L, 4194304L);
        return j.a();
    }

    public final Query aw(String str, String str2) {
        b j = j();
        if (j.q == null) {
            j.q = new Bundle();
        }
        j.q.putString(str, str2);
        j.B = true;
        return j.a();
    }

    public final Query ax(long j) {
        b j2 = j();
        j2.G(j);
        return j2.a();
    }

    public final Query ay(long j) {
        b j2 = j();
        j2.H(j);
        return j2.a();
    }

    public final Query az(Map map) {
        b j = j();
        Bundle h = h();
        Bundle bundle = h;
        if (h == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("android.search.extra.SUGGEST_CGI_PARAMETERS", ar.d(map));
        j.o(bundle);
        return j.a();
    }

    public final int b() {
        int i = this.n;
        int i2 = i;
        if (i == -2) {
            i2 = this.g.length();
        }
        return i2;
    }

    public final boolean bA() {
        return (this.d & 36028797018963968L) != 0;
    }

    public final boolean bB() {
        return this.f == QueryTriggerType.ACTION_ESCAPE_HATCH;
    }

    public final boolean bC(fl flVar, fl flVar2) {
        return flVar.isEmpty() ? !flVar2.contains(aR()) : flVar.contains(aR());
    }

    public final boolean bD() {
        long j = this.d;
        return ((562949953421312L & j) == 0 || (j & 134217728) == 0) ? false : true;
    }

    public final boolean bE() {
        return (this.d & 131072) != 0;
    }

    public final boolean bF() {
        return (this.d & 2251799813685248L) != 0;
    }

    public final boolean bG() {
        return (this.d & 2199023255552L) != 0;
    }

    public final boolean bH() {
        return (this.e & 8) != 0;
    }

    public final boolean bI() {
        return (this.d & 18014398509481984L) != 0;
    }

    public final boolean bJ() {
        long j = this.d;
        return (562949953421312L & j) != 0 && (j & 134217728) == 0;
    }

    public final boolean bK() {
        return (this.d & 562949953421312L) != 0 && bH();
    }

    public final boolean bL() {
        return (this.e & 64) != 0;
    }

    public final boolean bM() {
        return (this.d & 262144) != 0;
    }

    public final boolean bN() {
        return (this.d & 2305843009213693952L) != 0;
    }

    public final boolean bO() {
        return (this.d & 8589934592L) != 0;
    }

    public final boolean bP() {
        return (this.e & 524288) != 0;
    }

    public final boolean bQ() {
        return (this.e & 1048576) != 0;
    }

    public final boolean bR() {
        return (this.e & 2048) != 0;
    }

    public final boolean bS() {
        return (this.d & 2097152) != 0;
    }

    public final boolean bT() {
        return (this.d & 549755813888L) != 0;
    }

    public final boolean bU() {
        return this.f == QueryTriggerType.HISTORY_REFRESH;
    }

    public final boolean bV() {
        return (this.d & 9007199254740992L) != 0;
    }

    public final boolean bW() {
        return (this.e & 72057594037927936L) != 0;
    }

    public final boolean bX() {
        return (this.d & 15) == 12;
    }

    public final boolean bY() {
        long j = this.d & 15;
        return j == 11 || j == 10;
    }

    public final boolean bZ() {
        return (this.d & 1152921504606846976L) != 0;
    }

    public final boolean ba(String str) {
        Bundle bundle = this.w;
        return bundle != null && bundle.containsKey(str);
    }

    public final boolean bb() {
        return (this.e & 2097152) != 0;
    }

    public final boolean bc() {
        return this.x != null;
    }

    public final boolean bd() {
        return this.C > 0;
    }

    public final boolean be() {
        return this.A > 0;
    }

    public final boolean bf() {
        return (this.d & 4294967296L) != 0;
    }

    public final boolean bg() {
        return (this.d & 134217728) != 0;
    }

    public final boolean bh() {
        return aI().equals("web.app");
    }

    public final boolean bi() {
        return (!de() || cY() || ca() || cq() || cK() || bw() || bp() || df()) ? false : true;
    }

    public final boolean bj() {
        return (this.d & 15) == 9;
    }

    public final boolean bk() {
        return (this.d & 137438953472L) != 0;
    }

    public final boolean bl() {
        return (this.e & 2) != 0;
    }

    public final boolean bm() {
        return (this.d & 16777216) != 0;
    }

    public final boolean bn() {
        return (this.e & 65536) != 0;
    }

    public final boolean bo() {
        return this.f == QueryTriggerType.CONVERSATIONAL_FOLLOW_ON;
    }

    public final boolean bp() {
        return (this.d & 4503599627370496L) != 0;
    }

    public final boolean bq() {
        return cS() || bp() || cs();
    }

    public final boolean br() {
        return (!bV() && bu()) || bt();
    }

    public final boolean bs() {
        return bt() || bu();
    }

    public final boolean bt() {
        return (this.d & 68719476736L) != 0;
    }

    public final boolean bu() {
        return (this.d & 17179869184L) != 0;
    }

    public final boolean bv() {
        return (this.d & 33554432) != 0;
    }

    public final boolean bw() {
        return (this.d & 16384) != 0;
    }

    public final boolean bx() {
        return this.f == QueryTriggerType.FOLLOW_ON;
    }

    public final boolean by() {
        return (this.e & 8192) != 0;
    }

    public final boolean bz() {
        return (this.d & 281474976710656L) != 0;
    }

    public final int c() {
        int i = this.m;
        int i2 = i;
        if (i == -2) {
            i2 = this.g.length();
        }
        return i2;
    }

    public final boolean cA() {
        return (this.d & 15) == 7;
    }

    public final boolean cB() {
        return this.f == QueryTriggerType.BISTO;
    }

    public final boolean cC() {
        return this.f == QueryTriggerType.BT_HEADSET_BUTTON;
    }

    public final boolean cD() {
        return this.f == QueryTriggerType.CORPUS_SELECTOR;
    }

    public final boolean cE() {
        QueryTriggerType queryTriggerType = this.f;
        return queryTriggerType == QueryTriggerType.HOTWORD || queryTriggerType == QueryTriggerType.OPA_MORRIS_HOTWORD;
    }

    public final boolean cF() {
        QueryTriggerType queryTriggerType = this.f;
        return queryTriggerType == QueryTriggerType.OPA_MORRIS_HOTWORD || queryTriggerType == QueryTriggerType.OPA_MORRIS_GENERIC;
    }

    public final boolean cG() {
        return this.f == QueryTriggerType.OPA_MORRIS_HOTWORD;
    }

    public final boolean cH() {
        return this.f == QueryTriggerType.PROXY_VOICE_BUTTON;
    }

    public final boolean cI() {
        QueryTriggerType queryTriggerType = this.f;
        return queryTriggerType == QueryTriggerType.USER || queryTriggerType == QueryTriggerType.AGA_SEARCHPLATE_MIC;
    }

    public final boolean cJ() {
        return (this.e & 262144) != 0;
    }

    public final boolean cK() {
        return this.f == QueryTriggerType.WEBVIEW;
    }

    public final boolean cL() {
        return this.f == QueryTriggerType.WIRED_HEADSET_BUTTON;
    }

    public final boolean cM() {
        return (this.e & 32) != 0;
    }

    public final boolean cN() {
        return (this.d & 2147483648L) != 0;
    }

    public final boolean cO() {
        return dr() != 1;
    }

    public final boolean cP() {
        if (by()) {
            return false;
        }
        if (ca() || cS() || bJ() || ce()) {
            return true;
        }
        return (cx() && !this.i.isEmpty()) || bt();
    }

    public final boolean cR() {
        return this.f == QueryTriggerType.VOICE_ACTION;
    }

    public final boolean cS() {
        return (this.d & 15) == 1;
    }

    public final boolean cT() {
        return (this.d & 4611686018427387904L) != 0;
    }

    public final boolean cU() {
        return cS() && bJ();
    }

    public final boolean cV() {
        return (this.d & 256) != 0;
    }

    public final boolean cW() {
        return (this.e & 32768) != 0;
    }

    public final boolean cX() {
        return aI().equals("web");
    }

    public final boolean cY() {
        return (this.d & 4194304) != 0;
    }

    public final boolean cZ() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean ca() {
        return (this.d & 15) == 2;
    }

    public final boolean cb() {
        return ca() && bJ();
    }

    public final boolean cc() {
        return ((this.d & 274877906944L) == 0 || !ca() || this.h == null) ? false : true;
    }

    public final boolean cd() {
        return (this.d & 15) == 10;
    }

    public final boolean ce() {
        return (this.d & 15) == 13;
    }

    public final boolean cf() {
        return (this.d & 15) == 6;
    }

    public final boolean cg() {
        return (this.e & 16384) != 0;
    }

    public final boolean ch() {
        return (this.e & 4194304) != 0;
    }

    public final boolean ci() {
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        return dVar2.m;
    }

    public final boolean cj() {
        return (this.d & 268435456) != 0;
    }

    public final boolean ck() {
        return (this.d & 2048) != 0;
    }

    public final boolean cl() {
        return bE() || bk() || bA();
    }

    public final boolean cm() {
        return (this.d & 8192) != 0;
    }

    public final boolean cn() {
        return (this.d & 524288) != 0;
    }

    public final boolean co(Query query) {
        return this.r == query.r;
    }

    public final boolean cp() {
        return (this.d & 4096) != 0;
    }

    public final boolean cq() {
        return (this.d & 15) == 3;
    }

    public final boolean cr() {
        return (this.d & 140737488355328L) == 0;
    }

    public final boolean cs() {
        return (this.e & 16) != 0;
    }

    public final boolean ct() {
        if (bJ() || by()) {
            return false;
        }
        return ((bS() && bt()) || cg() || !cw()) ? false : true;
    }

    public final boolean cu() {
        return (!cw() && cS()) || (cb() && !cw());
    }

    public final boolean cv() {
        return (this.d & 128) != 0;
    }

    public final boolean cw() {
        boolean z = false;
        if (!this.i.isEmpty()) {
            if (cx()) {
                z = true;
            } else {
                if (cS()) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    public final boolean cx() {
        return (this.d & 15) == 0;
    }

    public final boolean cy() {
        return cx() && bJ();
    }

    public final boolean cz() {
        return (this.e & 4096) != 0;
    }

    public final boolean da() {
        return (this.d & 65536) != 0;
    }

    public final boolean db() {
        return cx() || cS() || ca();
    }

    public final boolean dc() {
        return db() && dg() && !cU();
    }

    public final boolean dd() {
        return (this.d & 1024) != 0;
    }

    public final boolean de() {
        return cX() && this.o == 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean df() {
        return bJ() || (this.d & 35184372088832L) != 0;
    }

    public final boolean dg() {
        if (ct()) {
            return true;
        }
        if (cS() && (!bJ() || (this.d & 144115188075855872L) != 0)) {
            return true;
        }
        if ((this.d & 4398046511104L) != 0) {
            boolean bJ = bJ();
            boolean z = di() && cw();
            if (!bJ && z) {
                return true;
            }
        }
        if ((this.d & 70368744177664L) == 0 || !(bS() || bT())) {
            return (ca() && !bJ()) || ce() || cg();
        }
        return true;
    }

    public final boolean dh() {
        return (this.d & 67108864) == 0;
    }

    public final boolean di() {
        return (this.d & 274877906944L) != 0;
    }

    public final byte[] dj() {
        return this.w.getByteArray("android.opa.extra.CONVERSATION_DELTA");
    }

    public final byte[] dk(String str) {
        Bundle bundle = this.w;
        if (bundle != null) {
            return bundle.getByteArray(str);
        }
        return null;
    }

    public final byte[] dl() {
        Bundle bundle = this.w;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray("android.opa.extra.SUGGESTIONS_PARAMS");
    }

    public final Query dm(Parcelable parcelable, Parcelable parcelable2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification-message", parcelable);
        bundle.putParcelable("notification-sender", parcelable2);
        b j = j();
        j.J(6);
        j.d(16384L, 16384L);
        j.d(0L, 1024L);
        j.o(bundle);
        return j.a();
    }

    public final Query dn(String str, QueryTriggerType queryTriggerType) {
        Bundle bundle = new Bundle();
        bundle.putString("application-id-override", "gearhead");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("user-agent-suffix", str);
        }
        b j = j();
        j.J(1);
        j.d(0L, 1024L);
        j.I(QueryTriggerType.USER);
        j.d(131072L, 0L);
        j.d(2199023255552L, 0L);
        j.d(8192L, 0L);
        j.d(512L, 0L);
        j.d(137438953472L, 0L);
        j.h();
        j.A(-2, -2);
        j.d(0L, 16384L);
        j.d(0L, 2097152L);
        j.d(0L, 549755813888L);
        j.L(0);
        j.y(null);
        j.I(queryTriggerType);
        j.o(bundle);
        j.s(this.B.a(0L));
        return j.a();
    }

    /* renamed from: do, reason: not valid java name */
    public final Query m577do(CharSequence charSequence) {
        if (ac.c(this.g, charSequence)) {
            return this;
        }
        b j = j();
        j.I(QueryTriggerType.USER);
        j.J(0);
        j.v(charSequence);
        int length = charSequence.length();
        j.A(length, length);
        return j.a();
    }

    public final Query dp() {
        b j = j();
        j.d(0L, 70368744177664L);
        j.t(this.k);
        return j.a();
    }

    public final Query dq() {
        b j = j();
        j.d(0L, 4398046511104L);
        j.t(this.k);
        return j.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int dr() {
        boolean z;
        String aI = aI();
        switch (aI.hashCode()) {
            case -1857627214:
                if (aI.equals("summons")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -764028567:
                if (aI.equals("web.isch")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -763740848:
                if (aI.equals("web.shop")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 117588:
                if (aI.equals("web")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 1222272135:
                if (aI.equals("web.app")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 1222272944:
                if (aI.equals("web.bks")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 1222284848:
                if (aI.equals("web.nws")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 1222292087:
                if (aI.equals("web.vid")) {
                    z = 3;
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
                return 2;
            case true:
                return 3;
            case true:
                return 4;
            case true:
                return 6;
            case true:
                return 7;
            case true:
                return 5;
            case true:
                return 9;
            case true:
                return 8;
            default:
                return 1;
        }
    }

    public final int e() {
        if (cS()) {
            return this.F;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Query query = (Query) obj;
        if (this.d != query.d || this.e != query.e || this.m != query.m || this.n != query.n || this.o != query.o || this.r != query.r || this.v != query.v || this.y != query.y || this.z != query.z || this.A != query.A || this.C != query.C || this.D != query.D || this.E != query.E || this.F != query.F || this.G != query.G || this.H != query.H || this.I != query.I || this.P != query.P || this.f != query.f) {
            return false;
        }
        CharSequence charSequence = this.g;
        CharSequence charSequence2 = query.g;
        return charSequence.toString().contentEquals(query.g) && h.a.a.p.b.a.f.f(this.h, query.h) && h.a.a.p.b.a.f.f(this.i, query.i) && h.a.a.p.b.a.f.f(this.j, query.j) && h.a.a.p.b.a.f.f(this.k, query.k) && h.a.a.p.b.a.f.f(this.S, query.S) && h.a.a.p.b.a.f.f(this.l, query.l) && h.a.a.p.b.a.f.f(this.p, query.p) && h.a.a.p.b.a.f.f(this.q, query.q) && h.a.a.p.b.a.f.f(this.s, query.s) && Arrays.equals(this.t, query.t) && h.a.a.p.b.a.f.f(this.u, query.u) && h.a.a.p.b.a.f.f(this.w, query.w) && h.a.a.p.b.a.f.f(this.x, query.x) && h.a.a.p.b.a.f.f(this.B, query.B) && h.a.a.p.b.a.f.f(this.J, query.J) && h.a.a.p.b.a.f.f(this.K, query.K) && h.a.a.p.b.a.f.f(this.L, query.L) && h.a.a.p.b.a.f.f(this.M, query.M) && h.a.a.p.b.a.f.f(this.N, query.N) && this.O == query.O && this.U == query.U && h.a.a.p.b.a.f.f(this.T, query.T) && h.a.a.p.b.a.f.f(this.Q, query.Q);
    }

    public final long f(String str) {
        Bundle bundle = this.w;
        if (bundle != null) {
            return bundle.getLong(str, 0L);
        }
        return 0L;
    }

    public final long g() {
        return this.E;
    }

    public final Bundle h() {
        Bundle bundle = this.w;
        if (bundle == null) {
            return null;
        }
        return (Bundle) bundle.clone();
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{Long.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, this.h, this.i, this.j, this.k, this.S, this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), this.s, this.u, Integer.valueOf(this.v), this.w, this.x, Integer.valueOf(this.y), Boolean.valueOf(this.z), Long.valueOf(this.A), this.B, Long.valueOf(this.C), Long.valueOf(this.D), Long.valueOf(this.E), Integer.valueOf(this.F), Long.valueOf(this.G), Long.valueOf(this.H), Long.valueOf(this.I), this.J, this.K, this.L, this.M, this.N, this.O, Integer.valueOf(this.U), this.T, Integer.valueOf(this.P), this.Q}) * 31) + Arrays.hashCode(this.t);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        if (equals(b)) {
            fVar.q("Query[EMPTY]");
            return;
        }
        fVar.q("Query[" + dv() + "/" + du() + "/" + aI() + "@" + this.o + "]");
        String ds = ds();
        if (!ds.isEmpty()) {
            fVar.r(new com.google.android.apps.gsa.shared.util.b.d(ds, false));
        }
        fVar.b("flags").a(new com.google.android.apps.gsa.shared.util.b.d(Long.toHexString(this.d), false));
        String str = "\"" + this.g.toString() + "\"";
        String str2 = str;
        if (!this.g.toString().equals(this.i)) {
            str2 = str + " (\"" + this.i + "\")";
        }
        dy(fVar, "query chars", str2);
        Bundle bundle = this.w;
        String string = bundle != null ? bundle.getString("android.search.extra.EVENT_ID") : null;
        if (string != null) {
            dy(fVar, "event ID", string);
        }
        dx(fVar, "commit ID", Long.valueOf(this.r).toString());
        dx(fVar, "resend audio request ID", dw(this.s));
        dx(fVar, "selection", c() + ":" + dt(b()));
        dy(fVar, "stick", aS());
        dy(fVar, "ludocid", aL());
        dy(fVar, "immersiveBasePage", aK());
        dy(fVar, "richCardImmersiveVertical", aP());
        dy(fVar, "miniappLandingPage", aM());
        dy(fVar, "isPrefetchIgnored", Boolean.valueOf(ci()).toString());
        fu fuVar = this.q;
        if (fuVar != null && !fuVar.isEmpty()) {
            dy(fVar, "persist CGI parameters", dw(this.q));
        }
        dy(fVar, "original url", this.k);
        dy(fVar, "non-search url", this.l);
        dy(fVar, "webapp state fragment", dw(aU()));
        dx(fVar, "recording URI", dw(this.x));
        dx(fVar, "audio sampling rate", Integer.valueOf(this.y).toString());
        dx(fVar, "reopenForFollowOn", Boolean.valueOf(this.z).toString());
        dx(fVar, "submission time", Long.valueOf(this.A).toString());
        dx(fVar, "latency events", dw(this.B));
        dx(fVar, "submission elapsed time", Long.valueOf(this.C).toString());
        int i = this.F;
        if (i != 0) {
            dx(fVar, "UI to launch for voice search", Integer.valueOf(i).toString());
        }
        dx(fVar, "language override", this.J);
        dx(fVar, "mid", dw(this.h));
        dx(fVar, "speechie mode", Integer.valueOf(this.v).toString());
        String aT = aT();
        if (aT != null) {
            dx(fVar, "visual element data", aT);
        }
        if (ba("android.opa.extra.CONVERSATION_DELTA")) {
            dx(fVar, "conversation delta size", Integer.valueOf(dj().length).toString());
        }
        byte[] dl = dl();
        if (dl != null) {
            dx(fVar, "suggestions params size", Integer.valueOf(dl.length).toString());
        }
        dx(fVar, "source", aR());
    }

    public final Parcelable i(String str) {
        Bundle bundle = this.w;
        if (bundle != null) {
            return bundle.getParcelable(str);
        }
        return null;
    }

    public final b j() {
        ThreadLocal threadLocal = R;
        b bVar = (b) threadLocal.get();
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b();
            threadLocal.set(bVar2);
        }
        ab abVar = com.google.common.f.a.e.a;
        bVar2.f1484a = this;
        bVar2.b = this.d;
        bVar2.c = this.e;
        bVar2.d = this.g;
        bVar2.e = this.j;
        String str = null;
        bVar2.f = null;
        bVar2.g = this.l;
        bVar2.h = this.m;
        bVar2.i = this.n;
        bVar2.m = this.r;
        bVar2.n = this.s;
        bVar2.j = this.o;
        bVar2.l = this.q;
        bVar2.o = this.u;
        bVar2.p = this.t;
        bVar2.q = this.w;
        bVar2.r = this.x;
        bVar2.s = this.y;
        bVar2.t = this.z;
        bVar2.u = this.A;
        bVar2.v = this.B;
        bVar2.w = this.C;
        bVar2.x = this.D;
        bVar2.y = this.E;
        bVar2.z = this.F;
        bVar2.A = this.G;
        bVar2.B = false;
        bVar2.C = false;
        bVar2.D = this.H;
        bVar2.E = this.I;
        bVar2.F = this.f;
        bVar2.G = this.v;
        bVar2.k = this.p;
        bVar2.H = this.J;
        bVar2.I = this.h;
        bVar2.J = this.K;
        bVar2.K = this.L;
        bVar2.L = this.M;
        bVar2.M = this.N;
        bVar2.N = this.O;
        bVar2.O = this.P;
        d dVar = this.Q.f;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.f1483a;
        }
        bVar2.Q = d.f1483a.createBuilder(dVar2);
        bVar2.P = com.google.android.apps.gsa.shared.search.a.b.f1481a.createBuilder(this.Q);
        bVar2.N(aU());
        String aI = aI();
        if (aI != null) {
            ba baVar = bVar2.Q;
            baVar.copyOnWrite();
            d dVar3 = (d) baVar.instance;
            dVar3.b |= 32;
            dVar3.e = aI;
        } else {
            ba baVar2 = bVar2.Q;
            baVar2.copyOnWrite();
            d dVar4 = (d) baVar2.instance;
            dVar4.b &= -33;
            dVar4.e = d.f1483a.e;
        }
        bVar2.F(aS());
        d dVar5 = this.Q.f;
        if (((dVar5 == null ? d.f1483a : dVar5).b & 4194304) != 0) {
            d dVar6 = dVar5;
            if (dVar5 == null) {
                dVar6 = d.f1483a;
            }
            str = dVar6.o;
        }
        boolean z = bVar2.B;
        d dVar7 = (d) bVar2.Q.instance;
        bVar2.B = z | b.c((dVar7.b & 4194304) != 0, dVar7.o, str);
        if (str != null) {
            ba baVar3 = bVar2.Q;
            baVar3.copyOnWrite();
            d dVar8 = (d) baVar3.instance;
            dVar8.b |= 4194304;
            dVar8.o = str;
        } else {
            ba baVar4 = bVar2.Q;
            baVar4.copyOnWrite();
            d dVar9 = (d) baVar4.instance;
            dVar9.b &= -4194305;
            dVar9.o = d.f1483a.o;
        }
        String aL = aL();
        boolean z2 = bVar2.B;
        d dVar10 = (d) bVar2.Q.instance;
        bVar2.B = z2 | b.c((dVar10.b & 128) != 0, dVar10.f, aL);
        if (aL != null) {
            ba baVar5 = bVar2.Q;
            baVar5.copyOnWrite();
            d dVar11 = (d) baVar5.instance;
            dVar11.b |= 128;
            dVar11.f = aL;
        } else {
            ba baVar6 = bVar2.Q;
            baVar6.copyOnWrite();
            d dVar12 = (d) baVar6.instance;
            dVar12.b &= -129;
            dVar12.f = d.f1483a.f;
        }
        bVar2.p(aK());
        String aP = aP();
        boolean z3 = bVar2.B;
        d dVar13 = (d) bVar2.Q.instance;
        boolean z4 = false;
        if ((dVar13.b & 512) != 0) {
            z4 = true;
        }
        bVar2.B = b.c(z4, dVar13.h, aP) | z3;
        if (aP != null) {
            ba baVar7 = bVar2.Q;
            baVar7.copyOnWrite();
            d dVar14 = (d) baVar7.instance;
            dVar14.b |= 512;
            dVar14.h = aP;
        } else {
            ba baVar8 = bVar2.Q;
            baVar8.copyOnWrite();
            d dVar15 = (d) baVar8.instance;
            dVar15.b &= -513;
            dVar15.h = d.f1483a.h;
        }
        bVar2.C(aR(), true);
        bVar2.M(aT());
        bVar2.B(aQ());
        if (aJ("android.search.extra.EVENT_ID") != null) {
            Bundle h = h();
            h.getClass();
            bVar2.q = h;
            bVar2.q.remove("android.search.extra.EVENT_ID");
        }
        return bVar2;
    }

    public final Query k(Query query) {
        b j = j();
        j.n(query.r);
        j.x(query.E);
        j.r(query.G);
        j.s(query.B);
        return j.a();
    }

    @Deprecated
    public final Query l(Query query) {
        b j = j();
        j.n(query.r);
        j.x(query.E);
        j.r(query.G);
        j.s(query.B);
        j.d(16384L, true != query.bw() ? 0L : 16384L);
        return j.a();
    }

    public final Query m(LatencyEvents latencyEvents) {
        b j = j();
        j.s(new LatencyEvents(latencyEvents.f1469a, latencyEvents.b, latencyEvents.d, SystemClock.elapsedRealtime(), latencyEvents.c).a(this.B.c));
        return j.a();
    }

    public final Query n() {
        b j = j();
        j.i();
        j.j();
        j.d(137438953472L, 0L);
        j.d(36028797018963968L, 0L);
        j.h();
        j.m(null);
        j.K(null);
        j.H(0L);
        j.O();
        return j.a();
    }

    public final Query o() {
        b j = j();
        j.p(null);
        j.f("query-header-visibility");
        ba baVar = j.Q;
        baVar.copyOnWrite();
        d dVar = (d) baVar.instance;
        d dVar2 = d.f1483a;
        dVar.b &= -8193;
        dVar.l = 0;
        j.f("EXTRA_FOOTER_VISIBILITY");
        j.e(72057594037927936L, 0L);
        return j.a();
    }

    public final Query p() {
        b j = j();
        j.I(QueryTriggerType.USER);
        j.J(0);
        j.v("");
        j.A(-2, -2);
        return j.a();
    }

    public final Query q() {
        b j = j();
        long j2 = j.b;
        if (!j.f1484a.cW() && (j2 & 15) != 0) {
            ab abVar = com.google.common.f.a.e.a;
            j.d = "";
            j.h = -2;
            j.i = -2;
        }
        j.d(32768L, 0L);
        j.d(65536L, 0L);
        j.i();
        j.P();
        j.G(SystemClock.elapsedRealtime());
        j.C = true;
        if ((this.e & 1024) != 0) {
            j.e(1024L, 0L);
        } else {
            j.j();
        }
        return j.a();
    }

    public final Query r() {
        b j = j();
        j.d(0L, 281474976710656L);
        return j.a();
    }

    public final Query s() {
        b j = j();
        j.g();
        j.I(QueryTriggerType.ACTION_ESCAPE_HATCH);
        j.J(0);
        j.j();
        j.P();
        j.G(SystemClock.elapsedRealtime());
        j.t(this.k);
        j.O();
        return j.a();
    }

    public final Query t() {
        cl.v(!da(), "Received an auth failure for request without tokens.");
        if ((this.d & 32768) == 0) {
            b j = j();
            j.d(0L, 32768L);
            j.i();
            return j.a();
        }
        b j2 = j();
        j2.d(32768L, 0L);
        j2.d(0L, 65536L);
        j2.i();
        return j2.a();
    }

    public final String toString() {
        return aV(this.g);
    }

    public final Query u() {
        b j = j();
        j.d(0L, 131072L);
        j.g();
        j.j();
        j.d(137438953472L, 0L);
        j.d(1024L, 0L);
        j.P();
        j.G(SystemClock.elapsedRealtime());
        j.t(this.k);
        j.O();
        return j.a();
    }

    public final Query v() {
        b j = j();
        j.d(0L, 68719476736L);
        return j.a();
    }

    public final Query w() {
        b j = j();
        j.d(0L, 2199023255552L);
        return j.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        CharSequence charSequence = this.g;
        TextUtils.writeToParcel(charSequence, parcel, i);
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CorrectionSpan[] correctionSpanArr = (CorrectionSpan[]) spanned.getSpans(0, spanned.length(), CorrectionSpan.class);
            parcel.writeInt(correctionSpanArr.length);
            for (CorrectionSpan correctionSpan : correctionSpanArr) {
                parcel.writeInt(spanned.getSpanStart(correctionSpan));
                parcel.writeInt(spanned.getSpanEnd(correctionSpan));
                parcel.writeInt(spanned.getSpanFlags(correctionSpan));
                parcel.writeString(correctionSpan.a);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeBundle(ar.d(this.q));
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeLong(this.r);
        parcel.writeValue(this.s);
        parcel.writeByteArray(this.t);
        parcel.writeBundle(this.w);
        parcel.writeParcelable(this.x, 0);
        parcel.writeLong(this.A);
        parcel.writeParcelable(this.B, 0);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeInt(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeLong(this.I);
        parcel.writeInt(this.y);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeInt(this.v);
        parcel.writeString(this.J);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.K, i);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        or orVar = this.O;
        parcel.writeValue(orVar == null ? null : Integer.valueOf(orVar.as));
        int i2 = this.U;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeString(this.T);
        parcel.writeInt(this.P);
        byte[] byteArray = this.Q.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public final Query x() {
        b j = j();
        j.e(0L, 8L);
        return j.a();
    }

    public final Query y() {
        b j = j();
        j.I(QueryTriggerType.HISTORY_REFRESH);
        return j.a();
    }

    public final Query z(boolean z) {
        Query a2;
        if (z) {
            b j = j();
            j.d(0L, 562949953421312L);
            a2 = j.a();
        } else {
            b j2 = j();
            j2.d(562949953421312L, 0L);
            a2 = j2.a();
        }
        return a2;
    }
}
