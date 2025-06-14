package com.blackhub.bronline.game.core.viewmodel;

import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1", f = "JNIActivityViewModel.kt", i = {0}, l = {567, 568}, m = "invokeSuspend", n = {"deferredTasks"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$requestJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $countOfErrors;
    public Object L$0;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$requestJson$1(JNIActivityViewModel jNIActivityViewModel, int i, Continuation<? super JNIActivityViewModel$requestJson$1> continuation) {
        super(2, continuation);
        this.this$0 = jNIActivityViewModel;
        this.$countOfErrors = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$requestJson$1(this.this$0, this.$countOfErrors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$requestJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        List list;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            JNIActivityViewModel jNIActivityViewModel = this.this$0;
            Deferred asyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel, null, new JNIActivityViewModel$requestJson$1$deferredTasks$1(jNIActivityViewModel, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel2 = this.this$0;
            Deferred asyncOnIO$default2 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel2, null, new JNIActivityViewModel$requestJson$1$deferredTasks$2(jNIActivityViewModel2, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel3 = this.this$0;
            Deferred asyncOnIO$default3 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel3, null, new JNIActivityViewModel$requestJson$1$deferredTasks$3(jNIActivityViewModel3, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel4 = this.this$0;
            Deferred asyncOnIO$default4 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel4, null, new JNIActivityViewModel$requestJson$1$deferredTasks$4(jNIActivityViewModel4, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel5 = this.this$0;
            Deferred asyncOnIO$default5 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel5, null, new JNIActivityViewModel$requestJson$1$deferredTasks$5(jNIActivityViewModel5, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel6 = this.this$0;
            Deferred asyncOnIO$default6 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel6, null, new JNIActivityViewModel$requestJson$1$deferredTasks$6(jNIActivityViewModel6, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel7 = this.this$0;
            Deferred asyncOnIO$default7 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel7, null, new JNIActivityViewModel$requestJson$1$deferredTasks$7(jNIActivityViewModel7, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel8 = this.this$0;
            Deferred asyncOnIO$default8 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel8, null, new JNIActivityViewModel$requestJson$1$deferredTasks$8(jNIActivityViewModel8, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel9 = this.this$0;
            Deferred asyncOnIO$default9 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel9, null, new JNIActivityViewModel$requestJson$1$deferredTasks$9(jNIActivityViewModel9, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel10 = this.this$0;
            Deferred asyncOnIO$default10 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel10, null, new JNIActivityViewModel$requestJson$1$deferredTasks$10(jNIActivityViewModel10, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel11 = this.this$0;
            Deferred asyncOnIO$default11 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel11, null, new JNIActivityViewModel$requestJson$1$deferredTasks$11(jNIActivityViewModel11, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel12 = this.this$0;
            Deferred asyncOnIO$default12 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel12, null, new JNIActivityViewModel$requestJson$1$deferredTasks$12(jNIActivityViewModel12, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel13 = this.this$0;
            Deferred asyncOnIO$default13 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel13, null, new JNIActivityViewModel$requestJson$1$deferredTasks$13(jNIActivityViewModel13, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel14 = this.this$0;
            Deferred asyncOnIO$default14 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel14, null, new JNIActivityViewModel$requestJson$1$deferredTasks$14(jNIActivityViewModel14, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel15 = this.this$0;
            Deferred asyncOnIO$default15 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel15, null, new JNIActivityViewModel$requestJson$1$deferredTasks$15(jNIActivityViewModel15, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel16 = this.this$0;
            Deferred asyncOnIO$default16 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel16, null, new JNIActivityViewModel$requestJson$1$deferredTasks$16(jNIActivityViewModel16, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel17 = this.this$0;
            Deferred asyncOnIO$default17 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel17, null, new JNIActivityViewModel$requestJson$1$deferredTasks$17(jNIActivityViewModel17, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel18 = this.this$0;
            Deferred asyncOnIO$default18 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel18, null, new JNIActivityViewModel$requestJson$1$deferredTasks$18(jNIActivityViewModel18, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel19 = this.this$0;
            Deferred asyncOnIO$default19 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel19, null, new JNIActivityViewModel$requestJson$1$deferredTasks$19(jNIActivityViewModel19, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel20 = this.this$0;
            Deferred asyncOnIO$default20 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel20, null, new JNIActivityViewModel$requestJson$1$deferredTasks$20(jNIActivityViewModel20, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel21 = this.this$0;
            Deferred asyncOnIO$default21 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel21, null, new JNIActivityViewModel$requestJson$1$deferredTasks$21(jNIActivityViewModel21, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel22 = this.this$0;
            Deferred asyncOnIO$default22 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel22, null, new JNIActivityViewModel$requestJson$1$deferredTasks$22(jNIActivityViewModel22, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel23 = this.this$0;
            Deferred asyncOnIO$default23 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel23, null, new JNIActivityViewModel$requestJson$1$deferredTasks$23(jNIActivityViewModel23, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel24 = this.this$0;
            Deferred asyncOnIO$default24 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel24, null, new JNIActivityViewModel$requestJson$1$deferredTasks$24(jNIActivityViewModel24, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel25 = this.this$0;
            Deferred asyncOnIO$default25 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel25, null, new JNIActivityViewModel$requestJson$1$deferredTasks$25(jNIActivityViewModel25, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel26 = this.this$0;
            Deferred asyncOnIO$default26 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel26, null, new JNIActivityViewModel$requestJson$1$deferredTasks$26(jNIActivityViewModel26, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel27 = this.this$0;
            Deferred asyncOnIO$default27 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel27, null, new JNIActivityViewModel$requestJson$1$deferredTasks$27(jNIActivityViewModel27, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel28 = this.this$0;
            Deferred asyncOnIO$default28 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel28, null, new JNIActivityViewModel$requestJson$1$deferredTasks$28(jNIActivityViewModel28, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel29 = this.this$0;
            Deferred asyncOnIO$default29 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel29, null, new JNIActivityViewModel$requestJson$1$deferredTasks$29(jNIActivityViewModel29, this.$countOfErrors, null), 1, null);
            JNIActivityViewModel jNIActivityViewModel30 = this.this$0;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{asyncOnIO$default, asyncOnIO$default2, asyncOnIO$default3, asyncOnIO$default4, asyncOnIO$default5, asyncOnIO$default6, asyncOnIO$default7, asyncOnIO$default8, asyncOnIO$default9, asyncOnIO$default10, asyncOnIO$default11, asyncOnIO$default12, asyncOnIO$default13, asyncOnIO$default14, asyncOnIO$default15, asyncOnIO$default16, asyncOnIO$default17, asyncOnIO$default18, asyncOnIO$default19, asyncOnIO$default20, asyncOnIO$default21, asyncOnIO$default22, asyncOnIO$default23, asyncOnIO$default24, asyncOnIO$default25, asyncOnIO$default26, asyncOnIO$default27, asyncOnIO$default28, asyncOnIO$default29, ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel30, null, new JNIActivityViewModel$requestJson$1$deferredTasks$30(jNIActivityViewModel30, this.$countOfErrors, null), 1, null)});
            MutableStateFlow mutableStateFlow = this.this$0._totalSizeOfRequests;
            i = 2;
            Integer boxInt = Boxing.boxInt(listOf.size() + 2);
            this.L$0 = listOf;
            this.label = 1;
            Object emit = mutableStateFlow.emit(boxInt, this);
            coroutine_suspended = coroutine_suspended;
            if (emit == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = listOf;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = 2;
        }
        this.L$0 = null;
        this.label = i;
        if (AwaitKt.awaitAll(list, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
