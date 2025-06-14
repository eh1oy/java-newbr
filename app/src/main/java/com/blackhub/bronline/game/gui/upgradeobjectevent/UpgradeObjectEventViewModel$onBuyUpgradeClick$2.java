package com.blackhub.bronline.game.gui.upgradeobjectevent;

import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UpgradeObjectEventViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2", f = "UpgradeObjectEventViewModel.kt", i = {}, l = {TarConstants.CHKSUM_OFFSET}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventViewModel$onBuyUpgradeClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $positionUpgrade;
    public int label;
    public final /* synthetic */ UpgradeObjectEventViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeObjectEventViewModel$onBuyUpgradeClick$2(UpgradeObjectEventViewModel upgradeObjectEventViewModel, int i, Continuation<? super UpgradeObjectEventViewModel$onBuyUpgradeClick$2> continuation) {
        super(2, continuation);
        this.this$0 = upgradeObjectEventViewModel;
        this.$positionUpgrade = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpgradeObjectEventViewModel$onBuyUpgradeClick$2(this.this$0, this.$positionUpgrade, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpgradeObjectEventViewModel$onBuyUpgradeClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.get_uiState().getValue().getCurrency() > this.this$0.get_uiState().getValue().getPriceForUpgrade()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$positionUpgrade, null);
                this.label = 1;
                if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.isEnergyInfoOpen(true);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2$1", f = "UpgradeObjectEventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $positionUpgrade;
        public int label;
        public final /* synthetic */ UpgradeObjectEventViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpgradeObjectEventViewModel upgradeObjectEventViewModel, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = upgradeObjectEventViewModel;
            this.$positionUpgrade = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$positionUpgrade, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpgradeObjectEventActionWithJSON upgradeObjectEventActionWithJSON;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                upgradeObjectEventActionWithJSON = this.this$0.actionWithJSON;
                upgradeObjectEventActionWithJSON.sendUpgradeObjectUpgradeClick(this.$positionUpgrade);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
