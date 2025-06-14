package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeObj;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeState;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfoKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassPrizeListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel$initPrizeList$1", f = "BlackPassPrizeListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassPrizeListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPrizeListViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel$initPrizeList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,158:1\n230#2,5:159\n*S KotlinDebug\n*F\n+ 1 BlackPassPrizeListViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel$initPrizeList$1\n*L\n130#1:159,5\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassPrizeListViewModel$initPrizeList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<LevelsInfo> $premiumPrizes;
    public final /* synthetic */ List<LevelsInfo> $standardPrizes;
    public int label;
    public final /* synthetic */ BlackPassPrizeListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassPrizeListViewModel$initPrizeList$1(List<LevelsInfo> list, List<LevelsInfo> list2, BlackPassPrizeListViewModel blackPassPrizeListViewModel, Continuation<? super BlackPassPrizeListViewModel$initPrizeList$1> continuation) {
        super(2, continuation);
        this.$standardPrizes = list;
        this.$premiumPrizes = list2;
        this.this$0 = blackPassPrizeListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassPrizeListViewModel$initPrizeList$1(this.$standardPrizes, this.$premiumPrizes, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassPrizeListViewModel$initPrizeList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PrizeState value;
        Application application;
        Application application2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final ArrayList arrayList = new ArrayList();
        GameRender gameRender = GameRender.getInstance();
        if (this.$standardPrizes.size() == this.$premiumPrizes.size()) {
            int size = this.$standardPrizes.size();
            for (final int i = 0; i < size; i++) {
                final LevelsInfo levelsInfo = this.$standardPrizes.get(i);
                final LevelsInfo levelsInfo2 = this.$premiumPrizes.get(i);
                if (levelsInfo.getTypeReward() == 1) {
                    if (LevelsInfoKt.isHaveCDNRender(levelsInfo) || !LevelsInfoKt.ifNeedRequestBitmapFromNative(levelsInfo)) {
                        application2 = this.this$0.application;
                        Bitmap bitmapFromCDNOrResources = LevelsInfoKt.getBitmapFromCDNOrResources(levelsInfo, application2);
                        int i2 = i + 1;
                        int typeId = levelsInfo.getTypeId();
                        int awardId = levelsInfo.getAwardId();
                        String str = (String) UtilsKt.buildTypeMerge(levelsInfo.getName(), levelsInfo.getNameStore());
                        arrayList.add(new PrizeObj(0, bitmapFromCDNOrResources, i2, typeId, awardId, str == null ? "" : str, 0, 0, 0, levelsInfo.getRarity(), 449, null));
                    } else {
                        LevelsInfoKt.actionWithNativeRender(levelsInfo, new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel$initPrizeList$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                                invoke2(bitmap);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Bitmap bitmap) {
                                List<PrizeObj> list = arrayList;
                                int i3 = i + 1;
                                int typeId2 = levelsInfo.getTypeId();
                                int awardId2 = levelsInfo.getAwardId();
                                String str2 = (String) UtilsKt.buildTypeMerge(levelsInfo.getName(), levelsInfo.getNameStore());
                                if (str2 == null) {
                                    str2 = "";
                                }
                                list.add(new PrizeObj(0, bitmap, i3, typeId2, awardId2, str2, 0, 0, 0, levelsInfo.getRarity(), 449, null));
                            }
                        }, gameRender);
                    }
                }
                if (levelsInfo2.getTypeReward() == 1) {
                    if (LevelsInfoKt.isHaveCDNRender(levelsInfo2) || !LevelsInfoKt.ifNeedRequestBitmapFromNative(levelsInfo2)) {
                        application = this.this$0.application;
                        Bitmap bitmapFromCDNOrResources2 = LevelsInfoKt.getBitmapFromCDNOrResources(levelsInfo2, application);
                        int i3 = i + 1;
                        int typeId2 = levelsInfo2.getTypeId();
                        int awardId2 = levelsInfo2.getAwardId();
                        String str2 = (String) UtilsKt.buildTypeMerge(levelsInfo2.getName(), levelsInfo2.getNameStore());
                        arrayList.add(new PrizeObj(0, bitmapFromCDNOrResources2, i3, typeId2, awardId2, str2 == null ? "" : str2, 0, 0, 0, levelsInfo2.getRarity(), 449, null));
                    } else {
                        LevelsInfoKt.actionWithNativeRender(levelsInfo, new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel$initPrizeList$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                                invoke2(bitmap);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Bitmap bitmap) {
                                List<PrizeObj> list = arrayList;
                                int i4 = i + 1;
                                int typeId3 = levelsInfo2.getTypeId();
                                int awardId3 = levelsInfo2.getAwardId();
                                String str3 = (String) UtilsKt.buildTypeMerge(levelsInfo2.getName(), levelsInfo2.getNameStore());
                                if (str3 == null) {
                                    str3 = "";
                                }
                                list.add(new PrizeObj(0, bitmap, i4, typeId3, awardId3, str3, 0, 0, 0, levelsInfo2.getRarity(), 449, null));
                            }
                        }, gameRender);
                    }
                }
            }
        } else {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            List<LevelsInfo> list = this.$standardPrizes;
            List<LevelsInfo> list2 = this.$premiumPrizes;
            firebaseCrashlytics.log("standardPrizes.size (" + list.size() + ") != premiumPrizes.size (" + list2.size() + ")");
            firebaseCrashlytics.recordException(new Throwable());
        }
        MutableStateFlow<? extends PrizeState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PrizeState.copy$default(value, arrayList, false, 2, null)));
        return Unit.INSTANCE;
    }
}
