package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
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
import kotlin.jvm.internal.Intrinsics;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonChooseScreenClick$1", f = "HolidayEventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onButtonChooseScreenClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onButtonChooseScreenClick$1\n*L\n971#1:1303\n971#1:1304,3\n978#1:1307,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel$onButtonChooseScreenClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CommonButtonCategory $button;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$onButtonChooseScreenClick$1(CommonButtonCategory commonButtonCategory, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super HolidayEventsViewModel$onButtonChooseScreenClick$1> continuation) {
        super(2, continuation);
        this.$button = commonButtonCategory;
        this.this$0 = holidayEventsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$onButtonChooseScreenClick$1(this.$button, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HolidayEventsViewModel$onButtonChooseScreenClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        HolidayEventsScreenEnum fromInt = HolidayEventsScreenEnum.INSTANCE.fromInt(this.$button.getCategoryId());
        List<CommonButtonCategory> listOfButtons = this.this$0.getUiState().getValue().getListOfButtons();
        CommonButtonCategory commonButtonCategory = this.$button;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons, 10));
        for (CommonButtonCategory commonButtonCategory2 : listOfButtons) {
            arrayList.add(CommonButtonCategory.copy$default(commonButtonCategory2, 0, null, null, Intrinsics.areEqual(commonButtonCategory2, commonButtonCategory), false, null, null, 119, null));
        }
        holidayEventsActionsWithJSON = this.this$0.actionWithJSON;
        holidayEventsActionsWithJSON.sendScreenPressed(this.$button.getCategoryId());
        MutableStateFlow<? extends HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
        while (true) {
            HolidayEventsUiState value = mutableStateFlow.getValue();
            ArrayList arrayList2 = arrayList;
            if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m6942copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, arrayList, fromInt, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -3073, 1073741823, null))) {
                return Unit.INSTANCE;
            }
            arrayList = arrayList2;
        }
    }
}
