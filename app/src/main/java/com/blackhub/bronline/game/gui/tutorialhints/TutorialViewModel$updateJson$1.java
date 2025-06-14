package com.blackhub.bronline.game.gui.tutorialhints;

import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TutorialViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$updateJson$1", f = "TutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n230#2,5:261\n230#2,5:266\n230#2,5:271\n230#2,5:279\n230#2,5:284\n230#2,5:289\n1864#3,3:276\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$updateJson$1\n*L\n147#1:261,5\n155#1:266,5\n166#1:271,5\n192#1:279,5\n205#1:284,5\n215#1:289,5\n183#1:276,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialViewModel$updateJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public int label;
    public final /* synthetic */ TutorialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialViewModel$updateJson$1(JSONObject jSONObject, TutorialViewModel tutorialViewModel, Continuation<? super TutorialViewModel$updateJson$1> continuation) {
        super(2, continuation);
        this.$json = jSONObject;
        this.this$0 = tutorialViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TutorialViewModel$updateJson$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TutorialViewModel$updateJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TutorialEnum tutorialEnum;
        TutorialUiState value;
        TutorialUiState copy;
        List emptyList;
        TutorialUiState value2;
        TutorialUiState copy2;
        List<Integer> mutableIntList;
        TutorialUiState value3;
        TutorialUiState copy3;
        TutorialUiState value4;
        TutorialUiState copy4;
        TutorialUiState value5;
        TutorialUiState copy5;
        TutorialUiState value6;
        TutorialUiState copy6;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int optInt = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
        int optInt2 = this.$json.optInt("t", -1);
        int optInt3 = this.$json.optInt("m");
        if (optInt2 == 1 || optInt2 == 2) {
            tutorialEnum = TutorialEnum.TASKS;
        } else if (optInt2 == 4) {
            tutorialEnum = TutorialEnum.NONE;
        } else {
            tutorialEnum = TutorialEnum.GUIDE;
        }
        TutorialEnum tutorialEnum2 = tutorialEnum;
        if (IntExtensionKt.isNotZero(Boxing.boxInt(optInt))) {
            int optInt4 = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
            if (optInt4 == 1) {
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value5 = mutableStateFlow.getValue();
                    copy5 = r3.copy((r22 & 1) != 0 ? r3.avatarNumber : 0, (r22 & 2) != 0 ? r3.hintScreenType : null, (r22 & 4) != 0 ? r3.hintTitle : null, (r22 & 8) != 0 ? r3.hintDesc : null, (r22 & 16) != 0 ? r3.mainTask : null, (r22 & 32) != 0 ? r3.additionalTasksList : null, (r22 & 64) != 0 ? r3.isNewVersionVisible : false, (r22 & 128) != 0 ? r3.isInterfaceVisible : false, (r22 & 256) != 0 ? r3.isNeedClose : false, (r22 & 512) != 0 ? value5.isBlockingLoading : false);
                } while (!mutableStateFlow.compareAndSet(value5, copy5));
            } else if (optInt4 == 9) {
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value6 = mutableStateFlow2.getValue();
                    copy6 = r3.copy((r22 & 1) != 0 ? r3.avatarNumber : 0, (r22 & 2) != 0 ? r3.hintScreenType : null, (r22 & 4) != 0 ? r3.hintTitle : null, (r22 & 8) != 0 ? r3.hintDesc : null, (r22 & 16) != 0 ? r3.mainTask : null, (r22 & 32) != 0 ? r3.additionalTasksList : null, (r22 & 64) != 0 ? r3.isNewVersionVisible : false, (r22 & 128) != 0 ? r3.isInterfaceVisible : true, (r22 & 256) != 0 ? r3.isNeedClose : false, (r22 & 512) != 0 ? value6.isBlockingLoading : false);
                } while (!mutableStateFlow2.compareAndSet(value6, copy6));
            }
        } else if (IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(optInt2))) {
            if (optInt2 == 0) {
                String optString = this.$json.optString("s");
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow3.getValue();
                    Intrinsics.checkNotNull(optString);
                    copy = r6.copy((r22 & 1) != 0 ? r6.avatarNumber : optInt3, (r22 & 2) != 0 ? r6.hintScreenType : tutorialEnum2, (r22 & 4) != 0 ? r6.hintTitle : null, (r22 & 8) != 0 ? r6.hintDesc : optString, (r22 & 16) != 0 ? r6.mainTask : null, (r22 & 32) != 0 ? r6.additionalTasksList : null, (r22 & 64) != 0 ? r6.isNewVersionVisible : false, (r22 & 128) != 0 ? r6.isInterfaceVisible : false, (r22 & 256) != 0 ? r6.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
                } while (!mutableStateFlow3.compareAndSet(value, copy));
            } else if (optInt2 == 1) {
                JSONArray optJSONArray = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY);
                if (optJSONArray == null || (mutableIntList = JsonArrayExtensionKt.toMutableIntList(optJSONArray)) == null || (emptyList = Util.toImmutableList(mutableIntList)) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                if ((!emptyList.isEmpty()) && (!this.this$0.get_uiState().getValue().getAdditionalTasksList().isEmpty())) {
                    TutorialViewModel tutorialViewModel = this.this$0;
                    int i = 0;
                    for (Object obj2 : emptyList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(HintQuestData.m7196copy42QJj7c$default(tutorialViewModel.get_uiState().getValue().getAdditionalTasksList().get(i), null, ((Number) obj2).intValue(), 0, 0L, false, 29, null));
                        i = i2;
                    }
                }
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow4 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow4.getValue();
                    copy2 = r6.copy((r22 & 1) != 0 ? r6.avatarNumber : optInt3, (r22 & 2) != 0 ? r6.hintScreenType : tutorialEnum2, (r22 & 4) != 0 ? r6.hintTitle : null, (r22 & 8) != 0 ? r6.hintDesc : null, (r22 & 16) != 0 ? r6.mainTask : null, (r22 & 32) != 0 ? r6.additionalTasksList : arrayList, (r22 & 64) != 0 ? r6.isNewVersionVisible : false, (r22 & 128) != 0 ? r6.isInterfaceVisible : false, (r22 & 256) != 0 ? r6.isNeedClose : false, (r22 & 512) != 0 ? value2.isBlockingLoading : false);
                } while (!mutableStateFlow4.compareAndSet(value2, copy2));
            } else if (optInt2 == 2) {
                HintQuestData m7196copy42QJj7c$default = HintQuestData.m7196copy42QJj7c$default(this.this$0.get_uiState().getValue().getMainTask(), null, this.$json.optInt("mt"), 0, 0L, false, 29, null);
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow5 = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow5.getValue();
                    copy3 = r6.copy((r22 & 1) != 0 ? r6.avatarNumber : optInt3, (r22 & 2) != 0 ? r6.hintScreenType : tutorialEnum2, (r22 & 4) != 0 ? r6.hintTitle : null, (r22 & 8) != 0 ? r6.hintDesc : null, (r22 & 16) != 0 ? r6.mainTask : m7196copy42QJj7c$default, (r22 & 32) != 0 ? r6.additionalTasksList : null, (r22 & 64) != 0 ? r6.isNewVersionVisible : false, (r22 & 128) != 0 ? r6.isInterfaceVisible : false, (r22 & 256) != 0 ? r6.isNeedClose : false, (r22 & 512) != 0 ? value3.isBlockingLoading : false);
                } while (!mutableStateFlow5.compareAndSet(value3, copy3));
            } else if (optInt2 == 4) {
                MutableStateFlow<? extends TutorialUiState> mutableStateFlow6 = this.this$0.get_uiState();
                do {
                    value4 = mutableStateFlow6.getValue();
                    copy4 = r3.copy((r22 & 1) != 0 ? r3.avatarNumber : 0, (r22 & 2) != 0 ? r3.hintScreenType : null, (r22 & 4) != 0 ? r3.hintTitle : null, (r22 & 8) != 0 ? r3.hintDesc : null, (r22 & 16) != 0 ? r3.mainTask : null, (r22 & 32) != 0 ? r3.additionalTasksList : null, (r22 & 64) != 0 ? r3.isNewVersionVisible : false, (r22 & 128) != 0 ? r3.isInterfaceVisible : false, (r22 & 256) != 0 ? r3.isNeedClose : true, (r22 & 512) != 0 ? value4.isBlockingLoading : false);
                } while (!mutableStateFlow6.compareAndSet(value4, copy4));
            }
        }
        return Unit.INSTANCE;
    }
}
