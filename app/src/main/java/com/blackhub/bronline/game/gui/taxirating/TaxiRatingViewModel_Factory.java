package com.blackhub.bronline.game.gui.taxirating;

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
public final class TaxiRatingViewModel_Factory implements Factory<TaxiRatingViewModel> {
    public final Provider<TaxiRatingActionWithJSON> actionWithJSONProvider;

    public TaxiRatingViewModel_Factory(Provider<TaxiRatingActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public TaxiRatingViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static TaxiRatingViewModel_Factory create(Provider<TaxiRatingActionWithJSON> actionWithJSONProvider) {
        return new TaxiRatingViewModel_Factory(actionWithJSONProvider);
    }

    public static TaxiRatingViewModel newInstance(TaxiRatingActionWithJSON actionWithJSON) {
        return new TaxiRatingViewModel(actionWithJSON);
    }
}
