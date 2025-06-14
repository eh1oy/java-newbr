package com.blackhub.bronline.game.gui.tuning.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.TuningFragmentDetailsListBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UILayoutTuningDetailsList.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u00101\u001a\u0002022\u0010\u00103\u001a\f\u0012\u0006\b\u0001\u0012\u000205\u0018\u000104H\u0002J\b\u00106\u001a\u000202H\u0002J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u00109\u001a\u00020\u0002H\u0016J\b\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u000202H\u0002J\b\u0010<\u001a\u000202H\u0002J\b\u0010=\u001a\u000202H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0002J\b\u0010B\u001a\u000202H\u0002J\u0010\u0010C\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010D\u001a\u000202H\u0016J\b\u0010E\u001a\u000202H\u0002J\b\u0010F\u001a\u000202H\u0016J\u0010\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0005H\u0002J\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020\u0005H\u0002J\u0018\u0010K\u001a\u0002022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0012\u0010L\u001a\u0002022\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\u0012\u0010O\u001a\u0002022\b\u0010P\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u00020\u0005H\u0002J\b\u0010S\u001a\u000202H\u0002J\b\u0010T\u001a\u000202H\u0002J\u0010\u0010U\u001a\u0002022\u0006\u0010V\u001a\u00020\u0005H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u0005H\u0002J\u0018\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u000202H\u0002J\u0012\u0010_\u001a\u0002022\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0010\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010'R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b.\u0010/¨\u0006e"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentDetailsListBinding;", "()V", "carId", "", "clickDetail", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter$OnClickDetailItem;", "clickVinyl", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;", "currentAction", "currentCost", "currentCurrency", "currentId", "currentSelector", "currentTitle", "", "detailsAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter;", "detailsListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "getDetailsListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "detailsListViewModel$delegate", "Lkotlin/Lazy;", "dialogOpeningBox", "Lcom/blackhub/bronline/game/gui/tuning/ui/DialogOpeningBox;", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "ifGetType", "", "ifInitInterface", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "tuningVinylsAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter;", "typeOfDetail", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "attachAdapterToView", "", "myAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "closeDialogs", "getStartData", "jsonString", "getViewBinding", "initDetailAdapter", "initDialogApply", "initDialogApplyClickListener", "initDialogOpenBox", "initDialogReset", "initListeners", "initObjects", "initOnClickDetail", "initOnClickVinyl", "initResetClickListener", "initViews", "initVinylAdapter", "onDestroyView", "prepareResetButton", "selectorId", "previewDetailOrPlaySound", "tuneId", "setCostInView", "setIconOnButton", "icon", "Landroid/graphics/drawable/Drawable;", "setNameThisWindow", "nameWindow", "setNewParamsForPriceBlock", "currentSize", "setNullableParameters", "setObservers", "setVisibleBody", "valueOfVisible", "setVisibleForInfoBrake", "setVisibleForResetButton", "isVisible", "setVisiblePriceBlock", "ifVisible", "ifBoth", "showDialogOpeningBox", "showDialogReset", "updateButtonViewForDetail", "currentObject", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "updateButtonViewForVinyl", "currentVinyl", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningDetailsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningDetailsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,653:1\n106#2,15:654\n106#2,15:669\n106#2,15:684\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningDetailsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList\n*L\n69#1:654,15\n70#1:669,15\n71#1:684,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningDetailsList extends BaseFragment<TuningFragmentDetailsListBinding> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public TuningDetailsAdapter.OnClickDetailItem clickDetail;

    @Nullable
    public TuningVinylsAdapter.OnClickVinylItem clickVinyl;
    public int currentAction;
    public int currentCost;
    public int currentCurrency;
    public int currentId;
    public int currentSelector;

    @NotNull
    public String currentTitle;

    @Nullable
    public TuningDetailsAdapter detailsAdapter;

    /* renamed from: detailsListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy detailsListViewModel;

    @Nullable
    public DialogOpeningBox dialogOpeningBox;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;
    public boolean ifGetType;
    public boolean ifInitInterface;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    @Nullable
    public TuningVinylsAdapter tuningVinylsAdapter;
    public int typeOfDetail;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$1.<init>(kotlin.jvm.functions.Function0):void, class status: GENERATED_AND_UNLOADED
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
    public UILayoutTuningDetailsList() {
        /*
            r7 = this;
            r7.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$detailsListViewModel$2 r0 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$detailsListViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel> r2 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$2 r3 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$2
            r3.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$3 r4 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$3
            r5 = 0
            r4.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$4 r6 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$4
            r6.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r6)
            r7.detailsListViewModel = r0
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$tuningViewModel$2 r0 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$tuningViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$5 r2 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$5
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel> r2 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$6 r3 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$6
            r3.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$7 r4 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$7
            r4.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$8 r6 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$8
            r6.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r2, r3, r4, r6)
            r7.tuningViewModel = r0
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$viewCarViewModel$2 r0 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$viewCarViewModel$2
            r0.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$9 r2 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$9
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel> r1 = com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$10 r2 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$10
            r2.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$11 r3 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$11
            r3.<init>()
            com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$12 r4 = new com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$12
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r7, r1, r2, r3, r4)
            r7.viewCarViewModel = r0
            com.blackhub.bronline.game.common.TimeChecker r0 = new com.blackhub.bronline.game.common.TimeChecker
            r0.<init>()
            r7.timeChecker = r0
            r0 = 1
            r7.ifInitInterface = r0
            r0 = -1
            r7.currentSelector = r0
            r7.currentAction = r0
            r7.currentId = r0
            java.lang.String r1 = ""
            r7.currentTitle = r1
            r7.typeOfDetail = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.<init>():void");
    }

    public final TuningDetailsListViewModel getDetailsListViewModel() {
        return (TuningDetailsListViewModel) this.detailsListViewModel.getValue();
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    private final void getStartData(String jsonString) {
        if (jsonString != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                this.currentSelector = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
                this.carId = jSONObject.optInt(TuningConstants.CAR_ID_JSON);
                String optString = jSONObject.optString(TuningConstants.TITLE_JSON);
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                this.currentTitle = optString;
            } catch (JSONException e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentDetailsListBinding getViewBinding() {
        TuningFragmentDetailsListBinding inflate = TuningFragmentDetailsListBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        prepareResetButton(this.currentSelector);
        initObjects();
        setNameThisWindow(this.currentTitle);
        setObservers();
        initListeners();
    }

    public final void prepareResetButton(int selectorId) {
        switch (selectorId) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                break;
            default:
                switch (selectorId) {
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                        break;
                    default:
                        this.ifGetType = false;
                        setVisibleForResetButton(0);
                        break;
                }
        }
        this.ifGetType = true;
        setVisibleForResetButton(4);
    }

    public final void setVisibleForResetButton(int isVisible) {
        getBinding().buttonResetDetail.setVisibility(isVisible);
    }

    private final void initObjects() {
        initDialogApply();
        initDialogReset(this.currentSelector);
    }

    private final void initDialogApply() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(requireActivity);
        initDialogApplyClickListener();
    }

    private final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initDialogApplyClickListener$1
            public UILayoutTuningDetailsList$initDialogApplyClickListener$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                int i;
                TuningDetailsListViewModel detailsListViewModel;
                int i2;
                TuningDetailsListViewModel detailsListViewModel2;
                int i3;
                if (z) {
                    i = UILayoutTuningDetailsList.this.currentSelector;
                    if (i == 2) {
                        detailsListViewModel2 = UILayoutTuningDetailsList.this.getDetailsListViewModel();
                        i3 = UILayoutTuningDetailsList.this.currentId;
                        detailsListViewModel2.sendBuyVinyl(i3);
                    } else {
                        detailsListViewModel = UILayoutTuningDetailsList.this.getDetailsListViewModel();
                        i2 = UILayoutTuningDetailsList.this.currentId;
                        detailsListViewModel.sendBuyNewDetail(i2);
                    }
                }
            }
        });
    }

    private final void initDialogReset(int currentSelector) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(requireActivity);
        initResetClickListener(currentSelector);
    }

    private final void initResetClickListener(int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initResetClickListener$1
            public final /* synthetic */ int $currentSelector;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UILayoutTuningDetailsList$initResetClickListener$1(int currentSelector2) {
                super(1);
                r2 = currentSelector2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                TuningMainViewModel tuningViewModel;
                int i;
                boolean z2;
                if (z) {
                    tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
                    int i2 = r2;
                    i = UILayoutTuningDetailsList.this.typeOfDetail;
                    tuningViewModel.applyResetDetails(i2, i);
                    z2 = UILayoutTuningDetailsList.this.ifGetType;
                    if (z2) {
                        UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                    }
                }
            }
        });
    }

    public final void setNameThisWindow(String nameWindow) {
        getBinding().titleDetailsList.setText(nameWindow);
    }

    private final void setObservers() {
        if (this.currentSelector == 2) {
            initOnClickVinyl();
            initVinylAdapter();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$1(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$2(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$3(this, null), 3, null);
        } else {
            initOnClickDetail();
            initDetailAdapter();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$4(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$5(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$6(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UILayoutTuningDetailsList$setObservers$7(this, null), 3, null);
    }

    public final void initOnClickVinyl() {
        this.clickVinyl = new TuningVinylsAdapter.OnClickVinylItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initOnClickVinyl$1
            public UILayoutTuningDetailsList$initOnClickVinyl$1() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter.OnClickVinylItem
            public void click(@NotNull TuneVinylsObj tuneVinyl, int getPosition, @Nullable View r5) {
                TimeChecker timeChecker;
                TuningVinylsAdapter tuningVinylsAdapter;
                TuningDetailsListViewModel detailsListViewModel;
                Intrinsics.checkNotNullParameter(tuneVinyl, "tuneVinyl");
                timeChecker = UILayoutTuningDetailsList.this.timeChecker;
                if (timeChecker.ifAccess(250L)) {
                    tuneVinyl.setSelected(true);
                    tuningVinylsAdapter = UILayoutTuningDetailsList.this.tuningVinylsAdapter;
                    if (tuningVinylsAdapter != null) {
                        tuningVinylsAdapter.notifyItemChanged(getPosition);
                        tuningVinylsAdapter.setOnlyVinylClickable(getPosition);
                    }
                    UILayoutTuningDetailsList.this.currentId = tuneVinyl.getId();
                    UILayoutTuningDetailsList.this.updateButtonViewForVinyl(tuneVinyl);
                    detailsListViewModel = UILayoutTuningDetailsList.this.getDetailsListViewModel();
                    detailsListViewModel.previewVinyl(tuneVinyl.getNameVinyl());
                }
            }
        };
    }

    public final void updateButtonViewForVinyl(TuneVinylsObj currentVinyl) {
        if (currentVinyl.getStartVinyl()) {
            this.currentAction = -1;
            setVisiblePriceBlock(false, true);
        } else {
            this.currentAction = 1;
            setCostInView(0, this.currentCost);
            setIconOnButton(null);
            setVisiblePriceBlock(true, true);
        }
    }

    public final void setVisiblePriceBlock(boolean ifVisible, boolean ifBoth) {
        int i;
        int i2 = 0;
        if (ifVisible && ifBoth) {
            i = 0;
        } else {
            i = 4;
            if (!ifVisible || ifBoth) {
                i2 = 4;
            }
        }
        getBinding().tuningPriceDetail.setVisibility(i2);
        getBinding().titlePriceBlockDetails.setVisibility(i);
    }

    public final void setCostInView(int currentCurrency, int currentCost) {
        if (currentCurrency == 0) {
            getBinding().tuningPriceDetail.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        } else {
            if (currentCurrency != 1) {
                return;
            }
            getBinding().tuningPriceDetail.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        }
    }

    public final void setIconOnButton(Drawable icon) {
        getBinding().tuningPriceDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(icon, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void initVinylAdapter() {
        this.tuningVinylsAdapter = new TuningVinylsAdapter(this, this.clickVinyl, getDetailsListViewModel());
    }

    public final void attachAdapterToView(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> myAdapter) {
        RecyclerView recyclerView = getBinding().recvDetailsList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(myAdapter);
    }

    public final void setNewParamsForPriceBlock(int currentSize) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(19, R.id.help_view_in_detail_list);
        layoutParams.addRule(8, R.id.help_view_in_detail_list);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(19, R.id.help_view_above_list_in_detail_list);
        layoutParams2.addRule(8, R.id.help_view_above_list_in_detail_list);
        if (currentSize < 4) {
            getBinding().menuBlockDetail.setLayoutParams(layoutParams);
        } else {
            getBinding().menuBlockDetail.setLayoutParams(layoutParams2);
        }
    }

    public final void initOnClickDetail() {
        this.clickDetail = new TuningDetailsAdapter.OnClickDetailItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initOnClickDetail$1
            public UILayoutTuningDetailsList$initOnClickDetail$1() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter.OnClickDetailItem
            public void click(@NotNull TuneObj detailsItem, int getPosition, @Nullable View r5) {
                TimeChecker timeChecker;
                TuningDetailsAdapter tuningDetailsAdapter;
                boolean z;
                int i;
                Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
                timeChecker = UILayoutTuningDetailsList.this.timeChecker;
                if (timeChecker.ifAccess(250L)) {
                    detailsItem.setChecked(true);
                    tuningDetailsAdapter = UILayoutTuningDetailsList.this.detailsAdapter;
                    if (tuningDetailsAdapter != null) {
                        tuningDetailsAdapter.notifyItemChanged(getPosition);
                        tuningDetailsAdapter.setOnlyDetailClickable(getPosition);
                    }
                    UILayoutTuningDetailsList.this.currentCost = detailsItem.getCost();
                    UILayoutTuningDetailsList.this.currentCurrency = detailsItem.getCurrency();
                    UILayoutTuningDetailsList.this.currentId = detailsItem.getId();
                    UILayoutTuningDetailsList.this.updateButtonViewForDetail(detailsItem);
                    UILayoutTuningDetailsList.this.previewDetailOrPlaySound(detailsItem.getTuneId());
                    z = UILayoutTuningDetailsList.this.ifGetType;
                    if (z) {
                        UILayoutTuningDetailsList uILayoutTuningDetailsList = UILayoutTuningDetailsList.this;
                        if (detailsItem.getThisLocation() == 2) {
                            UILayoutTuningDetailsList.this.setVisibleForResetButton(0);
                            i = detailsItem.getType();
                        } else {
                            UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                            i = -1;
                        }
                        uILayoutTuningDetailsList.typeOfDetail = i;
                    }
                }
            }
        };
    }

    public final void updateButtonViewForDetail(TuneObj currentObject) {
        Drawable drawable;
        if (currentObject == null) {
            return;
        }
        if (currentObject.getType() == -1) {
            this.currentAction = 3;
            drawable = ContextCompat.getDrawable(getBinding().getRoot().getContext(), R.drawable.tuning_icon_box_white);
            getBinding().tuningPriceDetail.setText(R.string.common_view);
            setVisiblePriceBlock(true, false);
        } else {
            int thisLocation = currentObject.getThisLocation();
            if (thisLocation == 0) {
                this.currentAction = 1;
                setCostInView(currentObject.getCurrency(), currentObject.getCost());
                setVisiblePriceBlock(true, true);
            } else if (thisLocation == 1) {
                this.currentAction = 5;
                drawable = ContextCompat.getDrawable(getBinding().getRoot().getContext(), R.drawable.tuning_repair);
                getBinding().tuningPriceDetail.setText(R.string.tuning_title_button_set_detail);
                setVisiblePriceBlock(true, false);
            } else if (thisLocation == 2) {
                this.currentAction = -1;
                setVisiblePriceBlock(false, true);
            }
            drawable = null;
        }
        setIconOnButton(drawable);
    }

    public final void previewDetailOrPlaySound(int tuneId) {
        Iterator<Integer> it = TuningConstants.INSTANCE.getActiveSelectorListForPreview().iterator();
        while (it.hasNext()) {
            if (this.currentSelector == it.next().intValue()) {
                getDetailsListViewModel().previewDetail(tuneId);
                return;
            }
        }
        Iterator<Integer> it2 = TuningConstants.INSTANCE.getActiveSelectorListForSoundPlay().iterator();
        while (it2.hasNext()) {
            if (this.currentSelector == it2.next().intValue()) {
                getDetailsListViewModel().playSound(tuneId);
                return;
            }
        }
    }

    public final void initDetailAdapter() {
        this.detailsAdapter = new TuningDetailsAdapter(this.clickDetail);
    }

    public final void setVisibleBody(int valueOfVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(valueOfVisible);
        if (valueOfVisible == 0) {
            root.bringToFront();
        }
    }

    public final void setVisibleForInfoBrake() {
        Iterator<Integer> it = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == this.currentSelector) {
                getBinding().buttonInfoBrake.setVisibility(0);
                return;
            }
        }
    }

    private final void initListeners() {
        AppCompatButton tuningPriceDetail = getBinding().tuningPriceDetail;
        Intrinsics.checkNotNullExpressionValue(tuningPriceDetail, "tuningPriceDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$1
            public UILayoutTuningDetailsList$initListeners$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                int i;
                TuningDialogApply tuningDialogApply;
                int i2;
                int i3;
                TuningDetailsListViewModel detailsListViewModel;
                int i4;
                i = UILayoutTuningDetailsList.this.currentAction;
                if (i == 1) {
                    tuningDialogApply = UILayoutTuningDetailsList.this.tuningDialogApply;
                    if (tuningDialogApply != null) {
                        i2 = UILayoutTuningDetailsList.this.currentCost;
                        i3 = UILayoutTuningDetailsList.this.currentCurrency;
                        tuningDialogApply.showDialogApply(1, i2, i3);
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    UILayoutTuningDetailsList.this.showDialogOpeningBox();
                } else {
                    if (i != 5) {
                        return;
                    }
                    detailsListViewModel = UILayoutTuningDetailsList.this.getDetailsListViewModel();
                    i4 = UILayoutTuningDetailsList.this.currentId;
                    detailsListViewModel.sendSetDetail(i4);
                }
            }
        }, 1, null);
        AppCompatButton backToSubmenuDetail = getBinding().backToSubmenuDetail;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuDetail, "backToSubmenuDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$2
            public UILayoutTuningDetailsList$initListeners$2() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningMainViewModel tuningViewModel;
                tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(2);
                tuningViewModel.clearCarStatus();
            }
        }, 1, null);
        AppCompatButton buttonViewCarDetailsList = getBinding().buttonViewCarDetailsList;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarDetailsList, "buttonViewCarDetailsList");
        setOnClickListenerWithAnimAndDelay(buttonViewCarDetailsList, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$3
            public UILayoutTuningDetailsList$initListeners$3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningMainViewModel tuningViewModel;
                TuningMainViewModel tuningViewModel2;
                tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(1);
                tuningViewModel2 = UILayoutTuningDetailsList.this.getTuningViewModel();
                tuningViewModel2.isViewFromMainMenu(false);
            }
        });
        ImageView buttonInfoBrake = getBinding().buttonInfoBrake;
        Intrinsics.checkNotNullExpressionValue(buttonInfoBrake, "buttonInfoBrake");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonInfoBrake, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$4
            public UILayoutTuningDetailsList$initListeners$4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningMainViewModel tuningViewModel;
                tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(10);
            }
        }, 1, null);
        AppCompatButton buttonResetDetail = getBinding().buttonResetDetail;
        Intrinsics.checkNotNullExpressionValue(buttonResetDetail, "buttonResetDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$5
            public UILayoutTuningDetailsList$initListeners$5() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningDetailsList.this.showDialogReset();
            }
        }, 1, null);
    }

    public final void showDialogOpeningBox() {
        DialogOpeningBox dialogOpeningBox = this.dialogOpeningBox;
        if (dialogOpeningBox != null) {
            Intrinsics.checkNotNull(dialogOpeningBox);
            if (dialogOpeningBox.getIfSavedStatus()) {
                DialogOpeningBox dialogOpeningBox2 = this.dialogOpeningBox;
                if (dialogOpeningBox2 != null) {
                    dialogOpeningBox2.showDialogOpeningBox();
                    return;
                }
                return;
            }
        }
        initDialogOpenBox();
        DialogOpeningBox dialogOpeningBox3 = this.dialogOpeningBox;
        if (dialogOpeningBox3 != null) {
            dialogOpeningBox3.showDialogOpeningBox();
        }
    }

    public final void initDialogOpenBox() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        int i = this.carId;
        TuningDetailsListViewModel detailsListViewModel = getDetailsListViewModel();
        TuningMainViewModel tuningViewModel = getTuningViewModel();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.dialogOpeningBox = new DialogOpeningBox(lifecycleScope, i, detailsListViewModel, tuningViewModel, requireActivity);
    }

    public final void showDialogReset() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.showDialogReset();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        DialogOpeningBox dialogOpeningBox = this.dialogOpeningBox;
        if (dialogOpeningBox != null) {
            dialogOpeningBox.closeDialogOpeningBox();
        }
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.clickVinyl = null;
        this.tuningVinylsAdapter = null;
        this.clickDetail = null;
        this.detailsAdapter = null;
        this.tuningDialogApply = null;
        this.dialogResetDetails = null;
        this.dialogOpeningBox = null;
    }
}
