package com.blackhub.bronline.game.gui.socialnetworklink.viewmodel;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUiState;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUtils;
import com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SocialNetworkLinkViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel$initInterface$1", f = "SocialNetworkLinkViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSocialNetworkLinkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialNetworkLinkViewModel.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,110:1\n230#2,5:111\n*S KotlinDebug\n*F\n+ 1 SocialNetworkLinkViewModel.kt\ncom/blackhub/bronline/game/gui/socialnetworklink/viewmodel/SocialNetworkLinkViewModel$initInterface$1\n*L\n60#1:111,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SocialNetworkLinkViewModel$initInterface$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ SocialNetworkLinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialNetworkLinkViewModel$initInterface$1(JSONObject jSONObject, SocialNetworkLinkViewModel socialNetworkLinkViewModel, Continuation<? super SocialNetworkLinkViewModel$initInterface$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = socialNetworkLinkViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SocialNetworkLinkViewModel$initInterface$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SocialNetworkLinkViewModel$initInterface$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<Integer> listOf;
        SocialNetworkLinkUiState value;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        JSONArray optJSONArray = this.$json.optJSONArray(SocialNetworkLinkUtils.KEY_BUTTON_STATUS);
        if (optJSONArray == null || (listOf = JsonArrayExtensionKt.toMutableIntList(optJSONArray)) == null) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(1), Boxing.boxInt(1)});
        }
        if (listOf.size() == 2) {
            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new SocialButtonObj[]{new SocialButtonObj(0, this.this$0.getStringResource().linkVK(), R.drawable.img_vk_active, R.drawable.img_vk_inactive, listOf.get(0).intValue()), new SocialButtonObj(1, this.this$0.getStringResource().linkTG(), R.drawable.img_telegram_active, R.drawable.img_telegram_inactive, listOf.get(1).intValue())});
            MutableStateFlow<? extends SocialNetworkLinkUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, SocialNetworkLinkUiState.copy$default(value, listOf2, false, false, 6, null)));
        }
        return Unit.INSTANCE;
    }
}
