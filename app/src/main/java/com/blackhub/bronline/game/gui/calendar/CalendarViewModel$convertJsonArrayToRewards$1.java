package com.blackhub.bronline.game.gui.calendar;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel", f = "CalendarViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {703}, m = "convertJsonArrayToRewards", n = {"this", "intArray", "vehiclesList", "skinsList", "listOfAwardsTypes", "destination$iv$iv", "reward", "rarityState", "mainRewardState", "bonusRewardState", "finalBottomText", "level", "isMainRewards", "index$iv$iv", "fromList", "isNeedToShowLvl"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "Z$0", "I$1", "I$2", "I$3"})
/* loaded from: classes3.dex */
public final class CalendarViewModel$convertJsonArrayToRewards$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$convertJsonArrayToRewards$1(CalendarViewModel calendarViewModel, Continuation<? super CalendarViewModel$convertJsonArrayToRewards$1> continuation) {
        super(continuation);
        this.this$0 = calendarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object convertJsonArrayToRewards;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        convertJsonArrayToRewards = this.this$0.convertJsonArrayToRewards(0, false, null, null, null, null, null, this);
        return convertJsonArrayToRewards;
    }
}
