package com.google.android.apps.gsa.opa.smartspace;

import com.google.android.apps.gsa.w.a;
import com.google.android.apps.gsa.w.a.e;
import com.google.common.b.fq;
import com.google.common.b.fu;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/smartspace/p.class */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final fu f1028a;

    public p(a aVar) {
        com.google.android.apps.gsa.s.a aVar2 = com.google.android.apps.gsa.s.a.SMARTSPACE_ALARM_SUGGESTIONS_LATENCY_MILLIS;
        com.google.android.apps.gsa.s.a aVar3 = com.google.android.apps.gsa.s.a.SMARTSPACE_FEATURE_ASSISTANT_SHOPPING_LIST_COUNT;
        com.google.android.apps.gsa.s.a aVar4 = com.google.android.apps.gsa.s.a.SMARTSPACE_FEATURE_GPAY_LOYALTY_CARD_COUNT;
        com.google.android.apps.gsa.s.a aVar5 = com.google.android.apps.gsa.s.a.SMARTSPACE_FEATURE_KEEP_SHOPPING_LIST_COUNT;
        com.google.android.apps.gsa.s.a aVar6 = com.google.android.apps.gsa.s.a.SMARTSPACE_FEATURE_KEEP_SLICEPROVIDER_COUNT;
        com.google.android.apps.gsa.s.a aVar7 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_ACTIVITIES_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar8 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_AWAKE_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar9 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_CAST_DEVICE_FOUND;
        com.google.android.apps.gsa.s.a aVar10 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_HOME_AUTOMATION_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar11 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_CAFE_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar12 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_GAS_STATION_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar13 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_PARKING_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar14 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_RESTAURANT_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar15 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_SHOPPING_CENTER_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar16 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_STORE_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar17 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_LOCATION_TRANSIT_STATION_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar18 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_MEDIA_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar19 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_MEDIA_PROFILE_AGE_SECONDS;
        com.google.android.apps.gsa.s.a aVar20 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_ON_FIRST_ACCESS_PRESENT;
        com.google.android.apps.gsa.s.a aVar21 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_ON_FIRST_ACCESS_FAILURE;
        com.google.android.apps.gsa.s.a aVar22 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_PERSONALIZATION_ENABLED_STATUS;
        com.google.android.apps.gsa.s.a aVar23 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_PROFILES_PRESENT;
        com.google.android.apps.gsa.s.a aVar24 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_PROFILES_FAILURE;
        com.google.android.apps.gsa.s.a aVar25 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_SHOPPING_PROFILE_PRESENT;
        com.google.android.apps.gsa.s.a aVar26 = com.google.android.apps.gsa.s.a.SMARTSPACE_HABITS_TIME_SPENT_RATIO_THRESHOLD_EXCEEDED_RATE;
        com.google.android.apps.gsa.s.a aVar27 = com.google.android.apps.gsa.s.a.SMARTSPACE_HYBRID_HOTSEAT_SUGGESTION_COUNT;
        com.google.android.apps.gsa.s.a aVar28 = com.google.android.apps.gsa.s.a.SMARTSPACE_HYBRID_HOTSEAT_SUGGESTION_CONTEXT_COUNT;
        com.google.android.apps.gsa.s.a aVar29 = com.google.android.apps.gsa.s.a.SMARTSPACE_HAMMERSPACE_INDEX_DOWNLOAD_COUNT;
        com.google.android.apps.gsa.s.a aVar30 = com.google.android.apps.gsa.s.a.SMARTSPACE_HAMMERSPACE_SLICES_DOWNLOAD_COUNT;
        com.google.android.apps.gsa.s.a aVar31 = com.google.android.apps.gsa.s.a.SMARTSPACE_HEURISTIC_CLEAR_CHIP_COUNT;
        com.google.android.apps.gsa.s.a aVar32 = com.google.android.apps.gsa.s.a.SMARTSPACE_HEURISTIC_THROTTLING_COUNT;
        com.google.android.apps.gsa.s.a aVar33 = com.google.android.apps.gsa.s.a.SMARTSPACE_HEURISTIC_WIFI_COUNT;
        com.google.android.apps.gsa.s.a aVar34 = com.google.android.apps.gsa.s.a.SMARTSPACE_LOCATION_INFERENCE_FRESH_COUNT;
        com.google.android.apps.gsa.s.a aVar35 = com.google.android.apps.gsa.s.a.SMARTSPACE_LOCATION_INFERENCE_LAST_COUNT;
        com.google.android.apps.gsa.s.a aVar36 = com.google.android.apps.gsa.s.a.SMARTSPACE_LOCATION_INFERENCE_LATENCY_MILLIS;
        com.google.android.apps.gsa.s.a aVar37 = com.google.android.apps.gsa.s.a.SMARTSPACE_SEARCH_PROCESS_DOWN_COUNT;
        com.google.android.apps.gsa.s.a aVar38 = com.google.android.apps.gsa.s.a.SMARTSPACE_SEARCH_PROCESS_STARTED_COUNT;
        com.google.android.apps.gsa.s.a aVar39 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_HEADPHONE_COUNT;
        com.google.android.apps.gsa.s.a aVar40 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LAUNCHER_VISIBILITY_COUNT;
        com.google.android.apps.gsa.s.a aVar41 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_COUNT;
        com.google.android.apps.gsa.s.a aVar42 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_DISCARD_COUNT;
        com.google.android.apps.gsa.s.a aVar43 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_LATENCY_MILLIS;
        com.google.android.apps.gsa.s.a aVar44 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_MAX_AGE_DISCARD_COUNT;
        com.google.android.apps.gsa.s.a aVar45 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_SPEED_LIMIT_DISCARD_COUNT;
        com.google.android.apps.gsa.s.a aVar46 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_LOCATION_UPDATE_TIMEOUT_COUNT;
        com.google.android.apps.gsa.s.a aVar47 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_SCREEN_ON_COUNT;
        com.google.android.apps.gsa.s.a aVar48 = com.google.android.apps.gsa.s.a.SMARTSPACE_TRIGGER_TIME_TICK_COUNT;
        com.google.android.apps.gsa.s.a aVar49 = com.google.android.apps.gsa.s.a.SMARTSPACE_WIDGET_SIZE_DIP;
        com.google.android.apps.gsa.s.a aVar50 = com.google.android.apps.gsa.s.a.SMARTSPACE_CHIME_REGISTRATION_TRIGGER;
        com.google.android.apps.gsa.s.a aVar51 = com.google.android.apps.gsa.s.a.SMARTSPACE_CHIME_REGISTRATION_FAILURE;
        com.google.android.apps.gsa.s.a aVar52 = com.google.android.apps.gsa.s.a.SMARTSPACE_CHIME_REGISTRATION_SUCCESS;
        com.google.android.apps.gsa.s.a aVar53 = com.google.android.apps.gsa.s.a.SMARTSPACE_CHIME_REGISTRATION_WORKER_ENQUEUE_FAILURE;
        com.google.android.apps.gsa.s.a aVar54 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_PERIODIC_POLLING_TASK_TRIGGER;
        com.google.android.apps.gsa.s.a aVar55 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_PERIODIC_POLLING_REQUEST_START_EVENT;
        com.google.android.apps.gsa.s.a aVar56 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_UPDATE_REQUEST;
        com.google.android.apps.gsa.s.a aVar57 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_UPDATE_ACTION;
        com.google.android.apps.gsa.s.a aVar58 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_UPDATE_STORAGE;
        com.google.android.apps.gsa.s.a aVar59 = com.google.android.apps.gsa.s.a.SMARTSPACE_WEATHER_SEND_SURFACE;
        com.google.android.apps.gsa.s.a aVar60 = com.google.android.apps.gsa.s.a.PCP_SMARTSPACE_WEATHER_UPDATE;
        com.google.android.apps.gsa.s.a aVar61 = com.google.android.apps.gsa.s.a.PCP_SMARTSPACE_WEATHER_NOTIFICATION;
        com.google.android.apps.gsa.s.a aVar62 = com.google.android.apps.gsa.s.a.SMARTSPACE_CALENDAR_UPDATE_REQUEST;
        com.google.android.apps.gsa.s.a aVar63 = com.google.android.apps.gsa.s.a.SMARTSPACE_CALENDAR_UPDATE_STORAGE;
        com.google.android.apps.gsa.s.a aVar64 = com.google.android.apps.gsa.s.a.SMARTSPACE_CALENDAR_SEND_SURFACE;
        com.google.android.apps.gsa.s.a aVar65 = com.google.android.apps.gsa.s.a.PCP_SMARTSPACE_CALENDAR_NOTIFICATION;
        com.google.android.apps.gsa.s.a aVar66 = com.google.android.apps.gsa.s.a.SMARTSPACE_CALENDAR_UPDATE_THIRD_PARTY;
        com.google.android.apps.gsa.s.a aVar67 = com.google.android.apps.gsa.s.a.SMARTSPACE_CALENDAR_UPDATE_WORK_PROFILE;
        fq fqVar = new fq(4);
        for (int i = 0; i < 66; i++) {
            com.google.android.apps.gsa.s.a aVar68 = new com.google.android.apps.gsa.s.a[]{aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54, aVar55, aVar56, aVar57, aVar58, aVar59, aVar60, aVar61, aVar62, aVar63, aVar64, aVar65, aVar66, aVar67}[i];
            fqVar.i(aVar68, aVar.f(aVar68, com.google.android.apps.gsa.s.c.GRAPH_OPA_SMARTSPACE_LOCATION));
        }
        this.f1028a = fqVar.h(false);
    }

    public final void a(com.google.android.apps.gsa.s.a aVar, long j) {
        if (!this.f1028a.containsKey(aVar)) {
            throw new IllegalArgumentException(String.format("Metric %s is not tracked by SmartspaceTelemetry.", aVar.name()));
        }
        ((e) this.f1028a.get(aVar)).g(j);
    }
}
