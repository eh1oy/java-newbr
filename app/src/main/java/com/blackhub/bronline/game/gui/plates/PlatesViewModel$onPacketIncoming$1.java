package com.blackhub.bronline.game.gui.plates;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: PlatesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$onPacketIncoming$1", f = "PlatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onPacketIncoming$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n230#2,5:146\n230#2,5:151\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onPacketIncoming$1\n*L\n56#1:141,5\n65#1:146,5\n73#1:151,5\n*E\n"})
/* loaded from: classes3.dex */
public final class PlatesViewModel$onPacketIncoming$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ PlatesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatesViewModel$onPacketIncoming$1(JSONObject jSONObject, PlatesViewModel platesViewModel, Continuation<? super PlatesViewModel$onPacketIncoming$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = platesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PlatesViewModel$onPacketIncoming$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PlatesViewModel$onPacketIncoming$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PlatesUiState value;
        PlatesUiState copy;
        PlatesUiState value2;
        PlatesUiState copy2;
        PlatesUiState value3;
        PlatesUiState copy3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt("t");
        if (optInt == 0) {
            MutableStateFlow<? extends PlatesUiState> mutableStateFlow = this.this$0.get_uiState();
            JSONObject jSONObject = this.$json;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r22 & 1) != 0 ? r5.countryId : 0, (r22 & 2) != 0 ? r5.plateNumber : null, (r22 & 4) != 0 ? r5.plateRegion : null, (r22 & 8) != 0 ? r5.hintMainText : null, (r22 & 16) != 0 ? r5.currencyType : 0, (r22 & 32) != 0 ? r5.priceOfPurchasePlate : jSONObject.optInt("p"), (r22 & 64) != 0 ? r5.priceOfRefreshPlate : jSONObject.optInt("pr"), (r22 & 128) != 0 ? r5.isNeedShowRefresh : false, (r22 & 256) != 0 ? r5.isNewPlateInfoFromServer : false, (r22 & 512) != 0 ? value.isNeedClose : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        } else if (optInt == 1) {
            MutableStateFlow<? extends PlatesUiState> mutableStateFlow2 = this.this$0.get_uiState();
            JSONObject jSONObject2 = this.$json;
            do {
                value2 = mutableStateFlow2.getValue();
                String optString = jSONObject2.optString("h");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                copy2 = r5.copy((r22 & 1) != 0 ? r5.countryId : 0, (r22 & 2) != 0 ? r5.plateNumber : null, (r22 & 4) != 0 ? r5.plateRegion : null, (r22 & 8) != 0 ? r5.hintMainText : optString, (r22 & 16) != 0 ? r5.currencyType : 0, (r22 & 32) != 0 ? r5.priceOfPurchasePlate : 0, (r22 & 64) != 0 ? r5.priceOfRefreshPlate : 0, (r22 & 128) != 0 ? r5.isNeedShowRefresh : false, (r22 & 256) != 0 ? r5.isNewPlateInfoFromServer : false, (r22 & 512) != 0 ? value2.isNeedClose : false);
            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        } else if (optInt == 2) {
            MutableStateFlow<? extends PlatesUiState> mutableStateFlow3 = this.this$0.get_uiState();
            JSONObject jSONObject3 = this.$json;
            PlatesViewModel platesViewModel = this.this$0;
            do {
                value3 = mutableStateFlow3.getValue();
                String optString2 = jSONObject3.optString("p");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                String optString3 = jSONObject3.optString("r");
                Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                copy3 = r7.copy((r22 & 1) != 0 ? r7.countryId : 0, (r22 & 2) != 0 ? r7.plateNumber : optString2, (r22 & 4) != 0 ? r7.plateRegion : optString3, (r22 & 8) != 0 ? r7.hintMainText : platesViewModel.getStringResource().platesMainHint(), (r22 & 16) != 0 ? r7.currencyType : 0, (r22 & 32) != 0 ? r7.priceOfPurchasePlate : 0, (r22 & 64) != 0 ? r7.priceOfRefreshPlate : 0, (r22 & 128) != 0 ? r7.isNeedShowRefresh : false, (r22 & 256) != 0 ? r7.isNewPlateInfoFromServer : false, (r22 & 512) != 0 ? value3.isNeedClose : false);
            } while (!mutableStateFlow3.compareAndSet(value3, copy3));
        }
        return Unit.INSTANCE;
    }
}
