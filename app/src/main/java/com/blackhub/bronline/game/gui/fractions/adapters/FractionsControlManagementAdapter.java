package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsControlManagementItemBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionControlPlayerInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FractionsControlManagementAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\tH\u0016J\u001c\u0010\u001e\u001a\u00020\f2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\tH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006&"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlManagementAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlManagementAdapter$FractionsControlManagementViewHolder;", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlPlayerInfo;", "(Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlPlayerInfo;)V", "getItem", "()Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlPlayerInfo;", "itemCount", "", "onDismissFromFractionClickListener", "Lkotlin/Function0;", "", "getOnDismissFromFractionClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnDismissFromFractionClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onMinusRankClickListener", "getOnMinusRankClickListener", "setOnMinusRankClickListener", "onMinusReprimandsClickListener", "getOnMinusReprimandsClickListener", "setOnMinusReprimandsClickListener", "onPlusRankClickListener", "getOnPlusRankClickListener", "setOnPlusRankClickListener", "onPlusReprimandsClickListener", "getOnPlusReprimandsClickListener", "setOnPlusReprimandsClickListener", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FractionsControlManagementViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FractionsControlManagementAdapter extends RecyclerView.Adapter<FractionsControlManagementViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final FractionControlPlayerInfo item;
    public int itemCount;
    public Function0<Unit> onDismissFromFractionClickListener;
    public Function0<Unit> onMinusRankClickListener;
    public Function0<Unit> onMinusReprimandsClickListener;
    public Function0<Unit> onPlusRankClickListener;
    public Function0<Unit> onPlusReprimandsClickListener;

    @NotNull
    public final FractionControlPlayerInfo getItem() {
        return this.item;
    }

    public FractionsControlManagementAdapter(@NotNull FractionControlPlayerInfo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.itemCount = 3;
    }

    @NotNull
    public final Function0<Unit> getOnMinusRankClickListener() {
        Function0<Unit> function0 = this.onMinusRankClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onMinusRankClickListener");
        return null;
    }

    public final void setOnMinusRankClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onMinusRankClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnPlusRankClickListener() {
        Function0<Unit> function0 = this.onPlusRankClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onPlusRankClickListener");
        return null;
    }

    public final void setOnPlusRankClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onPlusRankClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnMinusReprimandsClickListener() {
        Function0<Unit> function0 = this.onMinusReprimandsClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onMinusReprimandsClickListener");
        return null;
    }

    public final void setOnMinusReprimandsClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onMinusReprimandsClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnPlusReprimandsClickListener() {
        Function0<Unit> function0 = this.onPlusReprimandsClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onPlusReprimandsClickListener");
        return null;
    }

    public final void setOnPlusReprimandsClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onPlusReprimandsClickListener = function0;
    }

    @NotNull
    public final Function0<Unit> getOnDismissFromFractionClickListener() {
        Function0<Unit> function0 = this.onDismissFromFractionClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onDismissFromFractionClickListener");
        return null;
    }

    public final void setOnDismissFromFractionClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onDismissFromFractionClickListener = function0;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: FractionsControlManagementAdapter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlManagementAdapter$FractionsControlManagementViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsControlManagementItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlManagementAdapter;Lcom/blackhub/bronline/databinding/FractionsControlManagementItemBinding;)V", "anim", "Landroid/view/animation/Animation;", "getAnim", "()Landroid/view/animation/Animation;", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionsControlManagementItemBinding;", "bind", "", "position", "", "makeButtonsPlusMinusInvisible", "setOnClickListener", "button", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class FractionsControlManagementViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final Animation anim;

        @NotNull
        public final FractionsControlManagementItemBinding binding;
        public final /* synthetic */ FractionsControlManagementAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsControlManagementViewHolder(@NotNull FractionsControlManagementAdapter fractionsControlManagementAdapter, FractionsControlManagementItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsControlManagementAdapter;
            this.binding = binding;
            Animation loadAnimation = AnimationUtils.loadAnimation(binding.getRoot().getContext(), R.anim.button_click);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
            this.anim = loadAnimation;
        }

        @NotNull
        public final FractionsControlManagementItemBinding getBinding() {
            return this.binding;
        }

        @NotNull
        public final Animation getAnim() {
            return this.anim;
        }

        public final void bind(int position) {
            FractionsControlManagementItemBinding fractionsControlManagementItemBinding = this.binding;
            final FractionsControlManagementAdapter fractionsControlManagementAdapter = this.this$0;
            if (position == 0) {
                fractionsControlManagementItemBinding.textViewChangingParameterTitle.setText(fractionsControlManagementItemBinding.getRoot().getContext().getString(R.string.fractions_change_rank));
                fractionsControlManagementItemBinding.textViewChangingParameter.setText(String.valueOf(fractionsControlManagementAdapter.getItem().getRank()));
                fractionsControlManagementItemBinding.imageButtonMinus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FractionsControlManagementAdapter.FractionsControlManagementViewHolder.bind$lambda$5$lambda$0(FractionsControlManagementAdapter.FractionsControlManagementViewHolder.this, fractionsControlManagementAdapter, view);
                    }
                });
                fractionsControlManagementItemBinding.imageButtonPlus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FractionsControlManagementAdapter.FractionsControlManagementViewHolder.bind$lambda$5$lambda$1(FractionsControlManagementAdapter.FractionsControlManagementViewHolder.this, fractionsControlManagementAdapter, view);
                    }
                });
                return;
            }
            if (position == 1) {
                fractionsControlManagementItemBinding.textViewChangingParameterTitle.setText(fractionsControlManagementItemBinding.getRoot().getContext().getString(R.string.fractions_change_reprimands));
                fractionsControlManagementItemBinding.textViewChangingParameter.setText(String.valueOf(fractionsControlManagementAdapter.getItem().getReprimand()));
                fractionsControlManagementItemBinding.imageButtonMinus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FractionsControlManagementAdapter.FractionsControlManagementViewHolder.bind$lambda$5$lambda$2(FractionsControlManagementAdapter.FractionsControlManagementViewHolder.this, fractionsControlManagementAdapter, view);
                    }
                });
                fractionsControlManagementItemBinding.imageButtonPlus.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FractionsControlManagementAdapter.FractionsControlManagementViewHolder.bind$lambda$5$lambda$3(FractionsControlManagementAdapter.FractionsControlManagementViewHolder.this, fractionsControlManagementAdapter, view);
                    }
                });
                return;
            }
            if (position != 2) {
                return;
            }
            fractionsControlManagementItemBinding.textViewChangingParameterTitle.setText(fractionsControlManagementItemBinding.getRoot().getContext().getString(R.string.fractions_dismiss_from_fraction));
            makeButtonsPlusMinusInvisible();
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsControlManagementAdapter.FractionsControlManagementViewHolder.bind$lambda$5$lambda$4(FractionsControlManagementAdapter.FractionsControlManagementViewHolder.this, fractionsControlManagementAdapter, view);
                }
            });
        }

        public static final void bind$lambda$5$lambda$0(FractionsControlManagementViewHolder this$0, FractionsControlManagementAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNull(view);
            this$0.setOnClickListener(view, this$1.getOnMinusRankClickListener());
        }

        public static final void bind$lambda$5$lambda$1(FractionsControlManagementViewHolder this$0, FractionsControlManagementAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNull(view);
            this$0.setOnClickListener(view, this$1.getOnPlusRankClickListener());
        }

        public static final void bind$lambda$5$lambda$2(FractionsControlManagementViewHolder this$0, FractionsControlManagementAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNull(view);
            this$0.setOnClickListener(view, this$1.getOnMinusReprimandsClickListener());
        }

        public static final void bind$lambda$5$lambda$3(FractionsControlManagementViewHolder this$0, FractionsControlManagementAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNull(view);
            this$0.setOnClickListener(view, this$1.getOnPlusReprimandsClickListener());
        }

        public static final void bind$lambda$5$lambda$4(FractionsControlManagementViewHolder this$0, FractionsControlManagementAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNull(view);
            this$0.setOnClickListener(view, this$1.getOnDismissFromFractionClickListener());
        }

        public final void setOnClickListener(View button, final Function0<Unit> listener) {
            AnyExtensionKt.setActionOnAnimationEnd(this.anim, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlManagementAdapter$FractionsControlManagementViewHolder$setOnClickListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    listener.invoke();
                }
            });
            button.startAnimation(this.anim);
        }

        public final void makeButtonsPlusMinusInvisible() {
            FractionsControlManagementItemBinding fractionsControlManagementItemBinding = this.binding;
            fractionsControlManagementItemBinding.imageButtonMinus.setVisibility(4);
            fractionsControlManagementItemBinding.imageButtonPlus.setVisibility(4);
            fractionsControlManagementItemBinding.textViewChangingParameter.setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsControlManagementViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsControlManagementItemBinding inflate = FractionsControlManagementItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new FractionsControlManagementViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsControlManagementViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemCount;
    }
}
