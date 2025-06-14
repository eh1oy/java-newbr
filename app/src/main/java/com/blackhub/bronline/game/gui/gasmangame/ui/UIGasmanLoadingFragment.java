package com.blackhub.bronline.game.gui.gasmangame.ui;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.GasmanLoadingLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIGasmanLoadingFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanLoadingFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/GasmanLoadingLayoutBinding;", "()V", "animator", "Landroid/animation/ValueAnimator;", "gasmanParentViewModel", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "getGasmanParentViewModel", "()Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "gasmanParentViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initViews", "", "onDestroyView", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIGasmanLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanLoadingFragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanLoadingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,38:1\n106#2,15:39\n*S KotlinDebug\n*F\n+ 1 UIGasmanLoadingFragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanLoadingFragment\n*L\n14#1:39,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIGasmanLoadingFragment extends BaseFragment<GasmanLoadingLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public ValueAnimator animator;

    /* renamed from: gasmanParentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gasmanParentViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public UIGasmanLoadingFragment() {
        /*
            r5 = this;
            r5.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$gasmanParentViewModel$2 r0 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$gasmanParentViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel> r1 = com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.gasmanParentViewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment.<init>():void");
    }

    public final GasmanParentViewModel getGasmanParentViewModel() {
        return (GasmanParentViewModel) this.gasmanParentViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(2500L);
        ofInt.setInterpolator(new AccelerateInterpolator(1.5f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$$ExternalSyntheticLambda0
            public /* synthetic */ UIGasmanLoadingFragment$$ExternalSyntheticLambda0() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UIGasmanLoadingFragment.initViews$lambda$1$lambda$0(UIGasmanLoadingFragment.this, valueAnimator);
            }
        });
        this.animator = ofInt;
        ofInt.start();
    }

    public static final void initViews$lambda$1$lambda$0(UIGasmanLoadingFragment this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) animatedValue;
        int intValue = num.intValue();
        this$0.getBinding().textViewLoadingPercents.setText(this$0.getString(R.string.common_value_and_percent, num));
        if (intValue == 100) {
            this$0.getGasmanParentViewModel().setLoadingFragmentEnded(true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public GasmanLoadingLayoutBinding getViewBinding() {
        GasmanLoadingLayoutBinding inflate = GasmanLoadingLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        super.onDestroyView();
    }
}
