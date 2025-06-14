package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerUiState;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
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
/* compiled from: BlackPassBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$sendButtonClicked$1", f = "BlackPassBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$sendButtonClicked$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,125:1\n230#2,5:126\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$sendButtonClicked$1\n*L\n93#1:126,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassBannerViewModel$sendButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $action;
    public int label;
    public final /* synthetic */ BlackPassBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerViewModel$sendButtonClicked$1(BlackPassBannerViewModel blackPassBannerViewModel, int i, Continuation<? super BlackPassBannerViewModel$sendButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassBannerViewModel;
        this.$action = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerViewModel$sendButtonClicked$1(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassBannerViewModel$sendButtonClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BlackPassBannerActionsWithJson blackPassBannerActionsWithJson;
        BlackPassBannerUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            blackPassBannerActionsWithJson = this.this$0.actionsWithJson;
            blackPassBannerActionsWithJson.clickOnButton(this.$action);
            MutableStateFlow<? extends BlackPassBannerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, BlackPassBannerUiState.copy$default(value, null, null, null, null, 0, null, true, 63, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
