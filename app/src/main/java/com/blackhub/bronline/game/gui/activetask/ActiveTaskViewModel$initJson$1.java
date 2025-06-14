package com.blackhub.bronline.game.gui.activetask;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$initJson$1", f = "ActiveTaskViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$initJson$1\n*L\n48#1:137,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ActiveTaskViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ ActiveTaskViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveTaskViewModel$initJson$1(JSONObject jSONObject, ActiveTaskViewModel activeTaskViewModel, Continuation<? super ActiveTaskViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = activeTaskViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ActiveTaskViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ActiveTaskViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ActiveTaskEnum activeTaskEnum;
        ActiveTaskUiState copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt("t");
        int optInt2 = this.$json.optInt("m");
        String optString = this.$json.optString("h");
        String optString2 = this.$json.optString("s");
        int optInt3 = this.$json.optInt("tm", -1);
        String optString3 = this.$json.optString("b");
        if (optInt == 1) {
            activeTaskEnum = ActiveTaskEnum.ACTIVE_TASK;
        } else if (optInt == 2) {
            activeTaskEnum = ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON;
        } else {
            activeTaskEnum = ActiveTaskEnum.NONE;
        }
        MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            ActiveTaskUiState value = mutableStateFlow.getValue();
            Intrinsics.checkNotNull(optString);
            Intrinsics.checkNotNull(optString2);
            Intrinsics.checkNotNull(optString3);
            MutableStateFlow<? extends ActiveTaskUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r4.copy((r20 & 1) != 0 ? r4.hintNumber : optInt2, (r20 & 2) != 0 ? r4.hintScreen : activeTaskEnum, (r20 & 4) != 0 ? r4.hintTitle : optString, (r20 & 8) != 0 ? r4.hintDesc : optString2, (r20 & 16) != 0 ? r4.btnText : optString3, (r20 & 32) != 0 ? r4.hintTime : optInt3, (r20 & 64) != 0 ? r4.isInterfaceVisible : false, (r20 & 128) != 0 ? r4.isNeedClose : false, (r20 & 256) != 0 ? value.isBlockingLoading : false);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
