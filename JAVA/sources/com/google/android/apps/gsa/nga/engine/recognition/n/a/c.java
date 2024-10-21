package com.google.android.apps.gsa.nga.engine.recognition.n.a;

import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.n;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.shared.u.i.b;
import j$.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/n/a/c.class */
public final class c implements n, com.google.android.apps.gsa.nga.engine.recognition.n.c {

    /* renamed from: a, reason: collision with root package name */
    private final b f669a;
    private final n b;
    private b c;

    public c(n nVar) {
        this(b.ROHAN_SODA, nVar);
    }

    public c(n nVar, byte[] bArr) {
        this(b.S3, nVar);
    }

    public c(n nVar, char[] cArr) {
        this(b.SODA, nVar);
    }

    public c(b bVar, n nVar) {
        this.f669a = bVar;
        this.b = nVar;
        this.c = b.S3;
    }

    private final Optional d() {
        synchronized (this) {
            if (this.f669a.equals(this.c)) {
                return Optional.of(this.b);
            }
            return Optional.empty();
        }
    }

    private final void e(Consumer consumer) {
        Optional d = d();
        if (d.isPresent()) {
            e$.ExternalSyntheticApiModelOutline0.m(consumer, d.get());
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n
    public final void b(com.google.speech.recognizer.a.f fVar, v vVar, boolean z) {
        e(new a(fVar, vVar, z));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n
    public final void c(u uVar, String str) {
        e(new b(uVar, str));
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.n.c
    public final void f(b bVar) {
        synchronized (this) {
            this.c = bVar;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.recognition.d
    public final void gZ(com.google.android.apps.gsa.nga.engine.recognition.f fVar) {
        e(new k(fVar, 1));
    }
}
