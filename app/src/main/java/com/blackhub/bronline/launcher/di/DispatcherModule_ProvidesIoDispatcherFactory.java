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
@QualifierMetadata({"com.blackhub.bronline.launcher.di.IoDispatcher"})
/* loaded from: classes4.dex */
public final class DispatcherModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
    public final DispatcherModule module;

    public DispatcherModule_ProvidesIoDispatcherFactory(DispatcherModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesIoDispatcher(this.module);
    }

    public static DispatcherModule_ProvidesIoDispatcherFactory create(DispatcherModule module) {
        return new DispatcherModule_ProvidesIoDispatcherFactory(module);
    }

    public static CoroutineDispatcher providesIoDispatcher(DispatcherModule instance) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(instance.providesIoDispatcher());
    }
}
