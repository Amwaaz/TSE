package com.google.android.apps.gsa.search.shared.service.c;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/c/hf.class */
public enum hf implements bo {
    ATTACH_WEBVIEW(1),
    SHOW_WEBVIEW(63),
    HIDE_WEBVIEW(64),
    CLIENT_NOT_ACTIVATED(7),
    ATTACH_MATERIAL_PROGRESS_BAR(14),
    BACK_PRESS(16),
    CANVAS_WORKER_BINDER_RESPONSE(18),
    UPDATE_PROGRESS_AMOUNT(24),
    UPDATE_LOGO_HEADER_VISIBILITY(26),
    HAND_OVER(29),
    SHOW_PROGRESS(30),
    NOTIFY_COMPLETED_CONVERSATION(32),
    NOTIFY_STARTED_CONVERSATION(33),
    INIT_NOW_UI(35),
    REQUEST_LOG_UPDATE_CARD_IMPRESSION(38),
    UNDO_ACTION_USER_INTERACTION(39),
    UPDATE_CONVERSATION_STATE(42),
    DUMMY_EVENT(43),
    TTS_RESULT_EVENT(44),
    HANDSFREE_EVENT(47),
    SHOW_PROMPT(48),
    REPLACE_SEARCH_BOX_TEXT(180),
    SET_QUERY(49),
    START_ACTIVITY_FOR_RESULT(51),
    ON_SERVICE_CONNECTED(57),
    ON_SERVICE_DISCONNECTED(58),
    UPDATE_ACTION_DATA(60),
    UPDATE_CURRENT_NETWORK_TYPE(67),
    VOICE_SEARCH_DONE(74),
    TTS_PLAYBACK_DONE(76),
    TTS_PLAYBACK_STARTED(77),
    FOCUS_QUERY_AND_SHOW_KEYBOARD(78),
    UNFOCUS_QUERY_AND_HIDE_KEYBOARD(79),
    FORCE_CLOSE(82),
    UPDATE_ACTION_UI(84),
    AMP_VIEWER_SUPPORT_RESPONSE(85),
    ON_HOTWORD_DETECTION_ERROR(88),
    SHOW_HOTWORD_TRIGGERED(94),
    HANDLE_SUGGEST_RESPONSE(95),
    ON_SOUND_SEARCH_RESULT(97),
    UPDATE_TOP_VOICE_ACTION(98),
    SET_FINAL_RECOGNIZED_TEXT(99),
    UPDATE_RECOGNIZED_TEXT(100),
    SHOW_RECOGNITION_STATE(102),
    SHOW_ERROR(103),
    ON_AUDIO_RECORDING_AVAILABLE(104),
    SET_SEARCH_PLATE_MODE(105),
    START_ACTIVITY(106),
    SET_EXTERNAL_FLAGS(107),
    ON_TRANSCRIPTION_UPDATE(108),
    UPDATE_TIMESTAMP_UI(110),
    SHOW_VOICE_ACTIONS(111),
    NOTIFY_DEVICE_SELECTION_SUPPRESSION(113),
    SHOW_DISPLAY_SEGMENT(115),
    SHOW_ASSISTANT_RESPONSE(116),
    MONET_SERVICE_EVENT(117),
    UPDATE_VOICE_ACTION_UI(118),
    START_OF_SPEECH(119),
    HANDLE_CONTEXTUAL_CARDS(120),
    ON_TELEPHONY_OBTAINED(121),
    ON_TELEPHONY_LOST(122),
    DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE(123),
    COMMIT_TO_TOUCH_ON_PAUSE(126),
    NO_SPEECH_DETECTED(132),
    SHOW_MESSAGE_UI(133),
    HIDE_MESSAGE_UI(134),
    UPDATE_MEDIA_EXECUTION(135),
    UPDATE_SPEECH_EVENT(136),
    UNBIND_BACKGROUND_CLIENT(141),
    CONVERSATION_SURFACE_EVENT(142),
    ASSISTANT_REQUEST_ID(202),
    UPDATE_SEARCHBOX_HINT_TEXT(143),
    SHOW_DATA_SAVER_ENABLED_DIALOG(145),
    SHOW_NOTIFICATIONS_DISABLED_DIALOG(146),
    PRONUNCIATION_LEARNING_DONE(148),
    FINGERPRINT_AUTH_SERVICE_EVENT(150),
    REAUTH_SERVICE_EVENT(151),
    SCROLL_MAIN_CONTENT(152),
    OPA_DELETE_HISTORY_ENTRIES(153),
    SHOW_BACKGROUND_RETRY_ONBOARDING(154),
    OPA_KEEP_SCREEN_ON(220),
    OPA_RESPONSE_SHERLOG_ENTRIES(182),
    COMMON_CONTENT_PROVIDER_QUERY_RESPONSE(184),
    COMMON_CONTENT_PROVIDER_GET_TYPE_RESPONSE(185),
    COMMON_CONTENT_PROVIDER_INSERT_RESPONSE(186),
    COMMON_CONTENT_PROVIDER_OPEN_FILE_RESPONSE(189),
    CONVERSATION_DELTA_PROCESSED(194),
    CONVERSATION_PARAMS_RECEIVED(312),
    HANDLE_HOTWORD_QUERY(200),
    SEND_MEDIA_SESSION_TOKEN(203),
    HANDLE_DEEPLINK_DONE(204),
    OPA_STARTED(205),
    RSS_GMM_COMMUTE_QUERY_RESPONSE(206),
    NEW_ASSISTANT_RESPONSE_RECEIVED(218),
    OPA_CONVERSATION_CANCELLED(219),
    OPA_UI_SHOW_SUGGESTIONS(221),
    ACTIONS_RENDERING_DONE(223),
    OPA_ZERO_STATE_RESPONSE(227),
    SESSION_SEARCH_GRAPH_START(228),
    WEB_ANSWER_HISTORY_RESPONSE(232),
    TAPAS_VAC_RESPONSE(297),
    TAPAS_SERVICE_RESPONSE(304),
    OPA_EYES_CAMERA_STATE(233),
    LENS_SERVICE_API_VERSION(240),
    OPA_SESSION_SERVICE_EVENT(241),
    NOTIFY_COMPLETED_ASSISTANT_CONVERSATION(242),
    NOTIFY_OPA_LAUNCH_FOR_SEARCH_RESULTS(243),
    SMARTSPACE_READY_QUERY_RESPONSE(244),
    HTTP_SESSION_SERVICE_EVENT(245),
    NETWORK_CONNECTIVITY(246),
    HIDE_BACKGROUND_RETRY_DIALOGS(247),
    GO_BACK_FOR_LAUNCHING_EXTERNAL_ACTIVITY(248),
    MEDIA_BROWSER_FETCHED_MEDIA_SESSION_TOKEN(249),
    MEDIA_BROWSER_LOADED_CHILDEN(250),
    OPEN_ANDROID_NOTIFICATION_SETTINGS(251),
    LENS_FILTER_CONTEXT_UPDATED(261),
    LENS_FILTER_DETECTED_CONTEXT_SERVICE_EVENT(267),
    LENS_SERVICE_LENS_VIEW_SERVICE_EVENT(253),
    LENS_LITE_SERVICE_EVENT(256),
    LENS_SERVICE_RESPONSE_PENDING_INTENT(268),
    SESSION_STARTED(254),
    OPA_TV_RECOMMENDATIONS_RESPONSE(255),
    OPA_TV_SEARCH_TAB_RESPONSE(295),
    OPA_NOTIFY_NO_CARD_IN_RESPONSE(259),
    OPA_NOTIFY_DISPLAY_PHOTOS_IN_RESPONSE(282),
    NOTIFICATIONS_FROM_ALTERNATIVE_SOURCE_REQUESTED(260),
    NGA_UI_ACTION_RESULT_EVENT(262),
    CAR_ASSISTANT_NETWORK_STATE(263),
    CONTACT_UPLOAD_RESPONSE(265),
    VALID_UNREAD_MESSAGES(266),
    NOTIFY_MEDIA_CONTROL(269),
    TTS_TIMEPOINT_EVENT(270),
    CARD_DECISION_CONTAINING_TTS(271),
    PROVIDE_MDD_FILE_GROUP(273),
    NOW_ELIGIBILITY_RESPONSE(276),
    GACS_EXECUTE_EVENT(277),
    MEDIA_RECOMMENDATION_RESPONSE(278),
    NGA_SERVICE_EVENT(279),
    SET_TISID_VALIDATION_RESULT(280),
    OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE(281),
    NOTIFY_STARTED_ASSISTANT_CONVERSATION(284),
    BISTO_CUSTOM_DEVICE_ACTION(285),
    NOTIFY_ASSISTANT_CONVERSATION_ONGOING(286),
    BISTO_NOTIFY_COMPLETED_CONVERSATION(287),
    BISTO_FORCE_CLOSE(288),
    BISTO_NOTIFY_REQUEST_FOLLOW_ON(289),
    BISTO_TTS_RESULT_EVENT(290),
    BISTO_SET_FINAL_RECOGNIZED_TEXT(291),
    BISTO_UPDATE_RECOGNIZED_TEXT(292),
    BISTO_NO_SPEECH_DETECTED(293),
    BISTO_VOICE_SEARCH_DONE(294),
    BISTO_PR_REQUEST_PERMISSION(316),
    BISTO_START_OF_SPEECH_DETECTED(325),
    EXPLORE_ON_CONTENT_RESPONSE(296),
    LENS_SERVICE_SDK_SERVICE_EVENT(298),
    LENS_SERVICE_SESSION_STARTED(310),
    LENS_SERVICE_START_STREAMING_RESPONSE(311),
    SET_SEARCH_PLATE_VOICE_SEARCH_LANGUAGE(299),
    CONTINUOUS_MATCH_STARTED(300),
    CONTINUOUS_MATCH_STOPPED(301),
    GET_EMAIL_THREADS(302),
    ACTION_RECEIVED_EVENT(305),
    AUTO_QUERY_COMMIT(306),
    CAR_ASSISTANT_COLD_BOOT_NOT_READY(307),
    CAR_ASSISTANT_COLD_BOOT_STILL_NOT_READY(308),
    COORDINATED_EXPERIMENT_EVENT(309),
    GET_ICING_DATA(313),
    CAR_ASSISTANT_QUERY_RESEND(314),
    MORRIS_HOTWORD(315),
    LANGUAGE_SWITCHER_NUDGE_TTS_PLAYBACK_COMPLETE(317),
    NO_DATA_SUBSCRIPTION(319),
    SHOW_LOCATION_PERMISSIONS_SNACKBAR(320),
    CAR_ASSISTANT_SMART_ACTIONS(321),
    END_OF_CONVERSATION_TURN(322),
    QUERY_OPAQUE_TOKEN(323),
    SHOW_AADC_LOCATION_SETTINGS_CHANGED_SNACKBAR(324),
    MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_STARTED(326),
    MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_DONE(327),
    GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION(329);

    public final int cx;

    hf(int i) {
        this.cx = i;
    }

    public static hf a(int i) {
        switch (i) {
            case 1:
                return ATTACH_WEBVIEW;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
            case 46:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            case 61:
            case 62:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 75:
            case 80:
            case 81:
            case 83:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 101:
            case 109:
            case 112:
            case 114:
            case 124:
            case 125:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 183:
            case 187:
            case 188:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 231:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 252:
            case 257:
            case 258:
            case 264:
            case 272:
            case 274:
            case 275:
            case 283:
            case 303:
            case 318:
            case 328:
            default:
                return null;
            case 7:
                return CLIENT_NOT_ACTIVATED;
            case 14:
                return ATTACH_MATERIAL_PROGRESS_BAR;
            case 16:
                return BACK_PRESS;
            case 18:
                return CANVAS_WORKER_BINDER_RESPONSE;
            case 24:
                return UPDATE_PROGRESS_AMOUNT;
            case 26:
                return UPDATE_LOGO_HEADER_VISIBILITY;
            case 29:
                return HAND_OVER;
            case 30:
                return SHOW_PROGRESS;
            case 32:
                return NOTIFY_COMPLETED_CONVERSATION;
            case 33:
                return NOTIFY_STARTED_CONVERSATION;
            case 35:
                return INIT_NOW_UI;
            case 38:
                return REQUEST_LOG_UPDATE_CARD_IMPRESSION;
            case 39:
                return UNDO_ACTION_USER_INTERACTION;
            case 42:
                return UPDATE_CONVERSATION_STATE;
            case 43:
                return DUMMY_EVENT;
            case 44:
                return TTS_RESULT_EVENT;
            case 47:
                return HANDSFREE_EVENT;
            case 48:
                return SHOW_PROMPT;
            case 49:
                return SET_QUERY;
            case 51:
                return START_ACTIVITY_FOR_RESULT;
            case 57:
                return ON_SERVICE_CONNECTED;
            case 58:
                return ON_SERVICE_DISCONNECTED;
            case 60:
                return UPDATE_ACTION_DATA;
            case 63:
                return SHOW_WEBVIEW;
            case 64:
                return HIDE_WEBVIEW;
            case 67:
                return UPDATE_CURRENT_NETWORK_TYPE;
            case 74:
                return VOICE_SEARCH_DONE;
            case 76:
                return TTS_PLAYBACK_DONE;
            case 77:
                return TTS_PLAYBACK_STARTED;
            case 78:
                return FOCUS_QUERY_AND_SHOW_KEYBOARD;
            case 79:
                return UNFOCUS_QUERY_AND_HIDE_KEYBOARD;
            case 82:
                return FORCE_CLOSE;
            case 84:
                return UPDATE_ACTION_UI;
            case 85:
                return AMP_VIEWER_SUPPORT_RESPONSE;
            case 88:
                return ON_HOTWORD_DETECTION_ERROR;
            case 94:
                return SHOW_HOTWORD_TRIGGERED;
            case 95:
                return HANDLE_SUGGEST_RESPONSE;
            case 97:
                return ON_SOUND_SEARCH_RESULT;
            case 98:
                return UPDATE_TOP_VOICE_ACTION;
            case 99:
                return SET_FINAL_RECOGNIZED_TEXT;
            case 100:
                return UPDATE_RECOGNIZED_TEXT;
            case 102:
                return SHOW_RECOGNITION_STATE;
            case 103:
                return SHOW_ERROR;
            case 104:
                return ON_AUDIO_RECORDING_AVAILABLE;
            case 105:
                return SET_SEARCH_PLATE_MODE;
            case 106:
                return START_ACTIVITY;
            case 107:
                return SET_EXTERNAL_FLAGS;
            case 108:
                return ON_TRANSCRIPTION_UPDATE;
            case 110:
                return UPDATE_TIMESTAMP_UI;
            case 111:
                return SHOW_VOICE_ACTIONS;
            case 113:
                return NOTIFY_DEVICE_SELECTION_SUPPRESSION;
            case 115:
                return SHOW_DISPLAY_SEGMENT;
            case 116:
                return SHOW_ASSISTANT_RESPONSE;
            case 117:
                return MONET_SERVICE_EVENT;
            case 118:
                return UPDATE_VOICE_ACTION_UI;
            case 119:
                return START_OF_SPEECH;
            case 120:
                return HANDLE_CONTEXTUAL_CARDS;
            case 121:
                return ON_TELEPHONY_OBTAINED;
            case 122:
                return ON_TELEPHONY_LOST;
            case 123:
                return DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE;
            case 126:
                return COMMIT_TO_TOUCH_ON_PAUSE;
            case 132:
                return NO_SPEECH_DETECTED;
            case 133:
                return SHOW_MESSAGE_UI;
            case 134:
                return HIDE_MESSAGE_UI;
            case 135:
                return UPDATE_MEDIA_EXECUTION;
            case 136:
                return UPDATE_SPEECH_EVENT;
            case 141:
                return UNBIND_BACKGROUND_CLIENT;
            case 142:
                return CONVERSATION_SURFACE_EVENT;
            case 143:
                return UPDATE_SEARCHBOX_HINT_TEXT;
            case 145:
                return SHOW_DATA_SAVER_ENABLED_DIALOG;
            case 146:
                return SHOW_NOTIFICATIONS_DISABLED_DIALOG;
            case 148:
                return PRONUNCIATION_LEARNING_DONE;
            case 150:
                return FINGERPRINT_AUTH_SERVICE_EVENT;
            case 151:
                return REAUTH_SERVICE_EVENT;
            case 152:
                return SCROLL_MAIN_CONTENT;
            case 153:
                return OPA_DELETE_HISTORY_ENTRIES;
            case 154:
                return SHOW_BACKGROUND_RETRY_ONBOARDING;
            case 180:
                return REPLACE_SEARCH_BOX_TEXT;
            case 182:
                return OPA_RESPONSE_SHERLOG_ENTRIES;
            case 184:
                return COMMON_CONTENT_PROVIDER_QUERY_RESPONSE;
            case 185:
                return COMMON_CONTENT_PROVIDER_GET_TYPE_RESPONSE;
            case 186:
                return COMMON_CONTENT_PROVIDER_INSERT_RESPONSE;
            case 189:
                return COMMON_CONTENT_PROVIDER_OPEN_FILE_RESPONSE;
            case 194:
                return CONVERSATION_DELTA_PROCESSED;
            case 200:
                return HANDLE_HOTWORD_QUERY;
            case 202:
                return ASSISTANT_REQUEST_ID;
            case 203:
                return SEND_MEDIA_SESSION_TOKEN;
            case 204:
                return HANDLE_DEEPLINK_DONE;
            case 205:
                return OPA_STARTED;
            case 206:
                return RSS_GMM_COMMUTE_QUERY_RESPONSE;
            case 218:
                return NEW_ASSISTANT_RESPONSE_RECEIVED;
            case 219:
                return OPA_CONVERSATION_CANCELLED;
            case 220:
                return OPA_KEEP_SCREEN_ON;
            case 221:
                return OPA_UI_SHOW_SUGGESTIONS;
            case 223:
                return ACTIONS_RENDERING_DONE;
            case 227:
                return OPA_ZERO_STATE_RESPONSE;
            case 228:
                return SESSION_SEARCH_GRAPH_START;
            case 232:
                return WEB_ANSWER_HISTORY_RESPONSE;
            case 233:
                return OPA_EYES_CAMERA_STATE;
            case 240:
                return LENS_SERVICE_API_VERSION;
            case 241:
                return OPA_SESSION_SERVICE_EVENT;
            case 242:
                return NOTIFY_COMPLETED_ASSISTANT_CONVERSATION;
            case 243:
                return NOTIFY_OPA_LAUNCH_FOR_SEARCH_RESULTS;
            case 244:
                return SMARTSPACE_READY_QUERY_RESPONSE;
            case 245:
                return HTTP_SESSION_SERVICE_EVENT;
            case 246:
                return NETWORK_CONNECTIVITY;
            case 247:
                return HIDE_BACKGROUND_RETRY_DIALOGS;
            case 248:
                return GO_BACK_FOR_LAUNCHING_EXTERNAL_ACTIVITY;
            case 249:
                return MEDIA_BROWSER_FETCHED_MEDIA_SESSION_TOKEN;
            case 250:
                return MEDIA_BROWSER_LOADED_CHILDEN;
            case 251:
                return OPEN_ANDROID_NOTIFICATION_SETTINGS;
            case 253:
                return LENS_SERVICE_LENS_VIEW_SERVICE_EVENT;
            case 254:
                return SESSION_STARTED;
            case 255:
                return OPA_TV_RECOMMENDATIONS_RESPONSE;
            case 256:
                return LENS_LITE_SERVICE_EVENT;
            case 259:
                return OPA_NOTIFY_NO_CARD_IN_RESPONSE;
            case 260:
                return NOTIFICATIONS_FROM_ALTERNATIVE_SOURCE_REQUESTED;
            case 261:
                return LENS_FILTER_CONTEXT_UPDATED;
            case 262:
                return NGA_UI_ACTION_RESULT_EVENT;
            case 263:
                return CAR_ASSISTANT_NETWORK_STATE;
            case 265:
                return CONTACT_UPLOAD_RESPONSE;
            case 266:
                return VALID_UNREAD_MESSAGES;
            case 267:
                return LENS_FILTER_DETECTED_CONTEXT_SERVICE_EVENT;
            case 268:
                return LENS_SERVICE_RESPONSE_PENDING_INTENT;
            case 269:
                return NOTIFY_MEDIA_CONTROL;
            case 270:
                return TTS_TIMEPOINT_EVENT;
            case 271:
                return CARD_DECISION_CONTAINING_TTS;
            case 273:
                return PROVIDE_MDD_FILE_GROUP;
            case 276:
                return NOW_ELIGIBILITY_RESPONSE;
            case 277:
                return GACS_EXECUTE_EVENT;
            case 278:
                return MEDIA_RECOMMENDATION_RESPONSE;
            case 279:
                return NGA_SERVICE_EVENT;
            case 280:
                return SET_TISID_VALIDATION_RESULT;
            case 281:
                return OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE;
            case 282:
                return OPA_NOTIFY_DISPLAY_PHOTOS_IN_RESPONSE;
            case 284:
                return NOTIFY_STARTED_ASSISTANT_CONVERSATION;
            case 285:
                return BISTO_CUSTOM_DEVICE_ACTION;
            case 286:
                return NOTIFY_ASSISTANT_CONVERSATION_ONGOING;
            case 287:
                return BISTO_NOTIFY_COMPLETED_CONVERSATION;
            case 288:
                return BISTO_FORCE_CLOSE;
            case 289:
                return BISTO_NOTIFY_REQUEST_FOLLOW_ON;
            case 290:
                return BISTO_TTS_RESULT_EVENT;
            case 291:
                return BISTO_SET_FINAL_RECOGNIZED_TEXT;
            case 292:
                return BISTO_UPDATE_RECOGNIZED_TEXT;
            case 293:
                return BISTO_NO_SPEECH_DETECTED;
            case 294:
                return BISTO_VOICE_SEARCH_DONE;
            case 295:
                return OPA_TV_SEARCH_TAB_RESPONSE;
            case 296:
                return EXPLORE_ON_CONTENT_RESPONSE;
            case 297:
                return TAPAS_VAC_RESPONSE;
            case 298:
                return LENS_SERVICE_SDK_SERVICE_EVENT;
            case 299:
                return SET_SEARCH_PLATE_VOICE_SEARCH_LANGUAGE;
            case 300:
                return CONTINUOUS_MATCH_STARTED;
            case 301:
                return CONTINUOUS_MATCH_STOPPED;
            case 302:
                return GET_EMAIL_THREADS;
            case 304:
                return TAPAS_SERVICE_RESPONSE;
            case 305:
                return ACTION_RECEIVED_EVENT;
            case 306:
                return AUTO_QUERY_COMMIT;
            case 307:
                return CAR_ASSISTANT_COLD_BOOT_NOT_READY;
            case 308:
                return CAR_ASSISTANT_COLD_BOOT_STILL_NOT_READY;
            case 309:
                return COORDINATED_EXPERIMENT_EVENT;
            case 310:
                return LENS_SERVICE_SESSION_STARTED;
            case 311:
                return LENS_SERVICE_START_STREAMING_RESPONSE;
            case 312:
                return CONVERSATION_PARAMS_RECEIVED;
            case 313:
                return GET_ICING_DATA;
            case 314:
                return CAR_ASSISTANT_QUERY_RESEND;
            case 315:
                return MORRIS_HOTWORD;
            case 316:
                return BISTO_PR_REQUEST_PERMISSION;
            case 317:
                return LANGUAGE_SWITCHER_NUDGE_TTS_PLAYBACK_COMPLETE;
            case 319:
                return NO_DATA_SUBSCRIPTION;
            case 320:
                return SHOW_LOCATION_PERMISSIONS_SNACKBAR;
            case 321:
                return CAR_ASSISTANT_SMART_ACTIONS;
            case 322:
                return END_OF_CONVERSATION_TURN;
            case 323:
                return QUERY_OPAQUE_TOKEN;
            case 324:
                return SHOW_AADC_LOCATION_SETTINGS_CHANGED_SNACKBAR;
            case 325:
                return BISTO_START_OF_SPEECH_DETECTED;
            case 326:
                return MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_STARTED;
            case 327:
                return MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_DONE;
            case 329:
                return GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION;
        }
    }

    public final int getNumber() {
        return this.cx;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.cx);
    }
}
