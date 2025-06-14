package com.blackhub.bronline.game.common.roundcornerprogressbar.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.Px;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BaseRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b'\u0018\u0000 \u0097\u00012\u00020\u0001:\u0006\u0097\u0001\u0098\u0001\u0099\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010U\u001a\u00020V2\b\b\u0001\u0010W\u001a\u00020\tH\u0004J\u0012\u0010U\u001a\u00020V2\b\u0010X\u001a\u0004\u0018\u000106H\u0014J\b\u0010Y\u001a\u00020VH\u0002J\b\u0010Z\u001a\u00020VH\u0002J\u0010\u0010[\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u0019H\u0004J\b\u0010]\u001a\u00020'H\u0002J\b\u0010^\u001a\u00020'H\u0002J\b\u0010_\u001a\u00020'H\u0002J\b\u0010`\u001a\u00020'H\u0002JH\u0010a\u001a\u00020'2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010b\u001a\u00020V2\u0006\u0010c\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010d\u001a\u00020\u00192\u0006\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\t2\u0006\u0010g\u001a\u00020\u0013H$J\b\u0010h\u001a\u00020'H\u0002J\b\u0010i\u001a\u00020'H\u0002J\u0006\u0010j\u001a\u00020\u0019J\u0006\u0010k\u001a\u00020\u0019J\u0006\u0010l\u001a\u00020\tJ\b\u0010m\u001a\u00020\u0019H\u0016J\u0006\u0010n\u001a\u00020\tJ\u0006\u0010o\u001a\u00020\tJ\b\u0010p\u001a\u0004\u0018\u000106J\u0006\u0010q\u001a\u00020\tJ\b\u0010r\u001a\u00020\u0019H\u0016J\u0006\u0010s\u001a\u00020\tJ\b\u0010t\u001a\u0004\u0018\u000106J\u0006\u0010u\u001a\u00020\u0019J\b\u0010v\u001a\u00020\tH$J\u001a\u0010w\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H$J\b\u0010x\u001a\u00020'H$J\b\u0010y\u001a\u00020'H\u0016J\u0006\u0010g\u001a\u00020\u0013J\u0012\u0010z\u001a\u00020'2\b\u0010{\u001a\u0004\u0018\u00010|H\u0014J\n\u0010}\u001a\u0004\u0018\u00010|H\u0014J+\u0010~\u001a\u00020'2\u0006\u0010\u007f\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020\t2\u0007\u0010\u0081\u0001\u001a\u00020\t2\u0007\u0010\u0082\u0001\u001a\u00020\tH\u0014J\t\u0010\u0083\u0001\u001a\u00020'H$J\u0013\u0010\u0084\u0001\u001a\u00020'2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u000f\u0010\u0087\u0001\u001a\u00020'2\u0006\u0010c\u001a\u00020\u0019J\u000f\u0010\u0087\u0001\u001a\u00020'2\u0006\u0010c\u001a\u00020\tJl\u0010\u0088\u0001\u001a\u00020'2c\u0010\u0089\u0001\u001a^\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u001fJ\u0011\u0010\u008a\u0001\u001a\u00020'2\b\b\u0001\u0010f\u001a\u00020\tJ\u0011\u0010\u008b\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0019H\u0016J\u0011\u0010\u008b\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\tH\u0016J\u0011\u0010\u008c\u0001\u001a\u00020'2\b\b\u0001\u0010W\u001a\u00020\tJ\u0011\u0010\u008d\u0001\u001a\u00020'2\b\b\u0001\u0010W\u001a\u00020\tJ\u0011\u0010\u008e\u0001\u001a\u00020'2\b\u0010X\u001a\u0004\u0018\u000106J\u0011\u0010\u008f\u0001\u001a\u00020'2\b\b\u0001\u0010e\u001a\u00020\tJ\u000f\u0010\u0090\u0001\u001a\u00020'2\u0006\u0010g\u001a\u00020\u0013J\u0011\u0010\u0091\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0019H\u0016J\u0011\u0010\u0091\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\tH\u0016J\u0011\u0010\u0092\u0001\u001a\u00020'2\b\b\u0001\u0010W\u001a\u00020\tJ\u0011\u0010\u0093\u0001\u001a\u00020'2\b\u0010X\u001a\u0004\u0018\u000106J\u001b\u0010\u0094\u0001\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0019\u0010\u0095\u0001\u001a\u00020'2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010g\u001a\u00020\u0013H\u0002J\u001b\u0010\u0096\u0001\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014R\u001a\u0010\r\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRj\u0010\u001e\u001a^\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001a\u0010+\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u000106X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R\u001a\u0010>\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001a\u0010A\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R\u001c\u0010D\u001a\u0004\u0018\u000106X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001a\u0010G\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000f\"\u0004\bI\u0010\u0011R\u001a\u0010J\u001a\u00020\u0001X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u0001X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR\u001a\u0010R\u001a\u00020\u0001X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010L\"\u0004\bT\u0010N¨\u0006\u009a\u0001"}, d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "_backgroundColor", "get_backgroundColor", "()I", "set_backgroundColor", "(I)V", "_isReverse", "", "get_isReverse", "()Z", "set_isReverse", "(Z)V", "_max", "", "get_max", "()F", "set_max", "(F)V", "_onProgressChanged", "Lkotlin/Function4;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", SVG.View.NODE_NAME, "progress", "isPrimaryProgress", "isSecondaryProgress", "", "_padding", "get_padding", "set_padding", "_progress", "get_progress", "set_progress", "_progressChangedListener", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar$OnProgressChangedListener;", "get_progressChangedListener", "()Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar$OnProgressChangedListener;", "set_progressChangedListener", "(Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar$OnProgressChangedListener;)V", "_progressColor", "_progressColors", "", "get_progressColors", "()[I", "set_progressColors", "([I)V", "_radius", "get_radius", "set_radius", "_secondaryProgress", "get_secondaryProgress", "set_secondaryProgress", "_secondaryProgressColor", "get_secondaryProgressColor", "set_secondaryProgressColor", "_secondaryProgressColors", "get_secondaryProgressColors", "set_secondaryProgressColors", "_totalWidth", "get_totalWidth", "set_totalWidth", "layoutBackground", "getLayoutBackground", "()Landroid/widget/LinearLayout;", "setLayoutBackground", "(Landroid/widget/LinearLayout;)V", "layoutProgress", "getLayoutProgress", "setLayoutProgress", "layoutSecondaryProgress", "getLayoutSecondaryProgress", "setLayoutSecondaryProgress", "createGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "color", "colors", "createProgressDrawable", "createSecondaryProgressDrawable", "dp2px", CalendarKeys.DAYS_GAME_KEY, "drawAll", "drawBackgroundProgress", "drawPadding", "drawPrimaryProgress", "drawProgress", "progressDrawable", "max", "totalWidth", "radius", "padding", "isReverse", "drawProgressReverse", "drawSecondaryProgress", "getLayoutWidth", "getMax", "getPadding", "getProgress", "getProgressBackgroundColor", "getProgressColor", "getProgressColors", "getRadius", "getSecondaryProgress", "getSecondaryProgressColor", "getSecondaryProgressColors", "getSecondaryProgressWidth", "initLayout", "initStyleable", "initView", "invalidate", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSizeChanged", "newWidth", "newHeight", "oldWidth", "oldHeight", "onViewDraw", "removeLayoutParamsRule", "layoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "setMax", "setOnProgressChangedListener", "onProgressChanged", "setPadding", "setProgress", "setProgressBackgroundColor", "setProgressColor", "setProgressColors", "setRadius", "setReverse", "setSecondaryProgress", "setSecondaryProgressColor", "setSecondaryProgressColors", "setup", "setupProgressReversing", "setupStyleable", "Companion", "OnProgressChangedListener", "SavedState", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseRoundCornerProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRoundCornerProgressBar.kt\ncom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,629:1\n1#2:630\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseRoundCornerProgressBar extends LinearLayout {
    protected static final int DEFAULT_BACKGROUND_PADDING = 0;
    protected static final int DEFAULT_MAX_PROGRESS = 100;
    protected static final int DEFAULT_PROGRESS = 0;
    protected static final int DEFAULT_PROGRESS_RADIUS = 30;
    protected static final int DEFAULT_SECONDARY_PROGRESS = 0;
    private int _backgroundColor;
    private boolean _isReverse;
    private float _max;

    @Nullable
    private Function4<? super View, ? super Float, ? super Boolean, ? super Boolean, Unit> _onProgressChanged;
    private int _padding;
    private float _progress;

    @Nullable
    private OnProgressChangedListener _progressChangedListener;
    private int _progressColor;

    @Nullable
    private int[] _progressColors;
    private int _radius;
    private float _secondaryProgress;
    private int _secondaryProgressColor;

    @Nullable
    private int[] _secondaryProgressColors;
    private int _totalWidth;
    protected LinearLayout layoutBackground;
    protected LinearLayout layoutProgress;
    protected LinearLayout layoutSecondaryProgress;
    public static final int $stable = 8;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: BaseRoundCornerProgressBar.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar$OnProgressChangedListener;", "", "onProgressChanged", "", SVG.View.NODE_NAME, "Landroid/view/View;", "progress", "", "isPrimaryProgress", "", "isSecondaryProgress", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnProgressChangedListener {
        void onProgressChanged(@NotNull View view, float progress, boolean isPrimaryProgress, boolean isSecondaryProgress);
    }

    public abstract void drawProgress(@NotNull LinearLayout layoutProgress, @NotNull GradientDrawable progressDrawable, float max, float progress, float totalWidth, int radius, int padding, boolean isReverse);

    public abstract int initLayout();

    public abstract void initStyleable(@NotNull Context context, @Nullable AttributeSet attrs);

    public abstract void initView();

    public abstract void onViewDraw();

    @NotNull
    public final LinearLayout getLayoutBackground() {
        LinearLayout linearLayout = this.layoutBackground;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutBackground");
        return null;
    }

    public final void setLayoutBackground(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layoutBackground = linearLayout;
    }

    @NotNull
    public final LinearLayout getLayoutProgress() {
        LinearLayout linearLayout = this.layoutProgress;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutProgress");
        return null;
    }

    public final void setLayoutProgress(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layoutProgress = linearLayout;
    }

    @NotNull
    public final LinearLayout getLayoutSecondaryProgress() {
        LinearLayout linearLayout = this.layoutSecondaryProgress;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutSecondaryProgress");
        return null;
    }

    public final void setLayoutSecondaryProgress(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layoutSecondaryProgress = linearLayout;
    }

    public final int get_radius() {
        return this._radius;
    }

    public final void set_radius(int i) {
        this._radius = i;
    }

    public final int get_padding() {
        return this._padding;
    }

    public final void set_padding(int i) {
        this._padding = i;
    }

    public final int get_totalWidth() {
        return this._totalWidth;
    }

    public final void set_totalWidth(int i) {
        this._totalWidth = i;
    }

    public final float get_max() {
        return this._max;
    }

    public final void set_max(float f) {
        this._max = f;
    }

    public final float get_progress() {
        return this._progress;
    }

    public final void set_progress(float f) {
        this._progress = f;
    }

    public final float get_secondaryProgress() {
        return this._secondaryProgress;
    }

    public final void set_secondaryProgress(float f) {
        this._secondaryProgress = f;
    }

    public final int get_backgroundColor() {
        return this._backgroundColor;
    }

    public final void set_backgroundColor(int i) {
        this._backgroundColor = i;
    }

    public final int get_secondaryProgressColor() {
        return this._secondaryProgressColor;
    }

    public final void set_secondaryProgressColor(int i) {
        this._secondaryProgressColor = i;
    }

    @Nullable
    public final int[] get_progressColors() {
        return this._progressColors;
    }

    public final void set_progressColors(@Nullable int[] iArr) {
        this._progressColors = iArr;
    }

    @Nullable
    public final int[] get_secondaryProgressColors() {
        return this._secondaryProgressColors;
    }

    public final void set_secondaryProgressColors(@Nullable int[] iArr) {
        this._secondaryProgressColors = iArr;
    }

    public final boolean get_isReverse() {
        return this._isReverse;
    }

    public final void set_isReverse(boolean z) {
        this._isReverse = z;
    }

    @Nullable
    public final OnProgressChangedListener get_progressChangedListener() {
        return this._progressChangedListener;
    }

    public final void set_progressChangedListener(@Nullable OnProgressChangedListener onProgressChangedListener) {
        this._progressChangedListener = onProgressChangedListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setup(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setup(context, attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setup(context, attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setup(context, attrs);
    }

    private final void setup(Context context, AttributeSet attrs) {
        setupStyleable(context, attrs);
        removeAllViews();
        LayoutInflater.from(context).inflate(initLayout(), this);
        View findViewById = findViewById(R.id.layout_background);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        setLayoutBackground((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.container_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        setLayoutProgress((LinearLayout) findViewById2);
        View findViewById3 = findViewById(R.id.container_secondary_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        setLayoutSecondaryProgress((LinearLayout) findViewById3);
        initView();
    }

    public void setupStyleable(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (attrs == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.BaseRoundCornerProgressBar);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this._radius = (int) obtainStyledAttributes.getDimension(6, dp2px(30.0f));
        this._padding = (int) obtainStyledAttributes.getDimension(1, dp2px(0.0f));
        this._isReverse = obtainStyledAttributes.getBoolean(7, false);
        this._max = obtainStyledAttributes.getFloat(2, 100.0f);
        this._progress = obtainStyledAttributes.getFloat(3, 0.0f);
        this._secondaryProgress = obtainStyledAttributes.getFloat(8, 0.0f);
        this._backgroundColor = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, 2131099741));
        this._progressColor = obtainStyledAttributes.getColor(4, -1);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        Integer valueOf = Integer.valueOf(resourceId);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        this._progressColors = valueOf != null ? obtainStyledAttributes.getResources().getIntArray(resourceId) : null;
        this._secondaryProgressColor = obtainStyledAttributes.getColor(9, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(10, 0);
        Integer valueOf2 = Integer.valueOf(resourceId2);
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        this._secondaryProgressColors = valueOf2 != null ? obtainStyledAttributes.getResources().getIntArray(resourceId2) : null;
        obtainStyledAttributes.recycle();
        initStyleable(context, attrs);
    }

    @Override // android.view.View
    public void onSizeChanged(int newWidth, int newHeight, int oldWidth, int oldHeight) {
        super.onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
        this._totalWidth = newWidth;
        drawBackgroundProgress();
        drawPadding();
        drawProgressReverse();
        post(new Runnable() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseRoundCornerProgressBar.onSizeChanged$lambda$5(BaseRoundCornerProgressBar.this);
            }
        });
        onViewDraw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$5(BaseRoundCornerProgressBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.drawPrimaryProgress();
        this$0.drawSecondaryProgress();
    }

    private final void drawAll() {
        drawBackgroundProgress();
        drawPadding();
        drawProgressReverse();
        drawPrimaryProgress();
        drawSecondaryProgress();
        onViewDraw();
    }

    private final void drawBackgroundProgress() {
        GradientDrawable createGradientDrawable = createGradientDrawable(this._backgroundColor);
        float f = this._radius - (this._padding / 2.0f);
        createGradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        getLayoutBackground().setBackground(createGradientDrawable);
    }

    @NotNull
    public final GradientDrawable createGradientDrawable(@ColorInt int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    @NotNull
    public GradientDrawable createGradientDrawable(@Nullable int[] colors) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(!isReverse() ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT);
        gradientDrawable.setColors(colors);
        return gradientDrawable;
    }

    private final GradientDrawable createProgressDrawable() {
        int i = this._progressColor;
        if (i != -1) {
            return createGradientDrawable(i);
        }
        int[] iArr = this._progressColors;
        if (iArr != null && iArr != null) {
            if (!(iArr.length == 0)) {
                return createGradientDrawable(iArr);
            }
        }
        return createGradientDrawable(ContextCompat.getColor(getContext(), 2131099741));
    }

    private final GradientDrawable createSecondaryProgressDrawable() {
        int i = this._secondaryProgressColor;
        if (i != -1) {
            return createGradientDrawable(i);
        }
        int[] iArr = this._secondaryProgressColors;
        if (iArr != null && iArr != null) {
            if (!(iArr.length == 0)) {
                return createGradientDrawable(iArr);
            }
        }
        return createGradientDrawable(ContextCompat.getColor(getContext(), 2131100871));
    }

    private final void drawPrimaryProgress() {
        drawProgress(getLayoutProgress(), createProgressDrawable(), this._max, this._progress, this._totalWidth, RangesKt___RangesKt.coerceAtMost(this._radius, getLayoutBackground().getMeasuredHeight() / 2), this._padding, this._isReverse);
    }

    private final void drawSecondaryProgress() {
        drawProgress(getLayoutSecondaryProgress(), createSecondaryProgressDrawable(), this._max, this._secondaryProgress, this._totalWidth, RangesKt___RangesKt.coerceAtMost(this._radius, getLayoutBackground().getMeasuredHeight() / 2), this._padding, this._isReverse);
    }

    private final void drawProgressReverse() {
        setupProgressReversing(getLayoutProgress(), this._isReverse);
        setupProgressReversing(getLayoutSecondaryProgress(), this._isReverse);
    }

    private final void setupProgressReversing(LinearLayout layoutProgress, boolean isReverse) {
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        removeLayoutParamsRule(layoutParams2);
        if (isReverse) {
            layoutParams2.addRule(11);
            layoutParams2.addRule(21);
        } else {
            layoutParams2.addRule(9);
            layoutParams2.addRule(20);
        }
        layoutProgress.setLayoutParams(layoutParams2);
    }

    private final void drawPadding() {
        LinearLayout layoutBackground = getLayoutBackground();
        int i = this._padding;
        layoutBackground.setPadding(i, i, i, i);
    }

    private final void removeLayoutParamsRule(RelativeLayout.LayoutParams layoutParams) {
        layoutParams.removeRule(11);
        layoutParams.removeRule(21);
        layoutParams.removeRule(9);
        layoutParams.removeRule(20);
    }

    public final float dp2px(float dp) {
        return TypedValue.applyDimension(1, dp, getContext().getResources().getDisplayMetrics());
    }

    public final boolean isReverse() {
        return this._isReverse;
    }

    public final void setReverse(boolean isReverse) {
        this._isReverse = isReverse;
        drawProgressReverse();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    /* renamed from: getRadius, reason: from getter */
    public final int get_radius() {
        return this._radius;
    }

    public final void setRadius(@Px int radius) {
        if (radius >= 0) {
            this._radius = radius;
        }
        drawBackgroundProgress();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    /* renamed from: getPadding, reason: from getter */
    public final int get_padding() {
        return this._padding;
    }

    public final void setPadding(@Px int padding) {
        if (padding >= 0) {
            this._padding = padding;
        }
        drawPadding();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    /* renamed from: getMax, reason: from getter */
    public final float get_max() {
        return this._max;
    }

    public final void setMax(int max) {
        setMax(max);
    }

    public final void setMax(float max) {
        if (max >= 0.0f) {
            this._max = max;
        }
        if (this._progress > max) {
            this._progress = max;
        }
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    public final float getLayoutWidth() {
        return this._totalWidth;
    }

    /* renamed from: getProgress, reason: from getter */
    public float get_progress() {
        return this._progress;
    }

    public void setProgress(int progress) {
        setProgress(progress);
    }

    public void setProgress(float progress) {
        this._progress = progress >= 0.0f ? RangesKt___RangesKt.coerceAtMost(progress, this._max) : 0.0f;
        drawPrimaryProgress();
        Function4<? super View, ? super Float, ? super Boolean, ? super Boolean, Unit> function4 = this._onProgressChanged;
        if (function4 != null) {
            function4.invoke(this, Float.valueOf(this._progress), Boolean.TRUE, Boolean.FALSE);
        }
    }

    public final float getSecondaryProgressWidth() {
        return getLayoutSecondaryProgress().getWidth();
    }

    /* renamed from: getSecondaryProgress, reason: from getter */
    public float get_secondaryProgress() {
        return this._secondaryProgress;
    }

    public void setSecondaryProgress(int progress) {
        setSecondaryProgress(progress);
    }

    public void setSecondaryProgress(float progress) {
        this._secondaryProgress = progress >= 0.0f ? RangesKt___RangesKt.coerceAtMost(progress, this._max) : 0.0f;
        drawSecondaryProgress();
        Function4<? super View, ? super Float, ? super Boolean, ? super Boolean, Unit> function4 = this._onProgressChanged;
        if (function4 != null) {
            function4.invoke(this, Float.valueOf(this._secondaryProgress), Boolean.FALSE, Boolean.TRUE);
        }
    }

    /* renamed from: getProgressBackgroundColor, reason: from getter */
    public final int get_backgroundColor() {
        return this._backgroundColor;
    }

    public final void setProgressBackgroundColor(@ColorInt int color) {
        this._backgroundColor = color;
        drawBackgroundProgress();
    }

    /* renamed from: getProgressColor, reason: from getter */
    public final int get_progressColor() {
        return this._progressColor;
    }

    public final void setProgressColor(@ColorInt int color) {
        this._progressColor = color;
        this._progressColors = null;
        drawPrimaryProgress();
    }

    @Nullable
    /* renamed from: getProgressColors, reason: from getter */
    public final int[] get_progressColors() {
        return this._progressColors;
    }

    public final void setProgressColors(@Nullable int[] colors) {
        this._progressColor = -1;
        this._progressColors = colors;
        drawPrimaryProgress();
    }

    /* renamed from: getSecondaryProgressColor, reason: from getter */
    public final int get_secondaryProgressColor() {
        return this._secondaryProgressColor;
    }

    public final void setSecondaryProgressColor(@ColorInt int color) {
        this._secondaryProgressColor = color;
        this._secondaryProgressColors = null;
        drawSecondaryProgress();
    }

    @Nullable
    /* renamed from: getSecondaryProgressColors, reason: from getter */
    public final int[] get_secondaryProgressColors() {
        return this._secondaryProgressColors;
    }

    public final void setSecondaryProgressColors(@Nullable int[] colors) {
        this._secondaryProgressColor = -1;
        this._secondaryProgressColors = colors;
        drawSecondaryProgress();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        drawAll();
    }

    public final void setOnProgressChangedListener(@Nullable Function4<? super View, ? super Float, ? super Boolean, ? super Boolean, Unit> onProgressChanged) {
        this._onProgressChanged = onProgressChanged;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.setMax(this._max);
        savedState.setProgress(this._progress);
        savedState.setSecondaryProgress(this._secondaryProgress);
        savedState.setRadius(this._radius);
        savedState.setPadding(this._padding);
        savedState.setColorBackground(this._backgroundColor);
        savedState.setColorProgress(this._progressColor);
        savedState.setColorSecondaryProgress(this._secondaryProgressColor);
        savedState.setColorProgressArray(this._progressColors);
        savedState.setColorSecondaryProgressArray(this._secondaryProgressColors);
        savedState.setReverse(this._isReverse);
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this._max = savedState.getMax();
        this._progress = savedState.getProgress();
        this._secondaryProgress = savedState.getSecondaryProgress();
        this._radius = savedState.getRadius();
        this._padding = savedState.getPadding();
        this._backgroundColor = savedState.getColorBackground();
        this._progressColor = savedState.getColorProgress();
        this._secondaryProgressColor = savedState.getColorSecondaryProgress();
        this._progressColors = savedState.getColorProgressArray();
        this._secondaryProgressColors = savedState.getColorSecondaryProgressArray();
        this._isReverse = savedState.getIsReverse();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: BaseRoundCornerProgressBar.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u00101\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*¨\u0006<"}, d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar$SavedState;", "Landroidx/customview/view/AbsSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "colorBackground", "", "getColorBackground", "()I", "setColorBackground", "(I)V", "colorProgress", "getColorProgress", "setColorProgress", "colorProgressArray", "", "getColorProgressArray", "()[I", "setColorProgressArray", "([I)V", "colorSecondaryProgress", "getColorSecondaryProgress", "setColorSecondaryProgress", "colorSecondaryProgressArray", "getColorSecondaryProgressArray", "setColorSecondaryProgressArray", "isReverse", "", "()Z", "setReverse", "(Z)V", "max", "", "getMax", "()F", "setMax", "(F)V", "padding", "getPadding", "setPadding", "progress", "getProgress", "setProgress", "radius", "getRadius", "setRadius", "secondaryProgress", "getSecondaryProgress", "setSecondaryProgress", "writeToParcel", "", "dest", "flags", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {
        public int colorBackground;
        public int colorProgress;

        @Nullable
        public int[] colorProgressArray;
        public int colorSecondaryProgress;

        @Nullable
        public int[] colorSecondaryProgressArray;
        public boolean isReverse;
        public float max;
        public int padding;
        public float progress;
        public int radius;
        public float secondaryProgress;

        @JvmField
        @NotNull
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NotNull
            public BaseRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source, @NotNull ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loader, "loader");
                return new BaseRoundCornerProgressBar.SavedState(source, loader);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public BaseRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new BaseRoundCornerProgressBar.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public BaseRoundCornerProgressBar.SavedState[] newArray(int size) {
                return newArray(size);
            }
        };

        public final float getMax() {
            return this.max;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final void setProgress(float f) {
            this.progress = f;
        }

        public final float getSecondaryProgress() {
            return this.secondaryProgress;
        }

        public final void setSecondaryProgress(float f) {
            this.secondaryProgress = f;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final void setRadius(int i) {
            this.radius = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final int getColorBackground() {
            return this.colorBackground;
        }

        public final void setColorBackground(int i) {
            this.colorBackground = i;
        }

        public final int getColorProgress() {
            return this.colorProgress;
        }

        public final void setColorProgress(int i) {
            this.colorProgress = i;
        }

        public final int getColorSecondaryProgress() {
            return this.colorSecondaryProgress;
        }

        public final void setColorSecondaryProgress(int i) {
            this.colorSecondaryProgress = i;
        }

        @Nullable
        public final int[] getColorProgressArray() {
            return this.colorProgressArray;
        }

        public final void setColorProgressArray(@Nullable int[] iArr) {
            this.colorProgressArray = iArr;
        }

        @Nullable
        public final int[] getColorSecondaryProgressArray() {
            return this.colorSecondaryProgressArray;
        }

        public final void setColorSecondaryProgressArray(@Nullable int[] iArr) {
            this.colorSecondaryProgressArray = iArr;
        }

        /* renamed from: isReverse, reason: from getter */
        public final boolean getIsReverse() {
            return this.isReverse;
        }

        public final void setReverse(boolean z) {
            this.isReverse = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source, null);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source, @Nullable ClassLoader classLoader) {
            super(source, classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            this.max = source.readFloat();
            this.progress = source.readFloat();
            this.secondaryProgress = source.readFloat();
            this.radius = source.readInt();
            this.padding = source.readInt();
            this.colorBackground = source.readInt();
            this.colorProgress = source.readInt();
            this.colorSecondaryProgress = source.readInt();
            int[] iArr = new int[source.readInt()];
            source.readIntArray(iArr);
            this.colorProgressArray = iArr;
            int[] iArr2 = new int[source.readInt()];
            source.readIntArray(iArr2);
            this.colorSecondaryProgressArray = iArr2;
            this.isReverse = source.readByte() != 0;
        }

        public /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel, (i & 2) != 0 ? null : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, flags);
            dest.writeFloat(this.max);
            dest.writeFloat(this.progress);
            dest.writeFloat(this.secondaryProgress);
            dest.writeInt(this.radius);
            dest.writeInt(this.padding);
            dest.writeInt(this.colorBackground);
            dest.writeInt(this.colorProgress);
            dest.writeInt(this.colorSecondaryProgress);
            int[] iArr = this.colorProgressArray;
            dest.writeInt(iArr != null ? iArr.length : 0);
            int[] iArr2 = this.colorProgressArray;
            if (iArr2 == null) {
                iArr2 = new int[0];
            }
            dest.writeIntArray(iArr2);
            int[] iArr3 = this.colorSecondaryProgressArray;
            dest.writeInt(iArr3 != null ? iArr3.length : 0);
            int[] iArr4 = this.colorSecondaryProgressArray;
            if (iArr4 == null) {
                iArr4 = new int[0];
            }
            dest.writeIntArray(iArr4);
            dest.writeByte(this.isReverse ? (byte) 1 : (byte) 0);
        }
    }
}
