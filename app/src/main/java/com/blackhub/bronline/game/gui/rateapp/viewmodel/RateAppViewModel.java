package com.blackhub.bronline.game.gui.rateapp.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.rateapp.RateAppAnalyticsKeys;
import com.blackhub.bronline.game.gui.rateapp.RateAppUiState;
import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
import com.google.firebase.analytics.FirebaseAnalytics;
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
/* compiled from: RateAppViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/rateapp/RateAppUiState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/rateapp/network/RateAppActionWithJson;", "rateAppAnalytics", "Lcom/blackhub/bronline/game/gui/rateapp/analytics/RateAppAnalytics;", "(Lcom/blackhub/bronline/game/gui/rateapp/network/RateAppActionWithJson;Lcom/blackhub/bronline/game/gui/rateapp/analytics/RateAppAnalytics;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "onButtonClick", "isLike", "", "onCloseCLick", "onStarClick", FirebaseAnalytics.Param.INDEX, "", "sendAnalyticsLikeDislikePressed", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RateAppViewModel extends BaseViewModel<RateAppUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<RateAppUiState> _uiState;

    @NotNull
    public final RateAppActionWithJson actionsWithJson;

    @NotNull
    public final RateAppAnalytics rateAppAnalytics;

    @Inject
    public RateAppViewModel(@NotNull RateAppActionWithJson actionsWithJson, @NotNull RateAppAnalytics rateAppAnalytics) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(rateAppAnalytics, "rateAppAnalytics");
        this.actionsWithJson = actionsWithJson;
        this.rateAppAnalytics = rateAppAnalytics;
        this._uiState = StateFlowKt.MutableStateFlow(new RateAppUiState(null, 0, 0, false, false, false, false, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends RateAppUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RateAppUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RateAppViewModel$initJson$1(json, this, null), 1, null);
    }

    public static /* synthetic */ void onButtonClick$default(RateAppViewModel rateAppViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rateAppViewModel.onButtonClick(z);
    }

    public final void onButtonClick(boolean isLike) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new RateAppViewModel$onButtonClick$1(this, isLike, null), 1, null);
    }

    public final void onCloseCLick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new RateAppViewModel$onCloseCLick$1(this, null), 1, null);
    }

    public final void onStarClick(int index) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RateAppViewModel$onStarClick$1(index, this, null), 1, null);
    }

    public final void sendAnalyticsLikeDislikePressed(boolean isLike) {
        this.rateAppAnalytics.sendAnalyticsLikeDislikePressed(isLike ? RateAppAnalyticsKeys.RATE_APP_lIKE_VALUE : RateAppAnalyticsKeys.RATE_APP_DISlIKE_VALUE, getUiState().getValue().getCategoryDescription());
    }
}
