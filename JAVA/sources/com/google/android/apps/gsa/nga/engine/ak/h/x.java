package com.google.android.apps.gsa.nga.engine.ak.h;

import android.database.Cursor;
import android.net.Uri;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.qj;
import j$.util.Collection;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/h/x.class */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ap f432a;

    public x(ap apVar) {
        this.f432a = apVar;
    }

    public final Cursor a(Uri uri, String[] strArr, fu fuVar, String str) {
        if (fuVar == null || fuVar.isEmpty()) {
            return this.f432a.a(uri, strArr, null, null, str);
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr2 = new String[Collection._EL.stream(fuVar.g()).mapToInt(new u()).sum()];
        qj j = fuVar.v().j();
        int i = 0;
        boolean z = true;
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            if (!((fl) entry.getValue()).isEmpty()) {
                if (!z) {
                    sb.append(" AND ");
                }
                sb.append("(");
                fl flVar = (fl) entry.getValue();
                int size = flVar.size();
                int i2 = 0;
                boolean z2 = true;
                while (true) {
                    boolean z3 = z2;
                    if (i2 >= size) {
                        break;
                    }
                    String str2 = (String) flVar.get(i2);
                    if (!z3) {
                        sb.append(" OR ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append(" = ?");
                    strArr2[i] = str2;
                    i2++;
                    i++;
                    z2 = false;
                }
                sb.append(")");
                z = false;
            }
        }
        return this.f432a.a(uri, strArr, sb.toString(), strArr2, str);
    }

    public final Cursor b(Uri uri, String[] strArr, fu fuVar, String str) {
        return a(uri, strArr, fu.k((Map) Collection._EL.stream(fuVar.v()).collect(bs.e(new v(0), new v(2), new w()))), str);
    }
}
