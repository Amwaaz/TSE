package com.google.android.apps.gsa.staticplugins.aa;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.preferences.i;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.logger.e;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.libraries.g.a;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/aa/b.class */
public class b implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1620a = c.DOWNLOAD_MANAGER;
    public static final j b = j.i("com.google.android.apps.gsa.staticplugins.aa.b");
    public final DownloadManager c;
    public final a d;
    public final com.google.android.apps.gsa.w.a e;
    private final e f;
    private at g;
    private final n h;

    public b(Context context, e eVar, n nVar, a aVar, com.google.android.apps.gsa.w.a aVar2, d dVar) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        this.g = com.google.common.base.a.a;
        this.c = downloadManager;
        this.f = eVar;
        this.h = nVar;
        this.d = aVar;
        this.e = aVar2;
        dVar.a(this);
    }

    public final int a(long... jArr) {
        int i;
        try {
            i = this.c.remove(jArr);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            y e2 = b.e();
            e2.aj(com.google.common.f.a.e.a, "DownloadManagerWrapper");
            a.a.dB(e2, "Exception from DownloadManager ", (char) 14170, e);
            this.f.c(e, 8239226);
            i = 0;
        }
        return i;
    }

    public final long b(DownloadManager.Request request, int i) {
        try {
            long enqueue = this.c.enqueue(request);
            a aVar = new a(enqueue, this.d.b(), c.a(i));
            synchronized (this) {
                e().put(Long.valueOf(aVar.a), aVar);
                f();
            }
            return enqueue;
        } catch (SQLiteException | IllegalArgumentException | NullPointerException | SecurityException e) {
            y f = b.f();
            f.aj(com.google.common.f.a.e.a, "DownloadManagerWrapper");
            a.a.dB(f, "Download could not be enqueued.", (char) 14171, e);
            return Long.MAX_VALUE;
        }
    }

    public final Cursor c(DownloadManager.Query query) {
        try {
            return this.c.query(query);
        } catch (SQLiteException | IllegalArgumentException e) {
            y f = b.f();
            f.aj(com.google.common.f.a.e.a, "DownloadManagerWrapper");
            a.a.dB(f, "DownloadManager.query() failed", (char) 14172, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0104 A[Catch: all -> 0x0133, ce -> 0x0138, TRY_ENTER, TryCatch #1 {ce -> 0x0138, blocks: (B:5:0x0013, B:7:0x0026, B:11:0x0057, B:13:0x007d, B:15:0x0085, B:20:0x0104, B:36:0x0118, B:38:0x0121), top: B:4:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.aa.b.e():java.util.Map");
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : e().values()) {
            if (!aVar.d) {
                ba createBuilder = d.a.createBuilder();
                long j = aVar.a;
                createBuilder.copyOnWrite();
                d dVar = createBuilder.instance;
                dVar.b |= 1;
                dVar.c = j;
                long j2 = aVar.b;
                createBuilder.copyOnWrite();
                d dVar2 = createBuilder.instance;
                dVar2.b |= 2;
                dVar2.d = j2;
                int i = aVar.c.sd;
                createBuilder.copyOnWrite();
                d dVar3 = createBuilder.instance;
                dVar3.b |= 4;
                dVar3.e = i;
                arrayList.add(createBuilder.build());
            }
        }
        ba createBuilder2 = c.a.createBuilder();
        createBuilder2.copyOnWrite();
        c cVar = createBuilder2.instance;
        cb cbVar = cVar.b;
        if (!cbVar.c()) {
            cVar.b = bi.mutableCopy(cbVar);
        }
        com.google.protobuf.c.addAll(arrayList, cVar.b);
        c build = createBuilder2.build();
        i f = this.h.f();
        f.c("download_manager_requests", build.toByteArray());
        f.b(false);
        ab abVar = com.google.common.f.a.e.a;
        build.b.size();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        synchronized (this) {
            fVar.q("DownloadManager requests");
            Iterator it = e().values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).hq(fVar);
            }
        }
    }
}
