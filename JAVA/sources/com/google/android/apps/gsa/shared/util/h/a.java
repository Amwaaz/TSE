package com.google.android.apps.gsa.shared.util.h;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/h/a.class */
public final class a {
    @m.a
    public static final int a(String str) {
        return (int) c(str, "SHA1", 4);
    }

    @m.a
    public static final long b(String str) {
        return c(str, "MD5", 8);
    }

    private static final long c(String str, String str2, int i) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            String str3 = str;
            if (str == null) {
                str3 = "";
            }
            Charset forName = Charset.forName("UTF-16LE");
            forName.getClass();
            byte[] bytes = str3.getBytes(forName);
            bytes.getClass();
            int min = Math.min(messageDigest.digest(bytes).length, i);
            long j = 0;
            for (int i2 = 0; i2 < min; i2++) {
                j |= (r0[i2] & 255) << (i2 * 8);
            }
            return j;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Can't use ".concat(str2), e);
        }
    }
}
