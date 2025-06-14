package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: MenuSettingControlViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel$initialParameters$1", f = "MenuSettingControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class MenuSettingControlViewModel$initialParameters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MenuSettingControlViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuSettingControlViewModel$initialParameters$1(MenuSettingControlViewModel menuSettingControlViewModel, Continuation<? super MenuSettingControlViewModel$initialParameters$1> continuation) {
        super(2, continuation);
        this.this$0 = menuSettingControlViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MenuSettingControlViewModel$initialParameters$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MenuSettingControlViewModel$initialParameters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PreferencesRepository preferencesRepository;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        MutableLiveData mutableLiveData;
        PreferencesRepository preferencesRepository4;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        PreferencesRepository preferencesRepository5;
        PreferencesRepository preferencesRepository6;
        PreferencesRepository preferencesRepository7;
        PreferencesRepository preferencesRepository8;
        PreferencesRepository preferencesRepository9;
        PreferencesRepository preferencesRepository10;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preferencesRepository = this.this$0.preferencesRepository;
            int integer$default = PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.HUD_VERSION, 0, 2, null);
            if (integer$default == -1) {
                integer$default = 1;
            }
            preferencesRepository2 = this.this$0.preferencesRepository;
            int integer$default2 = PreferencesRepository.getInteger$default(preferencesRepository2, NewMenuConstants.CHAT_VERSION, 0, 2, null);
            if (integer$default2 == -1) {
                integer$default2 = 1;
            }
            preferencesRepository3 = this.this$0.preferencesRepository;
            int integer$default3 = PreferencesRepository.getInteger$default(preferencesRepository3, NewMenuConstants.KEYBOARD_VERSION, 0, 2, null);
            if (integer$default3 == -1) {
                integer$default3 = 1;
            }
            mutableLiveData = this.this$0.mutableCarControl;
            preferencesRepository4 = this.this$0.preferencesRepository;
            mutableLiveData.postValue(Boxing.boxInt(PreferencesRepository.getInteger$default(preferencesRepository4, NewMenuConstants.CAR_CONTROL, 0, 2, null)));
            mutableLiveData2 = this.this$0._hudVersion;
            mutableLiveData2.postValue(Boxing.boxInt(integer$default));
            mutableLiveData3 = this.this$0._chatVersion;
            mutableLiveData3.postValue(Boxing.boxInt(integer$default2));
            mutableLiveData4 = this.this$0._keyboardVersion;
            mutableLiveData4.postValue(Boxing.boxInt(integer$default3));
            mutableLiveData5 = this.this$0.mutableLookBack;
            preferencesRepository5 = this.this$0.preferencesRepository;
            mutableLiveData5.postValue(Boxing.boxBoolean(PreferencesRepository.getInteger$default(preferencesRepository5, NewMenuConstants.LOOK_BACK, 0, 2, null) == 1));
            MenuSettingControlViewModel menuSettingControlViewModel = this.this$0;
            preferencesRepository6 = menuSettingControlViewModel.preferencesRepository;
            menuSettingControlViewModel.setValueOfCarControlSensibility(preferencesRepository6.getFloat(NewMenuConstants.CAR_CONTROL_SENSIBILITY));
            MenuSettingControlViewModel menuSettingControlViewModel2 = this.this$0;
            preferencesRepository7 = menuSettingControlViewModel2.preferencesRepository;
            menuSettingControlViewModel2.setValueOfCamXSensibility(preferencesRepository7.getFloat(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY));
            MenuSettingControlViewModel menuSettingControlViewModel3 = this.this$0;
            preferencesRepository8 = menuSettingControlViewModel3.preferencesRepository;
            menuSettingControlViewModel3.setValueOfCamYSensibility(preferencesRepository8.getFloat(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY));
            MenuSettingControlViewModel menuSettingControlViewModel4 = this.this$0;
            preferencesRepository9 = menuSettingControlViewModel4.preferencesRepository;
            menuSettingControlViewModel4.setValueOfAimingCamXSensibility(preferencesRepository9.getFloat(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY));
            MenuSettingControlViewModel menuSettingControlViewModel5 = this.this$0;
            preferencesRepository10 = menuSettingControlViewModel5.preferencesRepository;
            menuSettingControlViewModel5.setValueOfAimingCamYSensibility(preferencesRepository10.getFloat(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
