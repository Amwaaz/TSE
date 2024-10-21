package com.google.android.apps.gsa.shared.speech.speakerid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.a;
import com.google.common.base.at;
import java.util.Arrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/speakerid/SpeakerIdModel.class */
public class SpeakerIdModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a */
    public final String f1495a;
    public at b;

    public SpeakerIdModel(Parcel parcel) {
        this.b = a.a;
        this.b = at.j(parcel.createByteArray());
        this.f1495a = parcel.readString();
    }

    public SpeakerIdModel(String str) {
        this.b = a.a;
        this.f1495a = str;
    }

    public SpeakerIdModel(String str, byte[] bArr) {
        this.b = a.a;
        this.f1495a = str;
        this.b = at.j(bArr);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        String str = ((SpeakerIdModel) obj).f1495a;
        String str2 = this.f1495a;
        if (str2 == null) {
            if (str != null) {
                return -1;
            }
            i = 0;
        } else {
            if (str != null) {
                return str2.compareTo(str);
            }
            i = 1;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeakerIdModel)) {
            return false;
        }
        SpeakerIdModel speakerIdModel = (SpeakerIdModel) obj;
        String str = this.f1495a;
        if (str != null && !str.equals(speakerIdModel.f1495a) && speakerIdModel.f1495a != null) {
            return false;
        }
        boolean z = false;
        if (this.b.h() == speakerIdModel.b.h()) {
            if (!this.b.h()) {
                z = true;
            } else {
                if (Arrays.equals((byte[]) this.b.c(), (byte[]) speakerIdModel.b.c())) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        String str = this.f1495a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = hashCode;
        if (this.b.h()) {
            i = hashCode + Arrays.hashCode((byte[]) this.b.c());
        }
        return i;
    }

    public final String toString() {
        return "SpeakerIdModel [mSpeakerAccountName=" + this.f1495a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray((byte[]) this.b.f());
        parcel.writeString(this.f1495a);
    }
}
