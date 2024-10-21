package com.android.settingslib.a;

import android.R;
import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ak;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.activity.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.f;
import androidx.core.h.at;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.internal.e;

/* loaded from: classes-dex2jar.jar:com/android/settingslib/a/b.class */
public class b extends ak {
    private d k;

    private final d s() {
        if (this.k == null) {
            this.k = new d(new a(this));
        }
        return this.k;
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        gq().d();
        if (ix().b() == 0) {
            finishAfterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.ak, androidx.activity.m, android.support.v4.app.cu, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 35) {
            o.a(this);
            at.m(findViewById(R.id.content), new e(this));
        }
        super.onCreate(bundle);
        d s = s();
        CoordinatorLayout inflate = getLayoutInflater().inflate(2131625400, (ViewGroup) null, false);
        if (inflate instanceof CoordinatorLayout) {
        }
        s.a = inflate.findViewById(2131432533);
        s.b = inflate.findViewById(2131427803);
        CollapsingToolbarLayout collapsingToolbarLayout = s.a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.a.t = 1.1f;
            if (Build.VERSION.SDK_INT >= 33) {
                e eVar = s.a.a;
                eVar.u = 3;
                c cVar = new c();
                if (eVar.v != cVar) {
                    eVar.v = cVar;
                    eVar.f(true);
                }
            }
        }
        AppBarLayout appBarLayout = s.b;
        if (appBarLayout != null) {
            f layoutParams = appBarLayout.getLayoutParams();
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            ((AppBarLayout.BaseBehavior) behavior).b = new com.google.android.material.appbar.f();
            layoutParams.a(behavior);
        }
        s.d = (FrameLayout) inflate.findViewById(2131432701);
        Log.d("CTBdelegate", "onCreateView: from NonAppCompatActivity.");
        s.c = (Toolbar) inflate.findViewById(2131427438);
        a aVar = s.e;
        super.setActionBar(s.c);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView((View) inflate);
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        if (ix().b() > 0) {
            ix().af();
        }
        if (ix().b() != 0) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.ViewGroup] */
    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(int i) {
        d dVar = this.k;
        FrameLayout frameLayout = dVar == null ? (ViewGroup) findViewById(2131432701) : dVar.d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, frameLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.ViewGroup] */
    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view) {
        d dVar = this.k;
        FrameLayout frameLayout = dVar == null ? (ViewGroup) findViewById(2131432701) : dVar.d;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.ViewGroup] */
    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d dVar = this.k;
        FrameLayout frameLayout = dVar == null ? (ViewGroup) findViewById(2131432701) : dVar.d;
        if (frameLayout != null) {
            frameLayout.addView(view, layoutParams);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        s().a(getText(i));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        s().a(charSequence);
    }
}
