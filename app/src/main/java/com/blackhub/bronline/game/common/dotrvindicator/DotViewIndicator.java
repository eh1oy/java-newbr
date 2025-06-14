package com.blackhub.bronline.game.common.dotrvindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.AnimatorRes;
import androidx.annotation.DrawableRes;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class DotViewIndicator extends LinearLayout {
    public static final int DEFAULT_INDICATOR_WIDTH = 5;
    public int currentPosition;
    public boolean isAnimationEnable;
    public int itemCount;
    public Animator mAnimatorIn;
    public Animator mAnimatorOut;
    public int mAnimatorResId;
    public int mAnimatorReverseResId;
    public Animator mImmediateAnimatorIn;
    public Animator mImmediateAnimatorOut;
    public int mIndicatorBackgroundResId;
    public int mIndicatorHeight;
    public int mIndicatorMargin;
    public int mIndicatorUnselectedBackgroundResId;
    public int mIndicatorWidth;
    public int mLastPosition;

    public DotViewIndicator(Context context) {
        super(context);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, null);
    }

    public DotViewIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public DotViewIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public DotViewIndicator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public final void init(Context context, AttributeSet attrs) {
        handleTypedArray(context, attrs);
        checkIndicatorConfig(context);
    }

    public final void handleTypedArray(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.DotViewIndicator);
        this.mIndicatorWidth = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.mIndicatorHeight = obtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.mIndicatorMargin = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        this.mAnimatorResId = obtainStyledAttributes.getResourceId(1, R.animator.scale_with_alpha);
        this.mAnimatorReverseResId = obtainStyledAttributes.getResourceId(2, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, R.drawable.bg_oval_white);
        this.mIndicatorBackgroundResId = resourceId;
        this.mIndicatorUnselectedBackgroundResId = obtainStyledAttributes.getResourceId(6, resourceId);
        this.isAnimationEnable = obtainStyledAttributes.getBoolean(0, true);
        setOrientation(obtainStyledAttributes.getInt(10, -1) != 1 ? 0 : 1);
        int i = obtainStyledAttributes.getInt(7, -1);
        if (i < 0) {
            i = 17;
        }
        setGravity(i);
        obtainStyledAttributes.recycle();
    }

    public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin) {
        configureIndicator(indicatorWidth, indicatorHeight, indicatorMargin, R.animator.scale_with_alpha, 0, R.drawable.bg_oval_white, R.drawable.bg_oval_white);
    }

    public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin, @AnimatorRes int animatorId, @AnimatorRes int animatorReverseId, @DrawableRes int indicatorBackgroundId, @DrawableRes int indicatorUnselectedBackgroundId) {
        this.mIndicatorWidth = indicatorWidth;
        this.mIndicatorHeight = indicatorHeight;
        this.mIndicatorMargin = indicatorMargin;
        this.mAnimatorResId = animatorId;
        this.mAnimatorReverseResId = animatorReverseId;
        this.mIndicatorBackgroundResId = indicatorBackgroundId;
        this.mIndicatorUnselectedBackgroundResId = indicatorUnselectedBackgroundId;
        checkIndicatorConfig(getContext());
    }

    public final void checkIndicatorConfig(Context context) {
        int i = this.mIndicatorWidth;
        if (i < 0) {
            i = dip2px(5.0f);
        }
        this.mIndicatorWidth = i;
        int i2 = this.mIndicatorHeight;
        if (i2 < 0) {
            i2 = dip2px(5.0f);
        }
        this.mIndicatorHeight = i2;
        int i3 = this.mIndicatorMargin;
        if (i3 < 0) {
            i3 = dip2px(5.0f);
        }
        this.mIndicatorMargin = i3;
        int i4 = this.mAnimatorResId;
        if (i4 == 0) {
            i4 = R.animator.scale_with_alpha;
        }
        this.mAnimatorResId = i4;
        this.mAnimatorOut = createAnimatorOut(context);
        Animator createAnimatorOut = createAnimatorOut(context);
        this.mImmediateAnimatorOut = createAnimatorOut;
        createAnimatorOut.setDuration(0L);
        this.mAnimatorIn = createAnimatorIn(context);
        Animator createAnimatorIn = createAnimatorIn(context);
        this.mImmediateAnimatorIn = createAnimatorIn;
        createAnimatorIn.setDuration(0L);
        int i5 = this.mIndicatorBackgroundResId;
        if (i5 == 0) {
            i5 = R.drawable.bg_oval_white;
        }
        this.mIndicatorBackgroundResId = i5;
        int i6 = this.mIndicatorUnselectedBackgroundResId;
        if (i6 != 0) {
            i5 = i6;
        }
        this.mIndicatorUnselectedBackgroundResId = i5;
    }

    public final Animator createAnimatorOut(Context context) {
        return AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
    }

    public final Animator createAnimatorIn(Context context) {
        int i = this.mAnimatorReverseResId;
        if (i == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
            loadAnimator.setInterpolator(new ReverseInterpolator());
            return loadAnimator;
        }
        return AnimatorInflater.loadAnimator(context, i);
    }

    public void updateCircleIndicator() {
        int itemCount = getItemCount();
        if (itemCount == getChildCount()) {
            return;
        }
        if (this.mLastPosition < itemCount) {
            this.mLastPosition = getCurrentPosition();
        } else {
            this.mLastPosition = -1;
        }
        if (this.mLastPosition == -1 && itemCount > 0) {
            this.mLastPosition = 0;
        }
        createIndicators();
    }

    public void onCurrentLocationChange() {
        View childAt;
        if (this.isAnimationEnable) {
            if (this.mAnimatorIn.isRunning()) {
                this.mAnimatorIn.end();
                this.mAnimatorIn.cancel();
            }
            if (this.mAnimatorOut.isRunning()) {
                this.mAnimatorOut.end();
                this.mAnimatorOut.cancel();
            }
        }
        int i = this.mLastPosition;
        if (i >= 0 && (childAt = getChildAt(i)) != null) {
            childAt.setBackgroundResource(this.mIndicatorUnselectedBackgroundResId);
            if (this.isAnimationEnable) {
                this.mAnimatorIn.setTarget(childAt);
                this.mAnimatorIn.start();
            }
        }
        int currentPosition = getCurrentPosition();
        View childAt2 = getChildAt(currentPosition);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.mIndicatorBackgroundResId);
            if (this.isAnimationEnable) {
                this.mAnimatorOut.setTarget(childAt2);
                this.mAnimatorOut.start();
            }
        }
        this.mLastPosition = currentPosition;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
        updateCircleIndicator();
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
        onCurrentLocationChange();
    }

    public final void createIndicators() {
        removeAllViews();
        int itemCount = getItemCount();
        if (itemCount <= 0) {
            return;
        }
        int currentPosition = getCurrentPosition();
        int orientation = getOrientation();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        for (int i = 0; i < itemCount; i++) {
            if (currentPosition == i) {
                addIndicator(orientation, this.mIndicatorBackgroundResId, this.mImmediateAnimatorOut);
            } else {
                addIndicator(orientation, this.mIndicatorUnselectedBackgroundResId, this.mImmediateAnimatorIn);
            }
        }
    }

    public final void addIndicator(int orientation, @DrawableRes int backgroundDrawableId, Animator animator) {
        if (this.isAnimationEnable && animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(backgroundDrawableId);
        addView(view, this.mIndicatorWidth, this.mIndicatorHeight);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (orientation == 0) {
            int i = this.mIndicatorMargin;
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        } else {
            int i2 = this.mIndicatorMargin;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        }
        view.setLayoutParams(layoutParams);
        if (this.isAnimationEnable) {
            animator.setTarget(view);
            animator.start();
        }
    }

    public int dip2px(float dpValue) {
        return (int) ((dpValue * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    public static class ReverseInterpolator implements Interpolator {
        public ReverseInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float value) {
            return Math.abs(1.0f - value);
        }
    }
}
