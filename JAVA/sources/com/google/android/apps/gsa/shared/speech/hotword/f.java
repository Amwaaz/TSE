package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.android.libraries.mdi.download.ep;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/f.class */
final class f implements ep {

    /* renamed from: a, reason: collision with root package name */
    final Optional f1493a;

    public f(Optional optional) {
        this.f1493a = optional;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.g.a, java.lang.Object] */
    @Override // com.google.android.libraries.mdi.download.ep
    public final long a() {
        return this.f1493a.get().f().toEpochMilli();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.g.a, java.lang.Object] */
    @Override // com.google.android.libraries.mdi.download.ep
    public final long b() {
        return this.f1493a.get().b();
    }
}
