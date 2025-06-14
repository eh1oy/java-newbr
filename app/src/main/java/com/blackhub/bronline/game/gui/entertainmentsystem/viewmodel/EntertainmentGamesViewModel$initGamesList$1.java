package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: EntertainmentGamesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$initGamesList$1", f = "EntertainmentGamesViewModel.kt", i = {0}, l = {181}, m = "invokeSuspend", n = {"newQueue"}, s = {"L$1"})
/* loaded from: classes3.dex */
public final class EntertainmentGamesViewModel$initGamesList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String[] $allDescriptions;
    public final /* synthetic */ String[] $allTitles;
    public final /* synthetic */ JSONArray $array;
    public final /* synthetic */ List<Integer> $resources;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ EntertainmentGamesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntertainmentGamesViewModel$initGamesList$1(JSONArray jSONArray, String[] strArr, String[] strArr2, List<Integer> list, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super EntertainmentGamesViewModel$initGamesList$1> continuation) {
        super(2, continuation);
        this.$array = jSONArray;
        this.$allTitles = strArr;
        this.$allDescriptions = strArr2;
        this.$resources = list;
        this.this$0 = entertainmentGamesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new EntertainmentGamesViewModel$initGamesList$1(this.$array, this.$allTitles, this.$allDescriptions, this.$resources, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((EntertainmentGamesViewModel$initGamesList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableSharedFlow mutableSharedFlow;
        EntertainmentGamesViewModel entertainmentGamesViewModel;
        List list;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JSONArray jSONArray = this.$array;
            if (jSONArray != null) {
                String[] strArr = this.$allTitles;
                String[] strArr2 = this.$allDescriptions;
                List<Integer> list2 = this.$resources;
                EntertainmentGamesViewModel entertainmentGamesViewModel2 = this.this$0;
                List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArray);
                if (mutableIntList.size() == strArr.length && mutableIntList.size() == strArr2.length && mutableIntList.size() == list2.size()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = mutableIntList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList2.add(new EntertainmentGameData(i2, strArr[i2], list2.get(i2).intValue(), mutableIntList.get(i2).intValue(), 0, strArr2[i2], false, 64, null));
                        arrayList.add(Boxing.boxInt(0));
                    }
                    mutableSharedFlow = entertainmentGamesViewModel2.mutableAllGames;
                    this.L$0 = entertainmentGamesViewModel2;
                    this.L$1 = arrayList;
                    this.label = 1;
                    if (mutableSharedFlow.emit(arrayList2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    entertainmentGamesViewModel = entertainmentGamesViewModel2;
                    list = arrayList;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$1;
        entertainmentGamesViewModel = (EntertainmentGamesViewModel) this.L$0;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow = entertainmentGamesViewModel.mutableQueue;
        mutableStateFlow.setValue(list);
        return Unit.INSTANCE;
    }
}
