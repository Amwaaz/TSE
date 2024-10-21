package androidx.room.c;

import java.util.Locale;
import m.p.s;

/* loaded from: classes-dex2jar.jar:androidx/room/c/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f111a;

    public c(androidx.u.a.b bVar) {
        bVar.getClass();
        this.f111a = bVar;
    }

    public c(androidx.u.a.g gVar) {
        gVar.getClass();
        this.f111a = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.u.a.b, java.lang.Object] */
    public final j a(String str) {
        j iVar;
        str.getClass();
        String obj = s.s(str).toString();
        int length = obj.length();
        ?? r0 = this.f111a;
        if (length >= 3) {
            String substring = obj.substring(0, 3);
            substring.getClass();
            String upperCase = substring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                iVar = new h(r0, str);
                return iVar;
            }
        }
        iVar = new i(r0, str);
        return iVar;
    }
}
