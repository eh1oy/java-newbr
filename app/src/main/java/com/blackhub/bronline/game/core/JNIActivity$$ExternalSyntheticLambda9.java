package com.blackhub.bronline.game.core;

import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.review.RuStoreReviewManager;
import ru.rustore.sdk.review.model.ReviewInfo;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class JNIActivity$$ExternalSyntheticLambda9 implements OnSuccessListener {
    public final /* synthetic */ RuStoreReviewManager f$0;

    @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        JNIActivity.lambda$setObservers$4(this.f$0, (ReviewInfo) obj);
    }
}
