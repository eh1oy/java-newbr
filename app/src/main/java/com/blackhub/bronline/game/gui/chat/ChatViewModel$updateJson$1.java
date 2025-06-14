package com.blackhub.bronline.game.gui.chat;

import com.blackhub.bronline.game.gui.chat.model.ChatMessageModel;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ChatViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$updateJson$1", f = "ChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$updateJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,109:1\n51#2,5:110\n56#2,11:124\n8#3,9:115\n1855#4,2:135\n230#5,5:137\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$updateJson$1\n*L\n59#1:110,5\n59#1:124,11\n59#1:115,9\n62#1:135,2\n68#1:137,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChatViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ ChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$updateJson$1(JSONObject jSONObject, ChatViewModel chatViewModel, Continuation<? super ChatViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChatViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChatViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        ChatUiState value;
        ChatMessageModel parseMessageItem;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$json.optInt("t") == 2) {
            JSONArray optJSONArray = this.$json.optJSONArray("tx");
            ArrayList arrayList = null;
            if (optJSONArray != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        Intrinsics.checkNotNull(jSONObject);
                        try {
                            Gson gson = new Gson();
                            String jSONObject2 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                            obj2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) jSONObject2).toString(), (Class<Object>) ChatMessageServerModel.class);
                        } catch (Exception e) {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics.log(e.toString());
                            firebaseCrashlytics.recordException(e);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            Boxing.boxBoolean(arrayList2.add(obj2));
                        }
                    }
                    arrayList = arrayList2;
                } catch (Exception e2) {
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics2.log(e2.toString());
                    firebaseCrashlytics2.recordException(e2);
                }
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.getUiState().getValue().getMessagesList());
            if (arrayList != null) {
                ChatViewModel chatViewModel = this.this$0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parseMessageItem = chatViewModel.parseMessageItem((ChatMessageServerModel) it.next());
                    mutableList.add(parseMessageItem);
                }
            }
            MutableStateFlow<? extends ChatUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ChatUiState.copy$default(value, 0, mutableList, false, 5, null)));
        }
        return Unit.INSTANCE;
    }
}
