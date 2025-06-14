package com.blackhub.bronline.game.common;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.dialog.FullScreenLoaderDialog;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFragmentWithState.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000 E*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007:\u0001EB\u000f\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u0015\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020 2\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020 H\u0016J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00102\u001a\u00020 H\u0016J\b\u00103\u001a\u00020 H\u0016J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u00020 H\u0016J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016JV\u00108\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020:2\b\b\u0002\u0010A\u001a\u00020:H\u0004JV\u0010B\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020:2\b\b\u0002\u0010A\u001a\u00020:H\u0004J\b\u0010C\u001a\u00020 H\u0002J\u0012\u0010D\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u000101H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00028\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "contentLayoutId", "", "(I)V", "_binding", "Landroidx/databinding/ViewDataBinding;", "anim", "Landroid/view/animation/Animation;", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "blockingLoaders", "", "Lcom/blackhub/bronline/game/gui/dialog/FullScreenLoaderDialog;", "getContentLayoutId", "()I", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/common/BaseViewModel;", "viewModelBRId", "dismissLoader", "", "id", "dismissLoaders", "handleUiState", "uiState", "(Lcom/blackhub/bronline/game/common/UiState;)V", "initBinding", "(Landroidx/databinding/ViewDataBinding;)V", "initViews", "onCreate", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onStop", "onViewCreated", SVG.View.NODE_NAME, "openOrDismissBlockingLoader", "show", "", "isProgressAnimate", "isFlipAnimation", "isCancellable", "loaderText", "", "isTransparentBack", "isLightTheme", "openOrDismissBlockingLoaderOnce", "setUiStateFlowCollect", "setupBindingView", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseFragmentWithState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentWithState.kt\ncom/blackhub/bronline/game/common/BaseFragmentWithState\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,205:1\n215#2,2:206\n*S KotlinDebug\n*F\n+ 1 BaseFragmentWithState.kt\ncom/blackhub/bronline/game/common/BaseFragmentWithState\n*L\n201#1:206,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseFragmentWithState<UiState extends UiState, ViewModel extends BaseViewModel<UiState>, ViewBinding extends ViewDataBinding> extends Fragment {
    public static final int LOADER_ELECTRIC_COLLECT_SCHEME_ID = 3;
    public static final int LOADER_ELECTRIC_FIND_PROBLEM_ID = 4;
    public static final int LOADER_ELECTRIC_ID = 2;
    public static final int LOADER_ELECTRIC_SUM_CONTACTS_ID = 6;

    @Nullable
    public ViewBinding _binding;
    public final int contentLayoutId;
    public static final int $stable = 8;
    public final int viewModelBRId = 2;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>(this) { // from class: com.blackhub.bronline.game.common.BaseFragmentWithState$anim$2
        public final /* synthetic */ BaseFragmentWithState<UiState, ViewModel, ViewBinding> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseFragmentWithState$anim$2(BaseFragmentWithState<UiState, ViewModel, ViewBinding> this) {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.button_click);
        }
    });

    @NotNull
    public Map<Integer, FullScreenLoaderDialog> blockingLoaders = new LinkedHashMap();

    @NotNull
    public abstract ViewModel getViewModel();

    public abstract void handleUiState(@NotNull UiState uiState);

    public void initBinding(@NotNull ViewBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    public void initViews() {
    }

    public BaseFragmentWithState(@LayoutRes int i) {
        this.contentLayoutId = i;
    }

    public int getContentLayoutId() {
        return this.contentLayoutId;
    }

    @NotNull
    public final ViewBinding getBinding() {
        ViewBinding viewbinding = this._binding;
        if (viewbinding != null) {
            return viewbinding;
        }
        throw new NullPointerException("Binding is null in " + Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + ". Accessing binding before onCreateView or after onDestroyView?");
    }

    @NotNull
    public final Animation getAnim() {
        Object value = this.anim.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle r1) {
        super.onCreate(r1);
        setUiStateFlowCollect();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup r2, @Nullable Bundle r3) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return setupBindingView(r2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View r2, @Nullable Bundle r3) {
        Intrinsics.checkNotNullParameter(r2, "view");
        super.onViewCreated(r2, r3);
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onViewCreated()");
        initViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onStop()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onResume()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissLoaders();
        getAnim().cancel();
        getAnim().reset();
        super.onDestroyView();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onDestroyView()");
        this._binding = null;
    }

    public static /* synthetic */ void openOrDismissBlockingLoader$default(BaseFragmentWithState baseFragmentWithState, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoader");
        }
        baseFragmentWithState.openOrDismissBlockingLoader(i, z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6);
    }

    public final void openOrDismissBlockingLoader(int id, boolean show, boolean isProgressAnimate, boolean isFlipAnimation, boolean isCancellable, @Nullable String loaderText, boolean isTransparentBack, boolean isLightTheme) {
        dismissLoader(id);
        if (show) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            FullScreenLoaderDialog.Builder flipAnimation = new FullScreenLoaderDialog.Builder(requireContext, isTransparentBack, isLightTheme).setCancelable(isCancellable).setProgressAnimate(isProgressAnimate).setFlipAnimation(isFlipAnimation);
            if (loaderText != null) {
                flipAnimation.setTitleText(loaderText);
            }
            FullScreenLoaderDialog show2 = flipAnimation.show();
            this.blockingLoaders.put(Integer.valueOf(id), show2);
        }
    }

    public static /* synthetic */ void openOrDismissBlockingLoaderOnce$default(BaseFragmentWithState baseFragmentWithState, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoaderOnce");
        }
        baseFragmentWithState.openOrDismissBlockingLoaderOnce(i, z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6);
    }

    public final void openOrDismissBlockingLoaderOnce(int id, boolean show, boolean isProgressAnimate, boolean isFlipAnimation, boolean isCancellable, @Nullable String loaderText, boolean isTransparentBack, boolean isLightTheme) {
        FullScreenLoaderDialog fullScreenLoaderDialog = this.blockingLoaders.get(Integer.valueOf(id));
        if (!show || fullScreenLoaderDialog == null) {
            openOrDismissBlockingLoader(id, show, isProgressAnimate, isFlipAnimation, isCancellable, loaderText, isTransparentBack, isLightTheme);
        } else {
            dismissLoader(id);
        }
    }

    private final void dismissLoader(int id) {
        FullScreenLoaderDialog remove = this.blockingLoaders.remove(Integer.valueOf(id));
        if (remove != null) {
            remove.dismiss();
        }
    }

    public final View setupBindingView(ViewGroup r4) {
        ViewBinding viewbinding = (ViewBinding) DataBindingUtil.inflate(getLayoutInflater(), getContentLayoutId(), r4, false);
        viewbinding.setLifecycleOwner(getViewLifecycleOwner());
        viewbinding.setVariable(this.viewModelBRId, getViewModel());
        this._binding = viewbinding;
        viewbinding.executePendingBindings();
        Intrinsics.checkNotNull(viewbinding);
        initBinding(viewbinding);
        ViewBinding viewbinding2 = this._binding;
        UtilsKt.crashlyticsLog((viewbinding2 != null ? viewbinding2.getClass() : null) + " onCreateView()");
        View root = viewbinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    private final void setUiStateFlowCollect() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseFragmentWithState$setUiStateFlowCollect$1(this, null), 3, null);
    }

    private final void dismissLoaders() {
        Iterator<Map.Entry<Integer, FullScreenLoaderDialog>> it = this.blockingLoaders.entrySet().iterator();
        while (it.hasNext()) {
            dismissLoader(it.next().getKey().intValue());
        }
    }
}
