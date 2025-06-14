package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.launcher.network.Api;
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
public final class NetworkModule_ProvideApiServiceFactory implements Factory<Api> {
    public final NetworkModule module;

    public NetworkModule_ProvideApiServiceFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Api get() {
        return provideApiService(this.module);
    }

    public static NetworkModule_ProvideApiServiceFactory create(NetworkModule module) {
        return new NetworkModule_ProvideApiServiceFactory(module);
    }

    public static Api provideApiService(NetworkModule instance) {
        return (Api) Preconditions.checkNotNullFromProvides(instance.provideApiService());
    }
}
