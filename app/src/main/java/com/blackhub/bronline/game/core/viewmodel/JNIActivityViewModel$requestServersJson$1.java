package com.blackhub.bronline.game.core.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.ts.H263Reader;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.Server;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1", f = "JNIActivityViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$requestServersJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$requestServersJson$1(JNIActivityViewModel jNIActivityViewModel, Continuation<? super JNIActivityViewModel$requestServersJson$1> continuation) {
        super(2, continuation);
        this.this$0 = jNIActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$requestServersJson$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$requestServersJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchData;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JNIActivityViewModel jNIActivityViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jNIActivityViewModel, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            final JNIActivityViewModel jNIActivityViewModel2 = this.this$0;
            Function2<List<? extends Server>, Integer, Unit> function2 = new Function2<List<? extends Server>, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list, Integer num) {
                    invoke((List<Server>) list, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<Server> body, int i2) {
                    MutableLiveData mutableLiveData;
                    Intrinsics.checkNotNullParameter(body, "body");
                    mutableLiveData = JNIActivityViewModel.this._servers;
                    mutableLiveData.postValue(body);
                    JNIActivityViewModel.this.requestJson(i2);
                }
            };
            final JNIActivityViewModel jNIActivityViewModel3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1.4
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
                    JNIActivityViewModel.this.showErrorDialogForRestart();
                }
            };
            this.label = 1;
            fetchData = jNIActivityViewModel.fetchData(anonymousClass1, anonymousClass2, function2, (r24 & 8) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$fetchData$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0, (r24 & 16) != 0 ? 0 : 0, (r24 & 32) != 0 ? 3 : 0, (r24 & 64) != 0 ? 6 : 0, (r24 & 128) != 0 ? 3000L : 0L, this);
            if (fetchData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/blackhub/bronline/launcher/network/Server;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$1", f = "JNIActivityViewModel.kt", i = {}, l = {H263Reader.START_CODE_VALUE_VOP}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Response<List<? extends Server>>>, Object> {
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JNIActivityViewModel jNIActivityViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = jNIActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Response<List<? extends Server>>> continuation) {
            return invoke2((Continuation<? super Response<List<Server>>>) continuation);
        }

        @Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Response<List<Server>>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Api api;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                api = this.this$0.mainResponse;
                this.label = 1;
                obj = api.servers(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/blackhub/bronline/launcher/network/Server;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$2", f = "JNIActivityViewModel.kt", i = {}, l = {MatroskaExtractor.ID_CUE_TRACK_POSITIONS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Response<List<? extends Server>>>, Object> {
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JNIActivityViewModel jNIActivityViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.this$0 = jNIActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Response<List<? extends Server>>> continuation) {
            return invoke2((Continuation<? super Response<List<Server>>>) continuation);
        }

        @Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Response<List<Server>>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Api api;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                api = this.this$0.backupResponse;
                this.label = 1;
                obj = api.servers(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
