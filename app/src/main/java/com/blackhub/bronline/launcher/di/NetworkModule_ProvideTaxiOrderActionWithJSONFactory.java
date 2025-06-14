package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderActionWithJSON;
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
public final class NetworkModule_ProvideTaxiOrderActionWithJSONFactory implements Factory<TaxiOrderActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTaxiOrderActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TaxiOrderActionWithJSON get() {
        return provideTaxiOrderActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTaxiOrderActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTaxiOrderActionWithJSONFactory(module);
    }

    public static TaxiOrderActionWithJSON provideTaxiOrderActionWithJSON(NetworkModule instance) {
        return (TaxiOrderActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTaxiOrderActionWithJSON());
    }
}
