package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
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
/* compiled from: RaiseChargeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initPreferences$1", f = "RaiseChargeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initPreferences$1\n*L\n141#1:149,5\n*E\n"})
/* loaded from: classes3.dex */
public final class RaiseChargeViewModel$initPreferences$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ RaiseChargeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaiseChargeViewModel$initPreferences$1(RaiseChargeViewModel raiseChargeViewModel, Continuation<? super RaiseChargeViewModel$initPreferences$1> continuation) {
        super(2, continuation);
        this.this$0 = raiseChargeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RaiseChargeViewModel$initPreferences$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RaiseChargeViewModel$initPreferences$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PreferencesRepository preferencesRepository;
        RaiseChargeUiState value;
        RaiseChargeUiState copy;
        PreferencesRepository preferencesRepository2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preferencesRepository = this.this$0.preferencesRepository;
            boolean z = false;
            if (PreferencesRepository.getInteger$default(preferencesRepository, ElectricConstants.RAISE_CHARGE_PREFERENCES, 0, 2, null) == -1) {
                preferencesRepository2 = this.this$0.preferencesRepository;
                z = true;
                preferencesRepository2.putInteger(ElectricConstants.RAISE_CHARGE_PREFERENCES, 1);
            }
            MutableStateFlow<? extends RaiseChargeUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r20 & 1) != 0 ? r6.instructionsAndHints : null, (r20 & 2) != 0 ? r6.gameInstructionsItemList : null, (r20 & 4) != 0 ? r6.isInstructionsShow : false, (r20 & 8) != 0 ? r6.isHintShow : false, (r20 & 16) != 0 ? r6.isHandShow : false, (r20 & 32) != 0 ? r6.countHint : 0, (r20 & 64) != 0 ? r6.isFirstGame : z, (r20 & 128) != 0 ? r6.isWin : null, (r20 & 256) != 0 ? value.count : 0);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
