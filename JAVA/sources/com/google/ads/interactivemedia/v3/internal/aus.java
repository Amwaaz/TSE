package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import androidx.room.g.u;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.libraries.search.ac.b.s;
import com.google.common.f.a.a;
import com.google.common.f.h;
import com.google.common.f.y;
import com.google.z.a.i.bl;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/ads/interactivemedia/v3/internal/aus.class */
public class aus {
    static /* synthetic */ String a(String str, String str2, String str3, byte b, String str4, String str5) {
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + b + String.valueOf(str2).length() + String.valueOf(str).length());
        sb.append(str3);
        sb.append(str4);
        sb.append(str2);
        sb.append(str5);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void b(y yVar, String str, Object obj, char c, Throwable th) {
        h g = ((h) yVar).g(th);
        g.ak(c);
        g.s(str, obj);
    }

    public static /* synthetic */ void c(y yVar, Object obj, String str, char c) {
        h g = ((h) yVar).g((Exception) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ void d(y yVar, char c, Throwable th) {
        h g = ((h) yVar).g(th);
        g.ak(c);
        g.n();
    }

    public static /* synthetic */ String e(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public static /* synthetic */ void f(y yVar, String str, char c, Throwable th) {
        a g = ((a) yVar).g(th);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ void g(y yVar, Object obj, String str, char c) {
        a g = ((a) yVar).g((Exception) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ void h(y yVar, Object obj, String str, char c) {
        h g = ((h) yVar).g((Throwable) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ void i(y yVar, String str, Object obj, char c, Throwable th) {
        a g = ((a) yVar).g(th);
        g.ak(c);
        g.s(str, obj);
    }

    public static /* synthetic */ String j(String str, String str2, String str3, String str4) {
        return str2 + str3 + str + str4;
    }

    public static /* synthetic */ void k(y yVar, Object obj, String str, char c) {
        a g = ((a) yVar).g((Throwable) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ String l(Object obj, Object obj2, String str, String str2, String str3) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj) + str3;
    }

    public static /* synthetic */ String m(BundlerType bundlerType, String str) {
        return "Type " + bundlerType.a + str;
    }

    public static /* synthetic */ void n(y yVar, Object obj, String str, char c) {
        h g = ((h) yVar).g((RuntimeException) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ void o(y yVar, Object obj, String str, char c) {
        h g = ((h) yVar).g((TimeoutException) obj);
        g.ak(c);
        g.p(str);
    }

    public static /* synthetic */ String q(View view) {
        return "TikTok View " + view.getClass().toString() + ", cannot be attached to a non-TikTok Fragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String r(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        u.i(sb, obj.size());
        sb.append(")");
        return sb.toString();
    }

    public static /* synthetic */ String s(s sVar) {
        return "Expected exactly 1 suggestion but received " + sVar.d.size() + ".";
    }

    public static /* synthetic */ String t(Class cls, String str, String str2) {
        return str + cls.getName() + str2;
    }

    public static /* synthetic */ String u(int i, int i2, int i3, int i4, int i5, StringBuilder sb, int i6, String str, String str2) {
        sb.append("|%-");
        sb.append(i6);
        sb.append(str);
        sb.append(i5);
        sb.append(str2);
        sb.append(i4);
        sb.append("s|%-");
        sb.append(i3);
        sb.append("s|%-");
        sb.append(i2);
        sb.append("s|%-");
        sb.append(i);
        sb.append("s|");
        return sb.toString();
    }

    public static /* synthetic */ String v(bl blVar, String str) {
        return str + blVar.getNumber();
    }
}
