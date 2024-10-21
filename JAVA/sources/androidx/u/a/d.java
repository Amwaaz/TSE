package androidx.u.a;

import android.content.Context;

/* loaded from: classes-dex2jar.jar:androidx/u/a/d.class */
public final class d {
    public static final e a(Context context, String str, c cVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new e(context, str, cVar, z, z2);
    }

    public static final void b(h hVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    hVar.d(i);
                } else if (obj instanceof byte[]) {
                    hVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    hVar.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    hVar.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    hVar.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    hVar.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    hVar.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    hVar.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    hVar.e(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    hVar.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }
}
