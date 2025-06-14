package com.blackhub.bronline.game.gui.taxiorder;

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
public final class TaxiOrderFragment_MembersInjector implements MembersInjector<TaxiOrderFragment> {
    public final Provider<MainViewModelFactory<TaxiOrderViewModel>> mainFactoryProvider;

    public TaxiOrderFragment_MembersInjector(Provider<MainViewModelFactory<TaxiOrderViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<TaxiOrderFragment> create(Provider<MainViewModelFactory<TaxiOrderViewModel>> mainFactoryProvider) {
        return new TaxiOrderFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxiOrderFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.taxiorder.TaxiOrderFragment.mainFactory")
    public static void injectMainFactory(TaxiOrderFragment instance, MainViewModelFactory<TaxiOrderViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
