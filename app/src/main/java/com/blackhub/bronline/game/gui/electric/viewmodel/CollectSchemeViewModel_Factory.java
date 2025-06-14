package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
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
public final class CollectSchemeViewModel_Factory implements Factory<CollectSchemeViewModel> {
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public CollectSchemeViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public CollectSchemeViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.preferencesRepositoryProvider.get());
    }

    public static CollectSchemeViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new CollectSchemeViewModel_Factory(localNotificationProvider, preferencesRepositoryProvider);
    }

    public static CollectSchemeViewModel newInstance(LocalNotification localNotification, PreferencesRepository preferencesRepository) {
        return new CollectSchemeViewModel(localNotification, preferencesRepository);
    }
}
