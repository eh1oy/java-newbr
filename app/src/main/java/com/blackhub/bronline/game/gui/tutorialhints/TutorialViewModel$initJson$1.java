package com.blackhub.bronline.game.gui.tutorialhints;

import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$initJson$1", f = "TutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$initJson$1\n*L\n115#1:261,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialViewModel$initJson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TutorialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialViewModel$initJson$1(TutorialViewModel tutorialViewModel, JSONObject jSONObject, Continuation<? super TutorialViewModel$initJson$1> continuation) {
        super(2, continuation);
        this.this$0 = tutorialViewModel;
        this.$json = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TutorialViewModel$initJson$1 tutorialViewModel$initJson$1 = new TutorialViewModel$initJson$1(this.this$0, this.$json, continuation);
        tutorialViewModel$initJson$1.L$0 = obj;
        return tutorialViewModel$initJson$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TutorialViewModel$initJson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TutorialEnum tutorialEnum;
        List emptyList;
        List emptyList2;
        List emptyList3;
        List emptyList4;
        TutorialUiState value;
        TutorialUiState copy;
        List<String> mutableStringList;
        List<Integer> mutableIntList;
        List<Integer> mutableIntList2;
        List<String> mutableStringList2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int integer$default = PreferencesRepository.getInteger$default(this.this$0.getPreferencesRepository(), NewMenuConstants.HUD_VERSION, 0, 2, null);
        int optInt = this.$json.optInt("t");
        int optInt2 = this.$json.optInt("m");
        String optString = this.$json.optString("h", AnyExtensionKt.empty(coroutineScope));
        String optString2 = this.$json.optString("s", AnyExtensionKt.empty(coroutineScope));
        String optString3 = this.$json.optString(TutorialKeys.TUTORIAL_MAIN_TASK_NAME_KEY, AnyExtensionKt.empty(coroutineScope));
        int optInt3 = this.$json.optInt("mt");
        int optInt4 = this.$json.optInt("ma");
        String optString4 = this.$json.optString(TutorialKeys.TUTORIAL_MAIN_TASK_COLOR_KEY, Other.COLOR_DEFAULT_STRING);
        JSONArray optJSONArray = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_TITLE_LIST_KEY);
        JSONArray optJSONArray2 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY);
        JSONArray optJSONArray3 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_MAX_LIST_KEY);
        JSONArray optJSONArray4 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_COLOR_LIST_KEY);
        if (optInt == 4) {
            tutorialEnum = TutorialEnum.TASKS;
        } else {
            tutorialEnum = TutorialEnum.GUIDE;
        }
        if (optJSONArray == null || (mutableStringList2 = JsonArrayExtensionKt.toMutableStringList(optJSONArray)) == null || (emptyList = Util.toImmutableList(mutableStringList2)) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = emptyList;
        if (optJSONArray2 == null || (mutableIntList2 = JsonArrayExtensionKt.toMutableIntList(optJSONArray2)) == null || (emptyList2 = Util.toImmutableList(mutableIntList2)) == null) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = emptyList2;
        if (optJSONArray3 == null || (mutableIntList = JsonArrayExtensionKt.toMutableIntList(optJSONArray3)) == null || (emptyList3 = Util.toImmutableList(mutableIntList)) == null) {
            emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list3 = emptyList3;
        if (optJSONArray4 == null || (mutableStringList = JsonArrayExtensionKt.toMutableStringList(optJSONArray4)) == null || (emptyList4 = Util.toImmutableList(mutableStringList)) == null) {
            emptyList4 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list4 = emptyList4;
        ArrayList arrayList = new ArrayList();
        BooleanExtensionKt.ifTrue(Boxing.boxBoolean((list.isEmpty() ^ true) && (list2.isEmpty() ^ true) && (list3.isEmpty() ^ true)), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$initJson$1.1
            public final /* synthetic */ List<String> $additionalTasksColorList;
            public final /* synthetic */ List<HintQuestData> $additionalTasksList;
            public final /* synthetic */ List<Integer> $additionalTasksProgressList;
            public final /* synthetic */ List<Integer> $additionalTasksProgressMaxList;
            public final /* synthetic */ List<String> $additionalTasksTextList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<String> list5, List<String> list42, List<Integer> list22, List<Integer> list32, List<HintQuestData> arrayList2) {
                super(0);
                r1 = list5;
                r2 = list42;
                r3 = list22;
                r4 = list32;
                r5 = arrayList2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                int size = r1.size();
                for (int i = 0; i < size; i++) {
                    r5.add(new HintQuestData(StringExtensionKt.htmlStringToSpanned(r1.get(i)), r3.get(i).intValue(), r4.get(i).intValue(), StringExtensionKt.m6851tryToColorInt0Yiz4hI$default(r2.get(i), null, 1, null), false, null));
                }
            }
        });
        Intrinsics.checkNotNull(optString4);
        long m6851tryToColorInt0Yiz4hI$default = StringExtensionKt.m6851tryToColorInt0Yiz4hI$default(optString4, null, 1, null);
        boolean z = integer$default == 1;
        MutableStateFlow<? extends TutorialUiState> mutableStateFlow = this.this$0.get_uiState();
        do {
            value = mutableStateFlow.getValue();
            Intrinsics.checkNotNull(optString);
            Intrinsics.checkNotNull(optString2);
            Intrinsics.checkNotNull(optString3);
            copy = r8.copy((r22 & 1) != 0 ? r8.avatarNumber : optInt2, (r22 & 2) != 0 ? r8.hintScreenType : tutorialEnum, (r22 & 4) != 0 ? r8.hintTitle : optString, (r22 & 8) != 0 ? r8.hintDesc : optString2, (r22 & 16) != 0 ? r8.mainTask : new HintQuestData(StringExtensionKt.htmlStringToSpanned(optString3), optInt3, optInt4, m6851tryToColorInt0Yiz4hI$default, false, 16, null), (r22 & 32) != 0 ? r8.additionalTasksList : arrayList2, (r22 & 64) != 0 ? r8.isNewVersionVisible : z, (r22 & 128) != 0 ? r8.isInterfaceVisible : false, (r22 & 256) != 0 ? r8.isNeedClose : false, (r22 & 512) != 0 ? value.isBlockingLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        return Unit.INSTANCE;
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$initJson$1$1 */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<String> $additionalTasksColorList;
        public final /* synthetic */ List<HintQuestData> $additionalTasksList;
        public final /* synthetic */ List<Integer> $additionalTasksProgressList;
        public final /* synthetic */ List<Integer> $additionalTasksProgressMaxList;
        public final /* synthetic */ List<String> $additionalTasksTextList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list5, List<String> list42, List<Integer> list22, List<Integer> list32, List<HintQuestData> arrayList2) {
            super(0);
            r1 = list5;
            r2 = list42;
            r3 = list22;
            r4 = list32;
            r5 = arrayList2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                r5.add(new HintQuestData(StringExtensionKt.htmlStringToSpanned(r1.get(i)), r3.get(i).intValue(), r4.get(i).intValue(), StringExtensionKt.m6851tryToColorInt0Yiz4hI$default(r2.get(i), null, 1, null), false, null));
            }
        }
    }
}
