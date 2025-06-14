package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
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
public final class NetworkModule_ProvideDonateActionWithJSONFactory implements Factory<DonateActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideDonateActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public DonateActionWithJSON get() {
        return provideDonateActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideDonateActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideDonateActionWithJSONFactory(module);
    }

    public static DonateActionWithJSON provideDonateActionWithJSON(NetworkModule instance) {
        return (DonateActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideDonateActionWithJSON());
    }
}
