package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
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
public final class FinalWindowViewModel_Factory implements Factory<FinalWindowViewModel> {
    public final Provider<EntertainmentSystemActionsWithJSON> actionWithJSONProvider;

    public FinalWindowViewModel_Factory(Provider<EntertainmentSystemActionsWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FinalWindowViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static FinalWindowViewModel_Factory create(Provider<EntertainmentSystemActionsWithJSON> actionWithJSONProvider) {
        return new FinalWindowViewModel_Factory(actionWithJSONProvider);
    }

    public static FinalWindowViewModel newInstance(EntertainmentSystemActionsWithJSON actionWithJSON) {
        return new FinalWindowViewModel(actionWithJSON);
    }
}
