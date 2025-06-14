package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: SmiEditorViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00100\u001a\u000201J\u001e\u00102\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u00104\u001a\u00020\u001bH\u0002J\u0006\u00105\u001a\u000201J\u0006\u00106\u001a\u000201J\u0014\u00107\u001a\u0002012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020\fJ\u0016\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u0002012\u0006\u0010<\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010=J\u001c\u0010?\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020\u001bH\u0002J \u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010\u00102\u0006\u0010F\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u0002012\u0006\u0010:\u001a\u00020\u0010J\u000e\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\u001bJ\u000e\u0010K\u001a\u0002012\u0006\u0010L\u001a\u00020\nJ\u0010\u0010M\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010OJ\u000e\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020\u0010J\u000e\u0010R\u001a\u0002012\u0006\u0010F\u001a\u00020\u001bJ\u000e\u0010S\u001a\u0002012\u0006\u0010L\u001a\u00020\u0012J\u000e\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020\u0010J\u0018\u0010V\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010\u00102\u0006\u0010F\u001a\u00020\u001bJ\u000e\u0010W\u001a\u0002012\u0006\u0010N\u001a\u00020OR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0'¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)¨\u0006X"}, d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/viewmodel/SmiEditorViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/smieditor/network/SmiEditorActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/smieditor/network/SmiEditorActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "mutableBodyFromJSON", "", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "mutableCarsAndAccessories", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "mutableFinalText", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "", "mutableFourthColumn", "", "mutableObjForNavigation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableSecondColumn", "mutableStartText", "mutableThirdColumn", "mutableTitleSecondColumn", "mutableTitleThirdColumn", "mutableValueOfQueue", "", "newFinalText", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewFinalText", "()Lkotlinx/coroutines/flow/SharedFlow;", "newFourthColumn", "getNewFourthColumn", "newSecondColumn", "getNewSecondColumn", "newThirdColumn", "getNewThirdColumn", "startText", "Lkotlinx/coroutines/flow/StateFlow;", "getStartText", "()Lkotlinx/coroutines/flow/StateFlow;", "titleSecondColumn", "getTitleSecondColumn", "titleThirdColumn", "getTitleThirdColumn", "valueOfQueue", "getValueOfQueue", "backFromFourthToThirdColumnForTitleOfColumn", "", "changeSizeOfCollection", "currentCollection", "currentSize", "clearTitleForSecondAndThirdColumn", "clearTitleForThirdColumn", "initBody", "bodyFromJSON", "initCarsAndAccessories", "data", "initTitleForSecondColumn", "currentTitle", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTitleForThirdColumn", "lEmitFinalText", "currentList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lSetValueOfQueue", "newValue", "lUpdateFinalText", "newValueOfText", "currentPos", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putDataToServer", "putInfoForClickCancelOrNextOrDismiss", "valueOfKey", "setFourthColumn", "currentObj", "setInitData", "jsonObject", "Lorg/json/JSONObject;", "setNewStartText", "currentText", "setSecondColumn", "setThirdColumn", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "updateFinalText", "updateValueOfQueue", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmiEditorViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final SmiEditorActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public List<SmiEditorBodyObj> mutableBodyFromJSON;

    @Nullable
    public SmiList mutableCarsAndAccessories;

    @NotNull
    public final MutableSharedFlow<List<String>> mutableFinalText;

    @NotNull
    public final MutableSharedFlow<List<Object>> mutableFourthColumn;

    @NotNull
    public final MutableStateFlow<List<SmiEditorBodyObj>> mutableObjForNavigation;

    @NotNull
    public final MutableSharedFlow<List<SmiEditorBodyObj>> mutableSecondColumn;

    @NotNull
    public final MutableStateFlow<String> mutableStartText;

    @NotNull
    public final MutableSharedFlow<List<Object>> mutableThirdColumn;

    @NotNull
    public final MutableSharedFlow<String> mutableTitleSecondColumn;

    @NotNull
    public final MutableSharedFlow<String> mutableTitleThirdColumn;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfQueue;

    @NotNull
    public final SharedFlow<List<String>> newFinalText;

    @NotNull
    public final SharedFlow<List<Object>> newFourthColumn;

    @NotNull
    public final SharedFlow<List<SmiEditorBodyObj>> newSecondColumn;

    @NotNull
    public final SharedFlow<List<Object>> newThirdColumn;

    @NotNull
    public final StateFlow<String> startText;

    @NotNull
    public final SharedFlow<String> titleSecondColumn;

    @NotNull
    public final SharedFlow<String> titleThirdColumn;

    @NotNull
    public final StateFlow<Integer> valueOfQueue;

    @Inject
    public SmiEditorViewModel(@NotNull SmiEditorActionWithJSON actionWithJSON, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.localNotification = localNotification;
        this.mutableBodyFromJSON = CollectionsKt__CollectionsKt.emptyList();
        MutableSharedFlow<List<String>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFinalText = MutableSharedFlow$default;
        this.newFinalText = MutableSharedFlow$default;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfQueue = MutableStateFlow;
        this.valueOfQueue = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.mutableStartText = MutableStateFlow2;
        this.startText = MutableStateFlow2;
        MutableSharedFlow<List<SmiEditorBodyObj>> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableSecondColumn = MutableSharedFlow$default2;
        this.newSecondColumn = MutableSharedFlow$default2;
        MutableSharedFlow<String> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableTitleSecondColumn = MutableSharedFlow$default3;
        this.titleSecondColumn = MutableSharedFlow$default3;
        MutableSharedFlow<List<Object>> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableThirdColumn = MutableSharedFlow$default4;
        this.newThirdColumn = MutableSharedFlow$default4;
        MutableSharedFlow<String> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableTitleThirdColumn = MutableSharedFlow$default5;
        this.titleThirdColumn = MutableSharedFlow$default5;
        this.mutableObjForNavigation = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<List<Object>> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFourthColumn = MutableSharedFlow$default6;
        this.newFourthColumn = MutableSharedFlow$default6;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new AnonymousClass1(null), 2, null);
    }

    @NotNull
    public final SharedFlow<List<String>> getNewFinalText() {
        return this.newFinalText;
    }

    @NotNull
    public final StateFlow<Integer> getValueOfQueue() {
        return this.valueOfQueue;
    }

    @NotNull
    public final StateFlow<String> getStartText() {
        return this.startText;
    }

    @NotNull
    public final SharedFlow<List<SmiEditorBodyObj>> getNewSecondColumn() {
        return this.newSecondColumn;
    }

    @NotNull
    public final SharedFlow<String> getTitleSecondColumn() {
        return this.titleSecondColumn;
    }

    @NotNull
    public final SharedFlow<List<Object>> getNewThirdColumn() {
        return this.newThirdColumn;
    }

    @NotNull
    public final SharedFlow<String> getTitleThirdColumn() {
        return this.titleThirdColumn;
    }

    @NotNull
    public final SharedFlow<List<Object>> getNewFourthColumn() {
        return this.newFourthColumn;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$1", f = "SmiEditorViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                    ArrayList arrayList = new ArrayList();
                    this.label = 1;
                    if (smiEditorViewModel.lEmitFinalText(arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object lEmitFinalText(List<String> list, Continuation<? super Unit> continuation) {
        Object emit = this.mutableFinalText.emit(list, continuation);
        return emit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final void initBody(@NotNull List<SmiEditorBodyObj> bodyFromJSON) {
        Intrinsics.checkNotNullParameter(bodyFromJSON, "bodyFromJSON");
        this.mutableBodyFromJSON = bodyFromJSON;
    }

    public final void initCarsAndAccessories(@NotNull SmiList data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mutableCarsAndAccessories = data;
    }

    public final void setInitData(@Nullable JSONObject jsonObject) {
        if (jsonObject != null) {
            lSetValueOfQueue(jsonObject.optInt("a"));
            MutableStateFlow<String> mutableStateFlow = this.mutableStartText;
            String optString = jsonObject.optString("d");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            mutableStateFlow.setValue(optString);
        }
    }

    public final void setNewStartText(@NotNull String currentText) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        this.mutableStartText.setValue(currentText);
    }

    public final void lSetValueOfQueue(int newValue) {
        this.mutableValueOfQueue.setValue(Integer.valueOf(newValue));
    }

    public final void setSecondColumn(int currentPos) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$setSecondColumn$1(currentPos, this, null), 2, null);
    }

    public final Object initTitleForSecondColumn(String str, Continuation<? super Unit> continuation) {
        Object emit = this.mutableTitleSecondColumn.emit(str, continuation);
        return emit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final void setThirdColumn(@NotNull Object currentObj) {
        Intrinsics.checkNotNullParameter(currentObj, "currentObj");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$setThirdColumn$1(currentObj, this, null), 2, null);
    }

    public final Object initTitleForThirdColumn(String str, Continuation<? super Unit> continuation) {
        Object emit = this.mutableTitleThirdColumn.emit(str, continuation);
        return emit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final void setFourthColumn(@NotNull SmiEditorBodyObj currentObj) {
        Intrinsics.checkNotNullParameter(currentObj, "currentObj");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$setFourthColumn$1(currentObj, this, null), 2, null);
    }

    public final void updateFinalText(@Nullable String newValueOfText, int currentPos) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$updateFinalText$1(this, newValueOfText, currentPos, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object lUpdateFinalText(java.lang.String r6, int r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1
            if (r0 == 0) goto L13
            r0 = r8
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1 r0 = (com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1 r0 = new com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r7 = r0.I$0
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.L$0
            com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel r2 = (com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L57
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.String>> r8 = r5.mutableFinalText
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.util.List r8 = (java.util.List) r8
            r2.changeSizeOfCollection(r8, r7)
            if (r6 == 0) goto L61
            r8.add(r6)
        L61:
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r2.lEmitFinalText(r8, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel.lUpdateFinalText(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void changeSizeOfCollection(List<String> currentCollection, int currentSize) {
        while (currentCollection.size() > currentSize) {
            CollectionsKt__MutableCollectionsKt.removeLast(currentCollection);
        }
    }

    public final void backFromFourthToThirdColumnForTitleOfColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1(this, null), 2, null);
    }

    public final void clearTitleForSecondAndThirdColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1(this, null), 2, null);
    }

    public final void clearTitleForThirdColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$clearTitleForThirdColumn$1(this, null), 2, null);
    }

    public final void updateValueOfQueue(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SmiEditorViewModel$updateValueOfQueue$1(this, jsonObject, null), 2, null);
    }

    public final void putInfoForClickCancelOrNextOrDismiss(int valueOfKey) {
        this.actionWithJSON.putInfoForClickCancelOrNextOrDismiss(valueOfKey);
    }

    public final void putDataToServer(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.actionWithJSON.putDataToServer(data);
    }

    public final void showErrorNotification(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }
}
