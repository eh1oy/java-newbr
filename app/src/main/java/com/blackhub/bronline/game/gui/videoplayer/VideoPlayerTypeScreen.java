package com.blackhub.bronline.game.gui.videoplayer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlayerTypeScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerTypeScreen;", "", "(Ljava/lang/String;I)V", "MODAL_WINDOW", "PLAYER", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoPlayerTypeScreen {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ VideoPlayerTypeScreen[] $VALUES;
    public static final VideoPlayerTypeScreen MODAL_WINDOW = new VideoPlayerTypeScreen("MODAL_WINDOW", 0);
    public static final VideoPlayerTypeScreen PLAYER = new VideoPlayerTypeScreen("PLAYER", 1);

    public static final /* synthetic */ VideoPlayerTypeScreen[] $values() {
        return new VideoPlayerTypeScreen[]{MODAL_WINDOW, PLAYER};
    }

    @NotNull
    public static EnumEntries<VideoPlayerTypeScreen> getEntries() {
        return $ENTRIES;
    }

    public static VideoPlayerTypeScreen valueOf(String str) {
        return (VideoPlayerTypeScreen) Enum.valueOf(VideoPlayerTypeScreen.class, str);
    }

    public static VideoPlayerTypeScreen[] values() {
        return (VideoPlayerTypeScreen[]) $VALUES.clone();
    }

    public VideoPlayerTypeScreen(String str, int i) {
    }

    static {
        VideoPlayerTypeScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
