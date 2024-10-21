package com.google.android.apps.gsa.search.shared.service.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/d/a.class */
public final class a {
    public static final boolean a(String str) {
        boolean z;
        int hashCode = str.hashCode();
        if (hashCode != 93747335) {
            if (hashCode == 1223440372 && str.equals("weather")) {
                z = true;
            }
            z = -1;
        } else {
            if (str.equals("bisto")) {
                z = false;
            }
            z = -1;
        }
        return !z || z;
    }
}
