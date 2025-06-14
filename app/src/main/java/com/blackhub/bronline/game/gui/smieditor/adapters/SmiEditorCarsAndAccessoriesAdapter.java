package com.blackhub.bronline.game.gui.smieditor.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SmiItemBinding;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter;
import com.blackhub.bronline.game.gui.smieditor.data.SmiInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorCarsAndAccessoriesAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$DialogSmiHolder;", "onUserClickCarsAndAccessories", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$OnUserClickCarsAndAccessories;", "(Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$OnUserClickCarsAndAccessories;)V", "blockTimer", "", "lCarAndAccessoriesList", "", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiInfo;", "oldClickPos", "", "getItemCount", "initItems", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshCheck", "DialogSmiHolder", "OnUserClickCarsAndAccessories", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmiEditorCarsAndAccessoriesAdapter extends RecyclerView.Adapter<DialogSmiHolder> {
    public static final int $stable = 8;
    public long blockTimer;

    @NotNull
    public List<SmiInfo> lCarAndAccessoriesList = CollectionsKt__CollectionsKt.emptyList();
    public int oldClickPos = -1;

    @Nullable
    public final OnUserClickCarsAndAccessories onUserClickCarsAndAccessories;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: SmiEditorCarsAndAccessoriesAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$OnUserClickCarsAndAccessories;", "", "userClick", "", "smiInfo", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiInfo;", "getPosition", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnUserClickCarsAndAccessories {
        void userClick(@NotNull SmiInfo smiInfo, int getPosition);
    }

    public SmiEditorCarsAndAccessoriesAdapter(@Nullable OnUserClickCarsAndAccessories onUserClickCarsAndAccessories) {
        this.onUserClickCarsAndAccessories = onUserClickCarsAndAccessories;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItems(@NotNull List<SmiInfo> lCarAndAccessoriesList) {
        Intrinsics.checkNotNullParameter(lCarAndAccessoriesList, "lCarAndAccessoriesList");
        this.lCarAndAccessoriesList = lCarAndAccessoriesList;
        this.oldClickPos = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DialogSmiHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SmiItemBinding inflate = SmiItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new DialogSmiHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DialogSmiHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lCarAndAccessoriesList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lCarAndAccessoriesList.size();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: SmiEditorCarsAndAccessoriesAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter$DialogSmiHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SmiItemBinding;", "(Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorCarsAndAccessoriesAdapter;Lcom/blackhub/bronline/databinding/SmiItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiInfo;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class DialogSmiHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SmiItemBinding binding;
        public final /* synthetic */ SmiEditorCarsAndAccessoriesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogSmiHolder(@NotNull SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter, SmiItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = smiEditorCarsAndAccessoriesAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final SmiInfo item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.nameSmiElement.setText((CharSequence) UtilsKt.buildTypeMerge(item.getName(), item.getNameStore()));
            this.binding.switchSmiElement.setChecked(item.isChecked());
            SwitchCompat switchCompat = this.binding.switchSmiElement;
            final SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter = this.this$0;
            switchCompat.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter$DialogSmiHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SmiEditorCarsAndAccessoriesAdapter.DialogSmiHolder.bind$lambda$0(SmiEditorCarsAndAccessoriesAdapter.this, item, this, view);
                }
            });
        }

        public static final void bind$lambda$0(SmiEditorCarsAndAccessoriesAdapter this$0, SmiInfo item, DialogSmiHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (System.currentTimeMillis() - this$0.blockTimer > 300) {
                this$0.blockTimer = System.currentTimeMillis();
                item.setChecked(!item.isChecked());
                this$0.notifyItemChanged(this$1.getBindingAdapterPosition());
                if (this$0.oldClickPos != -1 && this$0.oldClickPos != this$1.getBindingAdapterPosition()) {
                    ((SmiInfo) this$0.lCarAndAccessoriesList.get(this$0.oldClickPos)).setChecked(false);
                    this$0.notifyItemChanged(this$0.oldClickPos);
                }
                this$0.oldClickPos = this$1.getBindingAdapterPosition();
                OnUserClickCarsAndAccessories onUserClickCarsAndAccessories = this$0.onUserClickCarsAndAccessories;
                if (onUserClickCarsAndAccessories != null) {
                    onUserClickCarsAndAccessories.userClick(item, this$1.getBindingAdapterPosition());
                }
            }
        }
    }

    public final void refreshCheck() {
        Object obj;
        Iterator<T> it = this.lCarAndAccessoriesList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SmiInfo) obj).isChecked()) {
                    break;
                }
            }
        }
        SmiInfo smiInfo = (SmiInfo) obj;
        if (smiInfo != null) {
            smiInfo.setChecked(false);
            notifyItemChanged(this.lCarAndAccessoriesList.indexOf(smiInfo));
        }
    }
}
