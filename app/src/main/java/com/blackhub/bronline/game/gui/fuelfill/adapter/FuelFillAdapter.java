package com.blackhub.bronline.game.gui.fuelfill.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FuelFillItemBinding;
import com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FuelFillAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001c\u0010\u001f\u001a\u00020\u00142\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u000fH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\r\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anim", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "fuelClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "fuelPos", "fuelPrice", "", "getFuelClickListener", "()Lkotlin/jvm/functions/Function2;", "setFuelClickListener", "(Lkotlin/jvm/functions/Function2;)V", "fuelList", "", "Lcom/blackhub/bronline/game/gui/fuelfill/data/TypeAndPriceOfFuel;", "selectedPos", "getItemCount", "initFuelList", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateFuelView", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FuelFillAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final Context context;
    public Function2<? super Integer, ? super Integer, Unit> fuelClickListener;

    @NotNull
    public List<TypeAndPriceOfFuel> fuelList;
    public int selectedPos;

    public FuelFillAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.fuelList = CollectionsKt__CollectionsKt.emptyList();
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$anim$2
            public FuelFillAdapter$anim$2() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(FuelFillAdapter.this.context, R.anim.button_click);
            }
        });
    }

    public final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @NotNull
    public final Function2<Integer, Integer, Unit> getFuelClickListener() {
        Function2 function2 = this.fuelClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fuelClickListener");
        return null;
    }

    public final void setFuelClickListener(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.fuelClickListener = function2;
    }

    public final void initFuelList(@NotNull List<TypeAndPriceOfFuel> fuelList) {
        Intrinsics.checkNotNullParameter(fuelList, "fuelList");
        this.fuelList = fuelList;
        notifyDataSetChanged();
    }

    /* compiled from: FuelFillAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FuelFillItemBinding;", "(Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter;Lcom/blackhub/bronline/databinding/FuelFillItemBinding;)V", "bind", "", "fuelItem", "Lcom/blackhub/bronline/game/gui/fuelfill/data/TypeAndPriceOfFuel;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FuelFillItemBinding binding;
        public final /* synthetic */ FuelFillAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FuelFillAdapter fuelFillAdapter, FuelFillItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fuelFillAdapter;
            this.binding = binding;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$ViewHolder$$ExternalSyntheticLambda0.<init>(com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter, com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$ViewHolder, com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel):void, class status: GENERATED_AND_UNLOADED
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
        public final void bind(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel r7) {
            /*
                r6 = this;
                java.lang.String r0 = "fuelItem"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                com.blackhub.bronline.databinding.FuelFillItemBinding r0 = r6.binding
                com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter r1 = r6.this$0
                android.widget.TextView r2 = r0.ffiTypeOfFuel
                java.lang.String r3 = r7.getType()
                r2.setText(r3)
                android.widget.TextView r2 = r0.ffiPriceOfFuel
                android.content.Context r3 = com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter.access$getContext$p(r1)
                int r4 = r7.getPrice()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r4 = new java.lang.Object[]{r4}
                r5 = 2131887140(0x7f120424, float:1.9408879E38)
                java.lang.String r3 = r3.getString(r5, r4)
                r2.setText(r3)
                boolean r2 = r7.getSelected()
                r3 = 0
                if (r2 == 0) goto L4c
                androidx.constraintlayout.widget.ConstraintLayout r2 = r0.getRoot()
                android.content.Context r4 = com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter.access$getContext$p(r1)
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232603(0x7f08075b, float:1.808132E38)
                android.graphics.drawable.Drawable r3 = androidx.core.content.res.ResourcesCompat.getDrawable(r4, r5, r3)
                r2.setBackground(r3)
                goto L62
            L4c:
                androidx.constraintlayout.widget.ConstraintLayout r2 = r0.getRoot()
                android.content.Context r4 = com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter.access$getContext$p(r1)
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131232941(0x7f0808ad, float:1.8082005E38)
                android.graphics.drawable.Drawable r3 = androidx.core.content.res.ResourcesCompat.getDrawable(r4, r5, r3)
                r2.setBackground(r3)
            L62:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
                com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$ViewHolder$$ExternalSyntheticLambda0 r2 = new com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$ViewHolder$$ExternalSyntheticLambda0
                r2.<init>()
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter.ViewHolder.bind(com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel):void");
        }

        public static final void bind$lambda$1$lambda$0(FuelFillAdapter this$0, ViewHolder this$1, TypeAndPriceOfFuel fuelItem, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(fuelItem, "$fuelItem");
            view.startAnimation(this$0.getAnim());
            this$0.getFuelClickListener().invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), Integer.valueOf(fuelItem.getPrice()));
            this$0.updateFuelView(this$1.getBindingAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FuelFillItemBinding inflate = FuelFillItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.fuelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.fuelList.get(position));
    }

    public final void updateFuelView(int fuelPos) {
        int i;
        if (this.selectedPos >= this.fuelList.size() || fuelPos >= this.fuelList.size() || (i = this.selectedPos) == fuelPos) {
            return;
        }
        this.fuelList.get(i).setSelected(false);
        this.fuelList.get(fuelPos).setSelected(true);
        notifyItemChanged(this.selectedPos);
        notifyItemChanged(fuelPos);
        this.selectedPos = fuelPos;
    }
}
