package com.google.android.apps.gsa.nga.engine.au.c;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/au/c/m.class */
final class m {
    public static final n a(g gVar, Optional optional) {
        if (gVar != null) {
            return new n(gVar, optional);
        }
        throw new IllegalStateException("Missing required properties: resource");
    }
}
