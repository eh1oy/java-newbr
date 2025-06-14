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
public final class EntertainmentSystemGamesItemBinding implements ViewBinding {

    @NonNull
    public final TextView actionsTitle;

    @NonNull
    public final View bgItem;

    @NonNull
    public final View bgItemsBorder;

    @NonNull
    public final AppCompatButton buttonAction;

    @NonNull
    public final ImageView itemsIcon;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView valueOfPlayers;

    public EntertainmentSystemGamesItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView actionsTitle, @NonNull View bgItem, @NonNull View bgItemsBorder, @NonNull AppCompatButton buttonAction, @NonNull ImageView itemsIcon, @NonNull TextView valueOfPlayers) {
        this.rootView = rootView;
        this.actionsTitle = actionsTitle;
        this.bgItem = bgItem;
        this.bgItemsBorder = bgItemsBorder;
        this.buttonAction = buttonAction;
        this.itemsIcon = itemsIcon;
        this.valueOfPlayers = valueOfPlayers;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemGamesItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemGamesItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.entertainment_system_games_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static EntertainmentSystemGamesItemBinding bind(@NonNull View rootView) {
        int i = R.id.actions_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.actions_title);
        if (textView != null) {
            i = R.id.bg_item;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_item);
            if (findChildViewById != null) {
                i = R.id.bg_items_border;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_items_border);
                if (findChildViewById2 != null) {
                    i = 2131362502;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, 2131362502);
                    if (appCompatButton != null) {
                        i = R.id.items_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.items_icon);
                        if (imageView != null) {
                            i = R.id.value_of_players;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_of_players);
                            if (textView2 != null) {
                                return new EntertainmentSystemGamesItemBinding((ConstraintLayout) rootView, textView, findChildViewById, findChildViewById2, appCompatButton, imageView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
