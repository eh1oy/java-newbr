package com.blackhub.bronline.game.gui.rent;

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
public final class RentViewModel_Factory implements Factory<RentViewModel> {
    public final Provider<RentActionWithJSON> actionWithJSONProvider;

    public RentViewModel_Factory(Provider<RentActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public RentViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static RentViewModel_Factory create(Provider<RentActionWithJSON> actionWithJSONProvider) {
        return new RentViewModel_Factory(actionWithJSONProvider);
    }

    public static RentViewModel newInstance(RentActionWithJSON actionWithJSON) {
        return new RentViewModel(actionWithJSON);
    }
}
