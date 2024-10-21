package androidx.room.c;

/* loaded from: classes-dex2jar.jar:androidx/room/c/j.class */
public abstract class j implements androidx.u.b {
    public final androidx.u.a.b f;
    public final String g;
    public boolean h;

    public j(androidx.u.a.b bVar, String str) {
        this.f = bVar;
        this.g = str;
    }

    @Override // androidx.u.b
    public final /* synthetic */ boolean p() {
        boolean z = false;
        if (c(0) != 0) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        if (this.h) {
            androidx.u.a.a(21, "statement is closed");
            throw new m.d();
        }
    }
}
