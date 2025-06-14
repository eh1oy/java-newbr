package com.blackhub.bronline.game.common;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.dialog.FullScreenLoaderDialog;
import com.blackhub.bronline.game.theme.ThemeKt;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFragmentCompose.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 4*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u00014B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J^\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000101H\u0004J8\u00102\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/H\u0004J\b\u00103\u001a\u00020\u0010H\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u00065"}, d2 = {"Lcom/blackhub/bronline/game/common/BaseFragmentCompose;", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "screenId", "", "(I)V", "blockingLoaders", "", "Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/common/BaseViewModel;", "dismissLoader", "", "id", "dismissLoaders", "handleUiState", "uiState", "(Lcom/blackhub/bronline/game/common/UiState;)V", "initViews", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onStop", "onViewCreated", SVG.View.NODE_NAME, "openOrDismissBlockingLoader", "show", "", "isFlipAnimation", "isCancellable", "isTimerErrorEnable", "timerDelay", "", "loaderText", "", "timerEndCallback", "Lkotlin/Function0;", "openOrDismissBlockingLoaderOnce", "setUiStateFlowCollect", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseFragmentCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentCompose.kt\ncom/blackhub/bronline/game/common/BaseFragmentCompose\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,173:1\n215#2,2:174\n*S KotlinDebug\n*F\n+ 1 BaseFragmentCompose.kt\ncom/blackhub/bronline/game/common/BaseFragmentCompose\n*L\n165#1:174,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseFragmentCompose<UiState extends UiState, ViewModel extends BaseViewModel<UiState>> extends Fragment {
    public static final int LOADER_CATCH_STREAMER_ID = 7;

    @NotNull
    public Map<Integer, FullScreenLoaderDialog> blockingLoaders = new LinkedHashMap();
    public final int screenId;
    public static final int $stable = 8;

    @NotNull
    public abstract ViewModel getViewModel();

    public abstract void handleUiState(@NotNull UiState uiState);

    public void initViews() {
    }

    public BaseFragmentCompose(int i) {
        this.screenId = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle r1) {
        super.onCreate(r1);
        setUiStateFlowCollect();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup r8, @Nullable Bundle r9) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onCreateView()");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1291779905, true, new Function2<Composer, Integer, Unit>(this) { // from class: com.blackhub.bronline.game.common.BaseFragmentCompose$onCreateView$1$1
            public final /* synthetic */ BaseFragmentCompose<UiState, ViewModel> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BaseFragmentCompose$onCreateView$1$1(BaseFragmentCompose<UiState, ViewModel> this) {
                super(2);
                this.this$0 = this;
            }

            /* compiled from: BaseFragmentCompose.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.blackhub.bronline.game.common.BaseFragmentCompose$onCreateView$1$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                public final /* synthetic */ BaseFragmentCompose<UiState, ViewModel> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BaseFragmentCompose<UiState, ViewModel> baseFragmentCompose) {
                    super(2);
                    r1 = baseFragmentCompose;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer, int i) {
                    int i2;
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1763159373, i, -1, "com.blackhub.bronline.game.common.BaseFragmentCompose.onCreateView.<anonymous>.<anonymous>.<anonymous> (BaseFragmentCompose.kt:56)");
                    }
                    i2 = r1.screenId;
                    ChooseComposeScreenKt.ChooseComposeScreen(i2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1291779905, i, -1, "com.blackhub.bronline.game.common.BaseFragmentCompose.onCreateView.<anonymous>.<anonymous> (BaseFragmentCompose.kt:55)");
                    }
                    ThemeKt.BRTheme(false, false, ComposableLambdaKt.composableLambda(composer, -1763159373, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.BaseFragmentCompose$onCreateView$1$1.1
                        public final /* synthetic */ BaseFragmentCompose<UiState, ViewModel> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BaseFragmentCompose<UiState, ViewModel> baseFragmentCompose) {
                            super(2);
                            r1 = baseFragmentCompose;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i2) {
                            int i22;
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1763159373, i2, -1, "com.blackhub.bronline.game.common.BaseFragmentCompose.onCreateView.<anonymous>.<anonymous>.<anonymous> (BaseFragmentCompose.kt:56)");
                            }
                            i22 = r1.screenId;
                            ChooseComposeScreenKt.ChooseComposeScreen(i22, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View r2, @Nullable Bundle r3) {
        Intrinsics.checkNotNullParameter(r2, "view");
        super.onViewCreated(r2, r3);
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onViewCreated()");
        initViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onStop()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onResume()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissLoaders();
        UtilsKt.crashlyticsLog("screen " + this.screenId + " onDestroyView()");
        super.onDestroyView();
    }

    public final void setUiStateFlowCollect() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseFragmentCompose$setUiStateFlowCollect$1(this, null), 3, null);
    }

    public static /* synthetic */ void openOrDismissBlockingLoader$default(BaseFragmentCompose baseFragmentCompose, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, String str, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoader");
        }
        baseFragmentCompose.openOrDismissBlockingLoader(i, z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? 10000L : j, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : function0);
    }

    public final void openOrDismissBlockingLoader(int id, boolean show, boolean isFlipAnimation, boolean isCancellable, boolean isTimerErrorEnable, long timerDelay, @Nullable String loaderText, @Nullable Function0<Unit> timerEndCallback) {
        dismissLoader(id);
        if (show) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            FullScreenLoaderDialog.Builder flipAnimation = new FullScreenLoaderDialog.Builder(requireContext, false, false, 6, null).setCancelable(isCancellable).setFlipAnimation(isFlipAnimation);
            if (loaderText != null) {
                flipAnimation.setTitleText(loaderText);
            }
            FullScreenLoaderDialog show2 = flipAnimation.show();
            this.blockingLoaders.put(Integer.valueOf(id), show2);
            BooleanExtensionKt.ifTrue(Boolean.valueOf(isTimerErrorEnable), new Function0<Unit>(this) { // from class: com.blackhub.bronline.game.common.BaseFragmentCompose$openOrDismissBlockingLoader$1
                public final /* synthetic */ FullScreenLoaderDialog $blockingLoader;
                public final /* synthetic */ int $id;
                public final /* synthetic */ long $timerDelay;
                public final /* synthetic */ Function0<Unit> $timerEndCallback;
                public final /* synthetic */ BaseFragmentCompose<UiState, ViewModel> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BaseFragmentCompose$openOrDismissBlockingLoader$1(BaseFragmentCompose<UiState, ViewModel> this, long timerDelay2, int id2, FullScreenLoaderDialog show22, Function0<Unit> timerEndCallback2) {
                    super(0);
                    this.this$0 = this;
                    r2 = timerDelay2;
                    r4 = id2;
                    r5 = show22;
                    r6 = timerEndCallback2;
                }

                /* compiled from: BaseFragmentCompose.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005*\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.blackhub.bronline.game.common.BaseFragmentCompose$openOrDismissBlockingLoader$1$1", f = "BaseFragmentCompose.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.blackhub.bronline.game.common.BaseFragmentCompose$openOrDismissBlockingLoader$1$1 */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ FullScreenLoaderDialog $blockingLoader;
                    public final /* synthetic */ int $id;
                    public final /* synthetic */ long $timerDelay;
                    public final /* synthetic */ Function0<Unit> $timerEndCallback;
                    public int label;
                    public final /* synthetic */ BaseFragmentCompose<UiState, ViewModel> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(long j, BaseFragmentCompose<UiState, ViewModel> baseFragmentCompose, int i, FullScreenLoaderDialog fullScreenLoaderDialog, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$timerDelay = j;
                        this.this$0 = baseFragmentCompose;
                        this.$id = i;
                        this.$blockingLoader = fullScreenLoaderDialog;
                        this.$timerEndCallback = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.$timerDelay, this.this$0, this.$id, this.$blockingLoader, this.$timerEndCallback, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Map map;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            long j = this.$timerDelay;
                            this.label = 1;
                            if (DelayKt.delay(j, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        map = this.this$0.blockingLoaders;
                        if (Intrinsics.areEqual(map.get(Boxing.boxInt(this.$id)), this.$blockingLoader)) {
                            this.this$0.dismissLoader(this.$id);
                            Function0<Unit> function0 = this.$timerEndCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new AnonymousClass1(r2, this.this$0, r4, r5, r6, null), 3, null);
                }
            });
        }
    }

    public static /* synthetic */ void openOrDismissBlockingLoaderOnce$default(BaseFragmentCompose baseFragmentCompose, int i, boolean z, boolean z2, boolean z3, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoaderOnce");
        }
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        boolean z5 = (i2 & 8) != 0 ? false : z3;
        if ((i2 & 16) != 0) {
            str = null;
        }
        baseFragmentCompose.openOrDismissBlockingLoaderOnce(i, z, z4, z5, str);
    }

    public final void openOrDismissBlockingLoaderOnce(int id, boolean show, boolean isFlipAnimation, boolean isCancellable, @Nullable String loaderText) {
        FullScreenLoaderDialog fullScreenLoaderDialog = this.blockingLoaders.get(Integer.valueOf(id));
        if (!show || fullScreenLoaderDialog == null) {
            openOrDismissBlockingLoader$default(this, id, show, isFlipAnimation, isCancellable, false, 0L, loaderText, null, 176, null);
        } else {
            dismissLoader(id);
        }
    }

    public final void dismissLoaders() {
        Iterator<Map.Entry<Integer, FullScreenLoaderDialog>> it = this.blockingLoaders.entrySet().iterator();
        while (it.hasNext()) {
            dismissLoader(it.next().getKey().intValue());
        }
    }

    public final void dismissLoader(int id) {
        FullScreenLoaderDialog remove = this.blockingLoaders.remove(Integer.valueOf(id));
        if (remove != null) {
            remove.dismiss();
        }
    }
}
