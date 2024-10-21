package com.google.android.apps.gsa.search.core.state;

import java.util.Comparator;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cr.class */
public final class cr implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1269a = new int[250];
    private static final int[] b = {69, 55, 50, 57, 56, 51, 52, 15, 0, 16, 54, 58, 17, 60, 11, 8, 73, 20, 64, 2, 1, 63, 14, 74, 7, 5, 22, 3, 76, 6, 67, 66};

    static {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            i = 0;
            i2 = i3;
            if (i4 >= 32) {
                break;
            }
            f1269a[b[i4]] = i3;
            i4++;
            i3++;
        }
        while (i < 250) {
            int[] iArr = f1269a;
            int i5 = i2;
            if (iArr[i] == 0) {
                iArr[i] = i2;
                i5 = i2 + 1;
            }
            i++;
            i2 = i5;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = f1269a;
        return iArr[((ae) ((cs) obj).a()).F] - iArr[((ae) ((cs) obj2).a()).F];
    }
}
