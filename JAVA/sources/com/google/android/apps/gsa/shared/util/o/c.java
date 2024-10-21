package com.google.android.apps.gsa.shared.util.o;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.widget.Toast;
import androidx.core.d.a;
import androidx.media.a$;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n;
import com.google.android.libraries.ao.g$;
import com.google.common.f.h;
import com.google.common.f.j;
import java.net.URISyntaxException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/o/c.class */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1570a = j.i("com.google.android.apps.gsa.shared.util.o.c");
    private boolean b;
    private final Context c;
    public Context d;
    private final boolean e;

    public c(Context context) {
        boolean z = false;
        this.b = false;
        this.c = context;
        while (!z && (context instanceof ContextWrapper)) {
            z = context instanceof Activity;
            context = ((ContextWrapper) context).getBaseContext();
        }
        this.e = !z;
    }

    public c(Context context, boolean z) {
        this(context);
        this.b = z;
    }

    private final Bundle g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(this.c.getClassLoader());
        }
        return extras;
    }

    protected static final void n(Intent intent, SecurityException securityException) {
        aus.b(f1570a.e(), "Cannot start activity: %s", intent, (char) 9401, securityException);
    }

    @Override // com.google.android.apps.gsa.shared.util.o.g
    public boolean b(Intent intent, f fVar) {
        return false;
    }

    @Override // com.google.android.apps.gsa.shared.util.o.g
    public boolean c() {
        return false;
    }

    @Override // com.google.android.apps.gsa.shared.util.o.g
    public boolean d() {
        throw null;
    }

    @Override // com.google.android.apps.gsa.shared.util.o.g
    public final /* synthetic */ void e(Intent intent, Bundle bundle) {
        d.a(this, intent, bundle);
    }

    @Override // com.google.android.apps.gsa.shared.util.o.g
    public void f(IntentSender intentSender, f fVar) {
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // com.google.android.apps.gsa.shared.util.o.g
    public boolean ib(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    protected final Bundle j(Intent intent) {
        Integer num;
        Bundle bundle;
        Bundle bundle2;
        Integer num2;
        Bundle bundle3;
        DisplayManager displayManager;
        Bundle g = g(intent);
        Bundle bundle4 = null;
        if (this.b && (displayManager = (DisplayManager) this.c.getSystemService(DisplayManager.class)) != null) {
            for (Display display : displayManager.getDisplays()) {
                j jVar = f1570a;
                h d = jVar.d();
                d.ak(9399);
                d.q("#display [id = %d]", display.getDisplayId());
                if ((display.getFlags() & 8) == 0) {
                    h d2 = jVar.d();
                    d2.ak(9400);
                    d2.q("Found non-presentation display id = %d", display.getDisplayId());
                    num = Integer.valueOf(display.getDisplayId());
                    break;
                }
            }
        }
        num = null;
        Integer num3 = num;
        if (g != null) {
            int i = g.getInt("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 0);
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bundle2 = g.getBundle("com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION");
                    } else if (i != 4) {
                        num2 = num;
                        bundle3 = null;
                    } else {
                        Resources.Theme newTheme = this.c.getResources().newTheme();
                        newTheme.applyStyle(R.style.Animation.Activity, true);
                        TypedValue typedValue = new TypedValue();
                        newTheme.resolveAttribute(R.attr.activityOpenEnterAnimation, typedValue, true);
                        int i2 = typedValue.resourceId;
                        newTheme.resolveAttribute(R.attr.activityOpenExitAnimation, typedValue, true);
                        int i3 = typedValue.resourceId;
                        if (num != null) {
                            bundle2 = a$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeCustomAnimation(this.c, i2, i3), num.intValue()).toBundle();
                        } else {
                            bundle = ActivityOptions.makeCustomAnimation(this.c, i2, i3).toBundle();
                            num2 = null;
                            bundle3 = bundle;
                        }
                    }
                    num2 = num;
                    bundle3 = bundle2;
                } else if (num != null) {
                    bundle2 = a$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeCustomAnimation(this.c, 0, 0), num.intValue()).toBundle();
                    num2 = num;
                    bundle3 = bundle2;
                } else {
                    bundle = ActivityOptions.makeCustomAnimation(this.c, 0, 0).toBundle();
                    num2 = null;
                    bundle3 = bundle;
                }
            } else if (num != null) {
                bundle2 = a$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeCustomAnimation(this.c, 2130772040, 2130772041), num.intValue()).toBundle();
                num2 = num;
                bundle3 = bundle2;
            } else {
                bundle = ActivityOptions.makeCustomAnimation(this.c, 2130772040, 2130772041).toBundle();
                num2 = null;
                bundle3 = bundle;
            }
            int i4 = a.f45a;
            Rect rect = (Rect) g.getParcelable("com.google.android.apps.gsa.shared.util.starter.IntentStarter.LAUNCH_BOUNDS");
            num3 = num2;
            bundle4 = bundle3;
            if (rect != null) {
                if (bundle3 != null) {
                    bundle3.putParcelable("android:activity.launchBounds", new Rect(rect));
                    bundle4 = bundle3;
                    num3 = num2;
                } else if (num2 != null) {
                    bundle4 = a$.ExternalSyntheticApiModelOutline0.m(g$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeBasic(), rect), num2.intValue()).toBundle();
                    num3 = num2;
                } else {
                    bundle4 = g$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeBasic(), rect).toBundle();
                    num3 = num2;
                }
            }
        }
        return (bundle4 != null || num3 == null) ? bundle4 : a$.ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeBasic(), num3.intValue()).toBundle();
    }

    protected final void k(Intent... intentArr) {
        int intExtra = intentArr[0].getIntExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.ERROR_TOAST_ID", 0);
        if (intExtra != 0) {
            Toast.makeText(this.c, intExtra, 0).show();
        }
    }

    protected final boolean l(String str) {
        boolean z = false;
        try {
            Intent O = n.O(str);
            com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
            try {
                this.c.startActivity(O);
                z = true;
            } catch (ActivityNotFoundException e) {
                h f = f1570a.f();
                f.ak(9403);
                f.s("No activity found for %s", O);
            }
            return z;
        } catch (URISyntaxException e2) {
            h f2 = f1570a.f();
            f2.ak(9404);
            f2.s("Invalid fallback Url=%s", str);
            return false;
        }
    }

    protected final boolean m(Intent intent) {
        Bundle g = g(intent);
        if (g == null || !g.getBoolean("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", false)) {
            return false;
        }
        g.remove("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT");
        return true;
    }
}
