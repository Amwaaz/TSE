package androidx.work.impl.b;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.bf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/bc.class */
public final class bc {
    public static final int a(androidx.work.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new m.f();
    }

    public static final int b(androidx.work.as asVar) {
        asVar.getClass();
        int ordinal = asVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new m.f();
                    }
                }
            }
        }
        return i;
    }

    public static final androidx.work.a c(int i) {
        androidx.work.a aVar;
        if (i == 0) {
            aVar = androidx.work.a.EXPONENTIAL;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(a.a.dy(i, "Could not convert ", " to BackoffPolicy"));
            }
            aVar = androidx.work.a.LINEAR;
        }
        return aVar;
    }

    public static final androidx.work.as d(int i) {
        androidx.work.as asVar;
        if (i == 0) {
            asVar = androidx.work.as.ENQUEUED;
        } else if (i == 1) {
            asVar = androidx.work.as.RUNNING;
        } else if (i == 2) {
            asVar = androidx.work.as.SUCCEEDED;
        } else if (i == 3) {
            asVar = androidx.work.as.FAILED;
        } else if (i == 4) {
            asVar = androidx.work.as.BLOCKED;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.a.dy(i, "Could not convert ", " to State"));
            }
            asVar = androidx.work.as.CANCELLED;
        }
        return asVar;
    }

    public static final androidx.work.impl.utils.f e(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 0) {
            return new androidx.work.impl.utils.f(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                androidx.work.impl.utils.f fVar = new androidx.work.impl.utils.f(androidx.work.impl.utils.o.e(iArr2, iArr));
                m.f.a.a(objectInputStream, (Throwable) null);
                m.f.a.a(byteArrayInputStream, (Throwable) null);
                return fVar;
            } finally {
            }
        } finally {
        }
    }

    public static final Set f(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new androidx.work.f(parse, readBoolean));
                    }
                    m.f.a.a(objectInputStream, (Throwable) null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            m.f.a.a(byteArrayInputStream, (Throwable) null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m.f.a.a(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static final byte[] g(androidx.work.impl.utils.f fVar) {
        Object obj = fVar.b;
        if (obj == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] d = androidx.work.impl.utils.o.d((NetworkRequest) obj);
                int[] c = androidx.work.impl.utils.o.c((NetworkRequest) obj);
                objectOutputStream.writeInt(d.length);
                for (int i : d) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(c.length);
                for (int i2 : c) {
                    objectOutputStream.writeInt(i2);
                }
                m.f.a.a(objectOutputStream, (Throwable) null);
                m.f.a.a(byteArrayOutputStream, (Throwable) null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] h(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    androidx.work.f fVar = (androidx.work.f) it.next();
                    objectOutputStream.writeUTF(fVar.a.toString());
                    objectOutputStream.writeBoolean(fVar.b);
                }
                m.f.a.a(objectOutputStream, (Throwable) null);
                m.f.a.a(byteArrayOutputStream, (Throwable) null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int i(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 0) {
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
                if (i3 != 2) {
                    i4 = 3;
                    if (i3 != 3) {
                        i4 = 4;
                        if (i3 != 4) {
                            if (Build.VERSION.SDK_INT < 30 || i != 6) {
                                throw new IllegalArgumentException("Could not convert " + ((Object) bf.d(i)) + " to int");
                            }
                            i2 = 5;
                        }
                    }
                }
            }
            return i4;
        }
        i2 = 0;
        return i2;
    }

    public static final int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.a.dy(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int k(int i) {
        if (i != 0) {
            return i - 1 != 0 ? 1 : 0;
        }
        throw null;
    }

    public static final int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.a.dy(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final r m(ac acVar) {
        acVar.getClass();
        return new r(acVar.b, acVar.t);
    }

    public static final long n(boolean z, int i, androidx.work.a aVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        long j8;
        int i3;
        aVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 == 0) {
                return j6;
            }
            long j9 = 900000 + j2;
            return j6 < j9 ? j9 : j6;
        }
        if (z) {
            long scalb = aVar == androidx.work.a.LINEAR ? j * i : Math.scalb((float) j, i - 1);
            long j10 = scalb;
            if (scalb > 18000000) {
                j10 = 18000000;
            }
            j7 = j2 + j10;
        } else if (z2) {
            if (i2 == 0) {
                j8 = j2 + j3;
                i3 = 0;
            } else {
                j8 = j2 + j5;
                i3 = i2;
            }
            long j11 = j8;
            j7 = j11;
            if (j4 != j5) {
                j7 = j11;
                if (i3 == 0) {
                    j7 = j11 + (j5 - j4);
                }
            }
        } else {
            if (j2 != -1) {
                return j2 + j3;
            }
            j7 = Long.MAX_VALUE;
        }
        return j7;
    }
}
