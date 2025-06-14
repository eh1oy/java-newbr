package com.blackhub.bronline.game.gui.menupausesettingandmap.ui;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.FragmentMenuMapBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuMapUi.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuMapUi;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuMapBinding;", "()V", "pauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "pauseViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initViews", "", "onButtonBackSetOnClickListener", "onDestroyView", "onMapSetOnTouchListener", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuMapUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuMapUi\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,75:1\n106#2,15:76\n*S KotlinDebug\n*F\n+ 1 MenuMapUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuMapUi\n*L\n14#1:76,15\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuMapUi extends BaseFragment<FragmentMenuMapBinding> {
    public static final int $stable = 8;

    /* renamed from: pauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy pauseViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public MenuMapUi() {
        /*
            r5 = this;
            r5.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$pauseViewModel$2 r0 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$pauseViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel> r1 = com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.pauseViewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi.<init>():void");
    }

    public final MenuPauseViewModel getPauseViewModel() {
        return (MenuPauseViewModel) this.pauseViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuMapBinding getViewBinding() {
        FragmentMenuMapBinding inflate = FragmentMenuMapBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        onButtonBackSetOnClickListener();
        onMapSetOnTouchListener();
        JNILib.toggleDrawing2dStuff(false);
    }

    public final void onButtonBackSetOnClickListener() {
        AppCompatButton newMenuMapButtonBackToMenu = getBinding().newMenuMapButtonBackToMenu;
        Intrinsics.checkNotNullExpressionValue(newMenuMapButtonBackToMenu, "newMenuMapButtonBackToMenu");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuMapButtonBackToMenu, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$onButtonBackSetOnClickListener$1
            public MenuMapUi$onButtonBackSetOnClickListener$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                MenuPauseViewModel pauseViewModel;
                MenuPauseViewModel pauseViewModel2;
                pauseViewModel = MenuMapUi.this.getPauseViewModel();
                pauseViewModel.actionsWithJSONClickButton(2);
                MenuMapUi.this.requireParentFragment().getChildFragmentManager().beginTransaction().remove(MenuMapUi.this).commit();
                pauseViewModel2 = MenuMapUi.this.getPauseViewModel();
                pauseViewModel2.buttonClicked(0);
            }
        }, 1, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onMapSetOnTouchListener() {
        getBinding().getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onMapSetOnTouchListener$lambda$0;
                onMapSetOnTouchListener$lambda$0 = MenuMapUi.onMapSetOnTouchListener$lambda$0(view, motionEvent);
                return onMapSetOnTouchListener$lambda$0;
            }
        });
    }

    public static final boolean onMapSetOnTouchListener$lambda$0(View view, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (pointerId == 0) {
                i = (int) motionEvent.getX(i7);
                i2 = (int) motionEvent.getY(i7);
            } else if (pointerId == 1) {
                i3 = (int) motionEvent.getX(i7);
                i4 = (int) motionEvent.getY(i7);
            } else if (pointerId == 2) {
                i5 = (int) motionEvent.getX(i7);
                i6 = (int) motionEvent.getY(i7);
            }
        }
        JNILib.multiTouchEvent(motionEvent.getActionMasked(), motionEvent.getPointerId(motionEvent.getActionIndex()), i, i2, i3, i4, i5, i6);
        return true;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        JNILib.toggleDrawing2dStuff(true);
        super.onDestroyView();
    }
}
