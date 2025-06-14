package com.blackhub.bronline.game.gui.fractions;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionMainMenuLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.gravitysnaphelper.GravitySnapHelper;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsMainMenuProgressAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsProgressStaffItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIFractionMainLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J4\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J,\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020\u0018H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionMainMenuLayoutBinding;", "()V", "mainViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "progressAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsMainMenuProgressAdapter;", "getImageForTasksBackground", "", "fractionId", "getListOfImagesForAdapter", "", "getListOfImagesFunction", "link", "", "getListOfPositionForAdapter", "", "getViewBinding", "initViews", "", "onDestroyView", "setUpData", "fractionsProgressStaffItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsProgressStaffItem;", "imageForTasksBackground", "listOfImageForAdapter", "listOfPositionForAdapter", "setupButtonClickListeners", "setupProgressAdapter", "item", "listOfImages", "listOfPosition", "setupRecyclerView", "setupTextProgressInOrganisation", "setupVMObservers", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionMainLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionMainLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,289:1\n106#2,15:290\n*S KotlinDebug\n*F\n+ 1 UIFractionMainLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout\n*L\n31#1:290,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIFractionMainLayout extends BaseFragment<FractionMainMenuLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public FractionsMainMenuProgressAdapter progressAdapter;

    public final int getImageForTasksBackground(int fractionId) {
        if (fractionId == 11) {
            return R.drawable.bg_fractions_tasks_fsin;
        }
        switch (fractionId) {
            case 1:
                return R.drawable.bg_fractions_tasks_government;
            case 2:
                return R.drawable.bg_fractions_tasks_defense_department;
            case 3:
                return R.drawable.bg_fractions_tasks_hospital;
            case 4:
                return R.drawable.bg_fractions_tasks_mass_media;
            case 5:
                return R.drawable.bg_fractions_tasks_dps;
            case 6:
                return R.drawable.bg_fractions_tasks_mvd;
            case 7:
                return R.drawable.bg_fractions_tasks_fsb;
            default:
                return -1;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public UIFractionMainLayout() {
        /*
            r5 = this;
            r5.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$mainViewModel$2 r0 = new com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$mainViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel> r1 = com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.mainViewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout.<init>():void");
    }

    public final FractionsMainViewModel getMainViewModel() {
        return (FractionsMainViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionMainMenuLayoutBinding getViewBinding() {
        FractionMainMenuLayoutBinding inflate = FractionMainMenuLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupVMObservers();
        setupRecyclerView();
        setupTextProgressInOrganisation();
        setupButtonClickListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.progressAdapter = null;
        super.onDestroyView();
    }

    public final void setupRecyclerView() {
        new GravitySnapHelper(17).attachToRecyclerView(getBinding().recyclerView);
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.progressAdapter);
    }

    private final void setupVMObservers() {
        getMainViewModel().getProgressStaffItemLiveData().observe(getViewLifecycleOwner(), new UIFractionMainLayout$sam$androidx_lifecycle_Observer$0(new Function1<FractionsProgressStaffItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupVMObservers$1
            public UIFractionMainLayout$setupVMObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsProgressStaffItem fractionsProgressStaffItem) {
                invoke2(fractionsProgressStaffItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(FractionsProgressStaffItem fractionsProgressStaffItem) {
                int imageForTasksBackground;
                List listOfImagesForAdapter;
                List listOfPositionForAdapter;
                UIFractionMainLayout uIFractionMainLayout = UIFractionMainLayout.this;
                Intrinsics.checkNotNull(fractionsProgressStaffItem);
                imageForTasksBackground = UIFractionMainLayout.this.getImageForTasksBackground(fractionsProgressStaffItem.getFractionId());
                listOfImagesForAdapter = UIFractionMainLayout.this.getListOfImagesForAdapter(fractionsProgressStaffItem.getFractionId());
                listOfPositionForAdapter = UIFractionMainLayout.this.getListOfPositionForAdapter(fractionsProgressStaffItem.getFractionId());
                uIFractionMainLayout.setUpData(fractionsProgressStaffItem, imageForTasksBackground, listOfImagesForAdapter, listOfPositionForAdapter);
            }
        }));
    }

    public final void setUpData(FractionsProgressStaffItem fractionsProgressStaffItem, int imageForTasksBackground, List<Integer> listOfImageForAdapter, List<String> listOfPositionForAdapter) {
        ImageButton imageButtonFractionsTasks = getBinding().imageButtonFractionsTasks;
        Intrinsics.checkNotNullExpressionValue(imageButtonFractionsTasks, "imageButtonFractionsTasks");
        ViewExtensionKt.loadImage$default(imageButtonFractionsTasks, Integer.valueOf(imageForTasksBackground), 0, null, 6, null);
        setupProgressAdapter(fractionsProgressStaffItem, listOfImageForAdapter, listOfPositionForAdapter);
        int indexOf = fractionsProgressStaffItem.getRankStatus().indexOf(1);
        if (1 <= indexOf && indexOf < 9) {
            getBinding().recyclerView.scrollToPosition(indexOf - 1);
        } else if (indexOf == 9) {
            getBinding().recyclerView.scrollToPosition(indexOf);
        }
        getBinding().recyclerView.setAdapter(this.progressAdapter);
    }

    public final void setupProgressAdapter(FractionsProgressStaffItem item, List<Integer> listOfImages, List<String> listOfPosition) {
        FractionsMainMenuProgressAdapter fractionsMainMenuProgressAdapter = new FractionsMainMenuProgressAdapter(item.getRankStatus(), item.getRankProgress(), listOfImages, listOfPosition);
        fractionsMainMenuProgressAdapter.setOnGetNewRankButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupProgressAdapter$1$1$1
            public UIFractionMainLayout$setupProgressAdapter$1$1$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsMainViewModel mainViewModel;
                mainViewModel = UIFractionMainLayout.this.getMainViewModel();
                mainViewModel.sendButtonPressed(1, 7);
            }
        });
        this.progressAdapter = fractionsMainMenuProgressAdapter;
    }

    public final void setupTextProgressInOrganisation() {
        SpannableString spannableString = new SpannableString(requireContext().getString(R.string.fractions_progress_in_organisation_1));
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.yellow)), 0, spannableString.length(), 33);
        Unit unit = Unit.INSTANCE;
        SpannableString spannableString2 = new SpannableString(requireContext().getString(R.string.fractions_progress_in_organisation_2));
        spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.white)), 0, spannableString2.length(), 33);
        getBinding().textViewProgressInOrganisation.setText(TextUtils.concat(spannableString, spannableString2));
    }

    private final void setupButtonClickListeners() {
        ImageButton imageButtonFractionsTasks = getBinding().imageButtonFractionsTasks;
        Intrinsics.checkNotNullExpressionValue(imageButtonFractionsTasks, "imageButtonFractionsTasks");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imageButtonFractionsTasks, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupButtonClickListeners$1$1
            public UIFractionMainLayout$setupButtonClickListeners$1$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsMainViewModel mainViewModel;
                mainViewModel = UIFractionMainLayout.this.getMainViewModel();
                mainViewModel.sendButtonPressed(1, 6);
            }
        }, 1, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getListOfPositionForAdapter(int fractionId) {
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        Resources resources6;
        Resources resources7;
        Resources resources8;
        ArrayList arrayList = new ArrayList();
        String[] strArr = null;
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    FragmentActivity activity = getActivity();
                    if (activity != null && (resources2 = activity.getResources()) != null) {
                        strArr = resources2.getStringArray(R.array.fractions_government_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 2:
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null && (resources3 = activity2.getResources()) != null) {
                        strArr = resources3.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 3:
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null && (resources4 = activity3.getResources()) != null) {
                        strArr = resources4.getStringArray(R.array.fractions_hospital_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 4:
                    FragmentActivity activity4 = getActivity();
                    if (activity4 != null && (resources5 = activity4.getResources()) != null) {
                        strArr = resources5.getStringArray(R.array.fractions_mass_media_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 5:
                    FragmentActivity activity5 = getActivity();
                    if (activity5 != null && (resources6 = activity5.getResources()) != null) {
                        strArr = resources6.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 6:
                    FragmentActivity activity6 = getActivity();
                    if (activity6 != null && (resources7 = activity6.getResources()) != null) {
                        strArr = resources7.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
                case 7:
                    FragmentActivity activity7 = getActivity();
                    if (activity7 != null && (resources8 = activity7.getResources()) != null) {
                        strArr = resources8.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(strArr);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
                    break;
            }
        } else {
            FragmentActivity activity8 = getActivity();
            if (activity8 != null && (resources = activity8.getResources()) != null) {
                strArr = resources.getStringArray(R.array.fractions_army_staff_array);
            }
            Intrinsics.checkNotNull(strArr);
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
        }
        return arrayList;
    }

    public final List<Integer> getListOfImagesForAdapter(int fractionId) {
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_GOVERNMENT);
                case 2:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_DEPARTMENT);
                case 3:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_HOSPITAL);
                case 4:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MASS_MEDIA);
                case 5:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 6:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 7:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                default:
                    return new ArrayList();
            }
        }
        return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
    }

    @SuppressLint({"DiscouragedApi"})
    private final List<Integer> getListOfImagesFunction(String link) {
        Resources resources;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 11; i++) {
            String str = link + i;
            FragmentActivity activity = getActivity();
            if (activity != null && (resources = activity.getResources()) != null) {
                arrayList.add(Integer.valueOf(resources.getIdentifier(str, "drawable", activity.getPackageName())));
            }
        }
        return arrayList;
    }
}
