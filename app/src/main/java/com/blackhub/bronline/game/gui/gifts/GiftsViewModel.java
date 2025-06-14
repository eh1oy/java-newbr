package com.blackhub.bronline.game.gui.gifts;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.gifts.model.GiftsOpenPrizeGiftModel;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.blackhub.bronline.game.repository.GiftsRepository;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GiftsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0003J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ0\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0006\u0010(\u001a\u00020\u0017J\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\"J\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020\u0017J\u0006\u0010.\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020'J\u0006\u00101\u001a\u00020\u0017J\u0016\u00102\u001a\u00020\u00172\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u000e\u00106\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u00107\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u00108\u001a\u000209H\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006:"}, d2 = {"Lcom/blackhub/bronline/game/gui/gifts/GiftsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/gifts/GiftsUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/gifts/GiftsActionWithJSON;", "giftsRepository", "Lcom/blackhub/bronline/game/repository/GiftsRepository;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/gifts/GiftsActionWithJSON;Lcom/blackhub/bronline/game/repository/GiftsRepository;Lcom/blackhub/bronline/game/common/LocalNotification;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clickButtonBack", "", "getGiftResponse", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomIcon", "", "initJson", "json", "Lorg/json/JSONObject;", "renderObjectAndUpdateState", "isFirst", "", "type", "id", "modelId", "prizeName", "", "sendButtonGet", "sendCloseScreen", "sendOpenLegendaryGift", "isWithoutLoader", "sendOpenStandardGift", "sendPurchaseBc", "setButtonGetVisible", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "turnBlockingLoading", "updateGifts", "gifts", "", "Lcom/blackhub/bronline/game/gui/gifts/model/GiftsOpenPrizeGiftModel;", "updateJson", "updateStateWithNewGift", "gift", "Lcom/blackhub/bronline/game/gui/gifts/model/GiftsPreviewItemModel;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n230#2,5:464\n230#2,5:470\n230#2,5:475\n1#3:469\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel\n*L\n333#1:464,5\n450#1:470,5\n456#1:475,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsViewModel extends BaseViewModel<GiftsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<GiftsUiState> _uiState;

    @NotNull
    public final GiftsActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final GiftsRepository giftsRepository;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StateFlow<GiftsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public GiftsViewModel(@NotNull GiftsActionWithJSON actionWithJSON, @NotNull GiftsRepository giftsRepository, @NotNull LocalNotification localNotification, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(giftsRepository, "giftsRepository");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.giftsRepository = giftsRepository;
        this.localNotification = localNotification;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new GiftsUiState(0, 0, null, 0, 0, 0, 0, null, null, false, false, null, null, false, false, false, 0, false, false, false, false, 2097151, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends GiftsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<GiftsUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void sendPurchaseBc() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new GiftsViewModel$sendPurchaseBc$1(this, null), 1, null);
    }

    public final void sendOpenStandardGift() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$sendOpenStandardGift$1(this, null), 1, null);
    }

    public final void sendOpenLegendaryGift(boolean isWithoutLoader) {
        BooleanExtensionKt.ifTrue(Boolean.valueOf(isWithoutLoader), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenLegendaryGift$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GiftsUiState value;
                GiftsUiState copy;
                MutableStateFlow<? extends GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    copy = r3.copy((r39 & 1) != 0 ? r3.eventId : 0, (r39 & 2) != 0 ? r3.screen : 0, (r39 & 4) != 0 ? r3.bgImage : null, (r39 & 8) != 0 ? r3.valueOfBC : 0, (r39 & 16) != 0 ? r3.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r3.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r3.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r3.standardGifts : null, (r39 & 256) != 0 ? r3.legendaryGifts : null, (r39 & 512) != 0 ? r3.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r3.isOpeningBox : false, (r39 & 2048) != 0 ? r3.giftFirst : null, (r39 & 4096) != 0 ? r3.giftSecond : null, (r39 & 8192) != 0 ? r3.isStandard : false, (r39 & 16384) != 0 ? r3.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r3.isButtonGetVisible : false, (r39 & 65536) != 0 ? r3.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r3.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r3.isNeedClose : false, (r39 & 524288) != 0 ? r3.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
                } while (!mutableStateFlow.compareAndSet(value, copy));
            }
        });
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$sendOpenLegendaryGift$2(this, null), 1, null);
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new GiftsViewModel$sendCloseScreen$1(this, null), 1, null);
    }

    public final void setButtonGetVisible() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$setButtonGetVisible$1(this, null), 1, null);
    }

    public final void sendButtonGet() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$sendButtonGet$1(this, null), 1, null);
    }

    public final void clickButtonBack() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new GiftsViewModel$clickButtonBack$1(this, null), 1, null);
    }

    public final void turnBlockingLoading() {
        GiftsUiState value;
        GiftsUiState copy;
        MutableStateFlow<? extends GiftsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r39 & 1) != 0 ? r2.eventId : 0, (r39 & 2) != 0 ? r2.screen : 0, (r39 & 4) != 0 ? r2.bgImage : null, (r39 & 8) != 0 ? r2.valueOfBC : 0, (r39 & 16) != 0 ? r2.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r2.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r2.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r2.standardGifts : null, (r39 & 256) != 0 ? r2.legendaryGifts : null, (r39 & 512) != 0 ? r2.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r2.isOpeningBox : false, (r39 & 2048) != 0 ? r2.giftFirst : null, (r39 & 4096) != 0 ? r2.giftSecond : null, (r39 & 8192) != 0 ? r2.isStandard : false, (r39 & 16384) != 0 ? r2.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r2.isButtonGetVisible : false, (r39 & 65536) != 0 ? r2.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r2.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r2.isNeedClose : false, (r39 & 524288) != 0 ? r2.isBlockingLoading : true, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void showErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    @DrawableRes
    public final int getRandomIcon() {
        GiftsConstants giftsConstants = GiftsConstants.INSTANCE;
        return giftsConstants.getGiftIcons().get(RangesKt___RangesKt.random(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(giftsConstants.getGiftIcons())), Random.INSTANCE)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:11:0x0042, B:13:0x004c, B:24:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getGiftResponse(kotlin.coroutines.Continuation<? super com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1 r0 = (com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1 r0 = new com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            com.blackhub.bronline.game.repository.GiftsRepository r6 = r5.giftsRepository     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.getGifts(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r6.body()     // Catch: java.lang.Exception -> L2a
            com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse r0 = (com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse) r0     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L68
            boolean r6 = r6.isSuccessful()     // Catch: java.lang.Exception -> L2a
            if (r6 == 0) goto L68
            r4 = r0
            goto L68
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getGiftResponse exception: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog(r6)
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.gifts.GiftsViewModel.getGiftResponse(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateGifts(List<GiftsOpenPrizeGiftModel> gifts) {
        int size = gifts.size();
        int i = 0;
        while (i < size) {
            GiftsOpenPrizeGiftModel giftsOpenPrizeGiftModel = gifts.get(i);
            boolean z = i == 0;
            int giftId = giftsOpenPrizeGiftModel.getGiftId();
            if (giftId == 0 || giftId == 2 || giftId == 7) {
                ViewModelExtensionKt.launchOnIO$default(this, null, new GiftsViewModel$updateGifts$1(this, z, giftsOpenPrizeGiftModel, i, null), 1, null);
            } else if (giftId == 10) {
                updateStateWithNewGift(z, new GiftsPreviewItemModel(null, R.drawable.bp_money, giftsOpenPrizeGiftModel.getTextGift(), 1, null));
            } else if (giftId == 20) {
                int eventId = getUiState().getValue().getEventId();
                updateStateWithNewGift(z, new GiftsPreviewItemModel(null, (eventId == 0 || eventId != 1) ? 2131233462 : 2131233598, giftsOpenPrizeGiftModel.getTextGift(), 1, null));
            }
            i++;
        }
    }

    public final void renderObjectAndUpdateState(final boolean isFirst, int type, int id, int modelId, final String prizeName) {
        GameRender.getInstance().RequestRender(type, id, modelId, 3, 3, 20.0f, 180.0f, 45.0f, type != 2 ? type != 7 ? 0.78f : 0.85f : 1.0f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                GiftsViewModel.renderObjectAndUpdateState$lambda$2(prizeName, this, isFirst, i, bitmap);
            }
        });
    }

    public static final void renderObjectAndUpdateState$lambda$2(String prizeName, GiftsViewModel this$0, boolean z, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(prizeName, "$prizeName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bitmap);
        this$0.updateStateWithNewGift(z, new GiftsPreviewItemModel(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0, prizeName, 2, null));
    }

    public final void updateStateWithNewGift(boolean isFirst, GiftsPreviewItemModel gift) {
        GiftsUiState value;
        GiftsUiState copy;
        GiftsUiState value2;
        GiftsUiState copy2;
        if (isFirst) {
            MutableStateFlow<? extends GiftsUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                copy2 = r2.copy((r39 & 1) != 0 ? r2.eventId : 0, (r39 & 2) != 0 ? r2.screen : 0, (r39 & 4) != 0 ? r2.bgImage : null, (r39 & 8) != 0 ? r2.valueOfBC : 0, (r39 & 16) != 0 ? r2.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r2.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r2.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r2.standardGifts : null, (r39 & 256) != 0 ? r2.legendaryGifts : null, (r39 & 512) != 0 ? r2.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r2.isOpeningBox : false, (r39 & 2048) != 0 ? r2.giftFirst : gift, (r39 & 4096) != 0 ? r2.giftSecond : null, (r39 & 8192) != 0 ? r2.isStandard : false, (r39 & 16384) != 0 ? r2.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r2.isButtonGetVisible : false, (r39 & 65536) != 0 ? r2.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r2.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r2.isNeedClose : false, (r39 & 524288) != 0 ? r2.isBlockingLoading : false, (r39 & 1048576) != 0 ? value2.isClickedOpenCase : false);
            } while (!mutableStateFlow.compareAndSet(value2, copy2));
            return;
        }
        MutableStateFlow<? extends GiftsUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            copy = r2.copy((r39 & 1) != 0 ? r2.eventId : 0, (r39 & 2) != 0 ? r2.screen : 0, (r39 & 4) != 0 ? r2.bgImage : null, (r39 & 8) != 0 ? r2.valueOfBC : 0, (r39 & 16) != 0 ? r2.valueOfStandardGifts : 0, (r39 & 32) != 0 ? r2.valueOfLegendaryGifts : 0, (r39 & 64) != 0 ? r2.priceOfLegendaryGift : 0, (r39 & 128) != 0 ? r2.standardGifts : null, (r39 & 256) != 0 ? r2.legendaryGifts : null, (r39 & 512) != 0 ? r2.isVisibleButtonBack : false, (r39 & 1024) != 0 ? r2.isOpeningBox : false, (r39 & 2048) != 0 ? r2.giftFirst : null, (r39 & 4096) != 0 ? r2.giftSecond : gift, (r39 & 8192) != 0 ? r2.isStandard : false, (r39 & 16384) != 0 ? r2.isSecondGiftVisible : false, (r39 & 32768) != 0 ? r2.isButtonGetVisible : false, (r39 & 65536) != 0 ? r2.valueOfOpenedGifts : 0, (r39 & 131072) != 0 ? r2.isHideBlockWithBC : false, (r39 & 262144) != 0 ? r2.isNeedClose : false, (r39 & 524288) != 0 ? r2.isBlockingLoading : false, (r39 & 1048576) != 0 ? value.isClickedOpenCase : false);
        } while (!mutableStateFlow2.compareAndSet(value, copy));
    }
}
