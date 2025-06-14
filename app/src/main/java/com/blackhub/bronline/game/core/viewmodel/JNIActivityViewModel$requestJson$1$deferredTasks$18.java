package com.blackhub.bronline.game.core.viewmodel;

import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse;
import com.blackhub.bronline.launcher.network.Api;
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
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18", f = "JNIActivityViewModel.kt", i = {}, l = {HttpStatus.SC_PRECONDITION_FAILED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$requestJson$1$deferredTasks$18 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $countOfErrors;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$requestJson$1$deferredTasks$18(JNIActivityViewModel jNIActivityViewModel, int i, Continuation<? super JNIActivityViewModel$requestJson$1$deferredTasks$18> continuation) {
        super(2, continuation);
        this.this$0 = jNIActivityViewModel;
        this.$countOfErrors = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$requestJson$1$deferredTasks$18(this.this$0, this.$countOfErrors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$requestJson$1$deferredTasks$18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<TanpinBannerDataResponse, Integer, Unit> function2 = new Function2<TanpinBannerDataResponse, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(TanpinBannerDataResponse tanpinBannerDataResponse, Integer num) {
                    invoke(tanpinBannerDataResponse, num.intValue());
                    return Unit.INSTANCE;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
                    jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.blackhub.bronline.game.core.model.ConfigurationJsonModel.copy$default(com.blackhub.bronline.game.core.model.ConfigurationJsonModel, java.util.List, java.util.List, java.util.List, java.util.List, com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList, com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse, com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse, com.blackhub.bronline.game.gui.craft.model.response.CraftItemsJsonResponse, com.blackhub.bronline.game.gui.craft.model.response.CraftCategoriesResponse, com.blackhub.bronline.game.gui.craft.model.response.CommonFilterCategoriesResponse, com.blackhub.bronline.game.gui.craft.model.response.CommonFilterCategoriesResponse, com.blackhub.bronline.game.gui.craft.model.response.MarketDeliveryFiltersResponse, com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse, com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse, com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceLimitsResponse, com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse, com.blackhub.bronline.game.model.remote.response.cases.CasesResponse, com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse, com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsObjList, com.blackhub.bronline.game.gui.fractions.data.FractionsShopList, com.blackhub.bronline.game.gui.fractions.data.FractionQuestsObj, java.util.List, java.util.List, java.util.List, com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems, com.blackhub.bronline.game.gui.smieditor.data.SmiList, java.util.List, java.util.List, java.util.List, java.util.List, int, java.lang.Object):com.blackhub.bronline.game.core.model.ConfigurationJsonModel
                    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:79)
                    	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
                    Caused by: java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1685)
                    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1660)
                    	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:141)
                    	at jadx.core.dex.instructions.args.SSAVar.use(SSAVar.java:134)
                    	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
                    	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
                    	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
                    	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1122)
                    	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1131)
                    	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:118)
                    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:77)
                    	... 1 more
                    */
                public final void invoke(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse r37, int r38) {
                    /*
                        r36 = this;
                        java.lang.String r0 = "body"
                        r14 = r37
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                        r0 = r36
                        com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel r1 = com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.this
                        kotlinx.coroutines.flow.MutableStateFlow r15 = com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.access$get_configurationJsons$p(r1)
                    Lf:
                        java.lang.Object r13 = r15.getValue()
                        r1 = r13
                        com.blackhub.bronline.game.core.model.ConfigurationJsonModel r1 = (com.blackhub.bronline.game.core.model.ConfigurationJsonModel) r1
                        r32 = 1073737727(0x3fffefff, float:1.9995116)
                        r33 = 0
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r16 = 0
                        r34 = r13
                        r13 = r16
                        r35 = r15
                        r15 = r16
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r28 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r14 = r37
                        com.blackhub.bronline.game.core.model.ConfigurationJsonModel r1 = com.blackhub.bronline.game.core.model.ConfigurationJsonModel.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                        r3 = r34
                        r2 = r35
                        boolean r1 = r2.compareAndSet(r3, r1)
                        if (r1 == 0) goto L5f
                        return
                    L5f:
                        r14 = r37
                        r15 = r2
                        goto Lf
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18.AnonymousClass3.invoke(com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse, int):void");
                }
            };
            final JNIActivityViewModel jNIActivityViewModel3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18.4
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
            int i2 = this.$countOfErrors;
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
            } : function0, (r24 & 16) != 0 ? 0 : i2, (r24 & 32) != 0 ? 3 : 0, (r24 & 64) != 0 ? 6 : 0, (r24 & 128) != 0 ? 3000L : 0L, this);
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
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18$1", f = "JNIActivityViewModel.kt", i = {}, l = {HttpStatus.SC_REQUEST_TOO_LONG}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Response<TanpinBannerDataResponse>>, Object> {
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
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response<TanpinBannerDataResponse>> continuation) {
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
                obj = api.getTanpinBannerData(this);
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
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18$2", f = "JNIActivityViewModel.kt", i = {}, l = {HttpStatus.SC_REQUEST_URI_TOO_LONG}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$18$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Response<TanpinBannerDataResponse>>, Object> {
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
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response<TanpinBannerDataResponse>> continuation) {
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
                obj = api.getTanpinBannerData(this);
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
