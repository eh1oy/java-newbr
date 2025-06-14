package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.tuning.CostCalculation;
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
public final class NetworkModule_ProvideTuningCostCalculationFactory implements Factory<CostCalculation> {
    public final NetworkModule module;

    public NetworkModule_ProvideTuningCostCalculationFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CostCalculation get() {
        return provideTuningCostCalculation(this.module);
    }

    public static NetworkModule_ProvideTuningCostCalculationFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTuningCostCalculationFactory(module);
    }

    public static CostCalculation provideTuningCostCalculation(NetworkModule instance) {
        return (CostCalculation) Preconditions.checkNotNullFromProvides(instance.provideTuningCostCalculation());
    }
}
