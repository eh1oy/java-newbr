package com.blackhub.bronline.game.gui.clicker;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ClickerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$initInterface$1", f = "ClickerViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {82}, m = "invokeSuspend", n = {"myNick", "opponentNick", "textDescription", "bgImageBitmap", "imgClickEffectBitmap", "valueOfPercentPerClick", "currentProgress", "totalTimer", "delayBitOpponentInMilliseconds"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "J$0"})
@SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$initInterface$1\n*L\n84#1:205,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ClickerViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $jsonObject;
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ ClickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerViewModel$initInterface$1(JSONObject jSONObject, ClickerViewModel clickerViewModel, Continuation<? super ClickerViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.this$0 = clickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerViewModel$initInterface$1(this.$jsonObject, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String optString;
        String optString2;
        String optString3;
        long delayForBitOpponent;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        int i;
        int i2;
        ClickerUiState value;
        ClickerUiState copy;
        int i3 = 2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            int optInt = this.$jsonObject.optInt("tm");
            optString = this.$jsonObject.optString("n");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            optString2 = this.$jsonObject.optString("nt");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            optString3 = this.$jsonObject.optString(ClickerKeys.TEXT_DESCRIPTION_KEY);
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            delayForBitOpponent = this.this$0.getDelayForBitOpponent(this.$jsonObject.optDouble(ClickerKeys.OPPONENT_INTENSITY_KEY, 0.1d));
            objectRef = new Ref.ObjectRef();
            objectRef2 = new Ref.ObjectRef();
            ClickerViewModel clickerViewModel = this.this$0;
            Deferred asyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(clickerViewModel, null, new ClickerViewModel$initInterface$1$deferredTasksForImages$1(objectRef, clickerViewModel, null), 1, null);
            ClickerViewModel clickerViewModel2 = this.this$0;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{asyncOnIO$default, ViewModelExtensionKt.asyncOnIO$default(clickerViewModel2, null, new ClickerViewModel$initInterface$1$deferredTasksForImages$2(objectRef2, clickerViewModel2, null), 1, null)});
            this.L$0 = optString;
            this.L$1 = optString2;
            this.L$2 = optString3;
            this.L$3 = objectRef;
            this.L$4 = objectRef2;
            this.I$0 = 2;
            this.I$1 = 50;
            this.I$2 = optInt;
            this.J$0 = delayForBitOpponent;
            this.label = 1;
            if (AwaitKt.awaitAll(listOf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = optInt;
            i2 = 50;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            i = this.I$2;
            i2 = this.I$1;
            int i5 = this.I$0;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$4;
            objectRef = (Ref.ObjectRef) this.L$3;
            optString3 = (String) this.L$2;
            optString2 = (String) this.L$1;
            optString = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            objectRef2 = objectRef3;
            i3 = i5;
            delayForBitOpponent = j;
        }
        MutableStateFlow<? extends ClickerUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            copy = r14.copy((r24 & 1) != 0 ? r14.valueOfPercentPerClick : i3, (r24 & 2) != 0 ? r14.delayBitOpponentInMilliseconds : delayForBitOpponent, (r24 & 4) != 0 ? r14.currentProgress : i2, (r24 & 8) != 0 ? r14.totalTimerInSeconds : i, (r24 & 16) != 0 ? r14.myNick : optString, (r24 & 32) != 0 ? r14.opponentNick : optString2, (r24 & 64) != 0 ? r14.textDescription : optString3, (r24 & 128) != 0 ? r14.bgImageBitmap : (Bitmap) objectRef.element, (r24 & 256) != 0 ? r14.imgClickEffectBitmap : (Bitmap) objectRef2.element, (r24 & 512) != 0 ? value.isNeedToClose : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }
}
