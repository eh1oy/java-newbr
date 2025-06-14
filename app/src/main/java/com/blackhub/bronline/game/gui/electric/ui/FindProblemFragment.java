package com.blackhub.bronline.game.gui.electric.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FragmentFindProblemBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener;
import com.blackhub.bronline.game.core.utils.draganddrop.ViewTouchResultListener;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragAndDrop;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FindProblemFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 Q2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001QB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020+H\u0002J\b\u0010/\u001a\u00020+H\u0002J\b\u00100\u001a\u00020+H\u0002J\u0016\u00101\u001a\u00020+2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\bH\u0002J\b\u00104\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020+H\u0002J\u0010\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\u0002H\u0017J\u0010\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020+H\u0017J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020+H\u0016J\u0010\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020+2\u000e\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0GH\u0002J\b\u0010I\u001a\u00020+H\u0002J\b\u0010J\u001a\u00020+H\u0002J\u0010\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020MH\u0002J\u0016\u0010N\u001a\u00020+2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002J\b\u0010P\u001a\u00020+H\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b'\u0010(¨\u0006R"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/electric/state/FindProblemUiState;", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel;", "Lcom/blackhub/bronline/databinding/FragmentFindProblemBinding;", "Lcom/blackhub/bronline/game/core/utils/draganddrop/ViewTouchResultListener;", "()V", "dataTargetAreaList", "", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "dragListener", "Landroid/view/View$OnDragListener;", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "gameInstructionsDialog", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "handRotateAnimation", "Landroid/view/animation/RotateAnimation;", "handTranslateAnimation", "Landroid/view/animation/TranslateAnimation;", "listElementTwoInContainer", "", "Landroid/view/View;", "parentViewModel", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "screenArgs", "", "getScreenArgs", "()Ljava/lang/String;", "screenArgs$delegate", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel;", "viewModel$delegate", "blockingLoader", "", "isShow", "", "clearHandRotateAnimation", "clearHandTranslateAnimation", "clearListeners", "createGameInstructionsDialog", "hintsList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "createHandRotateAnimation", "createHandTranslateAnimation", "endView", "Landroid/widget/ImageView;", "dismissGameInstructionsDialog", "handleUiState", "uiState", "initBinding", "binding", "initViews", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onTouchResult", "currentTargetArea", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentTargetArea;", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "selectNextGame", "setFakeImageViewForHint", "setHandStartCoordinate", "countHint", "", "setListener", "targetAreaBusyList", "setObserver", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFindProblemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,746:1\n106#2,15:747\n106#2,15:762\n41#3:777\n42#3:782\n41#3,2:783\n41#3,2:785\n41#3,2:787\n41#3,2:789\n41#3,2:791\n41#3,2:793\n41#3,2:795\n34#4:778\n34#4:779\n34#4:780\n34#4:781\n*S KotlinDebug\n*F\n+ 1 FindProblemFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment\n*L\n102#1:747,15\n105#1:762,15\n134#1:777\n134#1:782\n300#1:783,2\n459#1:785,2\n481#1:787,2\n573#1:789,2\n643#1:791,2\n667#1:793,2\n726#1:795,2\n141#1:778\n146#1:779\n151#1:780\n156#1:781\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemFragment extends BaseFragmentWithState<FindProblemUiState, FindProblemViewModel, FragmentFindProblemBinding> implements ViewTouchResultListener {
    public static final int COUNT_FUSES = 4;
    public static final int COUNT_GAMES = 2;
    public static final float FUSE_CORRECT_HEIGHT = 4.0f;
    public static final float FUSE_CORRECT_HEIGHT_START = 1.35f;
    public static final float FUSE_CORRECT_WIDTH = 1.5f;
    public static final float FUSE_CORRECT_WIDTH_START = 1.15f;
    public static final float FUSE_DEGREE = 45.0f;
    public static final float FUSE_HORIZONTAL_DEGREE = 90.0f;
    public static final float FUSE_VERTICAL_DEGREE = 0.0f;
    public static final long HAND_TRANSLATE_DURATION = 2000;
    public static final int POSITION_ONE = 1;
    public static final int POSITION_THREE = 3;
    public static final int POSITION_TWO = 2;
    public static final int POSITION_ZERO = 0;
    public static final float PROBE_BLACK_ROTATE = 230.0f;
    public static final float PROBE_RED_ROTATE = 130.0f;
    public static final float PROBE_SCALE = 0.6f;

    @Nullable
    public List<DataTargetArea> dataTargetAreaList;

    @Nullable
    public View.OnDragListener dragListener;

    @Inject
    public MainViewModelFactory<FindProblemViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public RotateAnimation handRotateAnimation;

    @Nullable
    public TranslateAnimation handTranslateAnimation;

    @NotNull
    public final List<View> listElementTwoInContainer;

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
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$2.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public FindProblemFragment() {
        /*
            r7 = this;
            r0 = 2131558566(0x7f0d00a6, float:1.8742451E38)
            r7.<init>(r0)
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$viewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$viewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$1 r1 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$1
            r1.<init>()
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$2 r3 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$2
            r3.<init>()
            kotlin.Lazy r1 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel> r3 = com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$3 r4 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$3
            r4.<init>()
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$4 r5 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$4
            r6 = 0
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r0)
            r7.viewModel = r0
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$parentViewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$parentViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$6 r1 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$6
            r1.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r1)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel> r1 = com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$7 r2 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$7
            r2.<init>()
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$8 r3 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$8
            r3.<init>()
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$9 r4 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$9
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r1, r2, r3, r4)
            r7.parentViewModel = r0
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$screenArgs$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$screenArgs$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r7.screenArgs = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.listElementTwoInContainer = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment.<init>():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @NotNull
    public final MainViewModelFactory<FindProblemViewModel> getFactory() {
        MainViewModelFactory<FindProblemViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<FindProblemViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public FindProblemViewModel getViewModel() {
        return (FindProblemViewModel) this.viewModel.getValue();
    }

    private final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initBinding(@NotNull FragmentFindProblemBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.initBinding((FindProblemFragment) binding);
        binding.cvFindProblemView.setTouchResultListener(this);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @SuppressLint({"ClickableViewAccessibility"})
    public void initViews() {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            FindProblemViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2, getParentViewModel().getUiState().getValue().getLevelCounter());
        }
        if (getParentViewModel().getUiState().getValue().getLevelCounter() == 1) {
            getParentViewModel().sendStartMiniGame();
        }
        FragmentFindProblemBinding binding = getBinding();
        if (getViewModel().getRandomOhmForTargetList().size() < 3) {
            binding.blockFindProblemElementTwo.removeViewInLayout(binding.ivFindProblemElementTwoFour);
        }
        if (getViewModel().getRandomOhmForTargetList().size() < 2) {
            binding.blockFindProblemElementTwo.removeViewInLayout(binding.ivFindProblemElementTwoThree);
        }
        FrameLayout blockFindProblemElementTwo = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoOne = binding.ivFindProblemElementTwoOne;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne, "ivFindProblemElementTwoOne");
        if (blockFindProblemElementTwo.indexOfChild(ivFindProblemElementTwoOne) != -1) {
            List<View> list = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoOne2 = binding.ivFindProblemElementTwoOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne2, "ivFindProblemElementTwoOne");
            list.add(ivFindProblemElementTwoOne2);
        }
        FrameLayout blockFindProblemElementTwo2 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo2, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoTwo = binding.ivFindProblemElementTwoTwo;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo, "ivFindProblemElementTwoTwo");
        if (blockFindProblemElementTwo2.indexOfChild(ivFindProblemElementTwoTwo) != -1) {
            List<View> list2 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoTwo2 = binding.ivFindProblemElementTwoTwo;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo2, "ivFindProblemElementTwoTwo");
            list2.add(ivFindProblemElementTwoTwo2);
        }
        FrameLayout blockFindProblemElementTwo3 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo3, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoThree = binding.ivFindProblemElementTwoThree;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree, "ivFindProblemElementTwoThree");
        if (blockFindProblemElementTwo3.indexOfChild(ivFindProblemElementTwoThree) != -1) {
            List<View> list3 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoThree2 = binding.ivFindProblemElementTwoThree;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree2, "ivFindProblemElementTwoThree");
            list3.add(ivFindProblemElementTwoThree2);
        }
        FrameLayout blockFindProblemElementTwo4 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo4, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoFour = binding.ivFindProblemElementTwoFour;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour, "ivFindProblemElementTwoFour");
        if (blockFindProblemElementTwo4.indexOfChild(ivFindProblemElementTwoFour) != -1) {
            List<View> list4 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoFour2 = binding.ivFindProblemElementTwoFour;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour2, "ivFindProblemElementTwoFour");
            list4.add(ivFindProblemElementTwoFour2);
        }
        AppCompatImageView ivFindProblemElementTwoOne3 = binding.ivFindProblemElementTwoOne;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne3, "ivFindProblemElementTwoOne");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoOne3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoTwo3 = binding.ivFindProblemElementTwoTwo;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo3, "ivFindProblemElementTwoTwo");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoTwo3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoThree3 = binding.ivFindProblemElementTwoThree;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree3, "ivFindProblemElementTwoThree");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoThree3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoFour3 = binding.ivFindProblemElementTwoFour;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour3, "ivFindProblemElementTwoFour");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoFour3, null, 1, null);
        AppCompatImageView ivFindProblemProbeRed = binding.ivFindProblemProbeRed;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeRed, "ivFindProblemProbeRed");
        ViewExtensionKt.setDragAndDrop(ivFindProblemProbeRed, new DataDragAndDrop(0.6f, 130.0f, 0, 4, null));
        AppCompatImageView ivFindProblemProbeBlack = binding.ivFindProblemProbeBlack;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeBlack, "ivFindProblemProbeBlack");
        ViewExtensionKt.setDragAndDrop(ivFindProblemProbeBlack, new DataDragAndDrop(0.6f, 230.0f, 0, 4, null));
        setObserver();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @SuppressLint({"ClickableViewAccessibility"})
    public void handleUiState(@NotNull FindProblemUiState uiState) {
        String empty;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        blockingLoader(uiState.isBlockingLoading());
        FragmentFindProblemBinding binding = getBinding();
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        if (uiState.getProbeBlackOnTarget()) {
            binding.ivFindProblemProbeBlack.setOnTouchListener(null);
        }
        if (uiState.isNextGame()) {
            selectNextGame();
        }
        TextView textView = binding.tvFindProblemTargetOhm;
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) getViewModel().getRandomOhmForTargetList());
        if (str == null || (empty = getString(R.string.electric_target_ohm, str)) == null) {
            empty = AnyExtensionKt.empty(binding);
        }
        textView.setText(empty);
        binding.cvFindProblemView.setFuseGrayOneVisible(uiState.isFuseGrayOneVisible());
        binding.cvFindProblemView.setFuseGrayTwoVisible(uiState.isFuseGrayTwoVisible());
        binding.cvFindProblemView.setFuseGrayThreeVisible(uiState.isFuseGrayThreeVisible());
        binding.cvFindProblemView.setFuseGrayFourVisible(uiState.isFuseGrayFourVisible());
        binding.cvFindProblemView.setFuseRedOneVisible(uiState.isFuseRedOneVisible());
        binding.cvFindProblemView.setFuseRedTwoVisible(uiState.isFuseRedTwoVisible());
        binding.cvFindProblemView.setFuseRedThreeVisible(uiState.isFuseRedThreeVisible());
        binding.cvFindProblemView.setFuseRedFourVisible(uiState.isFuseRedFourVisible());
        if (!uiState.isFuseGrayOneVisible() && !uiState.isFuseFillOne()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_ONE);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayTwoVisible() && !uiState.isFuseFillTwo()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_TWO);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayThreeVisible() && !uiState.isFuseFillThree()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_THREE);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayFourVisible() && !uiState.isFuseFillFour()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_FOUR);
            setListener(getViewModel().getFuseBusyList());
        }
        if (getViewModel().getFuseBusyList().size() == 4 && getViewModel().getRandomOhmForTargetList().size() == 0) {
            getViewModel().setWin(true);
        } else {
            getViewModel().setWin(false);
        }
        setHandStartCoordinate(uiState.getCountHint());
        if (uiState.isHandRotateAnimationShow()) {
            createHandRotateAnimation();
        } else {
            clearHandRotateAnimation();
        }
        if (uiState.isHandTranslateAnimationOneShow()) {
            ImageView ivFindProblemVoltagePointBlack = binding.ivFindProblemVoltagePointBlack;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointBlack, "ivFindProblemVoltagePointBlack");
            createHandTranslateAnimation(ivFindProblemVoltagePointBlack);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationTwoShow()) {
            ImageView ivFindProblemVoltagePointRedOne = binding.ivFindProblemVoltagePointRedOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne, "ivFindProblemVoltagePointRedOne");
            createHandTranslateAnimation(ivFindProblemVoltagePointRedOne);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationThreeShow()) {
            ImageView ivFindProblemFuseGrayOne = binding.ivFindProblemFuseGrayOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne, "ivFindProblemFuseGrayOne");
            createHandTranslateAnimation(ivFindProblemFuseGrayOne);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationFourShow()) {
            ImageView ivFindProblemVoltagePointRedThree = binding.ivFindProblemVoltagePointRedThree;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedThree, "ivFindProblemVoltagePointRedThree");
            createHandTranslateAnimation(ivFindProblemVoltagePointRedThree);
        }
        if (getViewModel().getRandomOhmForTargetList().isEmpty()) {
            getViewModel().setHintEight();
        }
        binding.cvFindProblemView.invalidate();
    }

    @Override // com.blackhub.bronline.game.core.utils.draganddrop.ViewTouchResultListener
    public void onTouchResult(@NotNull CurrentTargetArea currentTargetArea) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        getViewModel().setFuseGrayInvisible(currentTargetArea);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissGameInstructionsDialog();
        clearListeners();
        clearHandTranslateAnimation();
        clearHandRotateAnimation();
        super.onDestroyView();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setObserver$1$1.<init>(com.blackhub.bronline.databinding.FragmentFindProblemBinding, com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment, float):void, class status: GENERATED_AND_UNLOADED
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
    public final void setObserver() {
        /*
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131165702(0x7f070206, float:1.7945629E38)
            float r0 = r0.getDimension(r1)
            androidx.databinding.ViewDataBinding r1 = r4.getBinding()
            com.blackhub.bronline.databinding.FragmentFindProblemBinding r1 = (com.blackhub.bronline.databinding.FragmentFindProblemBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.mlFindProblem
            java.lang.String r3 = "mlFindProblem"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setObserver$1$1 r3 = new com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setObserver$1$1
            r3.<init>()
            com.blackhub.bronline.game.core.extension.ViewExtensionKt.addViewObserver(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment.setObserver():void");
    }

    public final void setListener(List<String> targetAreaBusyList) {
        clearListeners();
        FragmentFindProblemBinding binding = getBinding();
        List<DataTargetArea> list = this.dataTargetAreaList;
        if (list != null) {
            View.OnDragListener invoke = new DragAndDropListener(list, targetAreaBusyList, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setListener$1$1$1
                public FindProblemFragment$setListener$1$1$1() {
                    super(1);
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    FindProblemFragment.this.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setListener$1$1$2
                public FindProblemFragment$setListener$1$1$2() {
                    super(1);
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        FindProblemFragment findProblemFragment = FindProblemFragment.this;
                        if (!findProblemFragment.getViewModel().getFuseBusyList().contains(busyData)) {
                            findProblemFragment.getViewModel().getFuseBusyList().add(busyData);
                            findProblemFragment.setListener(findProblemFragment.getViewModel().getFuseBusyList());
                        }
                    }
                    FindProblemFragment.this.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }).invoke();
            this.dragListener = invoke;
            binding.mlFindProblem.setOnDragListener(invoke);
        }
    }

    public final void setFakeImageViewForHint() {
        FragmentFindProblemBinding binding = getBinding();
        binding.ivFindProblemVoltagePointBlack.setX(binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointBlack.setY(binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedOne.setX(binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedOne.setY(binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedTwo.setX(binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedTwo.setY(binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedThree.setX(binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedThree.setY(binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedFour.setX(binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedFour.setY(binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemFuseRedOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
    }

    public final void setHandStartCoordinate(int countHint) {
        FragmentFindProblemBinding binding = getBinding();
        switch (countHint) {
            case 1:
                FrameLayout blockFindProblemElementThree = binding.blockFindProblemElementThree;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementThree, "blockFindProblemElementThree");
                ViewExtensionKt.addViewObserver(blockFindProblemElementThree, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$1
                    public FindProblemFragment$setHandStartCoordinate$1$1() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        FrameLayout blockFindProblemElementThree2 = FragmentFindProblemBinding.this.blockFindProblemElementThree;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementThree2, "blockFindProblemElementThree");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemElementThree2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX());
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 2:
                FrameLayout blockFindProblemProbeBlack = binding.blockFindProblemProbeBlack;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeBlack, "blockFindProblemProbeBlack");
                ViewExtensionKt.addViewObserver(blockFindProblemProbeBlack, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$2
                    public FindProblemFragment$setHandStartCoordinate$1$2() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        FrameLayout blockFindProblemProbeBlack2 = FragmentFindProblemBinding.this.blockFindProblemProbeBlack;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeBlack2, "blockFindProblemProbeBlack");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemProbeBlack2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX() - (FragmentFindProblemBinding.this.blockFindProblemProbeBlack.getWidth() / 2));
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY() - (FragmentFindProblemBinding.this.blockFindProblemProbeBlack.getHeight() / 4));
                    }
                });
                break;
            case 3:
                FrameLayout blockFindProblemProbeRed = binding.blockFindProblemProbeRed;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeRed, "blockFindProblemProbeRed");
                ViewExtensionKt.addViewObserver(blockFindProblemProbeRed, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$3
                    public FindProblemFragment$setHandStartCoordinate$1$3() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        FrameLayout blockFindProblemProbeRed2 = FragmentFindProblemBinding.this.blockFindProblemProbeRed;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeRed2, "blockFindProblemProbeRed");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemProbeRed2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX() - (FragmentFindProblemBinding.this.blockFindProblemProbeRed.getWidth() / 2));
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY() - (FragmentFindProblemBinding.this.blockFindProblemProbeRed.getHeight() / 4));
                    }
                });
                break;
            case 5:
                ImageView ivFindProblemFuseGrayOne = binding.ivFindProblemFuseGrayOne;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne, "ivFindProblemFuseGrayOne");
                ViewExtensionKt.addViewObserver(ivFindProblemFuseGrayOne, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$4
                    public FindProblemFragment$setHandStartCoordinate$1$4() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        ImageView ivFindProblemFuseGrayOne2 = FragmentFindProblemBinding.this.ivFindProblemFuseGrayOne;
                        Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne2, "ivFindProblemFuseGrayOne");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemFuseGrayOne2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX());
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 6:
                FrameLayout blockFindProblemElementTwo = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo, "blockFindProblemElementTwo");
                ViewExtensionKt.addViewObserver(blockFindProblemElementTwo, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$5
                    public FindProblemFragment$setHandStartCoordinate$1$5() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        FrameLayout blockFindProblemElementTwo2 = FragmentFindProblemBinding.this.blockFindProblemElementTwo;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo2, "blockFindProblemElementTwo");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemElementTwo2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX() - (FragmentFindProblemBinding.this.blockFindProblemElementTwo.getWidth() / 2));
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 7:
                ImageView ivFindProblemVoltagePointRedOne = binding.ivFindProblemVoltagePointRedOne;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne, "ivFindProblemVoltagePointRedOne");
                ViewExtensionKt.addViewObserver(ivFindProblemVoltagePointRedOne, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$6
                    public FindProblemFragment$setHandStartCoordinate$1$6() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        ImageView ivFindProblemVoltagePointRedOne2 = FragmentFindProblemBinding.this.ivFindProblemVoltagePointRedOne;
                        Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne2, "ivFindProblemVoltagePointRedOne");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemVoltagePointRedOne2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX() - (FragmentFindProblemBinding.this.ivFindProblemVoltagePointRedOne.getWidth() / 2));
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 8:
                AppCompatButton btnFindProblemNext = binding.btnFindProblemNext;
                Intrinsics.checkNotNullExpressionValue(btnFindProblemNext, "btnFindProblemNext");
                ViewExtensionKt.addViewObserver(btnFindProblemNext, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$7
                    public FindProblemFragment$setHandStartCoordinate$1$7() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        AppCompatButton btnFindProblemNext2 = FragmentFindProblemBinding.this.btnFindProblemNext;
                        Intrinsics.checkNotNullExpressionValue(btnFindProblemNext2, "btnFindProblemNext");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(btnFindProblemNext2);
                        FragmentFindProblemBinding.this.ivFindProblemHand.setX(globalCenterPoint.getX() + (FragmentFindProblemBinding.this.btnFindProblemNext.getWidth() / 3));
                        FragmentFindProblemBinding.this.ivFindProblemHand.setY(globalCenterPoint.getY() - (FragmentFindProblemBinding.this.btnFindProblemNext.getHeight() / 3));
                    }
                });
                break;
        }
    }

    public final void createHandTranslateAnimation(ImageView endView) {
        FragmentFindProblemBinding binding = getBinding();
        ImageView ivFindProblemHand = binding.ivFindProblemHand;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemHand, "ivFindProblemHand");
        ViewExtensionKt.addViewObserver(ivFindProblemHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$createHandTranslateAnimation$1$1
            public final /* synthetic */ ImageView $endView;
            public final /* synthetic */ FindProblemFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FindProblemFragment$createHandTranslateAnimation$1$1(ImageView endView2, FindProblemFragment this) {
                super(0);
                r2 = endView2;
                r3 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                ImageView ivFindProblemHand2 = FragmentFindProblemBinding.this.ivFindProblemHand;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemHand2, "ivFindProblemHand");
                PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemHand2);
                PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(r2);
                ImageView imageView = FragmentFindProblemBinding.this.ivFindProblemHand;
                FindProblemFragment findProblemFragment = r3;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (globalCenterPoint2.getX() - globalCenterPoint.getX()) + (r2.getWidth() / 2), 0.0f, (globalCenterPoint2.getY() - globalCenterPoint.getY()) + (imageView.getHeight() / 2));
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setRepeatMode(1);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setDuration(2000L);
                imageView.startAnimation(translateAnimation);
                findProblemFragment.handTranslateAnimation = translateAnimation;
            }
        });
    }

    public final void createHandRotateAnimation() {
        FragmentFindProblemBinding binding = getBinding();
        ImageView ivFindProblemHand = binding.ivFindProblemHand;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemHand, "ivFindProblemHand");
        ViewExtensionKt.addViewObserver(ivFindProblemHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$createHandRotateAnimation$1$1
            public final /* synthetic */ FragmentFindProblemBinding $this_invoke;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FindProblemFragment$createHandRotateAnimation$1$1(FragmentFindProblemBinding binding2) {
                super(0);
                r2 = binding2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FindProblemFragment findProblemFragment = FindProblemFragment.this;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -30.0f, r2.ivFindProblemHand.getX() + (r2.ivFindProblemHand.getWidth() / 2), r2.ivFindProblemHand.getY() + (r2.ivFindProblemHand.getHeight() / 2));
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(2);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(700L);
                r2.ivFindProblemHand.startAnimation(rotateAnimation);
                findProblemFragment.handRotateAnimation = rotateAnimation;
            }
        });
    }

    public final void selectNextGame() {
        getParentViewModel().setLevelCounter(getViewModel().getUiState().getValue().isWin());
        if (getParentViewModel().getUiState().getValue().getLevelCounter() <= 2) {
            replaceFragment(FindProblemFragment.class);
        } else {
            replaceFragment(ChangeBulbFragment.class);
        }
    }

    private final void replaceFragment(Class<? extends Fragment> r5) {
        requireParentFragment().getChildFragmentManager().beginTransaction().replace(getId(), r5, BundleKt.bundleOf(TuplesKt.to(ElectricConstants.ELECTRIC_BUNDLE, getViewModel().getUiState().getValue().getScreenArgs()))).commit();
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 4, isShow, false, false, false, null, false, false, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, null);
    }

    private final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GameInstructionsDialog create = companion.create(requireContext, hintsList, new FindProblemFragment$createGameInstructionsDialog$1(getViewModel()));
        create.show();
        this.gameInstructionsDialog = create;
    }

    private final void clearListeners() {
        FragmentFindProblemBinding binding = getBinding();
        this.dragListener = null;
        binding.mlFindProblem.setOnDragListener(null);
    }

    public final void clearHandTranslateAnimation() {
        TranslateAnimation translateAnimation = this.handTranslateAnimation;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.handTranslateAnimation = null;
    }

    public final void clearHandRotateAnimation() {
        RotateAnimation rotateAnimation = this.handRotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.handRotateAnimation = null;
    }

    private final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }
}
