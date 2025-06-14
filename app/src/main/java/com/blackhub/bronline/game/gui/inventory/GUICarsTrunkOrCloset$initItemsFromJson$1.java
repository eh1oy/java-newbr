package com.blackhub.bronline.game.gui.inventory;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUICarsTrunkOrCloset.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initItemsFromJson$1", f = "GUICarsTrunkOrCloset.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUICarsTrunkOrCloset$initItemsFromJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ GUICarsTrunkOrCloset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUICarsTrunkOrCloset$initItemsFromJson$1(GUICarsTrunkOrCloset gUICarsTrunkOrCloset, JSONObject jSONObject, Continuation<? super GUICarsTrunkOrCloset$initItemsFromJson$1> continuation) {
        super(2, continuation);
        this.this$0 = gUICarsTrunkOrCloset;
        this.$json = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUICarsTrunkOrCloset$initItemsFromJson$1(this.this$0, this.$json, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUICarsTrunkOrCloset$initItemsFromJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JNIActivityViewModel mainViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mainViewModel = this.this$0.getMainViewModel();
            StateFlow<ConfigurationJsonModel> configurationJsons = mainViewModel.getConfigurationJsons();
            final GUICarsTrunkOrCloset gUICarsTrunkOrCloset = this.this$0;
            final JSONObject jSONObject = this.$json;
            FlowCollector<? super ConfigurationJsonModel> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initItemsFromJson$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                    List<InvItems> invItemsFromJson = configurationJsonModel.getInvItemsFromJson();
                    if (!invItemsFromJson.isEmpty()) {
                        GUICarsTrunkOrCloset.this.invItemsFromJson = invItemsFromJson;
                        GUICarsTrunkOrCloset.this.getStartData(jSONObject);
                    } else {
                        LocalNotification localNotification = new LocalNotification(GUIManager.INSTANCE.getInstance());
                        String string = GUICarsTrunkOrCloset.this.getString(R.string.common_error_with_json_parsing);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        localNotification.showErrorNotification(string);
                        GUICarsTrunkOrCloset.this.closeFragment();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (configurationJsons.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
