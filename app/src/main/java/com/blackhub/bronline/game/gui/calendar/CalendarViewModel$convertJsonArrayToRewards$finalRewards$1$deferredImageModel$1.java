package com.blackhub.bronline.game.gui.calendar;

import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CalendarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1", f = "CalendarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageModel>, Object> {
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ CalendarRewardsDto $reward;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1(CalendarViewModel calendarViewModel, CalendarRewardsDto calendarRewardsDto, List<VehiclesDTO> list, List<SkinsDTO> list2, List<BpRewardsAwardsDto> list3, Continuation<? super CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1> continuation) {
        super(2, continuation);
        this.this$0 = calendarViewModel;
        this.$reward = calendarRewardsDto;
        this.$vehiclesList = list;
        this.$skinsList = list2;
        this.$listOfAwardsTypes = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1(this.this$0, this.$reward, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ImageModel> continuation) {
        return ((CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ImageModel imageModel;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            imageModel = this.this$0.setImageModel(this.$reward, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes);
            return imageModel;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
