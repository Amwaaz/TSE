package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.ResultReceiver;
import android.support.v4.app.ag;
import android.support.v7.widget.df;
import android.support.v7.widget.ek;
import android.support.v7.widget.em;
import android.support.v7.widget.ep;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.util.SizeF;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RemoteViews;
import android.widget.Switch;
import androidx.car.app.serialization.Bundleable;
import androidx.compose.runtime.k;
import com.google.android.apps.gsa.assist.e;
import com.google.android.apps.gsa.nga.engine.recognition.i;
import com.google.android.apps.gsa.nga.engine.recognition.p;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.bl;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import com.google.android.apps.gsa.shared.v.bg;
import com.google.android.apps.gsa.staticplugins.opa.au.a.a.t;
import com.google.android.apps.gsa.staticplugins.opa.au.a.a.u;
import com.google.android.apps.gsa.staticplugins.opa.au.a.c;
import com.google.android.apps.gsa.staticplugins.opa.au.a.d;
import com.google.android.apps.gsa.staticplugins.opa.chatui.gd;
import com.google.android.apps.gsa.x.c.g.h;
import com.google.android.libraries.search.ac.b.ad;
import com.google.android.libraries.search.ac.b.r;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.g.d.n;
import com.google.aw.h.e.a.ab;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.y;
import com.google.common.l.m;
import com.google.common.util.concurrent.cn;
import com.google.g.ar.ap;
import com.google.g.ar.as;
import com.google.g.c.ay;
import com.google.g.c.bb;
import com.google.g.c.bf;
import com.google.g.e.i.bn;
import com.google.g.e.i.bo;
import com.google.g.e.i.bp;
import com.google.g.e.i.bq;
import com.google.g.e.i.br;
import com.google.g.e.i.d.bm;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.el;
import com.google.g.e.i.fh;
import com.google.g.e.i.gk;
import com.google.g.e.i.gr;
import com.google.g.e.i.im;
import com.google.g.e.i.it;
import com.google.g.e.i.jj;
import com.google.g.e.i.jt;
import com.google.g.e.i.jx;
import com.google.g.e.i.jy;
import com.google.g.e.i.mn;
import com.google.g.e.i.qp;
import com.google.g.e.i.si;
import com.google.g.q.b.ax;
import com.google.g.q.b.az;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.ce;
import com.google.protobuf.v;
import com.google.speech.g.ao;
import com.google.speech.g.aw;
import com.google.speech.i.dy;
import com.google.speech.recognizer.a.z;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import m.h.a.l;
import m.w;

/* loaded from: classes-dex2jar.jar:a/a.class */
public final class a {
    public static /* synthetic */ Void A(l lVar, Object obj) {
        return (Void) lVar.a(obj);
    }

    public static /* synthetic */ List B(l lVar, Object obj) {
        return (List) lVar.a(obj);
    }

    public static /* synthetic */ w C(l lVar, Object obj) {
        return (w) lVar.a(obj);
    }

    public static /* synthetic */ n D(l lVar, Object obj) {
        return (n) lVar.a(obj);
    }

    public static /* synthetic */ Integer E(l lVar, Object obj) {
        return (Integer) lVar.a(obj);
    }

    public static /* synthetic */ com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.b F(l lVar, Object obj) {
        return (com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.b) lVar.a(obj);
    }

    public static /* synthetic */ v G(l lVar, Object obj) {
        return (v) lVar.a(obj);
    }

    public static /* synthetic */ bn H(bm bmVar, it itVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_input.FormInput";
        ba createBuilder2 = im.a.createBuilder();
        createBuilder2.copyOnWrite();
        im imVar = createBuilder2.instance;
        bmVar.getClass();
        imVar.c = bmVar;
        imVar.b |= 1;
        createBuilder2.copyOnWrite();
        im imVar2 = createBuilder2.instance;
        itVar.getClass();
        imVar2.d = itVar;
        imVar2.b |= 2;
        v byteString = createBuilder2.build().toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        ei build = createBuilder.build();
        si createBuilder3 = bn.a.createBuilder();
        createBuilder3.copyOnWrite();
        bn bnVar = createBuilder3.instance;
        bnVar.b |= 1;
        bnVar.c = "ui.FORM_INPUT";
        createBuilder3.aw("form_input", build);
        return createBuilder3.build();
    }

    public static /* synthetic */ String I(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.search.i.a.n nVar = (com.google.android.libraries.search.i.a.n) it.next();
            if (str.equals(nVar.c)) {
                return nVar.d;
            }
        }
        return null;
    }

    public static /* synthetic */ ClientEventData J(u uVar) {
        bc createBuilder = d.a.createBuilder();
        c cVar = c.b;
        createBuilder.copyOnWrite();
        d dVar = createBuilder.instance;
        dVar.c = cVar.n;
        dVar.b |= 1;
        createBuilder.w(t.a, uVar);
        d build = createBuilder.build();
        ae aeVar = new ae(ac.OPA_SESSION_CLIENT_EVENT);
        aeVar.e(com.google.android.apps.gsa.staticplugins.opa.au.a.a.a, build);
        return aeVar.d();
    }

    public static /* synthetic */ void K(Switch r3, boolean z) {
        if (z) {
            r3.setEnabled(true);
        } else {
            r3.setChecked(false);
            r3.setEnabled(false);
        }
    }

    public static /* synthetic */ byte[] M(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static /* synthetic */ boolean N(com.google.g.c.b.c cVar) {
        return ((cVar.b & 1) == 0 || cVar.e.size() == 0) ? false : true;
    }

    public static /* synthetic */ bb O(String str) {
        ba createBuilder = bb.a.createBuilder();
        createBuilder.copyOnWrite();
        bb bbVar = createBuilder.instance;
        bbVar.b |= 1;
        bbVar.c = "com.google.android.googlequicksearchbox";
        createBuilder.copyOnWrite();
        bb bbVar2 = createBuilder.instance;
        bbVar2.b |= 2;
        bbVar2.d = "OpaChannel_29";
        createBuilder.copyOnWrite();
        bb bbVar3 = createBuilder.instance;
        bbVar3.e = 1;
        bbVar3.b |= 4;
        String quote = Pattern.quote(str);
        createBuilder.copyOnWrite();
        bb bbVar4 = createBuilder.instance;
        quote.getClass();
        bbVar4.b |= 8;
        bbVar4.f = quote;
        createBuilder.copyOnWrite();
        bb bbVar5 = createBuilder.instance;
        bbVar5.g = 1;
        bbVar5.b |= 16;
        createBuilder.copyOnWrite();
        bb bbVar6 = createBuilder.instance;
        bbVar6.h = 1;
        bbVar6.b |= 32;
        return createBuilder.build();
    }

    public static /* synthetic */ bb P(String str) {
        ba createBuilder = bb.a.createBuilder();
        createBuilder.copyOnWrite();
        bb bbVar = createBuilder.instance;
        bbVar.b |= 1;
        bbVar.c = "com.google.android.googlequicksearchbox";
        createBuilder.copyOnWrite();
        bb bbVar2 = createBuilder.instance;
        bbVar2.b |= 2;
        bbVar2.d = "OpaChannel_28";
        createBuilder.copyOnWrite();
        bb bbVar3 = createBuilder.instance;
        bbVar3.e = 1;
        bbVar3.b |= 4;
        String quote = Pattern.quote(str);
        createBuilder.copyOnWrite();
        bb bbVar4 = createBuilder.instance;
        quote.getClass();
        bbVar4.b |= 8;
        bbVar4.f = quote;
        createBuilder.copyOnWrite();
        bb bbVar5 = createBuilder.instance;
        bbVar5.g = 1;
        bbVar5.b |= 16;
        createBuilder.copyOnWrite();
        bb bbVar6 = createBuilder.instance;
        bbVar6.h = 1;
        bbVar6.b |= 32;
        return createBuilder.build();
    }

    public static /* synthetic */ boolean Q(ay ayVar) {
        return ayVar == ay.d || ayVar == ay.y;
    }

    public static /* synthetic */ boolean R(Locale locale, com.google.g.q.b.bb bbVar) {
        Locale forLanguageTag = Locale.forLanguageTag(bbVar.d);
        return locale.getLanguage().equals(forLanguageTag.getLanguage()) && locale.getCountry().equals(forLanguageTag.getCountry());
    }

    public static /* synthetic */ com.google.g.c.b.a S(String str) {
        ba createBuilder = com.google.g.c.b.a.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.g.c.b.a aVar = createBuilder.instance;
        str.getClass();
        aVar.b |= 1;
        aVar.c = str;
        createBuilder.copyOnWrite();
        com.google.g.c.b.a aVar2 = createBuilder.instance;
        aVar2.d = 0;
        aVar2.b |= 2;
        createBuilder.copyOnWrite();
        com.google.g.c.b.a aVar3 = createBuilder.instance;
        aVar3.e = 3;
        aVar3.b |= 4;
        createBuilder.copyOnWrite();
        com.google.g.c.b.a aVar4 = createBuilder.instance;
        aVar4.b |= 8;
        aVar4.f = false;
        return createBuilder.build();
    }

    public static /* synthetic */ String T(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.appendCodePoint(str.codePointAt(i));
            sb.append((char) 822);
        }
        return sb.toString();
    }

    public static /* synthetic */ void U(Context context, az azVar, StringBuilder sb) {
        com.google.g.q.b.ay ayVar = azVar.h;
        com.google.g.q.b.ay ayVar2 = ayVar;
        if (ayVar == null) {
            ayVar2 = com.google.g.q.b.ay.a;
        }
        int i = ayVar2.b;
        com.google.g.q.b.ay ayVar3 = azVar.h;
        com.google.g.q.b.ay ayVar4 = ayVar3;
        if (ayVar3 == null) {
            ayVar4 = com.google.g.q.b.ay.a;
        }
        boolean z = (ayVar4.b & 4) != 0;
        boolean z2 = (azVar.n.isEmpty() || (((ax) azVar.n.get(0)).b & 1) == 0) ? false : true;
        if ((i & 64) != 0 && (!z || !z2)) {
            sb.append(" · ");
            Resources resources = context.getResources();
            com.google.g.q.b.ay ayVar5 = azVar.h;
            com.google.g.q.b.ay ayVar6 = ayVar5;
            if (ayVar5 == null) {
                ayVar6 = com.google.g.q.b.ay.a;
            }
            sb.append(resources.getString(2132084105, ayVar6.h));
        }
        if (z) {
            sb.append(" · ");
            Resources resources2 = context.getResources();
            com.google.g.q.b.ay ayVar7 = azVar.h;
            com.google.g.q.b.ay ayVar8 = ayVar7;
            if (ayVar7 == null) {
                ayVar8 = com.google.g.q.b.ay.a;
            }
            sb.append(resources2.getString(2132084100, ayVar8.d));
        }
        if (z2) {
            sb.append(" · ");
            sb.append(context.getResources().getString(2132084108, ((ax) azVar.n.get(0)).c));
        }
    }

    public static /* synthetic */ long V(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(13) > 0) {
            calendar.add(12, 1);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        return calendar.getTimeInMillis();
    }

    public static /* synthetic */ int W(com.google.g.c.b.c cVar) {
        cb cbVar = cVar.e;
        for (int i = 0; i < cbVar.size(); i++) {
            int dh = dh(((com.google.g.c.b.a) cbVar.get(i)).d);
            if (dh != 0 && dh != 1) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ long X(bf bfVar) {
        if ((bfVar.b & 131072) == 0) {
            return -1L;
        }
        com.google.g.c.az azVar = bfVar.u;
        com.google.g.c.az azVar2 = azVar;
        if (azVar == null) {
            azVar2 = com.google.g.c.az.a;
        }
        if ((azVar2.b & 1) == 0) {
            return -1L;
        }
        com.google.g.c.az azVar3 = bfVar.u;
        com.google.g.c.az azVar4 = azVar3;
        if (azVar3 == null) {
            azVar4 = com.google.g.c.az.a;
        }
        return azVar4.c;
    }

    public static /* synthetic */ void Y(RemoteViews remoteViews, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            remoteViews.setContentDescription(i, null);
        } else {
            remoteViews.setContentDescription(i, str);
        }
    }

    public static /* synthetic */ void Z(View view, View view2, View view3, int i) {
        float height = view.getHeight() - view2.getHeight();
        float f = i;
        float f2 = 0.7f * height;
        float f3 = 1.0f;
        if (f > f2) {
            f3 = 1.0f - ((f - f2) / (height - f2));
        }
        view3.setAlpha(f3);
    }

    public static /* synthetic */ double[] a(double[] dArr) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int min = Math.min(19200, length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            double d2 = dArr[i];
            d += d2 * d2;
        }
        arrayList.add(Double.valueOf(d / min));
        int i2 = 0;
        while (min < length) {
            double d3 = dArr[i2];
            double d4 = dArr[min];
            min++;
            d = (d - (d3 * d3)) + (d4 * d4);
            if (min % 4800 == 0) {
                arrayList.add(Double.valueOf(d / 19200.0d));
            }
            i2++;
        }
        double[] dArr2 = new double[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            dArr2[i3] = ((Double) arrayList.get(i3)).doubleValue();
        }
        return dArr2;
    }

    public static /* synthetic */ int aA(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aB(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            default:
                return 0;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
        }
    }

    public static /* synthetic */ int aC(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 9:
            default:
                return 0;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
        }
    }

    public static /* synthetic */ int aD(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aE(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aF(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aG(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aH(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aI(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aJ(int i) {
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
        if (i != 5) {
            return i != 7 ? 0 : 8;
        }
        return 6;
    }

    public static /* synthetic */ int[] aK() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static /* synthetic */ int aL(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aM(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aN(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aP(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean aQ(Object obj) {
        return ((com.google.protos.o.b.ay) obj).c == 2;
    }

    public static /* synthetic */ boolean aR(Object obj) {
        as asVar = ((ap) obj).j;
        as asVar2 = asVar;
        if (asVar == null) {
            asVar2 = as.b;
        }
        return asVar2.m;
    }

    public static /* synthetic */ int aS(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aT(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ int aU(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean aV(Object obj) {
        bk a2 = bk.a(((bl) obj).c);
        bk bkVar = a2;
        if (a2 == null) {
            bkVar = bk.UNKNOWN;
        }
        return bkVar == bk.QUERY_SENSITIVE;
    }

    public static /* synthetic */ Optional aW(dy dyVar) {
        int dm = dm(dyVar.b);
        int i = dm;
        if (dm == 0) {
            i = 1;
        }
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? Optional.empty() : Optional.of(i.c) : Optional.of(i.b);
    }

    public static /* synthetic */ Object aX(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        boolean z = true;
        if (!((Boolean) obj).booleanValue()) {
            z = true;
            if (!bool.booleanValue()) {
                z = bool2.booleanValue();
            }
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ com.google.knowledge.a.a.a aY(String str, com.google.knowledge.a.a.c cVar) {
        bc createBuilder = com.google.knowledge.a.a.a.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.knowledge.a.a.a aVar = createBuilder.instance;
        aVar.b |= 2;
        aVar.e = str;
        createBuilder.copyOnWrite();
        com.google.knowledge.a.a.a aVar2 = createBuilder.instance;
        cVar.getClass();
        aVar2.f = cVar;
        aVar2.b |= 4;
        return createBuilder.build();
    }

    public static /* synthetic */ com.google.knowledge.a.a.c aZ(String str) {
        com.google.knowledge.a.a.b createBuilder = com.google.knowledge.a.a.c.a.createBuilder();
        ba createBuilder2 = com.google.knowledge.a.a.i.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.knowledge.a.a.i iVar = createBuilder2.instance;
        str.getClass();
        iVar.b = 1;
        iVar.c = str;
        createBuilder.copyOnWrite();
        com.google.knowledge.a.a.c cVar = createBuilder.instance;
        com.google.knowledge.a.a.i build = createBuilder2.build();
        build.getClass();
        cVar.c = build;
        cVar.b = 3;
        return createBuilder.build();
    }

    public static /* synthetic */ RectF aa(float f, RectF rectF, RectF rectF2) {
        float f2 = 1.0f - f;
        return new RectF((rectF.left * f2) + (rectF2.left * f), (rectF.top * f2) + (rectF2.top * f), (rectF.right * f2) + (rectF2.right * f), (f2 * rectF.bottom) + (f * rectF2.bottom));
    }

    public static /* synthetic */ double ab(List list, RectF rectF) {
        float width = rectF.width() * rectF.height();
        Iterator it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            RectF rectF2 = (RectF) it.next();
            float width2 = rectF2.width();
            float height = rectF2.height();
            RectF rectF3 = new RectF(rectF2);
            float width3 = rectF3.intersect(rectF) ? rectF3.width() * rectF3.height() : 0.0f;
            f += width3;
            width = (width + (width2 * height)) - width3;
        }
        return f / width;
    }

    public static /* synthetic */ void ac(MaterialButton materialButton) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(materialButton, (Property<MaterialButton, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(materialButton, (Property<MaterialButton, Float>) View.SCALE_X, 0.8f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        play.with(ofFloat2);
        animatorSet.start();
    }

    public static /* synthetic */ RectF ad(SizeF sizeF, RectF rectF, float f, float f2) {
        float f3 = rectF.top;
        float height = sizeF.getHeight();
        float centerX = rectF.centerX();
        float width = sizeF.getWidth() / 2.0f;
        float height2 = ((f3 - f2) - f) - height >= 0.0f ? (rectF.top - f) - sizeF.getHeight() : rectF.bottom + f;
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        rectF2.offsetTo(centerX - width, height2);
        return rectF2;
    }

    public static /* synthetic */ RectF ae(RectF rectF, RectF rectF2) {
        float f = rectF.left;
        float f2 = rectF.top;
        float max = Math.max(Math.min(f, rectF2.right - rectF.width()), rectF2.left);
        float max2 = Math.max(Math.min(f2, rectF2.bottom - rectF.height()), rectF2.top);
        RectF rectF3 = new RectF(rectF);
        rectF3.offsetTo(max, max2);
        return rectF3;
    }

    public static /* synthetic */ Object af(Object obj) {
        ((Number) obj).floatValue();
        return w.a;
    }

    public static /* synthetic */ r ag(com.google.android.libraries.search.ac.b.ae aeVar) {
        r rVar;
        aeVar.getClass();
        if (aeVar.p) {
            rVar = r.B;
        } else {
            ab abVar = aeVar.j;
            ab abVar2 = abVar;
            if (abVar == null) {
                abVar2 = ab.b;
            }
            com.google.aw.h.e.a.c cVar = abVar2.n;
            com.google.aw.h.e.a.c cVar2 = cVar;
            if (cVar == null) {
                cVar2 = com.google.aw.h.e.a.c.a;
            }
            if ((cVar2.b & 1) != 0) {
                rVar = r.f;
            } else {
                ad a2 = ad.a(aeVar.g);
                ad adVar = a2;
                if (a2 == null) {
                    adVar = ad.a;
                }
                rVar = adVar == ad.n ? r.l : r.b;
            }
        }
        return rVar;
    }

    public static /* synthetic */ Bitmap ah(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        float f = width;
        float f2 = height;
        paint.setShader(new LinearGradient(f, 0.0f, 0.0f, f2, new int[]{i, i2}, new float[]{0.6f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        return createBitmap;
    }

    public static /* synthetic */ h aj(e.d.c cVar) {
        try {
            ao aoVar = (ao) cVar.a();
            return new h(at.k(aoVar), ao.b);
        } catch (ExecutionException e) {
            ExecutionException executionException = e;
            if (e.getCause() != null) {
                executionException = e.getCause();
            }
            throw new com.google.android.apps.gsa.shared.speech.b.n(executionException, 131077);
        }
    }

    public static /* synthetic */ h ak(boolean z) {
        ba createBuilder = com.google.speech.g.t.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.speech.g.t tVar = createBuilder.instance;
        tVar.c |= 1;
        tVar.d = z;
        return new h(at.k(createBuilder.build()), com.google.speech.g.t.b);
    }

    public static /* synthetic */ h al() {
        ba createBuilder = aw.a.createBuilder();
        createBuilder.copyOnWrite();
        aw awVar = createBuilder.instance;
        awVar.c |= 1;
        awVar.d = true;
        return new h(at.k(createBuilder.build()), aw.b);
    }

    public static /* synthetic */ ContextThemeWrapper am(com.google.android.apps.gsa.staticplugins.nga.ui.b.a aVar, Context context) {
        ContextThemeWrapper contextThemeWrapper;
        if (aVar.a()) {
            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(com.google.android.material.c.d.c(context), 2132149076);
            contextThemeWrapper = contextThemeWrapper2;
            if (com.google.android.material.c.d.b()) {
                contextThemeWrapper2.getTheme().applyStyle(2132149077, true);
                return contextThemeWrapper2;
            }
        } else if (aVar.b()) {
            ContextThemeWrapper contextThemeWrapper3 = new ContextThemeWrapper(context, 2132149896);
            contextThemeWrapper = contextThemeWrapper3;
            if (com.google.android.material.c.d.b()) {
                contextThemeWrapper3.getTheme().applyStyle(2132149897, true);
                return contextThemeWrapper3;
            }
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132148549);
        }
        return contextThemeWrapper;
    }

    public static /* synthetic */ Path an(m.l.a aVar) {
        float floatValue = Float.valueOf(aVar.a).floatValue();
        if (floatValue < 0.0f || floatValue > 1.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        float floatValue2 = Float.valueOf(aVar.b).floatValue();
        if (floatValue2 < 0.0f || floatValue2 > 1.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path = new Path();
        if (Float.valueOf(aVar.a).floatValue() > 0.0f) {
            path.lineTo(Float.valueOf(aVar.a).floatValue(), 0.0f);
        }
        path.lineTo(Float.valueOf(aVar.b).floatValue(), 1.0f);
        if (Float.valueOf(aVar.b).floatValue() < 1.0f) {
            path.lineTo(1.0f, 1.0f);
        }
        return path;
    }

    public static /* synthetic */ int aq(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 0 : 5;
        }
        return 3;
    }

    public static /* synthetic */ int ar(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ int as(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int at(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int au(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int av(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aw(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
            case 16:
            default:
                return 0;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 17:
                return 18;
            case 18:
                return 19;
        }
    }

    public static /* synthetic */ int ax(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ay(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int az(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int b(z zVar) {
        int ordinal = zVar.ordinal();
        if (ordinal == 0) {
            return 224;
        }
        if (ordinal == 3) {
            return 384;
        }
        if (ordinal == 9) {
            return 224;
        }
        throw new RuntimeException("Unsupported AMR encoding:".concat(String.valueOf(String.valueOf(zVar))));
    }

    public static /* synthetic */ float bA(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public static /* synthetic */ int bB(em emVar, df dfVar, View view, View view2, android.support.v7.widget.dy dyVar, boolean z) {
        if (dyVar.getChildCount() == 0 || emVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(dyVar.getPosition(view) - dyVar.getPosition(view2)) + 1;
        }
        return Math.min(dfVar.k(), dfVar.a(view2) - dfVar.d(view));
    }

    public static /* synthetic */ int bC(em emVar, df dfVar, View view, View view2, android.support.v7.widget.dy dyVar, boolean z, boolean z2) {
        if (dyVar.getChildCount() == 0 || emVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (emVar.a() - Math.max(dyVar.getPosition(view), dyVar.getPosition(view2))) - 1) : Math.max(0, Math.min(dyVar.getPosition(view), dyVar.getPosition(view2)));
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(dfVar.a(view2) - dfVar.d(view)) / (Math.abs(dyVar.getPosition(view) - dyVar.getPosition(view2)) + 1))) + (dfVar.j() - dfVar.d(view)));
    }

    public static /* synthetic */ int bD(em emVar, df dfVar, View view, View view2, android.support.v7.widget.dy dyVar, boolean z) {
        if (dyVar.getChildCount() == 0 || emVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return emVar.a();
        }
        int a2 = dfVar.a(view2);
        int d = dfVar.d(view);
        int abs = Math.abs(dyVar.getPosition(view) - dyVar.getPosition(view2));
        return (int) (((a2 - d) / (abs + 1)) * emVar.a());
    }

    public static /* synthetic */ int bE(int i, int i2, int i3) {
        int i4 = i2;
        if (i2 == 0) {
            if (i3 != 0) {
                i4 = 0;
            }
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int i5 = mode;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i5 = 1073741824;
            }
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i3), i5);
    }

    public static /* synthetic */ boolean bF(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static /* synthetic */ long bG(InputStream inputStream, OutputStream outputStream) {
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            long j2 = j;
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j2;
            }
            outputStream.write(bArr, 0, read);
            j = j2 + read;
        }
    }

    public static /* synthetic */ void bH(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        list.remove(size2);
                    }
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static /* synthetic */ int bI(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(dy(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(dz(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(dz(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ void bJ(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(dz(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(dA(i, "Index < 0: "));
        }
    }

    public static /* synthetic */ int bK(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static /* synthetic */ int bL(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        int i2 = i;
        long j2 = j;
        if (((-2097152) & j) != 0) {
            j2 = j >>> 14;
            i2 = i + 2;
        }
        int i3 = i2;
        if ((j2 & (-16384)) != 0) {
            i3 = i2 + 1;
        }
        return i3;
    }

    public static /* synthetic */ Object bM(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ int bN(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ boolean bO(byte b) {
        return b > -65;
    }

    public static /* synthetic */ boolean bP(byte b) {
        return b < -16;
    }

    public static /* synthetic */ boolean bQ(byte b) {
        return b < -32;
    }

    public static /* synthetic */ int bR(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static /* synthetic */ cn bS(List list) {
        bg bgVar = (bg) list.get(0);
        return bgVar;
    }

    public static /* synthetic */ com.google.cj.b bT(e.d.d dVar) {
        return new com.google.cj.b(dVar.gP());
    }

    public static /* synthetic */ void bU(f fVar, Iterable iterable) {
        if (iterable == null) {
            fVar.b("VoiceActions").a(new com.google.android.apps.gsa.shared.util.b.d("null", false));
            return;
        }
        f d = fVar.d((Object) null);
        d.q("VoiceActions");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d.m((g) it.next());
        }
    }

    public static /* synthetic */ boolean bV(Query query) {
        return query.aZ("android.opa.extra.QUERY_INITIATED_BY_NGA") && query.aZ("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA") && query.ba("android.opa.extra.ASSISTANT_RESPONSE");
    }

    public static /* synthetic */ int bW(Query query) {
        if (query.cx()) {
            return 160;
        }
        if (query.cS()) {
            return 161;
        }
        if (query.ca()) {
            return query.di() ? 581 : 173;
        }
        return 273;
    }

    public static /* synthetic */ List bX(Intent intent, PackageManager packageManager) {
        return intent.getComponent() != null ? packageManager.queryIntentActivities(intent, 0) : packageManager.queryIntentActivities(intent, 65664);
    }

    public static /* synthetic */ float bY(float f, float f2) {
        return f2 > f ? f + ((f2 - f) * 0.3f) : f * 0.92f;
    }

    public static /* synthetic */ com.google.android.apps.gsa.shared.i.b.h bZ() {
        com.google.android.apps.gsa.shared.i.b.h hVar = new com.google.android.apps.gsa.shared.i.b.h();
        hVar.b.put("Content-Type", "application/json");
        hVar.b.put("Origin", "https://www.google.com");
        return hVar;
    }

    public static /* synthetic */ int ba(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bb(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bc(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bd(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int be(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void bf(ba baVar, e eVar) {
        if (eVar == null) {
            return;
        }
        com.google.aw.h.c.a.e eVar2 = baVar.instance.d;
        com.google.aw.h.c.a.e eVar3 = eVar2;
        if (eVar2 == null) {
            eVar3 = com.google.aw.h.c.a.e.a;
        }
        com.google.knowledge.b.f fVar = eVar3.f;
        com.google.knowledge.b.f fVar2 = fVar;
        if (fVar == null) {
            fVar2 = com.google.knowledge.b.f.a;
        }
        com.google.knowledge.b.e builder = fVar2.toBuilder();
        com.google.knowledge.b.f fVar3 = builder.instance;
        if ((fVar3.b & 2048) != 0) {
            e eVar4 = fVar3.l;
            e eVar5 = eVar4;
            if (eVar4 == null) {
                eVar5 = e.a;
            }
            bc builder2 = eVar5.toBuilder();
            builder2.mergeFrom(eVar);
            builder.copyOnWrite();
            com.google.knowledge.b.f fVar4 = builder.instance;
            e build = builder2.build();
            build.getClass();
            fVar4.l = build;
            fVar4.b |= 2048;
        } else {
            builder.copyOnWrite();
            com.google.knowledge.b.f fVar5 = builder.instance;
            fVar5.l = eVar;
            fVar5.b |= 2048;
        }
        com.google.aw.h.c.a.e eVar6 = baVar.instance.d;
        com.google.aw.h.c.a.e eVar7 = eVar6;
        if (eVar6 == null) {
            eVar7 = com.google.aw.h.c.a.e.a;
        }
        com.google.aw.h.c.a.b builder3 = eVar7.toBuilder();
        builder3.copyOnWrite();
        com.google.aw.h.c.a.e eVar8 = builder3.instance;
        com.google.knowledge.b.f build2 = builder.build();
        build2.getClass();
        eVar8.f = build2;
        eVar8.b |= 2;
        baVar.copyOnWrite();
        com.google.g.e.e.a.b bVar = baVar.instance;
        com.google.aw.h.c.a.e build3 = builder3.build();
        build3.getClass();
        bVar.d = build3;
        bVar.b |= 2;
    }

    public static /* synthetic */ int bg(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.b;
            case 1:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.c;
            case 2:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.d;
            case 3:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.e;
            case 4:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.f;
            case 5:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.g;
            case 6:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.k;
            case 7:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.h;
            case 8:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.i;
            case 9:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.j;
            case 10:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.l;
            case 11:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.a;
            case 12:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.m;
            case 13:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.n;
            case 14:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.o;
            case 15:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.p;
            case 16:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.q;
            case 17:
                return com.google.android.apps.gsa.nga.shared.u.j.b.d.r;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(p.a(i))));
        }
    }

    public static /* synthetic */ String bh(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "PAUSED_BY_DEMAND" : "PAUSED_BY_TIMEOUT" : "ERROR" : "LOADED" : "LOADING" : "COMMITTED" : "IDLE";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3 > 'Z') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean bi(char r3) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = 65
            if (r0 < r1) goto L10
            r0 = r5
            r4 = r0
            r0 = r3
            r1 = 90
            if (r0 <= r1) goto L25
        L10:
            r0 = r3
            r1 = 97
            if (r0 < r1) goto L23
            r0 = r3
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L21
            r0 = r5
            r4 = r0
            goto L25
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 0
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.bi(char):boolean");
    }

    public static /* synthetic */ String bj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE";
    }

    public static /* synthetic */ String bk(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ String bl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static /* synthetic */ String bm(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "ERROR" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    public static /* synthetic */ Object bn(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static /* synthetic */ void bo(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static /* synthetic */ void bp(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeBundle(((Bundleable) parcelable).a);
        }
    }

    public static /* synthetic */ boolean bq() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object br() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void bs() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void bt() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void bu() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean bv() {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static /* synthetic */ boolean bw(View view, Object obj) {
        return ((ag) obj).getView() == view;
    }

    public static /* synthetic */ void bx(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ep) list.get(size)).a.animate().cancel();
            }
        }
    }

    public static /* synthetic */ PorterDuff.Mode by(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ boolean bz(android.support.v7.widget.dy dyVar) {
        PointF computeScrollVectorForPosition;
        boolean z = dyVar instanceof ek;
        int itemCount = dyVar.getItemCount();
        if (!z || (computeScrollVectorForPosition = ((ek) dyVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r4 = com.google.g.e.i.ei.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r0 = com.google.protobuf.bi.parseFrom(com.google.g.e.h.a.fc.a, r4.d, com.google.protobuf.ExtensionRegistryLite.getGeneratedRegistry()).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r0.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        return com.google.common.base.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        return com.google.common.base.at.k(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.google.common.base.at c(com.google.g.e.i.ce r4) {
        /*
            r0 = r4
            com.google.protobuf.cb r0 = r0.b
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        La:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7f
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.google.g.e.i.ej r0 = (com.google.g.e.i.ej) r0
            r6 = r0
            java.lang.String r0 = "asst.request.logging.params"
            r1 = r6
            java.lang.String r1 = r1.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            r0 = r6
            com.google.g.e.i.ei r0 = r0.d
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L39
            com.google.g.e.i.ei r0 = com.google.g.e.i.ei.a
            r4 = r0
        L39:
            java.lang.String r0 = "assistant.api.params.RequestLoggingParams"
            r1 = r4
            java.lang.String r1 = r1.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            r0 = r6
            com.google.g.e.i.ei r0 = r0.d     // Catch: com.google.protobuf.ce -> L83
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L55
            com.google.g.e.i.ei r0 = com.google.g.e.i.ei.a     // Catch: com.google.protobuf.ce -> L83
            r4 = r0
        L55:
            r0 = r4
            com.google.protobuf.v r0 = r0.d     // Catch: com.google.protobuf.ce -> L83
            r4 = r0
            com.google.protobuf.ExtensionRegistryLite r0 = com.google.protobuf.ExtensionRegistryLite.getGeneratedRegistry()     // Catch: com.google.protobuf.ce -> L83
            r5 = r0
            com.google.g.e.h.a.fc r0 = com.google.g.e.h.a.fc.a     // Catch: com.google.protobuf.ce -> L83
            r1 = r4
            r2 = r5
            com.google.protobuf.bi r0 = com.google.protobuf.bi.parseFrom(r0, r1, r2)     // Catch: com.google.protobuf.ce -> L83
            com.google.g.e.h.a.fc r0 = (com.google.g.e.h.a.fc) r0     // Catch: com.google.protobuf.ce -> L83
            java.lang.String r0 = r0.d     // Catch: com.google.protobuf.ce -> L83
            r4 = r0
            r0 = r4
            boolean r0 = r0.isEmpty()     // Catch: com.google.protobuf.ce -> L83
            if (r0 == 0) goto L78
            com.google.common.base.a r0 = com.google.common.base.a.a     // Catch: com.google.protobuf.ce -> L83
            return r0
        L78:
            r0 = r4
            com.google.common.base.at r0 = com.google.common.base.at.k(r0)     // Catch: com.google.protobuf.ce -> L83
            r4 = r0
            r0 = r4
            return r0
        L7f:
            com.google.common.base.a r0 = com.google.common.base.a.a
            return r0
        L83:
            r4 = move-exception
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.c(com.google.g.e.i.ce):com.google.common.base.at");
    }

    public static /* synthetic */ int cA(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int cB(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int cC(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ Object cD(Object obj, Object obj2) {
        k kVar = (k) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && kVar.R()) {
            kVar.y();
        }
        return w.a;
    }

    public static /* synthetic */ void cE(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dz(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void cF(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(dz(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void cG(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(dz(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ long cH(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static /* synthetic */ void cI(float[] fArr, float[] fArr2) {
        if (fArr2.length < 3) {
            return;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static /* synthetic */ int cJ(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int cK(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int cL(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ boolean cM(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static /* synthetic */ int cN(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int cO(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int cP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 6 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int cQ(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ void cR(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ String cS(int i) {
        switch (i) {
            case 1:
                return "EMAIL";
            case 2:
                return "PHONE_NUMBER";
            case 3:
                return "USERNAME";
            case 4:
                return "DEVICE_ID";
            case 5:
                return "GAIA_ID";
            case 6:
                return "APP_UNIQUE_ID";
            case 7:
                return "EMPTY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String cT(int i) {
        return i != 1 ? i != 2 ? "NOT_DISMISSIBLE" : "DISMISSIBLE" : "DISMISSIBILITY_UNSPECIFIED";
    }

    public static /* synthetic */ int cU(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int[] cV() {
        return new int[]{1, 2, 3, 4};
    }

    public static /* synthetic */ int[] cW() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static /* synthetic */ int cX(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int cY(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int cZ(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ cn ca(int i, e.d.d dVar, e.d.d dVar2) {
        return i == 0 ? dVar2.gP() : dVar.gP();
    }

    public static /* synthetic */ int cb(String str) {
        if (cl.L(str)) {
            return -1;
        }
        if (com.google.protos.an.d.b.f.cM.name().equals(str)) {
            return 3;
        }
        if (com.google.protos.an.d.b.f.ce.name().equals(str)) {
            return 2;
        }
        if (com.google.protos.an.d.b.f.q.name().equals(str)) {
            return 4;
        }
        if (com.google.protos.an.d.b.f.aa.name().equals(str)) {
            return 0;
        }
        if (com.google.protos.an.d.b.f.bz.name().equals(str)) {
            return 3;
        }
        return com.google.protos.an.d.b.f.eE.name().equals(str) ? 2 : -1;
    }

    public static /* synthetic */ Uri cc(String str) {
        if (cl.L(str)) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str).build();
    }

    public static /* synthetic */ Uri cd(String str, String str2) {
        if (cl.L(str2)) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str2).appendQueryParameter("new_setting_value", str).build();
    }

    public static /* synthetic */ boolean cf(String str) {
        return !cl.L(str) && Character.isLetter(str.charAt(0));
    }

    public static /* synthetic */ boolean cg(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static /* synthetic */ boolean ch(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.equals(str)) {
                return true;
            }
            if (str2.endsWith("*") && str.startsWith(str2.substring(0, str2.length() - 1))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean ci(Context context) {
        PowerManager powerManager;
        return (context == null || context.getApplicationContext() == null || (powerManager = (PowerManager) context.getApplicationContext().getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static /* synthetic */ Integer[] cj(TextUtils.StringSplitter stringSplitter, String str) {
        Integer v;
        Integer[] numArr = new Integer[4];
        stringSplitter.setString(str);
        Iterator it = stringSplitter.iterator();
        int i = 0;
        while (it.hasNext() && (v = com.google.common.r.k.v((String) it.next())) != null) {
            if (v.intValue() < 0) {
                throw new IllegalArgumentException("Invalid version string format: ".concat(String.valueOf(str)));
            }
            numArr[i] = v;
            int i2 = i + 1;
            i = i2;
            if (i2 >= 4) {
                break;
            }
        }
        if (numArr[0] == null || numArr[1] == null) {
            throw new IllegalArgumentException("Invalid version string format: ".concat(String.valueOf(str)));
        }
        return numArr;
    }

    public static /* synthetic */ double ck(List list) {
        double d = 0.0d;
        double d2 = 0.0d;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                d += ((Double) list.get(i)).doubleValue();
            }
            d2 = d / list.size();
        }
        return d2;
    }

    public static /* synthetic */ void cl(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ void cm(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3 > 'z') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean cn(char r3) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = 97
            if (r0 < r1) goto L10
            r0 = r5
            r4 = r0
            r0 = r3
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L25
        L10:
            r0 = r3
            r1 = 65
            if (r0 < r1) goto L23
            r0 = r3
            r1 = 90
            if (r0 > r1) goto L21
            r0 = r5
            r4 = r0
            goto L25
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 0
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.cn(char):boolean");
    }

    public static /* synthetic */ int cp(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int cq(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int cr(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int cs(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 5 ? 0 : 7;
        }
        return 5;
    }

    public static /* synthetic */ int ct(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int cu(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int cv(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 6) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int cw(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ ej cx(String str, v vVar, String str2) {
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = str;
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        vVar.getClass();
        eiVar.b |= 2;
        eiVar.d = vVar;
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        eiVar2.b |= 1;
        eiVar2.c = str2;
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        ei build = createBuilder2.build();
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ String cy(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static /* synthetic */ int cz(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ List d(fh fhVar) {
        ArrayList arrayList = new ArrayList();
        gk gkVar = fhVar.c;
        gk gkVar2 = gkVar;
        if (gkVar == null) {
            gkVar2 = gk.a;
        }
        if ((gkVar2.b & 2) != 0) {
            gk gkVar3 = fhVar.c;
            gk gkVar4 = gkVar3;
            if (gkVar3 == null) {
                gkVar4 = gk.a;
            }
            arrayList.add(gkVar4.f);
        }
        gk gkVar5 = fhVar.c;
        gk gkVar6 = gkVar5;
        if (gkVar5 == null) {
            gkVar6 = gk.a;
        }
        mn mnVar = gkVar6.e;
        mn mnVar2 = mnVar;
        if (mnVar == null) {
            mnVar2 = mn.a;
        }
        if ((mnVar2.b & 8) != 0) {
            gk gkVar7 = fhVar.c;
            gk gkVar8 = gkVar7;
            if (gkVar7 == null) {
                gkVar8 = gk.a;
            }
            mn mnVar3 = gkVar8.e;
            mn mnVar4 = mnVar3;
            if (mnVar3 == null) {
                mnVar4 = mn.a;
            }
            arrayList.add(mnVar4.f);
        }
        gk gkVar9 = fhVar.c;
        gk gkVar10 = gkVar9;
        if (gkVar9 == null) {
            gkVar10 = gk.a;
        }
        mn mnVar5 = gkVar10.e;
        mn mnVar6 = mnVar5;
        if (mnVar5 == null) {
            mnVar6 = mn.a;
        }
        arrayList.addAll(mnVar6.g);
        return arrayList;
    }

    public static /* synthetic */ String dA(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ void dB(y yVar, String str, char c, Throwable th) {
        com.google.common.f.h g = ((com.google.common.f.h) yVar).g(th);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ String dC(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String dD(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String dE(Object obj, Object obj2, String str, String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    public static /* synthetic */ String dF(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String dG(int i, String str, SparseIntArray sparseIntArray) {
        return str + Integer.toHexString(i) + "   " + sparseIntArray.get(i);
    }

    public static /* synthetic */ String dH(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static /* synthetic */ String dI(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String dJ(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String dK(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String dL(Object obj, Object obj2, Object obj3, String str, String str2, String str3) {
        return str + obj3 + str2 + obj2 + str3 + obj;
    }

    public static /* synthetic */ String dM(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String dN(Object obj, String str, String str2, String str3, String str4) {
        return str2 + str + str3 + obj + str4;
    }

    public static /* synthetic */ String dO(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String dP(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String dQ(Object obj, String str) {
        return str + obj;
    }

    public static /* synthetic */ String dR(String str, int i, String str2, String str3) {
        return str2 + i + str3 + str;
    }

    public static /* synthetic */ String dS(boolean z, String str) {
        return str + z;
    }

    public static /* synthetic */ String dT(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String dU(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String dV(Class cls) {
        return cls.getCanonicalName() + "-" + UUID.randomUUID();
    }

    public static /* synthetic */ String dW(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String dX(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String dY(StringBuilder sb, String str, int i, String str2, int i2, androidx.compose.runtime.a.d dVar) {
        sb.append("Error while pushing ");
        sb.append(dVar);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i2);
        sb.append(" int arguments (");
        sb.append(str2);
        sb.append(") and ");
        sb.append(i);
        sb.append(" object arguments (");
        sb.append(str);
        sb.append(").");
        return sb.toString();
    }

    public static /* synthetic */ String dZ(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ int da(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int db(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int dc(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int dd(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int de(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int df(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int dg(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int dh(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int[] di() {
        return new int[]{1, 2};
    }

    public static /* synthetic */ int dj(int i) {
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
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int dk(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ int dl(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int dm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int dn(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    /* renamed from: do */
    public static /* synthetic */ int[] m0do() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ int dp(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int dq(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int[] dr() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    public static /* synthetic */ int ds(int i) {
        switch (i) {
            case 0:
                return 10;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int dt(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ float[] du(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[1];
        float f5 = fArr[2];
        return new float[]{f2 * f, f4 * f3, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static /* synthetic */ void dv(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ gd dw(com.google.g.e.i.a.b bVar) {
        String str = bVar.c;
        int i = bVar.d;
        String str2 = bVar.e;
        qp qpVar = bVar.f;
        qp qpVar2 = qpVar;
        if (qpVar == null) {
            qpVar2 = qp.a;
        }
        return new gd(str, str2, qpVar2);
    }

    public static /* synthetic */ String dx(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String dy(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String dz(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ Optional e(com.google.android.libraries.gsa.conversation.clientop.d dVar) {
        if (dVar == null || !dVar.d.h()) {
            return Optional.empty();
        }
        at atVar = ((com.google.android.libraries.gsa.conversation.f.g) dVar.d.c()).b;
        return atVar.h() ? Optional.of(com.google.android.libraries.search.t.k.a.b(((com.google.android.apps.gsa.search.core.a.v) atVar.c()).a.E)) : Optional.empty();
    }

    public static /* synthetic */ String ea(float f, String str) {
        return str + f;
    }

    public static /* synthetic */ String eb(String str, String str2, String str3, String str4, String str5) {
        return str3 + str4 + str2 + str5 + str;
    }

    public static /* synthetic */ String ec(int i, String str) {
        return i + str;
    }

    public static /* synthetic */ String ed(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String ee(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String ef(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ String eg(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String eh(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + String.valueOf(obj);
    }

    public static /* synthetic */ String ei(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ String ej(Object obj, String str) {
        return str + obj.toString();
    }

    public static /* synthetic */ String ek(char c, String str, String str2) {
        return str + c + str2;
    }

    public static /* synthetic */ boolean f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!"content".equalsIgnoreCase(Uri.parse((String) it.next()).getScheme())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ ResultReceiver g(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    public static /* synthetic */ ej h(String str, String str2, v vVar) {
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = str;
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        vVar.getClass();
        eiVar.b |= 2;
        eiVar.d = vVar;
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        eiVar2.b |= 1;
        eiVar2.c = str2;
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        ei build = createBuilder2.build();
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ jt i(com.google.bn.a.a.f fVar, jj jjVar) {
        ba createBuilder = jt.a.createBuilder();
        String str = fVar.b;
        createBuilder.copyOnWrite();
        jt jtVar = createBuilder.instance;
        str.getClass();
        jtVar.c = str;
        String str2 = fVar.c;
        createBuilder.copyOnWrite();
        jt jtVar2 = createBuilder.instance;
        str2.getClass();
        jtVar2.d = str2;
        createBuilder.copyOnWrite();
        jt jtVar3 = createBuilder.instance;
        jjVar.getClass();
        jtVar3.e = jjVar;
        int i = 1;
        jtVar3.b |= 1;
        String str3 = fVar.e;
        createBuilder.copyOnWrite();
        jt jtVar4 = createBuilder.instance;
        str3.getClass();
        jtVar4.f = str3;
        int dn = dn(fVar.f);
        if (dn != 0) {
            i = dn;
        }
        createBuilder.copyOnWrite();
        createBuilder.instance.g = i - 1;
        return createBuilder.build();
    }

    public static /* synthetic */ br j(com.google.protos.e.b.a.k kVar) {
        ba createBuilder = br.a.createBuilder();
        ba createBuilder2 = el.a.createBuilder();
        com.google.g.e.i.ek ekVar = com.google.g.e.i.ek.a;
        createBuilder2.copyOnWrite();
        el elVar = createBuilder2.instance;
        elVar.c = ekVar.u;
        elVar.b |= 1;
        createBuilder.copyOnWrite();
        br brVar = createBuilder.instance;
        el build = createBuilder2.build();
        build.getClass();
        brVar.c = build;
        brVar.b |= 1;
        si createBuilder3 = bq.a.createBuilder();
        ba createBuilder4 = ej.a.createBuilder();
        createBuilder4.copyOnWrite();
        ej ejVar = createBuilder4.instance;
        ejVar.b |= 1;
        ejVar.c = "slice_audio_result";
        ba createBuilder5 = ei.a.createBuilder();
        v byteString = kVar.toByteString();
        createBuilder5.copyOnWrite();
        ei eiVar = createBuilder5.instance;
        byteString.getClass();
        eiVar.b |= 2;
        eiVar.d = byteString;
        createBuilder5.copyOnWrite();
        ei eiVar2 = createBuilder5.instance;
        eiVar2.b |= 1;
        eiVar2.c = "assistant.api.client_op.SliceAudioResult";
        createBuilder4.copyOnWrite();
        ej ejVar2 = createBuilder4.instance;
        ei build2 = createBuilder5.build();
        build2.getClass();
        ejVar2.d = build2;
        ejVar2.b |= 2;
        createBuilder3.aq(createBuilder4);
        createBuilder.copyOnWrite();
        br brVar2 = createBuilder.instance;
        bq build3 = createBuilder3.build();
        build3.getClass();
        brVar2.d = build3;
        brVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ String k(jy jyVar, Bundle bundle) {
        String str = jyVar.e;
        String str2 = jyVar.f;
        String str3 = jyVar.g;
        jx a2 = jx.a(jyVar.j);
        jx jxVar = a2;
        if (a2 == null) {
            jxVar = jx.a;
        }
        String str4 = "vnd.android.cursor.item/*";
        if (!TextUtils.isEmpty(str)) {
            str4 = "vnd.android.cursor.item/*";
            if (jxVar == jx.b) {
                bundle.putString("android.intent.extra.title", str);
                str4 = "vnd.android.cursor.item/audio";
            }
            if (jxVar == jx.d) {
                bundle.putString("android.intent.extra.artist", str);
                str4 = "vnd.android.cursor.item/artist";
            }
            if (jxVar == jx.c) {
                bundle.putString("android.intent.extra.album", str);
                str4 = "vnd.android.cursor.item/album";
            }
            if (jxVar == jx.j) {
                bundle.putString("android.intent.extra.genre", str);
                str4 = "vnd.android.cursor.item/genre";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("android.intent.extra.artist", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("android.intent.extra.album", str3);
        }
        return str4;
    }

    public static /* synthetic */ Optional l(bp bpVar) {
        bo boVar = bpVar.e;
        bo boVar2 = boVar;
        if (boVar == null) {
            boVar2 = bo.a;
        }
        for (ej ejVar : boVar2.b) {
            if (ejVar.c.equals("timer_params")) {
                try {
                    ei eiVar = ejVar.d;
                    ei eiVar2 = eiVar;
                    if (eiVar == null) {
                        eiVar2 = ei.a;
                    }
                    return Optional.of(bi.parseFrom(com.google.g.e.h.a.gd.a, eiVar2.d, ExtensionRegistryLite.getGeneratedRegistry()));
                } catch (ce e) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    public static /* synthetic */ String m(ArrayList arrayList) {
        String str = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) pair.first;
            boolean booleanValue = ((Boolean) ((Pair) pair.second).first).booleanValue();
            int intValue = ((Integer) ((Pair) pair.second).second).intValue();
            String str3 = str;
            if (booleanValue) {
                if (intValue == 1) {
                    return str2;
                }
                str3 = str;
                if (str == null) {
                    str3 = str2;
                }
            }
            i++;
            str = str3;
        }
        return str;
    }

    public static /* synthetic */ int o(InputStream inputStream, byte[] bArr) {
        try {
            return m.a(inputStream, bArr, 0, bArr.length);
        } catch (IOException e) {
            throw new com.google.android.apps.gsa.shared.m.d(e, 393267);
        } catch (com.google.android.libraries.search.d.r.c e2) {
            throw new com.google.android.apps.gsa.shared.m.d(e2, 393269);
        } catch (com.google.android.libraries.search.d.r.a e3) {
            throw new com.google.android.apps.gsa.shared.m.d(e3, 393268);
        }
    }

    public static /* synthetic */ boolean p(Query query) {
        boolean z = false;
        if (!query.aZ("android.speech.extra.BEEP_SUPPRESSED")) {
            if (!query.bx() && !query.bJ()) {
                z = true;
            } else {
                if (query.bw()) {
                    return true;
                }
                z = false;
            }
        }
        return z;
    }

    public static /* synthetic */ MessageLite r(bo boVar, String str, com.google.protobuf.df dfVar) {
        for (ej ejVar : boVar.b) {
            if (str.equals(ejVar.c)) {
                ei eiVar = ejVar.d;
                ei eiVar2 = eiVar;
                if (eiVar == null) {
                    eiVar2 = ei.a;
                }
                return (MessageLite) dfVar.j(eiVar2.d, ExtensionRegistryLite.getGeneratedRegistry());
            }
        }
        throw new com.google.android.libraries.gsa.conversation.clientop.a(str);
    }

    public static /* synthetic */ com.google.android.apps.search.assistant.verticals.ambient.i.b s(String str) {
        com.google.android.apps.search.assistant.verticals.ambient.i.a a2 = com.google.android.apps.search.assistant.verticals.ambient.i.b.a();
        a2.b(str);
        a2.b = Optional.of(com.google.g.aq.c.d);
        a2.c(1.0d);
        return a2.a();
    }

    public static /* synthetic */ String t(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return "no device";
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Locale locale = Locale.US;
        String name = bluetoothDevice.getName();
        int type = bluetoothDevice.getType();
        String address = bluetoothDevice.getAddress();
        int i = -1;
        int deviceClass = bluetoothClass != null ? bluetoothClass.getDeviceClass() : -1;
        if (bluetoothClass != null) {
            i = bluetoothClass.getMajorDeviceClass();
        }
        return String.format(locale, "name:%s type:%d addr:%s class:%s deviceClass:%d majorDeviceClass:%d services{limited_disc:%b pos:%b netwrk:%b render:%b capture:%b obj_tfr:%b audio:%b tele:%b info:%b}", name, Integer.valueOf(type), address, bluetoothClass, Integer.valueOf(deviceClass), Integer.valueOf(i), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(8192) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(65536) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(131072) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(262144) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(524288) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(1048576) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(2097152) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(4194304) : false), Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(8388608) : false));
    }

    public static /* synthetic */ boolean u(LocalDate localDate, com.google.g.aq.g gVar) {
        com.google.cm.e a2 = com.google.cm.e.a(gVar.b);
        com.google.cm.e eVar = a2;
        if (a2 == null) {
            eVar = com.google.cm.e.a;
        }
        androidx.compose.ui.l.f.f(com.google.cm.a.c.a.contains(eVar), "Proto does not represent valid day of week.");
        return DayOfWeek.of(eVar.getNumber()) == localDate.getDayOfWeek();
    }

    public static /* synthetic */ gr v(List list) {
        boolean z;
        si createBuilder = gr.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -2049557543:
                    if (str.equals("Saturday")) {
                        z = 6;
                        break;
                    }
                    break;
                case -1984635600:
                    if (str.equals("Monday")) {
                        z = true;
                        break;
                    }
                    break;
                case -1807319568:
                    if (str.equals("Sunday")) {
                        z = false;
                        break;
                    }
                    break;
                case -897468618:
                    if (str.equals("Wednesday")) {
                        z = 3;
                        break;
                    }
                    break;
                case 687309357:
                    if (str.equals("Tuesday")) {
                        z = 2;
                        break;
                    }
                    break;
                case 1636699642:
                    if (str.equals("Thursday")) {
                        z = 4;
                        break;
                    }
                    break;
                case 2112549247:
                    if (str.equals("Friday")) {
                        z = 5;
                        break;
                    }
                    break;
            }
            z = -1;
            switch (z) {
                case false:
                    createBuilder.U(0);
                    break;
                case true:
                    createBuilder.U(1);
                    break;
                case true:
                    createBuilder.U(2);
                    break;
                case true:
                    createBuilder.U(3);
                    break;
                case true:
                    createBuilder.U(4);
                    break;
                case true:
                    createBuilder.U(5);
                    break;
                case true:
                    createBuilder.U(6);
                    break;
            }
        }
        return createBuilder.build();
    }

    public static /* synthetic */ Boolean w(l lVar, Object obj) {
        return (Boolean) lVar.a(obj);
    }

    public static /* synthetic */ cn x(l lVar, Object obj) {
        return (cn) lVar.a(obj);
    }

    public static /* synthetic */ Optional y(l lVar, Object obj) {
        return (Optional) lVar.a(obj);
    }

    public static /* synthetic */ String z(l lVar, Object obj) {
        return (String) lVar.a(obj);
    }
}
