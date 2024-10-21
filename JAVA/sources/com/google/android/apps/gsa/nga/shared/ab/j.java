package com.google.android.apps.gsa.nga.shared.ab;

import com.google.protobuf.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ab/j.class */
public enum j implements bo {
    GROUP_ID_UNSPECIFIED(0),
    TELEPORT(1),
    QUERY_DEEP_LINKS(2),
    GENIE_FM(3),
    SODA(4),
    APP_ACTIONS(6),
    WEBREF(7),
    TCLIB(8),
    INTENTS(11),
    CANTEEN(12),
    SKIP_COMPONENT_LIST(15),
    DICTATION_FORMATTING(17),
    CORTEX(18),
    SAFT_SEGMENTER(20),
    SOT_CONFIGS(22),
    TCLIB_PERSON_NAME(23),
    POP(25),
    CORRECTIONS_ALTERNATIVES(27),
    WARMACTIONS(28),
    CONTACT_NAMES(29),
    TACTILE(30),
    LIGHTWEIGHT_TOKENS(31),
    BLOCK_WORDS(33),
    UNRECOGNIZED(-1);

    private final int z;

    j(int i) {
        this.z = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
