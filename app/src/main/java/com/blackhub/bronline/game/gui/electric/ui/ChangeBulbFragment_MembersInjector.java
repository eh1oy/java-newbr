package com.blackhub.bronline.game.gui.electric.ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ChangeBulbFragment_MembersInjector implements MembersInjector<ChangeBulbFragment> {
    public final Provider<MainViewModelFactory<ChangeBulbViewModel>> factoryProvider;

    public ChangeBulbFragment_MembersInjector(Provider<MainViewModelFactory<ChangeBulbViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<ChangeBulbFragment> create(Provider<MainViewModelFactory<ChangeBulbViewModel>> factoryProvider) {
        return new ChangeBulbFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChangeBulbFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment.factory")
    public static void injectFactory(ChangeBulbFragment instance, MainViewModelFactory<ChangeBulbViewModel> factory) {
        instance.factory = factory;
    }
}
