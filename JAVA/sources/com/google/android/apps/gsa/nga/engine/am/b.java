package com.google.android.apps.gsa.nga.engine.am;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/b.class */
final class b extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() >= 3;
    }
}
