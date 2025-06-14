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
import com.blackhub.bronline.game.gui.familysystem.CustomEditText;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FamiliesBuyTokenDialogBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonBuyToken;

    @NonNull
    public final AppCompatButton buttonCancel;

    @NonNull
    public final View dialogBuyTokenBgEffect;

    @NonNull
    public final View dialogBuyTokenBgView;

    @NonNull
    public final TextView dialogBuyTokenBodyItem;

    @NonNull
    public final CustomEditText editTextTokenValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textTitleBuyToken;

    @NonNull
    public final TextView textValueBuyToken;

    @NonNull
    public final View titleDialogBuyToken;

    public FamiliesBuyTokenDialogBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonBuyToken, @NonNull AppCompatButton buttonCancel, @NonNull View dialogBuyTokenBgEffect, @NonNull View dialogBuyTokenBgView, @NonNull TextView dialogBuyTokenBodyItem, @NonNull CustomEditText editTextTokenValue, @NonNull TextView textTitleBuyToken, @NonNull TextView textValueBuyToken, @NonNull View titleDialogBuyToken) {
        this.rootView = rootView;
        this.buttonBuyToken = buttonBuyToken;
        this.buttonCancel = buttonCancel;
        this.dialogBuyTokenBgEffect = dialogBuyTokenBgEffect;
        this.dialogBuyTokenBgView = dialogBuyTokenBgView;
        this.dialogBuyTokenBodyItem = dialogBuyTokenBodyItem;
        this.editTextTokenValue = editTextTokenValue;
        this.textTitleBuyToken = textTitleBuyToken;
        this.textValueBuyToken = textValueBuyToken;
        this.titleDialogBuyToken = titleDialogBuyToken;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesBuyTokenDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesBuyTokenDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.families_buy_token_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FamiliesBuyTokenDialogBinding bind(@NonNull View rootView) {
        int i = R.id.button_buy_token;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_buy_token);
        if (appCompatButton != null) {
            i = 2131362515;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, 2131362515);
            if (appCompatButton2 != null) {
                i = R.id.dialog_buy_token_bg_effect;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.dialog_buy_token_bg_effect);
                if (findChildViewById != null) {
                    i = R.id.dialog_buy_token_bg_view;
                    View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.dialog_buy_token_bg_view);
                    if (findChildViewById2 != null) {
                        i = R.id.dialog_buy_token_body_item;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.dialog_buy_token_body_item);
                        if (textView != null) {
                            i = R.id.edit_text_token_value;
                            CustomEditText customEditText = (CustomEditText) ViewBindings.findChildViewById(rootView, R.id.edit_text_token_value);
                            if (customEditText != null) {
                                i = R.id.text_title_buy_token;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_title_buy_token);
                                if (textView2 != null) {
                                    i = R.id.text_value_buy_token;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_value_buy_token);
                                    if (textView3 != null) {
                                        i = R.id.title_dialog_buy_token;
                                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.title_dialog_buy_token);
                                        if (findChildViewById3 != null) {
                                            return new FamiliesBuyTokenDialogBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, findChildViewById, findChildViewById2, textView, customEditText, textView2, textView3, findChildViewById3);
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
