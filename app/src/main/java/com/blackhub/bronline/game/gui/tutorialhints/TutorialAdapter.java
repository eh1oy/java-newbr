package com.blackhub.bronline.game.gui.tutorialhints;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.HintItemBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TutorialAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter$ViewHolder;", "currentContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "questsList", "", "Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setQuests", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TutorialAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context currentContext;

    @NotNull
    public List<HintQuestData> questsList;

    public TutorialAdapter(@NotNull Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        this.currentContext = currentContext;
        this.questsList = CollectionsKt__CollectionsKt.emptyList();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setQuests(@NotNull List<HintQuestData> questsList) {
        Intrinsics.checkNotNullParameter(questsList, "questsList");
        this.questsList = questsList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HintItemBinding inflate = HintItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.questsList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.questsList.size();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: TutorialAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/HintItemBinding;", "(Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter;Lcom/blackhub/bronline/databinding/HintItemBinding;)V", "bind", "", "quest", "Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final HintItemBinding binding;
        public final /* synthetic */ TutorialAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull TutorialAdapter tutorialAdapter, HintItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tutorialAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull HintQuestData quest) {
            Intrinsics.checkNotNullParameter(quest, "quest");
            HintItemBinding hintItemBinding = this.binding;
            TutorialAdapter tutorialAdapter = this.this$0;
            Drawable mutate = hintItemBinding.hintProgressQuest.getProgressDrawable().mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            if (quest.getIfMainQuest()) {
                mutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(R.color.light_yellow, BlendModeCompat.SRC_ATOP));
                hintItemBinding.hintProgressQuest.setProgressDrawable(mutate);
            } else {
                mutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(R.color.light_green, BlendModeCompat.SRC_ATOP));
                hintItemBinding.hintProgressQuest.setProgressDrawable(mutate);
            }
            hintItemBinding.hintTitleAdditionalQuestItem.setText(quest.getQuestsText());
            hintItemBinding.hintStatusQuest.setText(tutorialAdapter.currentContext.getString(R.string.common_number_current_number_max, Integer.valueOf(quest.getThisQuestsStatus()), Integer.valueOf(quest.getMaxQuestsStatus())));
            if (quest.getThisQuestsStatus() == quest.getMaxQuestsStatus()) {
                TextView textView = hintItemBinding.hintTitleAdditionalQuestItem;
                textView.setPaintFlags(textView.getPaintFlags() | 16);
            }
            hintItemBinding.hintProgressQuest.setMax(quest.getMaxQuestsStatus());
            hintItemBinding.hintProgressQuest.setProgress(quest.getThisQuestsStatus());
        }
    }
}
