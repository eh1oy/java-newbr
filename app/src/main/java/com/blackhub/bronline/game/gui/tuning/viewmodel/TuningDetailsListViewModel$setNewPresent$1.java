package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TuningDetailsListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setNewPresent$1", f = "TuningDetailsListViewModel.kt", i = {}, l = {558}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTuningDetailsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TuningDetailsListViewModel.kt\ncom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel$setNewPresent$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,726:1\n37#2,2:727\n*S KotlinDebug\n*F\n+ 1 TuningDetailsListViewModel.kt\ncom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel$setNewPresent$1\n*L\n566#1:727,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel$setNewPresent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ TuningDetailsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuningDetailsListViewModel$setNewPresent$1(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super TuningDetailsListViewModel$setNewPresent$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = tuningDetailsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TuningDetailsListViewModel$setNewPresent$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TuningDetailsListViewModel$setNewPresent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object updateItemStatus;
        MutableStateFlow mutableStateFlow2;
        Object obj2;
        MutableStateFlow mutableStateFlow3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = this.$json;
            if (jSONObject == null) {
                mutableStateFlow = this.this$0.mutableNamePresent;
                mutableStateFlow.setValue(CollectionsKt__CollectionsKt.emptyList());
                return Unit.INSTANCE;
            }
            TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
            this.label = 1;
            updateItemStatus = tuningDetailsListViewModel.updateItemStatus(jSONObject, 1, this);
            if (updateItemStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int optInt = this.$json.optInt("p");
        mutableStateFlow2 = this.this$0.mutableItemsForBox;
        Iterator it = ((List) mutableStateFlow2.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((TuningBoxItemObj) obj2).getId() == optInt) {
                break;
            }
        }
        TuningBoxItemObj tuningBoxItemObj = (TuningBoxItemObj) obj2;
        if (tuningBoxItemObj != null) {
            TuningDetailsListViewModel tuningDetailsListViewModel2 = this.this$0;
            String nextLine = new Scanner(tuningBoxItemObj.getName()).nextLine();
            Intrinsics.checkNotNull(nextLine);
            String[] strArr = (String[]) new Regex(" ").split(nextLine, 0).toArray(new String[0]);
            if (strArr.length >= 2) {
                mutableStateFlow3 = tuningDetailsListViewModel2.mutableNamePresent;
                mutableStateFlow3.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{strArr[0], strArr[1]}));
            }
        }
        return Unit.INSTANCE;
    }
}
