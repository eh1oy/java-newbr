package com.blackhub.bronline.game.gui.taxi;

import android.text.SpannedString;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
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

/* compiled from: TaxiViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$updateJson$1", f = "TaxiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$updateJson$1\n*L\n77#1:133,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TaxiViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TaxiViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiViewModel$updateJson$1(JSONObject jSONObject, TaxiViewModel taxiViewModel, Continuation<? super TaxiViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = taxiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TaxiViewModel$updateJson$1 taxiViewModel$updateJson$1 = new TaxiViewModel$updateJson$1(this.$json, this.this$0, continuation);
        taxiViewModel$updateJson$1.L$0 = obj;
        return taxiViewModel$updateJson$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TaxiViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TaxiUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        String optString = this.$json.optString("t", AnyExtensionKt.empty(coroutineScope));
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        if (optString.length() == 0) {
            return Unit.INSTANCE;
        }
        String optString2 = this.$json.optString("s", AnyExtensionKt.empty(coroutineScope));
        String optString3 = this.$json.optString("e", AnyExtensionKt.empty(coroutineScope));
        String optString4 = this.$json.optString("d", AnyExtensionKt.empty(coroutineScope));
        String optString5 = this.$json.optString("ti", AnyExtensionKt.empty(coroutineScope));
        String optString6 = this.$json.optString("m", AnyExtensionKt.empty(coroutineScope));
        String optString7 = this.$json.optString("ty", AnyExtensionKt.empty(coroutineScope));
        String optString8 = this.$json.optString("co", AnyExtensionKt.empty(coroutineScope));
        Intrinsics.checkNotNull(optString8);
        boolean z = optString8.length() > 0;
        MutableStateFlow<? extends TaxiUiState> mutableStateFlow = this.this$0.get_uiState();
        TaxiViewModel taxiViewModel = this.this$0;
        while (true) {
            TaxiUiState value = mutableStateFlow.getValue();
            StringResource stringResource = taxiViewModel.getStringResource();
            Intrinsics.checkNotNull(optString2);
            SpannedString taxiStartPoint = stringResource.taxiStartPoint(optString2);
            StringResource stringResource2 = taxiViewModel.getStringResource();
            Intrinsics.checkNotNull(optString3);
            SpannedString taxiEndPoint = stringResource2.taxiEndPoint(optString3);
            StringResource stringResource3 = taxiViewModel.getStringResource();
            Intrinsics.checkNotNull(optString4);
            SpannedString taxiDistance = stringResource3.taxiDistance(optString4);
            StringResource stringResource4 = taxiViewModel.getStringResource();
            Intrinsics.checkNotNull(optString5);
            SpannedString taxiTime = stringResource4.taxiTime(optString5);
            String str = optString2;
            StringResource stringResource5 = taxiViewModel.getStringResource();
            Intrinsics.checkNotNull(optString6);
            String taxiPrice = stringResource5.taxiPrice(optString6);
            Intrinsics.checkNotNull(optString7);
            TaxiViewModel taxiViewModel2 = taxiViewModel;
            copy = r10.copy((r28 & 1) != 0 ? r10.brTaxiStart : taxiStartPoint, (r28 & 2) != 0 ? r10.brTaxiEnd : taxiEndPoint, (r28 & 4) != 0 ? r10.brTaxiDist : taxiDistance, (r28 & 8) != 0 ? r10.brTaxiTime : taxiTime, (r28 & 16) != 0 ? r10.comment : optString8, (r28 & 32) != 0 ? r10.brTaxiPrice : taxiPrice, (r28 & 64) != 0 ? r10.brTaxiTypeText : optString7, (r28 & 128) != 0 ? r10.brTaxiRating : null, (r28 & 256) != 0 ? r10.brTaxiCountOrders : null, (r28 & 512) != 0 ? r10.brTaxiCash : null, (r28 & 1024) != 0 ? r10.isHasComment : z, (r28 & 2048) != 0 ? r10.isCommentVisible : false, (r28 & 4096) != 0 ? value.isNeedClose : false);
            if (mutableStateFlow.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            optString2 = str;
            taxiViewModel = taxiViewModel2;
        }
    }
}
