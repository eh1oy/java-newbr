package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class HalloweenLobbyPlayerItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton button;

    @NonNull
    public final TextView name;

    @NonNull
    public final RelativeLayout rootView;

    public HalloweenLobbyPlayerItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton button, @NonNull TextView name) {
        this.rootView = rootView;
        this.button = button;
        this.name = name;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HalloweenLobbyPlayerItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HalloweenLobbyPlayerItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.halloween_lobby_player_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static HalloweenLobbyPlayerItemBinding bind(@NonNull View rootView) {
        int i = R.id.button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button);
        if (appCompatButton != null) {
            i = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
            if (textView != null) {
                return new HalloweenLobbyPlayerItemBinding((RelativeLayout) rootView, appCompatButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
