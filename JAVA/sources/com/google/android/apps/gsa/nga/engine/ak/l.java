package com.google.android.apps.gsa.nga.engine.ak;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.nga.engine.ak.w.b;
import com.google.android.apps.gsa.nga.shared.p.c;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.g.e.c.c.cu;
import com.google.g.e.h.a.cf;
import com.google.g.e.h.a.fn;
import com.google.g.e.h.a.gd;
import com.google.g.e.i.bo;
import com.google.g.e.i.bp;
import com.google.g.e.i.cq;
import com.google.g.e.i.cw;
import com.google.g.e.i.d.bm;
import com.google.g.e.i.d.cd;
import com.google.g.e.i.d.ci;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.ml;
import com.google.g.e.i.ry;
import com.google.g.e.i.si;
import com.google.g.e.i.sp;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import com.google.protobuf.df;
import com.google.protobuf.v;
import com.google.speech.k.a.r;
import j$.util.Optional;
import java.net.URISyntaxException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/l.class */
public final class l {
    public static bp a(cq cqVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ModifySettingArgs";
        v byteString = cqVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("device.MODIFY_SETTING", "modify_setting_args", createBuilder.build());
    }

    public static bp b(c cVar) {
        String cVar2 = cVar.toString();
        ba q = q(cVar.a.toLanguageTag());
        q.copyOnWrite();
        r rVar = q.instance;
        r rVar2 = r.a;
        cVar2.getClass();
        rVar.c |= 1;
        rVar.f = cVar2;
        r build = q.build();
        ba createBuilder = ry.a.createBuilder();
        createBuilder.copyOnWrite();
        ry ryVar = createBuilder.instance;
        cVar2.getClass();
        ryVar.b |= 1;
        ryVar.c = cVar2;
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = "speech.s3.TtsServiceRequest";
        v byteString = build.toByteString();
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder.copyOnWrite();
        ry ryVar2 = createBuilder.instance;
        ei build2 = createBuilder2.build();
        build2.getClass();
        ryVar2.d = build2;
        ryVar2.b |= 2;
        return f.ai(createBuilder.build());
    }

    public static boolean c(bp bpVar) {
        String str = bpVar.c;
        return str.equals("media.STOP") || str.equals("media.RESUME") || str.equals("media.PAUSE") || str.equals("media.PREVIOUS") || str.equals("media.NEXT");
    }

    public static final bp d(String str, com.google.g.e.h.a.f fVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.AlarmParams";
        v byteString = fVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah(str, "alarm_params", createBuilder.build());
    }

    public static final bp e() {
        ba createBuilder = sp.a.createBuilder();
        createBuilder.copyOnWrite();
        sp spVar = createBuilder.instance;
        spVar.b |= 1;
        spVar.c = 1000L;
        sp build = createBuilder.build();
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.WaitArgs";
        v byteString = build.toByteString();
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("execution.WAIT", "wait_args", createBuilder2.build());
    }

    public static final bp f(com.google.g.e.i.d.c cVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ui.ExitNativeFormArgs";
        v byteString = cVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("ui.EXIT_NATIVE_FORM", "exit_native_form_args", createBuilder.build());
    }

    public static final bp g(cw cwVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ShowDeviceSettingCardArgs";
        v byteString = cwVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("ui.SHOW_DEVICE_SETTING_CARD", "show_device_setting_card_args", createBuilder.build());
    }

    public static final bp h(bm bmVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ui.ShowNativeFormArgs";
        v byteString = bmVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("ui.SHOW_NATIVE_FORM", "show_native_form_args", createBuilder.build());
    }

    public static final bp i(cd cdVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ShowSuggestionsArgs";
        v byteString = cdVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("ui.SHOW_SUGGESTIONS", "show_suggestions_args", createBuilder.build());
    }

    public static final bp j(String str, fn fnVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.StopwatchArgs";
        v byteString = fnVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah(str, "stopwatch_args", createBuilder.build());
    }

    public static final bp k(String str, gd gdVar) {
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.TimerParams";
        v byteString = gdVar.toByteString();
        createBuilder.copyOnWrite();
        ei eiVar2 = createBuilder.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah(str, "timer_params", createBuilder.build());
    }

    public static final Optional l(com.google.protos.an.d.b.f fVar, boolean z) {
        Optional a2 = b.a(fVar);
        if (a2.isEmpty()) {
            return Optional.empty();
        }
        ba createBuilder = cq.a.createBuilder();
        int i = true != z ? 3 : 2;
        createBuilder.copyOnWrite();
        cq cqVar = createBuilder.instance;
        cqVar.d = i - 1;
        cqVar.b |= 2;
        String name = fVar.name();
        createBuilder.copyOnWrite();
        cq cqVar2 = createBuilder.instance;
        name.getClass();
        cqVar2.b |= 16;
        cqVar2.g = name;
        String uri = ((Uri) a2.get()).toString();
        createBuilder.copyOnWrite();
        cq cqVar3 = createBuilder.instance;
        uri.getClass();
        cqVar3.b |= 64;
        cqVar3.i = uri;
        return Optional.of(a(createBuilder.build()));
    }

    public static final bp m(String str) {
        ba createBuilder = ci.a.createBuilder();
        createBuilder.copyOnWrite();
        ci ciVar = createBuilder.instance;
        str.getClass();
        ciVar.b |= 1;
        ciVar.c = str;
        createBuilder.copyOnWrite();
        ci ciVar2 = createBuilder.instance;
        ciVar2.b |= 8;
        ciVar2.f = true;
        createBuilder.copyOnWrite();
        ci ciVar3 = createBuilder.instance;
        ciVar3.d = 1;
        ciVar3.b |= 2;
        ci build = createBuilder.build();
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.ShowTextArgs";
        v byteString = build.toByteString();
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        return f.ah("ui.SHOW_TEXT", "show_text_args", createBuilder2.build());
    }

    public static final bp n(bp bpVar) {
        si builder = bpVar.toBuilder();
        bo boVar = bpVar.e;
        bo boVar2 = boVar;
        if (boVar == null) {
            boVar2 = bo.a;
        }
        si builder2 = boVar2.toBuilder();
        ba createBuilder = cf.a.createBuilder();
        createBuilder.copyOnWrite();
        cf cfVar = createBuilder.instance;
        cfVar.c = 2;
        cfVar.b |= 1;
        createBuilder.copyOnWrite();
        cf cfVar2 = createBuilder.instance;
        cfVar2.d = 2;
        cfVar2.b |= 2;
        bi build = createBuilder.build();
        ba createBuilder2 = ej.a.createBuilder();
        createBuilder2.copyOnWrite();
        ej ejVar = createBuilder2.instance;
        ejVar.b |= 1;
        ejVar.c = "show_drl_visual_treatment_args";
        ba createBuilder3 = ei.a.createBuilder();
        createBuilder3.copyOnWrite();
        ei eiVar = createBuilder3.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.params.DrlVisualTreatmentParams";
        v byteString = build.toByteString();
        createBuilder3.copyOnWrite();
        ei eiVar2 = createBuilder3.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder2.copyOnWrite();
        ej ejVar2 = createBuilder2.instance;
        ei build2 = createBuilder3.build();
        build2.getClass();
        ejVar2.d = build2;
        ejVar2.b = 2 | ejVar2.b;
        builder2.at(createBuilder2.build());
        builder.copyOnWrite();
        bp bpVar2 = builder.instance;
        bo build3 = builder2.build();
        build3.getClass();
        bpVar2.e = build3;
        bpVar2.b |= 4;
        return builder.build();
    }

    public static final Optional o(bo boVar, String str, df dfVar) {
        for (ej ejVar : boVar.b) {
            if ("open_provider_args".equals(ejVar.c)) {
                try {
                    ei eiVar = ejVar.d;
                    ei eiVar2 = eiVar;
                    if (eiVar == null) {
                        eiVar2 = ei.a;
                    }
                    return Optional.of((MessageLite) dfVar.g(eiVar2.d));
                } catch (ce e) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    public static bp p(Intent intent, int i, ah ahVar, boolean z, boolean z2) {
        Intent intent2 = new Intent(intent);
        intent2.putExtra("start_mode", i != 1 ? i != 2 ? i != 3 ? "GRPC_TRUSTED_INTENT" : "ASSISTANT_ACTIVITY" : "VOICE_INTERACTION" : "STANDARD");
        intent2.putExtra("utterance_id", ahVar.d);
        intent2.putExtra("handled_by_nga", true);
        String uri = intent2.toUri(0);
        String str = intent2.getPackage();
        ba createBuilder = com.google.g.e.c.c.cd.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.g.e.c.c.cd cdVar = createBuilder.instance;
        cdVar.b |= 4096;
        cdVar.n = z;
        createBuilder.copyOnWrite();
        com.google.g.e.c.c.cd cdVar2 = createBuilder.instance;
        uri.getClass();
        cdVar2.b |= 64;
        cdVar2.i = uri;
        if (str != null) {
            createBuilder.copyOnWrite();
            com.google.g.e.c.c.cd cdVar3 = createBuilder.instance;
            cdVar3.b |= 1;
            cdVar3.c = str;
        }
        ba createBuilder2 = ml.a.createBuilder();
        ba createBuilder3 = cu.a.createBuilder();
        createBuilder3.copyOnWrite();
        cu cuVar = createBuilder3.instance;
        com.google.g.e.c.c.cd build = createBuilder.build();
        build.getClass();
        cuVar.d = build;
        cuVar.c = 1;
        createBuilder2.copyOnWrite();
        ml mlVar = createBuilder2.instance;
        cu build2 = createBuilder3.build();
        build2.getClass();
        mlVar.c = build2;
        mlVar.b |= 1;
        if (z2) {
            ba createBuilder4 = com.google.g.e.c.c.cw.a.createBuilder();
            ba createBuilder5 = com.google.g.e.c.c.cf.a.createBuilder();
            createBuilder5.copyOnWrite();
            com.google.g.e.c.c.cf cfVar = createBuilder5.instance;
            cfVar.b |= 2;
            cfVar.d = true;
            com.google.g.e.c.c.cf build3 = createBuilder5.build();
            createBuilder4.copyOnWrite();
            com.google.g.e.c.c.cw cwVar = createBuilder4.instance;
            build3.getClass();
            cwVar.c = build3;
            cwVar.b = 1;
            createBuilder2.copyOnWrite();
            ml mlVar2 = createBuilder2.instance;
            com.google.g.e.c.c.cw build4 = createBuilder4.build();
            build4.getClass();
            mlVar2.d = build4;
            mlVar2.b |= 2;
        }
        ml build5 = createBuilder2.build();
        ba createBuilder6 = ei.a.createBuilder();
        createBuilder6.copyOnWrite();
        ei eiVar = createBuilder6.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.OpenProviderArgs";
        v byteString = build5.toByteString();
        createBuilder6.copyOnWrite();
        ei eiVar2 = createBuilder6.instance;
        byteString.getClass();
        eiVar2.b = 2 | eiVar2.b;
        eiVar2.d = byteString;
        return f.ah("provider.OPEN", "open_provider_args", createBuilder6.build());
    }

    public static ba q(String str) {
        ba createBuilder = r.a.createBuilder();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        str.getClass();
        rVar.c |= 8192;
        rVar.n = str;
        createBuilder.copyOnWrite();
        r rVar2 = createBuilder.instance;
        rVar2.j = 4;
        rVar2.c |= 256;
        createBuilder.copyOnWrite();
        r rVar3 = createBuilder.instance;
        rVar3.c |= 1024;
        rVar3.k = true;
        createBuilder.copyOnWrite();
        r rVar4 = createBuilder.instance;
        rVar4.c |= 2048;
        rVar4.l = true;
        return createBuilder;
    }

    public static final Optional r(bp bpVar) {
        bo boVar = bpVar.e;
        bo boVar2 = boVar;
        if (boVar == null) {
            boVar2 = bo.a;
        }
        Optional o = o(boVar2, "open_provider_args", ml.a.getParserForType());
        if (o.isEmpty()) {
            return Optional.empty();
        }
        ml mlVar = (ml) o.get();
        cu cuVar = mlVar.c;
        cu cuVar2 = cuVar;
        if (cuVar == null) {
            cuVar2 = cu.a;
        }
        if (((cuVar2.c == 1 ? (com.google.g.e.c.c.cd) cuVar2.d : com.google.g.e.c.c.cd.a).b & 64) == 0) {
            return Optional.empty();
        }
        com.google.g.e.c.c.cw cwVar = mlVar.d;
        com.google.g.e.c.c.cw cwVar2 = cwVar;
        if (cwVar == null) {
            cwVar2 = com.google.g.e.c.c.cw.a;
        }
        boolean z = (cwVar2.b == 1 ? (com.google.g.e.c.c.cf) cwVar2.c : com.google.g.e.c.c.cf.a).d;
        cu cuVar3 = mlVar.c;
        cu cuVar4 = cuVar3;
        if (cuVar3 == null) {
            cuVar4 = cu.a;
        }
        try {
            return Optional.of(Intent.parseUri((cuVar4.c == 1 ? (com.google.g.e.c.c.cd) cuVar4.d : com.google.g.e.c.c.cd.a).i, true != z ? 0 : 4));
        } catch (URISyntaxException e) {
            return Optional.empty();
        }
    }
}
