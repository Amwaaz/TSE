package com.google.android.apps.gsa.shared.search;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/QueryTriggerType.class */
public enum QueryTriggerType implements Parcelable {
    USER(0),
    INTENT(1),
    PREFETCH(2),
    PREDICTIVE(3),
    WEBVIEW(4),
    HOTWORD(5),
    BT_HEADSET_BUTTON(6),
    WIRED_HEADSET_BUTTON(7),
    FOLLOW_ON(8),
    HISTORY_REFRESH(9),
    CORPUS_SELECTOR(10),
    CONVERSATIONAL_FOLLOW_ON(11),
    DOODLE(12),
    VOICE_COMMAND_INTENT(13),
    VOICE_SELECTIVE_RESPEAK(14),
    PROXY_VOICE_BUTTON(15),
    ACTION_ESCAPE_HATCH(16),
    INTENT_API(17),
    GOOGLEEARS_WIDGET(18),
    VOICE_ACTION(19),
    MUSIC_SEARCH_INTENT(21),
    BISTO(22),
    GEARHEAD_SCREEN_MIC(23),
    GEARHEAD_CONTROLLER(24),
    GEARHEAD_HARDWARE_MIC(25),
    GEARHEAD_DIRECT_ACTION(26),
    UNIFIED_IME(27),
    VOICE_IME(28),
    OPA_SUGGESTION_CHIP(29),
    OPA_TEXT_EDITOR(30),
    OPA_HQ_SUGGESTION_CHIP(31),
    OPA_PROACTIVE_NOTIFICATION(32),
    OPA_VOICE_AUTOCOMPLETE_SUGGESTION(33),
    ASSISTANT_MUSIC_SETTINGS(34),
    MAGIC_MIC(35),
    OPA_FEEDBACK_SURVEY(36),
    OPA_MORRIS_GENERIC(37),
    OPA_SRP_RESULT_CLICK(39),
    OPA_MORRIS_HOTWORD(40),
    OPA_RICH_INPUT_SUGGESTION_CHIP(42),
    NGA_VOICE_TYPING(43),
    OPA_VOICE_SEARCH_SUGGESTION_CHIP(44),
    INSPIRE_REFRESH(45),
    PIXEL_LAUNCHER_MIC(46),
    SEARCH_WIDGET_MIC(47),
    AGA_SEARCHPLATE_MIC(48),
    MONET_ELEMENTS(49),
    AGA_PROGRAMMATIC_NUDGE_SEARCHPLATE(50),
    AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED(51),
    OPA_CORRECTION_CHIP(52);

    public static final Parcelable.Creator CREATOR;
    public static final SparseArray Y;
    public final int Z;

    static {
        QueryTriggerType[] values = values();
        Y = new SparseArray(values.length);
        for (QueryTriggerType queryTriggerType : values) {
            Y.put(queryTriggerType.Z, queryTriggerType);
        }
        CREATOR = new h(0);
    }

    QueryTriggerType(int i) {
        this.Z = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Z);
    }
}
