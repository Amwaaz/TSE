package com.google.android.apps.gsa.nga.engine.recognition.n.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.c.ag;
import com.google.android.apps.gsa.nga.shared.q.c.cm;
import com.google.android.apps.gsa.nga.shared.q.c.cn;
import com.google.android.apps.gsa.nga.shared.q.c.co;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.cx;
import com.google.android.apps.gsa.nga.shared.q.d.cy;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.n;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/n/a/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f670a = d.j();
    public final ConnectivityManager c;
    private final a e;
    private final com.google.android.libraries.gsa.h.h f;
    private final af g;
    private final g h;
    private final x i;
    public final Map b = new ConcurrentHashMap();
    private final Map d = new ConcurrentHashMap();

    public f(Context context, af afVar, a aVar, g gVar, x xVar, com.google.android.libraries.gsa.h.h hVar) {
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = afVar;
        this.e = aVar;
        this.h = gVar;
        this.i = xVar;
        this.f = hVar;
    }

    private final Duration e() {
        return Duration.ofMillis(this.e.d(eu.ls));
    }

    private static String f() {
        String lowerCase = Build.MODEL.toLowerCase(Locale.ENGLISH);
        return lowerCase.contains("pixel 4") ? lowerCase : "non pixel 4";
    }

    private final void g(cx cxVar) {
        String f = f();
        if (f == null) {
            throw new NullPointerException("Null deviceModel");
        }
        int dn = a.a.dn(cxVar.c);
        int i = dn;
        if (dn == 0) {
            i = 1;
        }
        String num = Integer.toString(i - 1);
        if (num == null) {
            throw new NullPointerException("Null status");
        }
        this.i.b(new cn("NGA_NETWORK_STATUS", f, num));
        af afVar = this.g;
        bk bkVar = bk.SPEECH_RECOGNITION_SWITCH;
        ba createBuilder = bj.a.createBuilder();
        ba createBuilder2 = cy.a.createBuilder();
        createBuilder2.copyOnWrite();
        cy cyVar = createBuilder2.instance;
        cxVar.getClass();
        cyVar.c = cxVar;
        cyVar.b = 2;
        cy build = createBuilder2.build();
        createBuilder.copyOnWrite();
        bj bjVar = createBuilder.instance;
        build.getClass();
        bjVar.c = build;
        bjVar.b = 59;
        afVar.b(bkVar, (bj) createBuilder.build(), ah.a);
    }

    public final void a(long j) {
        Duration e = e();
        com.google.common.f.a.a d = f670a.d();
        d.ak(4005);
        d.D("Added network: %s to blacklist with timeout: %s", j, e);
        Map map = this.b;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.i.b(new ag((byte[]) null));
        }
        this.b.put(valueOf, this.f.j("[NGA] remove blacklisted network", Duration.ofMillis(e.toMillis()), new d(this, j)));
    }

    public final boolean b(Network network) {
        long networkHandle = network.getNetworkHandle();
        NetworkCapabilities networkCapabilities = this.c.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            com.google.common.f.a.a d = f670a.d();
            d.ak(4010);
            d.r("No network capabilities for network: %s", networkHandle);
            ba createBuilder = cx.a.createBuilder();
            createBuilder.copyOnWrite();
            cx cxVar = createBuilder.instance;
            cxVar.c = 2;
            cxVar.b |= 1;
            g((cx) createBuilder.build());
            return false;
        }
        qj j = ha.t(21, 16, 12).j();
        while (j.hasNext()) {
            Integer num = (Integer) j.next();
            if (!networkCapabilities.hasCapability(num.intValue())) {
                com.google.common.f.a.a d2 = f670a.d();
                d2.ak(4009);
                d2.N("Capability not met: %s, Network: %s, NetworkCapabilities: %s", num, Long.valueOf(networkHandle), networkCapabilities);
                ba createBuilder2 = cx.a.createBuilder();
                createBuilder2.copyOnWrite();
                cx cxVar2 = createBuilder2.instance;
                cxVar2.c = 3;
                cxVar2.b = 1 | cxVar2.b;
                String networkCapabilities2 = networkCapabilities.toString();
                createBuilder2.copyOnWrite();
                cx cxVar3 = createBuilder2.instance;
                networkCapabilities2.getClass();
                cxVar3.b = 2 | cxVar3.b;
                cxVar3.d = networkCapabilities2;
                g((cx) createBuilder2.build());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        com.google.common.f.a.a d = f670a.d();
        d.ak(4012);
        d.p("isNetworkGood called.");
        return d(true, true);
    }

    public final boolean d(boolean z, boolean z2) {
        boolean z3;
        cx cxVar;
        Network activeNetwork = this.c.getActiveNetwork();
        if (activeNetwork == null) {
            com.google.common.f.a.a d = f670a.d();
            d.ak(4004);
            d.p("No active network");
            ba createBuilder = cx.a.createBuilder();
            createBuilder.copyOnWrite();
            cx cxVar2 = createBuilder.instance;
            cxVar2.c = 1;
            cxVar2.b |= 1;
            cxVar = (cx) createBuilder.build();
        } else {
            long networkHandle = activeNetwork.getNetworkHandle();
            if (b(activeNetwork)) {
                NetworkCapabilities networkCapabilities = this.c.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    com.google.common.f.a.a d2 = f670a.d();
                    d2.ak(4003);
                    d2.r("No network capabilities for network: %s", networkHandle);
                    ba createBuilder2 = cx.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    cx cxVar3 = createBuilder2.instance;
                    cxVar3.c = 2;
                    cxVar3.b |= 1;
                    cxVar = (cx) createBuilder2.build();
                } else {
                    String str = (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : (networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(6)) ? "other" : "unknown";
                    long d3 = this.e.d(eu.jF);
                    int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                    x xVar = this.i;
                    String f = f();
                    if (f == null) {
                        throw new NullPointerException("Null deviceModel");
                    }
                    xVar.b(new cm("NGA_NETWORK_DOWNSTREAM_BANDWIDTH", Double.valueOf(linkDownstreamBandwidthKbps), f, str));
                    if (linkDownstreamBandwidthKbps == 0 || linkDownstreamBandwidthKbps >= d3) {
                        z3 = true;
                    } else {
                        com.google.common.f.a.a d4 = f670a.d();
                        d4.ak(4002);
                        d4.D("Downstream bandwidth not sufficient: Network: %s, NetworkCapabilities: %s", networkHandle, networkCapabilities);
                        z3 = false;
                    }
                    int linkUpstreamBandwidthKbps = networkCapabilities.getLinkUpstreamBandwidthKbps();
                    x xVar2 = this.i;
                    String f2 = f();
                    if (f2 == null) {
                        throw new NullPointerException("Null deviceModel");
                    }
                    xVar2.b(new co("NGA_NETWORK_UPSTREAM_BANDWIDTH", Double.valueOf(linkUpstreamBandwidthKbps), f2, str));
                    if (z3) {
                        if (linkUpstreamBandwidthKbps == 0 || linkUpstreamBandwidthKbps >= d3) {
                            if (z) {
                                Map map = this.d;
                                Long valueOf = Long.valueOf(networkHandle);
                                com.google.common.util.concurrent.cn cnVar = (com.google.common.util.concurrent.cn) map.get(valueOf);
                                if ((cnVar == null || cnVar.isDone()) && !e().isZero()) {
                                    g gVar = this.h;
                                    ba createBuilder3 = aa.a.createBuilder();
                                    ba createBuilder4 = n.a.createBuilder();
                                    createBuilder4.copyOnWrite();
                                    n nVar = createBuilder4.instance;
                                    nVar.b |= 1;
                                    nVar.c = networkHandle;
                                    n build = createBuilder4.build();
                                    createBuilder3.copyOnWrite();
                                    aa aaVar = createBuilder3.instance;
                                    build.getClass();
                                    aaVar.c = build;
                                    aaVar.b = 4;
                                    com.google.common.util.concurrent.cn c = gVar.c((aa) createBuilder3.build(), Optional.empty());
                                    this.d.put(valueOf, c);
                                    this.f.m(c, "[NGA] measure network", new e(this));
                                }
                            }
                            if (this.b.containsKey(Long.valueOf(networkHandle))) {
                                com.google.common.f.a.a d5 = f670a.d();
                                d5.ak(4000);
                                d5.r("Network blacklisted: %s", networkHandle);
                                ba createBuilder5 = cx.a.createBuilder();
                                createBuilder5.copyOnWrite();
                                cx cxVar4 = createBuilder5.instance;
                                cxVar4.c = 6;
                                cxVar4.b |= 1;
                                String networkCapabilities2 = networkCapabilities.toString();
                                createBuilder5.copyOnWrite();
                                cx cxVar5 = createBuilder5.instance;
                                networkCapabilities2.getClass();
                                cxVar5.b |= 2;
                                cxVar5.d = networkCapabilities2;
                                cxVar = (cx) createBuilder5.build();
                            } else {
                                com.google.common.f.a.a d6 = f670a.d();
                                d6.ak(3999);
                                d6.D("Network is good: %s,\nNetworkCapabilities: %s", networkHandle, networkCapabilities);
                                ba createBuilder6 = cx.a.createBuilder();
                                createBuilder6.copyOnWrite();
                                cx cxVar6 = createBuilder6.instance;
                                cxVar6.c = 5;
                                cxVar6.b |= 1;
                                String networkCapabilities3 = networkCapabilities.toString();
                                createBuilder6.copyOnWrite();
                                cx cxVar7 = createBuilder6.instance;
                                networkCapabilities3.getClass();
                                cxVar7.b |= 2;
                                cxVar7.d = networkCapabilities3;
                                cxVar = (cx) createBuilder6.build();
                            }
                        } else {
                            com.google.common.f.a.a d7 = f670a.d();
                            d7.ak(4001);
                            d7.D("Upstream bandwidth not sufficient: Network: %s, NetworkCapabilities: %s", networkHandle, networkCapabilities);
                        }
                    }
                    ba createBuilder7 = cx.a.createBuilder();
                    createBuilder7.copyOnWrite();
                    cx cxVar8 = createBuilder7.instance;
                    cxVar8.c = 4;
                    cxVar8.b |= 1;
                    String networkCapabilities4 = networkCapabilities.toString();
                    createBuilder7.copyOnWrite();
                    cx cxVar9 = createBuilder7.instance;
                    networkCapabilities4.getClass();
                    cxVar9.b |= 2;
                    cxVar9.d = networkCapabilities4;
                    cxVar = (cx) createBuilder7.build();
                }
            } else {
                cxVar = cx.a;
            }
        }
        if (z2 && (cxVar.b & 1) != 0) {
            g(cxVar);
        }
        int dn = a.a.dn(cxVar.c);
        return dn != 0 && dn == 6;
    }
}
