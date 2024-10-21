package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.util.Pair;
import androidx.media.a$;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.h.b;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.search.assistant.surfaces.bisto.d.k;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.b.qj;
import com.google.common.base.at;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.g.ar.an;
import com.google.g.ar.ap;
import com.google.g.ar.as;
import com.google.g.ar.lk;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/shared/i.class */
public class i {
    private static final j c = j.i("com.google.android.apps.gsa.assistant.settings.shared.i");

    /* renamed from: a, reason: collision with root package name */
    public final a f255a;
    public final at b;
    private final Context d;
    private final a e;
    private final a f;
    private final a g;
    private final x h;
    private final a i;

    public i(Context context, a aVar, a aVar2, a aVar3, a aVar4, at atVar, x xVar, a aVar5) {
        this.d = context;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.f255a = aVar4;
        this.b = atVar;
        this.h = xVar;
        this.i = aVar5;
    }

    public static final as j(an anVar, String str, com.google.g.ar.at atVar) {
        if (str == null || atVar == null) {
            return null;
        }
        for (ap apVar : atVar.b) {
            an a2 = an.a(apVar.i);
            an anVar2 = a2;
            if (a2 == null) {
                anVar2 = an.a;
            }
            if (anVar2 == anVar && str.equals(apVar.c)) {
                if ((apVar.b & 256) == 0) {
                    return null;
                }
                as asVar = apVar.j;
                as asVar2 = asVar;
                if (asVar == null) {
                    asVar2 = as.b;
                }
                return asVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.apps.gsa.shared.k.c] */
    public final int a(an anVar, String str) {
        switch (anVar.ordinal()) {
            case 1:
                return 2131236048;
            case 2:
            case 3:
            case 6:
            case 11:
            case 13:
            case 14:
            case 17:
            default:
                h f = c.f();
                f.ak(1369);
                f.q("Unknown device type: %d", anVar.v);
                return 2131235044;
            case 4:
                return com.google.android.apps.gsa.shared.ui.b.a.c(this.d, ((u) this.f255a.a()).a) ? 2131236078 : 2131235902;
            case 5:
                return 2131236128;
            case 7:
            case 9:
            case 16:
            case 18:
                return 2131236105;
            case 8:
                if (str == null) {
                    return 2131235742;
                }
                k a2 = ((com.google.android.apps.gsa.shared.f.a) this.b.a.a()).a(str);
                if (a2 == k.c) {
                    return 2131233630;
                }
                return a2 == k.d ? 2131236128 : 2131235742;
            case 10:
            case 12:
                return 2131235548;
            case 15:
            case 19:
                return 2131235639;
            case 20:
                return 2131236078;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [e.a, java.lang.Object] */
    public final fl b() {
        fg fgVar = new fg(4);
        if (((z) this.f.a()).q()) {
            fgVar.h(an.e);
        } else {
            this.h.a();
        }
        if (((com.google.android.apps.gsa.shared.f.a) this.b.a.a()).c()) {
            fgVar.h(an.i);
        } else {
            this.h.a();
        }
        return fgVar.g();
    }

    public final ha c(String str) {
        nr o;
        fl k = ((c) this.e.a()).k(az.ht);
        gy gyVar = new gy();
        int size = k.size();
        for (int i = 0; i < size; i++) {
            an a2 = an.a(((Integer) k.get(i)).intValue());
            int ordinal = a2.ordinal();
            if (ordinal != 1) {
                if (ordinal != 16 && ordinal != 18) {
                    if (ordinal == 4) {
                        o = ha.o(((c) this.e.a()).m(az.hx));
                    } else if (ordinal == 5) {
                        o = ha.o(((c) this.e.a()).m(az.hB));
                    } else if (ordinal == 7) {
                        o = ha.w("calendar", "music", "daily_brief", "home_automation", "cast_devices", "shopping_list", new String[0]);
                    } else if (ordinal == 8) {
                        o = ha.v("daily_brief", "news", "shopping_list", "home_automation", "calendar");
                    } else if (ordinal != 9) {
                        o = nr.a;
                    }
                }
                o = ha.o(((c) this.e.a()).m(az.hw));
            } else {
                o = ha.o(((c) this.e.a()).m(az.hv));
            }
            if (o.contains(str)) {
                gyVar.h(a2);
            }
        }
        return gyVar.g();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [e.a, java.lang.Object] */
    public final ha d(an anVar, com.google.g.ar.at atVar, lk lkVar) {
        int ordinal = anVar.ordinal();
        if (ordinal == 4) {
            return new op(Pair.create(((b) this.g.a()).b(), g(an.e)));
        }
        if (ordinal == 8) {
            return ((com.google.android.apps.gsa.shared.f.a) this.b.a.a()).b(lkVar);
        }
        if (ordinal == 15) {
            return new op(Pair.create(((b) this.g.a()).b(), g(an.p)));
        }
        gy gyVar = new gy();
        if (atVar != null) {
            for (ap apVar : atVar.b) {
                if (apVar != null) {
                    an a2 = an.a(apVar.i);
                    an anVar2 = a2;
                    if (a2 == null) {
                        anVar2 = an.a;
                    }
                    if (anVar2 == anVar) {
                        int i = apVar.b;
                        if ((i & 1) != 0 && (i & 256) != 0) {
                            String str = apVar.c;
                            as asVar = apVar.j;
                            as asVar2 = asVar;
                            if (asVar == null) {
                                asVar2 = as.b;
                            }
                            gyVar.h(Pair.create(str, asVar2.e));
                        }
                    }
                }
            }
        }
        return gyVar.g();
    }

    public final String e(String str, an anVar) {
        int ordinal = anVar.ordinal();
        return a.a.dx(ordinal != 8 ? ordinal != 15 ? this.d.getString(2132086604) : this.d.getString(2132086410) : this.d.getString(2132086258), str, ", ");
    }

    public final String f(String str) {
        ha c2 = c(str);
        gy gyVar = new gy();
        qj j = c2.j();
        while (j.hasNext()) {
            int ordinal = ((an) j.next()).ordinal();
            if (ordinal == 1) {
                gyVar.h(this.d.getString(2132086191));
            } else if (ordinal == 7) {
                gyVar.h(this.d.getString(2132086188));
            } else if (ordinal == 9 || ordinal == 16 || ordinal == 18) {
                gyVar.h(this.d.getString(2132086192));
            } else if (ordinal == 4) {
                gyVar.h(this.d.getString(2132086193));
            } else if (ordinal == 5) {
                gyVar.h(this.d.getString(2132086194));
            }
        }
        ha g = gyVar.g();
        return g.isEmpty() ? "" : this.d.getString(2132086495, a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m(), g));
    }

    public final String g(an anVar) {
        int ordinal = anVar.ordinal();
        if (ordinal == 1) {
            return this.d.getString(2132086396);
        }
        if (ordinal == 12) {
            return "Android device";
        }
        if (ordinal != 18) {
            if (ordinal == 4) {
                return ((u) this.f255a.a()).a(this.d);
            }
            if (ordinal == 5) {
                return this.d.getString(2132086402);
            }
            if (ordinal == 15) {
                return "Kitt Device";
            }
            if (ordinal != 16) {
                switch (ordinal) {
                    case 7:
                        return this.d.getString(2132086392);
                    case 8:
                        return this.d.getString(2132086394);
                    case 9:
                        break;
                    case 10:
                        return "Android device";
                    default:
                        h f = c.f();
                        f.ak(1370);
                        f.q("Unknown device type: %d", anVar.v);
                        return "";
                }
            }
        }
        return this.d.getString(2132086397);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e.a, java.lang.Object] */
    public final boolean h(String str) {
        return ((com.google.android.apps.gsa.shared.f.a) this.b.a.a()).a(str).equals(k.d);
    }

    public final boolean i(ap apVar) {
        fl k = ((c) this.e.a()).k(az.jJ);
        an a2 = an.a(apVar.i);
        an anVar = a2;
        if (a2 == null) {
            anVar = an.a;
        }
        return k.contains(Integer.valueOf(anVar.v));
    }
}
