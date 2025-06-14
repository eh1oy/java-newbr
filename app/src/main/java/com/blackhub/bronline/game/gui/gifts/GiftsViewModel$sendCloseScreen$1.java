package com.blackhub.bronline.game.gui.gifts;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
/* compiled from: GiftsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendCloseScreen$1", f = "GiftsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendCloseScreen$1\n*L\n264#1:464,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsViewModel$sendCloseScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GiftsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftsViewModel$sendCloseScreen$1(GiftsViewModel giftsViewModel, Continuation<? super GiftsViewModel$sendCloseScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = giftsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GiftsViewModel$sendCloseScreen$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GiftsViewModel$sendCloseScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        GiftsActionWithJSON giftsActionWithJSON;
        GiftsUiState value;
        GiftsUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            giftsActionWithJSON = this.this$0.actionWithJSON;
            giftsActionWithJSON.sendCloseScreen();
            MutableStateFlow<? extends GiftsUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r39 & 1) != 0 ? r3.eventId : 0, (r39 & 2) != 0 ? r3.screen : 0, (r39 & 4) != 0 ? r3.bgImage : null, (r39 & 8) != 0 ? r3.valueOfBC : 0, (r39 & 16) != 0 ? r3.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r3.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r3.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r3.standardGifts : null, (r39 & 256) != 0 ? r3.legendaryGifts : null, (r39 & 512) != 0 ? r3.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r3.isOpeningBox : false, (r39 & 2048) != 0 ? r3.giftFirst : null, (r39 & 4096) != 0 ? r3.giftSecond : null, (r39 & 8192) != 0 ? r3.isStandard : false, (r39 & 16384) != 0 ? r3.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r3.isButtonGetVisible : false, (r39 & 65536) != 0 ? r3.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r3.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r3.isNeedClose : true, (r39 & 524288) != 0 ? r3.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
