package androidx.u.a.a;

import android.content.Context;
import java.io.File;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/k.class */
final class k extends m.h.b.n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final l f151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(0);
        this.f151a = lVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        j jVar;
        l lVar = this.f151a;
        String str = lVar.b;
        if (str == null || !lVar.d) {
            Context context = lVar.f152a;
            f fVar = new f();
            l lVar2 = this.f151a;
            jVar = new j(context, str, fVar, lVar2.c, lVar2.e);
        } else {
            File noBackupFilesDir = lVar.f152a.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            File file = new File(noBackupFilesDir, this.f151a.b);
            l lVar3 = this.f151a;
            String absolutePath = file.getAbsolutePath();
            f fVar2 = new f();
            l lVar4 = this.f151a;
            jVar = new j(lVar3.f152a, absolutePath, fVar2, lVar4.c, lVar4.e);
        }
        jVar.setWriteAheadLoggingEnabled(this.f151a.f);
        return jVar;
    }
}
