package com.blackhub.bronline.game.gui.electric.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.FragmentSumContactsBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001GB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0002J\b\u0010.\u001a\u00020*H\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0003J\u0016\u00101\u001a\u00020*2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\fH\u0002J\b\u00104\u001a\u00020*H\u0002J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020*H\u0016J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020*H\u0016J\b\u0010>\u001a\u00020*H\u0002J\u0016\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020!0\fH\u0002J\b\u0010A\u001a\u00020*H\u0002J\u0010\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010F\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'¨\u0006H"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/electric/state/SumContactsUiState;", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel;", "Lcom/blackhub/bronline/databinding/FragmentSumContactsBinding;", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "animatorX", "Landroid/animation/ObjectAnimator;", "animatorY", "dataTargetAreaList", "", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "dragListener", "Landroid/view/View$OnDragListener;", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "gameInstructionsDialog", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "handRotateAnimation", "Landroid/view/animation/RotateAnimation;", "parentViewModel", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "screenArgs", "", "getScreenArgs", "()Ljava/lang/String;", "screenArgs$delegate", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel;", "viewModel$delegate", "blockingLoader", "", "isShow", "", "clearHandRotateAnimation", "clearHandTranslateAnimation", "clearListeners", "clearTouch", "createGameInstructionsDialog", "hintsList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "createHandRotateAnimation", "createHandTranslateAnimation", "dismissGameInstructionsDialog", "handleUiState", "uiState", "initViews", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "setDragAndDropForView", "setListener", "targetAreaBusyList", "setObservers", "startHandTranslateAnimationOne", "endPoint", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;", "startHandTranslateAnimationThree", "startHandTranslateAnimationTwo", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSumContactsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,454:1\n106#2,15:455\n106#2,15:470\n41#3,2:485\n41#3,2:487\n41#3,2:489\n41#3,2:491\n41#3,2:493\n41#3,2:495\n41#3,2:497\n41#3,2:499\n41#3,2:501\n41#3,2:503\n41#3,2:505\n*S KotlinDebug\n*F\n+ 1 SumContactsFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment\n*L\n61#1:455,15\n69#1:470,15\n135#1:485,2\n154#1:487,2\n163#1:489,2\n227#1:491,2\n253#1:493,2\n262#1:495,2\n302#1:497,2\n342#1:499,2\n382#1:501,2\n417#1:503,2\n432#1:505,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsFragment extends BaseFragmentWithState<SumContactsUiState, SumContactsViewModel, FragmentSumContactsBinding> {
    public static final long ANIMATION_TRANSLATE_DURATION = 2000;
    public static final int HALF_SIZE = 2;

    @Nullable
    public AnimatorSet animatorSet;

    @Nullable
    public ObjectAnimator animatorX;

    @Nullable
    public ObjectAnimator animatorY;

    @Nullable
    public List<DataTargetArea> dataTargetAreaList;

    @Nullable
    public View.OnDragListener dragListener;

    @Inject
    public MainViewModelFactory<SumContactsViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public RotateAnimation handRotateAnimation;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$1.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public SumContactsFragment() {
        /*
            r7 = this;
            r0 = 2131558591(0x7f0d00bf, float:1.8742502E38)
            r7.<init>(r0)
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$parentViewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$parentViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel> r2 = com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$2 r3 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$2
            r3.<init>()
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$3 r4 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$3
            r5 = 0
            r4.<init>()
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$4 r6 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$4
            r6.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r6)
            r7.parentViewModel = r0
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$screenArgs$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$screenArgs$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r7.screenArgs = r0
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$viewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$viewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$5 r2 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$5
            r2.<init>()
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$6 r3 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$6
            r3.<init>()
            kotlin.Lazy r1 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel> r2 = com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$7 r3 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$7
            r3.<init>()
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$8 r4 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$8
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r0)
            r7.viewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment.<init>():void");
    }

    private final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @NotNull
    public final MainViewModelFactory<SumContactsViewModel> getFactory() {
        MainViewModelFactory<SumContactsViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<SumContactsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public SumContactsViewModel getViewModel() {
        return (SumContactsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            SumContactsViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        getParentViewModel().sendStartMiniGame();
        setDragAndDropForView();
        setObservers();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull SumContactsUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        blockingLoader(uiState.isBlockingLoading());
        Boolean isWin = uiState.isWin();
        if (isWin != null) {
            getParentViewModel().sendFinishMiniGame(isWin.booleanValue());
        }
        if (uiState.isSumAllTermsCorrect()) {
            getViewModel().setWin(true);
            clearTouch();
        }
        if (uiState.getCountError() > uiState.getCountErrorForGameOver()) {
            getViewModel().setWin(false);
        }
        if (uiState.isHintTwoTurnOn()) {
            getViewModel().setHintTwo();
        }
        if (uiState.isHintThreeTurnOn()) {
            getViewModel().setHintThree();
        }
        if (uiState.isHandTranslateAnimationShow()) {
            createHandTranslateAnimation();
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandRotateAnimationShow()) {
            createHandRotateAnimation();
        } else {
            clearHandRotateAnimation();
        }
        if (uiState.getCountHint() == 3) {
            FragmentSumContactsBinding binding = getBinding();
            AppCompatImageView ivSumContactsCircleTwo = binding.ivSumContactsCircleTwo;
            Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleTwo, "ivSumContactsCircleTwo");
            PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsCircleTwo);
            binding.ivSumContactsHand.setX(globalCenterPoint.getX());
            binding.ivSumContactsHand.setY(globalCenterPoint.getY());
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissGameInstructionsDialog();
        clearHandTranslateAnimation();
        clearHandRotateAnimation();
        clearListeners();
        clearTouch();
        super.onDestroyView();
    }

    public final void setDragAndDropForView() {
        FragmentSumContactsBinding binding = getBinding();
        TextView tvSumContactsBulbOne = binding.tvSumContactsBulbOne;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbOne, "tvSumContactsBulbOne");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbOne, null, 1, null);
        TextView tvSumContactsBulbTwo = binding.tvSumContactsBulbTwo;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbTwo, "tvSumContactsBulbTwo");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbTwo, null, 1, null);
        TextView tvSumContactsBulbThree = binding.tvSumContactsBulbThree;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbThree, "tvSumContactsBulbThree");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbThree, null, 1, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setObservers$1$1.<init>(com.blackhub.bronline.databinding.FragmentSumContactsBinding, com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment, float):void, class status: GENERATED_AND_UNLOADED
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
    private final void setObservers() {
        /*
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131166184(0x7f0703e8, float:1.7946606E38)
            float r0 = r0.getDimension(r1)
            androidx.databinding.ViewDataBinding r1 = r4.getBinding()
            com.blackhub.bronline.databinding.FragmentSumContactsBinding r1 = (com.blackhub.bronline.databinding.FragmentSumContactsBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.mlSumContacts
            java.lang.String r3 = "mlSumContacts"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setObservers$1$1 r3 = new com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setObservers$1$1
            r3.<init>()
            com.blackhub.bronline.game.core.extension.ViewExtensionKt.addViewObserver(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment.setObservers():void");
    }

    public final void setListener(List<String> targetAreaBusyList) {
        clearListeners();
        FragmentSumContactsBinding binding = getBinding();
        List<DataTargetArea> list = this.dataTargetAreaList;
        if (list != null) {
            View.OnDragListener invoke = new DragAndDropListener(list, targetAreaBusyList, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setListener$1$1$1
                public SumContactsFragment$setListener$1$1$1() {
                    super(1);
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        SumContactsFragment sumContactsFragment = SumContactsFragment.this;
                        sumContactsFragment.getViewModel().getCartridgeBusyList().remove(busyData);
                        sumContactsFragment.setListener(sumContactsFragment.getViewModel().getCartridgeBusyList());
                    }
                    SumContactsFragment.this.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setListener$1$1$2
                public SumContactsFragment$setListener$1$1$2() {
                    super(1);
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        SumContactsFragment sumContactsFragment = SumContactsFragment.this;
                        if (!sumContactsFragment.getViewModel().getCartridgeBusyList().contains(busyData)) {
                            sumContactsFragment.getViewModel().getCartridgeBusyList().add(busyData);
                            sumContactsFragment.setListener(sumContactsFragment.getViewModel().getCartridgeBusyList());
                        }
                    }
                    SumContactsFragment.this.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }).invoke();
            this.dragListener = invoke;
            binding.mlSumContacts.setOnDragListener(invoke);
        }
    }

    public final void createHandTranslateAnimation() {
        FragmentSumContactsBinding binding = getBinding();
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        ViewExtensionKt.addViewObserver(ivSumContactsHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$createHandTranslateAnimation$1$1
            public final /* synthetic */ SumContactsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SumContactsFragment$createHandTranslateAnimation$1$1(SumContactsFragment this) {
                super(0);
                r2 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                AppCompatImageView ivSumContactsCircleTwo = FragmentSumContactsBinding.this.ivSumContactsCircleTwo;
                Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleTwo, "ivSumContactsCircleTwo");
                r2.startHandTranslateAnimationOne(ViewExtensionKt.getGlobalCenterPoint(ivSumContactsCircleTwo));
            }
        });
    }

    public final void startHandTranslateAnimationOne(PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbOne = binding.blockSumContactsBulbOne;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbOne, "blockSumContactsBulbOne");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbOne);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorSet = new AnimatorSet();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        this.animatorY = ofFloat;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.playTogether(this.animatorX, ofFloat);
            animatorSet.setDuration(2000L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationOne$1$1$1
                public final /* synthetic */ PointFloat $endPoint;

                public SumContactsFragment$startHandTranslateAnimationOne$1$1$1(PointFloat endPoint2) {
                    r2 = endPoint2;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator r2, boolean isReverse) {
                    Intrinsics.checkNotNullParameter(r2, "animation");
                    super.onAnimationEnd(r2, isReverse);
                    if (SumContactsFragment.this.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                        SumContactsFragment.this.startHandTranslateAnimationTwo(r2);
                    }
                }
            });
        } else {
            animatorSet = null;
        }
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public final void startHandTranslateAnimationTwo(PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbTwo = binding.blockSumContactsBulbTwo;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbTwo, "blockSumContactsBulbTwo");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbTwo);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        this.animatorY = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        animatorSet.playTogether(this.animatorX, this.animatorY);
        animatorSet.setDuration(2000L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationTwo$1$1$1
            public final /* synthetic */ PointFloat $endPoint;

            public SumContactsFragment$startHandTranslateAnimationTwo$1$1$1(PointFloat endPoint2) {
                r2 = endPoint2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator r1, boolean isReverse) {
                Intrinsics.checkNotNullParameter(r1, "animation");
                super.onAnimationEnd(r1);
                if (SumContactsFragment.this.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                    SumContactsFragment.this.startHandTranslateAnimationThree(r2);
                }
            }
        });
        animatorSet.start();
    }

    public final void startHandTranslateAnimationThree(PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbThree = binding.blockSumContactsBulbThree;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbThree, "blockSumContactsBulbThree");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbThree);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        this.animatorY = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        animatorSet.playTogether(this.animatorX, this.animatorY);
        animatorSet.setDuration(2000L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationThree$1$1$1
            public final /* synthetic */ PointFloat $endPoint;

            public SumContactsFragment$startHandTranslateAnimationThree$1$1$1(PointFloat endPoint2) {
                r2 = endPoint2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator r1, boolean isReverse) {
                Intrinsics.checkNotNullParameter(r1, "animation");
                super.onAnimationEnd(r1);
                if (SumContactsFragment.this.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                    SumContactsFragment.this.startHandTranslateAnimationOne(r2);
                }
            }
        });
        animatorSet.start();
    }

    private final void createHandRotateAnimation() {
        FragmentSumContactsBinding binding = getBinding();
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        ViewExtensionKt.addViewObserver(ivSumContactsHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$createHandRotateAnimation$1$1
            public final /* synthetic */ SumContactsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SumContactsFragment$createHandRotateAnimation$1$1(SumContactsFragment this) {
                super(0);
                r2 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FragmentSumContactsBinding.this.ivSumContactsHand.clearAnimation();
                SumContactsFragment sumContactsFragment = r2;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -30.0f, FragmentSumContactsBinding.this.ivSumContactsHand.getX() + (FragmentSumContactsBinding.this.ivSumContactsHand.getWidth() / 2), FragmentSumContactsBinding.this.ivSumContactsHand.getY() + (FragmentSumContactsBinding.this.ivSumContactsHand.getHeight() / 2));
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(2);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(700L);
                FragmentSumContactsBinding.this.ivSumContactsHand.startAnimation(rotateAnimation);
                sumContactsFragment.handRotateAnimation = rotateAnimation;
            }
        });
    }

    private final void clearHandTranslateAnimation() {
        ObjectAnimator objectAnimator = this.animatorX;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.animatorX = null;
        ObjectAnimator objectAnimator2 = this.animatorY;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.animatorY = null;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
    }

    private final void clearHandRotateAnimation() {
        RotateAnimation rotateAnimation = this.handRotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.handRotateAnimation = null;
    }

    private final void clearListeners() {
        FragmentSumContactsBinding binding = getBinding();
        this.dragListener = null;
        binding.mlSumContacts.setOnDragListener(null);
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 6, isShow, false, false, false, null, false, false, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void clearTouch() {
        FragmentSumContactsBinding binding = getBinding();
        binding.tvSumContactsBulbOne.setOnTouchListener(null);
        binding.tvSumContactsBulbTwo.setOnTouchListener(null);
        binding.tvSumContactsBulbThree.setOnTouchListener(null);
    }

    private final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GameInstructionsDialog create = companion.create(requireContext, hintsList, new SumContactsFragment$createGameInstructionsDialog$1(getViewModel()));
        create.show();
        this.gameInstructionsDialog = create;
    }

    private final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }
}
