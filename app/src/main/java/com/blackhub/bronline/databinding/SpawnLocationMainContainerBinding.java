package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.UIContainer;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class SpawnLocationMainContainerBinding implements ViewBinding {

    @NonNull
    public final UIContainer mainContainer;

    @NonNull
    public final UIContainer rootView;

    public SpawnLocationMainContainerBinding(@NonNull UIContainer rootView, @NonNull UIContainer mainContainer) {
        this.rootView = rootView;
        this.mainContainer = mainContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public UIContainer getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SpawnLocationMainContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SpawnLocationMainContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.spawn_location_main_container, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static SpawnLocationMainContainerBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        UIContainer uIContainer = (UIContainer) rootView;
        return new SpawnLocationMainContainerBinding(uIContainer, uIContainer);
    }
}
