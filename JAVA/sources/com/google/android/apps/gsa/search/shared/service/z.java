package com.google.android.apps.gsa.search.shared.service;

import com.google.common.b.fd;
import com.google.common.b.gy;
import com.google.common.b.ha;
import java.util.EnumSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/z.class */
public final class z {

    /* renamed from: a */
    public static final ha f1361a = fd.b(EnumSet.of(com.google.android.apps.gsa.search.shared.service.c.ac.ACTIVITY_COMPLETED_WITH_RESULT, com.google.android.apps.gsa.search.shared.service.c.ac.CANVAS_WORKER_BINDER_REQUEST, com.google.android.apps.gsa.search.shared.service.c.ac.MONET_CLIENT_EVENT, com.google.android.apps.gsa.search.shared.service.c.ac.MONET_CLIENT_LIFECYCLE_EVENT));
    public static final ha b;
    public static final ha c;
    public static final ha d;
    public static final ha e;

    static {
        ha b2 = fd.b(EnumSet.of(com.google.android.apps.gsa.search.shared.service.c.ac.CACHE_BACKGROUND_RETRY, com.google.android.apps.gsa.search.shared.service.c.ac.DUMMY_BACKGROUND_TASK_EVENT, com.google.android.apps.gsa.search.shared.service.c.ac.GCM_MESSAGE_RECEIVED, com.google.android.apps.gsa.search.shared.service.c.ac.UPDATE_GSA_CONFIGS, com.google.android.apps.gsa.search.shared.service.c.ac.FETCH_CONFIGS_FROM_PHENOTYPE, com.google.android.apps.gsa.search.shared.service.c.ac.COMMON_BROADCAST_MESSAGE_RECEIVED, com.google.android.apps.gsa.search.shared.service.c.ac.BACKGROUND_TASK_STARTED, com.google.android.apps.gsa.search.shared.service.c.ac.PROPERTIES_UPDATE_IN_PHENOTYPE, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_DEVICE_INFO_PUBLISH, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_DOWNLOAD_LOW_THRESHOLD_HOTWORD_MODEL, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_HANDLE_VOICE_SEARCH_INTENT, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_START_ACTIVITY_REQUEST, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_STARTUP_PREF_CHANGED, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_PR_OR_HPR_PREF_CHANGED, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_CHANGE_HOTWORD_ENABLED_PREF, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_LOG_VE_EVENT, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_ALLOW_HEADPHONE_PR, com.google.android.apps.gsa.search.shared.service.c.ac.BACKUP_DATA, com.google.android.apps.gsa.search.shared.service.c.ac.RESTORE_DATA, com.google.android.apps.gsa.search.shared.service.c.ac.SMARTSPACE_READY_QUERY, com.google.android.apps.gsa.search.shared.service.c.ac.SMARTSPACE_GENERIC_UPDATE, com.google.android.apps.gsa.search.shared.service.c.ac.WIDGET_INTENT_RECEIVED, com.google.android.apps.gsa.search.shared.service.c.ac.DEVICE_BOOT, com.google.android.apps.gsa.search.shared.service.c.ac.APP_INSTALL, com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_SERVICE_CONNECTED, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_ACTIVE_NOTIFICATIONS, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_APP_NOTIFICATIONS, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_NEW_ACTIVE_NOTIFICATIONS, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_REMOVED_NOTIFICATIONS, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_MORRIS_NOTIFICATION, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_PARSED_MORRIS_NOTIFICATION, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_SINGLE_PARSED_MORRIS_NOTIFICATION, com.google.android.apps.gsa.search.shared.service.c.ac.NOTIFICATION_REPLY_RESULT, com.google.android.apps.gsa.search.shared.service.c.ac.BACKGROUND_ASSISTANT_CLIENT_SYNC_START, com.google.android.apps.gsa.search.shared.service.c.ac.DELIVER_PARSED_NOTIFICATIONS, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_REFRESH_ASSISTANT_SETTINGS, com.google.android.apps.gsa.search.shared.service.c.ac.BISTO_CLEANUP_DEVICE, com.google.android.apps.gsa.search.shared.service.c.ac.GACS_CLIENT_OP_RESULT));
        b = b2;
        gy gyVar = new gy();
        gyVar.j(b2);
        gyVar.h(com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_DETECTED_IN_INTERACTOR);
        gyVar.h(com.google.android.apps.gsa.search.shared.service.c.ac.APP_MOVED_TO_FOREGROUND);
        gyVar.h(com.google.android.apps.gsa.search.shared.service.c.ac.APP_MOVED_TO_BACKGROUND);
        c = gyVar.g();
        d = ha.w("nga", "lens_background", "bubble", "monet_multi_client", "pronunciationlearning", "test_multi_client_session", new String[]{"content_provider", "customtabs", "legacy_http_engine", "now_opt_in", "media_browser", "pcp"});
        e = fd.b(EnumSet.of(com.google.android.apps.gsa.search.shared.service.c.ac.VOICE_SEARCH_HANDS_FREE, com.google.android.apps.gsa.search.shared.service.c.ac.TTS_STOP_SPEAKING, com.google.android.apps.gsa.search.shared.service.c.ac.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED, com.google.android.apps.gsa.search.shared.service.c.ac.EXTERNAL_VOICE_ASSIST, com.google.android.apps.gsa.search.shared.service.c.ac.SCREEN_STATE_CHANGE, com.google.android.apps.gsa.search.shared.service.c.ac.REFRESH_SERVICE_STATE));
    }
}
