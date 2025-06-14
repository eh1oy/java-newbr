package com.blackhub.bronline.game.gui.gifts;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GiftsViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel", f = "GiftsViewModel.kt", i = {}, l = {347}, m = "getGiftResponse", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GiftsViewModel$getGiftResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GiftsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftsViewModel$getGiftResponse$1(GiftsViewModel giftsViewModel, Continuation<? super GiftsViewModel$getGiftResponse$1> continuation) {
        super(continuation);
        this.this$0 = giftsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object giftResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        giftResponse = this.this$0.getGiftResponse(this);
        return giftResponse;
    }
}
