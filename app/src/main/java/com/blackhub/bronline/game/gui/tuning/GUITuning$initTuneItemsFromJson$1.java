package com.blackhub.bronline.game.gui.tuning;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiScreenObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUITuning.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.GUITuning$initTuneItemsFromJson$1", f = "GUITuning.kt", i = {}, l = {565}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUITuning$initTuneItemsFromJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUITuning this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUITuning$initTuneItemsFromJson$1(GUITuning gUITuning, Continuation<? super GUITuning$initTuneItemsFromJson$1> continuation) {
        super(2, continuation);
        this.this$0 = gUITuning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUITuning$initTuneItemsFromJson$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUITuning$initTuneItemsFromJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final GUITuning gUITuning = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.GUITuning$initTuneItemsFromJson$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                    TuningMainViewModel tuningViewModel;
                    TuningMainViewModel tuningViewModel2;
                    TuningMainViewModel tuningViewModel3;
                    TuningDetailsListViewModel detailsListViewModel;
                    int i2;
                    TuningDetailsListViewModel detailsListViewModel2;
                    List<TuneObj> tuneObjItemsFromJson = configurationJsonModel.getTuneObjItemsFromJson();
                    if (!tuneObjItemsFromJson.isEmpty()) {
                        GUITuning.this.initInterface();
                        detailsListViewModel2 = GUITuning.this.getDetailsListViewModel();
                        detailsListViewModel2.initTuneItemsFromJson(tuneObjItemsFromJson);
                    } else {
                        tuningViewModel = GUITuning.this.getTuningViewModel();
                        String string = GUITuning.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        tuningViewModel.showErrorNotification(string);
                        GUITuning.this.closeFragment();
                    }
                    List<TuneGuiScreenObj> tuneGuiScreensFromJsonObj = configurationJsonModel.getTuneGuiScreensFromJsonObj();
                    if (!(!tuneGuiScreensFromJsonObj.isEmpty())) {
                        tuningViewModel2 = GUITuning.this.getTuningViewModel();
                        String string2 = GUITuning.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        tuningViewModel2.showErrorNotification(string2);
                        GUITuning.this.closeFragment();
                    } else {
                        TuningConstants tuningConstants = TuningConstants.INSTANCE;
                        i2 = GUITuning.this.screenType;
                        tuningConstants.setCurrentActiveScreen(tuneGuiScreensFromJsonObj.get(i2));
                        GUITuning.this.initInterface();
                    }
                    List<TuneVinylsObj> tuneVinylsObjFromJson = configurationJsonModel.getTuneVinylsObjFromJson();
                    if (!tuneVinylsObjFromJson.isEmpty()) {
                        detailsListViewModel = GUITuning.this.getDetailsListViewModel();
                        detailsListViewModel.initVinyls(tuneVinylsObjFromJson);
                        GUITuning.this.initInterface();
                    } else {
                        tuningViewModel3 = GUITuning.this.getTuningViewModel();
                        String string3 = GUITuning.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        tuningViewModel3.showErrorNotification(string3);
                        GUITuning.this.closeFragment();
                    }
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
