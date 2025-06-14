package com.blackhub.bronline.game.gui.spawnlocation.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import io.reactivex.rxjava3.core.Single;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepositoryImpl;", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepository;", "()V", "spawnLocationDataSource", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationDataSource;", "getSpawnLocationDataSource", "()Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationDataSource;", "spawnLocationDataSource$delegate", "Lkotlin/Lazy;", "getListOfSpawnLocationItems", "Lio/reactivex/rxjava3/core/Single;", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationList;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpawnLocationRepositoryImpl implements SpawnLocationRepository {
    public static final int $stable = 8;

    /* renamed from: spawnLocationDataSource$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy spawnLocationDataSource = LazyKt__LazyJVMKt.lazy(SpawnLocationRepositoryImpl$spawnLocationDataSource$2.INSTANCE);

    public final SpawnLocationDataSource getSpawnLocationDataSource() {
        return (SpawnLocationDataSource) this.spawnLocationDataSource.getValue();
    }

    @Override // com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository
    @NotNull
    public Single<SpawnLocationList> getListOfSpawnLocationItems() {
        return getSpawnLocationDataSource().getSpawnLocationList();
    }
}
