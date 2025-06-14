package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.gifts.GiftsActionWithJSON;
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
public final class NetworkModule_ProvideGiftsActionWithJSONFactory implements Factory<GiftsActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideGiftsActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public GiftsActionWithJSON get() {
        return provideGiftsActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideGiftsActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideGiftsActionWithJSONFactory(module);
    }

    public static GiftsActionWithJSON provideGiftsActionWithJSON(NetworkModule instance) {
        return (GiftsActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideGiftsActionWithJSON());
    }
}
