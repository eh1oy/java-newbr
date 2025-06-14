package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class AppLifeCycleObserverModule_ProvideAppLifeCycleObserverFactory implements Factory<AppLifecycleObserverImpl> {
    public final AppLifeCycleObserverModule module;

    public AppLifeCycleObserverModule_ProvideAppLifeCycleObserverFactory(AppLifeCycleObserverModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public AppLifecycleObserverImpl get() {
        return provideAppLifeCycleObserver(this.module);
    }

    public static AppLifeCycleObserverModule_ProvideAppLifeCycleObserverFactory create(AppLifeCycleObserverModule module) {
        return new AppLifeCycleObserverModule_ProvideAppLifeCycleObserverFactory(module);
    }

    public static AppLifecycleObserverImpl provideAppLifeCycleObserver(AppLifeCycleObserverModule instance) {
        return (AppLifecycleObserverImpl) Preconditions.checkNotNullFromProvides(instance.provideAppLifeCycleObserver());
    }
}
