package com.blackhub.bronline.game.gui.tuning.adapters;

import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningDetailItemBinding;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningVinylsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$ViewHolder$bind$1$2", f = "TuningVinylsAdapter.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TuningVinylsAdapter$ViewHolder$bind$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TuneVinylsObj $item;
    public final /* synthetic */ TuningDetailItemBinding $this_with;
    public int label;
    public final /* synthetic */ TuningVinylsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningVinylsAdapter$ViewHolder$bind$1$2(TuningVinylsAdapter tuningVinylsAdapter, TuneVinylsObj tuneVinylsObj, TuningDetailItemBinding tuningDetailItemBinding, Continuation<? super TuningVinylsAdapter$ViewHolder$bind$1$2> continuation) {
        super(2, continuation);
        this.this$0 = tuningVinylsAdapter;
        this.$item = tuneVinylsObj;
        this.$this_with = tuningDetailItemBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningVinylsAdapter$ViewHolder$bind$1$2(this.this$0, this.$item, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningVinylsAdapter$ViewHolder$bind$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningDetailsListViewModel tuningDetailsListViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tuningDetailsListViewModel = this.this$0.detailsListViewModel;
            SharedFlow<Integer> newVinylCost = tuningDetailsListViewModel.getNewVinylCost();
            final TuneVinylsObj tuneVinylsObj = this.$item;
            final TuningDetailItemBinding tuningDetailItemBinding = this.$this_with;
            FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter$ViewHolder$bind$1$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                    String priceWithSpaces = UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2));
                    if (!TuneVinylsObj.this.getStartVinyl()) {
                        tuningDetailItemBinding.valueCost.setText(priceWithSpaces);
                        tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_gold_in_details);
                    } else {
                        tuningDetailItemBinding.valueCost.setText(R.string.tuning_set_detail);
                        tuningDetailItemBinding.iconValueCost.setImageResource(R.drawable.tuning_icon_check_in_details);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (newVinylCost.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
