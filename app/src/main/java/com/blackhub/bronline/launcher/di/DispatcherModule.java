package com.blackhub.bronline.launcher.di;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: DispatchersModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/blackhub/bronline/launcher/di/DispatcherModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher", "providesMainDispatcher", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes4.dex */
public final class DispatcherModule {
    public static final int $stable = 0;

    @Provides
    @DefaultDispatcher
    @NotNull
    public final CoroutineDispatcher providesDefaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Provides
    @IoDispatcher
    @NotNull
    public final CoroutineDispatcher providesIoDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    @MainDispatcher
    @NotNull
    public final CoroutineDispatcher providesMainDispatcher() {
        return Dispatchers.getMain();
    }
}
