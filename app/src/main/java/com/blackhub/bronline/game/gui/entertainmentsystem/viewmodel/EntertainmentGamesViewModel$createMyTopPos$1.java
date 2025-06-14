package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.NickAndTopPosAndGamePointerForCurrentPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: EntertainmentGamesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$createMyTopPos$1", f = "EntertainmentGamesViewModel.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class EntertainmentGamesViewModel$createMyTopPos$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Integer $gameId;
    public int label;
    public final /* synthetic */ EntertainmentGamesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntertainmentGamesViewModel$createMyTopPos$1(EntertainmentGamesViewModel entertainmentGamesViewModel, Integer num, Continuation<? super EntertainmentGamesViewModel$createMyTopPos$1> continuation) {
        super(2, continuation);
        this.this$0 = entertainmentGamesViewModel;
        this.$gameId = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new EntertainmentGamesViewModel$createMyTopPos$1(this.this$0, this.$gameId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((EntertainmentGamesViewModel$createMyTopPos$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        String str;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0.mutableInfoAboutCurrentPLayer;
            this.label = 1;
            obj = FlowKt.first(mutableSharedFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer = (NickAndTopPosAndGamePointerForCurrentPlayer) obj;
        int intValue = this.$gameId == null ? 999 : nickAndTopPosAndGamePointerForCurrentPlayer.getTopPos().get(this.$gameId.intValue()).intValue();
        if (this.$gameId == null || nickAndTopPosAndGamePointerForCurrentPlayer.getGamePointer().get(this.$gameId.intValue()).intValue() == 0) {
            str = "-";
        } else {
            str = String.valueOf(nickAndTopPosAndGamePointerForCurrentPlayer.getGamePointer().get(this.$gameId.intValue()).intValue());
        }
        String str2 = str;
        mutableStateFlow = this.this$0.mutableCurrentPlayerTop;
        String nick = nickAndTopPosAndGamePointerForCurrentPlayer.getNick();
        Integer num = this.$gameId;
        mutableStateFlow.setValue(CollectionsKt__CollectionsJVMKt.listOf(new EntertainmentPlayersData(intValue, nick, num != null ? num.intValue() : 0, str2, 0, 0)));
        return Unit.INSTANCE;
    }
}
