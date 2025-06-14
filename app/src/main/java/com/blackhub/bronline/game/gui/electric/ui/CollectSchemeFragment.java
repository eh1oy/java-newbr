package com.blackhub.bronline.game.gui.electric.ui;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.ts.H262Reader;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.BlockToggleSwitchElectricBinding;
import com.blackhub.bronline.databinding.FragmentCollectSchemeBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.LongExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectSchemeFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001GB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002J\u0016\u0010.\u001a\u00020)2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0011H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0012H\u0002J\u0010\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u00020#H\u0002J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020)H\u0016J\u0010\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020)H\u0002J\b\u0010E\u001a\u00020)H\u0002J\b\u0010F\u001a\u00020)H\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b%\u0010&¨\u0006H"}, d2 = {"Lcom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/electric/state/CollectSchemeUiState;", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel;", "Lcom/blackhub/bronline/databinding/FragmentCollectSchemeBinding;", "()V", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "gameInstructionsDialog", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "handTranslateAnimation", "Landroid/view/animation/TranslateAnimation;", "listElementScheme", "", "", "listElementSwitch", "", "parentViewModel", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "screenArgs", "", "getScreenArgs", "()Ljava/lang/String;", "screenArgs$delegate", "timer", "Landroid/os/CountDownTimer;", "togglesList", "Lcom/blackhub/bronline/databinding/BlockToggleSwitchElectricBinding;", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel;", "viewModel$delegate", "blockingLoader", "", "isShow", "", "checkedLists", "clearHandAnimation", "createGameInstructionsDialog", "hintsList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "createHandAnimation", "createTimer", "dismissGameInstructionsDialog", "enableTrafficLight", "handleUiState", "uiState", "initViews", "mapIvToInt", "id", "mapRbToInt", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "setBulbColorToggleOn", SVG.View.NODE_NAME, "Landroid/view/View;", "setForBlockWithToggleSwitchOnCheckedChangeListener", "rbBlock", "setListeners", "setRandom", "timerStop", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectSchemeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n106#2,15:335\n106#2,15:350\n41#3:365\n42#3:368\n41#3,2:369\n1855#4,2:366\n1855#4,2:371\n*S KotlinDebug\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment\n*L\n61#1:335,15\n64#1:350,15\n177#1:365\n177#1:368\n197#1:369,2\n190#1:366,2\n239#1:371,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeFragment extends BaseFragmentWithState<CollectSchemeUiState, CollectSchemeViewModel, FragmentCollectSchemeBinding> {
    public static final long INTERVAL_IN_MILLIS = 1000;
    public static final int RANDOM_FROM = 3;
    public static final int RANDOM_TO = 6;
    public static final long TOTAL_TIME_IN_MILLIS = 60000;

    @Inject
    public MainViewModelFactory<CollectSchemeViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public TranslateAnimation handTranslateAnimation;

    @NotNull
    public List<Integer> listElementScheme;

    @NotNull
    public List<Integer> listElementSwitch;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    @Nullable
    public CountDownTimer timer;

    @NotNull
    public List<BlockToggleSwitchElectricBinding> togglesList;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$2.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public CollectSchemeFragment() {
        /*
            r7 = this;
            r0 = 2131558564(0x7f0d00a4, float:1.8742447E38)
            r7.<init>(r0)
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$viewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$viewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$1 r1 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$1
            r1.<init>()
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$2 r3 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$2
            r3.<init>()
            kotlin.Lazy r1 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r3)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel> r3 = com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$3 r4 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$3
            r4.<init>()
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$4 r5 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$4
            r6 = 0
            r5.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r3, r4, r5, r0)
            r7.viewModel = r0
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$parentViewModel$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$parentViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$6 r1 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$6
            r1.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r2, r1)
            java.lang.Class<com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel> r1 = com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$7 r2 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$7
            r2.<init>()
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$8 r3 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$8
            r3.<init>()
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$9 r4 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$9
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r1, r2, r3, r4)
            r7.parentViewModel = r0
            com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$screenArgs$2 r0 = new com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$screenArgs$2
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r7.screenArgs = r0
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r7.togglesList = r0
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r7.listElementScheme = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.listElementSwitch = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment.<init>():void");
    }

    @NotNull
    public final MainViewModelFactory<CollectSchemeViewModel> getFactory() {
        MainViewModelFactory<CollectSchemeViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<CollectSchemeViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public CollectSchemeViewModel getViewModel() {
        return (CollectSchemeViewModel) this.viewModel.getValue();
    }

    public final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
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
            CollectSchemeViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        getParentViewModel().sendStartMiniGame();
        setRandom();
        setListeners();
        if (getViewModel().getUiState().getValue().isFirstGame()) {
            return;
        }
        createTimer();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull CollectSchemeUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        blockingLoader(uiState.isBlockingLoading());
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        Boolean isWin = uiState.isWin();
        if (isWin != null) {
            getParentViewModel().sendFinishMiniGame(isWin.booleanValue());
        }
        if (uiState.isHandViewShow()) {
            createHandAnimation();
        } else {
            clearHandAnimation();
        }
        if (uiState.isInstructionsShow() || uiState.isTimerStart()) {
            return;
        }
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        getViewModel().startTimer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        dismissGameInstructionsDialog();
        timerStop();
        clearHandAnimation();
        super.onDestroy();
    }

    public final void createTimer() {
        this.timer = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$createTimer$1
            public CollectSchemeFragment$createTimer$1() {
                super(60000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                FragmentCollectSchemeBinding binding;
                binding = CollectSchemeFragment.this.getBinding();
                binding.tvCollectSchemeTime.setText(LongExtensionKt.parseTimeToStringWithFormat(millisUntilFinished));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                FragmentCollectSchemeBinding binding;
                ElectricViewModel parentViewModel;
                binding = CollectSchemeFragment.this.getBinding();
                binding.tvCollectSchemeTime.setText(CollectSchemeFragment.this.getString(R.string.common_time_zero));
                parentViewModel = CollectSchemeFragment.this.getParentViewModel();
                parentViewModel.sendFinishMiniGame(false);
            }
        };
    }

    public final void setRandom() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CollectSchemeFragment$setRandom$1(this, null), 3, null);
    }

    private final void setListeners() {
        FragmentCollectSchemeBinding binding = getBinding();
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneOne = binding.rbCollectSchemeToggleSwitchOneOne;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneOne, "rbCollectSchemeToggleSwitchOneOne");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneTwo = binding.rbCollectSchemeToggleSwitchOneTwo;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneTwo, "rbCollectSchemeToggleSwitchOneTwo");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneThree = binding.rbCollectSchemeToggleSwitchOneThree;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneThree, "rbCollectSchemeToggleSwitchOneThree");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFour = binding.rbCollectSchemeToggleSwitchOneFour;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneFour, "rbCollectSchemeToggleSwitchOneFour");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFive = binding.rbCollectSchemeToggleSwitchOneFive;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneFive, "rbCollectSchemeToggleSwitchOneFive");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoOne = binding.rbCollectSchemeToggleSwitchTwoOne;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoOne, "rbCollectSchemeToggleSwitchTwoOne");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoTwo = binding.rbCollectSchemeToggleSwitchTwoTwo;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoTwo, "rbCollectSchemeToggleSwitchTwoTwo");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoThree = binding.rbCollectSchemeToggleSwitchTwoThree;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoThree, "rbCollectSchemeToggleSwitchTwoThree");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFour = binding.rbCollectSchemeToggleSwitchTwoFour;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoFour, "rbCollectSchemeToggleSwitchTwoFour");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFive = binding.rbCollectSchemeToggleSwitchTwoFive;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoFive, "rbCollectSchemeToggleSwitchTwoFive");
        List<BlockToggleSwitchElectricBinding> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BlockToggleSwitchElectricBinding[]{rbCollectSchemeToggleSwitchOneOne, rbCollectSchemeToggleSwitchOneTwo, rbCollectSchemeToggleSwitchOneThree, rbCollectSchemeToggleSwitchOneFour, rbCollectSchemeToggleSwitchOneFive, rbCollectSchemeToggleSwitchTwoOne, rbCollectSchemeToggleSwitchTwoTwo, rbCollectSchemeToggleSwitchTwoThree, rbCollectSchemeToggleSwitchTwoFour, rbCollectSchemeToggleSwitchTwoFive});
        this.togglesList = listOf;
        Iterator<T> it = listOf.iterator();
        while (it.hasNext()) {
            setForBlockWithToggleSwitchOnCheckedChangeListener((BlockToggleSwitchElectricBinding) it.next());
        }
    }

    public final void createHandAnimation() {
        FragmentCollectSchemeBinding binding = getBinding();
        ImageView ivCollectSchemeHand = binding.ivCollectSchemeHand;
        Intrinsics.checkNotNullExpressionValue(ivCollectSchemeHand, "ivCollectSchemeHand");
        ViewExtensionKt.addViewObserver(ivCollectSchemeHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$createHandAnimation$1$1
            public final /* synthetic */ CollectSchemeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CollectSchemeFragment$createHandAnimation$1$1(CollectSchemeFragment this) {
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
                ImageView imageView = FragmentCollectSchemeBinding.this.ivCollectSchemeHand;
                CollectSchemeFragment collectSchemeFragment = r2;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, imageView.getHeight() / 2.0f);
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setRepeatMode(2);
                translateAnimation.setInterpolator(new LinearInterpolator());
                translateAnimation.setDuration(700L);
                imageView.startAnimation(translateAnimation);
                collectSchemeFragment.handTranslateAnimation = translateAnimation;
            }
        });
    }

    public final void clearHandAnimation() {
        TranslateAnimation translateAnimation = this.handTranslateAnimation;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.handTranslateAnimation = null;
    }

    public final void setForBlockWithToggleSwitchOnCheckedChangeListener(BlockToggleSwitchElectricBinding rbBlock) {
        rbBlock.toggle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$$ExternalSyntheticLambda0
            public final /* synthetic */ BlockToggleSwitchElectricBinding f$1;

            public /* synthetic */ CollectSchemeFragment$$ExternalSyntheticLambda0(BlockToggleSwitchElectricBinding rbBlock2) {
                r2 = rbBlock2;
            }

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                CollectSchemeFragment.setForBlockWithToggleSwitchOnCheckedChangeListener$lambda$5(CollectSchemeFragment.this, r2, radioGroup, i);
            }
        });
    }

    public static final void setForBlockWithToggleSwitchOnCheckedChangeListener$lambda$5(CollectSchemeFragment this$0, BlockToggleSwitchElectricBinding rbBlock, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rbBlock, "$rbBlock");
        int mapRbToInt = this$0.mapRbToInt(rbBlock);
        switch (i) {
            case R.id.switch_off /* 2131364105 */:
                rbBlock.ivToggleSwitchBulbColor.setBackgroundResource(R.drawable.img_bulb_circle_red);
                this$0.listElementSwitch.remove(Integer.valueOf(mapRbToInt));
                this$0.checkedLists();
                break;
            case R.id.switch_on /* 2131364106 */:
                rbBlock.ivToggleSwitchBulbColor.setBackgroundResource(R.drawable.img_bulb_circle_green);
                this$0.listElementSwitch.add(Integer.valueOf(mapRbToInt));
                if ((!this$0.listElementSwitch.isEmpty()) && this$0.listElementSwitch.size() == 1) {
                    this$0.getViewModel().turnOnHintThree();
                }
                if (this$0.listElementScheme.contains(Integer.valueOf(mapRbToInt))) {
                    this$0.checkedLists();
                    break;
                } else {
                    CollectSchemeViewModel viewModel = this$0.getViewModel();
                    String string = this$0.getString(R.string.electric_collect_scheme_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    viewModel.showErrorMessage(string);
                    Iterator<T> it = this$0.togglesList.iterator();
                    while (it.hasNext()) {
                        ((BlockToggleSwitchElectricBinding) it.next()).toggle.check(R.id.switch_off);
                    }
                    break;
                }
        }
    }

    public final void checkedLists() {
        if (Intrinsics.areEqual(CollectionsKt___CollectionsKt.sorted(this.listElementSwitch), this.listElementScheme)) {
            CountDownTimer countDownTimer = this.timer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            enableTrafficLight();
        }
    }

    public final void enableTrafficLight() {
        getViewModel().changeColorTrafficLight();
    }

    public final void setBulbColorToggleOn(View r2) {
        r2.setBackgroundResource(R.drawable.img_bulb_circle_green);
    }

    public final int mapRbToInt(BlockToggleSwitchElectricBinding id) {
        FragmentCollectSchemeBinding binding = getBinding();
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneOne)) {
            return 11;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneTwo)) {
            return 12;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneThree)) {
            return 13;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneFour)) {
            return 14;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneFive)) {
            return 15;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoOne)) {
            return 21;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoTwo)) {
            return 22;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoThree)) {
            return 23;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoFour)) {
            return 24;
        }
        return Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoFive) ? 25 : 0;
    }

    public final int mapIvToInt(int id) {
        FragmentCollectSchemeBinding binding = getBinding();
        if (id == binding.ivCollectSchemeBulbColorSchemeOneOne.getId()) {
            return 11;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneTwo.getId()) {
            return 12;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneThree.getId()) {
            return 13;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneFour.getId()) {
            return 14;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneFive.getId()) {
            return 15;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoOne.getId()) {
            return 21;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoTwo.getId()) {
            return 22;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoThree.getId()) {
            return 23;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoFour.getId()) {
            return 24;
        }
        return id == binding.ivCollectSchemeBulbColorSchemeTwoFive.getId() ? 25 : 0;
    }

    public final void timerStop() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GameInstructionsDialog create = companion.create(requireContext, hintsList, new CollectSchemeFragment$createGameInstructionsDialog$1(getViewModel()));
        create.show();
        this.gameInstructionsDialog = create;
    }

    public final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 3, isShow, false, false, false, null, true, false, H262Reader.START_GROUP, null);
    }
}
