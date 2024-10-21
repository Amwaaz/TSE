package androidx.e.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/e/a/e.class */
public final class e extends a {
    final f d;

    public e(f fVar) {
        this.d = fVar;
    }

    @Override // androidx.e.a.a
    protected final String c() {
        b bVar = (b) this.d.f62a.get();
        if (bVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + bVar.f61a + "]";
    }
}
