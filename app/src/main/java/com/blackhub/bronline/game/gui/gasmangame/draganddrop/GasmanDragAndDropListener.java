package com.blackhub.bronline.game.gui.gasmangame.draganddrop;

import android.annotation.SuppressLint;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.gasmangame.entitie.BOT_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaItem;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaTag;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanPlot;
import com.blackhub.bronline.game.gui.gasmangame.entitie.MIDDLE_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.entitie.TOP_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GasmanDragAndDropListener.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0007J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/draganddrop/GasmanDragAndDropListener;", "", "listOfDropAreas", "", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaItem;", "gasmanChildViewModel", "Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;", "(Ljava/util/List;Lcom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanChildViewModel;)V", "buttonBlocked", "", "initX", "", "initY", "oldTimeAfterCheck", "", "checkAngles", "", "draggableItem", "Landroid/view/View;", "dropArea", "isFirstDrop", "checkIfRotationLessThan360", "invoke", "Landroid/view/View$OnDragListener;", "setRotationClickListener", "Landroid/widget/ImageView;", Key.ROTATION, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGasmanDragAndDropListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanDragAndDropListener.kt\ncom/blackhub/bronline/game/gui/gasmangame/draganddrop/GasmanDragAndDropListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1855#2,2:253\n*S KotlinDebug\n*F\n+ 1 GasmanDragAndDropListener.kt\ncom/blackhub/bronline/game/gui/gasmangame/draganddrop/GasmanDragAndDropListener\n*L\n72#1:253,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GasmanDragAndDropListener {
    public static final int $stable = 8;
    public boolean buttonBlocked;

    @NotNull
    public final GasmanChildViewModel gasmanChildViewModel;
    public float initX;
    public float initY;

    @NotNull
    public final List<GasmanDropAreaItem> listOfDropAreas;
    public long oldTimeAfterCheck;

    public GasmanDragAndDropListener(@NotNull List<GasmanDropAreaItem> listOfDropAreas, @NotNull GasmanChildViewModel gasmanChildViewModel) {
        Intrinsics.checkNotNullParameter(listOfDropAreas, "listOfDropAreas");
        Intrinsics.checkNotNullParameter(gasmanChildViewModel, "gasmanChildViewModel");
        this.listOfDropAreas = listOfDropAreas;
        this.gasmanChildViewModel = gasmanChildViewModel;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    public final View.OnDragListener invoke() {
        return new View.OnDragListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda0
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean invoke$lambda$5;
                invoke$lambda$5 = GasmanDragAndDropListener.invoke$lambda$5(GasmanDragAndDropListener.this, view, dragEvent);
                return invoke$lambda$5;
            }
        };
    }

    public static final boolean invoke$lambda$5(final GasmanDragAndDropListener this$0, View view, DragEvent dragEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!AnyExtensionKt.isNotNull(view) || !AnyExtensionKt.isNotNull(dragEvent) || !AnyExtensionKt.isNotNull(dragEvent.getLocalState())) {
            return false;
        }
        Object localState = dragEvent.getLocalState();
        Intrinsics.checkNotNull(localState, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView) localState;
        switch (dragEvent.getAction()) {
            case 1:
                this$0.initX = imageView.getX();
                this$0.initY = imageView.getY();
                break;
            case 2:
            case 4:
            case 5:
            case 6:
                break;
            case 3:
                if (dragEvent.getClipDescription().hasMimeType("text/plain")) {
                    ViewParent parent = imageView.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) parent;
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    for (final GasmanDropAreaItem gasmanDropAreaItem : this$0.listOfDropAreas) {
                        float x = gasmanDropAreaItem.getDropAreaView().getX();
                        float y = gasmanDropAreaItem.getDropAreaView().getY();
                        float width = gasmanDropAreaItem.getDropAreaView().getWidth() + x;
                        float height = gasmanDropAreaItem.getDropAreaView().getHeight() + y;
                        float x2 = dragEvent.getX();
                        if (x <= x2 && x2 <= width) {
                            float y2 = dragEvent.getY();
                            if (y <= y2 && y2 <= height) {
                                if (gasmanDropAreaItem.getListOfDraggableItems().contains(imageView)) {
                                    gasmanDropAreaItem.getListOfDraggableItems().remove(imageView);
                                    viewGroup.invalidate();
                                    imageView.invalidate();
                                    viewGroup2.invalidate();
                                    imageView.setLayoutParams(new ConstraintLayout.LayoutParams(imageView.getWidth(), imageView.getHeight()));
                                    imageView.setX((dragEvent.getX() - (imageView.getWidth() / 2)) + this$0.initX);
                                    imageView.setY((dragEvent.getY() - (imageView.getHeight() / 2)) + this$0.initY);
                                    viewGroup.removeView(imageView);
                                    viewGroup2.addView(imageView);
                                    viewGroup.invalidate();
                                    imageView.invalidate();
                                    viewGroup2.invalidate();
                                    ViewPropertyAnimator animate = gasmanDropAreaItem.getDropAreaView().animate();
                                    animate.setDuration(200L);
                                    animate.alpha(0.0f);
                                    ViewPropertyAnimator animate2 = imageView.animate();
                                    animate2.setDuration(200L);
                                    GasmanDropAreaTag dropAreaTag = gasmanDropAreaItem.getDropAreaTag();
                                    if (Intrinsics.areEqual(dropAreaTag, GasmanDropAreaTag.STRAIGHT_PIPE_90_DEGREES.INSTANCE)) {
                                        animate2.translationX(gasmanDropAreaItem.getDropAreaView().getX() + (gasmanDropAreaItem.getDropAreaView().getWidth() / 4));
                                        animate2.translationY(gasmanDropAreaItem.getDropAreaView().getY() - (gasmanDropAreaItem.getDropAreaView().getHeight() / 2));
                                    } else if (Intrinsics.areEqual(dropAreaTag, GasmanDropAreaTag.TEE_PIPE_LONG_90_DEGREES.INSTANCE)) {
                                        animate2.translationX((gasmanDropAreaItem.getDropAreaView().getX() - (gasmanDropAreaItem.getDropAreaView().getWidth() / 4)) + 1);
                                        animate2.translationY(gasmanDropAreaItem.getDropAreaView().getY() + (gasmanDropAreaItem.getDropAreaView().getHeight() / 6));
                                    } else if (Intrinsics.areEqual(dropAreaTag, GasmanDropAreaTag.STRAIGHT_LONG_PIPE_90_DEGREES.INSTANCE)) {
                                        animate2.translationX(gasmanDropAreaItem.getDropAreaView().getX() - gasmanDropAreaItem.getDropAreaView().getWidth());
                                        animate2.translationY(gasmanDropAreaItem.getDropAreaView().getY() + (gasmanDropAreaItem.getDropAreaView().getHeight() / 3));
                                    } else if (Intrinsics.areEqual(dropAreaTag, GasmanDropAreaTag.USUAL_PIPE.INSTANCE) ? true : Intrinsics.areEqual(dropAreaTag, GasmanDropAreaTag.TEE_PIPE.INSTANCE)) {
                                        animate2.translationX(gasmanDropAreaItem.getDropAreaView().getX());
                                        animate2.translationY(gasmanDropAreaItem.getDropAreaView().getY());
                                    }
                                    animate2.rotation(gasmanDropAreaItem.getStartAngle());
                                    animate2.withStartAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            GasmanDragAndDropListener.invoke$lambda$5$lambda$4$lambda$2(imageView, gasmanDropAreaItem, this$0);
                                        }
                                    }).withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            GasmanDragAndDropListener.invoke$lambda$5$lambda$4$lambda$3(GasmanDropAreaItem.this, this$0, imageView);
                                        }
                                    });
                                    return true;
                                }
                                GasmanChildViewModel gasmanChildViewModel = this$0.gasmanChildViewModel;
                                String string = imageView.getContext().getString(R.string.gasman_pipe_is_not_suitable);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                gasmanChildViewModel.sendNotification(string);
                            }
                        }
                    }
                }
                return false;
            default:
                return false;
        }
        return true;
    }

    public static final void invoke$lambda$5$lambda$4$lambda$2(ImageView draggableItem, GasmanDropAreaItem dropArea, GasmanDragAndDropListener this$0) {
        Intrinsics.checkNotNullParameter(draggableItem, "$draggableItem");
        Intrinsics.checkNotNullParameter(dropArea, "$dropArea");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        draggableItem.setOnTouchListener(null);
        GasmanPlot plot = dropArea.getPlot();
        if (Intrinsics.areEqual(plot, TOP_PLOT.INSTANCE)) {
            this$0.gasmanChildViewModel.reduceTopPlotQuantity();
        } else if (Intrinsics.areEqual(plot, MIDDLE_PLOT.INSTANCE)) {
            this$0.gasmanChildViewModel.reduceMiddlePlotQuantity();
        } else if (Intrinsics.areEqual(plot, BOT_PLOT.INSTANCE)) {
            this$0.gasmanChildViewModel.reduceBotPlotQuantity();
        }
        this$0.listOfDropAreas.remove(dropArea);
    }

    public static final void invoke$lambda$5$lambda$4$lambda$3(GasmanDropAreaItem dropArea, GasmanDragAndDropListener this$0, ImageView draggableItem) {
        Intrinsics.checkNotNullParameter(dropArea, "$dropArea");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(draggableItem, "$draggableItem");
        if (Intrinsics.areEqual(dropArea.getDropAreaTag(), GasmanDropAreaTag.TEE_PIPE.INSTANCE) || Intrinsics.areEqual(dropArea.getDropAreaTag(), GasmanDropAreaTag.TEE_PIPE_LONG_90_DEGREES.INSTANCE)) {
            this$0.setRotationClickListener(draggableItem, dropArea, 180.0f);
        } else {
            this$0.setRotationClickListener(draggableItem, dropArea, 90.0f);
        }
        this$0.checkIfRotationLessThan360(draggableItem, dropArea);
        this$0.checkAngles(draggableItem, dropArea, true);
    }

    public final void setRotationClickListener(final ImageView draggableItem, final GasmanDropAreaItem dropArea, final float rotation) {
        draggableItem.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GasmanDragAndDropListener.setRotationClickListener$lambda$8(GasmanDragAndDropListener.this, rotation, draggableItem, dropArea, view);
            }
        });
    }

    public static final void setRotationClickListener$lambda$8(final GasmanDragAndDropListener this$0, float f, final ImageView draggableItem, final GasmanDropAreaItem dropArea, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(draggableItem, "$draggableItem");
        Intrinsics.checkNotNullParameter(dropArea, "$dropArea");
        if (this$0.buttonBlocked) {
            return;
        }
        this$0.buttonBlocked = true;
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(100L);
        animate.rotationBy(f);
        animate.withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                GasmanDragAndDropListener.setRotationClickListener$lambda$8$lambda$7(GasmanDragAndDropListener.this, draggableItem, dropArea);
            }
        });
    }

    public static final void setRotationClickListener$lambda$8$lambda$7(GasmanDragAndDropListener this$0, ImageView draggableItem, GasmanDropAreaItem dropArea) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(draggableItem, "$draggableItem");
        Intrinsics.checkNotNullParameter(dropArea, "$dropArea");
        this$0.buttonBlocked = false;
        this$0.checkIfRotationLessThan360(draggableItem, dropArea);
        this$0.checkAngles(draggableItem, dropArea, false);
    }

    public final void checkIfRotationLessThan360(View draggableItem, GasmanDropAreaItem dropArea) {
        if (draggableItem.getRotation() == 360.0f) {
            draggableItem.setRotation(0.0f);
        }
        if (!Intrinsics.areEqual(dropArea.getDropAreaTag(), GasmanDropAreaTag.TEE_PIPE_LONG_90_DEGREES.INSTANCE) || draggableItem.getRotation() <= 270.0f) {
            return;
        }
        draggableItem.setRotation(90.0f);
    }

    public final void checkAngles(final View draggableItem, GasmanDropAreaItem dropArea, boolean isFirstDrop) {
        if (dropArea.getApplyAngle().contains(Float.valueOf(draggableItem.getRotation()))) {
            this.gasmanChildViewModel.pipeTurned(draggableItem, true);
            draggableItem.clearAnimation();
            draggableItem.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GasmanDragAndDropListener.checkAngles$lambda$9(GasmanDragAndDropListener.this, draggableItem, view);
                }
            });
        } else if (isFirstDrop) {
            this.gasmanChildViewModel.pipeTurned(draggableItem, false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setDuration(700L);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            draggableItem.startAnimation(alphaAnimation);
        }
    }

    public static final void checkAngles$lambda$9(GasmanDragAndDropListener this$0, View draggableItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(draggableItem, "$draggableItem");
        if (this$0.oldTimeAfterCheck == System.currentTimeMillis() || System.currentTimeMillis() - this$0.oldTimeAfterCheck <= 1000) {
            return;
        }
        this$0.oldTimeAfterCheck = System.currentTimeMillis();
        GasmanChildViewModel gasmanChildViewModel = this$0.gasmanChildViewModel;
        String string = draggableItem.getContext().getString(R.string.gasman_pipe_is_already_installed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gasmanChildViewModel.sendNotification(string);
    }
}
