package com.blackhub.bronline.game.gui.plates;

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
/* compiled from: PlatesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$changeCountry$1", f = "PlatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$changeCountry$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$changeCountry$1\n*L\n107#1:141,5\n*E\n"})
/* loaded from: classes3.dex */
public final class PlatesViewModel$changeCountry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $countryId;
    public int label;
    public final /* synthetic */ PlatesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatesViewModel$changeCountry$1(PlatesViewModel platesViewModel, int i, Continuation<? super PlatesViewModel$changeCountry$1> continuation) {
        super(2, continuation);
        this.this$0 = platesViewModel;
        this.$countryId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PlatesViewModel$changeCountry$1(this.this$0, this.$countryId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PlatesViewModel$changeCountry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PlatesActionWithJSON platesActionWithJSON;
        PlatesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            platesActionWithJSON = this.this$0.actionWithJSON;
            platesActionWithJSON.sendChangeCountry(this.$countryId);
            MutableStateFlow<? extends PlatesUiState> mutableStateFlow = this.this$0.get_uiState();
            PlatesViewModel platesViewModel = this.this$0;
            int i = this.$countryId;
            while (true) {
                PlatesUiState value = mutableStateFlow.getValue();
                int i2 = i;
                int i3 = i;
                copy = r3.copy((r22 & 1) != 0 ? r3.countryId : i2, (r22 & 2) != 0 ? r3.plateNumber : null, (r22 & 4) != 0 ? r3.plateRegion : null, (r22 & 8) != 0 ? r3.hintMainText : platesViewModel.getStringResource().platesMainHint(), (r22 & 16) != 0 ? r3.currencyType : 0, (r22 & 32) != 0 ? r3.priceOfPurchasePlate : 0, (r22 & 64) != 0 ? r3.priceOfRefreshPlate : 0, (r22 & 128) != 0 ? r3.isNeedShowRefresh : false, (r22 & 256) != 0 ? r3.isNewPlateInfoFromServer : false, (r22 & 512) != 0 ? value.isNeedClose : false);
                if (mutableStateFlow.compareAndSet(value, copy)) {
                    return Unit.INSTANCE;
                }
                i = i3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
