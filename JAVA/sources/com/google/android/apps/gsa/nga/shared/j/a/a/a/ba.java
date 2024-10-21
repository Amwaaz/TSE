package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.IntentFilter;
import com.google.android.libraries.search.assistant.invocation.g.a.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ba.class */
final class ba extends m.h.b.n implements m.h.a.l {

    /* renamed from: a, reason: collision with root package name */
    final Object f914a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(Object obj, int i) {
        super(1);
        this.b = i;
        this.f914a = obj;
    }

    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            final m.h.a.a aVar = (m.h.a.a) obj;
            aVar.getClass();
            return new v(((w) this.f914a).c.c(com.google.android.libraries.search.assistant.invocation.g.a.l.c, new j(aVar) { // from class: com.google.android.apps.gsa.nga.shared.j.a.a.a.u

                /* renamed from: a, reason: collision with root package name */
                public final m.h.a.a f930a;

                {
                    this.f930a = aVar;
                }

                @Override // com.google.android.libraries.search.assistant.invocation.g.a.j
                public final void a() {
                    this.f930a.a();
                }
            }));
        }
        m.h.a.a aVar2 = (m.h.a.a) obj;
        aVar2.getClass();
        bc bcVar = (bc) this.f914a;
        bb bbVar = new bb(bcVar, aVar2);
        androidx.core.content.a.f(bcVar.b, bbVar, new IntentFilter("com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE"), "android.permission.MANAGE_VOICE_KEYPHRASES", 2);
        return new au(this.f914a, bbVar, 2);
    }
}
