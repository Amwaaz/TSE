package androidx.u.a.a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.u.a.c;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/j.class */
final class j extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Context f150a;
    private final f b;
    private final c c;
    private final boolean d;
    private boolean e;
    private final androidx.u.b.a f;
    private boolean g;

    public j(Context context, String str, final f fVar, c cVar, boolean z) {
        super(context, str, null, cVar.b, new DatabaseErrorHandler(fVar) { // from class: androidx.u.a.a.g

            /* renamed from: a, reason: collision with root package name */
            public final f f148a;

            {
                this.f148a = fVar;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                e a2 = i.a(this.f148a, sQLiteDatabase);
                Log.e("SupportSQLite", a.a.dI(a2, "Corruption reported by sqlite on database: ", ".path"));
                if (!a2.c.isOpen()) {
                    String path = a2.c.getPath();
                    if (path != null) {
                        c.f(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                List<Pair<String, String>> list2 = null;
                try {
                    try {
                        list = a2.c.getAttachedDbs();
                    } catch (Throwable th) {
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                c.f((String) obj);
                            }
                        } else {
                            String path2 = a2.c.getPath();
                            if (path2 != null) {
                                c.f(path2);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                }
                list2 = list;
                try {
                    a2.c.close();
                } catch (IOException e2) {
                }
                if (list == null) {
                    String path3 = a2.c.getPath();
                    if (path3 != null) {
                        c.f(path3);
                        return;
                    }
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object obj2 = ((Pair) it2.next()).second;
                    obj2.getClass();
                    c.f((String) obj2);
                }
            }
        });
        this.f150a = context;
        this.b = fVar;
        this.c = cVar;
        this.d = z;
        String str2 = str;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        }
        this.f = new androidx.u.b.a(str2, context.getCacheDir(), false);
    }

    public final e a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return i.a(this.b, sQLiteDatabase);
    }

    public final androidx.u.a.b b() {
        SQLiteDatabase writableDatabase;
        androidx.u.a.b a2;
        File parentFile;
        try {
            this.f.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            String databaseName = getDatabaseName();
            boolean z = this.g;
            if (databaseName != null && !z && (parentFile = this.f150a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                writableDatabase = super.getWritableDatabase();
                writableDatabase.getClass();
            } catch (Throwable th) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                }
                try {
                    writableDatabase = super.getWritableDatabase();
                    writableDatabase.getClass();
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    if (th2 instanceof h) {
                        h hVar = th2;
                        th3 = hVar.f149a;
                        int i = hVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th3;
                        }
                        if (!(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    }
                    if (!(th3 instanceof SQLiteException) || databaseName == null || !this.d) {
                        throw th3;
                    }
                    this.f150a.deleteDatabase(databaseName);
                    try {
                        writableDatabase = super.getWritableDatabase();
                        writableDatabase.getClass();
                    } catch (h e2) {
                        throw e2.f149a;
                    }
                }
            }
            if (this.e) {
                close();
                a2 = b();
            } else {
                a2 = a(writableDatabase);
            }
            this.f.b();
            return a2;
        } catch (Throwable th4) {
            this.f.b();
            throw th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            androidx.u.b.a aVar = this.f;
            Map map = androidx.u.b.a.f155a;
            boolean z = aVar.b;
            aVar.a(false);
            super.close();
            this.b.f147a = null;
            this.g = false;
        } finally {
            this.f.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e && this.c.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            c cVar = this.c;
            a(sQLiteDatabase);
            cVar.e();
        } catch (Throwable th) {
            throw new h(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.a(a(sQLiteDatabase));
        } catch (Throwable th) {
            throw new h(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new h(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.c(a(sQLiteDatabase));
            } catch (Throwable th) {
                throw new h(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.d(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new h(3, th);
        }
    }
}
