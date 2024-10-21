package androidx.u.b;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes-dex2jar.jar:androidx/u/b/a.class */
public final class a {

    /* renamed from: a */
    public static final Map f155a = new HashMap();
    public final boolean b;
    private final File c;
    private final Lock d;
    private FileChannel e;

    public a(String str, File file, boolean z) {
        Lock lock;
        str.getClass();
        this.b = false;
        this.c = file != null ? new File(file, str.concat(".lck")) : null;
        Map map = f155a;
        synchronized (map) {
            Object obj = map.get(str);
            Object obj2 = obj;
            if (obj == null) {
                obj2 = new ReentrantLock();
                map.put(str, obj2);
            }
            lock = (Lock) obj2;
        }
        this.d = lock;
    }

    public final void a(boolean z) {
        this.d.lock();
        if (z) {
            try {
                File file = this.c;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(this.c).getChannel());
                convertMaybeLegacyFileChannelFromLibrary.lock();
                this.e = convertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e) {
                this.e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException e) {
        }
        this.d.unlock();
    }
}
