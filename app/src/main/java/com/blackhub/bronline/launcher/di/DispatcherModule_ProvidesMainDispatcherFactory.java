package com.blackhub.bronline.launcher.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.MainDispatcher"})
/* loaded from: classes4.dex */
public final class DispatcherModule_ProvidesMainDispatcherFactory implements Factory<CoroutineDispatcher> {
    public final DispatcherModule module;

    public DispatcherModule_ProvidesMainDispatcherFactory(DispatcherModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesMainDispatcher(this.module);
    }

    public static DispatcherModule_ProvidesMainDispatcherFactory create(DispatcherModule module) {
        return new DispatcherModule_ProvidesMainDispatcherFactory(module);
    }

    public static CoroutineDispatcher providesMainDispatcher(DispatcherModule instance) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(instance.providesMainDispatcher());
    }
}
