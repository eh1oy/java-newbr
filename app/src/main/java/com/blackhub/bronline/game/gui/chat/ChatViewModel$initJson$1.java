package com.blackhub.bronline.game.gui.chat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ChatViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.chat.ChatViewModel$initJson$1", f = "ChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$initJson$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,109:1\n51#2,5:110\n56#2,11:124\n8#3,9:115\n1549#4:135\n1620#4,3:136\n230#5,5:139\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel$initJson$1\n*L\n38#1:110,5\n38#1:124,11\n38#1:115,9\n40#1:135\n40#1:136,3\n44#1:139,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ChatViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ ChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$initJson$1(JSONObject jSONObject, ChatViewModel chatViewModel, Continuation<? super ChatViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChatViewModel$initJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChatViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            if (r0 != 0) goto Lcb
            kotlin.ResultKt.throwOnFailure(r10)
            org.json.JSONObject r10 = r9.$json
            java.lang.String r0 = "sec"
            int r10 = r10.optInt(r0)
            org.json.JSONObject r0 = r9.$json
            java.lang.String r1 = "tx"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            r1 = 0
            if (r0 == 0) goto L7d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6a
            r2.<init>()     // Catch: java.lang.Exception -> L6a
            int r3 = r0.length()     // Catch: java.lang.Exception -> L6a
            r4 = 0
        L29:
            if (r4 >= r3) goto L7e
            org.json.JSONObject r5 = r0.getJSONObject(r4)     // Catch: java.lang.Exception -> L6a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Exception -> L6a
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L50
            r6.<init>()     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L50
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch: java.lang.Exception -> L50
            java.lang.CharSequence r5 = kotlin.text.StringsKt__StringsKt.trim(r5)     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L50
            java.lang.Class<com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel> r7 = com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel.class
            java.lang.Object r5 = r6.fromJson(r5, r7)     // Catch: java.lang.Exception -> L50
            goto L60
        L50:
            r5 = move-exception
            com.google.firebase.crashlytics.FirebaseCrashlytics r6 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Exception -> L6a
            r6.log(r7)     // Catch: java.lang.Exception -> L6a
            r6.recordException(r5)     // Catch: java.lang.Exception -> L6a
            r5 = r1
        L60:
            if (r5 == 0) goto L6c
            boolean r5 = r2.add(r5)     // Catch: java.lang.Exception -> L6a
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)     // Catch: java.lang.Exception -> L6a
            goto L6c
        L6a:
            r0 = move-exception
            goto L6f
        L6c:
            int r4 = r4 + 1
            goto L29
        L6f:
            com.google.firebase.crashlytics.FirebaseCrashlytics r2 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            java.lang.String r3 = r0.toString()
            r2.log(r3)
            r2.recordException(r0)
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto La5
            com.blackhub.bronline.game.gui.chat.ChatViewModel r0 = r9.this$0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L91:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel r3 = (com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel) r3
            com.blackhub.bronline.game.gui.chat.model.ChatMessageModel r3 = com.blackhub.bronline.game.gui.chat.ChatViewModel.access$parseMessageItem(r0, r3)
            r1.add(r3)
            goto L91
        La5:
            if (r1 != 0) goto Lab
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        Lab:
            r0 = r1
            com.blackhub.bronline.game.gui.chat.ChatViewModel r1 = r9.this$0
            kotlinx.coroutines.flow.MutableStateFlow r7 = r1.get_uiState()
        Lb2:
            java.lang.Object r8 = r7.getValue()
            r1 = r8
            com.blackhub.bronline.game.gui.chat.ChatUiState r1 = (com.blackhub.bronline.game.gui.chat.ChatUiState) r1
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r10
            r3 = r0
            com.blackhub.bronline.game.gui.chat.ChatUiState r1 = com.blackhub.bronline.game.gui.chat.ChatUiState.copy$default(r1, r2, r3, r4, r5, r6)
            boolean r1 = r7.compareAndSet(r8, r1)
            if (r1 == 0) goto Lb2
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        Lcb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.chat.ChatViewModel$initJson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
