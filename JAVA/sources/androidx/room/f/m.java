package androidx.room.f;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes-dex2jar.jar:androidx/room/f/m.class */
final class m implements Cursor {

    /* renamed from: a, reason: collision with root package name */
    private final Cursor f124a;
    private final b b;

    public m(Cursor cursor, b bVar) {
        cursor.getClass();
        this.f124a = cursor;
        this.b = bVar;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f124a.close();
        this.b.d();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.f124a.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    @m.a
    public final void deactivate() {
        this.f124a.deactivate();
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.f124a.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.f124a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.f124a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.f124a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.f124a.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.f124a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.f124a.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.f124a.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f124a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.f124a.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.f124a.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.f124a.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.f124a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f124a.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.f124a.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.f124a.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.f124a.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.f124a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.f124a.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.f124a.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f124a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f124a.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f124a.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.f124a.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.f124a.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.f124a.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.f124a.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.f124a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.f124a.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.f124a.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.f124a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f124a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    @m.a
    public final boolean requery() {
        return this.f124a.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.f124a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.f124a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f124a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.f124a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f124a.unregisterDataSetObserver(dataSetObserver);
    }
}
