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
import com.android.billingclient.api.ProductDetails;
import com.blackhub.bronline.databinding.DonateCoinsDepositLayoutBinding;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapperKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.ui.donate.DonateDepositCoinsUiKt;
import com.blackhub.bronline.game.ui.donate.ProductDetailsItem;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutDonateDepositCoins.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7", f = "UILayoutDonateDepositCoins.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutDonateDepositCoins$setupObservers$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutDonateDepositCoins this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutDonateDepositCoins$setupObservers$7(UILayoutDonateDepositCoins uILayoutDonateDepositCoins, Continuation<? super UILayoutDonateDepositCoins$setupObservers$7> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutDonateDepositCoins;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutDonateDepositCoins$setupObservers$7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutDonateDepositCoins$setupObservers$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StateFlow<List<ProductDetailsItem>> productDetailsState = jniActivityViewModel.getProductDetailsState();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(productDetailsState, lifecycle, Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/ui/donate/ProductDetailsItem;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ UILayoutDonateDepositCoins this$0;

        public AnonymousClass1(UILayoutDonateDepositCoins uILayoutDonateDepositCoins) {
            this.this$0 = uILayoutDonateDepositCoins;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((List<ProductDetailsItem>) obj, (Continuation<? super Unit>) continuation);
        }

        @Nullable
        public final Object emit(@NotNull List<ProductDetailsItem> list, @NotNull Continuation<? super Unit> continuation) {
            DonateDepositCoinsViewModel depositCoinsViewModel;
            DonateDepositCoinsViewModel depositCoinsViewModel2;
            DonateDepositCoinsViewModel depositCoinsViewModel3;
            DonateDepositCoinsViewModel depositCoinsViewModel4;
            Handler handler;
            DonateDepositCoinsViewModel depositCoinsViewModel5;
            Handler handler2;
            DonateCoinsDepositLayoutBinding binding;
            DonateCoinsDepositLayoutBinding binding2;
            DonateCoinsDepositLayoutBinding binding3;
            DonateCoinsDepositLayoutBinding binding4;
            DonateCoinsDepositLayoutBinding binding5;
            DonateDepositCoinsViewModel depositCoinsViewModel6;
            depositCoinsViewModel = this.this$0.getDepositCoinsViewModel();
            Boolean value = depositCoinsViewModel.isShowFragment().getValue();
            boolean isMarketBuildVariant = UtilsKt.isMarketBuildVariant();
            boolean isRuRegion = UtilsKt.isRuRegion();
            int size = list.size();
            depositCoinsViewModel2 = this.this$0.getDepositCoinsViewModel();
            UtilsKt.crashlyticsLog("funName=UILayoutDonateDepositCoins.setupObservers, isShowFragment=" + value + ",isMarketBuildVariant()=" + isMarketBuildVariant + ", isRuRegion()=" + isRuRegion + ", list.size=" + size + ", isNeedShowDonatePackage=" + depositCoinsViewModel2.isNeedShowDonatePackage().getValue(), LogTagConstants.MARKET_BILLING_TAG);
            depositCoinsViewModel3 = this.this$0.getDepositCoinsViewModel();
            if (!depositCoinsViewModel3.isShowFragment().getValue().booleanValue()) {
                if (UtilsKt.isMarketBuildVariant() && !UtilsKt.isRuRegion() && (!list.isEmpty())) {
                    depositCoinsViewModel5 = this.this$0.getDepositCoinsViewModel();
                    if (depositCoinsViewModel5.isNeedShowDonatePackage().getValue().booleanValue()) {
                        handler2 = this.this$0.handlerConnect;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        binding = this.this$0.getBinding();
                        binding.cvDonateDepositCoins.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                        binding2 = this.this$0.getBinding();
                        binding2.mlDonateCoinsDeposit.setVisibility(8);
                        binding3 = this.this$0.getBinding();
                        binding3.progressBar.setVisibility(8);
                        binding4 = this.this$0.getBinding();
                        binding4.getRoot().setBackgroundColor(this.this$0.requireContext().getColor(2131100871));
                        binding5 = this.this$0.getBinding();
                        ComposeView composeView = binding5.cvDonateDepositCoins;
                        final UILayoutDonateDepositCoins uILayoutDonateDepositCoins = this.this$0;
                        depositCoinsViewModel6 = uILayoutDonateDepositCoins.getDepositCoinsViewModel();
                        depositCoinsViewModel6.changeShowStateOfFragment(true);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1499858946, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$1$1
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
                            public final void invoke(@Nullable Composer composer, int i) {
                                JNIActivityViewModel jniActivityViewModel;
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1499858946, i, -1, "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UILayoutDonateDepositCoins.kt:190)");
                                    }
                                    jniActivityViewModel = UILayoutDonateDepositCoins.this.getJniActivityViewModel();
                                    final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = UILayoutDonateDepositCoins.this;
                                    DonateDepositCoinsUiKt.DonateDepositCoinsUi(jniActivityViewModel, new Function1<ProductDetails, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$1$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ProductDetails productDetails) {
                                            invoke2(productDetails);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ProductDetails productDetails) {
                                            JNIActivityViewModel jniActivityViewModel2;
                                            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                                            jniActivityViewModel2 = UILayoutDonateDepositCoins.this.getJniActivityViewModel();
                                            BillingClientWrapper billingClientWrapper = jniActivityViewModel2.getBillingClientWrapper();
                                            FragmentActivity requireActivity = UILayoutDonateDepositCoins.this.requireActivity();
                                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                            billingClientWrapper.purchase(requireActivity, productDetails);
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
                if (UtilsKt.isMarketBuildVariant() && !UtilsKt.isRuRegion() && list.isEmpty()) {
                    depositCoinsViewModel4 = this.this$0.getDepositCoinsViewModel();
                    if (depositCoinsViewModel4.isNeedShowDonatePackage().getValue().booleanValue()) {
                        handler = this.this$0.handlerConnect;
                        if (handler != null) {
                            final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = this.this$0;
                            Boxing.boxBoolean(handler.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    UILayoutDonateDepositCoins$setupObservers$7.AnonymousClass1.emit$lambda$1(UILayoutDonateDepositCoins.this);
                                }
                            }, BillingClientWrapperKt.MAX_TIMER_FOR_REQUESTS));
                        }
                    }
                }
                this.this$0.showOldUIWithEmail();
            }
            return Unit.INSTANCE;
        }

        public static final void emit$lambda$1(UILayoutDonateDepositCoins this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            UtilsKt.crashlyticsRecordNewException("funName=UILayoutDonateDepositCoins.setupObservers, productDetailsState empty, isWithMarketBilling. Show old UI", LogTagConstants.MARKET_BILLING_TAG);
            this$0.showOldUIWithEmail();
        }
    }
}
