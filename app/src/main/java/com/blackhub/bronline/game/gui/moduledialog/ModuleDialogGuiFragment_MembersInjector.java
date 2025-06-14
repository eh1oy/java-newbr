package com.blackhub.bronline.game.gui.moduledialog;

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
public final class ModuleDialogGuiFragment_MembersInjector implements MembersInjector<ModuleDialogGuiFragment> {
    public final Provider<MainViewModelFactory<ModuleDialogViewModel>> factoryProvider;

    public ModuleDialogGuiFragment_MembersInjector(Provider<MainViewModelFactory<ModuleDialogViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<ModuleDialogGuiFragment> create(Provider<MainViewModelFactory<ModuleDialogViewModel>> factoryProvider) {
        return new ModuleDialogGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ModuleDialogGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.moduledialog.ModuleDialogGuiFragment.factory")
    public static void injectFactory(ModuleDialogGuiFragment instance, MainViewModelFactory<ModuleDialogViewModel> factory) {
        instance.factory = factory;
    }
}
