package com.google.android.apps.gsa.shared.search;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.android.apps.gsa.shared.util.ac;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.f.a.e;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.o.or;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/h.class */
final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final int f1485a;

    public h(int i) {
        this.f1485a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        CharSequence charSequence;
        com.google.android.apps.gsa.shared.search.a.b bVar;
        if (this.f1485a == 0) {
            return (QueryTriggerType) QueryTriggerType.Y.get(parcel.readInt(), QueryTriggerType.USER);
        }
        j jVar = Query.f1478a;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        try {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                charSequence = ac.a(charSequence2);
            } else {
                SpannableString valueOf = SpannableString.valueOf(charSequence2);
                for (int i = 0; i < readInt; i++) {
                    valueOf.setSpan((CorrectionSpan) CorrectionSpan.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }
                charSequence = SpannedString.valueOf(valueOf);
            }
        } catch (Exception e) {
            a.a.dB(ac.a.f(), "Failed to parse Parcel", (char) 9294, e);
            charSequence = null;
        }
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        fl m = fl.m(arrayList);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        fu k = fu.k(ar.k(parcel.readBundle()));
        int readInt4 = parcel.readInt();
        String readString3 = parcel.readString();
        long readLong3 = parcel.readLong();
        Long l = (Long) parcel.readValue(Long.class.getClassLoader());
        byte[] createByteArray = parcel.createByteArray();
        Bundle readBundle = parcel.readBundle(Query.class.getClassLoader());
        Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        long readLong4 = parcel.readLong();
        LatencyEvents latencyEvents = (LatencyEvents) parcel.readParcelable(LatencyEvents.class.getClassLoader());
        long readLong5 = parcel.readLong();
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        int readInt5 = parcel.readInt();
        long readLong8 = parcel.readLong();
        long readLong9 = parcel.readLong();
        long readLong10 = parcel.readLong();
        int readInt6 = parcel.readInt();
        boolean z = parcel.readByte() != 0;
        QueryTriggerType queryTriggerType = (QueryTriggerType) parcel.readParcelable(QueryTriggerType.class.getClassLoader());
        int readInt7 = parcel.readInt();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        HotwordResultMetadata readParcelable = parcel.readParcelable(HotwordResultMetadata.class.getClassLoader());
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        Integer num = (Integer) parcel.readValue(Integer.class.getClassLoader());
        or a2 = num == null ? null : or.a(num.intValue());
        int h = a.b.h(parcel.readInt());
        String readString9 = parcel.readString();
        int readInt8 = parcel.readInt();
        com.google.android.apps.gsa.shared.search.a.b bVar2 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            bVar = (com.google.android.apps.gsa.shared.search.a.b) bi.parseFrom(com.google.android.apps.gsa.shared.search.a.b.f1481a, bArr);
        } catch (ce e2) {
            y e3 = Query.f1478a.e();
            e3.aj(e.a, "Velvet.Query");
            a.a.dB(e3, "Could not parse the query proto, leaving fields at default values.", (char) 9109, e2);
            bVar = bVar2;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return new Query(readLong, readLong2, charSequence, m, readString, readString2, readInt2, readInt3, readInt4, readString3, k, readLong3, l, createByteArray, null, readBundle, uri, readLong4, latencyEvents, readLong5, readLong6, readLong7, readInt5, readLong8, readLong9, readLong10, readInt6, z, queryTriggerType, readInt7, readString4, readString5, readParcelable, readString6, readString7, readString8, a2, h, readString9, readInt8, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.f1485a != 0 ? new Query[i] : new QueryTriggerType[i];
    }
}
