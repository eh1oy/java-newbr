package com.blackhub.bronline.game.gui.drivingschool.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.DrivingSchoolQuestionsItemBinding;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingAnswer;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DrivingSchoolAnswersAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J\u001c\u0010\u0019\u001a\u00020\u000e2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\bRJ\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "answerClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", SVG.View.NODE_NAME, "", "getAnswerClickListener", "()Lkotlin/jvm/functions/Function2;", "setAnswerClickListener", "(Lkotlin/jvm/functions/Function2;)V", "answers", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "oldItemPos", "getItemCount", "initAnswers", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckedOnlyItem", "currentPos", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrivingSchoolAnswersAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function2<? super Integer, ? super View, Unit> answerClickListener;

    @NotNull
    public List<DrivingAnswer> answers;

    @NotNull
    public final Context context;
    public int oldItemPos;

    public DrivingSchoolAnswersAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.answers = CollectionsKt__CollectionsKt.emptyList();
        this.oldItemPos = -1;
    }

    @NotNull
    public final Function2<Integer, View, Unit> getAnswerClickListener() {
        Function2 function2 = this.answerClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("answerClickListener");
        return null;
    }

    public final void setAnswerClickListener(@NotNull Function2<? super Integer, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.answerClickListener = function2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initAnswers(@NotNull List<DrivingAnswer> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.answers = answers;
        this.oldItemPos = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DrivingSchoolQuestionsItemBinding inflate = DrivingSchoolQuestionsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.answers.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.answers.size();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: DrivingSchoolAnswersAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolQuestionsItemBinding;", "(Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolAnswersAdapter;Lcom/blackhub/bronline/databinding/DrivingSchoolQuestionsItemBinding;)V", "bind", "", "answer", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DrivingSchoolQuestionsItemBinding binding;
        public final /* synthetic */ DrivingSchoolAnswersAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter, DrivingSchoolQuestionsItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = drivingSchoolAnswersAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull DrivingAnswer answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            DrivingSchoolQuestionsItemBinding drivingSchoolQuestionsItemBinding = this.binding;
            final DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = this.this$0;
            drivingSchoolQuestionsItemBinding.questionsText.setText(answer.getAnswersText());
            if (answer.isChecked()) {
                drivingSchoolQuestionsItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(drivingSchoolAnswersAdapter.context.getResources(), R.drawable.bg_rectangle_blue_cr8_t8_light_blue, null));
            } else {
                drivingSchoolQuestionsItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(drivingSchoolAnswersAdapter.context.getResources(), R.drawable.bg_rectangle_gray54_cr8, null));
            }
            drivingSchoolQuestionsItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DrivingSchoolAnswersAdapter.ViewHolder.bind$lambda$1$lambda$0(DrivingSchoolAnswersAdapter.this, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(DrivingSchoolAnswersAdapter this$0, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.answerClickListener != null) {
                Function2<Integer, View, Unit> answerClickListener = this$0.getAnswerClickListener();
                Integer valueOf = Integer.valueOf(this$1.getBindingAdapterPosition());
                Intrinsics.checkNotNull(view);
                answerClickListener.invoke(valueOf, view);
            }
        }
    }

    public final void setCheckedOnlyItem(int currentPos) {
        int i = this.oldItemPos;
        if (currentPos != i && i != -1 && currentPos != -1) {
            this.answers.get(i).setChecked(false);
            notifyItemChanged(this.oldItemPos);
        }
        if (currentPos != -1) {
            this.answers.get(currentPos).setChecked(true);
            this.oldItemPos = currentPos;
            notifyItemChanged(currentPos);
        }
    }
}
