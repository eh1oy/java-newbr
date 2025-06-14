package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsObj;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FractionsQuestsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;)V", "mutableQuestsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "questsLiveData", "Landroidx/lifecycle/LiveData;", "getQuestsLiveData", "()Landroidx/lifecycle/LiveData;", "questsObjMutableLivedata", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsList;", "getQuestsObj", "", "questsObj", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;", "sendStartQuest", "taskId", "", "setQuestsList", "fractionId", Const.FRACTION_CONTROL_PLAYER_RANK, "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFractionsQuestsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsQuestsViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1#2:46\n1855#3,2:47\n*S KotlinDebug\n*F\n+ 1 FractionsQuestsViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel\n*L\n27#1:47,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsQuestsViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final MutableLiveData<List<FractionQuestsItem>> mutableQuestsLiveData;

    @NotNull
    public final LiveData<List<FractionQuestsItem>> questsLiveData;

    @NotNull
    public final MutableLiveData<List<FractionQuestsList>> questsObjMutableLivedata;

    @Inject
    public FractionsQuestsViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        this.questsObjMutableLivedata = new MutableLiveData<>();
        MutableLiveData<List<FractionQuestsItem>> mutableLiveData = new MutableLiveData<>();
        this.mutableQuestsLiveData = mutableLiveData;
        this.questsLiveData = mutableLiveData;
    }

    @NotNull
    public final LiveData<List<FractionQuestsItem>> getQuestsLiveData() {
        return this.questsLiveData;
    }

    public final void getQuestsObj(@NotNull FractionQuestsObj questsObj) {
        Intrinsics.checkNotNullParameter(questsObj, "questsObj");
        MutableLiveData<List<FractionQuestsList>> mutableLiveData = this.questsObjMutableLivedata;
        List<FractionQuestsList> fractionQuests = questsObj.getFractionQuests();
        if (fractionQuests == null) {
            fractionQuests = CollectionsKt__CollectionsKt.emptyList();
        }
        mutableLiveData.setValue(fractionQuests);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setQuestsList(int r8, int r9) {
        /*
            r7 = this;
            androidx.lifecycle.MutableLiveData<java.util.List<com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList>> r0 = r7.questsObjMutableLivedata
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L2f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList r3 = (com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList) r3
            int r3 = r3.getFractionID()
            if (r3 != r8) goto L11
            goto L26
        L25:
            r2 = r1
        L26:
            com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList r2 = (com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList) r2
            if (r2 == 0) goto L2f
            java.util.List r8 = r2.getTaskList()
            goto L30
        L2f:
            r8 = r1
        L30:
            if (r8 != 0) goto L36
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L36:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L41:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r8.next()
            com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem r2 = (com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem) r2
            if (r2 == 0) goto L54
            java.util.List r3 = r2.getTaskAccess()
            goto L55
        L54:
            r3 = r1
        L55:
            if (r3 == 0) goto L41
            java.util.List r3 = r2.getTaskAccess()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L41
            java.util.List r3 = r2.getTaskAccess()
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r9 < r3) goto L89
            java.util.List r3 = r2.getTaskAccess()
            java.lang.Object r3 = r3.get(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r9 > r3) goto L89
            r0.add(r2)
        L89:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L41
            java.util.Iterator r2 = r0.iterator()
        L94:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r2.next()
            r6 = r3
            com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem r6 = (com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem) r6
            boolean r6 = r6.getIsClicked()
            if (r6 == 0) goto L94
            goto La9
        La8:
            r3 = r1
        La9:
            if (r3 != 0) goto L41
            java.lang.Object r2 = r0.get(r5)
            com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem r2 = (com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem) r2
            r2.setClicked(r4)
            goto L41
        Lb5:
            androidx.lifecycle.MutableLiveData<java.util.List<com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem>> r8 = r7.mutableQuestsLiveData
            r8.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel.setQuestsList(int, int):void");
    }

    public final void sendStartQuest(int taskId) {
        this.actionsWithJSON.sendStartQuest(taskId);
    }
}
