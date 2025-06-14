package com.blackhub.bronline.game.gui.donate.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DonateCarPreviewLayoutBinding;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonatePreviewCar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$3", f = "UILayoutDonatePreviewCar.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewCar$setDonateMainVMObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutDonatePreviewCar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonatePreviewCar$setDonateMainVMObservers$3(UILayoutDonatePreviewCar uILayoutDonatePreviewCar, Continuation<? super UILayoutDonatePreviewCar$setDonateMainVMObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonatePreviewCar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonatePreviewCar$setDonateMainVMObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonatePreviewCar$setDonateMainVMObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DonateMainViewModel donateMainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            donateMainViewModel = this.this$0.getDonateMainViewModel();
            StateFlow<DonateItem> currentItem = donateMainViewModel.getCurrentItem();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(currentItem, lifecycle, Lifecycle.State.STARTED);
            final UILayoutDonatePreviewCar uILayoutDonatePreviewCar = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((DonateItem) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull DonateItem donateItem, @NotNull Continuation<? super Unit> continuation) {
                    DonateCarPreviewLayoutBinding binding;
                    DonateCarPreviewLayoutBinding binding2;
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(donateItem.getSalePercent()))) {
                        binding2 = UILayoutDonatePreviewCar.this.getBinding();
                        TextView textView = binding2.priceStroked;
                        UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = UILayoutDonatePreviewCar.this;
                        textView.setPaintFlags(16);
                        textView.setText(uILayoutDonatePreviewCar2.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(donateItem.getBasePrice())));
                    }
                    binding = UILayoutDonatePreviewCar.this.getBinding();
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar3 = UILayoutDonatePreviewCar.this;
                    binding.donateCarPreviewName.setText(uILayoutDonatePreviewCar3.getString(R.string.common_double_string_values, UtilsKt.buildTypeMerge(donateItem.getHeader(), donateItem.getHeaderStore()), UtilsKt.buildTypeMerge(donateItem.getSubheader(), donateItem.getSubheaderStore())));
                    if (donateItem.getSpecs() != null) {
                        ArrayList<Integer> specs = donateItem.getSpecs();
                        IntRange indices = specs != null ? CollectionsKt__CollectionsKt.getIndices(specs) : null;
                        Intrinsics.checkNotNull(indices);
                        int first = indices.getFirst();
                        int last = indices.getLast();
                        if (first <= last) {
                            while (true) {
                                if (first == 0) {
                                    ProgressBar progressBar = binding.progressMax;
                                    ArrayList<Integer> specs2 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs2);
                                    Integer num = specs2.get(first);
                                    Intrinsics.checkNotNullExpressionValue(num, "get(...)");
                                    progressBar.setProgress(num.intValue());
                                    TextView textView2 = binding.textMax;
                                    ArrayList<Integer> specs3 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs3);
                                    textView2.setText(uILayoutDonatePreviewCar3.getString(R.string.donate_car_preview_km_h, specs3.get(first)));
                                } else if (first == 1) {
                                    ProgressBar progressBar2 = binding.progress0100;
                                    ArrayList<Integer> specs4 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs4);
                                    Integer num2 = specs4.get(first);
                                    Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                                    progressBar2.setProgress(num2.intValue());
                                    TextView textView3 = binding.text0100;
                                    ArrayList<Integer> specs5 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs5);
                                    textView3.setText(uILayoutDonatePreviewCar3.getString(R.string.donate_car_preview_sec, specs5.get(first)));
                                } else if (first == 2) {
                                    ProgressBar progressBar3 = binding.progressCapacity;
                                    ArrayList<Integer> specs6 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs6);
                                    Integer num3 = specs6.get(first);
                                    Intrinsics.checkNotNullExpressionValue(num3, "get(...)");
                                    progressBar3.setProgress(num3.intValue());
                                    TextView textView4 = binding.textCapacity;
                                    ArrayList<Integer> specs7 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs7);
                                    textView4.setText(uILayoutDonatePreviewCar3.getString(R.string.donate_car_preview_people, specs7.get(first)));
                                } else if (first == 3) {
                                    ProgressBar progressBar4 = binding.progressTrunk;
                                    ArrayList<Integer> specs8 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs8);
                                    Integer num4 = specs8.get(first);
                                    Intrinsics.checkNotNullExpressionValue(num4, "get(...)");
                                    progressBar4.setProgress(num4.intValue());
                                    TextView textView5 = binding.textTrunk;
                                    ArrayList<Integer> specs9 = donateItem.getSpecs();
                                    Intrinsics.checkNotNull(specs9);
                                    textView5.setText(uILayoutDonatePreviewCar3.getString(R.string.donate_car_preview_kilos, specs9.get(first)));
                                }
                                if (first == last) {
                                    break;
                                }
                                first++;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
