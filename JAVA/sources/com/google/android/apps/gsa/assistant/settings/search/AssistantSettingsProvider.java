package com.google.android.apps.gsa.assistant.settings.search;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.search.assistant.surfaces.settings.search.d;
import com.google.android.o.a.b;
import com.google.apps.tiktok.i.x;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/search/AssistantSettingsProvider.class */
public class AssistantSettingsProvider extends b {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.apps.gsa.w.a f253a;
    public Set b;
    public Set c;
    public k.a.a d;
    public Context e;
    private boolean f = false;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/search/AssistantSettingsProvider$a.class */
    public interface a {
        void e(AssistantSettingsProvider assistantSettingsProvider);
    }

    private final void d() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            ((a) x.c(getContext().getApplicationContext(), a.class)).e(this);
            this.f = true;
        }
    }

    @Override // com.google.android.o.a.b
    public final Cursor a() {
        d();
        ab abVar = e.a;
        MatrixCursor matrixCursor = new MatrixCursor(com.google.android.o.a.a.c);
        Iterator it = ((Set) this.d.a()).iterator();
        while (it.hasNext()) {
            matrixCursor.addRow(new Object[]{(String) it.next()});
        }
        if (matrixCursor.getCount() > 0) {
            return matrixCursor;
        }
        return null;
    }

    @Override // com.google.android.o.a.b
    public final Cursor b() {
        d();
        ab abVar = e.a;
        this.f253a.f(com.google.android.apps.gsa.s.a.ASSISTANT_SETTINGS_PROVIDER_INDEXED_COUNT, c.UNKNOWN_WORKLOAD).g(1L);
        MatrixCursor matrixCursor = new MatrixCursor(com.google.android.o.a.a.b);
        for (com.google.android.apps.search.assistant.surfaces.settings.search.b bVar : this.b) {
            if (bVar.i) {
                String str = bVar.a;
                Object[] objArr = new Object[16];
                objArr[1] = str;
                objArr[2] = bVar.b;
                objArr[5] = bVar.c.concat(", ").concat(this.e.getString(2132086600));
                objArr[12] = bVar.h;
                objArr[8] = Integer.valueOf(bVar.d);
                objArr[9] = "com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS";
                objArr[6] = this.e.getString(2132086638);
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    @Override // com.google.android.o.a.b
    public final Cursor c() {
        d();
        ab abVar = e.a;
        MatrixCursor matrixCursor = new MatrixCursor(com.google.android.o.a.a.a);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            matrixCursor.addRow(f.H((d) it.next()));
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // com.google.android.o.a.b, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.google.android.apps.gsa.d.e.n(2);
        return super.query(uri, strArr, str, strArr2, str2);
    }
}
