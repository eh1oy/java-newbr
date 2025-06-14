package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public abstract class FragmentGasmanGame7Binding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout containerRoot;

    @NonNull
    public final Guideline guidelineVertical16Percent;

    @NonNull
    public final ImageView ivAnimationGas;

    @NonNull
    public final ImageView ivCornerDropArea1;

    @NonNull
    public final ImageView ivCornerDropArea2;

    @NonNull
    public final ImageView ivCornerPipeTopPlot;

    @NonNull
    public final ImageView ivCornerPipeTopPlot1;

    @NonNull
    public final ImageView ivCornerPipeTopPlot2;

    @NonNull
    public final ImageView ivCornerStaticPipe1;

    @NonNull
    public final ImageView ivCornerStaticPipe2;

    @NonNull
    public final ImageView ivCornerStaticPipe3;

    @NonNull
    public final ImageView ivEndArrows1;

    @NonNull
    public final ImageView ivEndPoint;

    @NonNull
    public final ImageView ivStartArrows;

    @NonNull
    public final ImageView ivStartPoint;

    @NonNull
    public final ImageView ivStraightDropArea1;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot1;

    @NonNull
    public final ImageView ivStraightPipeMiddlePlot2;

    @NonNull
    public final ImageView ivStraightStaticPipe1;

    @NonNull
    public final ImageView ivTeePipeBotPlot;

    @NonNull
    public final ImageView ivTeePipeBotPlot1;

    @NonNull
    public final ImageView ivTeePipeBotPlot2;

    @NonNull
    public final ImageView ivTeePipeDropArea1;

    @NonNull
    public final ImageView ivTeeStaticPipe1;

    @Bindable
    public GasmanParentViewModel mVm;

    @NonNull
    public final TextView tvBotPlot;

    @NonNull
    public final TextView tvMiddlePlot;

    @NonNull
    public final TextView tvTopPlot;

    public abstract void setVm(@Nullable GasmanParentViewModel vm);

    public FragmentGasmanGame7Binding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout containerRoot, Guideline guidelineVertical16Percent, ImageView ivAnimationGas, ImageView ivCornerDropArea1, ImageView ivCornerDropArea2, ImageView ivCornerPipeTopPlot, ImageView ivCornerPipeTopPlot1, ImageView ivCornerPipeTopPlot2, ImageView ivCornerStaticPipe1, ImageView ivCornerStaticPipe2, ImageView ivCornerStaticPipe3, ImageView ivEndArrows1, ImageView ivEndPoint, ImageView ivStartArrows, ImageView ivStartPoint, ImageView ivStraightDropArea1, ImageView ivStraightPipeMiddlePlot, ImageView ivStraightPipeMiddlePlot1, ImageView ivStraightPipeMiddlePlot2, ImageView ivStraightStaticPipe1, ImageView ivTeePipeBotPlot, ImageView ivTeePipeBotPlot1, ImageView ivTeePipeBotPlot2, ImageView ivTeePipeDropArea1, ImageView ivTeeStaticPipe1, TextView tvBotPlot, TextView tvMiddlePlot, TextView tvTopPlot) {
        super(_bindingComponent, _root, _localFieldCount);
        this.containerRoot = containerRoot;
        this.guidelineVertical16Percent = guidelineVertical16Percent;
        this.ivAnimationGas = ivAnimationGas;
        this.ivCornerDropArea1 = ivCornerDropArea1;
        this.ivCornerDropArea2 = ivCornerDropArea2;
        this.ivCornerPipeTopPlot = ivCornerPipeTopPlot;
        this.ivCornerPipeTopPlot1 = ivCornerPipeTopPlot1;
        this.ivCornerPipeTopPlot2 = ivCornerPipeTopPlot2;
        this.ivCornerStaticPipe1 = ivCornerStaticPipe1;
        this.ivCornerStaticPipe2 = ivCornerStaticPipe2;
        this.ivCornerStaticPipe3 = ivCornerStaticPipe3;
        this.ivEndArrows1 = ivEndArrows1;
        this.ivEndPoint = ivEndPoint;
        this.ivStartArrows = ivStartArrows;
        this.ivStartPoint = ivStartPoint;
        this.ivStraightDropArea1 = ivStraightDropArea1;
        this.ivStraightPipeMiddlePlot = ivStraightPipeMiddlePlot;
        this.ivStraightPipeMiddlePlot1 = ivStraightPipeMiddlePlot1;
        this.ivStraightPipeMiddlePlot2 = ivStraightPipeMiddlePlot2;
        this.ivStraightStaticPipe1 = ivStraightStaticPipe1;
        this.ivTeePipeBotPlot = ivTeePipeBotPlot;
        this.ivTeePipeBotPlot1 = ivTeePipeBotPlot1;
        this.ivTeePipeBotPlot2 = ivTeePipeBotPlot2;
        this.ivTeePipeDropArea1 = ivTeePipeDropArea1;
        this.ivTeeStaticPipe1 = ivTeeStaticPipe1;
        this.tvBotPlot = tvBotPlot;
        this.tvMiddlePlot = tvMiddlePlot;
        this.tvTopPlot = tvTopPlot;
    }

    @Nullable
    public GasmanParentViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentGasmanGame7Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame7Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentGasmanGame7Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_7, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentGasmanGame7Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGasmanGame7Binding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentGasmanGame7Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_gasman_game_7, null, false, component);
    }

    public static FragmentGasmanGame7Binding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGasmanGame7Binding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentGasmanGame7Binding) ViewDataBinding.bind(component, view, R.layout.fragment_gasman_game_7);
    }
}
