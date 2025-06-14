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
import org.json.JSONObject;

/* compiled from: PlatesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$initCurrencyType$1", f = "PlatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$initCurrencyType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$initCurrencyType$1\n*L\n41#1:141,5\n*E\n"})
/* loaded from: classes3.dex */
public final class PlatesViewModel$initCurrencyType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ PlatesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatesViewModel$initCurrencyType$1(JSONObject jSONObject, PlatesViewModel platesViewModel, Continuation<? super PlatesViewModel$initCurrencyType$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = platesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PlatesViewModel$initCurrencyType$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PlatesViewModel$initCurrencyType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PlatesUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.$json.optInt("t") == 0;
        MutableStateFlow<? extends PlatesUiState> mutableStateFlow = this.this$0.get_uiState();
        JSONObject jSONObject = this.$json;
        PlatesViewModel platesViewModel = this.this$0;
        while (true) {
            PlatesUiState value = mutableStateFlow.getValue();
            PlatesViewModel platesViewModel2 = platesViewModel;
            JSONObject jSONObject2 = jSONObject;
            MutableStateFlow<? extends PlatesUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r3.copy((r22 & 1) != 0 ? r3.countryId : 0, (r22 & 2) != 0 ? r3.plateNumber : null, (r22 & 4) != 0 ? r3.plateRegion : null, (r22 & 8) != 0 ? r3.hintMainText : platesViewModel.getStringResource().platesMainHint(), (r22 & 16) != 0 ? r3.currencyType : jSONObject.optInt("t"), (r22 & 32) != 0 ? r3.priceOfPurchasePlate : 0, (r22 & 64) != 0 ? r3.priceOfRefreshPlate : 0, (r22 & 128) != 0 ? r3.isNeedShowRefresh : z, (r22 & 256) != 0 ? r3.isNewPlateInfoFromServer : z, (r22 & 512) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
            jSONObject = jSONObject2;
            platesViewModel = platesViewModel2;
        }
    }
}
