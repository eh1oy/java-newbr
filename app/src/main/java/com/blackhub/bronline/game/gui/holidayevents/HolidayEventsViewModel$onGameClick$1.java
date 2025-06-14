package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onGameClick$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onGameClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onGameClick$1\n*L\n1010#1:1303\n1010#1:1304,3\n1021#1:1307,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$onGameClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ HolidayEventsGameItemModel $gameItem;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$onGameClick$1(HolidayEventsViewModel holidayEventsViewModel, HolidayEventsGameItemModel holidayEventsGameItemModel, Continuation<? super HolidayEventsViewModel$onGameClick$1> continuation) {
        super(2, continuation);
        this.this$0 = holidayEventsViewModel;
        this.$gameItem = holidayEventsGameItemModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$onGameClick$1(this.this$0, this.$gameItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$onGameClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<HolidayEventsGameItemModel> listOfGames = this.this$0.getUiState().getValue().getListOfGames();
        HolidayEventsGameItemModel holidayEventsGameItemModel = this.$gameItem;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfGames, 10));
        for (HolidayEventsGameItemModel holidayEventsGameItemModel2 : listOfGames) {
            arrayList.add(HolidayEventsGameItemModel.copy$default(holidayEventsGameItemModel2, 0, holidayEventsGameItemModel2.getId() == holidayEventsGameItemModel.getId(), false, null, null, 29, null));
        }
        int i = this.$gameItem.isPlayable() ? R.string.common_play : R.string.common_track;
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            HolidayEventsUiState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, arrayList, null, null, i, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -4609, 1073741823, null))) {
                return Unit.INSTANCE;
            }
            arrayList = arrayList2;
        }
    }
}
