package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: BlackPassMainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1$1$deferredTasks$10", f = "BlackPassMainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1$1$deferredTasks$10\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1001:1\n1#2:1002\n*E\n"})
/* loaded from: classes3.dex */
public final class BlackPassMainViewModel$initInterface$1$1$deferredTasks$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $imgRubBitmap;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1$1$deferredTasks$10(List<BpRewardsAwardsDto> list, Ref.ObjectRef<Bitmap> objectRef, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super BlackPassMainViewModel$initInterface$1$1$deferredTasks$10> continuation) {
        super(2, continuation);
        this.$listOfAwardsTypes = list;
        this.$imgRubBitmap = objectRef;
        this.this$0 = blackPassMainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1$1$deferredTasks$10(this.$listOfAwardsTypes, this.$imgRubBitmap, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1$1$deferredTasks$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        List<String> imageList;
        String str;
        Application application;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Iterator<T> it = this.$listOfAwardsTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((BpRewardsAwardsDto) obj2).getId() == 2) {
                break;
            }
        }
        BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) obj2;
        if (bpRewardsAwardsDto == null || (imageList = bpRewardsAwardsDto.getImageList()) == null || (str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) imageList)) == null) {
            return null;
        }
        Ref.ObjectRef<Bitmap> objectRef = this.$imgRubBitmap;
        BlackPassMainViewModel blackPassMainViewModel = this.this$0;
        Bitmap imgRubBitmap = blackPassMainViewModel.getUiState().getValue().getImgRubBitmap();
        T t = imgRubBitmap;
        if (imgRubBitmap == null) {
            application = blackPassMainViewModel.application;
            t = BitmapUtilsKt.getBitmapFromZip$default(application, str, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
