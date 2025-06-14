package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.ElectricUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricKeys;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ElectricViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel$initJson$1", f = "ElectricViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nElectricViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,96:1\n51#2,5:97\n56#2,11:111\n8#3,9:102\n230#4,5:122\n*S KotlinDebug\n*F\n+ 1 ElectricViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel$initJson$1\n*L\n44#1:97,5\n44#1:111,11\n44#1:102,9\n46#1:122,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ElectricViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ ElectricViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricViewModel$initJson$1(JSONObject jSONObject, ElectricViewModel electricViewModel, Continuation<? super ElectricViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = electricViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ElectricViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ElectricViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        ElectricUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt(ElectricKeys.ELECTRIC_MINI_GAME_KEY, 0);
        JSONArray optJSONArray = this.$json.optJSONArray(ElectricKeys.ELECTRIC_HINT_INSTRUCTION_KEY);
        List list = null;
        if (optJSONArray != null) {
            try {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNull(jSONObject);
                    try {
                        Gson gson = new Gson();
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                        obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) ElectricInstructionsAndHintsModel.class);
                    } catch (Exception e) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics.log(e.toString());
                        firebaseCrashlytics.recordException(e);
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Boxing.boxBoolean(arrayList.add(obj2));
                    }
                }
                list = arrayList;
            } catch (Exception e2) {
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics2.log(e2.toString());
                firebaseCrashlytics2.recordException(e2);
            }
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = list;
        MutableStateFlow<? extends ElectricUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ElectricUiState.copy$default(value, optInt, list2, 0, 0, false, false, 28, null)));
        return Unit.INSTANCE;
    }
}
