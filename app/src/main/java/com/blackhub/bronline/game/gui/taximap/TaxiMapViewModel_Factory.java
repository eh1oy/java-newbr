package com.blackhub.bronline.game.gui.taximap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TaxiMapViewModel_Factory implements Factory<TaxiMapViewModel> {
    public final Provider<TaxiMapActionWithJSON> actionWithJSONProvider;

    public TaxiMapViewModel_Factory(Provider<TaxiMapActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public TaxiMapViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static TaxiMapViewModel_Factory create(Provider<TaxiMapActionWithJSON> actionWithJSONProvider) {
        return new TaxiMapViewModel_Factory(actionWithJSONProvider);
    }

    public static TaxiMapViewModel newInstance(TaxiMapActionWithJSON actionWithJSON) {
        return new TaxiMapViewModel(actionWithJSON);
    }
}
