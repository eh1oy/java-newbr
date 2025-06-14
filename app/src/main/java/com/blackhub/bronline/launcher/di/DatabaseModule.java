package com.blackhub.bronline.launcher.di;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.preferences.PreferencesRepositoryImpl;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: DatabaseModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/blackhub/bronline/launcher/di/DatabaseModule;", "", "()V", "provideLauncherDatabase", "Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "context", "Landroid/content/Context;", "providePreferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "providePurchaseDatabase", "Lcom/blackhub/bronline/launcher/database/PurchaseDatabase;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes4.dex */
public final class DatabaseModule {
    public static final int $stable = 0;

    @Provides
    @NotNull
    public final LauncherDatabase provideLauncherDatabase(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (LauncherDatabase) Room.databaseBuilder(context, LauncherDatabase.class, "myFiles").fallbackToDestructiveMigration().build();
    }

    @Provides
    @NotNull
    public final PurchaseDatabase providePurchaseDatabase(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (PurchaseDatabase) Room.databaseBuilder(context, PurchaseDatabase.class, "BillingPurchases").fallbackToDestructiveMigration().build();
    }

    @Provides
    @NotNull
    public final PreferencesRepository providePreferencesRepository(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PreferencesRepositoryImpl(context);
    }
}
