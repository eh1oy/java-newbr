package com.blackhub.bronline.game.gui.fractions;

import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsDocumentsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsDocumentsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
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

/* compiled from: UIFractionsDocumentsLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionsDocumentsLayoutBinding;", "()V", "documentId", "", "documentNumber", "documentsViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "getDocumentsViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "documentsViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "hideButtonAcquainted", "", "initViews", "setDocumentsAdapter", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "setupButtonClickListeners", "setupDescription", "item", "setupDocumentTitle", "setupObservers", "setupRecyclerView", "showButtonAcquainted", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionsDocumentsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsDocumentsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,120:1\n106#2,15:121\n*S KotlinDebug\n*F\n+ 1 UIFractionsDocumentsLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsDocumentsLayout\n*L\n22#1:121,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIFractionsDocumentsLayout extends BaseFragment<FractionsDocumentsLayoutBinding> {
    public static final int $stable = 8;
    public int documentId = -1;
    public int documentNumber = -1;

    /* renamed from: documentsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy documentsViewModel;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$2.<init>(kotlin.Lazy):void, class status: GENERATED_AND_UNLOADED
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
    public UIFractionsDocumentsLayout() {
        /*
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.documentId = r0
            r5.documentNumber = r0
            com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$documentsViewModel$2 r0 = new com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$documentsViewModel$2
            r0.<init>()
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$1 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$1
            r2.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r1, r2)
            java.lang.Class<com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel> r1 = com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel.class
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$2 r2 = new com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$2
            r2.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$3 r3 = new com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$3
            r4 = 0
            r3.<init>()
            com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$4 r4 = new com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$special$$inlined$viewModels$default$4
            r4.<init>()
            kotlin.Lazy r0 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r5, r1, r2, r3, r4)
            r5.documentsViewModel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout.<init>():void");
    }

    public final FractionsDocumentsViewModel getDocumentsViewModel() {
        return (FractionsDocumentsViewModel) this.documentsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsDocumentsLayoutBinding getViewBinding() {
        FractionsDocumentsLayoutBinding inflate = FractionsDocumentsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupObservers();
        setupRecyclerView();
        setupButtonClickListeners();
    }

    private final void setupButtonClickListeners() {
        AppCompatButton buttonAcquaintedWithDocument = getBinding().buttonAcquaintedWithDocument;
        Intrinsics.checkNotNullExpressionValue(buttonAcquaintedWithDocument, "buttonAcquaintedWithDocument");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonAcquaintedWithDocument, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setupButtonClickListeners$1
            public UIFractionsDocumentsLayout$setupButtonClickListeners$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                FractionsDocumentsViewModel documentsViewModel;
                int i;
                int i2;
                FractionsDocumentsViewModel documentsViewModel2;
                int i3;
                documentsViewModel = UIFractionsDocumentsLayout.this.getDocumentsViewModel();
                i = UIFractionsDocumentsLayout.this.documentId;
                i2 = UIFractionsDocumentsLayout.this.documentNumber;
                documentsViewModel.sendButtonAcquaintedPressed(i, i2);
                documentsViewModel2 = UIFractionsDocumentsLayout.this.getDocumentsViewModel();
                i3 = UIFractionsDocumentsLayout.this.documentId;
                documentsViewModel2.setTestingList(i3);
            }
        }, 1, null);
    }

    private final void setupObservers() {
        getDocumentsViewModel().getDocumentsListLivedata().observe(getViewLifecycleOwner(), new UIFractionsDocumentsLayout$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends FractionsDocumentsItem>, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setupObservers$1
            public UIFractionsDocumentsLayout$setupObservers$1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends FractionsDocumentsItem> list) {
                invoke2((List<FractionsDocumentsItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable List<FractionsDocumentsItem> list) {
                Object obj;
                UIFractionsDocumentsLayout uIFractionsDocumentsLayout = UIFractionsDocumentsLayout.this;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem>");
                uIFractionsDocumentsLayout.setDocumentsAdapter(TypeIntrinsics.asMutableList(list));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((FractionsDocumentsItem) obj).isClicked()) {
                            break;
                        }
                    }
                }
                FractionsDocumentsItem fractionsDocumentsItem = (FractionsDocumentsItem) obj;
                if (fractionsDocumentsItem != null) {
                    UIFractionsDocumentsLayout uIFractionsDocumentsLayout2 = UIFractionsDocumentsLayout.this;
                    uIFractionsDocumentsLayout2.documentNumber = list.indexOf(fractionsDocumentsItem);
                    if (fractionsDocumentsItem.getDocumentStatus()) {
                        uIFractionsDocumentsLayout2.hideButtonAcquainted();
                    } else {
                        uIFractionsDocumentsLayout2.showButtonAcquainted();
                    }
                    uIFractionsDocumentsLayout2.setupDescription(fractionsDocumentsItem);
                    uIFractionsDocumentsLayout2.setupDocumentTitle(fractionsDocumentsItem);
                    uIFractionsDocumentsLayout2.documentId = fractionsDocumentsItem.getDocumentId();
                }
            }
        }));
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().recyclerViewTasksList;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new FractionsDocumentsAdapter(new ArrayList()));
    }

    public final void setDocumentsAdapter(List<FractionsDocumentsItem> r4) {
        RecyclerView recyclerView = getBinding().recyclerViewTasksList;
        FractionsDocumentsAdapter fractionsDocumentsAdapter = new FractionsDocumentsAdapter(r4);
        fractionsDocumentsAdapter.setOnItemClickListener(new Function1<FractionsDocumentsItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsDocumentsLayout$setDocumentsAdapter$1$1
            public final /* synthetic */ List<FractionsDocumentsItem> $list;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UIFractionsDocumentsLayout$setDocumentsAdapter$1$1(List<FractionsDocumentsItem> r42) {
                super(1);
                r2 = r42;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsDocumentsItem fractionsDocumentsItem) {
                invoke2(fractionsDocumentsItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull FractionsDocumentsItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.getDocumentStatus()) {
                    UIFractionsDocumentsLayout.this.hideButtonAcquainted();
                } else {
                    UIFractionsDocumentsLayout.this.showButtonAcquainted();
                }
                UIFractionsDocumentsLayout.this.documentNumber = r2.indexOf(item);
                UIFractionsDocumentsLayout.this.documentId = item.getDocumentId();
                UIFractionsDocumentsLayout.this.setupDescription(item);
                UIFractionsDocumentsLayout.this.setupDocumentTitle(item);
            }
        });
        recyclerView.setAdapter(fractionsDocumentsAdapter);
    }

    public final void hideButtonAcquainted() {
        getBinding().buttonAcquaintedWithDocument.setVisibility(4);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getBinding().getRoot());
        constraintSet.connect(R.id.text_view_document_description, 4, R.id.body_right_block, 4);
        constraintSet.applyTo(getBinding().getRoot());
    }

    public final void showButtonAcquainted() {
        getBinding().buttonAcquaintedWithDocument.setVisibility(0);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getBinding().getRoot());
        constraintSet.connect(R.id.text_view_document_description, 4, R.id.button_acquainted_with_document, 3);
        constraintSet.applyTo(getBinding().getRoot());
    }

    public final void setupDescription(FractionsDocumentsItem item) {
        TextView textView = getBinding().textViewDocumentDescription;
        textView.setText(item.getDescription());
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setScrollY(10);
    }

    public final void setupDocumentTitle(FractionsDocumentsItem item) {
        TextView textView = getBinding().textViewDocumentTitle;
        textView.setText(item.getTitle());
        textView.setSelected(true);
    }
}
