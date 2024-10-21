package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/am.class */
public abstract class am {
    final at c;
    boolean d;
    int e = -1;
    final an f;

    public am(an anVar, at atVar) {
        this.f = anVar;
        this.c = atVar;
    }

    public void b() {
    }

    public boolean c(ae aeVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        an anVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = anVar.d;
        anVar.d = i + i2;
        if (!anVar.e) {
            anVar.e = true;
            while (true) {
                try {
                    int i3 = anVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        anVar.w();
                    } else if (z3) {
                        anVar.c();
                    }
                    i2 = i3;
                } finally {
                    anVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.f(this);
        }
    }

    public abstract boolean eX();
}
