package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.d.e;
import com.google.apps.tiktok.i.x;
import com.google.common.f.ab;
import com.google.common.f.am;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.util.concurrent.cr;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bisto/util/StreamedMessageContentProvider.class */
public class StreamedMessageContentProvider extends com.google.android.apps.gsa.shared.search.a {
    public static boolean b;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public cr e;
    public cr f;
    private boolean g;

    /* renamed from: a, reason: collision with root package name */
    public static final j f1632a = j.i("com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider");
    public static String c = null;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bisto/util/StreamedMessageContentProvider$a.class */
    public interface a {
        void ZZ(StreamedMessageContentProvider streamedMessageContentProvider);
    }

    final void a() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            ((a) x.c(getContext(), a.class)).ZZ(this);
            this.g = true;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        e.k(7);
        a();
        ab abVar = com.google.common.f.a.e.a;
        ag agVar = (ag) this.d.get(uri);
        if (agVar != null) {
            agVar.a.set(true);
            return 1;
        }
        h f = f1632a.f();
        f.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
        h hVar = f;
        hVar.ak(13185);
        hVar.s("delete: Unrecognized URI: %s", uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "audio/l16";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        boolean z;
        e.l(7);
        j jVar = f1632a;
        h d = jVar.d();
        d.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
        h hVar = d;
        hVar.ak(13193);
        hVar.s("inserting uri = %s:", uri);
        if (contentValues != null && contentValues.containsKey("locally_record_audio_content_key")) {
            Boolean asBoolean = contentValues.getAsBoolean("locally_record_audio_content_key");
            asBoolean.getClass();
            boolean booleanValue = asBoolean.booleanValue();
            b = booleanValue;
            if (booleanValue) {
                h d2 = jVar.d();
                d2.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
                h hVar2 = d2;
                hVar2.ak(13197);
                hVar2.p("LocallyRecordAudio is set, recording audio to file.");
            }
        }
        if (contentValues != null && contentValues.containsKey("external_dir_content_key")) {
            c = contentValues.getAsString("external_dir_content_key");
        }
        if (contentValues == null || !contentValues.containsKey("has_pre_encoded_audio")) {
            z = false;
        } else {
            Boolean asBoolean2 = contentValues.getAsBoolean("has_pre_encoded_audio");
            asBoolean2.getClass();
            boolean booleanValue2 = asBoolean2.booleanValue();
            z = booleanValue2;
            if (booleanValue2) {
                h d3 = jVar.d();
                d3.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
                h hVar3 = d3;
                hVar3.ak(13196);
                hVar3.p("HasPreEncodedAudio is set.");
                z = booleanValue2;
            }
        }
        a();
        try {
            ag agVar = new ag(ByteBuffer.allocate((int) (com.google.android.apps.search.assistant.surfaces.bisto.a.b.a.a.toSeconds() * 32000)), uri, z);
            this.d.put(uri, agVar);
            this.e.d(new af(this, uri, agVar, 0), 30L, TimeUnit.SECONDS);
            return uri;
        } catch (IOException e) {
            y e2 = f1632a.e();
            e2.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
            a.a.dB(e2, "Error creating pipe", (char) 13195, e);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        e.m(7);
        a();
        ab abVar = com.google.common.f.a.e.a;
        ag agVar = (ag) this.d.get(uri);
        if (agVar == null) {
            h f = f1632a.f();
            f.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
            h hVar = f;
            hVar.ak(13200);
            hVar.s("Unrecognized URI: %s", uri);
            return null;
        }
        if (!agVar.h.getAndSet(true)) {
            this.f.a(new ah(this, agVar, uri));
            return agVar.b;
        }
        h f2 = f1632a.f();
        f2.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
        h hVar2 = f2;
        hVar2.ak(13199);
        hVar2.p("Uri data is outputting.");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        e.n(7);
        h e = f1632a.e();
        e.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
        h hVar = e;
        hVar.ak(13192);
        hVar.p("Can't query");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        e.o(7);
        a();
        ab abVar = com.google.common.f.a.e.a;
        byte[] asByteArray = contentValues.getAsByteArray("audio_data_key");
        boolean z = true;
        if (uri == null || asByteArray == null) {
            h e = f1632a.e();
            e.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
            h hVar = e;
            hVar.al(am.d);
            hVar.ak(13187);
            boolean z2 = uri == null;
            if (asByteArray != null) {
                z = false;
            }
            hVar.M("Cannot add data to uri. uri is null %b, audio is null %b", z2, z);
            return 0;
        }
        ag agVar = (ag) this.d.get(uri);
        if (agVar == null) {
            h e2 = f1632a.e();
            e2.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
            h hVar2 = e2;
            hVar2.ak(13191);
            hVar2.s("Couldn't find StreamData to write to for Uri: %s", uri);
            return -1;
        }
        int length = asByteArray.length;
        try {
            agVar.e.capacity();
            agVar.e.position();
            agVar.e.put(asByteArray, 0, length);
            agVar.g.getAndAdd(length);
            return 1;
        } catch (IndexOutOfBoundsException | BufferOverflowException e3) {
            h f = f1632a.f();
            f.aj(com.google.common.f.a.e.a, "StreamedMessageCP");
            h g = f.g(e3);
            g.ak(13190);
            g.O("Can't add data: buffer is already full for Uri: %s, exception = %s, buffer capacity = %d, buffer position = %d", uri, e3, Integer.valueOf(agVar.e.capacity()), Integer.valueOf(agVar.e.position()));
            return -1;
        }
    }
}
