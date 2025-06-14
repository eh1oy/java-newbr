package com.blackhub.bronline.game.gui.moduledialog;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import com.blackhub.bronline.game.gui.rating.RatingConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ModuleDialogViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/moduledialog/ModuleDialogUiState;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/moduledialog/network/ModuleDialogActionsWithJson;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/moduledialog/network/ModuleDialogActionsWithJson;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "parseDialogData", "sendOnButtonClick", "buttonId", "", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModuleDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,98:1\n230#2,5:99\n230#2,5:104\n*S KotlinDebug\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel\n*L\n64#1:99,5\n87#1:104,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ModuleDialogViewModel extends BaseViewModel<ModuleDialogUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ModuleDialogUiState> _uiState;

    @NotNull
    public final ModuleDialogActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ModuleDialogUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public ModuleDialogViewModel(@NotNull StringResource stringResource, @NotNull ModuleDialogActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.stringResource = stringResource;
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new ModuleDialogUiState(null, null, null, null, null, null, false, 127, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        ViewModelExtensionKt.launchOnIO$default(this, null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ModuleDialogUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ModuleDialogUiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: ModuleDialogViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$1", f = "ModuleDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nModuleDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,98:1\n230#2,5:99\n*S KotlinDebug\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel$1\n*L\n46#1:99,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ModuleDialogViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ModuleDialogUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(ModuleDialogViewModel.this.application, RatingConstants.COLLABORATION_AUTUMN_BG_IMAGE_NAME, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            MutableStateFlow<? extends ModuleDialogUiState> mutableStateFlow = ModuleDialogViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, null, null, null, null, null, bitmapFromZip$default, false, 95, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        parseDialogData(json);
    }

    public final void updateJson(@NotNull JSONObject json) {
        ModuleDialogUiState value;
        Intrinsics.checkNotNullParameter(json, "json");
        int optInt = json.optInt("s");
        if (optInt == 1) {
            parseDialogData(json);
            return;
        }
        if (optInt != 2) {
            return;
        }
        String optString = json.optString(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        MutableStateFlow<? extends ModuleDialogUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, null, null, null, null, optString, null, false, 111, null)));
    }

    public final void sendOnButtonClick(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ModuleDialogViewModel$sendOnButtonClick$1(this, buttonId, null), 1, null);
    }

    public final void parseDialogData(JSONObject json) {
        String optString = json.optString("t");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = json.optString("d");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        AnnotatedString htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(optString2);
        String optString3 = json.optString("b1");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String optString4 = json.optString("b2");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        String optString5 = json.optString(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
        Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
        MutableStateFlow<? extends ModuleDialogUiState> mutableStateFlow = get_uiState();
        while (true) {
            ModuleDialogUiState value = mutableStateFlow.getValue();
            String str = optString5;
            if (mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, optString, htmlTextToAnnotatedString, optString3, optString4, optString5, null, false, 96, null))) {
                return;
            } else {
                optString5 = str;
            }
        }
    }
}
