package com.blackhub.bronline.game.gui.bprewards;

import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsLists;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1", f = "BpRewardsViewModel.kt", i = {}, l = {229, 253}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1\n*L\n247#1:737,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$updateJson$1(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, Continuation<? super BpRewardsViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = bpRewardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BpRewardsViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BpRewardsViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object parseJsonAndGetListOfItems;
        Object parseJsonAndGetListOfItems2;
        List fillListUntilNine;
        BpRewardsUiState value;
        BpRewardsUiState copy;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int optInt = this.$json.optInt("t");
            if (optInt == 1) {
                int sizeOfImage = this.this$0.get_uiState().getValue().getSizeOfImage();
                List<InvItems> invItemsFromJson = this.this$0.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson();
                List<BpRewardsAwardsDto> listOfAwardsTypes = this.this$0.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes();
                List<VehiclesDTO> vehiclesList = this.this$0.get_uiState().getValue().getBpRewardsLists().getVehiclesList();
                List<SkinsDTO> skinsList = this.this$0.get_uiState().getValue().getBpRewardsLists().getSkinsList();
                BpRewardsViewModel bpRewardsViewModel = this.this$0;
                JSONObject jSONObject = this.$json;
                this.label = 1;
                parseJsonAndGetListOfItems = bpRewardsViewModel.parseJsonAndGetListOfItems(jSONObject, (r19 & 2) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes() : listOfAwardsTypes, (r19 & 4) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson() : invItemsFromJson, (r19 & 8) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getVehiclesList() : vehiclesList, (r19 & 16) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getSkinsList() : skinsList, (r19 & 32) != 0 ? bpRewardsViewModel.get_uiState().getValue().getSizeOfImage() : sizeOfImage, (r19 & 64) != 0 ? false : false, this);
                if (parseJsonAndGetListOfItems == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (optInt == 2) {
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithItems());
                if (this.$json.optInt("s") == -1) {
                    fillListUntilNine = this.this$0.fillListUntilNine(mutableList);
                    BpRewardsLists copy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, fillListUntilNine, null, null, null, null, null, 125, null);
                    MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        copy = r22.copy((r38 & 1) != 0 ? r22.isBpRewardsScreen : false, (r38 & 2) != 0 ? r22.annotatedText : null, (r38 & 4) != 0 ? r22.bpRewardsLists : copy$default, (r38 & 8) != 0 ? r22.imagesForFilterList : null, (r38 & 16) != 0 ? r22.topHintList : null, (r38 & 32) != 0 ? r22.bottomHintList : null, (r38 & 64) != 0 ? r22.refreshButtonBitmap : null, (r38 & 128) != 0 ? r22.sizeOfImage : 0, (r38 & 256) != 0 ? r22.isNeedToShowDialog : false, (r38 & 512) != 0 ? r22.isSprayForDialog : false, (r38 & 1024) != 0 ? r22.rewardNameForDialog : null, (r38 & 2048) != 0 ? r22.idForDialog : 0, (r38 & 4096) != 0 ? r22.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r22.sprayTextForDialog : null, (r38 & 16384) != 0 ? r22.filterState : 0, (r38 & 32768) != 0 ? r22.isHasTanpin : false, (r38 & 65536) != 0 ? r22.isTutorialEnabled : false, (r38 & 131072) != 0 ? r22.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r22.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
                    } while (!mutableStateFlow.compareAndSet(value, copy));
                } else {
                    BpRewardsViewModel bpRewardsViewModel2 = this.this$0;
                    JSONObject jSONObject2 = this.$json;
                    this.label = 2;
                    parseJsonAndGetListOfItems2 = bpRewardsViewModel2.parseJsonAndGetListOfItems(jSONObject2, (r19 & 2) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes() : null, (r19 & 4) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson() : null, (r19 & 8) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getVehiclesList() : null, (r19 & 16) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getBpRewardsLists().getSkinsList() : null, (r19 & 32) != 0 ? bpRewardsViewModel2.get_uiState().getValue().getSizeOfImage() : 0, (r19 & 64) != 0 ? false : true, this);
                    if (parseJsonAndGetListOfItems2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (optInt == 4) {
                BpRewardsViewModel bpRewardsViewModel3 = this.this$0;
                ViewModelExtensionKt.launchOnIO$default(bpRewardsViewModel3, null, new AnonymousClass2(this.$json, bpRewardsViewModel3, null), 1, null);
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1$2", f = "BpRewardsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n230#2,5:747\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1$2\n*L\n277#1:737,5\n287#1:742,5\n299#1:747,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ BpRewardsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = bpRewardsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List parseAlarmsForFilterButtons;
            List removeItemFromList;
            BpRewardsUiState value;
            BpRewardsUiState copy;
            BpRewardsActionWithJSON bpRewardsActionWithJSON;
            BpRewardsUiState value2;
            BpRewardsUiState copy2;
            BpRewardsUiState value3;
            BpRewardsUiState copy3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int optInt = this.$json.optInt("s");
            parseAlarmsForFilterButtons = this.this$0.parseAlarmsForFilterButtons(this.$json);
            if (optInt == 1 || optInt == 3) {
                removeItemFromList = this.this$0.removeItemFromList(this.$json.optInt("id"));
                if (removeItemFromList.size() < 12) {
                    bpRewardsActionWithJSON = this.this$0.actionWithJSON;
                    bpRewardsActionWithJSON.sendRequestForNewItemsIfLessTwelve();
                    BpRewardsLists copy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, removeItemFromList, null, null, parseAlarmsForFilterButtons, null, null, 109, null);
                    MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow.getValue();
                        copy2 = r14.copy((r38 & 1) != 0 ? r14.isBpRewardsScreen : false, (r38 & 2) != 0 ? r14.annotatedText : null, (r38 & 4) != 0 ? r14.bpRewardsLists : copy$default, (r38 & 8) != 0 ? r14.imagesForFilterList : null, (r38 & 16) != 0 ? r14.topHintList : null, (r38 & 32) != 0 ? r14.bottomHintList : null, (r38 & 64) != 0 ? r14.refreshButtonBitmap : null, (r38 & 128) != 0 ? r14.sizeOfImage : 0, (r38 & 256) != 0 ? r14.isNeedToShowDialog : false, (r38 & 512) != 0 ? r14.isSprayForDialog : false, (r38 & 1024) != 0 ? r14.rewardNameForDialog : null, (r38 & 2048) != 0 ? r14.idForDialog : 0, (r38 & 4096) != 0 ? r14.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r14.sprayTextForDialog : null, (r38 & 16384) != 0 ? r14.filterState : 0, (r38 & 32768) != 0 ? r14.isHasTanpin : false, (r38 & 65536) != 0 ? r14.isTutorialEnabled : false, (r38 & 131072) != 0 ? r14.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r14.isScreenBlocked : false, (r38 & 524288) != 0 ? value2.isNeedClose : false);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                } else {
                    BpRewardsLists copy$default2 = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, removeItemFromList, null, null, parseAlarmsForFilterButtons, null, null, 109, null);
                    MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r14.copy((r38 & 1) != 0 ? r14.isBpRewardsScreen : false, (r38 & 2) != 0 ? r14.annotatedText : null, (r38 & 4) != 0 ? r14.bpRewardsLists : copy$default2, (r38 & 8) != 0 ? r14.imagesForFilterList : null, (r38 & 16) != 0 ? r14.topHintList : null, (r38 & 32) != 0 ? r14.bottomHintList : null, (r38 & 64) != 0 ? r14.refreshButtonBitmap : null, (r38 & 128) != 0 ? r14.sizeOfImage : 0, (r38 & 256) != 0 ? r14.isNeedToShowDialog : false, (r38 & 512) != 0 ? r14.isSprayForDialog : false, (r38 & 1024) != 0 ? r14.rewardNameForDialog : null, (r38 & 2048) != 0 ? r14.idForDialog : 0, (r38 & 4096) != 0 ? r14.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r14.sprayTextForDialog : null, (r38 & 16384) != 0 ? r14.filterState : 0, (r38 & 32768) != 0 ? r14.isHasTanpin : false, (r38 & 65536) != 0 ? r14.isTutorialEnabled : false, (r38 & 131072) != 0 ? r14.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r14.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                }
            } else {
                BpRewardsLists copy$default3 = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, null, null, null, parseAlarmsForFilterButtons, null, null, 111, null);
                MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow3.getValue();
                    copy3 = r14.copy((r38 & 1) != 0 ? r14.isBpRewardsScreen : false, (r38 & 2) != 0 ? r14.annotatedText : null, (r38 & 4) != 0 ? r14.bpRewardsLists : copy$default3, (r38 & 8) != 0 ? r14.imagesForFilterList : null, (r38 & 16) != 0 ? r14.topHintList : null, (r38 & 32) != 0 ? r14.bottomHintList : null, (r38 & 64) != 0 ? r14.refreshButtonBitmap : null, (r38 & 128) != 0 ? r14.sizeOfImage : 0, (r38 & 256) != 0 ? r14.isNeedToShowDialog : false, (r38 & 512) != 0 ? r14.isSprayForDialog : false, (r38 & 1024) != 0 ? r14.rewardNameForDialog : null, (r38 & 2048) != 0 ? r14.idForDialog : 0, (r38 & 4096) != 0 ? r14.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r14.sprayTextForDialog : null, (r38 & 16384) != 0 ? r14.filterState : 0, (r38 & 32768) != 0 ? r14.isHasTanpin : false, (r38 & 65536) != 0 ? r14.isTutorialEnabled : false, (r38 & 131072) != 0 ? r14.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r14.isScreenBlocked : false, (r38 & 524288) != 0 ? value3.isNeedClose : false);
                } while (!mutableStateFlow3.compareAndSet(value3, copy3));
            }
            return Unit.INSTANCE;
        }
    }
}
