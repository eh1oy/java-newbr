package com.blackhub.bronline.game.gui.bprewards;

import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsLists;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1", f = "BpRewardsViewModel.kt", i = {0, 0}, l = {327}, m = "invokeSuspend", n = {"rewardNameForDialog", "newListWithItems"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onItemClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onItemClick$1\n*L\n335#1:737,5\n348#1:742,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$onItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $id;
    public final /* synthetic */ String $itemNameForDialog;
    public final /* synthetic */ Integer $sprayPriceForDialog;
    public final /* synthetic */ int $typeOfClickedButton;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$onItemClick$1(String str, int i, BpRewardsViewModel bpRewardsViewModel, int i2, Integer num, Continuation<? super BpRewardsViewModel$onItemClick$1> continuation) {
        super(2, continuation);
        this.$itemNameForDialog = str;
        this.$typeOfClickedButton = i;
        this.this$0 = bpRewardsViewModel;
        this.$id = i2;
        this.$sprayPriceForDialog = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BpRewardsViewModel$onItemClick$1(this.$itemNameForDialog, this.$typeOfClickedButton, this.this$0, this.$id, this.$sprayPriceForDialog, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BpRewardsViewModel$onItemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BpRewardsUiState copy;
        List removeAlarmFromItem;
        String str;
        List list;
        BpRewardsUiState value;
        BpRewardsUiState copy2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$itemNameForDialog;
            String string = str2 != null ? this.this$0.getStringResource().getString(R.string.bp_rewards_dialog_item_name_question_mark, str2) : null;
            if (this.$typeOfClickedButton == 2) {
                BpRewardsViewModel bpRewardsViewModel = this.this$0;
                removeAlarmFromItem = bpRewardsViewModel.removeAlarmFromItem(this.$id, CollectionsKt___CollectionsKt.toMutableList((Collection) bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getListWithItems()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, this.$typeOfClickedButton, null);
                this.L$0 = string;
                this.L$1 = removeAlarmFromItem;
                this.label = 1;
                if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = string;
                list = removeAlarmFromItem;
            } else {
                AnnotatedString htmlTextToAnnotatedString = this.$sprayPriceForDialog != null ? StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.bp_rewards_u_will_have_n_spray, this.$sprayPriceForDialog)) : null;
                MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                int i2 = this.$typeOfClickedButton;
                int i3 = this.$id;
                while (true) {
                    BpRewardsUiState value2 = mutableStateFlow.getValue();
                    int i4 = i3;
                    int i5 = i2;
                    copy = r16.copy((r38 & 1) != 0 ? r16.isBpRewardsScreen : false, (r38 & 2) != 0 ? r16.annotatedText : null, (r38 & 4) != 0 ? r16.bpRewardsLists : null, (r38 & 8) != 0 ? r16.imagesForFilterList : null, (r38 & 16) != 0 ? r16.topHintList : null, (r38 & 32) != 0 ? r16.bottomHintList : null, (r38 & 64) != 0 ? r16.refreshButtonBitmap : null, (r38 & 128) != 0 ? r16.sizeOfImage : 0, (r38 & 256) != 0 ? r16.isNeedToShowDialog : true, (r38 & 512) != 0 ? r16.isSprayForDialog : i2 == 3 ? z : false, (r38 & 1024) != 0 ? r16.rewardNameForDialog : string, (r38 & 2048) != 0 ? r16.idForDialog : i4, (r38 & 4096) != 0 ? r16.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r16.sprayTextForDialog : htmlTextToAnnotatedString, (r38 & 16384) != 0 ? r16.filterState : 0, (r38 & 32768) != 0 ? r16.isHasTanpin : false, (r38 & 65536) != 0 ? r16.isTutorialEnabled : false, (r38 & 131072) != 0 ? r16.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r16.isScreenBlocked : false, (r38 & 524288) != 0 ? value2.isNeedClose : false);
                    if (mutableStateFlow.compareAndSet(value2, copy)) {
                        break;
                    }
                    i3 = i4;
                    i2 = i5;
                    z = true;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) this.L$1;
            String str3 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            list = list2;
            str = str3;
        }
        BpRewardsLists copy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, list, null, null, null, null, null, 125, null);
        MutableStateFlow<? extends BpRewardsUiState> mutableStateFlow2 = this.this$0.get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            copy2 = r9.copy((r38 & 1) != 0 ? r9.isBpRewardsScreen : false, (r38 & 2) != 0 ? r9.annotatedText : null, (r38 & 4) != 0 ? r9.bpRewardsLists : copy$default, (r38 & 8) != 0 ? r9.imagesForFilterList : null, (r38 & 16) != 0 ? r9.topHintList : null, (r38 & 32) != 0 ? r9.bottomHintList : null, (r38 & 64) != 0 ? r9.refreshButtonBitmap : null, (r38 & 128) != 0 ? r9.sizeOfImage : 0, (r38 & 256) != 0 ? r9.isNeedToShowDialog : false, (r38 & 512) != 0 ? r9.isSprayForDialog : false, (r38 & 1024) != 0 ? r9.rewardNameForDialog : str, (r38 & 2048) != 0 ? r9.idForDialog : 0, (r38 & 4096) != 0 ? r9.sprayPriceForDialog : null, (r38 & 8192) != 0 ? r9.sprayTextForDialog : null, (r38 & 16384) != 0 ? r9.filterState : 0, (r38 & 32768) != 0 ? r9.isHasTanpin : false, (r38 & 65536) != 0 ? r9.isTutorialEnabled : false, (r38 & 131072) != 0 ? r9.isButtonFilterBlocked : false, (r38 & 262144) != 0 ? r9.isScreenBlocked : false, (r38 & 524288) != 0 ? value.isNeedClose : false);
        } while (!mutableStateFlow2.compareAndSet(value, copy2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1$1", f = "BpRewardsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $id;
        public final /* synthetic */ int $typeOfClickedButton;
        public int label;
        public final /* synthetic */ BpRewardsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BpRewardsViewModel bpRewardsViewModel, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bpRewardsViewModel;
            this.$id = i;
            this.$typeOfClickedButton = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$id, this.$typeOfClickedButton, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BpRewardsActionWithJSON bpRewardsActionWithJSON;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                bpRewardsActionWithJSON = this.this$0.actionWithJSON;
                bpRewardsActionWithJSON.sendOnItemPressed(this.$id, this.$typeOfClickedButton);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
