package com.blackhub.bronline.game.gui.donate;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDonate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$1", f = "GUIDonate.kt", i = {}, l = {BlackPassUtils.CAR_AWARD_ID_674}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIDonate$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIDonate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIDonate$setObservers$1(GUIDonate gUIDonate, Continuation<? super GUIDonate$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = gUIDonate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIDonate$setObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIDonate$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel mainActivityViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mainActivityViewModel = this.this$0.getMainActivityViewModel();
            StateFlow<ConfigurationJsonModel> configurationJsons = mainActivityViewModel.getConfigurationJsons();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
            final GUIDonate gUIDonate = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                    BlackPassMainViewModel blackPassMainViewModel;
                    JNIActivityViewModel mainActivityViewModel2;
                    BlackPassPrizeListViewModel blackPassPrizeListViewModel;
                    DonateTileViewModel donateTileViewModel;
                    JSONObject jSONObject;
                    DonateServiceViewModel serviceViewModel;
                    DonateTileViewModel donateTileViewModel2;
                    JSONObject jSONObject2;
                    List<DonateItem> donateItemsFromJson = configurationJsonModel.getDonateItemsFromJson();
                    if (!donateItemsFromJson.isEmpty()) {
                        GUIDonate.this.ifEmptyDonateItemsFromJSON = false;
                        donateTileViewModel = GUIDonate.this.getDonateTileViewModel();
                        jSONObject = GUIDonate.this.jsonObject;
                        donateTileViewModel.initDonateItemsFromJSON(donateItemsFromJson, jSONObject);
                        serviceViewModel = GUIDonate.this.getServiceViewModel();
                        serviceViewModel.initServiceItems(donateItemsFromJson);
                        donateTileViewModel2 = GUIDonate.this.getDonateTileViewModel();
                        jSONObject2 = GUIDonate.this.jsonObject;
                        donateTileViewModel2.initSaleItems(jSONObject2);
                        GUIDonate.this.initDonateInterface();
                    } else {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        donateItemsFromJson.size();
                        firebaseCrashlytics.recordException(new Throwable());
                        GUIDonate gUIDonate2 = GUIDonate.this;
                        String string = gUIDonate2.getString(R.string.donate_error_init_interface);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        gUIDonate2.showErrorMessage(string);
                        GUIDonate.this.closeFragment();
                    }
                    BlackPassItems blackPassItemsFromJson = configurationJsonModel.getBlackPassItemsFromJson();
                    blackPassMainViewModel = GUIDonate.this.getBlackPassMainViewModel();
                    mainActivityViewModel2 = GUIDonate.this.getMainActivityViewModel();
                    blackPassMainViewModel.initDataFromJson(blackPassItemsFromJson, mainActivityViewModel2.getConfigurationJsons().getValue().getCalendarModel().getProperties().getSeasonColor());
                    blackPassPrizeListViewModel = GUIDonate.this.getBlackPassPrizeListViewModel();
                    List<LevelsInfo> standardLevel = blackPassItemsFromJson.getStandardLevel();
                    if (standardLevel == null) {
                        standardLevel = CollectionsKt__CollectionsKt.emptyList();
                    }
                    List<LevelsInfo> premiumLevel = blackPassItemsFromJson.getPremiumLevel();
                    if (premiumLevel == null) {
                        premiumLevel = CollectionsKt__CollectionsKt.emptyList();
                    }
                    blackPassPrizeListViewModel.initPrizeList(standardLevel, premiumLevel);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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
}
