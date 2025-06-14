package com.blackhub.bronline.game.gui.drivingschool.ui;

import android.os.CountDownTimer;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DrivingSchoolQuestionsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIQuestions.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DrivingSchoolQuestionsLayoutBinding;", "()V", "answersAdapter", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter;", "counterWithAnswer", "", "", "mainViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "questsViewModel", "Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolQuestsViewModel;", "getQuestsViewModel", "()Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolQuestsViewModel;", "questsViewModel$delegate", "timer", "Landroid/os/CountDownTimer;", "getViewBinding", "initAnswersClickListener", "", "initAnswersRV", "initViews", "onDestroyView", "setNullableParameters", "setObservers", "startTimer", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIQuestions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIQuestions.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,156:1\n106#2,15:157\n106#2,15:172\n*S KotlinDebug\n*F\n+ 1 UIQuestions.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions\n*L\n26#1:157,15\n27#1:172,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIQuestions extends BaseFragment<DrivingSchoolQuestionsLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public DrivingSchoolAnswersAdapter answersAdapter;

    @NotNull
    public final List<Integer> counterWithAnswer;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    /* renamed from: questsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy questsViewModel;

    @Nullable
    public CountDownTimer timer;

    public UIQuestions() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIQuestions.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$1
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$questsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment requireParentFragment = UIQuestions.this.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$5
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
        this.questsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$7
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$8
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
                m6502viewModels$lambda1 = FragmentViewModelLazyKt.m6502viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6502viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6502viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.counterWithAnswer = CollectionsKt__CollectionsKt.mutableListOf(-1, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrivingSchoolViewModel getMainViewModel() {
        return (DrivingSchoolViewModel) this.mainViewModel.getValue();
    }

    public final DrivingSchoolQuestsViewModel getQuestsViewModel() {
        return (DrivingSchoolQuestsViewModel) this.questsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolQuestionsLayoutBinding getViewBinding() {
        DrivingSchoolQuestionsLayoutBinding inflate = DrivingSchoolQuestionsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initAnswersRV();
        startTimer();
        setObservers();
    }

    public final void initAnswersRV() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.answersAdapter = new DrivingSchoolAnswersAdapter(requireActivity);
        initAnswersClickListener();
        RecyclerView recyclerView = getBinding().answersList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.answersAdapter);
    }

    public final void initAnswersClickListener() {
        DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = this.answersAdapter;
        if (drivingSchoolAnswersAdapter == null) {
            return;
        }
        drivingSchoolAnswersAdapter.setAnswerClickListener(new Function2<Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$initAnswersClickListener$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, View view) {
                invoke(num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(final int i, @NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                final UIQuestions uIQuestions = UIQuestions.this;
                BaseFragment.startAnimAndDelay$default(uIQuestions, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$initAnswersClickListener$1.1
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
                        DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter2;
                        List list;
                        List list2;
                        List list3;
                        List list4;
                        DrivingSchoolQuestsViewModel questsViewModel;
                        drivingSchoolAnswersAdapter2 = UIQuestions.this.answersAdapter;
                        if (drivingSchoolAnswersAdapter2 != null) {
                            drivingSchoolAnswersAdapter2.setCheckedOnlyItem(i);
                        }
                        list = UIQuestions.this.counterWithAnswer;
                        if (((Number) list.get(0)).intValue() == i) {
                            list4 = UIQuestions.this.counterWithAnswer;
                            if (((Number) list4.get(1)).intValue() == 1) {
                                questsViewModel = UIQuestions.this.getQuestsViewModel();
                                questsViewModel.checkAnswer(i);
                                return;
                            }
                        }
                        list2 = UIQuestions.this.counterWithAnswer;
                        list2.set(0, Integer.valueOf(i));
                        list3 = UIQuestions.this.counterWithAnswer;
                        list3.set(1, 1);
                    }
                }, 1, null);
            }
        });
    }

    private final void startTimer() {
        final long j = 1000 * 900;
        CountDownTimer countDownTimer = new CountDownTimer(j) { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$startTimer$1
            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                String valueOf;
                String valueOf2;
                DrivingSchoolQuestionsLayoutBinding binding;
                long j2 = 60;
                long j3 = 1000;
                long j4 = (p0 / j2) / j3;
                if (String.valueOf(j4).length() == 1) {
                    valueOf = "0" + j4;
                } else {
                    valueOf = String.valueOf(j4);
                }
                long j5 = (p0 - ((j4 * j2) * j3)) / j3;
                if (String.valueOf(j5).length() == 1) {
                    valueOf2 = "0" + j5;
                } else {
                    valueOf2 = String.valueOf(j5);
                }
                binding = UIQuestions.this.getBinding();
                binding.valueTimer.setText(UIQuestions.this.requireActivity().getString(R.string.driving_school_timer, valueOf, valueOf2));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                DrivingSchoolViewModel mainViewModel;
                mainViewModel = UIQuestions.this.getMainViewModel();
                mainViewModel.pressButton(4);
            }
        };
        this.timer = countDownTimer;
        countDownTimer.start();
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new UIQuestions$setObservers$1(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new UIQuestions$setObservers$2(this, null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new UIQuestions$setObservers$3(this, null));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4).launchWhenStarted(new UIQuestions$setObservers$4(this, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
        this.answersAdapter = null;
    }
}
