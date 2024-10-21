package com.google.android.apps.gsa.staticplugins.nga.u;

import android.content.SharedPreferences;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.ab.f f1721a;
    private ha b = null;
    private Boolean c = null;
    private Locale d = null;
    private ha e = null;
    private final SharedPreferences f;
    private final f g;

    public j(SharedPreferences sharedPreferences, com.google.android.apps.gsa.nga.shared.ab.f fVar, f fVar2) {
        this.f = sharedPreferences;
        this.f1721a = fVar;
        this.g = fVar2;
    }

    private static void i(Set set) {
        Arrays.toString(Collection._EL.stream(set).map(new c(2)).toArray());
    }

    public final ha a(Locale locale) {
        com.google.android.apps.gsa.nga.shared.ab.j jVar;
        ha haVar;
        synchronized (this) {
            if (this.b == null || g()) {
                gy gyVar = new gy();
                if (locale.equals(Locale.US)) {
                    for (String str : this.f.getStringSet("nga_available_system_image_groups", nr.a)) {
                        switch (Integer.parseInt(str)) {
                            case 0:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.GROUP_ID_UNSPECIFIED;
                                break;
                            case 1:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.TELEPORT;
                                break;
                            case 2:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.QUERY_DEEP_LINKS;
                                break;
                            case 3:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.GENIE_FM;
                                break;
                            case 4:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.SODA;
                                break;
                            case 5:
                            case 9:
                            case 10:
                            case 13:
                            case 14:
                            case 16:
                            case 19:
                            case 21:
                            case 24:
                            case 26:
                            case 32:
                            default:
                                jVar = null;
                                break;
                            case 6:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.APP_ACTIONS;
                                break;
                            case 7:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.WEBREF;
                                break;
                            case 8:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.TCLIB;
                                break;
                            case 11:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.INTENTS;
                                break;
                            case 12:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.CANTEEN;
                                break;
                            case 15:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.SKIP_COMPONENT_LIST;
                                break;
                            case 17:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.DICTATION_FORMATTING;
                                break;
                            case 18:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.CORTEX;
                                break;
                            case 20:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.SAFT_SEGMENTER;
                                break;
                            case 22:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.SOT_CONFIGS;
                                break;
                            case 23:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.TCLIB_PERSON_NAME;
                                break;
                            case 25:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.POP;
                                break;
                            case 27:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.CORRECTIONS_ALTERNATIVES;
                                break;
                            case 28:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.WARMACTIONS;
                                break;
                            case 29:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.CONTACT_NAMES;
                                break;
                            case 30:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.TACTILE;
                                break;
                            case 31:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.LIGHTWEIGHT_TOKENS;
                                break;
                            case 33:
                                jVar = com.google.android.apps.gsa.nga.shared.ab.j.BLOCK_WORDS;
                                break;
                        }
                        if (jVar == null) {
                            this.g.a(2, String.format(Locale.US, "Unknown GroupId %s, this can happen on a version downgrade", str));
                        } else {
                            gyVar.h(jVar);
                        }
                    }
                }
                com.google.android.apps.gsa.nga.shared.ab.f fVar = this.f1721a;
                SharedPreferences sharedPreferences = this.f;
                boolean e = fVar.e();
                Collection._EL.stream(sharedPreferences.getStringSet("nga_available_mdd_file_groups", nr.a)).map(new i(this, e)).filter(new a(2)).forEach(new p(gyVar, 1));
                this.c = Boolean.valueOf(e);
                this.b = gyVar.g();
            }
            haVar = this.b;
            haVar.getClass();
            i(haVar);
        }
        return haVar;
    }

    public final ha b() {
        ha haVar;
        synchronized (this) {
            if (this.e == null) {
                ha o = ha.o(this.f.getStringSet("nga_available_language_pack", nr.a));
                o.getClass();
                this.e = o;
            }
            haVar = this.e;
        }
        return haVar;
    }

    public final void c() {
        synchronized (this) {
            this.f.edit().remove("nga_available_system_image_groups").remove("nga_available_mdd_file_groups").remove("nga_available_mdd_file_groups_locale").remove("nga_available_language_pack").apply();
            this.b = null;
            this.d = null;
            this.e = null;
        }
    }

    public final void d(Set set) {
        synchronized (this) {
            this.f.edit().putStringSet("nga_available_mdd_file_groups", set).apply();
            this.b = null;
        }
    }

    public final void e(Set set) {
        synchronized (this) {
            SharedPreferences.Editor edit = this.f.edit();
            edit.putStringSet("nga_available_system_image_groups", (Set) Collection._EL.stream(set).map(new c(3)).collect(Collectors.toSet()));
            edit.apply();
            i(set);
            this.b = null;
        }
    }

    public final void f(ha haVar) {
        synchronized (this) {
            if (b().equals(haVar)) {
                return;
            }
            this.f.edit().putStringSet("nga_available_language_pack", haVar).apply();
            this.e = ha.o(haVar);
        }
    }

    final boolean g() {
        synchronized (this) {
            boolean e = this.f1721a.e();
            Boolean bool = this.c;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue() != e;
        }
    }

    public final boolean h() {
        boolean contains;
        synchronized (this) {
            contains = this.f.getStringSet("nga_available_system_image_groups", nr.a).contains(Integer.toString(com.google.android.apps.gsa.nga.shared.ab.j.SODA.getNumber()));
        }
        return contains;
    }
}
