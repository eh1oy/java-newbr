package com.blackhub.bronline.game.gui.inventory.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InventoryAndExchangeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$subtractionOtherItem$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$subtractionOtherItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $itemId;
    public final /* synthetic */ String $oldPlateNumber;
    public final /* synthetic */ int $subItemValue;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$subtractionOtherItem$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, String str, int i, int i2, Continuation<? super InventoryAndExchangeViewModel$subtractionOtherItem$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$oldPlateNumber = str;
        this.$itemId = i;
        this.$subItemValue = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$subtractionOtherItem$1(this.this$0, this.$oldPlateNumber, this.$itemId, this.$subItemValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$subtractionOtherItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, com.blackhub.bronline.game.gui.inventory.data.InvItems] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$subtractionOtherItem$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
