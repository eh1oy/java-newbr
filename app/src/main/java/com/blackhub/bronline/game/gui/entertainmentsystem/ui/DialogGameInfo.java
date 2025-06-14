package com.blackhub.bronline.game.gui.entertainmentsystem.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.databinding.EntertainmentSystemDialogInfoBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.caverock.androidsvg.SVG;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogGameInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\u0017H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo;", "Landroidx/fragment/app/DialogFragment;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_binding", "Lcom/blackhub/bronline/databinding/EntertainmentSystemDialogInfoBinding;", "anim", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/blackhub/bronline/databinding/EntertainmentSystemDialogInfoBinding;", "gamesViewModel", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "getGamesViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "gamesViewModel$delegate", "initClickListeners", "", "initDialogInfo", "gamesTitle", "", "gamesDescription", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onDestroyView", "onStart", "onViewCreated", SVG.View.NODE_NAME, "setObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogGameInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogGameInfo.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,96:1\n106#2,15:97\n*S KotlinDebug\n*F\n+ 1 DialogGameInfo.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/DialogGameInfo\n*L\n24#1:97,15\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogGameInfo extends DialogFragment {
    public static final int $stable = 8;

    @Nullable
    public EntertainmentSystemDialogInfoBinding _binding;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final Context context;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public DialogGameInfo(@org.jetbrains.annotations.NotNull android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.<init>()
            r4.context = r5
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$gamesViewModel$2 r5 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$gamesViewModel$2
            r5.<init>()
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$1 r1 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$1
            r1.<init>()
            kotlin.Lazy r5 = kotlin.LazyKt__LazyJVMKt.lazy(r0, r1)
            java.lang.Class<com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel> r0 = com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$2 r1 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$2
            r1.<init>()
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$3 r2 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$3
            r3 = 0
            r2.<init>()
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$4 r3 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$special$$inlined$viewModels$default$4
            r3.<init>()
            kotlin.Lazy r5 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r4, r0, r1, r2, r3)
            r4.gamesViewModel = r5
            com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$anim$2 r5 = new com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$anim$2
            r5.<init>()
            kotlin.Lazy r5 = kotlin.LazyKt__LazyJVMKt.lazy(r5)
            r4.anim = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo.<init>(android.content.Context):void");
    }

    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    public final EntertainmentSystemDialogInfoBinding getBinding() {
        EntertainmentSystemDialogInfoBinding entertainmentSystemDialogInfoBinding = this._binding;
        Intrinsics.checkNotNull(entertainmentSystemDialogInfoBinding);
        return entertainmentSystemDialogInfoBinding;
    }

    private final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup r2, @Nullable Bundle r3) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        EntertainmentSystemDialogInfoBinding inflate = EntertainmentSystemDialogInfoBinding.inflate(inflater);
        this._binding = inflate;
        if (inflate != null) {
            return inflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View r2, @Nullable Bundle r3) {
        Intrinsics.checkNotNullParameter(r2, "view");
        super.onViewCreated(r2, r3);
        setObservers();
        initClickListeners();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setFlags(8, 8);
        }
        super.onStart();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        UsefulKt.hideSystemUIWindow(window);
        window.clearFlags(8);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new DialogGameInfo$setObservers$1(this, null));
    }

    public final void initDialogInfo(String gamesTitle, String gamesDescription) {
        EntertainmentSystemDialogInfoBinding binding = getBinding();
        TextView textView = binding.dialogInfoTitleItem;
        if (gamesTitle == null) {
            gamesTitle = "";
        }
        textView.setText(gamesTitle);
        TextView textView2 = binding.dialogInfoBodyItem;
        if (gamesDescription == null) {
            gamesDescription = "";
        }
        textView2.setText(gamesDescription);
    }

    public final void initClickListeners() {
        getBinding().dialogInfoButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$$ExternalSyntheticLambda0
            public /* synthetic */ DialogGameInfo$$ExternalSyntheticLambda0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogGameInfo.initClickListeners$lambda$2(DialogGameInfo.this, view);
            }
        });
    }

    public static final void initClickListeners$lambda$2(DialogGameInfo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation anim = this$0.getAnim();
        Intrinsics.checkNotNullExpressionValue(anim, "<get-anim>(...)");
        AnyExtensionKt.setActionOnAnimationEnd(anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.DialogGameInfo$initClickListeners$1$1
            public DialogGameInfo$initClickListeners$1$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                DialogGameInfo.this.dismiss();
            }
        });
        view.startAnimation(this$0.getAnim());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }
}
