package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
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
public final class NetworkModule_ProvideGasmanActionWithJsonFactory implements Factory<GasmanActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideGasmanActionWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public GasmanActionsWithJson get() {
        return provideGasmanActionWithJson(this.module);
    }

    public static NetworkModule_ProvideGasmanActionWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideGasmanActionWithJsonFactory(module);
    }

    public static GasmanActionsWithJson provideGasmanActionWithJson(NetworkModule instance) {
        return (GasmanActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideGasmanActionWithJson());
    }
}
