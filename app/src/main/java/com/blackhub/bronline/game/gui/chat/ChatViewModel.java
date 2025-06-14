package com.blackhub.bronline.game.gui.chat;

import android.text.SpannedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageModel;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageServerModel;
import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ChatViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/blackhub/bronline/game/gui/chat/ChatViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/chat/ChatUiState;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "onButtonSendClick", "text", "", "parseMessageItem", "Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageModel;", "serverMessageModel", "Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageServerModel;", "sendOnVoteClick", "updateJson", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,109:1\n28#2:110\n*S KotlinDebug\n*F\n+ 1 ChatViewModel.kt\ncom/blackhub/bronline/game/gui/chat/ChatViewModel\n*L\n98#1:110\n*E\n"})
/* loaded from: classes3.dex */
public final class ChatViewModel extends BaseViewModel<ChatUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ChatUiState> _uiState;

    @NotNull
    public final ChatActionsWithJson actionsWithJson;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ChatUiState> uiState;

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: ChatViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatMessageTypeEnum.values().length];
            try {
                iArr[ChatMessageTypeEnum.ENEMY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatMessageTypeEnum.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatMessageTypeEnum.MINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public ChatViewModel(@NotNull StringResource stringResource, @NotNull ChatActionsWithJson actionsWithJson) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.stringResource = stringResource;
        this.actionsWithJson = actionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new ChatUiState(0, null, false, 7, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<? extends ChatUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ChatUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ChatViewModel$initJson$1(json, this, null), 1, null);
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new ChatViewModel$updateJson$1(json, this, null), 1, null);
    }

    public final void onButtonSendClick(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewModelExtensionKt.launchOnIO$default(this, null, new ChatViewModel$onButtonSendClick$1(this, text, null), 1, null);
    }

    public final void sendOnVoteClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new ChatViewModel$sendOnVoteClick$1(this, null), 1, null);
    }

    public final ChatMessageModel parseMessageItem(ChatMessageServerModel serverMessageModel) {
        AnnotatedString htmlTextToAnnotatedString;
        ChatMessageTypeEnum fromInt = ChatMessageTypeEnum.INSTANCE.fromInt(serverMessageModel.getType());
        int i = WhenMappings.$EnumSwitchMapping$0[fromInt.ordinal()];
        if (i == 1 || i == 2) {
            String name = serverMessageModel.getName();
            if (name == null) {
                name = "";
            }
            htmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(name);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            htmlTextToAnnotatedString = ComposeExtensionKt.toAnnotatedString(SpannedString.valueOf(getStringResource().getString(R.string.common_you)));
        }
        String message = serverMessageModel.getMessage();
        return new ChatMessageModel(htmlTextToAnnotatedString, message != null ? message : "", fromInt);
    }
}
