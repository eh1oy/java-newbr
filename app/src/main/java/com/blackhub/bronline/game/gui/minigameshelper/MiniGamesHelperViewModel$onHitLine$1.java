package com.blackhub.bronline.game.gui.minigameshelper;

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
/* compiled from: MiniGamesHelperViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onHitLine$1", f = "MiniGamesHelperViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onHitLine$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onHitLine$1\n*L\n172#1:176,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MiniGamesHelperViewModel$onHitLine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isHit;
    public int label;
    public final /* synthetic */ MiniGamesHelperViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGamesHelperViewModel$onHitLine$1(boolean z, MiniGamesHelperViewModel miniGamesHelperViewModel, Continuation<? super MiniGamesHelperViewModel$onHitLine$1> continuation) {
        super(2, continuation);
        this.$isHit = z;
        this.this$0 = miniGamesHelperViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MiniGamesHelperViewModel$onHitLine$1(this.$isHit, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MiniGamesHelperViewModel$onHitLine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MiniGamesHelperWithJSON miniGamesHelperWithJSON;
        MiniGamesHelperWithJSON miniGamesHelperWithJSON2;
        MiniGamesHelperUiState value;
        MiniGamesHelperUiState copy;
        MiniGamesHelperWithJSON miniGamesHelperWithJSON3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isHit) {
            miniGamesHelperWithJSON3 = this.this$0.actionWithJSON;
            miniGamesHelperWithJSON3.sendLineHit();
        } else {
            miniGamesHelperWithJSON = this.this$0.actionWithJSON;
            miniGamesHelperWithJSON.sendLineNotHit();
        }
        miniGamesHelperWithJSON2 = this.this$0.actionWithJSON;
        miniGamesHelperWithJSON2.sendCloseScreen();
        MutableStateFlow<? extends MiniGamesHelperUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r30 & 1) != 0 ? r3.helperType : null, (r30 & 2) != 0 ? r3.prizeHeader : null, (r30 & 4) != 0 ? r3.prizeImage : null, (r30 & 8) != 0 ? r3.congratulatoryText : null, (r30 & 16) != 0 ? r3.currentProgressBarStatus : 0, (r30 & 32) != 0 ? r3.maxValue : 0, (r30 & 64) != 0 ? r3.maxProgressBarValue : 0, (r30 & 128) != 0 ? r3.progressBarTitle : null, (r30 & 256) != 0 ? r3.tick : 0, (r30 & 512) != 0 ? r3.timer : 0L, (r30 & 1024) != 0 ? r3.randomNum : 0, (r30 & 2048) != 0 ? r3.isNeedToShowClose : false, (r30 & 4096) != 0 ? value.isNeedClose : true);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
