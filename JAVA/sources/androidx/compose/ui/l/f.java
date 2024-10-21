package androidx.compose.ui.l;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.app.Person;
import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.r$;
import androidx.core.app.an;
import androidx.core.d.i$;
import androidx.core.graphics.drawable.IconCompat;
import androidx.glance.c.n;
import androidx.glance.c.x;
import androidx.slice.b$;
import com.google.al.b.ak;
import com.google.android.apps.gsa.assistant.settings.features.am.a;
import com.google.android.apps.gsa.assistant.settings.features.am.b;
import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.n.c.m;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.search.assistant.platform.pcp.f.i;
import com.google.android.apps.search.assistant.surfaces.settings.search.d;
import com.google.android.libraries.assistant.p.b.h;
import com.google.android.libraries.storage.a.a.e;
import com.google.android.libraries.storage.protostore.ab;
import com.google.android.libraries.storage.protostore.ac;
import com.google.android.libraries.storage.protostore.af;
import com.google.android.libraries.storage.protostore.aq;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.tracing.bt;
import com.google.apps.tiktok.tracing.fg;
import com.google.apps.tiktok.tracing.fh;
import com.google.apps.tiktok.tracing.u;
import com.google.cm.k;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.base.at;
import com.google.common.o.nm;
import com.google.common.o.o.p;
import com.google.common.o.o.q;
import com.google.common.util.concurrent.cn;
import com.google.g.ar.gy;
import com.google.g.e.e.a.c;
import com.google.g.e.e.a.g;
import com.google.g.e.h.a.bm;
import com.google.g.e.h.a.do;
import com.google.g.e.i.bo;
import com.google.g.e.i.bp;
import com.google.g.e.i.d.co;
import com.google.g.e.i.ej;
import com.google.g.e.i.ry;
import com.google.g.e.i.si;
import com.google.g.q.b.ay;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.v;
import com.google.speech.i.ei;
import com.google.speech.i.fd;
import com.google.speech.i.ff;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:androidx/compose/ui/l/f.class */
public final class f {
    public static /* synthetic */ void A(SpannableString spannableString, CharSequence charSequence) {
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(0, spannableString.length(), ClickableSpan.class);
        int length = spannableString.length() - charSequence.length();
        for (ClickableSpan clickableSpan : clickableSpanArr) {
            int spanStart = spannableString.getSpanStart(clickableSpan);
            int spanEnd = spannableString.getSpanEnd(clickableSpan);
            if (spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(clickableSpan);
                spannableString.setSpan(clickableSpan, spanStart, length, 0);
            }
        }
    }

    public static /* synthetic */ BigDecimal B(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }

    public static /* synthetic */ gy C(ak akVar) {
        ba createBuilder = gy.a.createBuilder();
        String str = akVar.e;
        createBuilder.copyOnWrite();
        gy gyVar = createBuilder.instance;
        str.getClass();
        gyVar.b |= 1;
        gyVar.c = str;
        double d = akVar.c;
        createBuilder.copyOnWrite();
        gy gyVar2 = createBuilder.instance;
        gyVar2.b |= 2;
        gyVar2.d = d;
        double d2 = akVar.d;
        createBuilder.copyOnWrite();
        gy gyVar3 = createBuilder.instance;
        gyVar3.b |= 4;
        gyVar3.e = d2;
        return createBuilder.build();
    }

    public static /* synthetic */ ak D(gy gyVar) {
        ba createBuilder = ak.a.createBuilder();
        String str = gyVar.c;
        createBuilder.copyOnWrite();
        ak akVar = createBuilder.instance;
        str.getClass();
        akVar.b |= 8;
        akVar.e = str;
        double d = gyVar.d;
        createBuilder.copyOnWrite();
        ak akVar2 = createBuilder.instance;
        akVar2.b |= 1;
        akVar2.c = d;
        double d2 = gyVar.e;
        createBuilder.copyOnWrite();
        ak akVar3 = createBuilder.instance;
        akVar3.b |= 2;
        akVar3.d = d2;
        return createBuilder.build();
    }

    public static /* synthetic */ int E(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (str.equals(strArr[i2])) {
                return i2;
            }
        }
        return i;
    }

    public static /* synthetic */ void F(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    public static /* synthetic */ b G() {
        a a2 = b.a();
        a2.b(true);
        return a2.a();
    }

    public static /* synthetic */ Object[] H(d dVar) {
        String[] strArr = com.google.android.o.a.a.a;
        Object[] objArr = new Object[7];
        objArr[1] = Integer.valueOf(dVar.a);
        objArr[3] = Integer.valueOf(dVar.b);
        objArr[4] = dVar.c;
        objArr[6] = dVar.e;
        objArr[5] = dVar.d;
        return objArr;
    }

    public static /* synthetic */ void I(fh fhVar, be beVar, Object obj) {
        bt a2 = fhVar.a();
        try {
            beVar.hf(obj);
            u.f(u.b(), ((fg) a2).f5934a);
        } catch (Throwable th) {
            try {
                u.f(u.b(), ((fg) a2).f5934a);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean J(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = action;
        if (action != 1) {
            if (action != 0) {
                return false;
            }
            i = 0;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((y - totalPaddingTop) + scrollY), (x - totalPaddingLeft) + scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length <= 0) {
            Selection.removeSelection(spannable);
            return false;
        }
        ClickableSpan clickableSpan = clickableSpanArr[0];
        if (i == 1) {
            clickableSpan.onClick(textView);
            return true;
        }
        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        return true;
    }

    public static /* synthetic */ boolean K(com.google.g.e.e.a.d dVar) {
        boolean z;
        int dm;
        int dm2;
        boolean z2 = dVar.e.size() > 0 && (((dm = a.a.dm(((g) dVar.e.get(0)).c)) != 0 && dm == 2) || ((dm2 = a.a.dm(((g) dVar.e.get(0)).c)) != 0 && dm2 == 3));
        if ((dVar.b & 4) != 0) {
            c cVar = dVar.f;
            c cVar2 = cVar;
            if (cVar == null) {
                cVar2 = c.a;
            }
            int dm3 = a.a.dm(cVar2.e);
            if (dm3 != 0 && dm3 == 2) {
                z = true;
                int i = dVar.b;
                return !z2 ? true : true;
            }
        }
        z = false;
        int i2 = dVar.b;
        return !z2 ? true : true;
    }

    public static /* synthetic */ Boolean L(Boolean bool, Boolean bool2) {
        boolean z = false;
        if (bool.booleanValue()) {
            z = false;
            if (bool2.booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Boolean M(Boolean bool, Boolean bool2) {
        boolean z = true;
        if (!bool.booleanValue()) {
            z = bool2.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ boolean N(Account account) {
        return (account == null || TextUtils.isEmpty(account.type) || !account.type.equals("com.google") || TextUtils.isEmpty(account.name) || !account.name.endsWith("@google.com")) ? false : true;
    }

    public static /* synthetic */ String O() {
        if (Locale.getDefault() == null) {
            return "US";
        }
        String country = Locale.getDefault().getCountry();
        return TextUtils.isEmpty(country) ? "US" : country.toUpperCase(Locale.US);
    }

    public static /* synthetic */ String P(Intent intent) {
        if (intent == null || !"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return "";
        }
        String stringExtra = intent.getStringExtra("message_type");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "gcm";
        }
        return str;
    }

    public static /* synthetic */ v Q(int i) {
        v a2 = v.a(i);
        v vVar = a2;
        if (a2 == null) {
            vVar = v.a;
        }
        return vVar;
    }

    public static /* synthetic */ at R(String str) {
        return TextUtils.isEmpty(str) ? com.google.common.base.a.a : at.k(new Account(str, "com.google"));
    }

    public static /* synthetic */ com.google.android.apps.gsa.nga.shared.q.d.c S(ah ahVar) {
        int ordinal = ahVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? com.google.android.apps.gsa.nga.shared.q.d.c.a : com.google.android.apps.gsa.nga.shared.q.d.c.f : com.google.android.apps.gsa.nga.shared.q.d.c.e : com.google.android.apps.gsa.nga.shared.q.d.c.c : com.google.android.apps.gsa.nga.shared.q.d.c.b;
    }

    public static /* synthetic */ boolean T(String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ Optional U(m mVar) {
        Optional u = mVar.u(new String[]{"content"});
        return u.isPresent() ? u : Collection._EL.stream(mVar.d(new String[]{"object", "ElectronicMessage", "content"})).findFirst();
    }

    public static /* synthetic */ void W(cn cnVar) {
        if (cnVar.isDone()) {
            return;
        }
        cnVar.cancel(true);
    }

    public static /* synthetic */ boolean X(Uri uri) {
        return uri.getHost() != null && "clock-app".equals(uri.getScheme()) && "stopwatch".equals(uri.getLastPathSegment());
    }

    public static /* synthetic */ Intent Y(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.google.android.apps.cultural");
        intent.setData(uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    public static /* synthetic */ int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static /* synthetic */ List aA(com.google.android.apps.gsa.shared.m.c cVar) {
        List d = com.google.android.apps.gsa.shared.m.a.a.d(cVar);
        ArrayList arrayList = new ArrayList(d.size());
        int size = d.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            com.google.android.apps.gsa.shared.m.c cVar2 = (com.google.android.apps.gsa.shared.m.c) d.get(size);
            ba createBuilder = com.google.common.o.b.a.createBuilder();
            int b = cVar2.b();
            createBuilder.copyOnWrite();
            com.google.common.o.b bVar = createBuilder.instance;
            bVar.b |= 1;
            bVar.c = b;
            int a2 = cVar2.a();
            createBuilder.copyOnWrite();
            com.google.common.o.b bVar2 = createBuilder.instance;
            bVar2.b |= 2;
            bVar2.d = a2;
            arrayList.add(createBuilder.build());
        }
    }

    public static /* synthetic */ cg aB(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("overappdiscovery");
        dVar.c = "overappdiscovery";
        dVar.c("OverappDiscovery.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(com.google.android.apps.gsa.assistant.shared.j.a.c.f274a);
        a3.b = aq.f5565a;
        return afVar.a(a3.a());
    }

    public static /* synthetic */ cg aC(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("nga");
        dVar.c = "nga";
        dVar.c("NgaEducationPreferences.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(com.google.android.apps.gsa.nga.shared.f.m.f878a);
        a3.b = aq.f5565a;
        return afVar.a(a3.a());
    }

    public static /* synthetic */ ba aD(com.google.protos.bg.b.a.a.f fVar) {
        ba createBuilder = ay.a.createBuilder();
        String str = fVar.c;
        createBuilder.copyOnWrite();
        ay ayVar = createBuilder.instance;
        str.getClass();
        ayVar.b |= 1;
        ayVar.c = str;
        if ((fVar.b & 8) != 0) {
            String str2 = fVar.d;
            createBuilder.copyOnWrite();
            ay ayVar2 = createBuilder.instance;
            str2.getClass();
            ayVar2.b |= 64;
            ayVar2.h = str2;
        }
        if ((fVar.b & 16) != 0) {
            String str3 = fVar.e;
            createBuilder.copyOnWrite();
            ay ayVar3 = createBuilder.instance;
            str3.getClass();
            ayVar3.b |= 4;
            ayVar3.d = str3;
        }
        return createBuilder;
    }

    public static /* synthetic */ void aE(Location location, ba baVar) {
        if (location.hasBearing() || location.hasSpeed()) {
            com.google.protos.ag.a.a.e eVar = baVar.instance.j;
            com.google.protos.ag.a.a.e eVar2 = eVar;
            if (eVar == null) {
                eVar2 = com.google.protos.ag.a.a.e.a;
            }
            ba builder = eVar2.toBuilder();
            int round = Math.round(location.getBearing());
            builder.copyOnWrite();
            com.google.protos.ag.a.a.e eVar3 = builder.instance;
            eVar3.b |= 2;
            eVar3.c = round;
            int round2 = (int) Math.round(location.getSpeed() * 3.6d);
            builder.copyOnWrite();
            com.google.protos.ag.a.a.e eVar4 = builder.instance;
            eVar4.b |= 8;
            eVar4.d = round2;
            com.google.protos.ag.a.a.e build = builder.build();
            baVar.copyOnWrite();
            com.google.protos.ag.a.a.f fVar = baVar.instance;
            build.getClass();
            fVar.j = build;
            fVar.b |= 524288;
        }
    }

    public static /* synthetic */ boolean ab(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static /* synthetic */ ad ac(h hVar, p pVar) {
        bc createBuilder = ad.a.createBuilder();
        ba createBuilder2 = com.google.protos.e.v.b.a.b.a.createBuilder();
        q qVar = pVar.c;
        q qVar2 = qVar;
        if (qVar == null) {
            qVar2 = q.a;
        }
        long j = qVar2.c;
        createBuilder2.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar = createBuilder2.instance;
        bVar.b |= 1;
        bVar.c = j;
        q qVar3 = pVar.c;
        q qVar4 = qVar3;
        if (qVar3 == null) {
            qVar4 = q.a;
        }
        int i = qVar4.d;
        createBuilder2.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar2 = createBuilder2.instance;
        bVar2.b |= 2;
        bVar2.d = i;
        q qVar5 = pVar.c;
        q qVar6 = qVar5;
        if (qVar5 == null) {
            qVar6 = q.a;
        }
        int i2 = qVar6.e;
        createBuilder2.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar3 = createBuilder2.instance;
        bVar3.b |= 4;
        bVar3.e = i2;
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        com.google.protos.e.v.b.a.b build = createBuilder2.build();
        build.getClass();
        adVar.c = build;
        adVar.b |= 1;
        ba createBuilder3 = com.google.protobuf.h.a.createBuilder();
        createBuilder3.copyOnWrite();
        createBuilder3.instance.b = "type.googleapis.com/geller.oneplatform.AssistantHistoryElement";
        ba createBuilder4 = com.google.protos.o.b.g.a.createBuilder();
        createBuilder4.copyOnWrite();
        com.google.protos.o.b.g gVar = createBuilder4.instance;
        hVar.getClass();
        gVar.c = hVar;
        gVar.b |= 2;
        com.google.protobuf.v byteString = createBuilder4.build().toByteString();
        createBuilder3.copyOnWrite();
        com.google.protobuf.h hVar2 = createBuilder3.instance;
        byteString.getClass();
        hVar2.c = byteString;
        createBuilder.copyOnWrite();
        ad adVar2 = createBuilder.instance;
        com.google.protobuf.h build2 = createBuilder3.build();
        build2.getClass();
        adVar2.f = build2;
        adVar2.b |= 8;
        return createBuilder.build();
    }

    public static /* synthetic */ com.google.speech.recognizer.a.h ad(String str) {
        bc createBuilder = com.google.speech.recognizer.a.h.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.speech.recognizer.a.h hVar = createBuilder.instance;
        str.getClass();
        hVar.b |= 1;
        hVar.c = str;
        createBuilder.copyOnWrite();
        com.google.speech.recognizer.a.h hVar2 = createBuilder.instance;
        hVar2.b |= 8;
        hVar2.d = 1.0f;
        return createBuilder.build();
    }

    public static /* synthetic */ Optional ae(ff ffVar) {
        int i = ffVar.c;
        if (i == 2) {
            return Optional.empty();
        }
        if (i == 1) {
            ei eiVar = (ei) ffVar.d;
            if ((eiVar.b & 2) != 0) {
                return Optional.of(Float.valueOf(eiVar.f));
            }
        } else if (i == 4) {
            fd fdVar = (fd) ffVar.d;
            if ((fdVar.b & 1) != 0) {
                return Optional.of(Float.valueOf(fdVar.d));
            }
        }
        return Optional.empty();
    }

    public static /* synthetic */ Optional af(ff ffVar) {
        int i = ffVar.c;
        if (i == 2) {
            return Optional.empty();
        }
        if (i == 1) {
            ei eiVar = (ei) ffVar.d;
            if ((eiVar.b & 1) != 0) {
                return Optional.of(Float.valueOf(eiVar.e));
            }
        } else if (i == 4) {
            fd fdVar = (fd) ffVar.d;
            if ((fdVar.b & 2) != 0) {
                return Optional.of(Float.valueOf(fdVar.e));
            }
        }
        return Optional.empty();
    }

    public static /* synthetic */ int ag(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ bp ah(String str, String str2, com.google.g.e.i.ei eiVar) {
        si createBuilder = bp.a.createBuilder();
        createBuilder.copyOnWrite();
        bp bpVar = createBuilder.instance;
        bpVar.b |= 1;
        bpVar.c = str;
        si createBuilder2 = bo.a.createBuilder();
        ba createBuilder3 = ej.a.createBuilder();
        createBuilder3.copyOnWrite();
        ej ejVar = createBuilder3.instance;
        ejVar.b |= 1;
        ejVar.c = str2;
        createBuilder3.copyOnWrite();
        ej ejVar2 = createBuilder3.instance;
        eiVar.getClass();
        ejVar2.d = eiVar;
        ejVar2.b |= 2;
        createBuilder2.at(createBuilder3.build());
        bo build = createBuilder2.build();
        createBuilder.copyOnWrite();
        bp bpVar2 = createBuilder.instance;
        build.getClass();
        bpVar2.e = build;
        bpVar2.b |= 4;
        return createBuilder.build();
    }

    public static /* synthetic */ bp ai(ry ryVar) {
        si createBuilder = bp.a.createBuilder();
        createBuilder.copyOnWrite();
        bp bpVar = createBuilder.instance;
        bpVar.b |= 1;
        bpVar.c = "tts.OUTPUT";
        si createBuilder2 = bo.a.createBuilder();
        ba createBuilder3 = ej.a.createBuilder();
        createBuilder3.copyOnWrite();
        ej ejVar = createBuilder3.instance;
        ejVar.b |= 1;
        ejVar.c = "speech_output_args";
        ba createBuilder4 = com.google.g.e.i.ei.a.createBuilder();
        createBuilder4.copyOnWrite();
        com.google.g.e.i.ei eiVar = createBuilder4.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.SpeechOutputArgs";
        com.google.protobuf.v byteString = ryVar.toByteString();
        createBuilder4.copyOnWrite();
        com.google.g.e.i.ei eiVar2 = createBuilder4.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder3.copyOnWrite();
        ej ejVar2 = createBuilder3.instance;
        com.google.g.e.i.ei build = createBuilder4.build();
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        createBuilder2.av(createBuilder3);
        createBuilder.copyOnWrite();
        bp bpVar2 = createBuilder.instance;
        bo build2 = createBuilder2.build();
        build2.getClass();
        bpVar2.e = build2;
        bpVar2.b |= 4;
        return createBuilder.build();
    }

    public static /* synthetic */ boolean aj(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        devicePolicyManager.getClass();
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins == null) {
            return false;
        }
        Iterator<ComponentName> it = activeAdmins.iterator();
        while (it.hasNext()) {
            if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ com.google.android.apps.gsa.nga.shared.f.m ak(com.google.android.apps.gsa.nga.shared.f.m mVar) {
        int i = (mVar.b & 4096) != 0 ? mVar.u : 0;
        com.google.android.apps.gsa.nga.shared.f.m mVar2 = mVar;
        if (i < Integer.MAX_VALUE) {
            ba builder = mVar.toBuilder();
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.f.m mVar3 = (com.google.android.apps.gsa.nga.shared.f.m) builder.instance;
            mVar3.b |= 4096;
            mVar3.u = i + 1;
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.f.m mVar4 = (com.google.android.apps.gsa.nga.shared.f.m) builder.instance;
            mVar4.b |= 16384;
            mVar4.w = 0;
            mVar2 = (com.google.android.apps.gsa.nga.shared.f.m) builder.build();
        }
        return mVar2;
    }

    public static /* synthetic */ com.google.android.apps.gsa.nga.shared.f.m al(com.google.android.apps.gsa.nga.shared.f.m mVar) {
        int i = (mVar.b & 16384) != 0 ? mVar.w : 0;
        com.google.android.apps.gsa.nga.shared.f.m mVar2 = mVar;
        if (i < Integer.MAX_VALUE) {
            ba builder = mVar.toBuilder();
            builder.copyOnWrite();
            com.google.android.apps.gsa.nga.shared.f.m mVar3 = (com.google.android.apps.gsa.nga.shared.f.m) builder.instance;
            mVar3.b |= 16384;
            mVar3.w = i + 1;
            mVar2 = (com.google.android.apps.gsa.nga.shared.f.m) builder.build();
        }
        return mVar2;
    }

    public static /* synthetic */ fl am(List list, Object obj) {
        Stream skip = Stream._CC.concat(Collection._EL.stream(list), Stream._CC.of(obj)).skip(Math.max(0, list.size() - 99));
        int i = fl.e;
        return (fl) skip.collect(bs.a);
    }

    public static /* synthetic */ boolean an(Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    public static /* synthetic */ int[][] ao(String str, String str2) {
        int[][] iArr = new int[str.length()][str2.length()];
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i2 = 0;
            while (i2 < str2.length()) {
                if (charAt == str2.charAt(i2)) {
                    iArr[i][i2] = ((i == 0 || i2 == 0) ? 0 : iArr[i - 1][i2 - 1]) + (charAt == ' ' ? 0 : 1);
                }
                i2++;
            }
            i++;
        }
        return iArr;
    }

    public static /* synthetic */ Window ap(View view) {
        Context context = view.getContext();
        while (true) {
            Context context2 = context;
            if (context2 instanceof Activity) {
                return ((Activity) context2).getWindow();
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    public static /* synthetic */ boolean aq(String str, String str2) {
        int l = com.google.android.libraries.ak.e.a().l(str, str2);
        return l == 5 || l == 4 || l == 3;
    }

    public static /* synthetic */ boolean ar(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return com.google.android.apps.search.weather.b.b.a(intent).booleanValue() || new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity").equals(component);
    }

    public static /* synthetic */ long as(ay ayVar) {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        timeZone.setRawOffset(ayVar.g * 60000);
        com.google.cm.b bVar = ayVar.f;
        com.google.cm.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = com.google.cm.b.a;
        }
        calendar.set(1, bVar2.b);
        com.google.cm.b bVar3 = ayVar.f;
        com.google.cm.b bVar4 = bVar3;
        if (bVar3 == null) {
            bVar4 = com.google.cm.b.a;
        }
        calendar.set(2, bVar4.c - 1);
        com.google.cm.b bVar5 = ayVar.f;
        com.google.cm.b bVar6 = bVar5;
        if (bVar5 == null) {
            bVar6 = com.google.cm.b.a;
        }
        calendar.set(5, bVar6.d);
        k kVar = ayVar.e;
        k kVar2 = kVar;
        if (kVar == null) {
            kVar2 = k.a;
        }
        calendar.set(11, kVar2.b);
        k kVar3 = ayVar.e;
        k kVar4 = kVar3;
        if (kVar3 == null) {
            kVar4 = k.a;
        }
        calendar.set(12, kVar4.c);
        k kVar5 = ayVar.e;
        k kVar6 = kVar5;
        if (kVar5 == null) {
            kVar6 = k.a;
        }
        calendar.set(13, kVar6.d);
        calendar.set(14, 0);
        calendar.setTimeZone(timeZone);
        return calendar.getTimeInMillis();
    }

    public static /* synthetic */ List at(com.google.g.c.b.g gVar) {
        ArrayList arrayList = new ArrayList();
        Optional.of(nm.g);
        Intent intent = new Intent();
        intent.setAction("com.google.android.systemui.smartspace.CLICK_EVENT");
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.surfaces.hubmode.gateway.sysui.SysUiEntrypointActivity");
        intent.addFlags(268500992);
        intent.putExtra("text_query", "What is the weather");
        intent.putExtra("show_on_lockscreen", true);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", intent.toUri(1));
        ba createBuilder = com.google.g.c.b.g.a.createBuilder();
        com.google.g.c.b.f fVar = com.google.g.c.b.f.c;
        createBuilder.copyOnWrite();
        com.google.g.c.b.g gVar2 = createBuilder.instance;
        gVar2.c = fVar.d;
        gVar2.b |= 1;
        String uri = intent.toUri(1);
        createBuilder.copyOnWrite();
        com.google.g.c.b.g gVar3 = createBuilder.instance;
        uri.getClass();
        gVar3.b |= 2;
        gVar3.d = uri;
        createBuilder.copyOnWrite();
        com.google.g.c.b.g gVar4 = createBuilder.instance;
        gVar4.b |= 8;
        gVar4.f = true;
        com.google.g.c.b.g build = createBuilder.build();
        ba createBuilder2 = com.google.g.c.d.c.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.g.c.d.c cVar = createBuilder2.instance;
        gVar.getClass();
        cVar.d = gVar;
        cVar.b |= 2;
        createBuilder2.copyOnWrite();
        com.google.g.c.d.c cVar2 = createBuilder2.instance;
        cVar2.c = 2;
        cVar2.b |= 1;
        arrayList.add(createBuilder2.build());
        ba createBuilder3 = com.google.g.c.d.c.a.createBuilder();
        createBuilder3.copyOnWrite();
        com.google.g.c.d.c cVar3 = createBuilder3.instance;
        gVar.getClass();
        cVar3.d = gVar;
        cVar3.b |= 2;
        createBuilder3.copyOnWrite();
        com.google.g.c.d.c cVar4 = createBuilder3.instance;
        cVar4.c = 1;
        cVar4.b |= 1;
        arrayList.add(createBuilder3.build());
        ba createBuilder4 = com.google.g.c.d.c.a.createBuilder();
        createBuilder4.copyOnWrite();
        com.google.g.c.d.c cVar5 = createBuilder4.instance;
        build.getClass();
        cVar5.d = build;
        cVar5.b |= 2;
        createBuilder4.copyOnWrite();
        com.google.g.c.d.c cVar6 = createBuilder4.instance;
        cVar6.c = 4;
        cVar6.b |= 1;
        arrayList.add(createBuilder4.build());
        return arrayList;
    }

    public static /* synthetic */ boolean au(co coVar) {
        int ordinal = coVar.ordinal();
        if (ordinal == 26 || ordinal == 27 || ordinal == 29 || ordinal == 31) {
            return true;
        }
        switch (ordinal) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean av(co coVar) {
        int ordinal = coVar.ordinal();
        if (ordinal == 31) {
            return true;
        }
        switch (ordinal) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ at aw(com.google.android.apps.search.assistant.platform.pcp.f.c cVar) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.android.apps.search.assistant.platform.pcp.f.a.b);
        cVar.d(bgVar);
        if (((bd) cVar).br.o(bgVar.d)) {
            bg bgVar2 = bi.-$$Nest$smcheckIsLite(com.google.android.apps.search.assistant.platform.pcp.f.a.b);
            cVar.d(bgVar2);
            Object l = ((bd) cVar).br.l(bgVar2.d);
            com.google.android.apps.search.assistant.platform.pcp.f.a aVar = (com.google.android.apps.search.assistant.platform.pcp.f.a) (l == null ? bgVar2.b : bgVar2.c(l));
            if ((aVar.c & 1) != 0) {
                i iVar = aVar.d;
                i iVar2 = iVar;
                if (iVar == null) {
                    iVar2 = i.a;
                }
                return at.k(iVar2);
            }
        }
        return com.google.common.base.a.a;
    }

    public static /* synthetic */ Map ax(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
        }
        return hashMap;
    }

    public static /* synthetic */ ej ay(bm bmVar) {
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = "asst.device.properties";
        ba createBuilder2 = com.google.g.e.i.ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.DeviceProperties";
        com.google.protobuf.v byteString = bmVar.toByteString();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        com.google.g.e.i.ei build = createBuilder2.build();
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ ej az(do doVar) {
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = "media";
        ba createBuilder2 = com.google.g.e.i.ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.MediaParams";
        com.google.protobuf.v byteString = doVar.toByteString();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        com.google.g.e.i.ei build = createBuilder2.build();
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ void b(Appendable appendable, Object obj, l lVar) {
        if (lVar != null) {
            appendable.append((CharSequence) lVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static /* synthetic */ boolean c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Person d(an anVar) {
        Person.Builder m = b$.ExternalSyntheticApiModelOutline0.m(new Person.Builder(), anVar.a);
        IconCompat iconCompat = anVar.b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = androidx.core.graphics.drawable.a.a(iconCompat, (Context) null);
        }
        return b$.ExternalSyntheticApiModelOutline0.m(b$.ExternalSyntheticApiModelOutline0.m$1(b$.ExternalSyntheticApiModelOutline0.m(b$.ExternalSyntheticApiModelOutline0.m$1(b$.ExternalSyntheticApiModelOutline0.m(b$.ExternalSyntheticApiModelOutline0.m(m, icon), anVar.c), anVar.d), anVar.e), anVar.f));
    }

    public static /* synthetic */ void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static /* synthetic */ void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static /* synthetic */ boolean g(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public static /* synthetic */ int h(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                i--;
                if (i < 0) {
                    return z ? -1 : 0;
                }
                char charAt = charSequence.charAt(i);
                if (z) {
                    if (!Character.isHighSurrogate(charAt)) {
                        return -1;
                    }
                    i2--;
                } else if (!Character.isSurrogate(charAt)) {
                    i2--;
                } else {
                    if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    }
                    z = true;
                }
            }
            return i;
        }
    }

    public static /* synthetic */ int i(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                if (i >= length) {
                    if (z) {
                        return -1;
                    }
                    return length;
                }
                char charAt = charSequence.charAt(i);
                if (z) {
                    if (!Character.isLowSurrogate(charAt)) {
                        return -1;
                    }
                    i++;
                    i2--;
                } else if (!Character.isSurrogate(charAt)) {
                    i++;
                    i2--;
                } else {
                    if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    }
                    i++;
                    z = true;
                }
            }
            return i;
        }
    }

    public static /* synthetic */ void j(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public static /* synthetic */ void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static /* synthetic */ Object l(Object obj, androidx.glance.v vVar) {
        return vVar instanceof x ? vVar : obj;
    }

    public static /* synthetic */ Object m(Object obj, androidx.glance.v vVar) {
        return vVar instanceof n ? vVar : obj;
    }

    public static /* synthetic */ View n(View view) {
        view.getClass();
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static /* synthetic */ int o(int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static /* synthetic */ ComponentName p(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (queryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    public static /* synthetic */ int q(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else {
            if (j == j2) {
                return 0;
            }
            i = 1;
        }
        return i;
    }

    public static /* synthetic */ ByteBuffer r(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static /* synthetic */ ByteBuffer s(ByteBuffer byteBuffer, int i) {
        if (i < 8) {
            throw new IllegalArgumentException(a.a.dy(i, "end < start: ", " < 8"));
        }
        int capacity = byteBuffer.capacity();
        if (i > byteBuffer.capacity()) {
            throw new IllegalArgumentException(a.a.dz(capacity, i, "end > capacity: ", " > "));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static /* synthetic */ void t(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static /* synthetic */ int u(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new IllegalArgumentException("Argument must be between Calendar.SUNDAY and Calendar.SATURDAY");
        }
    }

    public static /* synthetic */ void v(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    public static /* synthetic */ Context w(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static /* synthetic */ int x(float f) {
        return (int) (f + (f > 0.0f ? 0.5d : -0.5d));
    }

    public static /* synthetic */ void z(EditText editText, int i) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable m = r$.ExternalSyntheticApiModelOutline0.m(editText);
            m.setColorFilter(porterDuffColorFilter);
            i$.ExternalSyntheticApiModelOutline0.m(editText, m);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable drawable = editText.getContext().getDrawable(i2);
            drawable.setColorFilter(porterDuffColorFilter);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawable, drawable});
        } catch (Exception e) {
        }
    }
}
