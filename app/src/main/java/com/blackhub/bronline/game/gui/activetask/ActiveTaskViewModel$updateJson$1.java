package com.blackhub.bronline.game.gui.activetask;

import com.blackhub.bronline.game.core.constants.NativeConstants;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ActiveTaskViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$updateJson$1", f = "ActiveTaskViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n230#2,5:142\n230#2,5:147\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$updateJson$1\n*L\n70#1:137,5\n78#1:142,5\n92#1:147,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ActiveTaskViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ ActiveTaskViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveTaskViewModel$updateJson$1(JSONObject jSONObject, ActiveTaskViewModel activeTaskViewModel, Continuation<? super ActiveTaskViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = activeTaskViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ActiveTaskViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ActiveTaskViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ActiveTaskEnum activeTaskEnum;
        ActiveTaskUiState value;
        ActiveTaskUiState copy;
        ActiveTaskUiState value2;
        ActiveTaskUiState copy2;
        ActiveTaskUiState value3;
        ActiveTaskUiState copy3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
        int optInt2 = this.$json.optInt("t");
        int optInt3 = this.$json.optInt("m");
        String optString = this.$json.optString("s");
        if (IntExtensionKt.isNotZero(Boxing.boxInt(optInt))) {
            int optInt4 = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
            if (optInt4 == 1) {
                MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow.getValue();
                    copy2 = r3.copy((r20 & 1) != 0 ? r3.hintNumber : 0, (r20 & 2) != 0 ? r3.hintScreen : null, (r20 & 4) != 0 ? r3.hintTitle : null, (r20 & 8) != 0 ? r3.hintDesc : null, (r20 & 16) != 0 ? r3.btnText : null, (r20 & 32) != 0 ? r3.hintTime : 0, (r20 & 64) != 0 ? r3.isInterfaceVisible : false, (r20 & 128) != 0 ? r3.isNeedClose : false, (r20 & 256) != 0 ? value2.isBlockingLoading : false);
                } while (!mutableStateFlow.compareAndSet(value2, copy2));
            } else if (optInt4 == 9) {
                MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow2.getValue();
                    copy3 = r3.copy((r20 & 1) != 0 ? r3.hintNumber : 0, (r20 & 2) != 0 ? r3.hintScreen : null, (r20 & 4) != 0 ? r3.hintTitle : null, (r20 & 8) != 0 ? r3.hintDesc : null, (r20 & 16) != 0 ? r3.btnText : null, (r20 & 32) != 0 ? r3.hintTime : 0, (r20 & 64) != 0 ? r3.isInterfaceVisible : true, (r20 & 128) != 0 ? r3.isNeedClose : false, (r20 & 256) != 0 ? value3.isBlockingLoading : false);
                } while (!mutableStateFlow2.compareAndSet(value3, copy3));
            }
        } else if (IntExtensionKt.isNotZero(Boxing.boxInt(optInt2))) {
            if (optInt2 == 1) {
                activeTaskEnum = ActiveTaskEnum.ACTIVE_TASK;
            } else if (optInt2 == 2) {
                activeTaskEnum = ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON;
            } else {
                activeTaskEnum = ActiveTaskEnum.NONE;
            }
            MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow3 = this.this$0.get_uiState();
            do {
                value = mutableStateFlow3.getValue();
                Intrinsics.checkNotNull(optString);
                copy = r6.copy((r20 & 1) != 0 ? r6.hintNumber : optInt3, (r20 & 2) != 0 ? r6.hintScreen : activeTaskEnum, (r20 & 4) != 0 ? r6.hintTitle : null, (r20 & 8) != 0 ? r6.hintDesc : optString, (r20 & 16) != 0 ? r6.btnText : null, (r20 & 32) != 0 ? r6.hintTime : 0, (r20 & 64) != 0 ? r6.isInterfaceVisible : false, (r20 & 128) != 0 ? r6.isNeedClose : false, (r20 & 256) != 0 ? value.isBlockingLoading : false);
            } while (!mutableStateFlow3.compareAndSet(value, copy));
        }
        return Unit.INSTANCE;
    }
}
