package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuSettingWinterViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel$initialParameters$1", f = "MenuSettingWinterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class MenuSettingWinterViewModel$initialParameters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MenuSettingWinterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuSettingWinterViewModel$initialParameters$1(MenuSettingWinterViewModel menuSettingWinterViewModel, Continuation<? super MenuSettingWinterViewModel$initialParameters$1> continuation) {
        super(2, continuation);
        this.this$0 = menuSettingWinterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MenuSettingWinterViewModel$initialParameters$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MenuSettingWinterViewModel$initialParameters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PreferencesRepository preferencesRepository;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preferencesRepository = this.this$0.preferencesRepository;
            if (PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.IS_INIT_SETTING_WINTER, 0, 2, null) == -1) {
                this.this$0.setDefaultParameters();
            } else {
                MenuSettingWinterViewModel menuSettingWinterViewModel = this.this$0;
                preferencesRepository2 = menuSettingWinterViewModel.preferencesRepository;
                int integer = preferencesRepository2.getInteger(NewMenuConstants.SNOW_INTENSITY, 2);
                preferencesRepository3 = this.this$0.preferencesRepository;
                menuSettingWinterViewModel.updateParams(integer, preferencesRepository3.getInteger(NewMenuConstants.WINTER_SLIP, 0) == 1);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
