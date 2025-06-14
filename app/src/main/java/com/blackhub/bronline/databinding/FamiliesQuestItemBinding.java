package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class FamiliesQuestItemBinding implements ViewBinding {

    @NonNull
    public final View present1Bg;

    @NonNull
    public final ImageView present1Item;

    @NonNull
    public final View present2Bg;

    @NonNull
    public final ImageView present2Item;

    @NonNull
    public final View present3Bg;

    @NonNull
    public final ImageView present3Item;

    @NonNull
    public final TextView questionsTitle;

    @NonNull
    public final ConstraintLayout rootView;

    public FamiliesQuestItemBinding(@NonNull ConstraintLayout rootView, @NonNull View present1Bg, @NonNull ImageView present1Item, @NonNull View present2Bg, @NonNull ImageView present2Item, @NonNull View present3Bg, @NonNull ImageView present3Item, @NonNull TextView questionsTitle) {
        this.rootView = rootView;
        this.present1Bg = present1Bg;
        this.present1Item = present1Item;
        this.present2Bg = present2Bg;
        this.present2Item = present2Item;
        this.present3Bg = present3Bg;
        this.present3Item = present3Item;
        this.questionsTitle = questionsTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesQuestItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesQuestItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.families_quest_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FamiliesQuestItemBinding bind(@NonNull View rootView) {
        int i = R.id.present_1_bg;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.present_1_bg);
        if (findChildViewById != null) {
            i = R.id.present_1_item;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_1_item);
            if (imageView != null) {
                i = R.id.present_2_bg;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.present_2_bg);
                if (findChildViewById2 != null) {
                    i = R.id.present_2_item;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_2_item);
                    if (imageView2 != null) {
                        i = R.id.present_3_bg;
                        View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.present_3_bg);
                        if (findChildViewById3 != null) {
                            i = R.id.present_3_item;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.present_3_item);
                            if (imageView3 != null) {
                                i = R.id.questions_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.questions_title);
                                if (textView != null) {
                                    return new FamiliesQuestItemBinding((ConstraintLayout) rootView, findChildViewById, imageView, findChildViewById2, imageView2, findChildViewById3, imageView3, textView);
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
