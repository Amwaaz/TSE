package androidx.lifecycle;

import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import com.google.android.libraries.onegoogle.accountmenu.features.education.h;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/as.class */
public class as extends an {
    public as() {
    }

    public as(Object obj) {
        super(obj);
    }

    public as(Executor executor, EducationDatabase educationDatabase) {
        executor.execute(new h(this, educationDatabase, 2));
    }
}
