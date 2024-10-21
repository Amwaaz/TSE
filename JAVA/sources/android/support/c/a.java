package android.support.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:android/support/c/a.class */
public final class a {

    /* renamed from: a */
    private static final Set f32a = new HashSet();
    private static final boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r0 > 0) goto L55;
     */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            android.support.c.a.f32a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r11 = r0
            r0 = 0
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r11
            if (r0 == 0) goto L7e
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r11
            java.lang.String r3 = "."
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            boolean r0 = r0.hasMoreTokens()
            r7 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L3e
            r0 = r12
            java.lang.String r0 = r0.nextToken()
            r9 = r0
            goto L41
        L3e:
            r0 = 0
            r9 = r0
        L41:
            r0 = r12
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L50
            r0 = r12
            java.lang.String r0 = r0.nextToken()
            r10 = r0
        L50:
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L7e
            r0 = r8
            r7 = r0
            r0 = r10
            if (r0 == 0) goto L7e
            r0 = r9
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lb9
            r6 = r0
            r0 = r10
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lb9
            r5 = r0
            r0 = r6
            r1 = 2
            if (r0 > r1) goto L7c
            r0 = r8
            r7 = r0
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L7e
            r0 = r8
            r7 = r0
            r0 = r5
            if (r0 <= 0) goto L7e
        L7c:
            r0 = 1
            r7 = r0
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "VM with version "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r1 = r7
            if (r0 == r1) goto L9d
            java.lang.String r0 = " does not have multidex support"
            r9 = r0
            goto La1
        L9d:
            java.lang.String r0 = " has multidex support"
            r9 = r0
        La1:
            r0 = r10
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "MultiDex"
            r1 = r10
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.i(r0, r1)
            r0 = r7
            android.support.c.a.b = r0
            return
        Lb9:
            r9 = move-exception
            r0 = r8
            r7 = r0
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.m3clinit():void");
    }

    public static Field a(Object obj, String str) {
        Field declaredField;
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (cls2 == null) {
                throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
            }
            try {
                declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchFieldException e) {
                cls = cls2.getSuperclass();
            }
        }
        return declaredField;
    }

    public static void b(Context context) {
        ApplicationInfo applicationInfo;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        Log.i("MultiDex", "Installing application");
        if (b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (RuntimeException e) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            File file = new File(applicationInfo.sourceDir);
            File file2 = new File(applicationInfo.dataDir);
            Set set = f32a;
            synchronized (set) {
                if (!set.contains(file)) {
                    set.add(file);
                    Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                    try {
                        classLoader2 = context.getClassLoader();
                        classLoader = classLoader2;
                    } catch (RuntimeException e2) {
                        Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e2);
                    }
                    if (!(classLoader2 instanceof BaseDexClassLoader)) {
                        Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                        classLoader = null;
                    }
                    if (classLoader != null) {
                        try {
                            File file3 = new File(context.getFilesDir(), "secondary-dexes");
                            if (file3.isDirectory()) {
                                Log.i("MultiDex", "Clearing old secondary dex dir (" + file3.getPath() + ").");
                                File[] listFiles = file3.listFiles();
                                if (listFiles == null) {
                                    Log.w("MultiDex", "Failed to list secondary dex dir content (" + file3.getPath() + ").");
                                } else {
                                    for (File file4 : listFiles) {
                                        Log.i("MultiDex", "Trying to delete old file " + file4.getPath() + " of size " + file4.length());
                                        if (file4.delete()) {
                                            Log.i("MultiDex", "Deleted old file ".concat(String.valueOf(file4.getPath())));
                                        } else {
                                            Log.w("MultiDex", "Failed to delete old file ".concat(String.valueOf(file4.getPath())));
                                        }
                                    }
                                    if (file3.delete()) {
                                        Log.i("MultiDex", "Deleted old secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                    } else {
                                        Log.w("MultiDex", "Failed to delete secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                        }
                        File file5 = new File(file2, "code_cache");
                        try {
                            d(file5);
                        } catch (IOException e3) {
                            file5 = new File(context.getFilesDir(), "code_cache");
                            d(file5);
                        }
                        File file6 = new File(file5, "secondary-dexes");
                        d(file6);
                        d dVar = new d(file, file6);
                        try {
                            try {
                                c(classLoader, file6, dVar.a(context, false));
                            } catch (IOException e4) {
                                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e4);
                                c(classLoader, file6, dVar.a(context, true));
                            }
                            try {
                                r6 = null;
                            } catch (IOException e5) {
                            }
                            if (r6 != null) {
                                throw r6;
                            }
                        } finally {
                            try {
                                dVar.close();
                            } catch (IOException e6) {
                            }
                        }
                    }
                }
            }
            Log.i("MultiDex", "install done");
        } catch (Exception e7) {
            Log.e("MultiDex", "MultiDex installation failure", e7);
            throw new RuntimeException("MultiDex installation failed (" + e7.getMessage() + ").");
        }
    }

    private static void c(ClassLoader classLoader, File file, List list) {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = a(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (cls2 == null) {
                throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = cls2.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException e) {
                cls = cls2.getSuperclass();
            }
        }
        Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList);
        Field a2 = a(obj, "dexElements");
        Object[] objArr2 = (Object[]) a2.get(obj);
        Class<?> componentType = objArr2.getClass().getComponentType();
        int length = objArr2.length;
        int length2 = objArr.length;
        Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + length2);
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        System.arraycopy(objArr, 0, objArr3, length, length2);
        a2.set(obj, objArr3);
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) arrayList.get(i));
            }
            Field a3 = a(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) a3.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                int size2 = arrayList.size();
                int length3 = iOExceptionArr2.length;
                iOExceptionArr = new IOException[size2 + length3];
                arrayList.toArray(iOExceptionArr);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr, arrayList.size(), length3);
            }
            a3.set(obj, iOExceptionArr);
            IOException iOException = new IOException("I/O exception during makeDexElement");
            iOException.initCause((Throwable) arrayList.get(0));
            throw iOException;
        }
    }

    private static void d(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory ".concat(String.valueOf(file.getPath())));
    }
}
