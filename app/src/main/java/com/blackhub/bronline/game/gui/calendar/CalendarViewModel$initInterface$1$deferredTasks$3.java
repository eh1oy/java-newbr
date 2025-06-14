package com.blackhub.bronline.game.gui.calendar;

import androidx.media3.extractor.ts.PsExtractor;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1$deferredTasks$3", f = "CalendarViewModel.kt", i = {}, l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CalendarViewModel$initInterface$1$deferredTasks$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CalendarRewardsDto> $comeBackMainDaysRewards;
    public final /* synthetic */ Ref.ObjectRef<List<CommonRewardModel>> $comeBackMainRewards;
    public final /* synthetic */ List<Integer> $comeBackMainRewardsStatus;
    public final /* synthetic */ Ref.IntRef $lastOpenedComeBackMainReward;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ int $minLevel;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public Object L$0;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$initInterface$1$deferredTasks$3(Ref.ObjectRef<List<CommonRewardModel>> objectRef, List<Integer> list, Ref.IntRef intRef, CalendarViewModel calendarViewModel, int i, List<CalendarRewardsDto> list2, List<VehiclesDTO> list3, List<SkinsDTO> list4, List<BpRewardsAwardsDto> list5, Continuation<? super CalendarViewModel$initInterface$1$deferredTasks$3> continuation) {
        super(2, continuation);
        this.$comeBackMainRewards = objectRef;
        this.$comeBackMainRewardsStatus = list;
        this.$lastOpenedComeBackMainReward = intRef;
        this.this$0 = calendarViewModel;
        this.$minLevel = i;
        this.$comeBackMainDaysRewards = list2;
        this.$vehiclesList = list3;
        this.$skinsList = list4;
        this.$listOfAwardsTypes = list5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$initInterface$1$deferredTasks$3(this.$comeBackMainRewards, this.$comeBackMainRewardsStatus, this.$lastOpenedComeBackMainReward, this.this$0, this.$minLevel, this.$comeBackMainDaysRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$initInterface$1$deferredTasks$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [T] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r13.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L3f
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel>> r14 = r13.$comeBackMainRewards
            java.util.List<java.lang.Integer> r6 = r13.$comeBackMainRewardsStatus
            if (r6 == 0) goto L42
            com.blackhub.bronline.game.gui.calendar.CalendarViewModel r3 = r13.this$0
            int r4 = r13.$minLevel
            java.util.List<com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto> r7 = r13.$comeBackMainDaysRewards
            java.util.List<com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO> r8 = r13.$vehiclesList
            java.util.List<com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO> r9 = r13.$skinsList
            java.util.List<com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto> r10 = r13.$listOfAwardsTypes
            r13.L$0 = r14
            r13.label = r2
            r5 = 1
            r11 = r13
            java.lang.Object r1 = com.blackhub.bronline.game.gui.calendar.CalendarViewModel.access$convertJsonArrayToRewards(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r0) goto L3d
            return r0
        L3d:
            r0 = r14
            r14 = r1
        L3f:
            java.util.List r14 = (java.util.List) r14
            goto L46
        L42:
            r0 = 0
            r12 = r0
            r0 = r14
            r14 = r12
        L46:
            if (r14 != 0) goto L4c
            java.util.List r14 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L4c:
            r0.element = r14
            kotlin.jvm.internal.Ref$IntRef r14 = r13.$lastOpenedComeBackMainReward
            com.blackhub.bronline.game.gui.calendar.CalendarViewModel r0 = r13.this$0
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel>> r1 = r13.$comeBackMainRewards
            T r1 = r1.element
            java.util.List r1 = (java.util.List) r1
            int r0 = com.blackhub.bronline.game.gui.calendar.CalendarViewModel.access$getLastScrollIndexAndFindLastOpenedReward(r0, r1, r2)
            r14.element = r0
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1$deferredTasks$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
