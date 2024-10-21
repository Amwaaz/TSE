package com.google.android.apps.gsa.nga.engine.understanding.h.a;

import android.content.res.Resources;
import com.google.android.apps.gsa.nga.engine.geniefm.a;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.u.f.n;
import com.google.common.b.bs;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.i.m;
import com.google.common.util.concurrent.ba;
import com.google.common.util.concurrent.dk;
import j$.util.stream.Stream;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/understanding/h/a/d.class */
public final class d {
    public static final int b = 0;
    private static final Pattern c = Pattern.compile("[\\?!\\^@#&*\\+\\-_,.:;\\(\\)\\\"/\\\\\\[\\]]", 2);
    private static final Pattern d = Pattern.compile("\\p{M}");
    private static final Pattern e = Pattern.compile("['`0-9]", 2);

    /* renamed from: a, reason: collision with root package name */
    public final m f803a;
    private final a f;
    private final b g;

    public d(m mVar, a aVar, b bVar) {
        this.f803a = mVar;
        this.f = aVar;
        this.g = bVar;
    }

    private final ha c(Locale locale) {
        try {
            ha q = ha.q(this.g.c(locale, 2130903107));
            q.size();
            return q;
        } catch (dk | ba | Resources.NotFoundException e2) {
            return nr.a;
        }
    }

    public final ha a(String str, Locale locale) {
        return (ha) b(str, locale).map(new c(this)).collect(bs.b);
    }

    public final Stream b(String str, Locale locale) {
        ha c2 = c(locale);
        String lowerCase = d.matcher(Normalizer.normalize(c.matcher(e.matcher(str).replaceAll("")).replaceAll(" "), Normalizer.Form.NFKD)).replaceAll("").toLowerCase(locale);
        StringBuilder sb = new StringBuilder();
        for (char c3 : lowerCase.toCharArray()) {
            if (c3 == 223) {
                sb.append("ss");
            } else if (c3 == 230) {
                sb.append("ae");
            } else if (c3 == 248) {
                sb.append('o');
            } else if (c3 != 322) {
                sb.append(c3);
            } else {
                sb.append('l');
            }
        }
        String sb2 = sb.toString();
        com.google.protobuf.ba createBuilder = n.a.createBuilder();
        String languageTag = locale.toLanguageTag();
        createBuilder.copyOnWrite();
        n nVar = createBuilder.instance;
        languageTag.getClass();
        nVar.b |= 1;
        nVar.e = languageTag;
        createBuilder.copyOnWrite();
        n nVar2 = createBuilder.instance;
        nVar2.c = 1;
        nVar2.d = sb2;
        createBuilder.build();
        return Stream._CC.empty().filter(new a(c2)).filter(new b(1)).filter(new b(0));
    }
}
