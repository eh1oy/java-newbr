package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequestKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.NickAndTopPosAndGamePointerForCurrentPlayer;
import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: EntertainmentGamesViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\bJ\u0006\u00104\u001a\u000202J\u0017\u00105\u001a\u0002022\b\u00106\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u00107J$\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u00106\u001a\u00020\rH\u0002J\u0006\u0010<\u001a\u000202J?\u0010=\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u00010?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010EJ\u000e\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HJ\u0015\u0010I\u001a\u0002022\b\u00106\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00107J\u000e\u0010J\u001a\u0002022\u0006\u0010K\u001a\u00020\rJ\u000e\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020\rJ\u0010\u0010N\u001a\u0002022\b\u0010O\u001a\u0004\u0018\u00010BJ\u000e\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u00020\u0019J\u0015\u0010R\u001a\u0002022\b\u00106\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00107J\b\u0010S\u001a\u000202H\u0002J\u0010\u0010T\u001a\u0002022\u0006\u00106\u001a\u00020\rH\u0002J\u0010\u0010U\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\nR\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "Landroidx/lifecycle/ViewModel;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;)V", "allGames", "Lkotlinx/coroutines/flow/SharedFlow;", "", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "getAllGames", "()Lkotlinx/coroutines/flow/SharedFlow;", "allQueue", "Lkotlinx/coroutines/flow/StateFlow;", "", "getAllQueue", "()Lkotlinx/coroutines/flow/StateFlow;", "allTopList", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentPlayersData;", "getAllTopList", "clickedGame", "getClickedGame", "counter", "currentPlayerTop", "getCurrentPlayerTop", "ifFillTop", "", "infoAboutCurrentPlayer", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/NickAndTopPosAndGamePointerForCurrentPlayer;", "getInfoAboutCurrentPlayer", "isVisibleButtonInfo", "mutableAllGames", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableAllTopList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableClickedGame", "mutableCurrentPlayerTop", "mutableInfoAboutCurrentPLayer", "mutableIsVisibleButtonInfo", "mutableQueue", "mutableSavedGameIdForTop", "mutableTop0", "mutableTop1", "mutableTop2", "mutableTop3", "mutableTop4", "mutableTop5", "updateGameStatusForID", "getUpdateGameStatusForID", "updateGameStatusForIDMutable", "checkCurrentGame", "", BillingPurchaseRequestKt.SOURCE, "clearInfo", "createMyTopPos", "gameId", "(Ljava/lang/Integer;)V", "generateFinalTopList", "listAny", "", "", "generateTopList", "initGamesList", "array", "Lorg/json/JSONArray;", "allTitles", "", "", "allDescriptions", "resources", "(Lorg/json/JSONArray;[Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)V", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "saveGameIdForTop", "sendGetLobby", "lobbiesNumber", "sendPressButton", "typeOfButton", "setPlayersNick", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "setVisibleButtonInfo", "isVisible", "showCurrentGameTop", "startFillCheckerForTopList", "updateGameStatus", "updateQueue", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntertainmentGamesViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final EntertainmentSystemActionsWithJSON actionWithJson;

    @NotNull
    public final SharedFlow<List<EntertainmentGameData>> allGames;

    @NotNull
    public final StateFlow<List<Integer>> allQueue;

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> allTopList;

    @NotNull
    public final StateFlow<EntertainmentGameData> clickedGame;
    public int counter;

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> currentPlayerTop;
    public boolean ifFillTop;

    @NotNull
    public final SharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> infoAboutCurrentPlayer;

    @NotNull
    public final StateFlow<Boolean> isVisibleButtonInfo;

    @NotNull
    public final MutableSharedFlow<List<EntertainmentGameData>> mutableAllGames;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableAllTopList;

    @NotNull
    public final MutableStateFlow<EntertainmentGameData> mutableClickedGame;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableCurrentPlayerTop;

    @NotNull
    public final MutableSharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> mutableInfoAboutCurrentPLayer;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsVisibleButtonInfo;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableQueue;

    @NotNull
    public final MutableStateFlow<Integer> mutableSavedGameIdForTop;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop0;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop1;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop2;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop3;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop4;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop5;

    @NotNull
    public final SharedFlow<Integer> updateGameStatusForID;

    @NotNull
    public final MutableSharedFlow<Integer> updateGameStatusForIDMutable;

    @Inject
    public EntertainmentGamesViewModel(@NotNull EntertainmentSystemActionsWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        MutableSharedFlow<List<EntertainmentGameData>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableAllGames = MutableSharedFlow$default;
        this.allGames = MutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableQueue = MutableStateFlow;
        this.allQueue = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsVisibleButtonInfo = MutableStateFlow2;
        this.isVisibleButtonInfo = MutableStateFlow2;
        MutableStateFlow<EntertainmentGameData> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.mutableClickedGame = MutableStateFlow3;
        this.clickedGame = MutableStateFlow3;
        this.mutableSavedGameIdForTop = StateFlowKt.MutableStateFlow(null);
        this.mutableTop0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop1 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableStateFlow<List<EntertainmentPlayersData>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableAllTopList = MutableStateFlow4;
        this.allTopList = MutableStateFlow4;
        MutableSharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableInfoAboutCurrentPLayer = MutableSharedFlow$default2;
        this.infoAboutCurrentPlayer = MutableSharedFlow$default2;
        MutableStateFlow<List<EntertainmentPlayersData>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCurrentPlayerTop = MutableStateFlow5;
        this.currentPlayerTop = MutableStateFlow5;
        MutableSharedFlow<Integer> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.updateGameStatusForIDMutable = MutableSharedFlow$default3;
        this.updateGameStatusForID = MutableSharedFlow$default3;
    }

    @NotNull
    public final SharedFlow<List<EntertainmentGameData>> getAllGames() {
        return this.allGames;
    }

    @NotNull
    public final StateFlow<List<Integer>> getAllQueue() {
        return this.allQueue;
    }

    @NotNull
    public final StateFlow<Boolean> isVisibleButtonInfo() {
        return this.isVisibleButtonInfo;
    }

    @NotNull
    public final StateFlow<EntertainmentGameData> getClickedGame() {
        return this.clickedGame;
    }

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> getAllTopList() {
        return this.allTopList;
    }

    @NotNull
    public final SharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> getInfoAboutCurrentPlayer() {
        return this.infoAboutCurrentPlayer;
    }

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> getCurrentPlayerTop() {
        return this.currentPlayerTop;
    }

    @NotNull
    public final SharedFlow<Integer> getUpdateGameStatusForID() {
        return this.updateGameStatusForID;
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EntertainmentGamesViewModel$onPacketIncoming$1(json, this, null), 2, null);
    }

    public final void startFillCheckerForTopList() {
        int i = this.counter + 1;
        this.counter = i;
        if (i == 6) {
            this.ifFillTop = true;
        }
    }

    public final void updateQueue(JSONArray array) {
        this.mutableQueue.setValue(JsonArrayExtensionKt.toMutableIntList(array));
    }

    public final void updateGameStatus(int gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntertainmentGamesViewModel$updateGameStatus$1(this, gameId, null), 3, null);
    }

    public final void initGamesList(@Nullable JSONArray array, @NotNull String[] allTitles, @NotNull String[] allDescriptions, @NotNull List<Integer> resources) {
        Intrinsics.checkNotNullParameter(allTitles, "allTitles");
        Intrinsics.checkNotNullParameter(allDescriptions, "allDescriptions");
        Intrinsics.checkNotNullParameter(resources, "resources");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EntertainmentGamesViewModel$initGamesList$1(array, allTitles, allDescriptions, resources, this, null), 2, null);
    }

    public final void setPlayersNick(@Nullable String nick) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntertainmentGamesViewModel$setPlayersNick$1(nick, this, null), 3, null);
    }

    public final void setVisibleButtonInfo(boolean isVisible) {
        MutableStateFlow<Boolean> mutableStateFlow = this.mutableIsVisibleButtonInfo;
        if (!isVisible || this.mutableClickedGame.getValue() == null) {
            isVisible = false;
        }
        mutableStateFlow.setValue(Boolean.valueOf(isVisible));
    }

    public final void checkCurrentGame(@NotNull EntertainmentGameData game) {
        Intrinsics.checkNotNullParameter(game, "game");
        this.mutableClickedGame.setValue(game);
    }

    public final void saveGameIdForTop(@Nullable Integer gameId) {
        this.mutableSavedGameIdForTop.setValue(gameId);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData> generateFinalTopList(java.util.List<java.lang.Object> r16, int r17) {
        /*
            r15 = this;
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            r12 = r2
            r13 = r12
            r4 = r3
        Lc:
            int r5 = r16.size()
            if (r4 >= r5) goto L6f
            if (r12 == r2) goto L2d
            r5 = 2
            if (r12 == r5) goto L26
            r5 = 3
            if (r12 == r5) goto L1d
            r10 = r3
            r11 = r10
            goto L34
        L1d:
            r5 = 2131233819(0x7f080c1b, float:1.8083786E38)
            r6 = 2131233820(0x7f080c1c, float:1.8083788E38)
        L23:
            r10 = r5
            r11 = r6
            goto L34
        L26:
            r5 = 2131233817(0x7f080c19, float:1.8083782E38)
            r6 = 2131233818(0x7f080c1a, float:1.8083784E38)
            goto L23
        L2d:
            r5 = 2131233815(0x7f080c17, float:1.8083778E38)
            r6 = 2131233816(0x7f080c18, float:1.808378E38)
            goto L23
        L34:
            java.lang.Object r5 = r0.get(r13)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L4a
            java.lang.String r5 = "-"
        L48:
            r9 = r5
            goto L4f
        L4a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L48
        L4f:
            com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData r14 = new com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r5 = r14
            r6 = r12
            r8 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r14)
            int r12 = r12 + 1
            int r4 = r4 + 2
            int r13 = r13 + 2
            goto Lc
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel.generateFinalTopList(java.util.List, int):java.util.List");
    }

    public final void showCurrentGameTop(@Nullable Integer gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntertainmentGamesViewModel$showCurrentGameTop$1(gameId, this, null), 3, null);
    }

    public final void createMyTopPos(Integer gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new EntertainmentGamesViewModel$createMyTopPos$1(this, gameId, null), 2, null);
    }

    public final void sendPressButton(int typeOfButton) {
        if (typeOfButton == 4) {
            if (this.ifFillTop) {
                return;
            }
            this.actionWithJson.sendPressButtonForEntertainmentSystem(typeOfButton);
            return;
        }
        this.actionWithJson.sendPressButtonForEntertainmentSystem(typeOfButton);
    }

    public final void sendGetLobby(int lobbiesNumber) {
        this.actionWithJson.sendGetLobby(lobbiesNumber);
    }

    public final void generateTopList() {
        EntertainmentGameData value = this.mutableClickedGame.getValue();
        Integer valueOf = value != null ? Integer.valueOf(value.getId()) : null;
        createMyTopPos(valueOf);
        showCurrentGameTop(valueOf);
    }

    public final void clearInfo() {
        this.mutableAllTopList.setValue(CollectionsKt__CollectionsKt.emptyList());
    }
}
