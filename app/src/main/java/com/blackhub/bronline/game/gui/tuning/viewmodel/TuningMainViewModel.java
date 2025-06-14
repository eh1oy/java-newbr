package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningMainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\"J\u000e\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\nJ\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0010H\u0002J\u0016\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0010H\u0002J\u0006\u00106\u001a\u00020\"J\u0006\u00107\u001a\u00020\"J\u000e\u00108\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010J\u000e\u00109\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0010J\u000e\u0010:\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u000e\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\nJ\u000e\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020\"J\u0006\u0010@\u001a\u00020\"J\u000e\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\nJ\u000e\u0010C\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u000e\u0010D\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\u0006\u0010E\u001a\u00020\"R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000e¨\u0006F"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_isFromMainMenu", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isHideBackToMainMenuButton", "isHideBackToMainMenuButton", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "mutableCarId", "", "mutableCarName", "", "mutableCurrentLayout", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableIfVisibleRoot", "mutablePlayerMoney", "newCarName", "getNewCarName", "newCurrentLayout", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewCurrentLayout", "()Lkotlinx/coroutines/flow/SharedFlow;", "newIfVisibleMainRoot", "getNewIfVisibleMainRoot", "newPlayerMoney", "getNewPlayerMoney", "applyResetDetails", "", "currentSelector", "typeOfDetail", "clearCarStatus", "clickBackToMainMenu", "closeInterface", "closeViewCar", "getInitData", "jsonObject", "Lorg/json/JSONObject;", "getInitObjects", "isViewFromMainMenu", "isMainMenu", "lPutActionToServer", "tKey", "lSetCurrentLayout", "currentLayout", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lSetPlayerMoney", "valueOfMoney", "saveCarStatus", "saveCarStatusAfterReset", "sendToClientCurrentSelector", "setCurrentLayout", "setPlayerMoney", "setVisibleMainRoot", "isVisible", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "showGameWarning", "startViewCar", "updateHideBackToMainMenuButton", "isHide", "updateInitStatusAfterBuy", "updateInterfaceAfterBuyColor", "updateInterfaceAfterResetColor", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningMainViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Boolean> _isFromMainMenu;

    @NotNull
    public final MutableStateFlow<Boolean> _isHideBackToMainMenuButton;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Boolean> isHideBackToMainMenuButton;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableStateFlow<Integer> mutableCarId;

    @NotNull
    public final MutableStateFlow<String> mutableCarName;

    @NotNull
    public final MutableSharedFlow<Integer> mutableCurrentLayout;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIfVisibleRoot;

    @NotNull
    public final MutableStateFlow<Integer> mutablePlayerMoney;

    @NotNull
    public final StateFlow<String> newCarName;

    @NotNull
    public final SharedFlow<Integer> newCurrentLayout;

    @NotNull
    public final StateFlow<Boolean> newIfVisibleMainRoot;

    @NotNull
    public final StateFlow<Integer> newPlayerMoney;

    @Inject
    public TuningMainViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.localNotification = localNotification;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutablePlayerMoney = MutableStateFlow;
        this.newPlayerMoney = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.mutableCarName = MutableStateFlow2;
        this.newCarName = MutableStateFlow2;
        MutableSharedFlow<Integer> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableCurrentLayout = MutableSharedFlow$default;
        this.newCurrentLayout = MutableSharedFlow$default;
        this.mutableCarId = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.mutableIfVisibleRoot = MutableStateFlow3;
        this.newIfVisibleMainRoot = MutableStateFlow3;
        Boolean bool = Boolean.FALSE;
        this._isFromMainMenu = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this._isHideBackToMainMenuButton = MutableStateFlow4;
        this.isHideBackToMainMenuButton = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewPlayerMoney() {
        return this.newPlayerMoney;
    }

    @NotNull
    public final StateFlow<String> getNewCarName() {
        return this.newCarName;
    }

    @NotNull
    public final SharedFlow<Integer> getNewCurrentLayout() {
        return this.newCurrentLayout;
    }

    @NotNull
    public final StateFlow<Boolean> getNewIfVisibleMainRoot() {
        return this.newIfVisibleMainRoot;
    }

    @NotNull
    public final StateFlow<Boolean> isHideBackToMainMenuButton() {
        return this.isHideBackToMainMenuButton;
    }

    public final void getInitData(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
        MutableStateFlow<String> mutableStateFlow = this.mutableCarName;
        String optString = jsonObject.optString("n");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        mutableStateFlow.setValue(optString);
        this.mutableCarId.setValue(Integer.valueOf(jsonObject.optInt("s")));
    }

    public final void setPlayerMoney(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
    }

    public final void lSetPlayerMoney(int valueOfMoney) {
        this.mutablePlayerMoney.setValue(Integer.valueOf(valueOfMoney));
    }

    public final void updateInitStatusAfterBuy(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lPutActionToServer(19);
        lSetPlayerMoney(jsonObject.optInt("m"));
    }

    public final void saveCarStatusAfterReset() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TuningMainViewModel$saveCarStatusAfterReset$1(this, null), 3, null);
    }

    public final void saveCarStatus() {
        lPutActionToServer(19);
    }

    public final void lPutActionToServer(int tKey) {
        this.actionWithJson.putPlayersActionToServer(tKey);
    }

    public final void clearCarStatus() {
        lPutActionToServer(18);
    }

    public final void setCurrentLayout(int currentLayout) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TuningMainViewModel$setCurrentLayout$1(this, currentLayout, null), 2, null);
    }

    public final Object lSetCurrentLayout(int i, Continuation<? super Unit> continuation) {
        Object emit = this.mutableCurrentLayout.emit(Boxing.boxInt(i), continuation);
        return emit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public static /* synthetic */ void applyResetDetails$default(TuningMainViewModel tuningMainViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        tuningMainViewModel.applyResetDetails(i, i2);
    }

    public final void applyResetDetails(int currentSelector, int typeOfDetail) {
        this.actionWithJson.putActionResetDetailsToServer(5, currentSelector, typeOfDetail);
    }

    public final void setVisibleMainRoot(boolean isVisible) {
        this.mutableIfVisibleRoot.setValue(Boolean.valueOf(isVisible));
    }

    public final void sendToClientCurrentSelector(int currentSelector) {
        this.actionWithJson.putSelectorToClient(21, currentSelector);
    }

    public final void updateInterfaceAfterBuyColor(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
        lPutActionToServer(19);
        lPutActionToServer(20);
    }

    public final void updateInterfaceAfterResetColor() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TuningMainViewModel$updateInterfaceAfterResetColor$1(this, null), 3, null);
    }

    public final void getInitObjects() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TuningMainViewModel$getInitObjects$1(this, null), 3, null);
    }

    public final void clickBackToMainMenu() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new TuningMainViewModel$clickBackToMainMenu$1(this, null), 2, null);
    }

    public final void startViewCar() {
        lPutActionToServer(27);
    }

    public final void closeViewCar() {
        lPutActionToServer(17);
    }

    public final void showGameWarning() {
        lPutActionToServer(4);
    }

    public final void closeInterface() {
        lPutActionToServer(18);
        lPutActionToServer(0);
    }

    public final void isViewFromMainMenu(boolean isMainMenu) {
        this._isFromMainMenu.setValue(Boolean.valueOf(isMainMenu));
    }

    public final void updateHideBackToMainMenuButton(boolean isHide) {
        MutableStateFlow<Boolean> mutableStateFlow = this._isHideBackToMainMenuButton;
        if (this._isFromMainMenu.getValue().booleanValue()) {
            isHide = true;
        }
        mutableStateFlow.setValue(Boolean.valueOf(isHide));
    }

    public final void showErrorNotification(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }
}
