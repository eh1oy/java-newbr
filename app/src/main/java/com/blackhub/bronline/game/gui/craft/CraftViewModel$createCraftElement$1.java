package com.blackhub.bronline.game.gui.craft;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CraftViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.craft.CraftViewModel", f = "CraftViewModel.kt", i = {0, 0, 0, 0, 0, 0}, l = {1365}, m = "createCraftElement", n = {"this", "craftJsonItem", "newItemsIdsList", "levelOfSkill", "workbenchLevel", "vipProbAdd"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "F$0"})
/* loaded from: classes3.dex */
public final class CraftViewModel$createCraftElement$1 extends ContinuationImpl {
    public float F$0;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CraftViewModel$createCraftElement$1(CraftViewModel craftViewModel, Continuation<? super CraftViewModel$createCraftElement$1> continuation) {
        super(continuation);
        this.this$0 = craftViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object createCraftElement;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createCraftElement = this.this$0.createCraftElement(null, null, null, null, 0, 0, 0.0f, this);
        return createCraftElement;
    }
}
