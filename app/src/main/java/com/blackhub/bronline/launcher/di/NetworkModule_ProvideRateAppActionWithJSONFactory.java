package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
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
public final class NetworkModule_ProvideRateAppActionWithJSONFactory implements Factory<RateAppActionWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideRateAppActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RateAppActionWithJson get() {
        return provideRateAppActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideRateAppActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideRateAppActionWithJSONFactory(module);
    }

    public static RateAppActionWithJson provideRateAppActionWithJSON(NetworkModule instance) {
        return (RateAppActionWithJson) Preconditions.checkNotNullFromProvides(instance.provideRateAppActionWithJSON());
    }
}
