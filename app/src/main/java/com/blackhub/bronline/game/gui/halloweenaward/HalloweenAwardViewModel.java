package com.blackhub.bronline.game.gui.halloweenaward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: HalloweenAwardViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "sendType", "type", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHalloweenAwardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,55:1\n230#2,5:56\n*S KotlinDebug\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel\n*L\n34#1:56,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HalloweenAwardViewModel extends BaseViewModel<HalloweenAwardUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<HalloweenAwardUiState> _uiState;

    @NotNull
    public final HalloweenAwardActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<HalloweenAwardUiState> uiState;

    @Inject
    public HalloweenAwardViewModel(@NotNull HalloweenAwardActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new HalloweenAwardUiState(null, 0, 0, 0, 0, 0, false, false, 255, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends HalloweenAwardUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<HalloweenAwardUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        HalloweenAwardUiState copy;
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = json.optString("n", AnyExtensionKt.empty(this));
        int optInt = json.optInt("p", 0);
        int optInt2 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_MONEY_KEY, 0);
        int optInt3 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_MONEY_BP_KEY, 0);
        int optInt4 = json.optInt("bs", 0);
        int optInt5 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_XP_BP_KEY, 0);
        MutableStateFlow<? extends HalloweenAwardUiState> mutableStateFlow = get_uiState();
        while (true) {
            HalloweenAwardUiState value = mutableStateFlow.getValue();
            Intrinsics.checkNotNull(optString);
            int i = optInt5;
            int i2 = optInt5;
            MutableStateFlow<? extends HalloweenAwardUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r18 & 1) != 0 ? r3.titleText : optString, (r18 & 2) != 0 ? r3.premium : optInt, (r18 & 4) != 0 ? r3.money : optInt2, (r18 & 8) != 0 ? r3.moneyBP : optInt3, (r18 & 16) != 0 ? r3.scoreBP : optInt4, (r18 & 32) != 0 ? r3.xpBP : i, (r18 & 64) != 0 ? r3.isNeedClose : false, (r18 & 128) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            optInt5 = i2;
        }
    }

    public final void sendType(int type) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new HalloweenAwardViewModel$sendType$1(this, type, null), 1, null);
    }
}
