package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
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
/* compiled from: ChangeBulbViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initPreferences$1", f = "ChangeBulbViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initPreferences$1\n*L\n103#1:112,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChangeBulbViewModel$initPreferences$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ChangeBulbViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeBulbViewModel$initPreferences$1(ChangeBulbViewModel changeBulbViewModel, Continuation<? super ChangeBulbViewModel$initPreferences$1> continuation) {
        super(2, continuation);
        this.this$0 = changeBulbViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChangeBulbViewModel$initPreferences$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChangeBulbViewModel$initPreferences$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PreferencesRepository preferencesRepository;
        ChangeBulbUiState value;
        ChangeBulbUiState copy;
        PreferencesRepository preferencesRepository2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preferencesRepository = this.this$0.preferencesRepository;
            boolean z = false;
            if (PreferencesRepository.getInteger$default(preferencesRepository, ElectricConstants.CHANGE_BULB_PREFERENCES, 0, 2, null) == -1) {
                preferencesRepository2 = this.this$0.preferencesRepository;
                z = true;
                preferencesRepository2.putInteger(ElectricConstants.CHANGE_BULB_PREFERENCES, 1);
            }
            MutableStateFlow<? extends ChangeBulbUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r18 & 1) != 0 ? r6.instructionsAndHints : null, (r18 & 2) != 0 ? r6.isHintShow : z, (r18 & 4) != 0 ? r6.isHandShow : false, (r18 & 8) != 0 ? r6.countHint : 0, (r18 & 16) != 0 ? r6.isBulbBrokeVisible : false, (r18 & 32) != 0 ? r6.isBulbFullVisible : false, (r18 & 64) != 0 ? r6.isFirstGame : z, (r18 & 128) != 0 ? value.isWin : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
