package com.google.android.apps.gsa.i;

import com.google.android.apps.gsa.shared.util.b.f;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ce;
import java.lang.ref.SoftReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/i/c.class */
public class c {
    private static final j f = j.i("com.google.android.apps.gsa.i.c");

    /* renamed from: a, reason: collision with root package name */
    public final String f357a;
    public final e b;
    public final Object c = new Object();
    public SoftReference d;
    public boolean e;
    private final MessageLite g;
    private final d h;
    private final boolean i;

    public c(MessageLite messageLite, String str, d dVar, e eVar, boolean z) {
        this.g = messageLite;
        this.f357a = str;
        this.h = dVar;
        this.b = eVar;
        this.i = z;
    }

    public final MessageLite a() {
        MessageLite b;
        synchronized (this.c) {
            b = b();
        }
        return b;
    }

    public final MessageLite b() {
        byte[] a2;
        SoftReference softReference = this.d;
        MessageLite messageLite = softReference != null ? (MessageLite) softReference.get() : null;
        MessageLite messageLite2 = messageLite;
        if (messageLite == null) {
            if (this.e) {
                messageLite2 = this.g;
            } else {
                if (this.i) {
                    d dVar = this.h;
                    String str = this.f357a;
                    a2 = dVar.a(str);
                    if (a2 != null) {
                        a2 = dVar.b.a(a2);
                        if (a2 == null) {
                            h e = d.f358a.e();
                            e.ak(1910);
                            e.s("Failed to read file: %s crypto failed", str);
                            a2 = null;
                        }
                    }
                } else {
                    a2 = this.h.a(this.f357a);
                }
                if (a2 == null) {
                    messageLite2 = this.g;
                } else {
                    try {
                        messageLite2 = this.g.toBuilder().mergeFrom(a2, ExtensionRegistryLite.getGeneratedRegistry()).build();
                        this.d = new SoftReference(messageLite2);
                    } catch (ce e2) {
                        h g = f.e().g(e2);
                        g.ak(1909);
                        g.s("Error reading data from disk. Deleting %s", this.f357a);
                        this.b.a(this.f357a);
                        messageLite2 = this.g;
                    }
                }
            }
        }
        return messageLite2;
    }

    public final void c(b bVar) {
        f.d();
        synchronized (this.c) {
            MessageLite b = b();
            MessageLite messageLite = (MessageLite) bVar.a(b);
            if (messageLite != null && !messageLite.equals(b)) {
                this.d = new SoftReference(messageLite);
                this.e = false;
                if (this.i) {
                    e eVar = this.b;
                    String str = this.f357a;
                    byte[] b2 = eVar.c.b(messageLite.toByteArray());
                    if (b2 == null) {
                        h e = e.f359a.e();
                        e.ak(1917);
                        e.s("Failed to write file: %s crypto failed", str);
                        eVar.b.c(null, 63625976);
                    } else {
                        int length = b2.length;
                        if (length > 524288) {
                            h e2 = e.f359a.e();
                            e2.ak(1916);
                            e2.y("Data is too large (%d bytes) to write to disk: %s", length, str);
                            eVar.b.c(null, 63625360);
                        } else {
                            eVar.b(str, b2);
                        }
                    }
                } else {
                    this.b.b(this.f357a, messageLite.toByteArray());
                }
            }
        }
    }
}
