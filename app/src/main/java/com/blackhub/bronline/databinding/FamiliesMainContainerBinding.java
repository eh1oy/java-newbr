package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FamiliesMainContainerBinding implements ViewBinding {

    @NonNull
    public final View bgBlackCoinView;

    @NonNull
    public final View bgMoneyView;

    @NonNull
    public final View bgTitleMask;

    @NonNull
    public final View blackCoinUnderline;

    @NonNull
    public final TextView blackCoinValue;

    @NonNull
    public final ImageView buttonAddMoney;

    @NonNull
    public final AppCompatButton buttonBack;

    @NonNull
    public final AppCompatButton buttonClose;

    @NonNull
    public final AppCompatButton buttonFamiliesSetting;

    @NonNull
    public final ImageView buttonNotification;

    @NonNull
    public final AppCompatButton buttonTop;

    @NonNull
    public final ImageView familyBgImage;

    @NonNull
    public final UIContainer mainContainer;

    @NonNull
    public final View moneyUnderline;

    @NonNull
    public final TextView moneyValue;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View titleDiver;

    @NonNull
    public final TextView titleText;

    @NonNull
    public final TextView valueNotification;

    public FamiliesMainContainerBinding(@NonNull ConstraintLayout rootView, @NonNull View bgBlackCoinView, @NonNull View bgMoneyView, @NonNull View bgTitleMask, @NonNull View blackCoinUnderline, @NonNull TextView blackCoinValue, @NonNull ImageView buttonAddMoney, @NonNull AppCompatButton buttonBack, @NonNull AppCompatButton buttonClose, @NonNull AppCompatButton buttonFamiliesSetting, @NonNull ImageView buttonNotification, @NonNull AppCompatButton buttonTop, @NonNull ImageView familyBgImage, @NonNull UIContainer mainContainer, @NonNull View moneyUnderline, @NonNull TextView moneyValue, @NonNull View titleDiver, @NonNull TextView titleText, @NonNull TextView valueNotification) {
        this.rootView = rootView;
        this.bgBlackCoinView = bgBlackCoinView;
        this.bgMoneyView = bgMoneyView;
        this.bgTitleMask = bgTitleMask;
        this.blackCoinUnderline = blackCoinUnderline;
        this.blackCoinValue = blackCoinValue;
        this.buttonAddMoney = buttonAddMoney;
        this.buttonBack = buttonBack;
        this.buttonClose = buttonClose;
        this.buttonFamiliesSetting = buttonFamiliesSetting;
        this.buttonNotification = buttonNotification;
        this.buttonTop = buttonTop;
        this.familyBgImage = familyBgImage;
        this.mainContainer = mainContainer;
        this.moneyUnderline = moneyUnderline;
        this.moneyValue = moneyValue;
        this.titleDiver = titleDiver;
        this.titleText = titleText;
        this.valueNotification = valueNotification;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMainContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMainContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.families_main_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FamiliesMainContainerBinding bind(@NonNull View rootView) {
        int i = R.id.bg_black_coin_view;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_black_coin_view);
        if (findChildViewById != null) {
            i = R.id.bg_money_view;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_money_view);
            if (findChildViewById2 != null) {
                i = R.id.bg_title_mask;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.bg_title_mask);
                if (findChildViewById3 != null) {
                    i = R.id.black_coin_underline;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.black_coin_underline);
                    if (findChildViewById4 != null) {
                        i = R.id.black_coin_value;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.black_coin_value);
                        if (textView != null) {
                            i = R.id.button_add_money;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_add_money);
                            if (imageView != null) {
                                i = R.id.button_back;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_back);
                                if (appCompatButton != null) {
                                    i = 2131362517;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, 2131362517);
                                    if (appCompatButton2 != null) {
                                        i = R.id.button_families_setting;
                                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_families_setting);
                                        if (appCompatButton3 != null) {
                                            i = R.id.button_notification;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_notification);
                                            if (imageView2 != null) {
                                                i = R.id.button_top;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_top);
                                                if (appCompatButton4 != null) {
                                                    i = R.id.family_bg_image;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.family_bg_image);
                                                    if (imageView3 != null) {
                                                        i = R.id.main_container;
                                                        UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.main_container);
                                                        if (uIContainer != null) {
                                                            i = R.id.money_underline;
                                                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.money_underline);
                                                            if (findChildViewById5 != null) {
                                                                i = R.id.money_value;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value);
                                                                if (textView2 != null) {
                                                                    i = R.id.title_diver;
                                                                    View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.title_diver);
                                                                    if (findChildViewById6 != null) {
                                                                        i = 2131364315;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, 2131364315);
                                                                        if (textView3 != null) {
                                                                            i = R.id.value_notification;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_notification);
                                                                            if (textView4 != null) {
                                                                                return new FamiliesMainContainerBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, textView, imageView, appCompatButton, appCompatButton2, appCompatButton3, imageView2, appCompatButton4, imageView3, uIContainer, findChildViewById5, textView2, findChildViewById6, textView3, textView4);
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
