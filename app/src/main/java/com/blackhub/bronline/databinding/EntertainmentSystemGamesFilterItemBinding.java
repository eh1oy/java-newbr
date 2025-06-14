package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class EntertainmentSystemGamesFilterItemBinding implements ViewBinding {

    @NonNull
    public final TextView gameItemFilter;

    @NonNull
    public final ConstraintLayout rootView;

    public EntertainmentSystemGamesFilterItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView gameItemFilter) {
        this.rootView = rootView;
        this.gameItemFilter = gameItemFilter;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EntertainmentSystemGamesFilterItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static EntertainmentSystemGamesFilterItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.entertainment_system_games_filter_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static EntertainmentSystemGamesFilterItemBinding bind(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.game_item_filter);
        if (textView != null) {
            return new EntertainmentSystemGamesFilterItemBinding((ConstraintLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.game_item_filter)));
    }
}
