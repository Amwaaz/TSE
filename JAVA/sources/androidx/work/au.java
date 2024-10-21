package androidx.work;

import android.content.Context;
import android.util.Log;
import h.a.a.p.b.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import m.h.b.ab;

/* loaded from: classes-dex2jar.jar:androidx/work/au.class */
public final class au {
    public static final av a(Context context) {
        context.getClass();
        androidx.work.impl.av m = androidx.work.impl.av.m(context);
        m.getClass();
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.io.Serializable] */
    public static final l b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        boolean z;
        String str;
        bArr.getClass();
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return l.f224a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
        } catch (IOException e) {
            String str2 = m.f225a;
            af.a();
            Log.e(str2, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str3 = m.f225a;
            af.a();
            Log.e(str3, "Error in Data#fromByteArray: ", e2);
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    String readUTF = objectInputStream.readUTF();
                    readUTF.getClass();
                    linkedHashMap.put(readUTF, objectInputStream.readObject());
                }
                m.f.a.a(objectInputStream, (Throwable) null);
                return new l(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort != -21521) {
                    throw new IllegalStateException(a.a.dA(readShort, "Magic number doesn't match: "));
                }
                short readShort2 = dataInputStream.readShort();
                if (readShort2 != 1) {
                    throw new IllegalStateException(a.a.dA(readShort2, "Unsupported version number: "));
                }
                int readInt2 = dataInputStream.readInt();
                for (int i2 = 0; i2 < readInt2; i2++) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == 0) {
                        str = null;
                    } else if (readByte == 1) {
                        str = Boolean.valueOf(dataInputStream.readBoolean());
                    } else if (readByte == 2) {
                        str = Byte.valueOf(dataInputStream.readByte());
                    } else if (readByte == 3) {
                        str = Integer.valueOf(dataInputStream.readInt());
                    } else if (readByte == 4) {
                        str = Long.valueOf(dataInputStream.readLong());
                    } else if (readByte == 5) {
                        str = Float.valueOf(dataInputStream.readFloat());
                    } else if (readByte == 6) {
                        str = Double.valueOf(dataInputStream.readDouble());
                    } else if (readByte == 7) {
                        str = dataInputStream.readUTF();
                    } else if (readByte == 8) {
                        int readInt3 = dataInputStream.readInt();
                        ?? r0 = new Boolean[readInt3];
                        for (int i3 = 0; i3 < readInt3; i3++) {
                            r0[i3] = Boolean.valueOf(dataInputStream.readBoolean());
                        }
                        str = (Serializable) r0;
                    } else if (readByte == 9) {
                        int readInt4 = dataInputStream.readInt();
                        ?? r02 = new Byte[readInt4];
                        for (int i4 = 0; i4 < readInt4; i4++) {
                            r02[i4] = Byte.valueOf(dataInputStream.readByte());
                        }
                        str = (Serializable) r02;
                    } else if (readByte == 10) {
                        int readInt5 = dataInputStream.readInt();
                        ?? r03 = new Integer[readInt5];
                        for (int i5 = 0; i5 < readInt5; i5++) {
                            r03[i5] = Integer.valueOf(dataInputStream.readInt());
                        }
                        str = (Serializable) r03;
                    } else if (readByte == 11) {
                        int readInt6 = dataInputStream.readInt();
                        ?? r04 = new Long[readInt6];
                        for (int i6 = 0; i6 < readInt6; i6++) {
                            r04[i6] = Long.valueOf(dataInputStream.readLong());
                        }
                        str = (Serializable) r04;
                    } else if (readByte == 12) {
                        int readInt7 = dataInputStream.readInt();
                        ?? r05 = new Float[readInt7];
                        for (int i7 = 0; i7 < readInt7; i7++) {
                            r05[i7] = Float.valueOf(dataInputStream.readFloat());
                        }
                        str = (Serializable) r05;
                    } else if (readByte == 13) {
                        int readInt8 = dataInputStream.readInt();
                        ?? r06 = new Double[readInt8];
                        for (int i8 = 0; i8 < readInt8; i8++) {
                            r06[i8] = Double.valueOf(dataInputStream.readDouble());
                        }
                        str = (Serializable) r06;
                    } else {
                        if (readByte != 14) {
                            throw new IllegalStateException(a.a.dA(readByte, "Unsupported type "));
                        }
                        int readInt9 = dataInputStream.readInt();
                        ?? r07 = new String[readInt9];
                        for (int i9 = 0; i9 < readInt9; i9++) {
                            String readUTF2 = dataInputStream.readUTF();
                            String str4 = readUTF2;
                            if (true == f.h(readUTF2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                str4 = null;
                            }
                            r07[i9] = str4;
                        }
                        str = (Serializable) r07;
                    }
                    String readUTF3 = dataInputStream.readUTF();
                    readUTF3.getClass();
                    linkedHashMap.put(readUTF3, str);
                }
                m.f.a.a(dataInputStream, (Throwable) null);
                return new l(linkedHashMap);
            } finally {
            }
        }
    }

    public static final byte[] c(l lVar) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        int i;
        lVar.getClass();
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(lVar.b.size());
                for (Map.Entry entry : lVar.b.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(0);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(1);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i2 = ab.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new m.h.b.f(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i3 = ab.a;
                        m.h.b.f fVar = new m.h.b.f(cls2);
                        if (f.h(fVar, new m.h.b.f(Boolean[].class))) {
                            i = 8;
                        } else if (f.h(fVar, new m.h.b.f(Byte[].class))) {
                            i = 9;
                        } else if (f.h(fVar, new m.h.b.f(Integer[].class))) {
                            i = 10;
                        } else if (f.h(fVar, new m.h.b.f(Long[].class))) {
                            i = 11;
                        } else if (f.h(fVar, new m.h.b.f(Float[].class))) {
                            i = 12;
                        } else if (f.h(fVar, new m.h.b.f(Double[].class))) {
                            i = 13;
                        } else {
                            if (!f.h(fVar, new m.h.b.f(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new m.h.b.f(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        dataOutputStream.writeInt(objArr.length);
                        for (Object obj : objArr) {
                            if (i == 8) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == 10) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == 11) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                String str3 = str2;
                                if (str2 == null) {
                                    str3 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str3);
                            }
                        }
                    }
                    dataOutputStream.writeUTF(str);
                }
                dataOutputStream.flush();
            } finally {
            }
        } catch (IOException e) {
            String str4 = m.f225a;
            af.a();
            Log.e(str4, "Error in Data#toByteArray: ", e);
            bArr = new byte[0];
        }
        if (dataOutputStream.size() > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        bArr = byteArrayOutputStream.toByteArray();
        m.f.a.a(dataOutputStream, (Throwable) null);
        bArr.getClass();
        return bArr;
    }

    public static final l d(Map map) {
        l lVar = new l(map);
        c(lVar);
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Long[]] */
    public static final void e(String str, Object obj, Map map) {
        Object obj2;
        Double[] dArr;
        str.getClass();
        if (obj == null) {
            obj2 = null;
        } else {
            int i = ab.a;
            m.h.b.f fVar = new m.h.b.f(obj.getClass());
            obj2 = obj;
            if (!f.h(fVar, new m.h.b.f(Boolean.TYPE))) {
                obj2 = obj;
                if (!f.h(fVar, new m.h.b.f(Byte.TYPE))) {
                    obj2 = obj;
                    if (!f.h(fVar, new m.h.b.f(Integer.TYPE))) {
                        obj2 = obj;
                        if (!f.h(fVar, new m.h.b.f(Long.TYPE))) {
                            obj2 = obj;
                            if (!f.h(fVar, new m.h.b.f(Float.TYPE))) {
                                obj2 = obj;
                                if (!f.h(fVar, new m.h.b.f(Double.TYPE))) {
                                    obj2 = obj;
                                    if (!f.h(fVar, new m.h.b.f(String.class))) {
                                        obj2 = obj;
                                        if (!f.h(fVar, new m.h.b.f(Boolean[].class))) {
                                            obj2 = obj;
                                            if (!f.h(fVar, new m.h.b.f(Byte[].class))) {
                                                obj2 = obj;
                                                if (!f.h(fVar, new m.h.b.f(Integer[].class))) {
                                                    obj2 = obj;
                                                    if (!f.h(fVar, new m.h.b.f(Long[].class))) {
                                                        obj2 = obj;
                                                        if (!f.h(fVar, new m.h.b.f(Float[].class))) {
                                                            obj2 = obj;
                                                            if (!f.h(fVar, new m.h.b.f(Double[].class))) {
                                                                obj2 = obj;
                                                                if (!f.h(fVar, new m.h.b.f(String[].class))) {
                                                                    int i2 = 0;
                                                                    if (f.h(fVar, new m.h.b.f(boolean[].class))) {
                                                                        boolean[] zArr = (boolean[]) obj;
                                                                        int length = zArr.length;
                                                                        ?? r0 = new Boolean[length];
                                                                        int i3 = 0;
                                                                        while (true) {
                                                                            dArr = r0;
                                                                            if (i3 >= length) {
                                                                                break;
                                                                            }
                                                                            r0[i3] = Boolean.valueOf(zArr[i3]);
                                                                            i3++;
                                                                        }
                                                                    } else if (f.h(fVar, new m.h.b.f(byte[].class))) {
                                                                        obj2 = m.a((byte[]) obj);
                                                                    } else if (f.h(fVar, new m.h.b.f(int[].class))) {
                                                                        obj2 = m.b((int[]) obj);
                                                                    } else if (f.h(fVar, new m.h.b.f(long[].class))) {
                                                                        long[] jArr = (long[]) obj;
                                                                        int length2 = jArr.length;
                                                                        ?? r02 = new Long[length2];
                                                                        int i4 = 0;
                                                                        while (true) {
                                                                            dArr = r02;
                                                                            if (i4 >= length2) {
                                                                                break;
                                                                            }
                                                                            r02[i4] = Long.valueOf(jArr[i4]);
                                                                            i4++;
                                                                        }
                                                                    } else if (f.h(fVar, new m.h.b.f(float[].class))) {
                                                                        float[] fArr = (float[]) obj;
                                                                        int length3 = fArr.length;
                                                                        ?? r03 = new Float[length3];
                                                                        int i5 = 0;
                                                                        while (true) {
                                                                            dArr = r03;
                                                                            if (i5 >= length3) {
                                                                                break;
                                                                            }
                                                                            r03[i5] = Float.valueOf(fArr[i5]);
                                                                            i5++;
                                                                        }
                                                                    } else {
                                                                        if (!f.h(fVar, new m.h.b.f(double[].class))) {
                                                                            throw new IllegalArgumentException(a.a.dP(fVar, str, "Key ", " has invalid type "));
                                                                        }
                                                                        double[] dArr2 = (double[]) obj;
                                                                        int length4 = dArr2.length;
                                                                        Double[] dArr3 = new Double[length4];
                                                                        while (true) {
                                                                            dArr = dArr3;
                                                                            if (i2 >= length4) {
                                                                                break;
                                                                            }
                                                                            dArr3[i2] = Double.valueOf(dArr2[i2]);
                                                                            i2++;
                                                                        }
                                                                    }
                                                                    obj2 = dArr;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        map.put(str, obj2);
    }

    public static final void f(l lVar, Map map) {
        lVar.getClass();
        g(lVar.b, map);
    }

    public static final void g(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            e((String) entry.getKey(), entry.getValue(), map2);
        }
    }

    public static final void h(String str, byte[] bArr, Map map) {
        bArr.getClass();
        map.put(str, m.a(bArr));
    }
}
