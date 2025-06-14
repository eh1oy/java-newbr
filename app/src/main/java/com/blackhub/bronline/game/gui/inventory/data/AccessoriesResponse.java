package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: AccessoriesResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/AccessoriesResponse;", "", "arrayItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "(Ljava/util/List;)V", "getArrayItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccessoriesResponse {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public final List<InvItems> arrayItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessoriesResponse copy$default(AccessoriesResponse accessoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accessoriesResponse.arrayItems;
        }
        return accessoriesResponse.copy(list);
    }

    @NotNull
    public final List<InvItems> component1() {
        return this.arrayItems;
    }

    @NotNull
    public final AccessoriesResponse copy(@NotNull List<InvItems> arrayItems) {
        Intrinsics.checkNotNullParameter(arrayItems, "arrayItems");
        return new AccessoriesResponse(arrayItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccessoriesResponse) && Intrinsics.areEqual(this.arrayItems, ((AccessoriesResponse) other).arrayItems);
    }

    public int hashCode() {
        return this.arrayItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccessoriesResponse(arrayItems=" + this.arrayItems + ")";
    }

    public AccessoriesResponse(@NotNull List<InvItems> arrayItems) {
        Intrinsics.checkNotNullParameter(arrayItems, "arrayItems");
        this.arrayItems = arrayItems;
    }

    @NotNull
    public final List<InvItems> getArrayItems() {
        return this.arrayItems;
    }
}
