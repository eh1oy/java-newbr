package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
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

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: HolidayEventsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTaskClick$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTaskClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTaskClick$1\n*L\n1050#1:1303\n1050#1:1304,3\n1055#1:1307,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$onTaskClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CommonTaskModel $task;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$onTaskClick$1(CommonTaskModel commonTaskModel, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super HolidayEventsViewModel$onTaskClick$1> continuation) {
        super(2, continuation);
        this.$task = commonTaskModel;
        this.this$0 = holidayEventsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$onTaskClick$1(this.$task, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$onTaskClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HolidayEventsActionsWithJSON holidayEventsActionsWithJSON;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$task.getButtonType() != 5) {
            holidayEventsActionsWithJSON = this.this$0.actionWithJSON;
            holidayEventsActionsWithJSON.sendTaskPressed(this.$task.getId());
        } else {
            List<CommonButtonCategory> listOfButtons = this.this$0.getUiState().getValue().getListOfButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons, 10));
            for (CommonButtonCategory commonButtonCategory : listOfButtons) {
                arrayList.add(CommonButtonCategory.copy$default(commonButtonCategory, 0, null, null, commonButtonCategory.getCategoryId() == HolidayEventsScreenEnum.GAMES.getValue(), false, null, null, 119, null));
            }
            MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                HolidayEventsUiState value = mutableStateFlow.getValue();
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, arrayList, HolidayEventsScreenEnum.GAMES, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -3073, 1073741823, null))) {
                    break;
                }
                arrayList = arrayList2;
            }
        }
        return Unit.INSTANCE;
    }
}
