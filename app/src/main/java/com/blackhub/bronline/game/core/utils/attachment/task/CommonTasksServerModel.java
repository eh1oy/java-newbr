package com.blackhub.bronline.game.core.utils.attachment.task;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CommonTasksServerModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTasksServerModel;", "", "id", "", "progress", "status", "(III)V", "getId", "()I", "getProgress", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonTasksServerModel {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName("p")
    public final int progress;

    @SerializedName("s")
    public final int status;

    public CommonTasksServerModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ CommonTasksServerModel copy$default(CommonTasksServerModel commonTasksServerModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = commonTasksServerModel.id;
        }
        if ((i4 & 2) != 0) {
            i2 = commonTasksServerModel.progress;
        }
        if ((i4 & 4) != 0) {
            i3 = commonTasksServerModel.status;
        }
        return commonTasksServerModel.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final CommonTasksServerModel copy(int id, int progress, int status) {
        return new CommonTasksServerModel(id, progress, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTasksServerModel)) {
            return false;
        }
        CommonTasksServerModel commonTasksServerModel = (CommonTasksServerModel) other;
        return this.id == commonTasksServerModel.id && this.progress == commonTasksServerModel.progress && this.status == commonTasksServerModel.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.progress)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "CommonTasksServerModel(id=" + this.id + ", progress=" + this.progress + ", status=" + this.status + ")";
    }

    public CommonTasksServerModel(int i, int i2, int i3) {
        this.id = i;
        this.progress = i2;
        this.status = i3;
    }

    public /* synthetic */ CommonTasksServerModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getId() {
        return this.id;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStatus() {
        return this.status;
    }
}
