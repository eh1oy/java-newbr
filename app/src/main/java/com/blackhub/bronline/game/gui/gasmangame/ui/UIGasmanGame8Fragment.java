package com.blackhub.bronline.game.gui.gasmangame.ui;

import android.annotation.SuppressLint;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blackhub.bronline.databinding.FragmentGasmanGame8Binding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.gui.gasmangame.GasmanUtils;
import com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener;
import com.blackhub.bronline.game.gui.gasmangame.entitie.BOT_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaItem;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaTag;
import com.blackhub.bronline.game.gui.gasmangame.entitie.MIDDLE_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.entitie.TOP_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: UIGasmanGame8Fragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0003J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0003J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame8Fragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanParentUIState;", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "Lcom/blackhub/bronline/databinding/FragmentGasmanGame8Binding;", "()V", "botPlotListOfViews", "", "Landroid/widget/ImageView;", "gasmanChildViewModel", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "getGasmanChildViewModel", "()Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "gasmanChildViewModel$delegate", "Lkotlin/Lazy;", "middlePlotListOfViews", "topPlotListOfViews", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel;", "viewModel$delegate", "animateGas", "", "getListOfDropAreas", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaItem;", "handleUiState", "uiState", "initDropAreas", "initObservers", "initPlotsOnTouchListener", "initViewModel", "initViews", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIGasmanGame8Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanGame8Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame8Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n106#2,15:211\n106#2,15:226\n41#3,2:241\n41#3:243\n42#3:250\n41#3:251\n42#3:254\n1855#4,2:244\n1855#4,2:246\n1855#4,2:248\n1855#4,2:252\n*S KotlinDebug\n*F\n+ 1 UIGasmanGame8Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame8Fragment\n*L\n49#1:211,15\n50#1:226,15\n66#1:241,2\n158#1:243\n158#1:250\n185#1:251\n185#1:254\n166#1:244,2\n173#1:246,2\n178#1:248,2\n202#1:252,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UIGasmanGame8Fragment extends BaseFragmentWithState<GasmanParentUIState, GasmanParentViewModel, FragmentGasmanGame8Binding> {
    public static final int BOT_PLOT_QUANTITY = 1;
    public static final int MIDDLE_PLOT_QUANTITY = 1;
    public static final int TOP_PLOT_QUANTITY = 3;

    @NotNull
    public final List<ImageView> botPlotListOfViews;

    /* renamed from: gasmanChildViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gasmanChildViewModel;

    @NotNull
    public final List<ImageView> middlePlotListOfViews;

    @NotNull
    public final List<ImageView> topPlotListOfViews;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull GasmanParentUIState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$1.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public UIGasmanGame8Fragment() {
        /*
            r7 = this;
            r0 = 2131558575(0x7f0d00af, float:1.874247E38)
            r7.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.topPlotListOfViews = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.middlePlotListOfViews = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.botPlotListOfViews = r0
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$gasmanChildViewModel$2 r0 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$gasmanChildViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel> r2 = com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$2 r3 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$2
            r3.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$3 r4 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$3
            r5 = 0
            r4.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$4 r6 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$4
            r6.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r6)
            r7.gasmanChildViewModel = r0
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$viewModel$2 r0 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$viewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$5 r2 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$5
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel> r1 = com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$6 r2 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$6
            r2.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$7 r3 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$7
            r3.<init>()
            com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$8 r4 = new com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment$special$$inlined$viewModels$default$8
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r1, r2, r3, r4)
            r7.viewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame8Fragment.<init>():void");
    }

    public final GasmanChildViewModel getGasmanChildViewModel() {
        return (GasmanChildViewModel) this.gasmanChildViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public GasmanParentViewModel getViewModel() {
        return (GasmanParentViewModel) this.viewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        initViewModel();
        initObservers();
        initDropAreas();
        initPlotsOnTouchListener();
        GasmanUtils gasmanUtils = GasmanUtils.INSTANCE;
        ConstraintLayout containerRoot = getBinding().containerRoot;
        Intrinsics.checkNotNullExpressionValue(containerRoot, "containerRoot");
        gasmanUtils.resetAnimationOfImageViews(containerRoot);
    }

    private final void initViewModel() {
        FragmentGasmanGame8Binding binding = getBinding();
        GasmanChildViewModel gasmanChildViewModel = getGasmanChildViewModel();
        ImageView imageView = binding.ivCornerPipeTopPlot3;
        Boolean bool = Boolean.FALSE;
        gasmanChildViewModel.initPlots(MapsKt__MapsKt.mutableMapOf(new Pair(imageView, bool), new Pair(binding.ivCornerPipeTopPlot2, bool), new Pair(binding.ivTeePipeMiddlePlot1, bool), new Pair(binding.ivTeePipeBotPlot1, bool)), 3, 1, 1);
    }

    private final void initObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UIGasmanGame8Fragment$initObservers$1(this, null), 3, null);
    }

    private final void initDropAreas() {
        getBinding().getRoot().setOnDragListener(new GasmanDragAndDropListener(getListOfDropAreas(), getGasmanChildViewModel()).invoke());
    }

    private final List<GasmanDropAreaItem> getListOfDropAreas() {
        FragmentGasmanGame8Binding binding = getBinding();
        List<ImageView> list = this.botPlotListOfViews;
        ImageView ivTeePipeDropArea1 = binding.ivTeePipeDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivTeePipeDropArea1, "ivTeePipeDropArea1");
        GasmanDropAreaTag.USUAL_PIPE usual_pipe = GasmanDropAreaTag.USUAL_PIPE.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem = new GasmanDropAreaItem(list, ivTeePipeDropArea1, usual_pipe, 90.0f, CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(0.0f)), BOT_PLOT.INSTANCE);
        List<ImageView> list2 = this.middlePlotListOfViews;
        ImageView ivTeePipeDropArea2 = binding.ivTeePipeDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivTeePipeDropArea2, "ivTeePipeDropArea2");
        GasmanDropAreaTag.TEE_PIPE tee_pipe = GasmanDropAreaTag.TEE_PIPE.INSTANCE;
        Float valueOf = Float.valueOf(180.0f);
        GasmanDropAreaItem gasmanDropAreaItem2 = new GasmanDropAreaItem(list2, ivTeePipeDropArea2, tee_pipe, 0.0f, CollectionsKt__CollectionsJVMKt.listOf(valueOf), MIDDLE_PLOT.INSTANCE);
        List<ImageView> list3 = this.topPlotListOfViews;
        ImageView ivCornerDropArea1 = binding.ivCornerDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea1, "ivCornerDropArea1");
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(valueOf);
        TOP_PLOT top_plot = TOP_PLOT.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem3 = new GasmanDropAreaItem(list3, ivCornerDropArea1, usual_pipe, 90.0f, listOf, top_plot);
        List<ImageView> list4 = this.topPlotListOfViews;
        ImageView ivCornerDropArea2 = binding.ivCornerDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea2, "ivCornerDropArea2");
        return CollectionsKt__CollectionsKt.mutableListOf(gasmanDropAreaItem, gasmanDropAreaItem2, gasmanDropAreaItem3, new GasmanDropAreaItem(list4, ivCornerDropArea2, usual_pipe, 90.0f, CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(270.0f)), top_plot));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initPlotsOnTouchListener() {
        FragmentGasmanGame8Binding binding = getBinding();
        this.topPlotListOfViews.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivCornerPipeTopPlot3, binding.ivCornerPipeTopPlot2, binding.ivCornerPipeTopPlot1}));
        Iterator<T> it = this.topPlotListOfViews.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.middlePlotListOfViews.addAll(CollectionsKt__CollectionsJVMKt.listOf(binding.ivTeePipeMiddlePlot1));
        Iterator<T> it2 = this.middlePlotListOfViews.iterator();
        while (it2.hasNext()) {
            ((ImageView) it2.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.botPlotListOfViews.addAll(CollectionsKt__CollectionsJVMKt.listOf(binding.ivTeePipeBotPlot1));
        Iterator<T> it3 = this.botPlotListOfViews.iterator();
        while (it3.hasNext()) {
            ((ImageView) it3.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void animateGas() {
        FragmentGasmanGame8Binding binding = getBinding();
        ViewPropertyAnimator animate = binding.ivAnimationGas.animate();
        animate.setDuration(1000L);
        animate.alpha(1.0f);
        animate.start();
        for (ImageView imageView : CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivCornerPipeTopPlot3, binding.ivCornerPipeTopPlot2, binding.ivTeePipeMiddlePlot1, binding.ivTeePipeBotPlot1, binding.ivCornerStaticPipe1, binding.ivCornerStaticPipe2, binding.ivCornerStaticPipe3, binding.ivStraightStaticPipe2, binding.ivStraightStaticPipe1, binding.ivHalfCornerStaticPipe})) {
            GasmanUtils gasmanUtils = GasmanUtils.INSTANCE;
            Intrinsics.checkNotNull(imageView);
            gasmanUtils.animateImageViews(imageView);
            imageView.setOnClickListener(null);
        }
    }
}
