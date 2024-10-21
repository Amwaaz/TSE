package com.b.a;

import android.content.Context;
import com.google.android.libraries.speech.b.i;
import com.google.android.libraries.speech.b.j;
import com.google.common.f.h;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/b/a/e.class */
public final class e {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    protected static final File b(Context context) {
        return context.getDir("lib", 0);
    }

    public static final void c(Context context, String str, Set set, i iVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        f("Beginning load of %s...", new Object[]{str}, iVar);
        h(context, str, set, iVar);
    }

    protected static final File d(Context context, String str) {
        String a2 = d.a(str);
        return a(null) ? new File(b(context), a2) : new File(b(context), String.valueOf(a2).concat(".null"));
    }

    public static final void e(String str, i iVar) {
        if (iVar != null) {
            h f = j.a.f();
            f.ak(60563);
            f.s("%s", str);
        }
    }

    public static final void f(String str, Object[] objArr, i iVar) {
        e(String.format(Locale.US, str, objArr), iVar);
    }

    public static void g(Context context, String str) {
        c(context, str, new HashSet(), null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:156:0x03c3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private static final void h(android.content.Context r6, java.lang.String r7, java.util.Set r8, com.google.android.libraries.speech.b.i r9) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.e.h(android.content.Context, java.lang.String, java.util.Set, com.google.android.libraries.speech.b.i):void");
    }
}
