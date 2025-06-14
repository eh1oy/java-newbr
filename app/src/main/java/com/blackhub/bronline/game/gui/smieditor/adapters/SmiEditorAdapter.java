package com.blackhub.bronline.game.gui.smieditor.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SmiItemBinding;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
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
/* compiled from: SmiEditorAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u001c\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0006\u0010\u0018\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$ViewHolder;", "onUserClickListenerSmiEditor", "Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$OnUserClickListenerSmiEditor;", "(Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$OnUserClickListenerSmiEditor;)V", "blockTimer", "", "lDataSmiInfoAll", "", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "oldClickPos", "", "getItemCount", "initItems", "", "data", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshCheck", "OnUserClickListenerSmiEditor", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmiEditorAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public long blockTimer;

    @NotNull
    public List<SmiEditorBodyObj> lDataSmiInfoAll = CollectionsKt__CollectionsKt.emptyList();
    public int oldClickPos = -1;

    @Nullable
    public final OnUserClickListenerSmiEditor onUserClickListenerSmiEditor;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: SmiEditorAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$OnUserClickListenerSmiEditor;", "", "clickable", "", "dataSmiInfoAll", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "getPosition", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnUserClickListenerSmiEditor {
        void clickable(@NotNull SmiEditorBodyObj dataSmiInfoAll, int getPosition);
    }

    public SmiEditorAdapter(@Nullable OnUserClickListenerSmiEditor onUserClickListenerSmiEditor) {
        this.onUserClickListenerSmiEditor = onUserClickListenerSmiEditor;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItems(@NotNull List<SmiEditorBodyObj> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.lDataSmiInfoAll = data;
        this.oldClickPos = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SmiItemBinding inflate = SmiItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lDataSmiInfoAll.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lDataSmiInfoAll.size();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: SmiEditorAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SmiItemBinding;", "(Lcom/blackhub/bronline/game/gui/smieditor/adapters/SmiEditorAdapter;Lcom/blackhub/bronline/databinding/SmiItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SmiItemBinding binding;
        public final /* synthetic */ SmiEditorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SmiEditorAdapter smiEditorAdapter, SmiItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = smiEditorAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final SmiEditorBodyObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.nameSmiElement.setText(item.getTitle());
            this.binding.switchSmiElement.setChecked(item.getIsChecked());
            SwitchCompat switchCompat = this.binding.switchSmiElement;
            final SmiEditorAdapter smiEditorAdapter = this.this$0;
            switchCompat.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SmiEditorAdapter.ViewHolder.bind$lambda$0(SmiEditorAdapter.this, item, this, view);
                }
            });
        }

        public static final void bind$lambda$0(SmiEditorAdapter this$0, SmiEditorBodyObj item, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (System.currentTimeMillis() - this$0.blockTimer > 300) {
                this$0.blockTimer = System.currentTimeMillis();
                item.setChecked(!item.getIsChecked());
                this$0.notifyItemChanged(this$1.getBindingAdapterPosition());
                if (this$0.oldClickPos != -1 && this$0.oldClickPos != this$1.getBindingAdapterPosition()) {
                    ((SmiEditorBodyObj) this$0.lDataSmiInfoAll.get(this$0.oldClickPos)).setChecked(false);
                    this$0.notifyItemChanged(this$0.oldClickPos);
                }
                this$0.oldClickPos = this$1.getBindingAdapterPosition();
                OnUserClickListenerSmiEditor onUserClickListenerSmiEditor = this$0.onUserClickListenerSmiEditor;
                if (onUserClickListenerSmiEditor != null) {
                    onUserClickListenerSmiEditor.clickable(item, this$1.getBindingAdapterPosition());
                }
            }
        }
    }

    public final void refreshCheck() {
        Object obj;
        Iterator<T> it = this.lDataSmiInfoAll.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SmiEditorBodyObj) obj).getIsChecked()) {
                    break;
                }
            }
        }
        SmiEditorBodyObj smiEditorBodyObj = (SmiEditorBodyObj) obj;
        if (smiEditorBodyObj != null) {
            smiEditorBodyObj.setChecked(false);
            notifyItemChanged(this.lDataSmiInfoAll.indexOf(smiEditorBodyObj));
            this.oldClickPos = -1;
        }
    }
}
