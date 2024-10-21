package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import com.google.common.base.cl;
import java.util.Arrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/BitFlags.class */
public class BitFlags implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ap(1);

    /* renamed from: a, reason: collision with root package name */
    private final Class f1497a;
    public long b;
    private final String c;
    private LongSparseArray d;

    public BitFlags() {
        this(null, "FLAG_", 0L);
    }

    public BitFlags(Class cls, String str, long j) {
        this.b = j;
        this.f1497a = cls;
        this.c = str;
    }

    public static boolean f(long j, long j2) {
        return (j & j2) == j2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0105
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private final java.lang.String j(long r6) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.BitFlags.j(long):java.lang.String");
    }

    protected void a() {
    }

    public final String b() {
        this.f1497a.getClass();
        return j(this.b);
    }

    public final boolean c(long j, long j2) {
        cl.u(j >= 0 && j2 >= 0);
        long j3 = this.b;
        long j4 = ((j ^ (-1)) & j3) | j2;
        if (j3 == j4) {
            return false;
        }
        this.b = j4;
        a();
        return true;
    }

    public final boolean d() {
        return this.b != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(long j) {
        return (j & this.b) != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BitFlags) && this.b == ((BitFlags) obj).b;
    }

    public final boolean g() {
        if (this.b == 0) {
            return false;
        }
        this.b = 0L;
        a();
        return true;
    }

    public final boolean h(long j, boolean z) {
        return z ? c(0L, j) : c(j, 0L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b)});
    }

    public final void i(long j) {
        c((j ^ (-1)) & this.b, 0L);
    }

    public final String toString() {
        return "BitFlags".concat(String.valueOf(j(this.b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        Class cls = this.f1497a;
        parcel.writeString(cls == null ? null : cls.getName());
    }
}
