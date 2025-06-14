package com.blackhub.bronline.game.gui.fishing;

import android.graphics.Bitmap;
import android.os.CountDownTimer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.gui.fishing.data.FishingGsonParseObj;
import com.blackhub.bronline.game.gui.fishing.data.enums.AudioType;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FishingViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0006\u0010#\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000fJ\u001c\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u000fH\u0002J\u0010\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u000fH\u0002J\u0006\u00102\u001a\u00020\u001fJ\u0006\u00103\u001a\u00020\u001fJ \u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0012H\u0002J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020)H\u0002J\u0006\u0010<\u001a\u00020\u001fJ\b\u0010=\u001a\u00020\u001fH\u0002J\u0006\u0010>\u001a\u00020\u001fJ\u0018\u0010?\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006@"}, d2 = {"Lcom/blackhub/bronline/game/gui/fishing/FishingViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/fishing/FishingUiState;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/fishing/FishingActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/fishing/FishingActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isStartedGenerates", "", "localInvItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "timerBaitDescription", "Landroid/os/CountDownTimer;", "timerTackleDescription", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "checkAndRender", "", "fishingObj", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingGsonParseObj;", "invItems", "clickBaitDescription", "clickTackleDescription", "closeIfYouLoser", "closeInterface", "closeInterfaceIfNullableJson", "errorMessage", "", "hookAFish", "offsetState", "initFishingObjects", "json", "Lorg/json/JSONObject;", "isShowBaitDescription", "isShowing", "isShowTackleDescription", "pullTheFish", "refreshPlayer", "renderObjectAndUpdateState", "fishingBaitObj", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "typeOfObject", "", "objectFromInv", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "startAudioIfStartFishing", "startWindowWithProgress", "stopAllGeneratesAndTimers", "updateStateAfterRender", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n230#2,5:395\n230#2,5:400\n230#2,5:405\n230#2,5:410\n230#2,5:416\n230#2,5:421\n230#2,5:426\n230#2,5:431\n1#3:415\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel\n*L\n97#1:395,5\n118#1:400,5\n179#1:405,5\n187#1:410,5\n294#1:416,5\n301#1:421,5\n308#1:426,5\n362#1:431,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingViewModel extends BaseViewModel<FishingUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<FishingUiState> _uiState;

    @NotNull
    public final FishingActionWithJSON actionWithJSON;
    public boolean isStartedGenerates;

    @NotNull
    public final MutableStateFlow<List<InvItems>> localInvItems;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @Nullable
    public CountDownTimer timerBaitDescription;

    @Nullable
    public CountDownTimer timerTackleDescription;

    @NotNull
    public final StateFlow<FishingUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public FishingViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull FishingActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new FishingUiState(0, 0.0f, 0L, 0, 0, 0.0f, 0, null, null, null, 0, null, false, false, false, false, false, false, false, 524287, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.localInvItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends FishingUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<FishingUiState> getUiState() {
        return this.uiState;
    }

    public final void hookAFish(boolean offsetState) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new FishingViewModel$hookAFish$1(offsetState, this, null), 1, null);
    }

    public final void pullTheFish() {
        FishingUiState value;
        FishingUiState copy;
        float progressRotate = get_uiState().getValue().getProgressRotate() + 10.799999f;
        boolean z = progressRotate < 40.0f || progressRotate > 145.0f;
        if (z) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new FishingViewModel$pullTheFish$1(this, null), 1, null);
        }
        if (progressRotate >= 180.0f) {
            progressRotate = 180.0f;
        }
        MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r38 & 1) != 0 ? r4.screen : 0, (r38 & 2) != 0 ? r4.fishFallStep : 0.0f, (r38 & 4) != 0 ? r4.fishingTimer : 0L, (r38 & 8) != 0 ? r4.progressTimer : 0, (r38 & 16) != 0 ? r4.progressStep : 0, (r38 & 32) != 0 ? r4.progressRotate : progressRotate, (r38 & 64) != 0 ? r4.currentProgress : 0, (r38 & 128) != 0 ? r4.baitObj : null, (r38 & 256) != 0 ? r4.tackleObj : null, (r38 & 512) != 0 ? r4.fishingObj : null, (r38 & 1024) != 0 ? r4.currentOffsetState : 0, (r38 & 2048) != 0 ? r4.fishingAudioType : null, (r38 & 4096) != 0 ? r4.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r4.isNeedPlaySound : false, (r38 & 16384) != 0 ? r4.isHideFloat : false, (r38 & 32768) != 0 ? r4.isHideProgress : false, (r38 & 65536) != 0 ? r4.isNeedClose : z, (r38 & 131072) != 0 ? r4.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void stopAllGeneratesAndTimers() {
        CountDownTimer countDownTimer = this.timerBaitDescription;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timerBaitDescription = null;
        CountDownTimer countDownTimer2 = this.timerTackleDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.timerTackleDescription = null;
    }

    public final void closeInterfaceIfNullableJson(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        showErrorMessage(errorMessage);
        closeInterface();
    }

    public final void closeInterface() {
        FishingUiState value;
        FishingUiState copy;
        MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : null, (r38 & 256) != 0 ? r2.tackleObj : null, (r38 & 512) != 0 ? r2.fishingObj : null, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : null, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : false, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : true, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void closeIfYouLoser() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new FishingViewModel$closeIfYouLoser$1(this, null), 1, null);
        closeInterface();
    }

    public final void clickBaitDescription() {
        if (get_uiState().getValue().isShowBaitDescription()) {
            CountDownTimer countDownTimer = this.timerBaitDescription;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            isShowBaitDescription(false);
            return;
        }
        isShowBaitDescription(true);
        if (this.timerBaitDescription == null) {
            this.timerBaitDescription = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel$clickBaitDescription$1
                @Override // android.os.CountDownTimer
                public void onTick(long milliseconds) {
                }

                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    FishingViewModel.this.isShowBaitDescription(false);
                }
            };
        }
        CountDownTimer countDownTimer2 = this.timerBaitDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    public final void clickTackleDescription() {
        if (get_uiState().getValue().isShowTackleDescription()) {
            CountDownTimer countDownTimer = this.timerTackleDescription;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            isShowTackleDescription(false);
            return;
        }
        isShowTackleDescription(true);
        if (this.timerTackleDescription == null) {
            this.timerTackleDescription = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel$clickTackleDescription$1
                @Override // android.os.CountDownTimer
                public void onTick(long milliseconds) {
                }

                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    FishingViewModel.this.isShowTackleDescription(false);
                }
            };
        }
        CountDownTimer countDownTimer2 = this.timerTackleDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    public final void refreshPlayer() {
        FishingUiState value;
        FishingUiState copy;
        MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : null, (r38 & 256) != 0 ? r2.tackleObj : null, (r38 & 512) != 0 ? r2.fishingObj : null, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : null, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : false, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : false, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void startAudioIfStartFishing() {
        FishingUiState value;
        FishingUiState copy;
        MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : null, (r38 & 256) != 0 ? r2.tackleObj : null, (r38 & 512) != 0 ? r2.fishingObj : null, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : AudioType.FISHING_FISH_BIT, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : true, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : false, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void initFishingObjects(@NotNull JSONObject json, @NotNull List<InvItems> invItems) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(invItems, "invItems");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FishingViewModel$initFishingObjects$1(this, invItems, json, null), 1, null);
    }

    public final void checkAndRender(FishingGsonParseObj fishingObj, List<InvItems> invItems) {
        Object obj;
        Object obj2;
        FishingBaitObj bait = fishingObj.getBait();
        Object obj3 = null;
        if (bait != null && bait.getImageType() == 1) {
            Iterator<T> it = invItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((InvItems) obj2).getModelid() == bait.getModelId()) {
                        break;
                    }
                }
            }
            InvItems invItems2 = (InvItems) obj2;
            if (invItems2 != null) {
                renderObjectAndUpdateState(bait, 0, invItems2);
            }
        }
        FishingBaitObj tackle = fishingObj.getTackle();
        if (tackle != null && tackle.getImageType() == 1) {
            Iterator<T> it2 = invItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((InvItems) obj).getModelid() == tackle.getModelId()) {
                        break;
                    }
                }
            }
            InvItems invItems3 = (InvItems) obj;
            if (invItems3 != null) {
                renderObjectAndUpdateState(tackle, 1, invItems3);
            }
        }
        FishingBaitObj fish = fishingObj.getFish();
        if (fish.getImageType() == 1) {
            Iterator<T> it3 = invItems.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((InvItems) next).getModelid() == fish.getModelId()) {
                    obj3 = next;
                    break;
                }
            }
            InvItems invItems4 = (InvItems) obj3;
            if (invItems4 != null) {
                renderObjectAndUpdateState(fish, 2, invItems4);
            }
        }
    }

    public final void renderObjectAndUpdateState(final FishingBaitObj fishingBaitObj, final int typeOfObject, InvItems objectFromInv) {
        GameRender.getInstance().RequestRender(0, objectFromInv.getId(), objectFromInv.getModelid(), 3, 3, 20.0f, 180.0f, 45.0f, 0.78f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                FishingViewModel.renderObjectAndUpdateState$lambda$13(FishingBaitObj.this, this, typeOfObject, i, bitmap);
            }
        });
    }

    public static final void renderObjectAndUpdateState$lambda$13(FishingBaitObj fishingBaitObj, FishingViewModel this$0, int i, int i2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fishingBaitObj, "$fishingBaitObj");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bitmap);
        fishingBaitObj.setBitmapRender(AndroidImageBitmap_androidKt.asImageBitmap(bitmap));
        this$0.updateStateAfterRender(fishingBaitObj, i);
    }

    public final void updateStateAfterRender(FishingBaitObj fishingBaitObj, int typeOfObject) {
        FishingUiState value;
        FishingUiState copy;
        FishingUiState value2;
        FishingUiState copy2;
        FishingUiState value3;
        FishingUiState copy3;
        if (typeOfObject == 0) {
            MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : fishingBaitObj, (r38 & 256) != 0 ? r2.tackleObj : null, (r38 & 512) != 0 ? r2.fishingObj : null, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : null, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : false, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : false, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return;
        }
        if (typeOfObject == 1) {
            MutableStateFlow<? extends FishingUiState> mutableStateFlow2 = get_uiState();
            do {
                value2 = mutableStateFlow2.getValue();
                copy2 = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : null, (r38 & 256) != 0 ? r2.tackleObj : fishingBaitObj, (r38 & 512) != 0 ? r2.fishingObj : null, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : null, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : false, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : false, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value2.isShowTackleDescription : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
            return;
        }
        if (typeOfObject != 2) {
            return;
        }
        MutableStateFlow<? extends FishingUiState> mutableStateFlow3 = get_uiState();
        do {
            value3 = mutableStateFlow3.getValue();
            copy3 = r2.copy((r38 & 1) != 0 ? r2.screen : 0, (r38 & 2) != 0 ? r2.fishFallStep : 0.0f, (r38 & 4) != 0 ? r2.fishingTimer : 0L, (r38 & 8) != 0 ? r2.progressTimer : 0, (r38 & 16) != 0 ? r2.progressStep : 0, (r38 & 32) != 0 ? r2.progressRotate : 0.0f, (r38 & 64) != 0 ? r2.currentProgress : 0, (r38 & 128) != 0 ? r2.baitObj : null, (r38 & 256) != 0 ? r2.tackleObj : null, (r38 & 512) != 0 ? r2.fishingObj : fishingBaitObj, (r38 & 1024) != 0 ? r2.currentOffsetState : 0, (r38 & 2048) != 0 ? r2.fishingAudioType : null, (r38 & 4096) != 0 ? r2.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r2.isNeedPlaySound : false, (r38 & 16384) != 0 ? r2.isHideFloat : false, (r38 & 32768) != 0 ? r2.isHideProgress : false, (r38 & 65536) != 0 ? r2.isNeedClose : false, (r38 & 131072) != 0 ? r2.isShowBaitDescription : false, (r38 & 262144) != 0 ? value3.isShowTackleDescription : false);
        } while (!mutableStateFlow3.compareAndSet(value3, copy3));
    }

    public final void startWindowWithProgress() {
        FishingUiState value;
        FishingUiState copy;
        this.isStartedGenerates = true;
        ViewModelExtensionKt.launchOnMain$default(this, null, new FishingViewModel$startWindowWithProgress$1(this, null), 1, null);
        MutableStateFlow<? extends FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r38 & 1) != 0 ? r3.screen : 1, (r38 & 2) != 0 ? r3.fishFallStep : 0.0f, (r38 & 4) != 0 ? r3.fishingTimer : 0L, (r38 & 8) != 0 ? r3.progressTimer : 0, (r38 & 16) != 0 ? r3.progressStep : 0, (r38 & 32) != 0 ? r3.progressRotate : 0.0f, (r38 & 64) != 0 ? r3.currentProgress : 0, (r38 & 128) != 0 ? r3.baitObj : null, (r38 & 256) != 0 ? r3.tackleObj : null, (r38 & 512) != 0 ? r3.fishingObj : null, (r38 & 1024) != 0 ? r3.currentOffsetState : 0, (r38 & 2048) != 0 ? r3.fishingAudioType : null, (r38 & 4096) != 0 ? r3.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r3.isNeedPlaySound : false, (r38 & 16384) != 0 ? r3.isHideFloat : true, (r38 & 32768) != 0 ? r3.isHideProgress : false, (r38 & 65536) != 0 ? r3.isNeedClose : false, (r38 & 131072) != 0 ? r3.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void showErrorMessage(String message) {
        getLocalNotification().showErrorNotification(message);
    }

    public final void isShowBaitDescription(boolean isShowing) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FishingViewModel$isShowBaitDescription$1(this, isShowing, null), 1, null);
    }

    public final void isShowTackleDescription(boolean isShowing) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new FishingViewModel$isShowTackleDescription$1(this, isShowing, null), 1, null);
    }
}
