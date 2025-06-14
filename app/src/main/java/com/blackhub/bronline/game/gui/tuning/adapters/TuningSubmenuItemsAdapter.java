package com.blackhub.bronline.game.gui.tuning.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningSubmenuItemBinding;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningSubmenuItemsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.caverock.androidsvg.SVG;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningSubmenuItemsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0007J\u001c\u0010\u0017\u001a\u00020\u000e2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016Ra\u0010\u0004\u001aI\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningSubmenuItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningSubmenuItemsAdapter$SubmenuHolder;", "()V", "clickSubmenuItem", "Lkotlin/Function3;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "Lkotlin/ParameterName;", "name", "submenuTuning", "", "getPosition", "Landroid/view/View;", SVG.View.NODE_NAME, "", "getClickSubmenuItem", "()Lkotlin/jvm/functions/Function3;", "setClickSubmenuItem", "(Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "", "getItemCount", "initItems", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SubmenuHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TuningSubmenuItemsAdapter extends RecyclerView.Adapter<SubmenuHolder> {
    public static final int $stable = 8;
    public Function3<? super TuneGuiNodeObj, ? super Integer, ? super View, Unit> clickSubmenuItem;

    @NotNull
    public List<TuneGuiNodeObj> items = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public final Function3<TuneGuiNodeObj, Integer, View, Unit> getClickSubmenuItem() {
        Function3 function3 = this.clickSubmenuItem;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clickSubmenuItem");
        return null;
    }

    public final void setClickSubmenuItem(@NotNull Function3<? super TuneGuiNodeObj, ? super Integer, ? super View, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.clickSubmenuItem = function3;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItems(@NotNull List<TuneGuiNodeObj> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (!items.isEmpty()) {
            this.items = items;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SubmenuHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningSubmenuItemBinding inflate = TuningSubmenuItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SubmenuHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SubmenuHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: TuningSubmenuItemsAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningSubmenuItemsAdapter$SubmenuHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningSubmenuItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningSubmenuItemsAdapter;Lcom/blackhub/bronline/databinding/TuningSubmenuItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class SubmenuHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningSubmenuItemBinding binding;
        public final /* synthetic */ TuningSubmenuItemsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmenuHolder(@NotNull TuningSubmenuItemsAdapter tuningSubmenuItemsAdapter, TuningSubmenuItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningSubmenuItemsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TuneGuiNodeObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TuningSubmenuItemBinding tuningSubmenuItemBinding = this.binding;
            final TuningSubmenuItemsAdapter tuningSubmenuItemsAdapter = this.this$0;
            tuningSubmenuItemBinding.nameSubmenuItem.setText(item.getName());
            tuningSubmenuItemBinding.iconSubmenuItem.setImageDrawable(Useful.INSTANCE.getDrawableByName(item.getImageId()));
            tuningSubmenuItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.adapters.TuningSubmenuItemsAdapter$SubmenuHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TuningSubmenuItemsAdapter.SubmenuHolder.bind$lambda$1$lambda$0(TuningSubmenuItemsAdapter.this, item, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(TuningSubmenuItemsAdapter this$0, TuneGuiNodeObj item, SubmenuHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getClickSubmenuItem().invoke(item, Integer.valueOf(this$1.getBindingAdapterPosition()), view);
        }
    }
}
