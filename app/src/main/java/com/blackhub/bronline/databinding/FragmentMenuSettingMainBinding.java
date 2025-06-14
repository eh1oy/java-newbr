package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FragmentMenuSettingMainBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton newMenuSettingButtonBackMenu;

    @NonNull
    public final TextView newMenuSettingButtonRefresh;

    @NonNull
    public final UIContainer newMenuSettingContainer;

    @NonNull
    public final RecyclerView newMenuSettingTitleButtons;

    @NonNull
    public final View newMenuSettingTitleUnderline;

    @NonNull
    public final ConstraintLayout rootView;

    public FragmentMenuSettingMainBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton newMenuSettingButtonBackMenu, @NonNull TextView newMenuSettingButtonRefresh, @NonNull UIContainer newMenuSettingContainer, @NonNull RecyclerView newMenuSettingTitleButtons, @NonNull View newMenuSettingTitleUnderline) {
        this.rootView = rootView;
        this.newMenuSettingButtonBackMenu = newMenuSettingButtonBackMenu;
        this.newMenuSettingButtonRefresh = newMenuSettingButtonRefresh;
        this.newMenuSettingContainer = newMenuSettingContainer;
        this.newMenuSettingTitleButtons = newMenuSettingTitleButtons;
        this.newMenuSettingTitleUnderline = newMenuSettingTitleUnderline;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuSettingMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuSettingMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_menu_setting_main, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FragmentMenuSettingMainBinding bind(@NonNull View rootView) {
        int i = R.id.new_menu_setting_button_back_menu;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_button_back_menu);
        if (appCompatButton != null) {
            i = R.id.new_menu_setting_button_refresh;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_button_refresh);
            if (textView != null) {
                i = R.id.new_menu_setting_container;
                UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_container);
                if (uIContainer != null) {
                    i = R.id.new_menu_setting_title_buttons;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_buttons);
                    if (recyclerView != null) {
                        i = R.id.new_menu_setting_title_underline;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_underline);
                        if (findChildViewById != null) {
                            return new FragmentMenuSettingMainBinding((ConstraintLayout) rootView, appCompatButton, textView, uIContainer, recyclerView, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
