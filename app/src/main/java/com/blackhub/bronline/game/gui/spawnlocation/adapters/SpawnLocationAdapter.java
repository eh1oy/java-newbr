package com.blackhub.bronline.game.gui.spawnlocation.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SpawnLocationItemBinding;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter$SpawnLocationViewHolder;", "listOfItems", "", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "listOfImages", "", "listOfAvailability", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "onItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "itemID", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedItemPosition", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SpawnLocationViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpawnLocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n350#2,7:80\n*S KotlinDebug\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter\n*L\n19#1:80,7\n*E\n"})
/* loaded from: classes3.dex */
public final class SpawnLocationAdapter extends RecyclerView.Adapter<SpawnLocationViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> listOfAvailability;

    @NotNull
    public final List<Integer> listOfImages;

    @NotNull
    public final List<SpawnLocationItem> listOfItems;
    public Function1<? super Integer, Unit> onItemClickListener;
    public int selectedItemPosition;

    public SpawnLocationAdapter(@NotNull List<SpawnLocationItem> listOfItems, @NotNull List<Integer> listOfImages, @NotNull List<Integer> listOfAvailability) {
        Intrinsics.checkNotNullParameter(listOfItems, "listOfItems");
        Intrinsics.checkNotNullParameter(listOfImages, "listOfImages");
        Intrinsics.checkNotNullParameter(listOfAvailability, "listOfAvailability");
        this.listOfItems = listOfItems;
        this.listOfImages = listOfImages;
        this.listOfAvailability = listOfAvailability;
        Iterator<SpawnLocationItem> it = listOfItems.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getSelected()) {
                break;
            } else {
                i++;
            }
        }
        this.selectedItemPosition = i;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnItemClickListener() {
        Function1 function1 = this.onItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onItemClickListener");
        return null;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemClickListener = function1;
    }

    /* compiled from: SpawnLocationAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter$SpawnLocationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SpawnLocationItemBinding;", "(Lcom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter;Lcom/blackhub/bronline/databinding/SpawnLocationItemBinding;)V", "viewSelected", "Landroid/view/View;", "getViewSelected", "()Landroid/view/View;", "setViewSelected", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSpawnLocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpawnLocationAdapter.kt\ncom/blackhub/bronline/game/gui/spawnlocation/adapters/SpawnLocationAdapter$SpawnLocationViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public final class SpawnLocationViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SpawnLocationItemBinding binding;
        public final /* synthetic */ SpawnLocationAdapter this$0;

        @NotNull
        public View viewSelected;

        public static final void bind$lambda$3$lambda$1(View view) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpawnLocationViewHolder(@NotNull SpawnLocationAdapter spawnLocationAdapter, SpawnLocationItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = spawnLocationAdapter;
            this.binding = binding;
            View viewSelection = binding.viewSelection;
            Intrinsics.checkNotNullExpressionValue(viewSelection, "viewSelection");
            this.viewSelected = viewSelection;
        }

        @NotNull
        public final View getViewSelected() {
            return this.viewSelected;
        }

        public final void setViewSelected(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.viewSelected = view;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda1.<init>(com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter, com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder, com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem):void, class status: GENERATED_AND_UNLOADED
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
        public final void bind(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem r11) {
            /*
                r10 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                com.blackhub.bronline.databinding.SpawnLocationItemBinding r0 = r10.binding
                com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter r1 = r10.this$0
                java.util.List r2 = com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter.access$getListOfAvailability$p(r1)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L13:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2b
                java.lang.Object r3 = r2.next()
                r4 = r3
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                int r5 = r11.getId()
                if (r4 != r5) goto L13
                goto L2c
            L2b:
                r3 = 0
            L2c:
                if (r3 != 0) goto L46
                android.view.View r2 = r0.viewSelectionUnavailable
                r3 = 0
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r0.ivLock
                r2.setVisibility(r3)
                androidx.cardview.widget.CardView r2 = r0.getRoot()
                com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda0 r3 = new com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda0
                r3.<init>()
                r2.setOnClickListener(r3)
                goto L5d
            L46:
                android.view.View r2 = r0.viewSelectionUnavailable
                r3 = 4
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r0.ivLock
                r2.setVisibility(r3)
                androidx.cardview.widget.CardView r2 = r0.getRoot()
                com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda1 r3 = new com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter$SpawnLocationViewHolder$$ExternalSyntheticLambda1
                r3.<init>()
                r2.setOnClickListener(r3)
            L5d:
                android.widget.TextView r2 = r0.textViewPlaceName
                java.lang.String r3 = r11.getPlaceName()
                r2.setText(r3)
                android.widget.ImageView r4 = r0.imageViewPlace
                java.lang.String r0 = "imageViewPlace"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                java.util.List r0 = com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter.access$getListOfImages$p(r1)
                int r11 = r11.getId()
                java.lang.Object r5 = r0.get(r11)
                r8 = 4
                r9 = 0
                r6 = 2131234359(0x7f080e37, float:1.8084882E38)
                r7 = 0
                com.blackhub.bronline.game.core.extension.ViewExtensionKt.loadImage$default(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.spawnlocation.adapters.SpawnLocationAdapter.SpawnLocationViewHolder.bind(com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationItem):void");
        }

        public static final void bind$lambda$3$lambda$2(SpawnLocationAdapter this$0, SpawnLocationViewHolder this$1, SpawnLocationItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            if (this$0.selectedItemPosition != this$1.getBindingAdapterPosition()) {
                ((SpawnLocationItem) this$0.listOfItems.get(this$0.selectedItemPosition)).setSelected(false);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.selectedItemPosition = this$1.getBindingAdapterPosition();
                item.setSelected(true);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.getOnItemClickListener().invoke(Integer.valueOf(item.getId()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SpawnLocationViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SpawnLocationItemBinding inflate = SpawnLocationItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SpawnLocationViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SpawnLocationViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.listOfItems.get(position));
        if (this.listOfItems.get(position).getSelected()) {
            holder.itemView.isSelected();
            holder.getViewSelected().setVisibility(0);
        } else {
            holder.getViewSelected().setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.listOfItems.size();
    }
}
