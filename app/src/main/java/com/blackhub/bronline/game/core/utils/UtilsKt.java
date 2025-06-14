package com.blackhub.bronline.game.core.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.DragEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragView;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.launcher.Settings;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u0001H\b2\b\u0010\n\u001a\u0004\u0018\u0001H\b¢\u0006\u0002\u0010\u000b\u001a5\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001e\u001a\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e\u001a\b\u0010#\u001a\u0004\u0018\u00010$\u001a\u001f\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010)\u001a\u000e\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,\u001a\u0010\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020/\u001a\u000e\u00100\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,\u001a0\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016\u001a!\u00109\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010:\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010)\u001a\u0018\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,\u001a\u0006\u0010>\u001a\u00020/\u001a\u0006\u0010?\u001a\u00020/\u001a\u0006\u0010@\u001a\u00020/\u001a\u0006\u0010A\u001a\u00020/\u001a\u0006\u0010B\u001a\u00020/\u001a\u0006\u0010C\u001a\u00020/\u001a\u0012\u0010D\u001a\u0004\u0018\u00010E2\b\u0010+\u001a\u0004\u0018\u00010,\u001a8\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00132\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00132\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0013\u001a&\u0010P\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020'2\u0006\u0010U\u001a\u00020'\u001a\u000e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020W¨\u0006Y"}, d2 = {"animateProgressBarDown", "Landroid/animation/ObjectAnimator;", "progressBar", "Landroid/widget/ProgressBar;", "animationDurationInMls", "", "animateProgressBarUp", "buildTypeMerge", ExifInterface.GPS_DIRECTION_TRUE, "variable", "variableStore", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "checkIfDraggableItemIsOnTargetArea", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "dragEvent", "Landroid/view/DragEvent;", "dataDragView", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragView;", "dataTargetAreaList", "", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "centerError", "", "(Landroid/view/DragEvent;Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragView;Ljava/util/List;Ljava/lang/Float;)Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "crashlyticsException", "", "throwable", "", "crashlyticsLog", "logString", "", "defaultTag", "crashlyticsRecordNewException", ThrowableDeserializer.PROP_NAME_MESSAGE, "logTag", "getClipboardStringUtils", "", "getCurrentCDNUrl", "remoteVersionCode", "", "newUrl", "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "getHeightScreenPx", "context", "Landroid/content/Context;", "getIPAddress", "useIPv4", "", "getNetworkCountry", "getPointWithOptions", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/PointFloat;", "degree", CacheFileMetadataIndex.COLUMN_LENGTH, "pointListener", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;", "startX", "startY", "getTestServerPort", "port", "getVideoFromZip", "Ljava/io/File;", "fileName", "isAddBasicAuth", "isFlavorWithLogo", "isMarketBuildVariant", "isNotPublicBuildType", "isRuRegion", "isRustoreBuildVariant", "scanForActivity", "Landroid/app/Activity;", "setImageModel", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "baseModel", "Lcom/blackhub/bronline/game/core/utils/attachment/BaseModel;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "setVerticalRandomBias", "constraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewId", "minBias", "maxBias", "transformSpannableToUpperCase", "", "source", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/blackhub/bronline/game/core/utils/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,505:1\n288#2,2:506\n1#3:508\n179#4,2:509\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/blackhub/bronline/game/core/utils/UtilsKt\n*L\n215#1:506,2\n340#1:509,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointViewListenerEnum.values().length];
            try {
                iArr[PointViewListenerEnum.TOP_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isFlavorWithLogo() {
        return true;
    }

    public static final boolean isMarketBuildVariant() {
        return false;
    }

    public static final boolean isNotPublicBuildType() {
        return false;
    }

    public static final boolean isRustoreBuildVariant() {
        return false;
    }

    @NotNull
    public static final CharSequence transformSpannableToUpperCase(@NotNull CharSequence source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String upperCase = source.toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        SpannableString spannableString = new SpannableString(upperCase);
        TextUtils.copySpansFrom((Spanned) source, 0, source.length(), null, spannableString, 0);
        return spannableString;
    }

    public static final float setVerticalRandomBias(@NotNull ConstraintLayout constraintLayout, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(constraintLayout, "constraintLayout");
        float random = RangesKt___RangesKt.random(new IntRange(i2, i3), Random.INSTANCE) / 10.0f;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.setVerticalBias(i, 1.0f - random);
        constraintSet.applyTo(constraintLayout);
        return random;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    @NotNull
    public static final ObjectAnimator animateProgressBarUp(@NotNull ProgressBar progressBar, long j) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "animateProgressBar", progressBar.getProgress(), progressBar.getProgress() + 10);
        ofInt.setDuration(j);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.core.utils.UtilsKt$$ExternalSyntheticLambda0
            public final /* synthetic */ ProgressBar f$0;

            public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(ProgressBar progressBar2) {
                r1 = progressBar2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UtilsKt.animateProgressBarUp$lambda$1$lambda$0(r1, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    public static final void animateProgressBarUp$lambda$1$lambda$0(ProgressBar progressBar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(progressBar, "$progressBar");
        Intrinsics.checkNotNullParameter(it, "it");
        progressBar.setProgress(Integer.parseInt(it.getAnimatedValue().toString()));
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    @NotNull
    public static final ObjectAnimator animateProgressBarDown(@NotNull ProgressBar progressBar, long j) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "animateProgressBar", progressBar.getProgress(), 0);
        ofInt.setDuration((progressBar.getProgress() / 10) * j);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.core.utils.UtilsKt$$ExternalSyntheticLambda1
            public final /* synthetic */ ProgressBar f$0;

            public /* synthetic */ UtilsKt$$ExternalSyntheticLambda1(ProgressBar progressBar2) {
                r1 = progressBar2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UtilsKt.animateProgressBarDown$lambda$3$lambda$2(r1, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    public static final void animateProgressBarDown$lambda$3$lambda$2(ProgressBar progressBar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(progressBar, "$progressBar");
        Intrinsics.checkNotNullParameter(it, "it");
        progressBar.setProgress(Integer.parseInt(it.getAnimatedValue().toString()));
    }

    public static final void crashlyticsLog(@NotNull String logString) {
        Intrinsics.checkNotNullParameter(logString, "logString");
        if (isNotPublicBuildType()) {
            Log.d(LogTagConstants.CRASHLYTICS_LOG_TAG, logString);
        }
        FirebaseCrashlytics.getInstance().log("site-release: " + logString);
    }

    public static /* synthetic */ void crashlyticsLog$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = LogTagConstants.CRASHLYTICS_LOG_TAG;
        }
        crashlyticsLog(str, str2);
    }

    public static final void crashlyticsLog(@NotNull String logString, @NotNull String defaultTag) {
        Intrinsics.checkNotNullParameter(logString, "logString");
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        if (isNotPublicBuildType()) {
            Log.d(defaultTag, logString);
        }
        FirebaseCrashlytics.getInstance().log("site-release: " + logString);
    }

    public static final void crashlyticsException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FirebaseCrashlytics.getInstance().recordException(throwable);
    }

    public static final void crashlyticsRecordNewException(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (isNotPublicBuildType()) {
            Log.e(LogTagConstants.RECORD_NEW_EXCEPTION_TAG, "message exception: " + message);
        }
        firebaseCrashlytics.log(message);
        firebaseCrashlytics.recordException(new Throwable());
    }

    public static /* synthetic */ void crashlyticsRecordNewException$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = LogTagConstants.RECORD_NEW_EXCEPTION_TAG;
        }
        crashlyticsRecordNewException(str, str2);
    }

    public static final void crashlyticsRecordNewException(@NotNull String message, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (isNotPublicBuildType()) {
            Log.e(logTag, "message exception: " + message);
        }
        firebaseCrashlytics.log(message);
        firebaseCrashlytics.recordException(new Throwable());
    }

    public static final int getHeightScreenPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static /* synthetic */ DragAndDropCallback checkIfDraggableItemIsOnTargetArea$default(DragEvent dragEvent, DataDragView dataDragView, List list, Float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = null;
        }
        return checkIfDraggableItemIsOnTargetArea(dragEvent, dataDragView, list, f);
    }

    @NotNull
    public static final DragAndDropCallback checkIfDraggableItemIsOnTargetArea(@NotNull DragEvent dragEvent, @NotNull DataDragView dataDragView, @NotNull List<DataTargetArea> dataTargetAreaList, @Nullable Float f) {
        Object obj;
        Intrinsics.checkNotNullParameter(dragEvent, "dragEvent");
        Intrinsics.checkNotNullParameter(dataDragView, "dataDragView");
        Intrinsics.checkNotNullParameter(dataTargetAreaList, "dataTargetAreaList");
        PointFloat pointWithOptions = getPointWithOptions(dataDragView.getDraggableView().getRotation(), (dataDragView.getDraggableView().getHeight() * dataDragView.getDataDragAndDrop().getNewScale()) / 2, dataDragView.getPointListener(), dragEvent.getX(), dragEvent.getY());
        Iterator<T> it = dataTargetAreaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            DataTargetArea dataTargetArea = (DataTargetArea) obj;
            if (dataTargetArea.getDataDragViewList().contains(dataDragView)) {
                PointFloat pointCenter = dataTargetArea.getPointCenter();
                float floatValue = f != null ? f.floatValue() : dataTargetArea.getCenterError();
                float x = pointCenter.getX() - floatValue;
                float x2 = pointCenter.getX() + floatValue;
                float x3 = pointWithOptions.getX();
                if (x <= x3 && x3 <= x2) {
                    float y = pointCenter.getY() - floatValue;
                    float y2 = pointCenter.getY() + floatValue;
                    float y3 = pointWithOptions.getY();
                    if (y <= y3 && y3 <= y2) {
                        break;
                    }
                }
            }
        }
        DataTargetArea dataTargetArea2 = (DataTargetArea) obj;
        return new DragAndDropCallback(dataDragView.getCurrentDraggableItem(), dataTargetArea2 != null ? dataDragView.getDataDragAndDrop() : null, dataTargetArea2, false, 8, null);
    }

    @NotNull
    public static final PointFloat getPointWithOptions(float f, float f2, @Nullable PointViewListenerEnum pointViewListenerEnum, float f3, float f4) {
        float f5;
        double abs;
        float f6 = f3;
        double d = f;
        double radians = Math.toRadians((-90) + d);
        if ((pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()]) == 1) {
            if (0.0d <= d && d <= 180.0d) {
                f6 = (float) (f6 + (Math.abs(Math.cos(radians)) * f2));
            } else {
                f6 = (float) (f6 - (Math.abs(Math.cos(radians)) * f2));
            }
        }
        if ((pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()]) == 1) {
            if (!(0.0d <= d && d <= 90.0d)) {
                if (!(270.0d <= d && d <= 360.0d)) {
                    abs = f4 + (Math.abs(Math.sin(radians)) * f2);
                    f5 = (float) abs;
                }
            }
            abs = f4 - (Math.abs(Math.sin(radians)) * f2);
            f5 = (float) abs;
        } else {
            f5 = f4;
        }
        return new PointFloat(f6, f5);
    }

    @Nullable
    public static final byte[] getClipboardStringUtils() {
        String str;
        CharSequence text;
        Object systemService = JNIActivity.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        try {
            if (clipboardManager.getPrimaryClip() != null) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                Intrinsics.checkNotNull(primaryClip);
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt != null && (text = itemAt.getText()) != null) {
                    str = text.toString();
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    byte[] bytes = str.getBytes(UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            Charset UTF_82 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
            byte[] bytes2 = str.getBytes(UTF_82);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            crashlyticsRecordNewException(message);
            return null;
        }
        str = "nullstr";
    }

    @Nullable
    public static final Activity scanForActivity(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Nullable
    public static final <T> T buildTypeMerge(@Nullable T t, @Nullable T t2) {
        AnyExtensionKt.isNull(t2);
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 == null) goto L27;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getCurrentCDNUrl(@org.jetbrains.annotations.Nullable java.lang.Integer r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
        /*
            if (r1 != 0) goto L3
            goto L1d
        L3:
            int r1 = r1.intValue()
            r0 = 1132(0x46c, float:1.586E-42)
            if (r0 != r1) goto L1d
            if (r2 == 0) goto L17
            int r1 = r2.length()
            if (r1 != 0) goto L15
            java.lang.String r2 = com.blackhub.bronline.launcher.Settings.CURRENT_CDN_URL
        L15:
            if (r2 != 0) goto L19
        L17:
            java.lang.String r2 = com.blackhub.bronline.launcher.Settings.CURRENT_CDN_URL
        L19:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            goto L24
        L1d:
            java.lang.String r2 = com.blackhub.bronline.launcher.Settings.CURRENT_CDN_URL
            java.lang.String r1 = "CURRENT_CDN_URL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.utils.UtilsKt.getCurrentCDNUrl(java.lang.Integer, java.lang.String):java.lang.String");
    }

    @Nullable
    public static final String getTestServerPort(@Nullable Integer num, @Nullable String str) {
        if (num != null && 1132 == num.intValue()) {
            return str;
        }
        return null;
    }

    public static final boolean isAddBasicAuth() {
        return !Intrinsics.areEqual(Settings.CURRENT_CDN_URL, BuildConfig.CDN_URL);
    }

    public static /* synthetic */ String getIPAddress$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getIPAddress(z);
    }

    @NotNull
    public static final String getIPAddress(boolean z) {
        String str;
        Object obj;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
            Iterator it = SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filterNot(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(networkInterfaces)), UtilsKt$getIPAddress$1.INSTANCE), UtilsKt$getIPAddress$2.INSTANCE), UtilsKt$getIPAddress$3.INSTANCE).iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z2 = false;
                boolean z3 = !StringsKt__StringsKt.contains$default((CharSequence) obj, ':', false, 2, (Object) null);
                if (z) {
                    z2 = z3;
                } else if (!z3) {
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                if (z) {
                    str = str2;
                } else {
                    String substringBefore$default = StringsKt__StringsKt.substringBefore$default(str2, '%', (String) null, 2, (Object) null);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = substringBefore$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    str = upperCase;
                }
            }
            return str == null ? "" : str;
        } catch (Exception e) {
            crashlyticsRecordNewException("getIPAddress exception: " + e);
            return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
    }

    @Nullable
    public static final File getVideoFromZip(@NotNull String fileName, @NotNull Context context) {
        File file;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir(null);
        try {
            ZipFile zipFile = new ZipFile((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "/resources/video/video.zip");
            try {
                ZipEntry entry = zipFile.getEntry(fileName);
                if (entry != null) {
                    Intrinsics.checkNotNull(entry);
                    InputStream inputStream = zipFile.getInputStream(entry);
                    file = File.createTempFile("video_" + fileName, ".mp4", context.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    Intrinsics.checkNotNull(inputStream);
                    ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                    inputStream.close();
                    fileOutputStream.close();
                } else {
                    file = null;
                }
                CloseableKt.closeFinally(zipFile, null);
                return file;
            } finally {
            }
        } catch (Exception e) {
            crashlyticsRecordNewException("Failed to get video from zip: " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.blackhub.bronline.game.core.utils.attachment.ImageModel setImageModel(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.core.utils.attachment.BaseModel r23, @org.jetbrains.annotations.NotNull java.util.List<com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO> r24, @org.jetbrains.annotations.NotNull java.util.List<com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO> r25, @org.jetbrains.annotations.NotNull java.util.List<com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto> r26) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.utils.UtilsKt.setImageModel(com.blackhub.bronline.game.core.utils.attachment.BaseModel, java.util.List, java.util.List, java.util.List):com.blackhub.bronline.game.core.utils.attachment.ImageModel");
    }

    @NotNull
    public static final String getNetworkCountry(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        return networkCountryIso;
    }

    public static final boolean isRuRegion() {
        return Settings.IS_RU_REGION;
    }
}
