package com.blackhub.bronline.launcher.di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: AppLifeCycleObserverModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/blackhub/bronline/launcher/di/AppLifeCycleObserverModule;", "", "()V", "provideAppLifeCycleObserver", "Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes4.dex */
public final class AppLifeCycleObserverModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final AppLifecycleObserverImpl provideAppLifeCycleObserver() {
        return new AppLifecycleObserverImpl();
    }
}
