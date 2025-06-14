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
@QualifierMetadata({"com.blackhub.bronline.launcher.di.CdnAPI"})
/* loaded from: classes4.dex */
public final class NetworkModule_ProvideCdnApiServiceFactory implements Factory<Api> {
    public final NetworkModule module;

    public NetworkModule_ProvideCdnApiServiceFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Api get() {
        return provideCdnApiService(this.module);
    }

    public static NetworkModule_ProvideCdnApiServiceFactory create(NetworkModule module) {
        return new NetworkModule_ProvideCdnApiServiceFactory(module);
    }

    public static Api provideCdnApiService(NetworkModule instance) {
        return (Api) Preconditions.checkNotNullFromProvides(instance.provideCdnApiService());
    }
}
