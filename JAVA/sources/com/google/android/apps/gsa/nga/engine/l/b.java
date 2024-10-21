package com.google.android.apps.gsa.nga.engine.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/l/b.class */
public class b extends Exception {
    public b() {
        super("User has disabled access to device information bit");
    }

    protected b(byte[] bArr) {
        super("User has denied permission to access device contacts");
    }
}
