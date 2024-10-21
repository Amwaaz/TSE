package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/ProcessLifecycleOwnerInitializer.class */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            Class.forName("androidx.v.b");
            Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
        } catch (ClassNotFoundException e) {
        }
        try {
            Class<?> cls = Class.forName("androidx.lifecycle.ProcessLifecycleInitializer");
            cls.getMethod("create", Context.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), getContext());
            return true;
        } catch (Exception e2) {
            Log.d("ProcessLifecycleG3", "androidx.startup is not available, initializing using ProcessLifecycleOwnerInitializer instead.");
            Context context = getContext();
            if (!ab.f63a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new aa());
            }
            Context context2 = getContext();
            az azVar = az.f72a;
            azVar.e = new Handler();
            azVar.f.e(u.ON_CREATE);
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new ax(azVar));
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
