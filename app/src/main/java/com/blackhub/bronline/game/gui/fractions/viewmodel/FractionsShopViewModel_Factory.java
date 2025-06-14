package com.blackhub.bronline.game.gui.fractions.viewmodel;

import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
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
public final class FractionsShopViewModel_Factory implements Factory<FractionsShopViewModel> {
    public final Provider<FractionActionsWithJSON> actionsWithJSONProvider;

    public FractionsShopViewModel_Factory(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FractionsShopViewModel get() {
        return newInstance(this.actionsWithJSONProvider.get());
    }

    public static FractionsShopViewModel_Factory create(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        return new FractionsShopViewModel_Factory(actionsWithJSONProvider);
    }

    public static FractionsShopViewModel newInstance(FractionActionsWithJSON actionsWithJSON) {
        return new FractionsShopViewModel(actionsWithJSON);
    }
}
