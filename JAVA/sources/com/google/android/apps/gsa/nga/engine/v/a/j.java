package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.ac.a.am;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.dh;
import com.google.android.apps.gsa.nga.shared.q.c.fg;
import com.google.android.apps.gsa.nga.shared.q.d.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.nga.shared.q.d.cn;
import com.google.android.apps.gsa.nga.shared.q.h;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.o;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.b.oo;
import com.google.knowledge.a.a.e;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/j.class */
public class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f812a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.v.a.j");
    public static final Object b = new Object();
    public final a c;
    public final com.google.android.libraries.g.a e;
    public final h f;
    public long g;
    private final e.a m;
    private final e.a n;
    private final aa o;
    private final y p;
    private final x q;
    public final List d = new ArrayList();
    private final com.google.android.apps.gsa.nga.shared.e.a l = new com.google.android.apps.gsa.nga.shared.e.a(10);
    public List i = new ArrayList();
    public final AtomicInteger j = new AtomicInteger();
    public Optional k = Optional.empty();
    public String h = com.google.android.apps.gsa.nga.shared.u.i.b.S3.name();

    public j(e.a aVar, a aVar2, com.google.android.libraries.g.a aVar3, e.a aVar4, x xVar, aa aaVar, y yVar, h hVar) {
        this.m = aVar;
        this.c = aVar2;
        this.e = aVar3;
        this.n = aVar4;
        this.q = xVar;
        this.o = aaVar;
        this.p = yVar;
        this.f = hVar;
    }

    public static void l(i iVar) {
        synchronized (b) {
            iVar.a(new a());
        }
    }

    public static boolean m(long j, long j2, long j3) {
        return Math.abs(j - j2) < j3;
    }

    public static boolean n(i iVar) {
        if (iVar.j.e.isEmpty()) {
            return false;
        }
        bj bjVar = ((bl) oo.ay(iVar.j.e)).e;
        bj bjVar2 = bjVar;
        if (bjVar == null) {
            bjVar2 = bj.a;
        }
        return aa.s(bjVar2.b == 29 ? (ah) bjVar2.c : ah.a);
    }

    public static boolean o(bl blVar, as asVar) {
        bj bjVar = blVar.e;
        bj bjVar2 = bjVar;
        if (bjVar == null) {
            bjVar2 = bj.a;
        }
        com.google.android.apps.gsa.nga.shared.u.m.a aVar = (bjVar2.b == 29 ? (ah) bjVar2.c : ah.a).d;
        com.google.android.apps.gsa.nga.shared.u.m.a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = com.google.android.apps.gsa.nga.shared.u.m.a.a;
        }
        e eVar = aVar2.c;
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = e.a;
        }
        if (eVar2.c.equals("UnintendedInvocation")) {
            return true;
        }
        e eVar3 = aa.c(blVar, asVar).c;
        e eVar4 = eVar3;
        if (eVar3 == null) {
            eVar4 = e.a;
        }
        return eVar4.c.equals("UnintendedInvocation");
    }

    private static void q(f fVar, String str, String str2) {
        fVar.s("%s: %s", new com.google.android.apps.gsa.shared.util.b.e[]{new d(str, false), new d(str2, false)});
        fVar.j(str, str2);
    }

    private static boolean r(i iVar) {
        return Collection._EL.stream(iVar.j.e).anyMatch(new g(0));
    }

    public final i a(com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        i iVar;
        androidx.compose.ui.l.f.e(!ahVar.d.isEmpty());
        Object obj = b;
        synchronized (obj) {
            i c = c(ahVar);
            if (c != null) {
                return c;
            }
            synchronized (obj) {
                while (this.d.size() >= 4) {
                    i iVar2 = (i) this.d.remove(0);
                    i(iVar2);
                    l(iVar2);
                }
                iVar = new i(this, ahVar, this.h);
                this.d.add(iVar);
                this.l.add(iVar);
                af afVar = (af) this.m.a();
                bk bkVar = bk.SESSION_ID;
                ba createBuilder = bj.a.createBuilder();
                ba createBuilder2 = cn.a.createBuilder();
                String str = iVar.b;
                createBuilder2.copyOnWrite();
                cn cnVar = createBuilder2.instance;
                str.getClass();
                cnVar.b |= 1;
                cnVar.c = str;
                createBuilder.copyOnWrite();
                bj bjVar = createBuilder.instance;
                cn build = createBuilder2.build();
                build.getClass();
                bjVar.c = build;
                bjVar.b = 50;
                afVar.b(bkVar, (bj) createBuilder.build(), ahVar);
            }
            return iVar;
        }
    }

    public final i b(String str) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.q.ah.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.q.ah ahVar = createBuilder.instance;
        str.getClass();
        ahVar.b |= 2;
        ahVar.d = str;
        return a((com.google.android.apps.gsa.nga.shared.q.ah) createBuilder.build());
    }

    public final i c(com.google.android.apps.gsa.nga.shared.q.ah ahVar) {
        i iVar;
        synchronized (b) {
            Iterator it = this.d.iterator();
            do {
                if (!it.hasNext()) {
                    return null;
                }
                iVar = (i) it.next();
            } while (!ahVar.d.equals(iVar.j.G));
            return iVar;
        }
    }

    public final i e(String str) {
        i iVar;
        synchronized (b) {
            iVar = (i) Collection._EL.stream(this.d).filter(new f(str, 0)).findFirst().orElse((Object) null);
        }
        return iVar;
    }

    public final fl f(com.google.android.apps.gsa.nga.shared.q.ah ahVar, String str) {
        Object obj = b;
        synchronized (obj) {
            i c = c(ahVar);
            if (c == null || (c.j.b & 8) == 0) {
                int i = fl.e;
                return ni.a;
            }
            if (c.g) {
                com.google.common.f.h e = f812a.e();
                e.aj(com.google.common.f.a.e.a, "ClearcutEventAggregator");
                com.google.common.f.h hVar = e;
                hVar.ak(3532);
                hVar.p("Double logging of the session AppFlow");
            }
            as asVar = c.j;
            String str2 = c.b;
            String str3 = c.l;
            c.g = true;
            c.h = str;
            x xVar = this.q;
            fg d = dh.d();
            d.b = "HANDOVER_TO_OPA";
            xVar.b(d.b());
            com.google.common.b.fg g = this.o.g(asVar, str2, str3);
            if ((asVar.b & 512) != 0) {
                com.google.android.apps.gsa.shared.logger.b.f d2 = aa.d(asVar);
                if (d2 != null) {
                    g.h(d2);
                    synchronized (obj) {
                        c.i = true;
                    }
                } else {
                    com.google.common.f.h e2 = f812a.e();
                    e2.aj(com.google.common.f.a.e.a, "ClearcutEventAggregator");
                    com.google.common.f.h hVar2 = e2;
                    hVar2.ak(3531);
                    hVar2.p("Failed to compute EEOS");
                }
            }
            return g.g();
        }
    }

    public final Optional g() {
        i iVar;
        synchronized (b) {
            if (this.d.isEmpty()) {
                return Optional.empty();
            }
            Iterator it = oo.P(this.d).iterator();
            do {
                if (!it.hasNext()) {
                    return Optional.of((i) oo.ay(this.d));
                }
                iVar = (i) it.next();
            } while (iVar.j.e.size() <= 0);
            return Optional.of(iVar);
        }
    }

    public final String h() {
        Optional g = g();
        return g.isPresent() ? ((i) g.get()).b : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011e A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0008, B:5:0x0019, B:11:0x004f, B:12:0x007a, B:29:0x00fb, B:31:0x011e, B:33:0x0180, B:35:0x0191, B:61:0x0198, B:67:0x019e, B:15:0x007c, B:17:0x0088, B:19:0x0090, B:22:0x00ac, B:25:0x00b4, B:26:0x00bc, B:42:0x00c0, B:44:0x00cb, B:46:0x00d3, B:49:0x00e6, B:50:0x00ee, B:56:0x00f8, B:8:0x001b, B:9:0x004d), top: B:3:0x0008, inners: #0, #1 }] */
    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f r8) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.v.a.j.hq(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x03fd A[Catch: all -> 0x0a23, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:7:0x0011, B:10:0x0013, B:12:0x002b, B:15:0x0034, B:17:0x0036, B:18:0x0044, B:26:0x076b, B:28:0x0772, B:37:0x095f, B:40:0x0967, B:42:0x0969, B:43:0x097e, B:93:0x0a1c, B:97:0x0090, B:99:0x00a3, B:100:0x00c4, B:102:0x00cc, B:105:0x00dc, B:107:0x00e7, B:110:0x0100, B:112:0x0107, B:114:0x010f, B:116:0x0123, B:118:0x0129, B:120:0x0133, B:122:0x013b, B:124:0x0143, B:125:0x011c, B:126:0x0164, B:128:0x016f, B:131:0x017f, B:132:0x018a, B:135:0x019a, B:137:0x01a1, B:140:0x01af, B:142:0x01b6, B:144:0x01be, B:146:0x01d2, B:150:0x01e5, B:154:0x0557, B:157:0x057d, B:158:0x059e, B:160:0x05a9, B:162:0x05e0, B:163:0x05e7, B:164:0x05ea, B:168:0x0704, B:170:0x074d, B:171:0x01f1, B:175:0x0203, B:177:0x020f, B:180:0x021f, B:182:0x0226, B:185:0x0234, B:187:0x023b, B:189:0x0243, B:191:0x0257, B:194:0x0268, B:196:0x026f, B:215:0x02df, B:217:0x03eb, B:220:0x03fd, B:222:0x02e7, B:223:0x02ef, B:224:0x02f7, B:225:0x02ff, B:226:0x033e, B:228:0x0307, B:231:0x0317, B:233:0x031e, B:236:0x032f, B:238:0x0336, B:240:0x0346, B:241:0x034e, B:244:0x035e, B:246:0x0365, B:249:0x0376, B:251:0x037d, B:268:0x03b4, B:269:0x03bc, B:270:0x03c4, B:271:0x03cc, B:272:0x03d4, B:273:0x03dc, B:274:0x03e4, B:275:0x0250, B:276:0x0409, B:278:0x041c, B:280:0x0424, B:283:0x0440, B:285:0x0447, B:287:0x044f, B:289:0x0463, B:292:0x0474, B:294:0x047b, B:302:0x045c, B:304:0x0488, B:307:0x0498, B:309:0x049f, B:311:0x04a7, B:313:0x04bb, B:316:0x04cc, B:318:0x04d3, B:328:0x052b, B:330:0x0536, B:333:0x04f3, B:338:0x050c, B:342:0x04b4, B:343:0x0549, B:345:0x01cb, B:351:0x0a22, B:31:0x0774, B:34:0x0788, B:51:0x078c, B:54:0x07a5, B:56:0x07ac, B:58:0x07b4, B:60:0x07c8, B:63:0x07d3, B:65:0x07d7, B:67:0x0818, B:69:0x082a, B:71:0x0835, B:73:0x0878, B:75:0x08a4, B:78:0x08b2, B:80:0x08b9, B:83:0x08c7, B:85:0x08ce, B:86:0x095d, B:87:0x0881, B:88:0x07c1, B:21:0x0046, B:23:0x004c, B:24:0x006b, B:94:0x006f, B:95:0x008e), top: B:3:0x0008, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.apps.gsa.nga.engine.v.a.i r12) {
        /*
            Method dump skipped, instructions count: 2601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.v.a.j.i(com.google.android.apps.gsa.nga.engine.v.a.i):void");
    }

    public final void j(com.google.android.apps.gsa.shared.logger.b.f fVar, String str) {
        com.google.android.apps.gsa.nga.engine.ac.a.bj bjVar = (com.google.android.apps.gsa.nga.engine.ac.a.bj) this.n.a();
        bjVar.b.n("[NGA] OpaCloudHandover.logAppFlowEventsForRequest", new am(bjVar, fl.p(fVar), str, 2));
    }

    public final void k(i iVar) {
        com.google.android.apps.gsa.shared.logger.b.f d;
        Object obj = b;
        synchronized (obj) {
            if (iVar.i) {
                return;
            }
            String str = iVar.h;
            as asVar = iVar.j;
            if (str == null || (d = aa.d(asVar)) == null) {
                return;
            }
            j(d, str);
            synchronized (obj) {
                iVar.i = true;
            }
        }
    }

    public final String p() {
        return com.google.android.libraries.search.t.k.a.b(o.f1569a.a());
    }
}
