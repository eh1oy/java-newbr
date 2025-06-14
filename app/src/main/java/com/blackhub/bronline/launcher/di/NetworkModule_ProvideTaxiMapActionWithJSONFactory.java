package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.taximap.TaxiMapActionWithJSON;
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
public final class NetworkModule_ProvideTaxiMapActionWithJSONFactory implements Factory<TaxiMapActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTaxiMapActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TaxiMapActionWithJSON get() {
        return provideTaxiMapActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTaxiMapActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTaxiMapActionWithJSONFactory(module);
    }

    public static TaxiMapActionWithJSON provideTaxiMapActionWithJSON(NetworkModule instance) {
        return (TaxiMapActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTaxiMapActionWithJSON());
    }
}
