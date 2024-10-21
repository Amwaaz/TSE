package com.google.android.apps.gsa.nga.engine.ak.h;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.core.content.a;
import androidx.core.d.e$;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.l.b;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.v.j;
import com.google.android.apps.gsa.nga.engine.v.p;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Optional;
import java.util.function.BiFunction;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/h/t.class */
public final class t extends com.google.android.apps.gsa.nga.engine.t.f implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final d f431a = d.j();
    static final String[] b = {"_id", "display_name", "display_name_alt", "phonetic_name"};
    static final String[] c = {"display_name", "data1", "starred", "custom_ringtone"};
    public static final String[] d = {"display_name", "display_name_alt", "phonetic_name"};
    public final x e;
    public final h f;
    public final f g;
    public final y h;
    private final Context i;
    private final com.google.android.apps.gsa.nga.engine.g.a.f j;
    private final af k;

    public t(com.google.android.apps.gsa.nga.engine.g.a.f fVar, af afVar, x xVar, h hVar, Context context, n nVar, y yVar, f fVar2) {
        super(nVar, yVar);
        this.j = fVar;
        this.k = afVar;
        this.e = xVar;
        this.f = hVar;
        this.i = context;
        this.g = fVar2;
        this.h = yVar;
    }

    public static fl a(Cursor cursor, String str) {
        if (cursor == null) {
            int i = fl.e;
            return ni.a;
        }
        fg fgVar = new fg(4);
        try {
            int columnIndex = cursor.getColumnIndex(str);
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                if (string != null) {
                    fgVar.h(string);
                }
            }
            cursor.close();
            return fgVar.g();
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static Optional o(Cursor cursor, BiFunction biFunction, String str) {
        if (cursor == null) {
            return Optional.empty();
        }
        try {
            if (!cursor.moveToFirst()) {
                cursor.close();
                return Optional.empty();
            }
            int columnIndex = cursor.getColumnIndex(str);
            Optional empty = cursor.isNull(columnIndex) ? Optional.empty() : Optional.ofNullable(e$.ExternalSyntheticApiModelOutline0.m(biFunction, cursor, Integer.valueOf(columnIndex)));
            cursor.close();
            return empty;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static Optional p(Cursor cursor, String... strArr) {
        if (cursor == null) {
            return Optional.empty();
        }
        try {
            if (cursor.moveToFirst()) {
                for (String str : strArr) {
                    Optional s = s(cursor, str);
                    if (s.isPresent()) {
                        return s;
                    }
                }
            }
            cursor.close();
            return Optional.empty();
        } finally {
            cursor.close();
        }
    }

    public static Optional q(Cursor cursor, String str) {
        return p(cursor, str);
    }

    private static Optional s(Cursor cursor, String str) {
        try {
            String string = cursor.getString(cursor.getColumnIndex(str));
            if (!TextUtils.isEmpty(string)) {
                return Optional.of(string);
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return Optional.empty();
    }

    public final cn c(long j) {
        return this.f.k(j(j), "[NGA] ContactsHelper.canSendEmailToContactId", new aj(1));
    }

    public final cn e(long j) {
        try {
            r();
            return this.f.a("[NGA] ContactsHelper.getContactPhotoThumbnailUri", new g(this, j, 4));
        } catch (b e) {
            aus.f(f431a.f(), "Failed to get contactThumbnail", (char) 4099, e);
            return dl.n(Optional.empty());
        }
    }

    public final cn f(long j) {
        return this.f.a("[NGA] ContactsHelper.getDisplayName", new g(this, j, 5));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.S.f1451a))) {
            this.g.c();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        f fVar = this.g;
        return fVar.q.a("[NGA] initialize ContactsCache", new b(fVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        f fVar = this.g;
        return fVar.q.a("[NGA] uninitialize ContactsCache", new b(fVar, 0));
    }

    public final cn j(long j) {
        cn n;
        try {
            r();
            n = this.f.a("[NGA] ContactsHelper.getEmailAddress", new g(this, j, 1));
        } catch (b e) {
            aus.f(f431a.f(), "Failed to get email address", (char) 4100, e);
            int i = fl.e;
            n = dl.n(ni.a);
        }
        return com.google.common.util.concurrent.i.g(n, new o(), ay.a);
    }

    public final cn k(long j, Optional optional) {
        return this.f.a("[NGA] ContactsHelper.getPhoneInfos", new k(this, j, optional, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "ContactsHelper";
    }

    public final cn m(long j) {
        return this.f.a("[NGA] ContactsHelper.getWhatsappNumber", new g(this, j, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 45;
    }

    public final void r() {
        if (this.j.c) {
            if (a.c(this.i, "android.permission.READ_CONTACTS") != 0) {
                throw new com.google.android.apps.gsa.nga.engine.l.a();
            }
        } else {
            af afVar = this.k;
            bk bkVar = bk.ACCESS_DENIED;
            com.google.android.apps.gsa.nga.engine.v.b bVar = p.a;
            afVar.c(bkVar, new j(3), ah.a);
            throw new b();
        }
    }
}
