package com.blackhub.bronline.game.gui.craft;

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
public final class CraftGuiFragment_MembersInjector implements MembersInjector<CraftGuiFragment> {
    public final Provider<MainViewModelFactory<CraftViewModel>> factoryProvider;

    public CraftGuiFragment_MembersInjector(Provider<MainViewModelFactory<CraftViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<CraftGuiFragment> create(Provider<MainViewModelFactory<CraftViewModel>> factoryProvider) {
        return new CraftGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CraftGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.craft.CraftGuiFragment.factory")
    public static void injectFactory(CraftGuiFragment instance, MainViewModelFactory<CraftViewModel> factory) {
        instance.factory = factory;
    }
}
