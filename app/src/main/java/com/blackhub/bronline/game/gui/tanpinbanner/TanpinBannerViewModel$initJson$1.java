package com.blackhub.bronline.game.gui.tanpinbanner;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: TanpinBannerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$initJson$1", f = "TanpinBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n230#3,5:134\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$initJson$1\n*L\n49#1:130\n49#1:131,3\n57#1:134,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TanpinBannerViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TanpinBannerData $bannerData;
    public final /* synthetic */ List<CasesAwardDto> $rewards;
    public int label;
    public final /* synthetic */ TanpinBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TanpinBannerViewModel$initJson$1(TanpinBannerViewModel tanpinBannerViewModel, List<CasesAwardDto> list, TanpinBannerData tanpinBannerData, Continuation<? super TanpinBannerViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.this$0 = tanpinBannerViewModel;
        this.$rewards = list;
        this.$bannerData = tanpinBannerData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TanpinBannerViewModel$initJson$1(this.this$0, this.$rewards, this.$bannerData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TanpinBannerViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List fileNames;
        Application application;
        Application application2;
        Application application3;
        CasesBannerAttachment casesBannerAttachment;
        TanpinBannerUiState value;
        CaseReward caseReward;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            fileNames = this.this$0.getFileNames(this.$rewards, this.$bannerData);
            application = this.this$0.application;
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(application, this.$bannerData.getBannerBgImage(), ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            application2 = this.this$0.application;
            Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(application2, this.$bannerData.getBannerCaseImage(), ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
            application3 = this.this$0.application;
            Map<String, Bitmap> bitmapMapFromZip = BitmapUtilsKt.getBitmapMapFromZip(application3, fileNames, ImageTypePathInCDNEnum.IMAGE);
            List<CasesAwardDto> list = this.$rewards;
            TanpinBannerViewModel tanpinBannerViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                caseReward = tanpinBannerViewModel.toCaseReward((CasesAwardDto) it.next(), bitmapMapFromZip);
                arrayList.add(caseReward);
            }
            casesBannerAttachment = this.this$0.toCasesBannerAttachment(this.$bannerData, bitmapFromZip$default, bitmapFromZip$default2, bitmapMapFromZip, arrayList);
            MutableStateFlow<? extends TanpinBannerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, TanpinBannerUiState.copy$default(value, casesBannerAttachment, false, 2, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
