package com.blackhub.bronline.game.gui.donate.viewmodel;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.FragmentIDWithStatusOfReplay;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateMainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JL\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u00172\b\b\u0002\u0010Q\u001a\u00020\u00172\b\b\u0002\u0010R\u001a\u00020SJ\u0006\u0010T\u001a\u00020HJ\u0006\u0010U\u001a\u00020HJ\u0017\u0010V\u001a\u00020H2\b\u0010W\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010XJ\u0006\u0010Y\u001a\u00020HJ\u0006\u0010Z\u001a\u00020HJ\u000e\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020\u0017J\u0006\u0010]\u001a\u00020HJ\u0006\u0010^\u001a\u00020HJ\u0016\u0010_\u001a\u00020H2\u0006\u0010`\u001a\u00020\u001c2\u0006\u0010a\u001a\u00020\u0017J\u000e\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020\u0017J\u000e\u0010d\u001a\u00020H2\u0006\u0010e\u001a\u00020\u0012J\u0010\u0010f\u001a\u00020H2\u0006\u0010a\u001a\u00020\u0017H\u0002J\u0006\u0010g\u001a\u00020HJ\u000e\u0010h\u001a\u00020H2\u0006\u0010i\u001a\u00020-J\u000e\u0010j\u001a\u00020H2\u0006\u0010e\u001a\u00020\u000eJ\u000e\u0010k\u001a\u00020H2\u0006\u0010e\u001a\u00020\u000eJ\u000e\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020\u0017J\u000e\u0010n\u001a\u00020H2\u0006\u0010o\u001a\u00020\u0017JG\u0010p\u001a\u00020H2\u0006\u0010q\u001a\u00020L2\u0006\u0010a\u001a\u00020\u00172\b\u0010r\u001a\u0004\u0018\u00010L2\u0006\u0010s\u001a\u00020L2\u0006\u0010t\u001a\u00020L2\u0006\u0010u\u001a\u00020L2\b\u0010\\\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010vJ\u000e\u0010w\u001a\u00020H2\u0006\u0010x\u001a\u00020LJ\u0006\u0010y\u001a\u00020HJ\u001e\u0010z\u001a\u00020H2\u0006\u0010{\u001a\u00020\u00172\u0006\u0010|\u001a\u00020L2\u0006\u0010}\u001a\u00020LJ!\u0010~\u001a\u00020H2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u007f\u001a\u00020\u000e2\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u000eJ\u0012\u0010\u0081\u0001\u001a\u00020H2\u0007\u0010\u0082\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020H2\u0007\u0010\u0082\u0001\u001a\u00020\u000eH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0!¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0!¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0!¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\"0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020*0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020-0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0014R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0014R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0!¢\u0006\b\n\u0000\u001a\u0004\b@\u0010$R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\bB\u0010\u0014R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010\u0014R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0014¨\u0006\u0084\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_gettingPrize", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/blackhub/bronline/game/gui/donate/data/PreviewPrize;", "_previewPrize", "_showBoostLevelsHintBPView", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_showLastChanceBPBoostView", "blockTimer", "Lkotlinx/coroutines/flow/StateFlow;", "", "getBlockTimer", "()Lkotlinx/coroutines/flow/StateFlow;", "blockTimerMutable", "carPriceWithColor", "", "getCarPriceWithColor", "colorPrice", "getColorPrice", "currentItem", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "getCurrentItem", "currentPrice", "getCurrentPrice", "fragmentID", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/blackhub/bronline/game/gui/donate/data/FragmentIDWithStatusOfReplay;", "getFragmentID", "()Lkotlinx/coroutines/flow/SharedFlow;", "gettingPrize", "getGettingPrize", "isShowingDialogConfirmation", "isShowingInputCustomValueOfRublesDialog", "itemForDialogConfirmation", "Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "getItemForDialogConfirmation", "itemForDialogResult", "Lcom/blackhub/bronline/game/gui/donate/data/ObjForResultDialog;", "getItemForDialogResult", "mutableCarPriceWithColor", "mutableColorPrice", "mutableCurrentItem", "mutableCurrentPrice", "mutableFragmentID", "mutableIsShowingDialogConfirmation", "mutableIsShowingInputCustomValueOfRublesDialog", "mutableItemForDialogConfirmation", "mutableItemForDialogResult", "mutableTimeoutStatusDialogConfirmation", "mutableValueOfCoins", "mutableValueOfRubles", "newValueOfCoins", "getNewValueOfCoins", "newValueOfRubles", "getNewValueOfRubles", "previewPrize", "getPreviewPrize", "showBoostLevelsHintBPView", "getShowBoostLevelsHintBPView", "showLastChanceBPBoostView", "getShowLastChanceBPBoostView", "timeoutStatusDialogConfirmation", "getTimeoutStatusDialogConfirmation", "clickPreviewPrize", "", "image", "Landroid/graphics/Bitmap;", "name", "", "id", "isPremium", "typeOfAward", "fromInterface", "typeReward", "rarity", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "closeConfirmationDialog", "closeDialog", "closeDialogIfItDoesntMeetTheCondition", "gameId", "(Ljava/lang/Integer;)V", "closePreviewPrize", "closeTimeoutConfirmationDialog", "confirmationBuyCar", "carColor", "confirmationBuySkinsOrMoneyOrAccessoriesOrServices", "openHeaderBoxes", "saveCurrentItem", "item", FirebaseAnalytics.Param.PRICE, "sendCustomValueOfRubles", "newValue", "setBLockTimer", "value", "setCarColorPrice", "setClosedStatusForInputCustomValueOfRublesDialog", "setObjForDialogResult", "objForResultDialog", "setShowBoostLevelsHintBPView", "setShowLastChanceBPBoostView", "setValueOfCoins", "valueOfCoins", "setValueOfRubles", "valueOfRubles", "showDialogConfirmation", "bodyMessage", "priceText", "caption", "butOK", "butNO", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showInputCustomValueOfRublesDialog", "showLocalError", "keyT", "title", "body", "showNewFragment", "ifReplace", "isOnlyLocalChange", "showingDialogConfirmation", "newStatus", "startTimeoutForDialogConfirmation", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DonateMainViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableSharedFlow<PreviewPrize> _gettingPrize;

    @NotNull
    public final MutableSharedFlow<PreviewPrize> _previewPrize;

    @NotNull
    public final MutableStateFlow<Boolean> _showBoostLevelsHintBPView;

    @NotNull
    public final MutableStateFlow<Boolean> _showLastChanceBPBoostView;

    @NotNull
    public final DonateActionWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Long> blockTimer;

    @NotNull
    public final MutableStateFlow<Long> blockTimerMutable;

    @NotNull
    public final SharedFlow<FragmentIDWithStatusOfReplay> fragmentID;

    @NotNull
    public final SharedFlow<PreviewPrize> gettingPrize;

    @NotNull
    public final StateFlow<Boolean> isShowingDialogConfirmation;

    @NotNull
    public final StateFlow<Boolean> isShowingInputCustomValueOfRublesDialog;

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> itemForDialogConfirmation;

    @NotNull
    public final SharedFlow<ObjForResultDialog> itemForDialogResult;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableStateFlow<Integer> mutableCarPriceWithColor;

    @NotNull
    public final MutableStateFlow<Integer> mutableColorPrice;

    @NotNull
    public final MutableStateFlow<DonateItem> mutableCurrentItem;

    @NotNull
    public final MutableStateFlow<Integer> mutableCurrentPrice;

    @NotNull
    public final MutableSharedFlow<FragmentIDWithStatusOfReplay> mutableFragmentID;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsShowingDialogConfirmation;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsShowingInputCustomValueOfRublesDialog;

    @NotNull
    public final MutableSharedFlow<ItemForDialogConfirmation> mutableItemForDialogConfirmation;

    @NotNull
    public final MutableSharedFlow<ObjForResultDialog> mutableItemForDialogResult;

    @NotNull
    public final MutableStateFlow<Boolean> mutableTimeoutStatusDialogConfirmation;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfCoins;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfRubles;

    @NotNull
    public final StateFlow<Integer> newValueOfCoins;

    @NotNull
    public final StateFlow<Integer> newValueOfRubles;

    @NotNull
    public final SharedFlow<PreviewPrize> previewPrize;

    @NotNull
    public final StateFlow<Boolean> timeoutStatusDialogConfirmation;

    @Inject
    public DonateMainViewModel(@NotNull DonateActionWithJSON actionWithJson, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.localNotification = localNotification;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfRubles = MutableStateFlow;
        this.newValueOfRubles = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfCoins = MutableStateFlow2;
        this.newValueOfCoins = MutableStateFlow2;
        this.mutableCurrentItem = StateFlowKt.MutableStateFlow(new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null));
        this.mutableCurrentPrice = StateFlowKt.MutableStateFlow(0);
        this.mutableColorPrice = StateFlowKt.MutableStateFlow(0);
        this.mutableCarPriceWithColor = StateFlowKt.MutableStateFlow(0);
        MutableSharedFlow<ItemForDialogConfirmation> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableItemForDialogConfirmation = MutableSharedFlow$default;
        this.itemForDialogConfirmation = MutableSharedFlow$default;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.mutableTimeoutStatusDialogConfirmation = MutableStateFlow3;
        this.timeoutStatusDialogConfirmation = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.mutableIsShowingDialogConfirmation = MutableStateFlow4;
        this.isShowingDialogConfirmation = MutableStateFlow4;
        MutableSharedFlow<ObjForResultDialog> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableItemForDialogResult = MutableSharedFlow$default2;
        this.itemForDialogResult = MutableSharedFlow$default2;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.mutableIsShowingInputCustomValueOfRublesDialog = MutableStateFlow5;
        this.isShowingInputCustomValueOfRublesDialog = MutableStateFlow5;
        MutableSharedFlow<FragmentIDWithStatusOfReplay> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFragmentID = MutableSharedFlow$default3;
        this.fragmentID = MutableSharedFlow$default3;
        MutableStateFlow<Long> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0L);
        this.blockTimerMutable = MutableStateFlow6;
        this.blockTimer = MutableStateFlow6;
        this._showLastChanceBPBoostView = StateFlowKt.MutableStateFlow(bool);
        this._showBoostLevelsHintBPView = StateFlowKt.MutableStateFlow(bool);
        MutableSharedFlow<PreviewPrize> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._previewPrize = MutableSharedFlow$default4;
        this.previewPrize = MutableSharedFlow$default4;
        MutableSharedFlow<PreviewPrize> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._gettingPrize = MutableSharedFlow$default5;
        this.gettingPrize = MutableSharedFlow$default5;
    }

    @NotNull
    public final StateFlow<Integer> getNewValueOfRubles() {
        return this.newValueOfRubles;
    }

    @NotNull
    public final StateFlow<Integer> getNewValueOfCoins() {
        return this.newValueOfCoins;
    }

    @NotNull
    public final StateFlow<DonateItem> getCurrentItem() {
        return this.mutableCurrentItem;
    }

    @NotNull
    public final StateFlow<Integer> getCurrentPrice() {
        return this.mutableCurrentPrice;
    }

    @NotNull
    public final StateFlow<Integer> getColorPrice() {
        return this.mutableColorPrice;
    }

    @NotNull
    public final StateFlow<Integer> getCarPriceWithColor() {
        return this.mutableCarPriceWithColor;
    }

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> getItemForDialogConfirmation() {
        return this.itemForDialogConfirmation;
    }

    @NotNull
    public final StateFlow<Boolean> getTimeoutStatusDialogConfirmation() {
        return this.timeoutStatusDialogConfirmation;
    }

    @NotNull
    public final StateFlow<Boolean> isShowingDialogConfirmation() {
        return this.isShowingDialogConfirmation;
    }

    @NotNull
    public final SharedFlow<ObjForResultDialog> getItemForDialogResult() {
        return this.itemForDialogResult;
    }

    @NotNull
    public final StateFlow<Boolean> isShowingInputCustomValueOfRublesDialog() {
        return this.isShowingInputCustomValueOfRublesDialog;
    }

    @NotNull
    public final SharedFlow<FragmentIDWithStatusOfReplay> getFragmentID() {
        return this.fragmentID;
    }

    @NotNull
    public final StateFlow<Long> getBlockTimer() {
        return this.blockTimer;
    }

    @NotNull
    public final StateFlow<Boolean> getShowLastChanceBPBoostView() {
        return FlowKt.asStateFlow(this._showLastChanceBPBoostView);
    }

    @NotNull
    public final StateFlow<Boolean> getShowBoostLevelsHintBPView() {
        return FlowKt.asStateFlow(this._showBoostLevelsHintBPView);
    }

    public final void setShowBoostLevelsHintBPView(boolean value) {
        this._showBoostLevelsHintBPView.setValue(Boolean.valueOf(value));
    }

    public final void setShowLastChanceBPBoostView(boolean value) {
        this._showLastChanceBPBoostView.setValue(Boolean.valueOf(value));
    }

    @NotNull
    public final SharedFlow<PreviewPrize> getPreviewPrize() {
        return this.previewPrize;
    }

    @NotNull
    public final SharedFlow<PreviewPrize> getGettingPrize() {
        return this.gettingPrize;
    }

    public final void setValueOfRubles(int valueOfRubles) {
        this.mutableValueOfRubles.setValue(Integer.valueOf(valueOfRubles));
    }

    public final void setValueOfCoins(int valueOfCoins) {
        this.mutableValueOfCoins.setValue(Integer.valueOf(valueOfCoins));
    }

    public final void closeDialog() {
        this.actionWithJson.closeDialog();
    }

    public final void saveCurrentItem(@NotNull DonateItem item, int price) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mutableCurrentItem.setValue(item);
        Integer type = item.getType();
        if (type != null && type.intValue() == 7) {
            setCarColorPrice(price);
        }
        this.mutableCurrentPrice.setValue(Integer.valueOf(price));
    }

    public final void showDialogConfirmation(@NotNull String bodyMessage, int price, @Nullable String priceText, @NotNull String caption, @NotNull String butOK, @NotNull String butNO, @Nullable Integer carColor) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(butOK, "butOK");
        Intrinsics.checkNotNullParameter(butNO, "butNO");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DonateMainViewModel$showDialogConfirmation$1(this, bodyMessage, price, priceText, caption, butOK, butNO, carColor, null), 3, null);
    }

    public final void startTimeoutForDialogConfirmation(boolean newStatus) {
        this.mutableTimeoutStatusDialogConfirmation.setValue(Boolean.valueOf(newStatus));
    }

    public final void closeTimeoutConfirmationDialog() {
        startTimeoutForDialogConfirmation(false);
    }

    public final void closeConfirmationDialog() {
        showingDialogConfirmation(false);
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.FALSE);
    }

    public final void showingDialogConfirmation(boolean newStatus) {
        this.mutableIsShowingDialogConfirmation.setValue(Boolean.valueOf(newStatus));
    }

    public final void confirmationBuySkinsOrMoneyOrAccessoriesOrServices() {
        DonateItem value = this.mutableCurrentItem.getValue();
        this.actionWithJson.buySkinsOrMoneyOrAccessoriesOrServices(this.mutableCurrentPrice.getValue().intValue(), value.getInternalId(), value.getCount());
        closeDialogIfItDoesntMeetTheCondition(value.getGameId());
    }

    public final void closeDialogIfItDoesntMeetTheCondition(Integer gameId) {
        if (gameId != null && gameId.intValue() != -20) {
            startTimeoutForDialogConfirmation(true);
        } else {
            closeConfirmationDialog();
            closeTimeoutConfirmationDialog();
        }
    }

    public final void confirmationBuyCar(int carColor) {
        DonateItem value = this.mutableCurrentItem.getValue();
        this.actionWithJson.buyCar(this.mutableCurrentPrice.getValue().intValue(), value.getInternalId(), carColor);
    }

    public static /* synthetic */ void showNewFragment$default(DonateMainViewModel donateMainViewModel, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        donateMainViewModel.showNewFragment(i, z, z2);
    }

    public final void showNewFragment(int fragmentID, boolean ifReplace, boolean isOnlyLocalChange) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DonateMainViewModel$showNewFragment$1(this, fragmentID, ifReplace, isOnlyLocalChange, null), 3, null);
    }

    public final void setCarColorPrice(int price) {
        int i = (int) ((price * 0.01f) + 5.0f);
        this.mutableColorPrice.setValue(Integer.valueOf(i));
        this.mutableCarPriceWithColor.setValue(Integer.valueOf(price + i));
    }

    public final void setObjForDialogResult(@NotNull ObjForResultDialog objForResultDialog) {
        Intrinsics.checkNotNullParameter(objForResultDialog, "objForResultDialog");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DonateMainViewModel$setObjForDialogResult$1(this, objForResultDialog, null), 3, null);
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }

    public final void showLocalError(int keyT, @NotNull String title, @NotNull String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.actionWithJson.showLocalError(keyT, title, body);
    }

    public final void openHeaderBoxes() {
        this.actionWithJson.openHeaderBoxes();
    }

    public final void showInputCustomValueOfRublesDialog() {
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.TRUE);
        showingDialogConfirmation(true);
    }

    public final void setClosedStatusForInputCustomValueOfRublesDialog() {
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.FALSE);
    }

    public final void sendCustomValueOfRubles(int newValue) {
        if (newValue != 0) {
            this.actionWithJson.sendCustomValueOfMoney(newValue);
        }
    }

    public final void setBLockTimer(long value) {
        this.blockTimerMutable.setValue(Long.valueOf(value));
    }

    public final void clickPreviewPrize(@Nullable Bitmap image, @NotNull String name, int id, int isPremium, int typeOfAward, int fromInterface, int typeReward, @NotNull CommonRarityEnum rarity) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new DonateMainViewModel$clickPreviewPrize$1(this, image, name, id, isPremium, typeOfAward, fromInterface, typeReward, rarity, null), 1, null);
    }

    public final void closePreviewPrize() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new DonateMainViewModel$closePreviewPrize$1(this, null), 1, null);
    }
}
