package com.blackhub.bronline.game.gui.smieditor;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUISmiEditor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$1", f = "GUISmiEditor.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUISmiEditor$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUISmiEditor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUISmiEditor$setObservers$1(GUISmiEditor gUISmiEditor, Continuation<? super GUISmiEditor$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = gUISmiEditor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUISmiEditor$setObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUISmiEditor$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel mainActivityViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mainActivityViewModel = this.this$0.getMainActivityViewModel();
            StateFlow<ConfigurationJsonModel> configurationJsons = mainActivityViewModel.getConfigurationJsons();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
            final GUISmiEditor gUISmiEditor = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                    SmiEditorViewModel smiEditorViewModel;
                    SmiEditorViewModel smiEditorViewModel2;
                    SmiEditorViewModel smiEditorViewModel3;
                    SmiEditorViewModel smiEditorViewModel4;
                    SmiList smiListFromJson = configurationJsonModel.getSmiListFromJson();
                    if (!smiListFromJson.getLowClass().isEmpty()) {
                        smiEditorViewModel4 = GUISmiEditor.this.getSmiEditorViewModel();
                        smiEditorViewModel4.initCarsAndAccessories(smiListFromJson);
                    } else {
                        smiEditorViewModel = GUISmiEditor.this.getSmiEditorViewModel();
                        String string = GUISmiEditor.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        smiEditorViewModel.showErrorNotification(string);
                        GUISmiEditor.this.closeFragment();
                    }
                    List<SmiEditorBodyObj> smiEditorBodyFromJson = configurationJsonModel.getSmiEditorBodyFromJson();
                    if (!smiEditorBodyFromJson.isEmpty()) {
                        smiEditorViewModel3 = GUISmiEditor.this.getSmiEditorViewModel();
                        smiEditorViewModel3.initBody(smiEditorBodyFromJson);
                    } else {
                        smiEditorViewModel2 = GUISmiEditor.this.getSmiEditorViewModel();
                        String string2 = GUISmiEditor.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        smiEditorViewModel2.showErrorNotification(string2);
                        GUISmiEditor.this.closeFragment();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
