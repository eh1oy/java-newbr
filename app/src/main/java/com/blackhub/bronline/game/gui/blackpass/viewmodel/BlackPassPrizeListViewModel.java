package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeState;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassPrizeListViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/blackpass/data/PrizeState;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearData", "", "closeDialog", "initPrizeList", "standardPrizes", "", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "premiumPrizes", "isNeedShowDialog", "onCleared", "updateDialogState", "isShowingDialog", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassPrizeListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPrizeListViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,158:1\n230#2,5:159\n230#2,5:164\n*S KotlinDebug\n*F\n+ 1 BlackPassPrizeListViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel\n*L\n147#1:159,5\n151#1:164,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassPrizeListViewModel extends BaseViewModel<PrizeState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<PrizeState> _uiState;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<PrizeState> uiState;

    @Inject
    public BlackPassPrizeListViewModel(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new PrizeState(null, false, 3, 0 == true ? 1 : 0));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends PrizeState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<PrizeState> getUiState() {
        return this.uiState;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearData();
        super.onCleared();
    }

    public final void initPrizeList(@NotNull List<LevelsInfo> standardPrizes, @NotNull List<LevelsInfo> premiumPrizes) {
        Intrinsics.checkNotNullParameter(standardPrizes, "standardPrizes");
        Intrinsics.checkNotNullParameter(premiumPrizes, "premiumPrizes");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new BlackPassPrizeListViewModel$initPrizeList$1(standardPrizes, premiumPrizes, this, null), 1, null);
    }

    public final void closeDialog() {
        updateDialogState(false);
    }

    public final void isNeedShowDialog() {
        updateDialogState(true);
    }

    public final void clearData() {
        MutableStateFlow<? extends PrizeState> mutableStateFlow = get_uiState();
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new PrizeState(null, false, 3, 0 == true ? 1 : 0)));
    }

    public final void updateDialogState(boolean isShowingDialog) {
        PrizeState value;
        MutableStateFlow<? extends PrizeState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PrizeState.copy$default(value, null, isShowingDialog, 1, null)));
    }
}
