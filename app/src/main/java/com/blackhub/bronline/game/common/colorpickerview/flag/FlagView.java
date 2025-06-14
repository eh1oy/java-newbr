package com.blackhub.bronline.game.common.colorpickerview.flag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.blackhub.bronline.game.common.colorpickerview.ColorEnvelope;
import com.blackhub.bronline.game.common.colorpickerview.FadeUtils;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public abstract class FlagView extends RelativeLayout {
    public FlagMode flagMode;
    public boolean flipAble;

    public abstract void onRefresh(ColorEnvelope colorEnvelope);

    public FlagView(Context context, int layout) {
        super(context);
        this.flagMode = FlagMode.ALWAYS;
        this.flipAble = true;
        initializeLayout(layout);
    }

    public void receiveOnTouchEvent(MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            if (getFlagMode() == FlagMode.LAST) {
                gone();
                return;
            } else {
                if (getFlagMode() == FlagMode.FADE) {
                    FadeUtils.fadeIn(this);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (getFlagMode() == FlagMode.LAST) {
                    gone();
                    return;
                }
                return;
            }
        } else if (getFlagMode() == FlagMode.LAST) {
            visible();
        } else if (getFlagMode() == FlagMode.FADE) {
            FadeUtils.fadeOut(this);
        }
        visible();
    }

    public final void initializeLayout(int layout) {
        View inflate = LayoutInflater.from(getContext()).inflate(layout, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getWidth(), inflate.getMeasuredHeight());
    }

    public void visible() {
        setVisibility(0);
    }

    public void gone() {
        setVisibility(8);
    }

    public FlagMode getFlagMode() {
        return this.flagMode;
    }

    public void setFlagMode(FlagMode flagMode) {
        this.flagMode = flagMode;
    }

    public boolean isFlipAble() {
        return this.flipAble;
    }

    public void setFlipAble(boolean flipAble) {
        this.flipAble = flipAble;
    }
}
