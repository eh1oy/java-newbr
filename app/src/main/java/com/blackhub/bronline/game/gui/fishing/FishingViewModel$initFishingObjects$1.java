package com.blackhub.bronline.game.gui.fishing;

import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.fishing.data.FishingGsonParseObj;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FishingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$initFishingObjects$1", f = "FishingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$initFishingObjects$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n8#2,9:395\n230#3,5:404\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$initFishingObjects$1\n*L\n198#1:395,9\n206#1:404,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingViewModel$initFishingObjects$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $invItems;
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ FishingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FishingViewModel$initFishingObjects$1(FishingViewModel fishingViewModel, List<InvItems> list, JSONObject jSONObject, Continuation<? super FishingViewModel$initFishingObjects$1> continuation) {
        super(2, continuation);
        this.this$0 = fishingViewModel;
        this.$invItems = list;
        this.$json = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FishingViewModel$initFishingObjects$1(this.this$0, this.$invItems, this.$json, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FishingViewModel$initFishingObjects$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object obj2;
        FishingUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.localInvItems;
            mutableStateFlow.setValue(this.$invItems);
            JSONObject jSONObject = this.$json;
            try {
                Gson gson = new Gson();
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) FishingGsonParseObj.class);
            } catch (Exception e) {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.log(e.toString());
                firebaseCrashlytics.recordException(e);
                obj2 = null;
            }
            FishingGsonParseObj fishingGsonParseObj = (FishingGsonParseObj) obj2;
            if (fishingGsonParseObj != null && IntExtensionKt.isNotZero(Boxing.boxInt(fishingGsonParseObj.getProgressTime()))) {
                int progressTime = (int) (100 / (fishingGsonParseObj.getProgressTime() / 100));
                float speed = fishingGsonParseObj.getSpeed() * 1.8f;
                this.this$0.checkAndRender(fishingGsonParseObj, this.$invItems);
                MutableStateFlow<? extends FishingUiState> mutableStateFlow2 = this.this$0.get_uiState();
                while (true) {
                    FishingUiState value = mutableStateFlow2.getValue();
                    long fishingTime = fishingGsonParseObj.getFishingTime();
                    int progressTime2 = fishingGsonParseObj.getProgressTime();
                    FishingGsonParseObj fishingGsonParseObj2 = fishingGsonParseObj;
                    MutableStateFlow<? extends FishingUiState> mutableStateFlow3 = mutableStateFlow2;
                    copy = r4.copy((r38 & 1) != 0 ? r4.screen : 1, (r38 & 2) != 0 ? r4.fishFallStep : speed, (r38 & 4) != 0 ? r4.fishingTimer : fishingTime, (r38 & 8) != 0 ? r4.progressTimer : progressTime2, (r38 & 16) != 0 ? r4.progressStep : progressTime, (r38 & 32) != 0 ? r4.progressRotate : 0.0f, (r38 & 64) != 0 ? r4.currentProgress : 0, (r38 & 128) != 0 ? r4.baitObj : null, (r38 & 256) != 0 ? r4.tackleObj : null, (r38 & 512) != 0 ? r4.fishingObj : null, (r38 & 1024) != 0 ? r4.currentOffsetState : 0, (r38 & 2048) != 0 ? r4.fishingAudioType : null, (r38 & 4096) != 0 ? r4.isNeedNullableMediaPlayer : false, (r38 & 8192) != 0 ? r4.isNeedPlaySound : false, (r38 & 16384) != 0 ? r4.isHideFloat : false, (r38 & 32768) != 0 ? r4.isHideProgress : true, (r38 & 65536) != 0 ? r4.isNeedClose : false, (r38 & 131072) != 0 ? r4.isShowBaitDescription : false, (r38 & 262144) != 0 ? value.isShowTackleDescription : false);
                    if (mutableStateFlow3.compareAndSet(value, copy)) {
                        break;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                    fishingGsonParseObj = fishingGsonParseObj2;
                }
            } else {
                FishingViewModel fishingViewModel = this.this$0;
                fishingViewModel.closeInterfaceIfNullableJson(fishingViewModel.getStringResource().errorWithCode(3));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
