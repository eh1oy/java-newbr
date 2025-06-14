package com.blackhub.bronline.game.gui.panelinfo;

import android.app.Application;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoContentModel;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: PanelInfoViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel$initJson$1", f = "PanelInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPanelInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$initJson$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,58:1\n8#2,9:59\n1179#3,2:68\n1253#3,4:70\n230#4,5:74\n*S KotlinDebug\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$initJson$1\n*L\n29#1:59,9\n31#1:68,2\n31#1:70,4\n40#1:74,5\n*E\n"})
/* loaded from: classes3.dex */
public final class PanelInfoViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ PanelInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelInfoViewModel$initJson$1(JSONObject jSONObject, PanelInfoViewModel panelInfoViewModel, Continuation<? super PanelInfoViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = panelInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PanelInfoViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PanelInfoViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        PanelInfoUiState value;
        List<PanelInfoContentModel> allHints;
        Application application;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        JSONObject jSONObject = this.$json;
        Map map = null;
        try {
            Gson gson = new Gson();
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) PanelInfoModel.class);
        } catch (Exception e) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log(e.toString());
            firebaseCrashlytics.recordException(e);
            obj2 = null;
        }
        PanelInfoModel panelInfoModel = (PanelInfoModel) obj2;
        if (panelInfoModel != null && (allHints = panelInfoModel.getAllHints()) != null) {
            List<PanelInfoContentModel> list = allHints;
            PanelInfoViewModel panelInfoViewModel = this.this$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
            for (PanelInfoContentModel panelInfoContentModel : list) {
                String imageName = panelInfoContentModel.getImageName();
                application = panelInfoViewModel.application;
                Pair pair = TuplesKt.to(imageName, BitmapUtilsKt.getBitmapFromZip$default(application, panelInfoContentModel.getImageName(), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        if (panelInfoModel != null) {
            MutableStateFlow<? extends PanelInfoUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PanelInfoUiState.copy$default(value, map, panelInfoModel, false, 4, null)));
        }
        return Unit.INSTANCE;
    }
}
