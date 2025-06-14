package com.blackhub.bronline.game.common.colorpickerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.colorpickerview.sliders.AlphaTileDrawable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class AlphaTileView extends View {
    public Bitmap backgroundBitmap;
    public final AlphaTileDrawable.Builder builder;
    public Paint colorPaint;

    public AlphaTileView(Context context) {
        super(context);
        this.builder = new AlphaTileDrawable.Builder();
        onCreate();
    }

    public AlphaTileView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.builder = new AlphaTileDrawable.Builder();
        onCreate();
        getAttrs(attrs);
    }

    public AlphaTileView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.builder = new AlphaTileDrawable.Builder();
        onCreate();
        getAttrs(attrs);
    }

    public AlphaTileView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.builder = new AlphaTileDrawable.Builder();
        onCreate();
        getAttrs(attrs);
    }

    public final void onCreate() {
        this.colorPaint = new Paint(1);
        setBackgroundColor(-1);
    }

    public final void getAttrs(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.AlphaTileView);
        try {
            if (obtainStyledAttributes.hasValue(2)) {
                AlphaTileDrawable.Builder builder = this.builder;
                builder.setTileSize(obtainStyledAttributes.getInt(2, builder.getTileSize()));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                AlphaTileDrawable.Builder builder2 = this.builder;
                builder2.setTileOddColor(obtainStyledAttributes.getInt(1, builder2.getTileOddColor()));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                AlphaTileDrawable.Builder builder3 = this.builder;
                builder3.setTileEvenColor(obtainStyledAttributes.getInt(0, builder3.getTileEvenColor()));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        AlphaTileDrawable build = this.builder.build();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.backgroundBitmap = createBitmap;
        if (createBitmap.isRecycled()) {
            return;
        }
        Canvas canvas = new Canvas(this.backgroundBitmap);
        build.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        build.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.backgroundBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getMeasuredHeight(), this.colorPaint);
    }

    public void setPaintColor(int color) {
        this.colorPaint.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        setPaintColor(color);
    }
}
