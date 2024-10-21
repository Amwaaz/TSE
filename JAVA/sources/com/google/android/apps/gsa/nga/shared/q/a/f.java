package com.google.android.apps.gsa.nga.shared.q.a;

import com.google.android.apps.gsa.nga.shared.q.c;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/f.class */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final ha f977a = ha.w(bk.ANNOTATION_SENSITIVE, bk.DELIBERATE_INPUT_DETECTOR_SENSITIVE, bk.DIRECT_ACTIONS_LOOKUP_SENSITIVE, bk.DIRECT_ACTION_CALL_SENSITIVE, bk.EXECUTION_SENSITIVE, bk.FILTERED_UNDERSTANDING_SENSITIVE, new bk[]{bk.FULFILLMENT_ABORT_SENSITIVE, bk.FULFILLMENT_CANDIDATES_SENSITIVE, bk.FULFILLMENT_RESULT_SENSITIVE, bk.GENIE_REWRITE_SENSITIVE, bk.INTENT_GENERATORS_SENSITIVE, bk.OPA_EVENT, bk.QUERY_SENSITIVE});
    private static final ha b = ha.w(bk.ACCESS_DENIED, bk.ACTIVE_SEARCH_CLIENT, bk.ACTIVE_STATE, bk.APPLICATION_INFO, bk.ASSIST_LAYER_EVENT, bk.ATTENTION_HANDLER, new bk[]{bk.AUDIO_LIBRARY_MIC_EVENT, bk.BLACKLIST_RULE_CAUSED_QUERY_HANDOVER, bk.BLACKLIST_RULE_MATCHES_QUERY, bk.CLIENT_CONVERSATION_DONE, bk.CLOUD_FULFILLMENT_NGA_CLIENT_EVENT, bk.EXCEPTION, bk.EXECUTION_DONE, bk.EXECUTION_REJECTED, bk.GELLER_CACHE_LOOKUP_FOR_QUERY, bk.GESTURE_RECOGNIZER, bk.HARDWARE_SENSOR, bk.HOTWORD_RESTART_EVENT, bk.JINN_TIMING, bk.KEYBOARD_SERVICE_CONFIGURATION_EVENT, bk.KEYBOARD_SERVICE_EVENT, bk.KEYBOARD_SERVICE_MESSAGE_RECEIVED_EVENT, bk.KEYBOARD_SERVICE_MESSAGE_SENT_EVENT, bk.LOCKSCREEN_ARBITRATION, bk.MEMORY_STATS, bk.MESSAGING_NOTIFICATIONS_PERMISSIONS, bk.MIC_CONCURRENCY_STATUS, bk.MONITORING_EVENT, bk.MULTI_DEVICE_ARBITRATION, bk.MULTI_DEVICE_ARBITRATION_REQUIREMENT, bk.ON_DEVICE_ARBITRATION_RESPONSE_TIMING, bk.OPA_CONVERSATION_DELTA_PROCESSED, bk.OPA_FAILURE_DETECTED, bk.OPA_STATE_CHANGED, bk.PERFORMANCE_TIMING, bk.QUERY_STATE_COMMITTED, bk.SCREEN_STATE, bk.SEARCH_SERVICE_CLIENT_MANAGER, bk.SEARCH_SERVICE_CLIENT_USER, bk.SEARCH_SESSION_LIFECYCLE, bk.SESSION_ID, bk.SETTING_SLICE_ACTION, bk.SODA_SESSION_EVENT, bk.SPEECH_EVENT, bk.SPEECH_RECOGNITION_INITIALIZATION, bk.SPEECH_RECOGNITION_SWITCH, bk.SYNC_MANAGER_FILES_LOOKUP, bk.SYSTEM_HEALTH, bk.TRIGGERING, bk.UI_STATE, bk.VIS_DELEGATION_EVENT});

    @Override // com.google.android.apps.gsa.nga.shared.q.c
    public final boolean a(bl blVar) {
        ha haVar = b;
        bk a2 = bk.a(blVar.c);
        bk bkVar = a2;
        if (a2 == null) {
            bkVar = bk.UNKNOWN;
        }
        return !haVar.contains(bkVar);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.c
    public final boolean b(bl blVar) {
        ha haVar = b;
        bk a2 = bk.a(blVar.c);
        bk bkVar = a2;
        if (a2 == null) {
            bkVar = bk.UNKNOWN;
        }
        if (haVar.contains(bkVar)) {
            return true;
        }
        ha haVar2 = f977a;
        bk a3 = bk.a(blVar.c);
        bk bkVar2 = a3;
        if (a3 == null) {
            bkVar2 = bk.UNKNOWN;
        }
        return haVar2.contains(bkVar2);
    }
}
