package com.blackhub.bronline.launcher.viewmodel;

import com.blackhub.bronline.game.model.local.AppConfigModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: MainActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1", f = "MainActivityViewModel.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MainActivityViewModel$checkAppVersion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$checkAppVersion$1(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$checkAppVersion$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainActivityViewModel$checkAppVersion$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainActivityViewModel$checkAppVersion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<AppConfigModel> appConfig = this.this$0.launcherRepository.getAppConfig();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (appConfig.collect(anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
    /* compiled from: MainActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Lcom/blackhub/bronline/game/model/local/AppConfigModel;", "emit", "(Lcom/blackhub/bronline/game/model/local/AppConfigModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ MainActivityViewModel this$0;

        public AnonymousClass2(MainActivityViewModel mainActivityViewModel) {
            this.this$0 = mainActivityViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.Nullable com.blackhub.bronline.game.model.local.AppConfigModel r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2$emit$1 r0 = (com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2$emit$1 r0 = new com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r6 = r0.L$0
                androidx.lifecycle.MutableLiveData r6 = (androidx.lifecycle.MutableLiveData) r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4e
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L35:
                kotlin.ResultKt.throwOnFailure(r7)
                if (r6 == 0) goto L51
                com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel r6 = r5.this$0
                androidx.lifecycle.MutableLiveData r7 = com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel.access$get_isActualVersion$p(r6)
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel.access$isLauncherVersionActual(r6, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                r4 = r7
                r7 = r6
                r6 = r4
            L4e:
                r6.postValue(r7)
            L51:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1.AnonymousClass2.emit(com.blackhub.bronline.game.model.local.AppConfigModel, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((AppConfigModel) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
