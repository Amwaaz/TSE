package com.google.android.apps.gsa.c.a;

import a.a;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.common.base.cl;
import com.google.common.f.h;
import com.google.common.f.j;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/c/a/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final j f334a = j.i("com.google.android.apps.gsa.c.a.b");
    private final Object b = new Object();
    private final SharedPreferences c;
    private boolean d;
    private a e;
    private SecureRandom f;

    public b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(8:9|10|11|(1:13)|14|15|16|17)|24|11|(0)|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        r0 = com.google.android.apps.gsa.c.a.b.f334a.e();
        r0.ak(1629);
        r0.s("Cannot create SecureRandom for %s", "SHA1PRNG");
        r8 = null;
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.d
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r6
            android.content.SharedPreferences r0 = r0.c
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            java.lang.String r1 = "winston"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r8 = r0
            r0 = r7
            java.lang.String r1 = "wolf"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r10 = r0
            r0 = r8
            if (r0 == 0) goto L7b
            r0 = r10
            if (r0 != 0) goto L30
            goto L7b
        L30:
            com.google.android.apps.gsa.c.a.a r0 = new com.google.android.apps.gsa.c.a.a     // Catch: java.lang.IllegalArgumentException -> L46
            r1 = r0
            r2 = r8
            r3 = 3
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L46
            r3 = r10
            r4 = 3
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L46
            r1.<init>(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L46
            r8 = r0
            goto L7d
        L46:
            r8 = move-exception
            r0 = r7
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "winston"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "wolf"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            com.google.common.f.j r0 = com.google.android.apps.gsa.c.a.b.f334a
            com.google.common.f.y r0 = r0.f()
            com.google.common.f.h r0 = (com.google.common.f.h) r0
            r7 = r0
            r0 = r7
            r1 = 1628(0x65c, float:2.281E-42)
            r0.ak(r1)
            r0 = r7
            java.lang.String r1 = "Failed to read keys successfully; clearing old ones"
            r0.p(r1)
        L7b:
            r0 = 0
            r8 = r0
        L7d:
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L8b
            r0 = r6
            android.content.SharedPreferences r0 = r0.c
            com.google.android.apps.gsa.c.a.a r0 = e(r0)
            r7 = r0
        L8b:
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L94
            r8 = r0
            goto Lb6
        L94:
            r7 = move-exception
            com.google.common.f.j r0 = com.google.android.apps.gsa.c.a.b.f334a
            com.google.common.f.y r0 = r0.e()
            com.google.common.f.h r0 = (com.google.common.f.h) r0
            r7 = r0
            r0 = r7
            r1 = 1629(0x65d, float:2.283E-42)
            r0.ak(r1)
            r0 = r7
            java.lang.String r1 = "Cannot create SecureRandom for %s"
            java.lang.String r2 = "SHA1PRNG"
            r0.s(r1, r2)
            r0 = 0
            r8 = r0
            r0 = r9
            r7 = r0
        Lb6:
            r0 = r6
            r1 = r7
            r0.e = r1
            r0 = r6
            r1 = r8
            r0.f = r1
            r0 = r6
            r1 = 1
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.c.a.b.c():void");
    }

    private static Mac d(byte[] bArr, int i, SecretKeySpec secretKeySpec) {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        mac.update(Base64.encode(bArr, 36, i, 3));
        return mac;
    }

    private static final a e(SharedPreferences sharedPreferences) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            SecretKey generateKey = keyGenerator.generateKey();
            SecretKey generateKey2 = keyGenerator.generateKey();
            String encodeToString = Base64.encodeToString(generateKey.getEncoded(), 3);
            String encodeToString2 = Base64.encodeToString(generateKey2.getEncoded(), 3);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("winston", encodeToString);
            edit.putString("wolf", encodeToString2);
            edit.apply();
            return new a(generateKey.getEncoded(), generateKey2.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            h e2 = f334a.e();
            e2.ak(1626);
            e2.s("Cannot create KeyGenerator for %s", "AES");
            return null;
        }
    }

    public final byte[] a(byte[] bArr) {
        synchronized (this.b) {
            c();
            a aVar = this.e;
            if (aVar == null) {
                h f = f334a.f();
                f.ak(1633);
                f.p("No key pair");
                return null;
            }
            try {
                int length = bArr.length - 36;
                if (length < 0) {
                    h e = f334a.e();
                    e.ak(1632);
                    e.p("Failed to decrypt: bad data");
                    return null;
                }
                if (Arrays.equals(Arrays.copyOfRange(bArr, 16, 36), d(bArr, length, aVar.b).doFinal())) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr, 0, 16);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, aVar.a, ivParameterSpec);
                    return cipher.doFinal(bArr, 36, length);
                }
                h e2 = f334a.e();
                e2.ak(1631);
                e2.p("Signature mismatch");
                return null;
            } catch (GeneralSecurityException e3) {
                a.dB(f334a.e(), "Failed to decrypt", (char) 1630, e3);
                return null;
            }
        }
    }

    public final byte[] b(byte[] bArr) {
        bArr.getClass();
        synchronized (this.b) {
            c();
            a aVar = this.e;
            if (aVar == null) {
                h f = f334a.f();
                f.ak(1636);
                f.p("No key pair");
                return null;
            }
            SecureRandom secureRandom = this.f;
            if (secureRandom == null) {
                h f2 = f334a.f();
                f2.ak(1635);
                f2.p("No secure random");
                return null;
            }
            try {
                int length = bArr.length;
                boolean z = true;
                int i = ((length >> 4) + 1) * 16;
                byte[] bArr2 = new byte[i + 36];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, 0, 16);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, aVar.a, ivParameterSpec);
                if (i != cipher.doFinal(bArr, 0, length, bArr2, 36)) {
                    z = false;
                }
                cl.u(z);
                Mac d = d(bArr2, i, aVar.b);
                if (d.getMacLength() != 20) {
                    throw new IllegalStateException("hmac size unexpected");
                }
                d.doFinal(bArr2, 16);
                return bArr2;
            } catch (IllegalStateException | GeneralSecurityException e) {
                a.dB(f334a.e(), "Failed to encrypt", (char) 1634, e);
                return null;
            }
        }
    }
}
