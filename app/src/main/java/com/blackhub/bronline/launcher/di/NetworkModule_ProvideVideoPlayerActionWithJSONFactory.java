package com.blackhub.bronline.launcher.di;

import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerActionWithJson;
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
public final class NetworkModule_ProvideVideoPlayerActionWithJSONFactory implements Factory<VideoPlayerActionWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideVideoPlayerActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public VideoPlayerActionWithJson get() {
        return provideVideoPlayerActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideVideoPlayerActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideVideoPlayerActionWithJSONFactory(module);
    }

    public static VideoPlayerActionWithJson provideVideoPlayerActionWithJSON(NetworkModule instance) {
        return (VideoPlayerActionWithJson) Preconditions.checkNotNullFromProvides(instance.provideVideoPlayerActionWithJSON());
    }
}
