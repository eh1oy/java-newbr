package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1", f = "BlackPassBannerViewModel.kt", i = {1, 2, 2}, l = {50, 58, 66}, m = "invokeSuspend", n = {"bgImage", "bgImage", "leftImage"}, s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$initRewardsAndProperties$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,125:1\n230#2,5:126\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$initRewardsAndProperties$1\n*L\n76#1:126,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassBannerViewModel$initRewardsAndProperties$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<LevelsInfo> $deluxeRewards;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ BlackPassProperties $properties;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ BlackPassBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerViewModel$initRewardsAndProperties$1(BlackPassBannerViewModel blackPassBannerViewModel, BlackPassProperties blackPassProperties, List<LevelsInfo> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, List<BpRewardsAwardsDto> list4, Continuation<? super BlackPassBannerViewModel$initRewardsAndProperties$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassBannerViewModel;
        this.$properties = blackPassProperties;
        this.$deluxeRewards = list;
        this.$vehiclesList = list2;
        this.$skinsList = list3;
        this.$listOfAwardsTypes = list4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerViewModel$initRewardsAndProperties$1(this.this$0, this.$properties, this.$deluxeRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassBannerViewModel$initRewardsAndProperties$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8 A[LOOP:0: B:11:0x00b0->B:18:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
