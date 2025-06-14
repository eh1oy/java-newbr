package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class NetworkModule_ProvideModuleDialogActionsWithJSONFactory implements Factory<ModuleDialogActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideModuleDialogActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ModuleDialogActionsWithJson get() {
        return provideModuleDialogActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideModuleDialogActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideModuleDialogActionsWithJSONFactory(module);
    }

    public static ModuleDialogActionsWithJson provideModuleDialogActionsWithJSON(NetworkModule instance) {
        return (ModuleDialogActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideModuleDialogActionsWithJSON());
    }
}
