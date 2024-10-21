package com.google.android.apps.gsa.nga.engine.ap.a;

import com.google.android.apps.gsa.nga.engine.ap.a;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.da;
import com.google.android.apps.gsa.nga.shared.q.d.db;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.common.b.fq;
import com.google.common.base.ci;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ap/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f468a;
    public final a b;
    public final ci c;
    public final com.google.android.apps.gsa.nga.engine.at.d.a d;
    private final d e;
    private final Optional f;

    public b(d dVar, a aVar, ci ciVar, Optional optional, com.google.android.apps.gsa.nga.engine.at.d.a aVar2) {
        fq fqVar = new fq(4);
        fqVar.i(w.NGA_SPEECH_HANDLER_MIC_OPENED, db.NGA_SPEECH_HANDLER_MIC_OPENED);
        fqVar.i(w.NGA_FULFILLMENT_SUCCESS, db.NGA_FULFILLMENT_SUCCESS);
        fqVar.i(w.NGA_EXPLICIT_TRIGGER_SQUEEZE, db.NGA_EXPLICIT_TRIGGER_SQUEEZE);
        fqVar.i(w.NGA_EXPLICIT_TRIGGER_MIC_TAP, db.NGA_EXPLICIT_TRIGGER_MIC_TAP);
        fqVar.i(w.NGA_EXPLICIT_TRIGGER_HOTWORD, db.NGA_EXPLICIT_TRIGGER_HOTWORD);
        fqVar.i(w.NGA_UNKNOWN_RECOGNITION_START, db.NGA_UNKNOWN_RECOGNITION_START);
        fqVar.i(w.NGA_RECOGNITION_CANDIDATE_START, db.NGA_RECOGNITION_CANDIDATE_START);
        fqVar.i(w.NGA_RECOGNITION_END, db.NGA_RECOGNITION_END);
        fqVar.i(w.NGA_CONTEXTUAL_INITIALIZATION_START, db.NGA_CONTEXTUAL_INITIALIZATION_START);
        fqVar.i(w.NGA_CONTEXTUAL_INITIALIZATION_SUCCESS, db.NGA_CONTEXTUAL_INITIALIZATION_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_INITIALIZATION_FAILURE, db.NGA_CONTEXTUAL_INITIALIZATION_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_PROCESSING_START, db.NGA_CONTEXTUAL_PROCESSING_START);
        fqVar.i(w.NGA_CONTEXTUAL_PROCESSING_SUCCESS, db.NGA_CONTEXTUAL_PROCESSING_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_PROCESSING_FAILURE, db.NGA_CONTEXTUAL_PROCESSING_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_CHIPS_MENDEL_DISABLED, db.NGA_CONTEXTUAL_CHIPS_MENDEL_DISABLED);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_START, db.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_START);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_FAILURE, db.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_SUCCESS, db.NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_START, db.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_START);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_FAILURE, db.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_SUCCESS, db.NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_ACTION_SUGGESTION_START, db.NGA_CONTEXTUAL_ACTION_SUGGESTION_START);
        fqVar.i(w.NGA_CONTEXTUAL_ACTION_SUGGESTION_SUCCESS, db.NGA_CONTEXTUAL_ACTION_SUGGESTION_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_ACTION_SUGGESTION_FAILURE, db.NGA_CONTEXTUAL_ACTION_SUGGESTION_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_START, db.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_START);
        fqVar.i(w.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_SUCCESS, db.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_SUCCESS);
        fqVar.i(w.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_FAILURE, db.NGA_CONTEXTUAL_INTENT_CLASSIFICATION_FAILURE);
        fqVar.i(w.NGA_CONTEXTUAL_FALLBACK_INITIATED, db.NGA_CONTEXTUAL_FALLBACK_INITIATED);
        fqVar.i(w.NGA_CONTEXTUAL_CHIP_PRODUCED, db.NGA_CONTEXTUAL_CHIP_PRODUCED);
        fqVar.i(w.NGA_CONTEXTUAL_CHIP_NOT_PRODUCED, db.NGA_CONTEXTUAL_CHIP_NOT_PRODUCED);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START, db.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_SUCCESS, db.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_SUCCESS);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_FAILURE, db.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_FAILURE);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_FRAMEWORK_CROSSWALK_DISABLED, db.NGA_SCREEN_ANNOTATION_FRAMEWORK_CROSSWALK_DISABLED);
        fqVar.i(w.NGA_SCREEN_PARSING_START, db.NGA_SCREEN_PARSING_START);
        fqVar.i(w.NGA_SCREEN_PARSING_SUCCESS, db.NGA_SCREEN_PARSING_SUCCESS);
        fqVar.i(w.NGA_SCREEN_PARSING_FAILURE, db.NGA_SCREEN_PARSING_FAILURE);
        fqVar.i(w.NGA_SCREEN_OCR_START, db.NGA_SCREEN_OCR_START);
        fqVar.i(w.NGA_SCREEN_OCR_FAILURE, db.NGA_SCREEN_OCR_FAILURE);
        fqVar.i(w.NGA_SCREEN_OCR_SUCCESS, db.NGA_SCREEN_OCR_SUCCESS);
        fqVar.i(w.NGA_SCREEN_PRE_ANNOTATION_START, db.NGA_SCREEN_PRE_ANNOTATION_START);
        fqVar.i(w.NGA_SCREEN_PRE_ANNOTATION_END, db.NGA_SCREEN_PRE_ANNOTATION_END);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_START, db.NGA_SCREEN_ANNOTATION_START);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_SUCCESS, db.NGA_SCREEN_ANNOTATION_SUCCESS);
        fqVar.i(w.NGA_SCREEN_ANNOTATION_FAILURE, db.NGA_SCREEN_ANNOTATION_FAILURE);
        this.f468a = new HashMap((Map) fqVar.h(false));
        this.e = dVar;
        this.b = aVar;
        this.c = ciVar;
        this.f = optional;
        this.d = aVar2;
    }

    public final void a(ba baVar, String str, String str2) {
        if (str != null) {
            baVar.copyOnWrite();
            da daVar = baVar.instance;
            da daVar2 = da.a;
            daVar.b |= 2;
            daVar.d = str;
        }
        if (str2 != null) {
            baVar.copyOnWrite();
            da daVar3 = baVar.instance;
            da daVar4 = da.a;
            daVar3.b |= 4;
            daVar3.e = str2;
        }
        da build = baVar.build();
        d dVar = this.e;
        synchronized (dVar) {
            dVar.f469a.add(build);
        }
        ba createBuilder = bj.a.createBuilder();
        createBuilder.copyOnWrite();
        bj bjVar = createBuilder.instance;
        build.getClass();
        bjVar.c = build;
        bjVar.b = 56;
        bj build2 = createBuilder.build();
        ba createBuilder2 = ah.a.createBuilder();
        if ((build.b & 2) != 0) {
            String str3 = build.d;
            createBuilder2.copyOnWrite();
            ah ahVar = createBuilder2.instance;
            str3.getClass();
            ahVar.b |= 2;
            ahVar.d = str3;
        }
        if ((build.b & 4) != 0) {
            String str4 = build.e;
            createBuilder2.copyOnWrite();
            ah ahVar2 = createBuilder2.instance;
            str4.getClass();
            ahVar2.b |= 1;
            ahVar2.c = str4;
        }
        dVar.b.b(bk.SYSTEM_HEALTH, build2, (ah) createBuilder2.build());
        db a2 = db.a(build.c);
        db dbVar = a2;
        if (a2 == null) {
            dbVar = db.NGA_EXPLICIT_TRIGGER_SQUEEZE;
        }
        dbVar.name();
        long j = build.f;
        this.f.ifPresent(new a(this, build));
    }
}
