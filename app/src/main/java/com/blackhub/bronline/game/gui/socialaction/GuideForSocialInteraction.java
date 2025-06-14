package com.blackhub.bronline.game.gui.socialaction;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.databinding.SocialInteractionBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GuideForSocialInteraction.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/socialaction/GuideForSocialInteraction;", "", "binding", "Lcom/blackhub/bronline/databinding/SocialInteractionBinding;", "positionsGetter", "Lcom/blackhub/bronline/game/gui/socialaction/PositionsGetter;", "(Lcom/blackhub/bronline/databinding/SocialInteractionBinding;Lcom/blackhub/bronline/game/gui/socialaction/PositionsGetter;)V", "orderGuide", "", "parameters", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "searchActionsText", "", "searchTypesText", "setGuide", "", "order", "setLogicForClick", "setVisibleGuide", "isVisible", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuideForSocialInteraction {
    public static final int $stable = 8;

    @NotNull
    public final SocialInteractionBinding binding;
    public int orderGuide;

    @NotNull
    public final ConstraintLayout.LayoutParams parameters;

    @NotNull
    public final PositionsGetter positionsGetter;

    @NotNull
    public final String searchActionsText;

    @NotNull
    public final String searchTypesText;

    public GuideForSocialInteraction(@NotNull SocialInteractionBinding binding, @NotNull PositionsGetter positionsGetter) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(positionsGetter, "positionsGetter");
        this.binding = binding;
        this.positionsGetter = positionsGetter;
        ViewGroup.LayoutParams layoutParams = binding.windowSocial.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        this.parameters = (ConstraintLayout.LayoutParams) layoutParams;
        this.searchTypesText = "Общение";
        this.searchActionsText = "Пожать руку";
        this.orderGuide = -1;
    }

    public final void setGuide(int order) {
        setLogicForClick();
        if (order == 0) {
            this.orderGuide = 0;
            if (Intrinsics.areEqual(this.binding.button3.getText(), this.searchTypesText)) {
                ConstraintLayout.LayoutParams layoutParams = this.parameters;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = this.positionsGetter.getButton3Width();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.positionsGetter.getButton3Height();
                layoutParams.setMarginStart(this.positionsGetter.getButton3Location()[0]);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.positionsGetter.getButton3Location()[1];
                SocialInteractionBinding socialInteractionBinding = this.binding;
                socialInteractionBinding.windowSocial.setLayoutParams(this.parameters);
                socialInteractionBinding.helpText1Social.setVisibility(0);
                setVisibleGuide(true);
                return;
            }
            if (Intrinsics.areEqual(this.binding.button2.getText(), this.searchTypesText)) {
                ConstraintLayout.LayoutParams layoutParams2 = this.parameters;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = this.positionsGetter.getButton2Width();
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = this.positionsGetter.getButton2Height();
                layoutParams2.setMarginStart(this.positionsGetter.getButton2Location()[0]);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.positionsGetter.getButton2Location()[1];
                SocialInteractionBinding socialInteractionBinding2 = this.binding;
                socialInteractionBinding2.windowSocial.setLayoutParams(this.parameters);
                socialInteractionBinding2.helpText1Social.setVisibility(0);
                setVisibleGuide(true);
                return;
            }
            return;
        }
        if (order != 1) {
            return;
        }
        this.orderGuide = 1;
        if (Intrinsics.areEqual(this.binding.button1.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams3 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = this.positionsGetter.getButton1Width();
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = this.positionsGetter.getButton1Height();
            layoutParams3.setMarginStart(this.positionsGetter.getButton1Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = this.positionsGetter.getButton1Location()[1];
            SocialInteractionBinding socialInteractionBinding3 = this.binding;
            socialInteractionBinding3.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding3.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button2.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams4 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = this.positionsGetter.getButton2Width();
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = this.positionsGetter.getButton2Height();
            layoutParams4.setMarginStart(this.positionsGetter.getButton2Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = this.positionsGetter.getButton2Location()[1];
            SocialInteractionBinding socialInteractionBinding4 = this.binding;
            socialInteractionBinding4.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding4.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button3.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams5 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = this.positionsGetter.getButton3Width();
            ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.positionsGetter.getButton3Height();
            layoutParams5.setMarginStart(this.positionsGetter.getButton3Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = this.positionsGetter.getButton3Location()[1];
            SocialInteractionBinding socialInteractionBinding5 = this.binding;
            socialInteractionBinding5.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding5.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button4.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams6 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams6).width = this.positionsGetter.getButton4Width();
            ((ViewGroup.MarginLayoutParams) layoutParams6).height = this.positionsGetter.getButton4Height();
            layoutParams6.setMarginStart(this.positionsGetter.getButton4Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = this.positionsGetter.getButton4Location()[1];
            SocialInteractionBinding socialInteractionBinding6 = this.binding;
            socialInteractionBinding6.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding6.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button5.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams7 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams7).width = this.positionsGetter.getButton5Width();
            ((ViewGroup.MarginLayoutParams) layoutParams7).height = this.positionsGetter.getButton5Height();
            layoutParams7.setMarginStart(this.positionsGetter.getButton5Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = this.positionsGetter.getButton5Location()[1];
            SocialInteractionBinding socialInteractionBinding7 = this.binding;
            socialInteractionBinding7.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding7.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button6.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams8 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams8).width = this.positionsGetter.getButton6Width();
            ((ViewGroup.MarginLayoutParams) layoutParams8).height = this.positionsGetter.getButton6Height();
            layoutParams8.setMarginStart(this.positionsGetter.getButton6Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = this.positionsGetter.getButton6Location()[1];
            SocialInteractionBinding socialInteractionBinding8 = this.binding;
            socialInteractionBinding8.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding8.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
            return;
        }
        if (Intrinsics.areEqual(this.binding.button7.getText(), this.searchActionsText)) {
            ConstraintLayout.LayoutParams layoutParams9 = this.parameters;
            ((ViewGroup.MarginLayoutParams) layoutParams9).width = this.positionsGetter.getButton7Width();
            ((ViewGroup.MarginLayoutParams) layoutParams9).height = this.positionsGetter.getButton7Height();
            layoutParams9.setMarginStart(this.positionsGetter.getButton7Location()[0]);
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = this.positionsGetter.getButton7Location()[1];
            SocialInteractionBinding socialInteractionBinding9 = this.binding;
            socialInteractionBinding9.windowSocial.setLayoutParams(this.parameters);
            socialInteractionBinding9.helpText2Social.setVisibility(0);
            setVisibleGuide(true);
        }
    }

    public final void setLogicForClick() {
        SocialInteractionBinding socialInteractionBinding = this.binding;
        socialInteractionBinding.topBlackSocial.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GuideForSocialInteraction$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideForSocialInteraction.setLogicForClick$lambda$22$lambda$18(GuideForSocialInteraction.this, view);
            }
        });
        socialInteractionBinding.leftBlackSocial.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GuideForSocialInteraction$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideForSocialInteraction.setLogicForClick$lambda$22$lambda$19(GuideForSocialInteraction.this, view);
            }
        });
        socialInteractionBinding.rightBlackSocial.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GuideForSocialInteraction$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideForSocialInteraction.setLogicForClick$lambda$22$lambda$20(GuideForSocialInteraction.this, view);
            }
        });
        socialInteractionBinding.bottomBlackSocial.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GuideForSocialInteraction$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideForSocialInteraction.setLogicForClick$lambda$22$lambda$21(GuideForSocialInteraction.this, view);
            }
        });
    }

    public static final void setLogicForClick$lambda$22$lambda$18(GuideForSocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibleGuide(false);
    }

    public static final void setLogicForClick$lambda$22$lambda$19(GuideForSocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibleGuide(false);
    }

    public static final void setLogicForClick$lambda$22$lambda$20(GuideForSocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibleGuide(false);
    }

    public static final void setLogicForClick$lambda$22$lambda$21(GuideForSocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibleGuide(false);
    }

    public final void setVisibleGuide(boolean isVisible) {
        if (isVisible) {
            SocialInteractionBinding socialInteractionBinding = this.binding;
            socialInteractionBinding.topBlackSocial.setVisibility(0);
            socialInteractionBinding.leftBlackSocial.setVisibility(0);
            socialInteractionBinding.rightBlackSocial.setVisibility(0);
            socialInteractionBinding.bottomBlackSocial.setVisibility(0);
            return;
        }
        SocialInteractionBinding socialInteractionBinding2 = this.binding;
        socialInteractionBinding2.topBlackSocial.setVisibility(4);
        socialInteractionBinding2.leftBlackSocial.setVisibility(4);
        socialInteractionBinding2.rightBlackSocial.setVisibility(4);
        socialInteractionBinding2.bottomBlackSocial.setVisibility(4);
        socialInteractionBinding2.helpText1Social.setVisibility(4);
        socialInteractionBinding2.helpText2Social.setVisibility(4);
    }
}
