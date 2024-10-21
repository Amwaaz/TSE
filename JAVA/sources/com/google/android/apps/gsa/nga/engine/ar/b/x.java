package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.assistant.shared.k.c;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/x.class */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f490a;

    public x(Object obj) {
        this.f490a = obj;
    }

    public static com.google.android.apps.gsa.shared.logger.b.w a(c cVar) {
        switch (cVar.ordinal()) {
            case 5:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_OPA_REQUEST;
            case 28:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_PROACTIVE;
            case 68:
            case 80:
            case 127:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_SQUEEZE;
            case 78:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_DEEPLINK;
            case 79:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_SWIPE;
            case 107:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_HOTWORD;
            case 109:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_USER_REQUEST;
            case 118:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_PUSH_TO_TALK;
            case 120:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_WATCH;
            case 132:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_LOCKSCREEN_HOTWORD;
            case 134:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_LPH;
            case 139:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_MIC_TAP;
            default:
                return com.google.android.apps.gsa.shared.logger.b.w.NGA_EXPLICIT_TRIGGER_UNKNOWN;
        }
    }
}
