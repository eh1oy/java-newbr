package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.google.android.material.slider.Slider;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class SliderForNewMenuSettingsGraphicBinding implements ViewBinding {

    @NonNull
    public final View progress0;

    @NonNull
    public final View progress1;

    @NonNull
    public final View progress2;

    @NonNull
    public final View progress3;

    @NonNull
    public final View rootView;

    @NonNull
    public final Slider seekBar;

    public SliderForNewMenuSettingsGraphicBinding(@NonNull View rootView, @NonNull View progress0, @NonNull View progress1, @NonNull View progress2, @NonNull View progress3, @NonNull Slider seekBar) {
        this.rootView = rootView;
        this.progress0 = progress0;
        this.progress1 = progress1;
        this.progress2 = progress2;
        this.progress3 = progress3;
        this.seekBar = seekBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SliderForNewMenuSettingsGraphicBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException("parent");
        }
        inflater.inflate(R.layout.slider_for_new_menu_settings_graphic, parent);
        return bind(parent);
    }

    @NonNull
    public static SliderForNewMenuSettingsGraphicBinding bind(@NonNull View rootView) {
        int i = R.id.progress_0;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.progress_0);
        if (findChildViewById != null) {
            i = R.id.progress_1;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.progress_1);
            if (findChildViewById2 != null) {
                i = R.id.progress_2;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.progress_2);
                if (findChildViewById3 != null) {
                    i = R.id.progress_3;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.progress_3);
                    if (findChildViewById4 != null) {
                        i = R.id.seek_bar;
                        Slider slider = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bar);
                        if (slider != null) {
                            return new SliderForNewMenuSettingsGraphicBinding(rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, slider);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
