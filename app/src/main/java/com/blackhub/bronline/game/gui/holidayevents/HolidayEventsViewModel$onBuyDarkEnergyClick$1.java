package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.game.core.extension.StringExtensionKt;
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
/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onBuyDarkEnergyClick$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onBuyDarkEnergyClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n230#2,5:1303\n230#2,5:1308\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onBuyDarkEnergyClick$1\n*L\n852#1:1303,5\n860#1:1308,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$onBuyDarkEnergyClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$onBuyDarkEnergyClick$1(HolidayEventsViewModel holidayEventsViewModel, Continuation<? super HolidayEventsViewModel$onBuyDarkEnergyClick$1> continuation) {
        super(2, continuation);
        this.this$0 = holidayEventsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$onBuyDarkEnergyClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$onBuyDarkEnergyClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HolidayEventsActionsWithJSON holidayEventsActionsWithJSON;
        HolidayEventsUiState value;
        HolidayEventsUiState value2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HolidayEventsUiState value3 = this.this$0.getUiState().getValue();
        HolidayEventsViewModel holidayEventsViewModel = this.this$0;
        HolidayEventsUiState holidayEventsUiState = value3;
        int intOrZero = StringExtensionKt.toIntOrZero(holidayEventsUiState.getEnteredTextBuyDarkEnergy());
        if (holidayEventsUiState.getOfferCost() * intOrZero <= holidayEventsUiState.getBcValue()) {
            holidayEventsActionsWithJSON = holidayEventsViewModel.actionWithJSON;
            holidayEventsActionsWithJSON.sendBuyDarkEnergy(intOrZero);
            MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = holidayEventsViewModel.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 805306367, null)));
        } else {
            MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow2 = holidayEventsViewModel.get_uiState();
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, HolidayEventsUiState.m6942copyf2njTl4$default(value2, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, true, false, false, false, false, false, -1, 788529151, null)));
        }
        return Unit.INSTANCE;
    }
}
