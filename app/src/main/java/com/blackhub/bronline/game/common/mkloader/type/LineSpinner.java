package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Line;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class LineSpinner extends LoaderView {
    public Line[] lines;
    public final int numberOfLine = 8;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float min = Math.min(this.width, this.height);
        float f = min / 10.0f;
        this.lines = new Line[this.numberOfLine];
        for (int i = 0; i < this.numberOfLine; i++) {
            this.lines[i] = new Line();
            this.lines[i].setColor(this.color);
            this.lines[i].setAlpha(126);
            this.lines[i].setWidth(f);
            Line line = this.lines[i];
            PointF pointF = this.center;
            line.setPoint1(new PointF(pointF.x, (pointF.y - (min / 2.0f)) + f));
            this.lines[i].setPoint2(new PointF(this.center.x, this.lines[i].getPoint1().y + (2.0f * f)));
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.numberOfLine; i++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(126, 255, 126);
            ofInt.setRepeatCount(-1);
            ofInt.setDuration(1000L);
            ofInt.setStartDelay(i * 120);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.LineSpinner$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LineSpinner.this.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            ofInt.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpAnimation$0(int i, ValueAnimator valueAnimator) {
        this.lines[i].setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.numberOfLine; i++) {
            canvas.save();
            PointF pointF = this.center;
            canvas.rotate(i * 45, pointF.x, pointF.y);
            this.lines[i].draw(canvas);
            canvas.restore();
        }
    }
}
