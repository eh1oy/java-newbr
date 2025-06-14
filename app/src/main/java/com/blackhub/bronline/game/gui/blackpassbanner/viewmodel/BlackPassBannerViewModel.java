package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerUiState;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JH\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013JH\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/blackpassbanner/BlackPassBannerUiState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/blackpassbanner/network/BlackPassBannerActionsWithJson;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/blackpassbanner/network/BlackPassBannerActionsWithJson;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initRewardsAndProperties", "", "deluxeRewards", "", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "properties", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassProperties;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "mapDeluxeRewardsToRenderAttachment", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "sendButtonClicked", "action", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1549#2:126\n1620#2,3:127\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel\n*L\n105#1:126\n105#1:127,3\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassBannerViewModel extends BaseViewModel<BlackPassBannerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BlackPassBannerUiState> _uiState;

    @NotNull
    public final BlackPassBannerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @Inject
    public BlackPassBannerViewModel(@NotNull BlackPassBannerActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new BlackPassBannerUiState(null, null, null, null, 0, null, false, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends BlackPassBannerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BlackPassBannerUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void initRewardsAndProperties(@NotNull List<LevelsInfo> deluxeRewards, @Nullable BlackPassProperties properties, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(deluxeRewards, "deluxeRewards");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BlackPassBannerViewModel$initRewardsAndProperties$1(this, properties, deluxeRewards, vehiclesList, skinsList, listOfAwardsTypes, null), 3, null);
    }

    public final void sendButtonClicked(int action) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new BlackPassBannerViewModel$sendButtonClicked$1(this, action, null), 1, null);
    }

    public final List<ImageModel> mapDeluxeRewardsToRenderAttachment(List<LevelsInfo> deluxeRewards, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        ArrayList arrayList;
        if (deluxeRewards != null) {
            List<LevelsInfo> list = deluxeRewards;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (LevelsInfo levelsInfo : list) {
                arrayList.add(UtilsKt.setImageModel(new BaseModel(levelsInfo.getId(), levelsInfo.getTypeId(), levelsInfo.getAwardId(), levelsInfo.getRenderId(), levelsInfo.getName(), levelsInfo.getNameStore()), vehiclesList, skinsList, listOfAwardsTypes));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
