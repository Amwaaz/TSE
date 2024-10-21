package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.util.debug.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/e.class */
final class e implements com.google.android.apps.gsa.shared.util.debug.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1299a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(VoiceAction voiceAction, int i) {
        Map map = this.f1299a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) && voiceAction != null) {
            this.f1299a.put(valueOf, voiceAction);
            return true;
        }
        if (!this.f1299a.containsKey(valueOf) || voiceAction != null) {
            return false;
        }
        this.f1299a.remove(valueOf);
        return true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ExtraCardsState");
        fVar.n("escape hatch card", (a) this.f1299a.get(1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f1299a.containsKey(1)) {
            sb.append(" + ButtonCard");
        }
        return sb.toString();
    }
}
