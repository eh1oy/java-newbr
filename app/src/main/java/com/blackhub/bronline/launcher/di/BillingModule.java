package com.blackhub.bronline.launcher.di;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: BiilingModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/launcher/di/BillingModule;", "", "()V", "provideBillingClientWrapper", "Lcom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper;", "application", "Landroid/app/Application;", "provideRustoreBillingClientWrapper", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes4.dex */
public final class BillingModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final BillingClientWrapper provideBillingClientWrapper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new BillingClientWrapper(application);
    }

    @Provides
    @Singleton
    @NotNull
    public final RustoreBillingClientWrapper provideRustoreBillingClientWrapper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new RustoreBillingClientWrapper(application);
    }
}
