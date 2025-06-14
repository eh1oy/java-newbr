package com.blackhub.bronline.game.gui.taximap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TaxiMapViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/taximap/TaxiMapActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "handlerCoordinates", "", "widthView", "", "heightView", "coordinateX", "coordinateY", "sendCloseScreen", "sendCoordinates", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaxiMapViewModel extends BaseViewModel<TaxiMapUiState> implements ViewModelProvider.Factory {
    public static final float HALF_SIZE = 2.0f;
    public static final float REVERSE_SIZE = -1.0f;
    public static final float TEMP_SIZE = 6000.0f;

    @NotNull
    public final MutableStateFlow<TaxiMapUiState> _uiState;

    @NotNull
    public final TaxiMapActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<TaxiMapUiState> uiState;
    public static final int $stable = 8;

    @Inject
    public TaxiMapViewModel(@NotNull TaxiMapActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiMapUiState(0.0f, 0.0f, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends TaxiMapUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiMapUiState> getUiState() {
        return this.uiState;
    }

    public final void handlerCoordinates(float widthView, float heightView, float coordinateX, float coordinateY) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new TaxiMapViewModel$handlerCoordinates$1(coordinateX, coordinateY, widthView, heightView, this, null), 1, null);
    }

    public final void sendCoordinates(float coordinateX, float coordinateY) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiMapViewModel$sendCoordinates$1(this, coordinateX, coordinateY, null), 1, null);
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new TaxiMapViewModel$sendCloseScreen$1(this, null), 1, null);
    }
}
