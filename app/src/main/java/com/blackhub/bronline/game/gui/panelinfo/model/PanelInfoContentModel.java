package com.blackhub.bronline.game.gui.panelinfo.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: PanelInfoContentModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/gui/panelinfo/model/PanelInfoContentModel;", "", "titleText", "", "descriptionText", "imageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescriptionText", "()Ljava/lang/String;", "getImageName", "getTitleText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PanelInfoContentModel {
    public static final int $stable = 0;

    @SerializedName("d")
    @NotNull
    public final String descriptionText;

    @SerializedName("imageName")
    @NotNull
    public final String imageName;

    @SerializedName("tt")
    @NotNull
    public final String titleText;

    public PanelInfoContentModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PanelInfoContentModel copy$default(PanelInfoContentModel panelInfoContentModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = panelInfoContentModel.titleText;
        }
        if ((i & 2) != 0) {
            str2 = panelInfoContentModel.descriptionText;
        }
        if ((i & 4) != 0) {
            str3 = panelInfoContentModel.imageName;
        }
        return panelInfoContentModel.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final PanelInfoContentModel copy(@NotNull String titleText, @NotNull String descriptionText, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new PanelInfoContentModel(titleText, descriptionText, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PanelInfoContentModel)) {
            return false;
        }
        PanelInfoContentModel panelInfoContentModel = (PanelInfoContentModel) other;
        return Intrinsics.areEqual(this.titleText, panelInfoContentModel.titleText) && Intrinsics.areEqual(this.descriptionText, panelInfoContentModel.descriptionText) && Intrinsics.areEqual(this.imageName, panelInfoContentModel.imageName);
    }

    public int hashCode() {
        return (((this.titleText.hashCode() * 31) + this.descriptionText.hashCode()) * 31) + this.imageName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PanelInfoContentModel(titleText=" + this.titleText + ", descriptionText=" + this.descriptionText + ", imageName=" + this.imageName + ")";
    }

    public PanelInfoContentModel(@NotNull String titleText, @NotNull String descriptionText, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.imageName = imageName;
    }

    public /* synthetic */ PanelInfoContentModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }
}
