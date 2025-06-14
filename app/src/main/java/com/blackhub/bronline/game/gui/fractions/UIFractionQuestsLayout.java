package com.blackhub.bronline.game.gui.fractions;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsQuestsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsQuestsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIFractionQuestsLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionsQuestsLayoutBinding;", "()V", "questsAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsQuestsAdapter;", "questsViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel;", "getQuestsViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel;", "questsViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initViews", "", "setInfoAboutQuest", "clickedItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "setLogicForOnQuestItemClick", "setObservers", "setupQuestsAdapter", IFramePlayerOptions.Builder.LIST, "", "setupRecyclerView", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionQuestsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionQuestsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,135:1\n106#2,15:136\n*S KotlinDebug\n*F\n+ 1 UIFractionQuestsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionQuestsLayout\n*L\n28#1:136,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIFractionQuestsLayout extends BaseFragment<FractionsQuestsLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public FractionsQuestsAdapter questsAdapter;

    /* renamed from: questsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy questsViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public UIFractionQuestsLayout() {
        /*
            r5 = this;
            r5.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$questsViewModel$2 r0 = new com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$questsViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel> r1 = com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.questsViewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout.<init>():void");
    }

    public final FractionsQuestsViewModel getQuestsViewModel() {
        return (FractionsQuestsViewModel) this.questsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsQuestsLayoutBinding getViewBinding() {
        FractionsQuestsLayoutBinding inflate = FractionsQuestsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setObservers();
        setupRecyclerView();
    }

    private final void setObservers() {
        getQuestsViewModel().getQuestsLiveData().observe(getViewLifecycleOwner(), new UIFractionQuestsLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends FractionQuestsItem>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setObservers$1
            public UIFractionQuestsLayout$setObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionQuestsItem> list) {
                invoke2((List<FractionQuestsItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<FractionQuestsItem> list) {
                Object obj;
                UIFractionQuestsLayout uIFractionQuestsLayout = UIFractionQuestsLayout.this;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem>");
                uIFractionQuestsLayout.setupQuestsAdapter(TypeIntrinsics.asMutableList(list));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((FractionQuestsItem) obj).getIsClicked()) {
                            break;
                        }
                    }
                }
                FractionQuestsItem fractionQuestsItem = (FractionQuestsItem) obj;
                if (fractionQuestsItem != null) {
                    UIFractionQuestsLayout.this.setInfoAboutQuest(fractionQuestsItem);
                }
            }
        }));
    }

    private final void setupRecyclerView() {
        getBinding().recyclerViewTasksList.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
    }

    public final void setupQuestsAdapter(List<FractionQuestsItem> r2) {
        this.questsAdapter = new FractionsQuestsAdapter(r2);
        setLogicForOnQuestItemClick();
        getBinding().recyclerViewTasksList.setAdapter(this.questsAdapter);
    }

    public final void setLogicForOnQuestItemClick() {
        FractionsQuestsAdapter fractionsQuestsAdapter = this.questsAdapter;
        if (fractionsQuestsAdapter == null) {
            return;
        }
        fractionsQuestsAdapter.setOnQuestItemClickListener(new Function1<FractionQuestsItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setLogicForOnQuestItemClick$1
            public UIFractionQuestsLayout$setLogicForOnQuestItemClick$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionQuestsItem fractionQuestsItem) {
                invoke2(fractionQuestsItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull FractionQuestsItem clickedItem) {
                Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
                UIFractionQuestsLayout.this.setInfoAboutQuest(clickedItem);
            }
        });
    }

    public final void setInfoAboutQuest(FractionQuestsItem clickedItem) {
        String string = getString(R.string.fractions_quest_title);
        SpannableString spannableString = new SpannableString(getString(R.string.common_string_in_quotes, clickedItem.getTitle()));
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.yellow)), 0, spannableString.length(), 33);
        Unit unit = Unit.INSTANCE;
        CharSequence concat = TextUtils.concat(string, spannableString);
        FractionsQuestsLayoutBinding binding = getBinding();
        TextView textView = binding.questsTitle;
        Intrinsics.checkNotNull(concat);
        textView.setText(UtilsKt.transformSpannableToUpperCase(concat));
        TextView textView2 = binding.valueGoalsDescription;
        textView2.setText(clickedItem.getGoal());
        textView2.setScrollY(10);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        TextView textView3 = binding.valueQuestsDescription;
        textView3.setText(clickedItem.getDescription());
        textView3.setScrollY(10);
        textView3.setMovementMethod(new ScrollingMovementMethod());
        if (clickedItem.getMoneyReward() == 0) {
            binding.award2Value.setVisibility(4);
            binding.award2Item.setVisibility(4);
        } else {
            binding.award2Value.setVisibility(0);
            binding.award2Item.setVisibility(0);
            binding.award2Value.setText(getString(R.string.common_string_with_ruble, String.valueOf(clickedItem.getMoneyReward())));
        }
        binding.award1Value.setText(getString(R.string.fractions_quests_award_2, Integer.valueOf(clickedItem.getScoreReward())));
        if (clickedItem.getScoreReward() < 0) {
            binding.award1Item.setImageResource(R.drawable.ic_gold_down);
        } else {
            binding.award1Item.setImageResource(R.drawable.ic_gold_up);
        }
        if (clickedItem.getTokenReward() == 0) {
            binding.award3Item.setVisibility(4);
            binding.award3Value.setVisibility(4);
        } else {
            binding.award3Item.setVisibility(0);
            binding.award3Value.setVisibility(0);
            binding.award3Value.setText(getString(R.string.fractions_quests_award_3, Integer.valueOf(clickedItem.getTokenReward())));
        }
        AppCompatButton buttonStartQuest = binding.buttonStartQuest;
        Intrinsics.checkNotNullExpressionValue(buttonStartQuest, "buttonStartQuest");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonStartQuest, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionQuestsLayout$setInfoAboutQuest$1$3
            public final /* synthetic */ FractionQuestsItem $clickedItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UIFractionQuestsLayout$setInfoAboutQuest$1$3(FractionQuestsItem clickedItem2) {
                super(0);
                r2 = clickedItem2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsQuestsViewModel questsViewModel;
                questsViewModel = UIFractionQuestsLayout.this.getQuestsViewModel();
                questsViewModel.sendStartQuest(r2.getId());
            }
        }, 1, null);
    }
}
