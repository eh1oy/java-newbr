package com.blackhub.bronline.game.gui.upgradeobjectevent;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UpgradeObjectEventViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel", f = "UpgradeObjectEventViewModel.kt", i = {}, l = {628}, m = "getUpgradeObjectAwardsResponse", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpgradeObjectEventViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1(UpgradeObjectEventViewModel upgradeObjectEventViewModel, Continuation<? super UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1> continuation) {
        super(continuation);
        this.this$0 = upgradeObjectEventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object upgradeObjectAwardsResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        upgradeObjectAwardsResponse = this.this$0.getUpgradeObjectAwardsResponse(this);
        return upgradeObjectAwardsResponse;
    }
}
