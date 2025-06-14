package com.blackhub.bronline.game.gui.plates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: PlatesViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010 \u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/gui/plates/PlatesViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/plates/PlatesUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/plates/PlatesActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/plates/PlatesActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeCountry", "", "countryId", "", "changedText", "plateNumber", "", "plateRegion", "initCurrencyType", "json", "Lorg/json/JSONObject;", "onClickButtonExit", "onClickButtonRefresh", "onPacketIncoming", "purchasePlate", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatesViewModel extends BaseViewModel<PlatesUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<PlatesUiState> _uiState;

    @NotNull
    public final PlatesActionWithJSON actionWithJSON;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<PlatesUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public PlatesViewModel(@NotNull PlatesActionWithJSON actionWithJSON, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new PlatesUiState(0, null, null, null, 0, 0, 0, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends PlatesUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<PlatesUiState> getUiState() {
        return this.uiState;
    }

    public final void initCurrencyType(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new PlatesViewModel$initCurrencyType$1(json, this, null), 1, null);
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new PlatesViewModel$onPacketIncoming$1(json, this, null), 1, null);
    }

    public final void onClickButtonExit() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new PlatesViewModel$onClickButtonExit$1(this, null), 1, null);
    }

    public final void onClickButtonRefresh() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new PlatesViewModel$onClickButtonRefresh$1(this, null), 1, null);
    }

    public final void changeCountry(int countryId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new PlatesViewModel$changeCountry$1(this, countryId, null), 1, null);
    }

    public final void purchasePlate(@NotNull String plateNumber, @NotNull String plateRegion) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        ViewModelExtensionKt.launchOnIO$default(this, null, new PlatesViewModel$purchasePlate$1(plateRegion, this, plateNumber, null), 1, null);
    }

    public final void changedText(@NotNull String plateNumber, @NotNull String plateRegion) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        ViewModelExtensionKt.launchOnIO$default(this, null, new PlatesViewModel$changedText$1(plateRegion, plateNumber, this, null), 1, null);
    }
}
