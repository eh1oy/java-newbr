package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardActionWithJSON;
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
public final class NetworkModule_ProvideHalloweenAwardActionWithJSONFactory implements Factory<HalloweenAwardActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideHalloweenAwardActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public HalloweenAwardActionWithJSON get() {
        return provideHalloweenAwardActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideHalloweenAwardActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideHalloweenAwardActionWithJSONFactory(module);
    }

    public static HalloweenAwardActionWithJSON provideHalloweenAwardActionWithJSON(NetworkModule instance) {
        return (HalloweenAwardActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideHalloweenAwardActionWithJSON());
    }
}
