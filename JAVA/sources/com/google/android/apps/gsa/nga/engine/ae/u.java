package com.google.android.apps.gsa.nga.engine.ae;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.ar.b.b.ac;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/u.class */
public final class u extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f412a = d.j();
    public static final ha b = ha.s(1, 0);
    public final AudioManager c;
    public final Context d;
    public final a e;
    public final h f;
    public int g;
    public final ContentObserver h;
    public final ac i;
    private s j;
    private final y k;

    public u(AudioManager audioManager, ac acVar, Context context, a aVar, aw awVar, n nVar, y yVar) {
        super(nVar);
        this.h = new r(this);
        this.c = audioManager;
        this.i = acVar;
        this.d = context;
        this.e = aVar;
        this.f = awVar.a(t.class);
        this.k = yVar;
    }

    public final s a() {
        if (this.j == null) {
            this.j = new s(this);
        }
        return this.j;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.k.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.f.a("[NGA] initialize", new g(this, 2));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.f.a("[NGA] uninitialize", new g(this, 3));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AudioPlaybackChangeHandler";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 34;
    }
}
