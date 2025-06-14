package com.blackhub.bronline.game.gui.donate.ui;

import android.os.Handler;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.databinding.DonateCoinsDepositLayoutBinding;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt;
import com.blackhub.bronline.game.ui.donate.RustoreProductDetailsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.model.product.Product;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonateDepositCoins.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6", f = "UILayoutDonateDepositCoins.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonateDepositCoins$setupObservers$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutDonateDepositCoins this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonateDepositCoins$setupObservers$6(UILayoutDonateDepositCoins uILayoutDonateDepositCoins, Continuation<? super UILayoutDonateDepositCoins$setupObservers$6> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonateDepositCoins;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonateDepositCoins$setupObservers$6(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonateDepositCoins$setupObservers$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel jniActivityViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jniActivityViewModel = this.this$0.getJniActivityViewModel();
            StateFlow<List<RustoreProductDetailsItem>> rustoreProductDetailsState = jniActivityViewModel.getRustoreProductDetailsState();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(rustoreProductDetailsState, lifecycle, Lifecycle.State.STARTED);
            final UILayoutDonateDepositCoins uILayoutDonateDepositCoins = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<RustoreProductDetailsItem>) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull List<RustoreProductDetailsItem> list, @NotNull Continuation<? super Unit> continuation) {
                    DonateDepositCoinsViewModel depositCoinsViewModel;
                    DonateDepositCoinsViewModel depositCoinsViewModel2;
                    DonateDepositCoinsViewModel depositCoinsViewModel3;
                    DonateDepositCoinsViewModel depositCoinsViewModel4;
                    Handler handler;
                    DonateCoinsDepositLayoutBinding binding;
                    DonateCoinsDepositLayoutBinding binding2;
                    DonateCoinsDepositLayoutBinding binding3;
                    DonateCoinsDepositLayoutBinding binding4;
                    DonateCoinsDepositLayoutBinding binding5;
                    DonateDepositCoinsViewModel depositCoinsViewModel5;
                    depositCoinsViewModel = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel();
                    Boolean value = depositCoinsViewModel.isShowFragment().getValue();
                    boolean isRustoreBuildVariant = UtilsKt.isRustoreBuildVariant();
                    boolean isRuRegion = UtilsKt.isRuRegion();
                    int size = list.size();
                    depositCoinsViewModel2 = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel();
                    UtilsKt.crashlyticsLog("funName=UILayoutDonateDepositCoins.setupObservers, isShowFragment=" + value + ",isRustoreBuildVariant()=" + isRustoreBuildVariant + ", isRuRegion()=" + isRuRegion + ", list.size=" + size + ", isNeedShowDonatePackage=" + depositCoinsViewModel2.isNeedShowDonatePackage().getValue(), LogTagConstants.RUSTORE_BILLING_TAG);
                    depositCoinsViewModel3 = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel();
                    if (!depositCoinsViewModel3.isShowFragment().getValue().booleanValue() && UtilsKt.isRustoreBuildVariant() && (!list.isEmpty())) {
                        depositCoinsViewModel4 = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel();
                        if (depositCoinsViewModel4.isNeedShowDonatePackage().getValue().booleanValue()) {
                            handler = UILayoutDonateDepositCoins.this.handlerConnect;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            binding = UILayoutDonateDepositCoins.this.getBinding();
                            binding.cvDonateDepositCoins.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                            binding2 = UILayoutDonateDepositCoins.this.getBinding();
                            binding2.mlDonateCoinsDeposit.setVisibility(8);
                            binding3 = UILayoutDonateDepositCoins.this.getBinding();
                            binding3.progressBar.setVisibility(8);
                            binding4 = UILayoutDonateDepositCoins.this.getBinding();
                            binding4.getRoot().setBackgroundColor(UILayoutDonateDepositCoins.this.requireContext().getColor(2131100871));
                            binding5 = UILayoutDonateDepositCoins.this.getBinding();
                            ComposeView composeView = binding5.cvDonateDepositCoins;
                            final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = UILayoutDonateDepositCoins.this;
                            depositCoinsViewModel5 = uILayoutDonateDepositCoins2.getDepositCoinsViewModel();
                            depositCoinsViewModel5.changeShowStateOfFragment(true);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1901173439, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer, int i2) {
                                    JNIActivityViewModel jniActivityViewModel2;
                                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1901173439, i2, -1, "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UILayoutDonateDepositCoins.kt:152)");
                                        }
                                        jniActivityViewModel2 = UILayoutDonateDepositCoins.this.getJniActivityViewModel();
                                        final UILayoutDonateDepositCoins uILayoutDonateDepositCoins3 = UILayoutDonateDepositCoins.this;
                                        DonateDepositCoinsRustoreUiKt.DonateDepositCoinsRustoreUi(jniActivityViewModel2, new Function1<Product, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                                                invoke2(product);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull Product productDetails) {
                                                JNIActivityViewModel jniActivityViewModel3;
                                                Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                                                jniActivityViewModel3 = UILayoutDonateDepositCoins.this.getJniActivityViewModel();
                                                RustoreBillingClientWrapper rustoreBillingClientWrapper = jniActivityViewModel3.getRustoreBillingClientWrapper();
                                                FragmentActivity requireActivity = UILayoutDonateDepositCoins.this.requireActivity();
                                                String productId = productDetails.getProductId();
                                                Integer price = productDetails.getPrice();
                                                int orZero = IntExtensionKt.getOrZero(price != null ? Integer.valueOf(price.intValue() / 100) : null);
                                                Intrinsics.checkNotNull(requireActivity);
                                                rustoreBillingClientWrapper.purchaseProduct(productId, requireActivity, Integer.valueOf(orZero));
                                            }
                                        }, composer, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }));
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
