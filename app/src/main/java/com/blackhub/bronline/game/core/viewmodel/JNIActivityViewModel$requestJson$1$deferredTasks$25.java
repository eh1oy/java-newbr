package com.blackhub.bronline.game.core.viewmodel;

import androidx.media3.common.C;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.gui.craft.model.response.MarketDeliveryFiltersResponse;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: JNIActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25", f = "JNIActivityViewModel.kt", i = {}, l = {501}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel$requestJson$1$deferredTasks$25 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $countOfErrors;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$requestJson$1$deferredTasks$25(JNIActivityViewModel jNIActivityViewModel, int i, Continuation<? super JNIActivityViewModel$requestJson$1$deferredTasks$25> continuation) {
        super(2, continuation);
        this.this$0 = jNIActivityViewModel;
        this.$countOfErrors = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$requestJson$1$deferredTasks$25(this.this$0, this.$countOfErrors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$requestJson$1$deferredTasks$25) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<MarketDeliveryFiltersResponse, Integer, Unit> function2 = new Function2<MarketDeliveryFiltersResponse, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(MarketDeliveryFiltersResponse marketDeliveryFiltersResponse, Integer num) {
                    invoke(marketDeliveryFiltersResponse, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull MarketDeliveryFiltersResponse body, int i2) {
                    MutableStateFlow mutableStateFlow;
                    ConfigurationJsonModel copy;
                    Intrinsics.checkNotNullParameter(body, "body");
                    mutableStateFlow = JNIActivityViewModel.this._configurationJsons;
                    while (true) {
                        Object value = mutableStateFlow.getValue();
                        MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                        copy = r1.copy((r48 & 1) != 0 ? r1.invItemsFromJson : null, (r48 & 2) != 0 ? r1.skinsFromJson : null, (r48 & 4) != 0 ? r1.vehiclesFromJson : null, (r48 & 8) != 0 ? r1.socialInteractionsFromJson : null, (r48 & 16) != 0 ? r1.familySystemListFromJson : null, (r48 & 32) != 0 ? r1.calendarModel : null, (r48 & 64) != 0 ? r1.bpRewardsModel : null, (r48 & 128) != 0 ? r1.craftItemsModel : null, (r48 & 256) != 0 ? r1.craftCategoriesModel : null, (r48 & 512) != 0 ? r1.craftCategoriesFilterModel : null, (r48 & 1024) != 0 ? r1.marketplaceCategoriesFilterModel : null, (r48 & 2048) != 0 ? r1.marketplaceDeliveryFilterModel : body, (r48 & 4096) != 0 ? r1.tanpinBannerModel : null, (r48 & 8192) != 0 ? r1.videoPlayerModel : null, (r48 & 16384) != 0 ? r1.marketplaceConfigurationViewModel : null, (r48 & 32768) != 0 ? r1.holidayEvents : null, (r48 & 65536) != 0 ? r1.casesModel : null, (r48 & 131072) != 0 ? r1.buttonConfig : null, (r48 & 262144) != 0 ? r1.fractionDocuments : null, (r48 & 524288) != 0 ? r1.fractionShopList : null, (r48 & 1048576) != 0 ? r1.fractionQuestsObj : null, (r48 & 2097152) != 0 ? r1.productDetailsState : null, (r48 & 4194304) != 0 ? r1.donateItemsFromJson : null, (r48 & 8388608) != 0 ? r1.carColorItems : null, (r48 & 16777216) != 0 ? r1.blackPassItemsFromJson : null, (r48 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? r1.smiListFromJson : null, (r48 & 67108864) != 0 ? r1.smiEditorBodyFromJson : null, (r48 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.tuneObjItemsFromJson : null, (r48 & 268435456) != 0 ? r1.tuneGuiScreensFromJsonObj : null, (r48 & 536870912) != 0 ? ((ConfigurationJsonModel) value).tuneVinylsObjFromJson : null);
                        if (mutableStateFlow2.compareAndSet(value, copy)) {
                            return;
                        } else {
                            mutableStateFlow = mutableStateFlow2;
                        }
                    }
                }
            };
            final JNIActivityViewModel jNIActivityViewModel3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25.4
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
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25$1", f = "JNIActivityViewModel.kt", i = {}, l = {502}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Response<MarketDeliveryFiltersResponse>>, Object> {
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
        public final Object invoke(@Nullable Continuation<? super Response<MarketDeliveryFiltersResponse>> continuation) {
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
                obj = api.getMarketplaceDeliveryFilters(this);
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
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25$2", f = "JNIActivityViewModel.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$25$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Response<MarketDeliveryFiltersResponse>>, Object> {
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
        public final Object invoke(@Nullable Continuation<? super Response<MarketDeliveryFiltersResponse>> continuation) {
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
                obj = api.getMarketplaceDeliveryFilters(this);
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
