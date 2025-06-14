package com.blackhub.bronline.game.gui.fractions;

import android.annotation.SuppressLint;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FractionsTestingLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsTestingAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingResult;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIFractionsTestingLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0003J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionsTestingLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionsTestingLayoutBinding;", "()V", CatchStreamerKeys.COUNT_KEY, "", "documentId", "documentsViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "getDocumentsViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "documentsViewModel$delegate", "Lkotlin/Lazy;", "mainList", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsTestingItem;", "resultDialog", "Lcom/blackhub/bronline/game/gui/fractions/UIFractionsTestResultDialog;", "testingAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsTestingAdapter;", "getViewBinding", "initViews", "", "nextQuestion", "onDestroyView", "setupObservers", "setupTestingAdapter", IFramePlayerOptions.Builder.LIST, "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionsTestingLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsTestingLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsTestingLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,102:1\n106#2,15:103\n*S KotlinDebug\n*F\n+ 1 UIFractionsTestingLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsTestingLayout\n*L\n22#1:103,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIFractionsTestingLayout extends BaseFragment<FractionsTestingLayoutBinding> {
    public static final int $stable = 8;
    public int count;

    /* renamed from: documentsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy documentsViewModel;

    @Nullable
    public UIFractionsTestResultDialog resultDialog;

    @Nullable
    public FractionsTestingAdapter testingAdapter;

    @NotNull
    public List<FractionsTestingItem> mainList = new ArrayList();
    public int documentId = -1;

    public UIFractionsTestingLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$documentsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIFractionsTestingLayout.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$special$$inlined$viewModels$default$1
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
        final Function0 function02 = null;
        this.documentsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsDocumentsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$special$$inlined$viewModels$default$3
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
                Function0 function03 = Function0.this;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m6502viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FractionsDocumentsViewModel getDocumentsViewModel() {
        return (FractionsDocumentsViewModel) this.documentsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsTestingLayoutBinding getViewBinding() {
        FractionsTestingLayoutBinding inflate = FractionsTestingLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupObservers();
    }

    private final void setupObservers() {
        getDocumentsViewModel().getTestingLiveData().observe(getViewLifecycleOwner(), new UIFractionsTestingLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends FractionsTestingItem>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$setupObservers$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionsTestingItem> list) {
                invoke2((List<FractionsTestingItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<FractionsTestingItem> list) {
                FractionsTestingLayoutBinding binding;
                int i;
                List<FractionsTestingItem> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                list.get(0).setAnswerClicked(-1);
                UIFractionsTestingLayout uIFractionsTestingLayout = UIFractionsTestingLayout.this;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionsTestingItem>");
                uIFractionsTestingLayout.mainList = TypeIntrinsics.asMutableList(list);
                UIFractionsTestingLayout.this.setupTestingAdapter(list);
                binding = UIFractionsTestingLayout.this.getBinding();
                TextView textView = binding.textViewQuestionTitle;
                i = UIFractionsTestingLayout.this.count;
                textView.setText(list.get(i).getTestingQuestion());
            }
        }));
        getDocumentsViewModel().getDocumentIdLiveData().observe(getViewLifecycleOwner(), new UIFractionsTestingLayout$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$setupObservers$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                UIFractionsTestingLayout uIFractionsTestingLayout = UIFractionsTestingLayout.this;
                Intrinsics.checkNotNull(num);
                uIFractionsTestingLayout.documentId = num.intValue();
            }
        }));
        getDocumentsViewModel().getTestingResultLiveData().observe(getViewLifecycleOwner(), new UIFractionsTestingLayout$sam$androidx_lifecycle_Observer$0(new Function1<FractionsTestingResult, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$setupObservers$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsTestingResult fractionsTestingResult) {
                invoke2(fractionsTestingResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable FractionsTestingResult fractionsTestingResult) {
                FractionsTestingLayoutBinding binding;
                if (fractionsTestingResult != null) {
                    binding = UIFractionsTestingLayout.this.getBinding();
                    binding.loader.setVisibility(4);
                }
            }
        }));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.count = 0;
        this.documentId = -1;
        this.resultDialog = null;
        FractionsTestingLayoutBinding binding = getBinding();
        binding.loader.setVisibility(4);
        binding.recyclerViewTesting.setVisibility(0);
        binding.textViewQuestionTitle.setVisibility(0);
        binding.leftTitleDiver.setVisibility(0);
        binding.topTitleBlock.setVisibility(0);
        binding.bottomBody.setVisibility(0);
        binding.textViewTestingTitle.setVisibility(0);
        super.onDestroyView();
    }

    public final void setupTestingAdapter(final List<FractionsTestingItem> list) {
        final FractionsTestingAdapter fractionsTestingAdapter = new FractionsTestingAdapter(list);
        fractionsTestingAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsTestingLayout$setupTestingAdapter$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                FractionsDocumentsViewModel documentsViewModel;
                documentsViewModel = UIFractionsTestingLayout.this.getDocumentsViewModel();
                documentsViewModel.sendAnswerChosen(i);
                UIFractionsTestingLayout.this.nextQuestion();
                fractionsTestingAdapter.notifyItemRangeChanged(0, list.size());
            }
        });
        this.testingAdapter = fractionsTestingAdapter;
        getBinding().recyclerViewTesting.setAdapter(this.testingAdapter);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void nextQuestion() {
        if (this.count < this.mainList.size() - 1) {
            this.count++;
            getBinding().textViewQuestionTitle.setText(this.mainList.get(this.count).getTestingQuestion());
            FractionsTestingAdapter fractionsTestingAdapter = this.testingAdapter;
            if (fractionsTestingAdapter != null) {
                fractionsTestingAdapter.nextAnswersForQuestion(this.count);
            }
            FractionsTestingAdapter fractionsTestingAdapter2 = this.testingAdapter;
            if (fractionsTestingAdapter2 != null) {
                fractionsTestingAdapter2.notifyDataSetChanged();
                return;
            }
            return;
        }
        FractionsTestingLayoutBinding binding = getBinding();
        binding.loader.setVisibility(0);
        binding.recyclerViewTesting.setVisibility(4);
        binding.textViewQuestionTitle.setVisibility(4);
        binding.leftTitleDiver.setVisibility(4);
        binding.topTitleBlock.setVisibility(4);
        binding.bottomBody.setVisibility(4);
        binding.textViewTestingTitle.setVisibility(4);
    }
}
