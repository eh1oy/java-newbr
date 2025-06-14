package com.blackhub.bronline.game.gui.craft;

import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.server.CraftProductionServerItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
/* compiled from: CraftViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel$parseListWithProductionItems$2$1$1", f = "CraftViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCraftViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftViewModel.kt\ncom/blackhub/bronline/game/gui/craft/CraftViewModel$parseListWithProductionItems$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1753:1\n1#2:1754\n*E\n"})
/* loaded from: classes3.dex */
public final class CraftViewModel$parseListWithProductionItems$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CraftElement>, Object> {
    public final /* synthetic */ CraftElement $craftElement;
    public final /* synthetic */ CraftProductionServerItem $productionServerItem;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$parseListWithProductionItems$2$1$1(CraftProductionServerItem craftProductionServerItem, CraftElement craftElement, Continuation<? super CraftViewModel$parseListWithProductionItems$2$1$1> continuation) {
        super(2, continuation);
        this.$productionServerItem = craftProductionServerItem;
        this.$craftElement = craftElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CraftViewModel$parseListWithProductionItems$2$1$1(this.$productionServerItem, this.$craftElement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CraftElement> continuation) {
        return ((CraftViewModel$parseListWithProductionItems$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CraftElementStatusEnum craftElementStatusEnum;
        CraftElement copy;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (AnyExtensionKt.isNotNull(this.$productionServerItem.getTimeUntilItemPreparation())) {
            craftElementStatusEnum = CraftElementStatusEnum.IN_THE_PIPELINE;
        } else {
            craftElementStatusEnum = CraftElementStatusEnum.IN_THE_QUEUE;
        }
        CraftElementStatusEnum craftElementStatusEnum2 = craftElementStatusEnum;
        Integer timeUntilItemPreparation = this.$productionServerItem.getTimeUntilItemPreparation();
        Integer boxInt = timeUntilItemPreparation != null ? Boxing.boxInt(timeUntilItemPreparation.intValue() - this.$craftElement.getPreparationTime()) : null;
        Integer timeUntilItemPreparation2 = this.$productionServerItem.getTimeUntilItemPreparation();
        copy = r2.copy((r34 & 1) != 0 ? r2.elementId : 0, (r34 & 2) != 0 ? r2.serverId : this.$productionServerItem.getServerId(), (r34 & 4) != 0 ? r2.imageName : null, (r34 & 8) != 0 ? r2.imageType : 0, (r34 & 16) != 0 ? r2.timeUntilItemPreparation : timeUntilItemPreparation2 != null ? timeUntilItemPreparation2.intValue() : 0, (r34 & 32) != 0 ? r2.preparationTime : 0, (r34 & 64) != 0 ? r2.timeWhenElementCreated : boxInt, (r34 & 128) != 0 ? r2.elementRarity : null, (r34 & 256) != 0 ? r2.elementState : craftElementStatusEnum2, (r34 & 512) != 0 ? r2.valueOfPipeline : 0, (r34 & 1024) != 0 ? r2.textBlock : null, (r34 & 2048) != 0 ? r2.componentsList : null, (r34 & 4096) != 0 ? r2.valueOfPercent : 0, (r34 & 8192) != 0 ? r2.valueOfTimer : null, (r34 & 16384) != 0 ? r2.craftingCost : 0, (r34 & 32768) != 0 ? this.$craftElement.itemCategory : 0);
        return copy;
    }
}
