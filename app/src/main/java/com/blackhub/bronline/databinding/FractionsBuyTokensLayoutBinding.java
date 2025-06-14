package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.CustomEditTextWithBackPressEvent;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FractionsBuyTokensLayoutBinding implements ViewBinding {

    @NonNull
    public final View bgEffectShadow;

    @NonNull
    public final View bgHeaderView;

    @NonNull
    public final AppCompatButton buttonByuTokens;

    @NonNull
    public final AppCompatButton buttonCancel;

    @NonNull
    public final View buyTokensMainView;

    @NonNull
    public final CustomEditTextWithBackPressEvent editTextTokens;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewBcValue;

    @NonNull
    public final TextView textViewBuyTokensFor;

    @NonNull
    public final TextView textViewEnterTokensSum;

    @NonNull
    public final View titleDiver;

    public FractionsBuyTokensLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bgEffectShadow, @NonNull View bgHeaderView, @NonNull AppCompatButton buttonByuTokens, @NonNull AppCompatButton buttonCancel, @NonNull View buyTokensMainView, @NonNull CustomEditTextWithBackPressEvent editTextTokens, @NonNull TextView textViewBcValue, @NonNull TextView textViewBuyTokensFor, @NonNull TextView textViewEnterTokensSum, @NonNull View titleDiver) {
        this.rootView = rootView;
        this.bgEffectShadow = bgEffectShadow;
        this.bgHeaderView = bgHeaderView;
        this.buttonByuTokens = buttonByuTokens;
        this.buttonCancel = buttonCancel;
        this.buyTokensMainView = buyTokensMainView;
        this.editTextTokens = editTextTokens;
        this.textViewBcValue = textViewBcValue;
        this.textViewBuyTokensFor = textViewBuyTokensFor;
        this.textViewEnterTokensSum = textViewEnterTokensSum;
        this.titleDiver = titleDiver;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsBuyTokensLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsBuyTokensLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fractions_buy_tokens_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FractionsBuyTokensLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bg_effect_shadow;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_effect_shadow);
        if (findChildViewById != null) {
            i = R.id.bg_header_view;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_header_view);
            if (findChildViewById2 != null) {
                i = R.id.button_byu_tokens;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_byu_tokens);
                if (appCompatButton != null) {
                    i = 2131362515;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, 2131362515);
                    if (appCompatButton2 != null) {
                        i = R.id.buy_tokens_main_view;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.buy_tokens_main_view);
                        if (findChildViewById3 != null) {
                            i = R.id.edit_text_tokens;
                            CustomEditTextWithBackPressEvent customEditTextWithBackPressEvent = (CustomEditTextWithBackPressEvent) ViewBindings.findChildViewById(rootView, R.id.edit_text_tokens);
                            if (customEditTextWithBackPressEvent != null) {
                                i = R.id.text_view_bc_value;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_bc_value);
                                if (textView != null) {
                                    i = R.id.text_view_buy_tokens_for;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_buy_tokens_for);
                                    if (textView2 != null) {
                                        i = R.id.text_view_enter_tokens_sum;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_enter_tokens_sum);
                                        if (textView3 != null) {
                                            i = R.id.title_diver;
                                            View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.title_diver);
                                            if (findChildViewById4 != null) {
                                                return new FractionsBuyTokensLayoutBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, appCompatButton, appCompatButton2, findChildViewById3, customEditTextWithBackPressEvent, textView, textView2, textView3, findChildViewById4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
