package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsDocumentsItemBinding;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsDocumentsAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FractionsDocumentsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter$FractionsDocumentsViewHolder;", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "(Ljava/util/List;)V", "onItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedItemPosition", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FractionsDocumentsViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFractionsDocumentsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsDocumentsAdapter.kt\ncom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n350#2,7:83\n*S KotlinDebug\n*F\n+ 1 FractionsDocumentsAdapter.kt\ncom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter\n*L\n19#1:83,7\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsDocumentsAdapter extends RecyclerView.Adapter<FractionsDocumentsViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FractionsDocumentsItem> list;
    public Function1<? super FractionsDocumentsItem, Unit> onItemClickListener;
    public int selectedItemPosition;

    public FractionsDocumentsAdapter(@NotNull List<FractionsDocumentsItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        Iterator<FractionsDocumentsItem> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().isClicked()) {
                break;
            } else {
                i++;
            }
        }
        this.selectedItemPosition = i;
    }

    @NotNull
    public final Function1<FractionsDocumentsItem, Unit> getOnItemClickListener() {
        Function1 function1 = this.onItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onItemClickListener");
        return null;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super FractionsDocumentsItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemClickListener = function1;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: FractionsDocumentsAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter$FractionsDocumentsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsDocumentsItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsDocumentsAdapter;Lcom/blackhub/bronline/databinding/FractionsDocumentsItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionsDocumentsItemBinding;", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class FractionsDocumentsViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsDocumentsItemBinding binding;
        public final /* synthetic */ FractionsDocumentsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsDocumentsViewHolder(@NotNull FractionsDocumentsAdapter fractionsDocumentsAdapter, FractionsDocumentsItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsDocumentsAdapter;
            this.binding = binding;
        }

        @NotNull
        public final FractionsDocumentsItemBinding getBinding() {
            return this.binding;
        }

        public final void bind(@NotNull final FractionsDocumentsItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            FractionsDocumentsItemBinding fractionsDocumentsItemBinding = this.binding;
            final FractionsDocumentsAdapter fractionsDocumentsAdapter = this.this$0;
            TextView textView = fractionsDocumentsItemBinding.questTitle;
            textView.setText(((FractionsDocumentsItem) fractionsDocumentsAdapter.list.get(getAdapterPosition())).getTitle());
            textView.setSelected(true);
            if (item.getDocumentStatus()) {
                fractionsDocumentsItemBinding.imageViewChecked.setVisibility(0);
            } else {
                fractionsDocumentsItemBinding.imageViewChecked.setVisibility(4);
            }
            fractionsDocumentsItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsDocumentsAdapter$FractionsDocumentsViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsDocumentsAdapter.FractionsDocumentsViewHolder.bind$lambda$2$lambda$1(FractionsDocumentsAdapter.this, this, item, view);
                }
            });
        }

        public static final void bind$lambda$2$lambda$1(FractionsDocumentsAdapter this$0, FractionsDocumentsViewHolder this$1, FractionsDocumentsItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            if (this$0.selectedItemPosition != this$1.getAdapterPosition()) {
                ((FractionsDocumentsItem) this$0.list.get(this$0.selectedItemPosition)).setClicked(false);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.selectedItemPosition = this$1.getAdapterPosition();
                item.setClicked(true);
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.getOnItemClickListener().invoke(item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsDocumentsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsDocumentsItemBinding inflate = FractionsDocumentsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FractionsDocumentsViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsDocumentsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
        if (this.list.get(position).isClicked()) {
            holder.itemView.isSelected();
            View view = holder.itemView;
            view.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.bg_rectangle_blue_cr5));
        } else {
            View view2 = holder.itemView;
            view2.setBackground(ContextCompat.getDrawable(view2.getContext(), R.drawable.bg_rectangle_white15_cr5));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }
}
