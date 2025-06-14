package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FamiliesMainLayoutBinding implements ViewBinding {

    @NonNull
    public final View familyItem1;

    @NonNull
    public final View familyItem2;

    @NonNull
    public final View familyItem3;

    @NonNull
    public final View familyItem4;

    @NonNull
    public final View familyItem5;

    @NonNull
    public final ImageView item1Icon;

    @NonNull
    public final TextView item1Title;

    @NonNull
    public final ImageView item2Icon;

    @NonNull
    public final TextView item2Title;

    @NonNull
    public final ImageView item3Icon;

    @NonNull
    public final TextView item3Title;

    @NonNull
    public final ImageView item4Icon;

    @NonNull
    public final TextView item4Title;

    @NonNull
    public final ImageView item5Icon;

    @NonNull
    public final TextView item5Title;

    @NonNull
    public final NestedScrollView rootView;

    public FamiliesMainLayoutBinding(@NonNull NestedScrollView rootView, @NonNull View familyItem1, @NonNull View familyItem2, @NonNull View familyItem3, @NonNull View familyItem4, @NonNull View familyItem5, @NonNull ImageView item1Icon, @NonNull TextView item1Title, @NonNull ImageView item2Icon, @NonNull TextView item2Title, @NonNull ImageView item3Icon, @NonNull TextView item3Title, @NonNull ImageView item4Icon, @NonNull TextView item4Title, @NonNull ImageView item5Icon, @NonNull TextView item5Title) {
        this.rootView = rootView;
        this.familyItem1 = familyItem1;
        this.familyItem2 = familyItem2;
        this.familyItem3 = familyItem3;
        this.familyItem4 = familyItem4;
        this.familyItem5 = familyItem5;
        this.item1Icon = item1Icon;
        this.item1Title = item1Title;
        this.item2Icon = item2Icon;
        this.item2Title = item2Title;
        this.item3Icon = item3Icon;
        this.item3Title = item3Title;
        this.item4Icon = item4Icon;
        this.item4Title = item4Title;
        this.item5Icon = item5Icon;
        this.item5Title = item5Title;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FamiliesMainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FamiliesMainLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.families_main_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FamiliesMainLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.family_item_1;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.family_item_1);
        if (findChildViewById != null) {
            i = R.id.family_item_2;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.family_item_2);
            if (findChildViewById2 != null) {
                i = R.id.family_item_3;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.family_item_3);
                if (findChildViewById3 != null) {
                    i = R.id.family_item_4;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.family_item_4);
                    if (findChildViewById4 != null) {
                        i = R.id.family_item_5;
                        View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.family_item_5);
                        if (findChildViewById5 != null) {
                            i = R.id.item_1_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_1_icon);
                            if (imageView != null) {
                                i = R.id.item_1_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_1_title);
                                if (textView != null) {
                                    i = R.id.item_2_icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_2_icon);
                                    if (imageView2 != null) {
                                        i = R.id.item_2_title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_2_title);
                                        if (textView2 != null) {
                                            i = R.id.item_3_icon;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_3_icon);
                                            if (imageView3 != null) {
                                                i = R.id.item_3_title;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_3_title);
                                                if (textView3 != null) {
                                                    i = R.id.item_4_icon;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_4_icon);
                                                    if (imageView4 != null) {
                                                        i = R.id.item_4_title;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_4_title);
                                                        if (textView4 != null) {
                                                            i = R.id.item_5_icon;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_5_icon);
                                                            if (imageView5 != null) {
                                                                i = R.id.item_5_title;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_5_title);
                                                                if (textView5 != null) {
                                                                    return new FamiliesMainLayoutBinding((NestedScrollView) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, imageView, textView, imageView2, textView2, imageView3, textView3, imageView4, textView4, imageView5, textView5);
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
