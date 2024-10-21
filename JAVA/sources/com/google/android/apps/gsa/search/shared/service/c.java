package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.c.hg;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.o.or;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bi;
import com.google.protobuf.ce;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/c.class */
final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final int f1337a;

    public c(int i) {
        this.f1337a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.google.android.apps.gsa.search.shared.service.h] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        f fVar;
        int i = this.f1337a;
        if (i == 0) {
            BitFlags bitFlags = (BitFlags) parcel.readParcelable(BitFlags.class.getClassLoader());
            BitFlags bitFlags2 = (BitFlags) parcel.readParcelable(BitFlags.class.getClassLoader());
            or a2 = or.a(parcel.readInt());
            String readString = parcel.readString();
            readString.getClass();
            return new ClientConfig(bitFlags, bitFlags2, a2, readString);
        }
        boolean z = true;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.service.ISearchService");
                fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(readStrongBinder);
            }
            long readLong = parcel.readLong();
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new AttachClientResponse(fVar, new af(readLong, z));
        }
        if (i != 2) {
            byte[] createByteArray = parcel.createByteArray();
            try {
                createByteArray.getClass();
                return new ServiceEventData(bi.parseFrom(hg.f1343a, createByteArray, ExtensionRegistryLite.getGeneratedRegistry()), parcel.readParcelable(EventData.class.getClassLoader()));
            } catch (ce e) {
                throw new RuntimeException("Failed to parse event data.", e);
            }
        }
        byte[] createByteArray2 = parcel.createByteArray();
        try {
            createByteArray2.getClass();
            return new ClientEventData(bi.parseFrom(com.google.android.apps.gsa.search.shared.service.c.ad.f1339a, createByteArray2, ExtensionRegistryLite.getGeneratedRegistry()), parcel.readParcelable(EventData.class.getClassLoader()));
        } catch (ce e2) {
            throw new RuntimeException("Failed to parse event data.", e2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.f1337a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new ServiceEventData[i] : new ClientEventData[i] : new AttachClientResponse[i] : new ClientConfig[i];
    }
}
