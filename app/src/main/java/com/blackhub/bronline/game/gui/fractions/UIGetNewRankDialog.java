package com.blackhub.bronline.game.gui.fractions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintSet;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.FractionsNewRankLayoutBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.fractions.data.FractionsNewRankRewardItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIGetNewRankDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIGetNewRankDialog;", "", "context", "Landroid/content/Context;", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsNewRankRewardItem;", "mainViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "(Landroid/content/Context;Lcom/blackhub/bronline/game/gui/fractions/data/FractionsNewRankRewardItem;Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;)V", "binding", "Lcom/blackhub/bronline/databinding/FractionsNewRankLayoutBinding;", "dialogNewRank", "Landroid/widget/PopupWindow;", "closeDialog", "", "setData", "setRewardsGone", "showDialog", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UIGetNewRankDialog {
    public static final int $stable = 8;

    @NotNull
    public FractionsNewRankLayoutBinding binding;

    @NotNull
    public final Context context;

    @Nullable
    public PopupWindow dialogNewRank;

    @NotNull
    public final FractionsNewRankRewardItem item;

    @NotNull
    public final FractionsMainViewModel mainViewModel;

    public UIGetNewRankDialog(@NotNull Context context, @NotNull FractionsNewRankRewardItem item, @NotNull FractionsMainViewModel mainViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        this.context = context;
        this.item = item;
        this.mainViewModel = mainViewModel;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        FractionsNewRankLayoutBinding inflate = FractionsNewRankLayoutBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        PopupWindow popupWindow = new PopupWindow((View) this.binding.getRoot(), -1, -1, false);
        this.dialogNewRank = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.binding.buttonGetReward.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIGetNewRankDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIGetNewRankDialog._init_$lambda$1(UIGetNewRankDialog.this, view);
            }
        });
        PopupWindow popupWindow2 = this.dialogNewRank;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.fractions.UIGetNewRankDialog$$ExternalSyntheticLambda1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    UIGetNewRankDialog._init_$lambda$2(UIGetNewRankDialog.this);
                }
            });
        }
    }

    public static final void _init_$lambda$1(final UIGetNewRankDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation loadAnimation = AnimationUtils.loadAnimation(this$0.binding.getRoot().getContext(), R.anim.button_click);
        Intrinsics.checkNotNull(loadAnimation);
        AnyExtensionKt.setActionOnAnimationEnd(loadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIGetNewRankDialog$1$anim$1$1
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
                UIGetNewRankDialog.this.closeDialog();
            }
        });
        view.startAnimation(loadAnimation);
    }

    public static final void _init_$lambda$2(UIGetNewRankDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Useful.INSTANCE.closeAndroidsInterface(this$0.dialogNewRank);
        this$0.mainViewModel.sendButtonPressed(2, 8);
        this$0.mainViewModel.setFractionsNewRankRewardItem(null);
    }

    public final void showDialog() {
        Useful.INSTANCE.closeAndroidsInterface(this.dialogNewRank);
        setData();
        PopupWindow popupWindow = this.dialogNewRank;
        if (popupWindow != null) {
            popupWindow.showAtLocation(this.binding.getRoot(), 17, 0, 0);
        }
    }

    public final void setData() {
        FractionsNewRankLayoutBinding fractionsNewRankLayoutBinding = this.binding;
        FractionsNewRankRewardItem fractionsNewRankRewardItem = this.item;
        fractionsNewRankLayoutBinding.textViewRank.setText(String.valueOf(fractionsNewRankRewardItem.getNewRank()));
        fractionsNewRankLayoutBinding.imageViewStaffRank.setImageResource(fractionsNewRankRewardItem.getNewRankImage());
        if (fractionsNewRankRewardItem.getRankReward().get(0).intValue() == 0 || fractionsNewRankRewardItem.getRankReward().get(1).intValue() == 0 || fractionsNewRankRewardItem.getRankReward().get(2).intValue() == 0) {
            setRewardsGone();
            return;
        }
        fractionsNewRankLayoutBinding.textViewReward1.setText(this.context.getString(R.string.common_string_with_ruble, String.valueOf(fractionsNewRankRewardItem.getRankReward().get(0).intValue())));
        fractionsNewRankLayoutBinding.textViewReward2.setText(this.context.getString(R.string.common_number_value, fractionsNewRankRewardItem.getRankReward().get(1)));
        fractionsNewRankLayoutBinding.textViewReward3.setText(this.context.getString(R.string.common_number_things, fractionsNewRankRewardItem.getRankReward().get(2)));
    }

    public final void setRewardsGone() {
        FractionsNewRankLayoutBinding fractionsNewRankLayoutBinding = this.binding;
        fractionsNewRankLayoutBinding.textViewReward1.setVisibility(8);
        fractionsNewRankLayoutBinding.textViewReward2.setVisibility(8);
        fractionsNewRankLayoutBinding.textViewReward3.setVisibility(8);
        fractionsNewRankLayoutBinding.ivAward1.setVisibility(8);
        fractionsNewRankLayoutBinding.ivAward2.setVisibility(8);
        fractionsNewRankLayoutBinding.ivAward3.setVisibility(8);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(fractionsNewRankLayoutBinding.getRoot());
        constraintSet.connect(R.id.button_get_reward, 6, R.id.main_view_new_rank, 6);
        constraintSet.connect(R.id.button_get_reward, 7, R.id.main_view_new_rank, 7);
        constraintSet.applyTo(fractionsNewRankLayoutBinding.getRoot());
    }

    public final void closeDialog() {
        PopupWindow popupWindow = this.dialogNewRank;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
