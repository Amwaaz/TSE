package com.google.android.apps.gsa.nga.shared.e;

import java.util.ArrayDeque;
import java.util.Collection;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/e/a.class */
public final class a extends ArrayDeque {

    /* renamed from: a */
    private final int f856a;

    public a(int i) {
        this.f856a = i;
    }

    private final void a() {
        while (size() > this.f856a) {
            removeFirst();
        }
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        boolean add = super.add(obj);
        a();
        return add;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean addAll(Collection collection) {
        boolean addAll = super.addAll(collection);
        a();
        return addAll;
    }

    @Override // java.util.ArrayDeque, java.util.Deque
    public final void addFirst(Object obj) {
        if (size() < this.f856a) {
            super.addFirst(obj);
        }
    }

    @Override // java.util.ArrayDeque, java.util.Deque
    public final void addLast(Object obj) {
        super.addLast(obj);
        a();
    }
}
