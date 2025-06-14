package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FractionDocumentsList.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;", "", "fractionDocuments", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObj;", "(Ljava/util/List;)V", "getFractionDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FractionsDocumentsObjList {
    public static final int $stable = 8;

    @SerializedName("fractionMenuDocuments")
    @Nullable
    public final List<FractionsDocumentsObj> fractionDocuments;

    public FractionsDocumentsObjList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsDocumentsObjList copy$default(FractionsDocumentsObjList fractionsDocumentsObjList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fractionsDocumentsObjList.fractionDocuments;
        }
        return fractionsDocumentsObjList.copy(list);
    }

    @Nullable
    public final List<FractionsDocumentsObj> component1() {
        return this.fractionDocuments;
    }

    @NotNull
    public final FractionsDocumentsObjList copy(@Nullable List<FractionsDocumentsObj> fractionDocuments) {
        return new FractionsDocumentsObjList(fractionDocuments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FractionsDocumentsObjList) && Intrinsics.areEqual(this.fractionDocuments, ((FractionsDocumentsObjList) other).fractionDocuments);
    }

    public int hashCode() {
        List<FractionsDocumentsObj> list = this.fractionDocuments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionsDocumentsObjList(fractionDocuments=" + this.fractionDocuments + ")";
    }

    public FractionsDocumentsObjList(@Nullable List<FractionsDocumentsObj> list) {
        this.fractionDocuments = list;
    }

    public /* synthetic */ FractionsDocumentsObjList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<FractionsDocumentsObj> getFractionDocuments() {
        return this.fractionDocuments;
    }
}
