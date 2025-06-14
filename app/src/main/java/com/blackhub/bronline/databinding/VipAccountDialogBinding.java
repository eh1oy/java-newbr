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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class VipAccountDialogBinding implements ViewBinding {

    @NonNull
    public final View bottomYellowLine;

    @NonNull
    public final AppCompatButton buttonByuVip;

    @NonNull
    public final View closeVipAccountDialog;

    @NonNull
    public final View helpEndPosition;

    @NonNull
    public final View iconWorker;

    @NonNull
    public final View leftBlock;

    @NonNull
    public final TextView moneyCurrency;

    @NonNull
    public final TextView moneyCurrencyInfo;

    @NonNull
    public final TextView moneyCurrencyWould;

    @NonNull
    public final ImageView moneyIcon;

    @NonNull
    public final ImageView moneyIconWould;

    @NonNull
    public final TextView moneyValue;

    @NonNull
    public final TextView moneyValueWould;

    @NonNull
    public final View possibleEarningsBg;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View topYellowLine;

    @NonNull
    public final TextView vipAccountText1;

    @NonNull
    public final TextView vipAccountText2;

    @NonNull
    public final View vipCrowIcon;

    @NonNull
    public final View whiteLine;

    @NonNull
    public final TextView wouldEarnTitle;

    @NonNull
    public final ImageView wouldVip;

    @NonNull
    public final View yourPayBg;

    @NonNull
    public final TextView yourPayTitle;

    public VipAccountDialogBinding(@NonNull ConstraintLayout rootView, @NonNull View bottomYellowLine, @NonNull AppCompatButton buttonByuVip, @NonNull View closeVipAccountDialog, @NonNull View helpEndPosition, @NonNull View iconWorker, @NonNull View leftBlock, @NonNull TextView moneyCurrency, @NonNull TextView moneyCurrencyInfo, @NonNull TextView moneyCurrencyWould, @NonNull ImageView moneyIcon, @NonNull ImageView moneyIconWould, @NonNull TextView moneyValue, @NonNull TextView moneyValueWould, @NonNull View possibleEarningsBg, @NonNull View topYellowLine, @NonNull TextView vipAccountText1, @NonNull TextView vipAccountText2, @NonNull View vipCrowIcon, @NonNull View whiteLine, @NonNull TextView wouldEarnTitle, @NonNull ImageView wouldVip, @NonNull View yourPayBg, @NonNull TextView yourPayTitle) {
        this.rootView = rootView;
        this.bottomYellowLine = bottomYellowLine;
        this.buttonByuVip = buttonByuVip;
        this.closeVipAccountDialog = closeVipAccountDialog;
        this.helpEndPosition = helpEndPosition;
        this.iconWorker = iconWorker;
        this.leftBlock = leftBlock;
        this.moneyCurrency = moneyCurrency;
        this.moneyCurrencyInfo = moneyCurrencyInfo;
        this.moneyCurrencyWould = moneyCurrencyWould;
        this.moneyIcon = moneyIcon;
        this.moneyIconWould = moneyIconWould;
        this.moneyValue = moneyValue;
        this.moneyValueWould = moneyValueWould;
        this.possibleEarningsBg = possibleEarningsBg;
        this.topYellowLine = topYellowLine;
        this.vipAccountText1 = vipAccountText1;
        this.vipAccountText2 = vipAccountText2;
        this.vipCrowIcon = vipCrowIcon;
        this.whiteLine = whiteLine;
        this.wouldEarnTitle = wouldEarnTitle;
        this.wouldVip = wouldVip;
        this.yourPayBg = yourPayBg;
        this.yourPayTitle = yourPayTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static VipAccountDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static VipAccountDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.vip_account_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static VipAccountDialogBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_yellow_line;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_yellow_line);
        if (findChildViewById != null) {
            i = R.id.button_byu_vip;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_byu_vip);
            if (appCompatButton != null) {
                i = R.id.close_vip_account_dialog;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.close_vip_account_dialog);
                if (findChildViewById2 != null) {
                    i = R.id.help_end_position;
                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.help_end_position);
                    if (findChildViewById3 != null) {
                        i = R.id.icon_worker;
                        View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.icon_worker);
                        if (findChildViewById4 != null) {
                            i = R.id.left_block;
                            View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.left_block);
                            if (findChildViewById5 != null) {
                                i = R.id.money_currency;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_currency);
                                if (textView != null) {
                                    i = R.id.money_currency_info;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_currency_info);
                                    if (textView2 != null) {
                                        i = R.id.money_currency_would;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_currency_would);
                                        if (textView3 != null) {
                                            i = R.id.money_icon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.money_icon);
                                            if (imageView != null) {
                                                i = R.id.money_icon_would;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.money_icon_would);
                                                if (imageView2 != null) {
                                                    i = R.id.money_value;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value);
                                                    if (textView4 != null) {
                                                        i = R.id.money_value_would;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.money_value_would);
                                                        if (textView5 != null) {
                                                            i = R.id.possible_earnings_bg;
                                                            View findChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.possible_earnings_bg);
                                                            if (findChildViewById6 != null) {
                                                                i = R.id.top_yellow_line;
                                                                View findChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.top_yellow_line);
                                                                if (findChildViewById7 != null) {
                                                                    i = R.id.vip_account_text_1;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.vip_account_text_1);
                                                                    if (textView6 != null) {
                                                                        i = R.id.vip_account_text_2;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.vip_account_text_2);
                                                                        if (textView7 != null) {
                                                                            i = R.id.vip_crow_icon;
                                                                            View findChildViewById8 = ViewBindings.findChildViewById(rootView, R.id.vip_crow_icon);
                                                                            if (findChildViewById8 != null) {
                                                                                i = R.id.white_line;
                                                                                View findChildViewById9 = ViewBindings.findChildViewById(rootView, R.id.white_line);
                                                                                if (findChildViewById9 != null) {
                                                                                    i = R.id.would_earn_title;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.would_earn_title);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.would_vip;
                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.would_vip);
                                                                                        if (imageView3 != null) {
                                                                                            i = R.id.your_pay_bg;
                                                                                            View findChildViewById10 = ViewBindings.findChildViewById(rootView, R.id.your_pay_bg);
                                                                                            if (findChildViewById10 != null) {
                                                                                                i = R.id.your_pay_title;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.your_pay_title);
                                                                                                if (textView9 != null) {
                                                                                                    return new VipAccountDialogBinding((ConstraintLayout) rootView, findChildViewById, appCompatButton, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, textView, textView2, textView3, imageView, imageView2, textView4, textView5, findChildViewById6, findChildViewById7, textView6, textView7, findChildViewById8, findChildViewById9, textView8, imageView3, findChildViewById10, textView9);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
