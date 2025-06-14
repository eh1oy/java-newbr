package com.blackhub.bronline.game.gui.minigameshelper;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MiniGamesHelperViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$initJson$1", f = "MiniGamesHelperViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$initJson$1\n*L\n118#1:176,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MiniGamesHelperViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ MiniGamesHelperViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGamesHelperViewModel$initJson$1(JSONObject jSONObject, MiniGamesHelperViewModel miniGamesHelperViewModel, Continuation<? super MiniGamesHelperViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = miniGamesHelperViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MiniGamesHelperViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MiniGamesHelperViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MiniGamesHelperEnum miniGamesHelperEnum;
        MiniGamesHelperUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt("g");
        if (AnyExtensionKt.isNotNull(Boxing.boxInt(optInt))) {
            if (optInt == 0) {
                miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_PRIZE;
            } else if (optInt == 1) {
                miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_UNTIE;
            } else if (optInt == 2) {
                miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_FINGER;
            } else {
                miniGamesHelperEnum = MiniGamesHelperEnum.NONE;
            }
            String optString = this.$json.optString("h");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            int optInt2 = this.$json.optInt("s");
            String optString2 = this.$json.optString("n");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            int optInt3 = this.$json.optInt("r", -1);
            float optDouble = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_X_KEY);
            float optDouble2 = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_Y_KEY);
            float optDouble3 = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_Z_KEY);
            float optDouble4 = (float) this.$json.optDouble("z");
            if (optString2.length() > 0 && !Intrinsics.areEqual(optString2, "null") && optInt3 != -1) {
                GameRender.getInstance().RequestRender(optInt2, 0, optInt3, 0, 0, optDouble, optDouble2, optDouble3, optDouble4, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$initJson$1$$ExternalSyntheticLambda0
                    public /* synthetic */ MiniGamesHelperViewModel$initJson$1$$ExternalSyntheticLambda0() {
                    }

                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i, Bitmap bitmap) {
                        Ref.ObjectRef.this.element = bitmap;
                    }
                });
            }
            String optString3 = this.$json.optString("m");
            int optInt4 = this.$json.optInt(MiniGamesHelperKeys.CURRENT_PROGRESS_BAR_STATUS_KEY);
            int optInt5 = this.$json.optInt(MiniGamesHelperKeys.MAX_VALUE_KEY);
            int i = IntExtensionKt.isNotZero(Boxing.boxInt(optInt5)) ? optInt5 : 100;
            int optInt6 = this.$json.optInt(MiniGamesHelperKeys.MAX_BAR_PROGRESS_KEY);
            int i2 = IntExtensionKt.isNotZero(Boxing.boxInt(optInt6)) ? optInt6 : 100;
            String optString4 = this.$json.optString(MiniGamesHelperKeys.PROGRESS_BAR_TITLE_KEY);
            int optInt7 = this.$json.optInt(MiniGamesHelperKeys.TICK_KEY);
            if (!IntExtensionKt.isNotZero(Boxing.boxInt(optInt7))) {
                optInt7 = 10;
            }
            int i3 = optInt7;
            long optInt8 = this.$json.optInt(MiniGamesHelperKeys.TIMER_KEY);
            if (optInt8 == 0) {
                optInt8 = 50;
            }
            long j = optInt8;
            int nextInt = 2 + Random.INSTANCE.nextInt(5);
            boolean isZero = IntExtensionKt.isZero(Boxing.boxInt(this.$json.optInt("x")));
            MutableStateFlow<? extends MiniGamesHelperUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                MiniGamesHelperUiState value = mutableStateFlow.getValue();
                Intrinsics.checkNotNull(optString);
                Bitmap bitmap = (Bitmap) objectRef.element;
                Intrinsics.checkNotNull(optString3);
                Intrinsics.checkNotNull(optString4);
                MiniGamesHelperEnum miniGamesHelperEnum2 = miniGamesHelperEnum;
                MutableStateFlow<? extends MiniGamesHelperUiState> mutableStateFlow2 = mutableStateFlow;
                Ref.ObjectRef objectRef2 = objectRef;
                copy = r3.copy((r30 & 1) != 0 ? r3.helperType : miniGamesHelperEnum, (r30 & 2) != 0 ? r3.prizeHeader : optString, (r30 & 4) != 0 ? r3.prizeImage : bitmap, (r30 & 8) != 0 ? r3.congratulatoryText : optString3, (r30 & 16) != 0 ? r3.currentProgressBarStatus : optInt4, (r30 & 32) != 0 ? r3.maxValue : i, (r30 & 64) != 0 ? r3.maxProgressBarValue : i2, (r30 & 128) != 0 ? r3.progressBarTitle : optString4, (r30 & 256) != 0 ? r3.tick : i3, (r30 & 512) != 0 ? r3.timer : j, (r30 & 1024) != 0 ? r3.randomNum : nextInt, (r30 & 2048) != 0 ? r3.isNeedToShowClose : isZero, (r30 & 4096) != 0 ? value.isNeedClose : false);
                if (mutableStateFlow2.compareAndSet(value, copy)) {
                    break;
                }
                miniGamesHelperEnum = miniGamesHelperEnum2;
                mutableStateFlow = mutableStateFlow2;
                objectRef = objectRef2;
            }
        }
        return Unit.INSTANCE;
    }
}
