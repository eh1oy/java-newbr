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
public class Radar extends LoaderView {
    public float degree;
    public Line line;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float min = Math.min(this.width, this.height);
        Line line = new Line();
        this.line = line;
        line.setPoint1(this.center);
        this.line.setPoint2(new PointF(0.0f, min / 2.0f));
        this.line.setColor(this.color);
        this.line.setWidth(5.0f);
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Radar$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Radar.this.lambda$setUpAnimation$0(valueAnimator);
            }
        });
        ofFloat.start();
    }

    public final /* synthetic */ void lambda$setUpAnimation$0(ValueAnimator valueAnimator) {
        this.degree = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        canvas.save();
        float f = this.degree;
        PointF pointF = this.center;
        canvas.rotate(f, pointF.x, pointF.y);
        this.line.draw(canvas);
        canvas.restore();
    }
}
