package com.google.android.apps.gsa.sidekick.shared.a;

import com.google.android.apps.gsa.shared.logger.b.j;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.common.b.dk;
import com.google.common.b.hn;
import com.google.common.b.pq;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.o.qr;
import com.google.common.o.r;
import com.google.protobuf.bc;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/sidekick/shared/a/a.class */
public class a extends j implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1581a = com.google.common.f.j.i("com.google.android.apps.gsa.sidekick.shared.a.a");
    private final com.google.android.libraries.g.a b;
    private final Queue c = new pq(new dk(10));

    public a(com.google.android.libraries.g.a aVar, d dVar) {
        this.b = aVar;
        dVar.a(this);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        String str;
        fVar.q("FeedLaunchStateDumper");
        synchronized (this.c) {
            for (com.google.android.libraries.gsa.e.a.a aVar : this.c) {
                fVar.b("FeedLaunchSurfaceType").a(new com.google.android.apps.gsa.shared.util.b.d("SEARCH_NOW_MONET", false));
                f d = fVar.d((Object) null);
                w wVar = aVar.a;
                d.b("FeedLaunchResult").a(new com.google.android.apps.gsa.shared.util.b.d(wVar.name(), false));
                d.b("FeedLaunchEventTimestamp").a(new com.google.android.apps.gsa.shared.util.b.d(new Date(com.google.android.libraries.g.f.a(this.b, TimeUnit.NANOSECONDS.toMillis(aVar.b))).toString(), false));
                switch (wVar.ordinal()) {
                    case 887:
                    case 888:
                        r rVar = aVar.g;
                        if (rVar != null && rVar.g.size() > 0) {
                            int i = ((com.google.common.o.b) rVar.g.get(0)).d;
                            com.google.android.apps.gsa.shared.logger.d.b a2 = com.google.android.apps.gsa.shared.logger.d.b.a(i);
                            if (a2 != null) {
                                d.b(wVar == w.FEED_LAUNCH_DISABLED ? "FeedLaunchDisabledReason" : "FeedLaunchErrorReason").a(new com.google.android.apps.gsa.shared.util.b.d(a2.name(), false));
                                break;
                            } else {
                                h f = f1581a.f();
                                f.aj(e.a, "FeedLaunchStateDumper");
                                h hVar = f;
                                hVar.ak(9475);
                                hVar.q("Invalid feed launch error code: %d", i);
                                break;
                            }
                        }
                        break;
                    case 889:
                    case 890:
                        r rVar2 = aVar.g;
                        if (rVar2 != null && (rVar2.c & 8) != 0) {
                            int ab = qr.ab(rVar2.B);
                            int i2 = ab;
                            if (ab == 0) {
                                i2 = 1;
                            }
                            com.google.android.apps.gsa.shared.util.debug.a.e b = d.b("FeedLaunchCancelReason");
                            if (i2 == 1) {
                                str = "FEED_LAUNCH_CANCEL_UNKNOWN";
                            } else if (i2 == 2) {
                                str = "FEED_LAUNCH_CANCEL_ACTIVITY_PAUSED";
                            } else if (i2 != 101) {
                                switch (i2) {
                                    case 103:
                                        str = "FEED_LAUNCH_CANCEL_CONFIGURATION_CHANGE";
                                        break;
                                    case 104:
                                        str = "FEED_LAUNCH_CANCEL_NAVIGATION_DRAWER_OVERLAID";
                                        break;
                                    case 105:
                                        str = "FEED_LAUNCH_CANCEL_OK_GOOGLE";
                                        break;
                                    case 106:
                                        str = "FEED_LAUNCH_CANCEL_TEXT_SEARCH";
                                        break;
                                    case 107:
                                        str = "FEED_LAUNCH_CANCEL_VOICE_SEARCH";
                                        break;
                                    case 108:
                                        str = "FEED_LAUNCH_CANCEL_MUSIC_SEARCH";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                            } else {
                                str = "FEED_LAUNCH_CANCEL_TAB_SWITCH";
                            }
                            b.a(new com.google.android.apps.gsa.shared.util.b.d(str, false));
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.logger.b.j, com.google.android.apps.gsa.shared.logger.b.i
    public final void j(hn hnVar, bc bcVar) {
        ab abVar = e.a;
        if (((com.google.android.libraries.gsa.e.a.a) hnVar.first()).a == w.FEED_LAUNCH_START) {
            this.c.add((com.google.android.libraries.gsa.e.a.a) hnVar.last());
        }
    }
}
