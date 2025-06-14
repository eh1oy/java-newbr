package com.blackhub.bronline.game.gui.rating;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
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
import kotlin.jvm.internal.StringCompanionObject;
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
/* compiled from: RatingViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/blackhub/bronline/game/gui/rating/RatingViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/rating/RatingUiState;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/rating/RatingActionWithJson;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/rating/RatingActionWithJson;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getTopListModel", "Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;", "posInRating", "", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "points", "reward", "playerServer", "initInterface", "", "json", "Lorg/json/JSONObject;", "onCloseClick", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RatingViewModel extends BaseViewModel<RatingUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<RatingUiState> _uiState;

    @NotNull
    public final RatingActionWithJson actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<RatingUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public RatingViewModel(@NotNull RatingActionWithJson actionWithJson, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJson = actionWithJson;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new RatingUiState(null, null, null, null, null, null, false, 127, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        ViewModelExtensionKt.launchOnIO$default(this, null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends RatingUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RatingUiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: RatingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.rating.RatingViewModel$1", f = "RatingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,133:1\n230#2,5:134\n*S KotlinDebug\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$1\n*L\n53#1:134,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rating.RatingViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RatingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            RatingUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(RatingViewModel.this.application, RatingConstants.COLLABORATION_AUTUMN_BG_IMAGE_NAME, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            MutableStateFlow<? extends RatingUiState> mutableStateFlow = RatingViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, RatingUiState.copy$default(value, null, null, null, bitmapFromZip$default, null, null, false, 119, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initInterface(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new RatingViewModel$initInterface$1(json, this, null), 1, null);
    }

    public final void onCloseClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new RatingViewModel$onCloseClick$1(this, null), 1, null);
    }

    public static /* synthetic */ CommonEventTopListModel getTopListModel$default(RatingViewModel ratingViewModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        return ratingViewModel.getTopListModel(str, str2, str3, str4, str5);
    }

    public final CommonEventTopListModel getTopListModel(String posInRating, String nick, String points, String reward, String playerServer) {
        return new CommonEventTopListModel(posInRating, nick, points, reward, playerServer);
    }
}
