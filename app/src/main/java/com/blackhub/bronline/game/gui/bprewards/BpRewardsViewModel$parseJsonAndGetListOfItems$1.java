package com.blackhub.bronline.game.gui.bprewards;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BpRewardsViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel", f = "BpRewardsViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 614}, m = "parseJsonAndGetListOfItems", n = {"this", "json", "listOfAwardsTypes", "invItemsFromJson", "vehiclesList", "skinsList", "listOfItems", "listOfImageModels", "sizeOfImage", "isUpdateList", "this", "json", "listOfAwardsTypes", "invItemsFromJson", "vehiclesList", "skinsList", "listOfItems", "sizeOfImage", "isUpdateList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "Z$0"})
/* loaded from: classes3.dex */
public final class BpRewardsViewModel$parseJsonAndGetListOfItems$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
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
    public final /* synthetic */ BpRewardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BpRewardsViewModel$parseJsonAndGetListOfItems$1(BpRewardsViewModel bpRewardsViewModel, Continuation<? super BpRewardsViewModel$parseJsonAndGetListOfItems$1> continuation) {
        super(continuation);
        this.this$0 = bpRewardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object parseJsonAndGetListOfItems;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parseJsonAndGetListOfItems = this.this$0.parseJsonAndGetListOfItems(null, null, null, null, null, 0, false, this);
        return parseJsonAndGetListOfItems;
    }
}
