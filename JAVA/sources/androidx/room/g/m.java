package androidx.room.g;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import androidx.room.ao;
import androidx.room.as;
import androidx.u.a.i;
import androidx.u.b;
import h.a.a.p.b.a.f;
import java.util.ArrayList;
import kotlinx.coroutines.dc;
import m.a.t;
import m.c.o;
import m.f.a;
import m.h.a.l;
import m.p.s;

/* loaded from: classes-dex2jar.jar:androidx/room/g/m.class */
public final /* synthetic */ class m {
    public static final int a(b bVar, String str) {
        int b = b(bVar, str);
        if (b >= 0) {
            return b;
        }
        int b2 = b(bVar, "`" + str + '`');
        if (b2 >= 0) {
            return b2;
        }
        return -1;
    }

    public static final int b(b bVar, String str) {
        int b = bVar.b();
        for (int i = 0; i < b; i++) {
            if (f.h(str, bVar.d(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int c(b bVar, String str) {
        int a2 = a(bVar, str);
        if (a2 >= 0) {
            return a2;
        }
        int b = bVar.b();
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            arrayList.add(bVar.d(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + t.ae(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, (l) null, 63) + ']');
    }

    public static final Object d(Class cls) {
        String str;
        Package r0 = cls.getPackage();
        String name = r0 != null ? r0.getName() : null;
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        String str2 = name;
        if (name == null) {
            str2 = "";
        }
        String str3 = canonicalName;
        if (str2.length() != 0) {
            str3 = canonicalName.substring(str2.length() + 1);
            str3.getClass();
        }
        String concat = String.valueOf(s.Q(str3, '.', '_')).concat("_Impl");
        try {
            if (str2.length() == 0) {
                str = concat;
            } else {
                str = str2 + '.' + concat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(androidx.room.ao r3, boolean r4, m.c.g r5) {
        /*
            r0 = r3
            boolean r0 = r0.x()
            if (r0 == 0) goto L52
            r0 = r5
            m.c.n r0 = r0.s()
            androidx.room.bd r1 = androidx.room.be.f96a
            m.c.k r0 = r0.get(r1)
            androidx.room.be r0 = (androidx.room.be) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r3
            m.c.n r0 = r0.W()
            r1 = r5
            m.c.i r1 = r1.b
            m.c.n r0 = r0.plus(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L5d
        L31:
            r0 = r4
            if (r0 == 0) goto L4a
            r0 = r3
            m.c.n r0 = r0.c
            r3 = r0
            r0 = r3
            r5 = r0
            r0 = r3
            if (r0 != 0) goto L5d
            java.lang.String r0 = "transactionContext"
            m.h.b.m.b(r0)
            r0 = 0
            r5 = r0
            goto L5d
        L4a:
            r0 = r3
            m.c.n r0 = r0.W()
            r5 = r0
            goto L5d
        L52:
            r0 = r3
            kotlinx.coroutines.ag r0 = r0.o()
            kotlinx.coroutines.d.e r0 = (kotlinx.coroutines.d.e) r0
            m.c.n r0 = r0.a
            r5 = r0
        L5d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.g.m.e(androidx.room.ao, boolean, m.c.g):java.lang.Object");
    }

    public static final Object f(ao aoVar, boolean z, boolean z2, l lVar) {
        aoVar.p();
        aoVar.q();
        return dc.Q(o.a, new b(aoVar, z, z2, lVar, (m.c.g) null));
    }

    public static final Object g(ao aoVar, l lVar, m.c.g gVar) {
        return aoVar.x() ? as.b(aoVar, new c(aoVar, lVar, (m.c.g) null), gVar) : dc.L(aoVar.o().a, new f(aoVar, lVar, (m.c.g) null), gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.room.ao r8, boolean r9, boolean r10, m.h.a.l r11, m.c.g r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.g.m.h(androidx.room.ao, boolean, boolean, m.h.a.l, m.c.g):java.lang.Object");
    }

    public static final Cursor i(ao aoVar, i iVar, boolean z) {
        iVar.getClass();
        aoVar.p();
        aoVar.q();
        Cursor c = aoVar.P().b().c(iVar);
        if (z && (c instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                c.getClass();
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c.getColumnNames(), c.getCount());
                    while (c.moveToNext()) {
                        Object[] objArr = new Object[c.getColumnCount()];
                        int columnCount = c.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    a.a(c, (Throwable) null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c;
    }

    public static final int j(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int k(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int j = j(cursor, str);
        if (j >= 0) {
            return j;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str3 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                androidx.compose.ui.l.f.b(sb, str3, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(a.a.dO(str2, str, "column '", "' does not exist. Available columns: "));
    }
}
