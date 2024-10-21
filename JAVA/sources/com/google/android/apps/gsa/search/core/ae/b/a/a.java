package com.google.android.apps.gsa.search.core.ae.b.a;

import com.google.android.apps.gsa.search.core.ae.b.b;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
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
import com.google.common.base.at;
import com.google.common.util.concurrent.cn;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/b/a/a.class */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1070a;

    public a(e.a aVar) {
        this.f1070a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void A(c cVar, com.google.cs.d.a.a aVar) {
        ((h) this.f1070a.a()).c(new y(cVar, aVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void B(kc kcVar, UpdateVoiceActionUiEventParcelable updateVoiceActionUiEventParcelable) {
        ((h) this.f1070a.a()).c(new aa(kcVar, updateVoiceActionUiEventParcelable));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn C(VoiceAction voiceAction, ActionData actionData, Query query, com.google.android.apps.gsa.search.shared.actions.errors.a aVar, ClientConfig clientConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        g cVar = new c(voiceAction, actionData, query, aVar, clientConfig, z, z2, z3, z4, z5, z6);
        ((h) this.f1070a.a()).c(cVar);
        return cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn a(VoiceAction voiceAction, Query query) {
        g dVar = new d(voiceAction, query);
        ((h) this.f1070a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn c(PromptSegment promptSegment, String str, boolean z) {
        g eVar = new e(promptSegment, str, z);
        ((h) this.f1070a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn f(CardDecision cardDecision, int i, int i2, boolean z) {
        g fVar = new f(cardDecision, i, i2, z);
        ((h) this.f1070a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn g(VoiceAction voiceAction, Query query, at atVar) {
        g gVar = new g(voiceAction, query, atVar);
        ((h) this.f1070a.a()).c(gVar);
        return gVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn h(ModularAction modularAction, List list) {
        g hVar = new h(modularAction, list);
        ((h) this.f1070a.a()).c(hVar);
        return hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn i(ActionData actionData, af afVar, i iVar, Query query) {
        g jVar = new j(actionData, afVar, iVar, query);
        ((h) this.f1070a.a()).c(jVar);
        return jVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn j(VoiceAction voiceAction) {
        g oVar = new o(voiceAction);
        ((h) this.f1070a.a()).c(oVar);
        return oVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn k(Query query, ActionData actionData, PlaybackStatus playbackStatus, com.google.android.apps.gsa.search.core.m.a.a.a aVar, com.google.android.apps.gsa.search.core.m.a.c.a aVar2) {
        g qVar = new q(query, actionData, playbackStatus, aVar, aVar2);
        ((h) this.f1070a.a()).c(qVar);
        return qVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn l(Query query, ActionData actionData, PlaybackStatus playbackStatus, com.google.android.apps.gsa.search.core.m.a.a.a aVar, com.google.android.apps.gsa.search.core.m.a.c.a aVar2) {
        g rVar = new r(query, actionData, playbackStatus, aVar, aVar2);
        ((h) this.f1070a.a()).c(rVar);
        return rVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn m(Argument argument) {
        g sVar = new s(argument);
        ((h) this.f1070a.a()).c(sVar);
        return sVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final cn n(ActionData actionData, int i, int i2, boolean z, boolean z2, c cVar) {
        g xVar = new x(actionData, i, i2, z, z2, cVar);
        ((h) this.f1070a.a()).c(xVar);
        return xVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void o(c cVar) {
        ((h) this.f1070a.a()).c(new b(cVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void p(e eVar) {
        ((h) this.f1070a.a()).c(new i(eVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void q(VoiceAction voiceAction, ActionData actionData, CardDecision cardDecision, f fVar, Query query) {
        ((h) this.f1070a.a()).c(new k(voiceAction, actionData, cardDecision, fVar, query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void r(ActionData actionData, f fVar, Query query) {
        ((h) this.f1070a.a()).c(new l(actionData, fVar, query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void s(Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, c cVar, com.google.android.apps.gsa.search.core.ae.b.a aVar) {
        ((h) this.f1070a.a()).c(new m(query, actionData, voiceAction, cardDecision, cVar, aVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void t(ModularAction modularAction, com.google.android.apps.gsa.search.core.ae.b.a aVar) {
        ((h) this.f1070a.a()).c(new n(modularAction, aVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void u(VoiceAction voiceAction) {
        ((h) this.f1070a.a()).c(new p(voiceAction));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void v() {
        ((h) this.f1070a.a()).c(new t());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void w(PersonDisambiguation personDisambiguation, Query query) {
        ((h) this.f1070a.a()).c(new u(personDisambiguation, query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void x(ActionData actionData) {
        ((h) this.f1070a.a()).c(new v(actionData));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void y(ServiceEventData serviceEventData) {
        ((h) this.f1070a.a()).c(new w(serviceEventData));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.b.b
    public final void z(c cVar, ClientConfig clientConfig, Query query, ActionData actionData, VoiceAction voiceAction, CardDecision cardDecision, com.google.bf.a.h hVar, boolean z) {
        ((h) this.f1070a.a()).c(new z(cVar, clientConfig, query, actionData, voiceAction, cardDecision, hVar, z));
    }
}
