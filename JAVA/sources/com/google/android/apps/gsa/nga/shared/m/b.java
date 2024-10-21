package com.google.android.apps.gsa.nga.shared.m;

import j$.util.DesugarArrays;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/m/b.class */
public final class b {
    public static boolean a(Locale locale, String str) {
        return ((List) DesugarArrays.stream(str.split(",")).map(new Function() { // from class: com.google.android.apps.gsa.nga.shared.m.a
            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Locale.forLanguageTag((String) obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return Function._CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())).contains(locale);
    }
}
