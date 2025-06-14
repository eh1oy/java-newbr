package com.blackhub.bronline.launcher.di;

import android.content.Context;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.AppContext"})
/* loaded from: classes4.dex */
public final class ResourceModule_ProvideStringResourceFactory implements Factory<StringResource> {
    public final Provider<Context> contextProvider;
    public final ResourceModule module;

    public ResourceModule_ProvideStringResourceFactory(ResourceModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StringResource get() {
        return provideStringResource(this.module, this.contextProvider.get());
    }

    public static ResourceModule_ProvideStringResourceFactory create(ResourceModule module, Provider<Context> contextProvider) {
        return new ResourceModule_ProvideStringResourceFactory(module, contextProvider);
    }

    public static StringResource provideStringResource(ResourceModule instance, Context context) {
        return (StringResource) Preconditions.checkNotNullFromProvides(instance.provideStringResource(context));
    }
}
