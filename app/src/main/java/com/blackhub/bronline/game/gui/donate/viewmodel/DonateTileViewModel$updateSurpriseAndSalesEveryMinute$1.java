package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DonateTileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1", f = "DonateTileViewModel.kt", i = {0}, l = {466}, m = "invokeSuspend", n = {"saleItems"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public Object L$0;
    public int label;
    public final /* synthetic */ DonateTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1(DonateTileViewModel donateTileViewModel, JSONObject jSONObject, Continuation<? super DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1> continuation) {
        super(2, continuation);
        this.this$0 = donateTileViewModel;
        this.$jsonObject = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1(this.this$0, this.$jsonObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object checkAndUpdateCurrentItems;
        List list;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.mutableSaleItems;
            List list2 = (List) mutableStateFlow.getValue();
            if (!list2.isEmpty()) {
                ((DonateItem) list2.get(0)).setSaleTime(this.$jsonObject.optInt("p"));
                JSONArray optJSONArray = this.$jsonObject.optJSONArray("s");
                this.this$0.lUpdateSaleTime(optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null, list2);
                DonateTileViewModel donateTileViewModel = this.this$0;
                this.L$0 = list2;
                this.label = 1;
                checkAndUpdateCurrentItems = donateTileViewModel.checkAndUpdateCurrentItems(list2, this);
                if (checkAndUpdateCurrentItems == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$0;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow2 = this.this$0.mutableSaleItems;
        mutableStateFlow2.setValue(list);
        return Unit.INSTANCE;
    }
}
