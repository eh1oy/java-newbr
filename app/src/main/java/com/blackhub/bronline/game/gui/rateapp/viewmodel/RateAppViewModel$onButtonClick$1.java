package com.blackhub.bronline.game.gui.rateapp.viewmodel;

import com.blackhub.bronline.game.gui.rateapp.RateAppUiState;
import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
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
/* compiled from: RateAppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onButtonClick$1", f = "RateAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n230#2,5:146\n230#2,5:151\n230#2,5:156\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onButtonClick$1\n*L\n65#1:146,5\n72#1:151,5\n87#1:156,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RateAppViewModel$onButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isLike;
    public int label;
    public final /* synthetic */ RateAppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppViewModel$onButtonClick$1(RateAppViewModel rateAppViewModel, boolean z, Continuation<? super RateAppViewModel$onButtonClick$1> continuation) {
        super(2, continuation);
        this.this$0 = rateAppViewModel;
        this.$isLike = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RateAppViewModel$onButtonClick$1(this.this$0, this.$isLike, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RateAppViewModel$onButtonClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RateAppActionWithJson rateAppActionWithJson;
        RateAppUiState value;
        RateAppAnalytics rateAppAnalytics;
        RateAppActionWithJson rateAppActionWithJson2;
        RateAppUiState value2;
        RateAppUiState value3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getUiState().getValue().isFiveStars()) {
            rateAppAnalytics = this.this$0.rateAppAnalytics;
            rateAppAnalytics.sendAnalyticsStarPressed(this.this$0.getUiState().getValue().getStarChecked(), this.this$0.getUiState().getValue().getCategoryDescription());
            rateAppActionWithJson2 = this.this$0.actionsWithJson;
            rateAppActionWithJson2.sendButtonPressed(2, this.this$0.getUiState().getValue().getStarChecked());
            if (this.this$0.getUiState().getValue().getStarChecked() == 5) {
                MutableStateFlow<? extends RateAppUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, RateAppUiState.copy$default(value3, null, 0, 0, false, false, true, true, 31, null)));
            } else {
                MutableStateFlow<? extends RateAppUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, RateAppUiState.copy$default(value2, null, 0, 0, false, false, false, true, 63, null)));
            }
        } else {
            boolean z = this.$isLike;
            int i = z ? 1 : 2;
            this.this$0.sendAnalyticsLikeDislikePressed(z);
            rateAppActionWithJson = this.this$0.actionsWithJson;
            rateAppActionWithJson.sendButtonPressed(1, i);
            MutableStateFlow<? extends RateAppUiState> mutableStateFlow3 = this.this$0.get_uiState();
            boolean z2 = this.$isLike;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, RateAppUiState.copy$default(value, null, 0, 0, false, false, z2, true, 31, null)));
        }
        return Unit.INSTANCE;
    }
}
