package com.blackhub.bronline.launcher.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: Story.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/blackhub/bronline/launcher/network/Story;", "", "title", "", "text", "image", "link", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "getLink", "setLink", "getText", "setText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Story {
    public static final int $stable = 8;

    @SerializedName("image")
    @NotNull
    public String image;

    @SerializedName("link")
    @NotNull
    public String link;

    @SerializedName("text")
    @NotNull
    public String text;

    @SerializedName("title")
    @NotNull
    public String title;

    public static /* synthetic */ Story copy$default(Story story, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = story.title;
        }
        if ((i & 2) != 0) {
            str2 = story.text;
        }
        if ((i & 4) != 0) {
            str3 = story.image;
        }
        if ((i & 8) != 0) {
            str4 = story.link;
        }
        return story.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final Story copy(@NotNull String title, @NotNull String text, @NotNull String image, @NotNull String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(link, "link");
        return new Story(title, text, image, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Story)) {
            return false;
        }
        Story story = (Story) other;
        return Intrinsics.areEqual(this.title, story.title) && Intrinsics.areEqual(this.text, story.text) && Intrinsics.areEqual(this.image, story.image) && Intrinsics.areEqual(this.link, story.link);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.link.hashCode();
    }

    @NotNull
    public String toString() {
        return "Story(title=" + this.title + ", text=" + this.text + ", image=" + this.image + ", link=" + this.link + ")";
    }

    public Story(@NotNull String title, @NotNull String text, @NotNull String image, @NotNull String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(link, "link");
        this.title = title;
        this.text = text;
        this.image = image;
        this.link = link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }
}
