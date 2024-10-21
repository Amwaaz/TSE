package com.google.android.apps.gsa.search.core.ae.b;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.e;
import com.google.android.apps.gsa.search.shared.actions.f;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.i;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.c.c;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.c.af;
import com.google.android.apps.gsa.search.shared.service.c.kc;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.bf.a.h;
import com.google.common.base.at;
import com.google.common.util.concurrent.cn;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/b/b.class */
public interface b {
    void A(c cVar, com.google.cs.d.a.a aVar);

    void B(kc kcVar, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable);

    cn C(VoiceAction voiceAction, ActionData actionData, Query query, com.google.android.apps.gsa.search.shared.actions.errors.a aVar, ClientConfig clientConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    cn a(VoiceAction voiceAction, Query query);

    cn c(PromptSegment promptSegment, String str, boolean z);

    cn f(CardDecision cardDecision, int i, int i2, boolean z);

    cn g(VoiceAction voiceAction, Query query, at atVar);

    cn h(ModularAction modularAction, List list);

    cn i(ActionData actionData, af afVar, i iVar, Query query);

    cn j(VoiceAction voiceAction);

    cn k(Query query, ActionData actionData, PlaybackStatus playbackStatus, com.google.android.apps.gsa.search.core.m.a.a.a aVar, com.google.android.apps.gsa.search.core.m.a.c.a aVar2);

    cn l(Query query, ActionData actionData, PlaybackStatus playbackStatus, com.google.android.apps.gsa.search.core.m.a.a.a aVar, com.google.android.apps.gsa.search.core.m.a.c.a aVar2);

    cn m(Argument argument);

    cn n(ActionData actionData, int i, int i2, boolean z, boolean z2, c cVar);

    void o(c cVar);

    void p(e eVar);

    void q(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, f fVar, Query query);

    void r(ActionData actionData, f fVar, Query query);

    void s(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, c cVar, a aVar);

    void t(ModularAction modularAction, a aVar);

    void u(VoiceAction voiceAction);

    void v();

    void w(PersonDisambiguation personDisambiguation, Query query);

    void x(ActionData actionData);

    void y(ServiceEventData serviceEventData);

    void z(c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, h hVar, boolean z);
}
