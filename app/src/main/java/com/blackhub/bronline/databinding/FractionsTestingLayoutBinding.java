package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.mkloader.MKLoader;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public final class FractionsTestingLayoutBinding implements ViewBinding {

    @NonNull
    public final View bottomBody;

    @NonNull
    public final View leftTitleDiver;

    @NonNull
    public final MKLoader loader;

    @NonNull
    public final RecyclerView recyclerViewTesting;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textViewQuestionTitle;

    @NonNull
    public final TextView textViewTestingTitle;

    @NonNull
    public final View topTitleBlock;

    public FractionsTestingLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View bottomBody, @NonNull View leftTitleDiver, @NonNull MKLoader loader, @NonNull RecyclerView recyclerViewTesting, @NonNull TextView textViewQuestionTitle, @NonNull TextView textViewTestingTitle, @NonNull View topTitleBlock) {
        this.rootView = rootView;
        this.bottomBody = bottomBody;
        this.leftTitleDiver = leftTitleDiver;
        this.loader = loader;
        this.recyclerViewTesting = recyclerViewTesting;
        this.textViewQuestionTitle = textViewQuestionTitle;
        this.textViewTestingTitle = textViewTestingTitle;
        this.topTitleBlock = topTitleBlock;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FractionsTestingLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FractionsTestingLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fractions_testing_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    @NonNull
    public static FractionsTestingLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_body;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_body);
        if (findChildViewById != null) {
            i = R.id.left_title_diver;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.left_title_diver);
            if (findChildViewById2 != null) {
                i = R.id.loader;
                MKLoader mKLoader = (MKLoader) ViewBindings.findChildViewById(rootView, R.id.loader);
                if (mKLoader != null) {
                    i = R.id.recycler_view_testing;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view_testing);
                    if (recyclerView != null) {
                        i = R.id.text_view_question_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_question_title);
                        if (textView != null) {
                            i = R.id.text_view_testing_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_view_testing_title);
                            if (textView2 != null) {
                                i = R.id.top_title_block;
                                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.top_title_block);
                                if (findChildViewById3 != null) {
                                    return new FractionsTestingLayoutBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, mKLoader, recyclerView, textView, textView2, findChildViewById3);
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
