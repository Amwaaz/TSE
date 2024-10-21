package com.google.android.apps.gsa.shared.ad;

import com.google.common.b.fl;
import com.google.common.b.oo;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ad/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1368a = j.i("com.google.android.apps.gsa.shared.ad.c");

    public static b a(Map map) {
        ba createBuilder = b.f1367a.createBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ba createBuilder2 = a.f1366a.createBuilder();
            createBuilder2.copyOnWrite();
            a aVar = (a) createBuilder2.instance;
            str.getClass();
            aVar.b |= 1;
            aVar.c = str;
            if (value instanceof Boolean) {
                boolean booleanValue = ((Boolean) value).booleanValue();
                createBuilder2.copyOnWrite();
                a aVar2 = (a) createBuilder2.instance;
                aVar2.b |= 2;
                aVar2.d = booleanValue;
            } else if (value instanceof Float) {
                float floatValue = ((Float) value).floatValue();
                createBuilder2.copyOnWrite();
                a aVar3 = (a) createBuilder2.instance;
                aVar3.b |= 4;
                aVar3.e = floatValue;
            } else if (value instanceof Integer) {
                int intValue = ((Integer) value).intValue();
                createBuilder2.copyOnWrite();
                a aVar4 = (a) createBuilder2.instance;
                aVar4.b |= 8;
                aVar4.f = intValue;
            } else if (value instanceof Long) {
                long longValue = ((Long) value).longValue();
                createBuilder2.copyOnWrite();
                a aVar5 = (a) createBuilder2.instance;
                aVar5.b |= 16;
                aVar5.g = longValue;
            } else if (value instanceof String) {
                String str2 = (String) value;
                createBuilder2.copyOnWrite();
                a aVar6 = (a) createBuilder2.instance;
                str2.getClass();
                aVar6.b |= 32;
                aVar6.h = str2;
            } else if (value instanceof Set) {
                HashSet e = oo.e((Set) value);
                String str3 = true != e.remove(null) ? "" : "null";
                createBuilder2.copyOnWrite();
                a aVar7 = (a) createBuilder2.instance;
                aVar7.a();
                aVar7.i.add(str3);
                createBuilder2.copyOnWrite();
                a aVar8 = (a) createBuilder2.instance;
                aVar8.a();
                com.google.protobuf.c.addAll(e, aVar8.i);
            } else if (value instanceof v) {
                v vVar = (v) value;
                createBuilder2.copyOnWrite();
                a aVar9 = (a) createBuilder2.instance;
                vVar.getClass();
                aVar9.b |= 64;
                aVar9.j = vVar;
            } else if (value instanceof List) {
                List list = (List) value;
                createBuilder2.copyOnWrite();
                a aVar10 = (a) createBuilder2.instance;
                bs bsVar = aVar10.k;
                if (!bsVar.c()) {
                    aVar10.k = bi.mutableCopy(bsVar);
                }
                com.google.protobuf.c.addAll(list, aVar10.k);
            } else {
                h f = f1368a.f();
                f.ak(9099);
                f.s("createSharedPreferenceEntry: invalid entry class = %s", value.getClass().getName());
            }
            createBuilder.ca((a) createBuilder2.build());
        }
        return (b) createBuilder.build();
    }

    public static Map b(b bVar) {
        HashMap hashMap = new HashMap();
        for (a aVar : bVar.b) {
            int i = aVar.b;
            if ((i & 1) != 0) {
                String str = aVar.c;
                if ((i & 2) != 0) {
                    hashMap.put(str, Boolean.valueOf(aVar.d));
                } else if ((i & 4) != 0) {
                    hashMap.put(str, Float.valueOf(aVar.e));
                } else if ((i & 8) != 0) {
                    hashMap.put(str, Integer.valueOf(aVar.f));
                } else if ((i & 16) != 0) {
                    hashMap.put(str, Long.valueOf(aVar.g));
                } else if ((i & 32) != 0) {
                    hashMap.put(str, aVar.h);
                } else if (aVar.i.size() != 0) {
                    int size = aVar.i.size();
                    HashSet f = oo.f(size);
                    String str2 = (String) aVar.i.get(0);
                    int i2 = 1;
                    if (!str2.isEmpty()) {
                        if (str2.equals("null")) {
                            f.add(null);
                            i2 = 1;
                        } else {
                            h e = f1368a.e();
                            e.ak(9100);
                            e.H("dataToMap: invalid nullTag: %s->%s", str, str2);
                        }
                    }
                    while (i2 < size) {
                        f.add((String) aVar.i.get(i2));
                        i2++;
                    }
                    hashMap.put(str, f);
                } else if ((aVar.b & 64) != 0) {
                    hashMap.put(str, aVar.j);
                } else if (aVar.k.size() != 0) {
                    hashMap.put(str, fl.m(aVar.k));
                }
            } else {
                h e2 = f1368a.e();
                e2.ak(9101);
                e2.p("dataToMap: null key.");
            }
        }
        return hashMap;
    }
}
