package com.blackhub.bronline.game.gui.spawnlocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.SpawnLocationLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem;
import com.blackhub.bronline.game.gui.spawnlocation.viewmodels.SpawnLocationViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUISpawnLocation.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0003J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010'\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0013H\u0002J$\u0010*\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\u001a\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u00020\u0013H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u00060"}, d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/GUISpawnLocation;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/SpawnLocationLayoutBinding;", "()V", "mainVMFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/spawnlocation/viewmodels/SpawnLocationViewModel;", "getMainVMFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setMainVMFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "spawnAdapter", "Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter;", "spawnLocationViewModel", "getSpawnLocationViewModel", "()Lcom/blackhub/bronline/game/gui/spawnlocation/viewmodels/SpawnLocationViewModel;", "spawnLocationViewModel$delegate", "Lkotlin/Lazy;", "getGuiId", "", "getListOfImagesFunction", "", "listOfItems", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "getPlaceNames", "", "getPlaceOrder", "getViewBinding", "initViewsISAMPGUI", "", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setDataFromJson", "setObservers", "setOnButtonEnterClickListener", "itemId", "setSpawnAdapter", "", "listOfAvailability", "showSnackbar", ThrowableDeserializer.PROP_NAME_MESSAGE, "duration", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUISpawnLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISpawnLocation.kt\ncom/blackhub/bronline/game/gui/spawnlocation/GUISpawnLocation\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,242:1\n106#2,15:243\n184#3,2:258\n*S KotlinDebug\n*F\n+ 1 GUISpawnLocation.kt\ncom/blackhub/bronline/game/gui/spawnlocation/GUISpawnLocation\n*L\n33#1:243,15\n194#1:258,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GUISpawnLocation extends BaseISAMPGUIFragment<SpawnLocationLayoutBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<SpawnLocationViewModel> mainVMFactory;

    @Nullable
    public SpawnLocationAdapter spawnAdapter;

    /* renamed from: spawnLocationViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy spawnLocationViewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 50;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SpawnLocationLayoutBinding access$getBinding(GUISpawnLocation gUISpawnLocation) {
        return (SpawnLocationLayoutBinding) gUISpawnLocation.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<SpawnLocationViewModel> getMainVMFactory() {
        MainViewModelFactory<SpawnLocationViewModel> mainViewModelFactory = this.mainVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainVMFactory");
        return null;
    }

    public final void setMainVMFactory(@NotNull MainViewModelFactory<SpawnLocationViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainVMFactory = mainViewModelFactory;
    }

    public final SpawnLocationViewModel getSpawnLocationViewModel() {
        return (SpawnLocationViewModel) this.spawnLocationViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        setObservers();
        setDataFromJson(getJsonObj());
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public SpawnLocationLayoutBinding getViewBinding() {
        SpawnLocationLayoutBinding inflate = SpawnLocationLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void setObservers() {
        getSpawnLocationViewModel().getListOfAvailabilityLiveData().observe(getViewLifecycleOwner(), new GUISpawnLocation$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$setObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
                invoke2((List<Integer>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Integer> list) {
                List placeNames;
                List placeOrder;
                Object obj;
                Object obj2;
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    placeNames = GUISpawnLocation.this.getPlaceNames();
                    placeOrder = GUISpawnLocation.this.getPlaceOrder();
                    int size = placeNames.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new SpawnLocationItem(i, ((Number) placeOrder.get(i)).intValue(), (String) placeNames.get(i)));
                    }
                    if (arrayList.size() > 1) {
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$setObservers$1$invoke$$inlined$sortBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((SpawnLocationItem) t).getPlace()), Integer.valueOf(((SpawnLocationItem) t2).getPlace()));
                            }
                        });
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        obj = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((SpawnLocationItem) obj2).getId() == 1) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    SpawnLocationItem spawnLocationItem = (SpawnLocationItem) obj2;
                    if (spawnLocationItem != null) {
                        ((SpawnLocationItem) arrayList.get(arrayList.indexOf(spawnLocationItem))).setSelected(true);
                    }
                    GUISpawnLocation.this.setSpawnAdapter(arrayList, list);
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((SpawnLocationItem) next).getSelected()) {
                            obj = next;
                            break;
                        }
                    }
                    SpawnLocationItem spawnLocationItem2 = (SpawnLocationItem) obj;
                    if (spawnLocationItem2 != null) {
                        GUISpawnLocation.this.setOnButtonEnterClickListener(spawnLocationItem2.getId());
                    }
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSpawnAdapter(List<SpawnLocationItem> listOfItems, List<Integer> listOfAvailability) {
        SpawnLocationAdapter spawnLocationAdapter = new SpawnLocationAdapter(listOfItems, getListOfImagesFunction(listOfItems), listOfAvailability);
        this.spawnAdapter = spawnLocationAdapter;
        spawnLocationAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$setSpawnAdapter$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                GUISpawnLocation.this.setOnButtonEnterClickListener(i);
            }
        });
        ((SpawnLocationLayoutBinding) getBinding()).recyclerViewSpawnLocation.setAdapter(this.spawnAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnButtonEnterClickListener(final int itemId) {
        AppCompatButton buttonEnter = ((SpawnLocationLayoutBinding) getBinding()).buttonEnter;
        Intrinsics.checkNotNullExpressionValue(buttonEnter, "buttonEnter");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonEnter, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$setOnButtonEnterClickListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SpawnLocationViewModel spawnLocationViewModel;
                if (itemId > -1) {
                    spawnLocationViewModel = this.getSpawnLocationViewModel();
                    spawnLocationViewModel.sendChosenPlace(itemId);
                } else {
                    GUISpawnLocation gUISpawnLocation = this;
                    gUISpawnLocation.showSnackbar(GUISpawnLocation.access$getBinding(gUISpawnLocation).getRoot().getContext().getString(R.string.spawn_location_choose_place), -1);
                }
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDataFromJson(JSONObject json) {
        if (json != null) {
            Log.d(SpawnLocationUtils.LOG_SPAWN_LOCATION, json.toString());
            JSONArray optJSONArray = json.optJSONArray("m");
            List<Integer> mutableIntList = optJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(optJSONArray) : null;
            if (mutableIntList != null) {
                getSpawnLocationViewModel().setListOfAvailability(mutableIntList);
            }
            int optInt = json.optInt("s");
            if (optInt == 1) {
                showSnackbar(((SpawnLocationLayoutBinding) getBinding()).getRoot().getContext().getString(R.string.spawn_location_error), 0);
            } else {
                if (optInt != 2) {
                    return;
                }
                closeFragment();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showSnackbar(String message, int duration) {
        Snackbar make = Snackbar.make(((SpawnLocationLayoutBinding) getBinding()).coordinatorForSnackbar, String.valueOf(message), duration);
        View view = make.getView();
        ViewGroup.LayoutParams layoutParams = make.getView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(8, 8, 8, 8);
        make.setTextMaxLines(8);
        view.setLayoutParams(layoutParams2);
        View view2 = make.getView();
        FragmentActivity activity = getActivity();
        view2.setBackground(activity != null ? AppCompatResources.getDrawable(activity, R.drawable.bg_rectangle_gray_cr8_1) : null);
        Intrinsics.checkNotNullExpressionValue(make, "apply(...)");
        make.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.spawnAdapter = null;
        ((SpawnLocationLayoutBinding) getBinding()).recyclerViewSpawnLocation.setAdapter(null);
        super.onDestroyView();
    }

    public final List<String> getPlaceNames() {
        Resources resources;
        FragmentActivity activity = getActivity();
        String[] stringArray = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getStringArray(R.array.spawn_location_place_names);
        Intrinsics.checkNotNull(stringArray);
        return ArraysKt___ArraysKt.toList(stringArray);
    }

    public final List<Integer> getPlaceOrder() {
        Resources resources;
        FragmentActivity activity = getActivity();
        int[] intArray = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getIntArray(R.array.spawn_location_place_number);
        Intrinsics.checkNotNull(intArray);
        return ArraysKt___ArraysKt.toList(intArray);
    }

    @SuppressLint({"DiscouragedApi"})
    public final List<Integer> getListOfImagesFunction(List<SpawnLocationItem> listOfItems) {
        Resources resources;
        ArrayList arrayList = new ArrayList();
        int size = listOfItems.size();
        if (size >= 0) {
            int i = 0;
            while (true) {
                String str = "@drawable/spawn_location_res_" + i;
                FragmentActivity activity = getActivity();
                if (activity != null && (resources = activity.getResources()) != null) {
                    arrayList.add(Integer.valueOf(resources.getIdentifier(str, "drawable", requireActivity().getPackageName())));
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        setDataFromJson(json);
    }

    public GUISpawnLocation() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$spawnLocationViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return GUISpawnLocation.this;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$spawnLocationViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return GUISpawnLocation.this.getMainVMFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) Function0.this.invoke();
            }
        });
        final Function0 function03 = null;
        this.spawnLocationViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SpawnLocationViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(Lazy.this);
                return m6502viewModels$lambda1.getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                CreationExtras creationExtras;
                Function0 function04 = Function0.this;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
    }
}
