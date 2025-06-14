package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class NetworkModule_ProvideSpawnLocationRepositoryFactory implements Factory<SpawnLocationRepository> {
    public final NetworkModule module;

    public NetworkModule_ProvideSpawnLocationRepositoryFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SpawnLocationRepository get() {
        return provideSpawnLocationRepository(this.module);
    }

    public static NetworkModule_ProvideSpawnLocationRepositoryFactory create(NetworkModule module) {
        return new NetworkModule_ProvideSpawnLocationRepositoryFactory(module);
    }

    public static SpawnLocationRepository provideSpawnLocationRepository(NetworkModule instance) {
        return (SpawnLocationRepository) Preconditions.checkNotNullFromProvides(instance.provideSpawnLocationRepository());
    }
}
