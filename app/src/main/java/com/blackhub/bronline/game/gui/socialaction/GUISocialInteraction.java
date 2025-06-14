package com.blackhub.bronline.game.gui.socialaction;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.SocialInteractionBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUISocialInteraction.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\bH\u0016J\u0006\u0010&\u001a\u00020\bJ\u0006\u0010'\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\bJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0016J\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0012\u00101\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0002J\u0016\u00105\u001a\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002J\u0016\u00108\u001a\u00020!2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/blackhub/bronline/game/gui/socialaction/GUISocialInteraction;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/SocialInteractionBinding;", "()V", "actionWithJson", "Lcom/blackhub/bronline/game/gui/socialaction/network/ActionWithJSON;", "actualIdsArray", "", "", "actualListWithActions", "Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteraction;", "allListWithActions", "", "logicSetView", "Lcom/blackhub/bronline/game/gui/socialaction/SetViewByValueOfActions;", "mainViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "minTimerForBlock", "", "playerInOrganization", "playersId", "playersNick", "", "thisListWithCommunicationMain", "thisListWithOrganizationMain", "thisListWithSocialMain", "thisPage", "thisType", "getActualListWithAction", "", "getAllParameters", "json", "Lorg/json/JSONObject;", "getGuiId", "getPlayersId", "getPlayersNick", "getStatusInOrganization", "getThisListWithCommunicationMain", "getThisListWithOrganizationMain", "getThisListWithSocialMain", "getViewBinding", "initSocialInteractionsFromJson", "initViewsISAMPGUI", "newBackPress", "onDestroyView", "onPacketIncoming", "setLogicForClick", "type", Const.PAGE_KEY, "setMultipleLists", "setNullableParameters", "setStartParameters", "splitList", "actionsList", "updatePageOrBackToMain", "thisButton", "Landroid/widget/TextView;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGUISocialInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISocialInteraction.kt\ncom/blackhub/bronline/game/gui/socialaction/GUISocialInteraction\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,429:1\n172#2,9:430\n*S KotlinDebug\n*F\n+ 1 GUISocialInteraction.kt\ncom/blackhub/bronline/game/gui/socialaction/GUISocialInteraction\n*L\n50#1:430,9\n*E\n"})
/* loaded from: classes3.dex */
public final class GUISocialInteraction extends BaseISAMPGUIFragment<SocialInteractionBinding> {
    public static final int $stable = 8;

    @Nullable
    public ActionWithJSON actionWithJson;

    @Nullable
    public SetViewByValueOfActions logicSetView;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;
    public int playerInOrganization;
    public int playersId;
    public int thisPage;
    public int thisType = 4;

    @NotNull
    public List<SocialInteraction> thisListWithOrganizationMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> thisListWithSocialMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> thisListWithCommunicationMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> actualListWithActions = new ArrayList();

    @NotNull
    public List<Integer> actualIdsArray = new ArrayList();

    @NotNull
    public List<SocialInteraction> allListWithActions = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public String playersNick = "";
    public final long minTimerForBlock = 1500;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 36;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer valueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            getAllParameters(json);
            setStartParameters();
        }
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final int getPlayersId() {
        return this.playersId;
    }

    /* renamed from: getStatusInOrganization, reason: from getter */
    public final int getPlayerInOrganization() {
        return this.playerInOrganization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.actionWithJson = new ActionWithJSON();
        final SocialInteractionBinding socialInteractionBinding = (SocialInteractionBinding) getBinding();
        getAllParameters(getJsonObj());
        initSocialInteractionsFromJson();
        JNILib.toggleDrawing2dStuff(true);
        ImageView closeInteraction = socialInteractionBinding.closeInteraction;
        Intrinsics.checkNotNullExpressionValue(closeInteraction, "closeInteraction");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, closeInteraction, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GUISocialInteraction.this.closeFragment();
            }
        }, 1, null);
        socialInteractionBinding.bgSocialInteraction.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISocialInteraction.initViewsISAMPGUI$lambda$1$lambda$0(GUISocialInteraction.this, view);
            }
        });
        TextView buttonWithNickname = socialInteractionBinding.buttonWithNickname;
        Intrinsics.checkNotNullExpressionValue(buttonWithNickname, "buttonWithNickname");
        setOnClickListenerWithAnimAndDelay(buttonWithNickname, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ActionWithJSON actionWithJSON;
                actionWithJSON = GUISocialInteraction.this.actionWithJson;
                if (actionWithJSON != null) {
                    actionWithJSON.sendIfCloseOrChangePlayer(2);
                }
                Log.v(SocialConstants.LOG_TAG, "кнопка для смены никнейма и ид, чтобы переоткрыть интерфейс");
            }
        });
        TextView button1 = socialInteractionBinding.button1;
        Intrinsics.checkNotNullExpressionValue(button1, "button1");
        setOnClickListenerWithAnimAndDelay(button1, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                r1 = r2.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r2 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_1"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L15
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton1()
                    goto L16
                L15:
                    r0 = 0
                L16:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L2a
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L2a
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L2a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$4.invoke2():void");
            }
        });
        TextView button2 = socialInteractionBinding.button2;
        Intrinsics.checkNotNullExpressionValue(button2, "button2");
        setOnClickListenerWithAnimAndDelay(button2, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
            
                r1 = r3.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r3 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_2"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    r1 = 4
                    if (r0 != r1) goto L51
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getPlayerInOrganization$p(r0)
                    r1 = 1
                    if (r0 != r1) goto L51
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    java.util.List r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisListWithCommunicationMain$p(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L35
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto L73
                    java.lang.String r1 = "В текущем типе взаимодействия отсутствуют доступные команды"
                    r0.sendMessageError(r1)
                    goto L73
                L35:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 3
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisType$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 0
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r1, r2)
                    goto L73
                L51:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L5e
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton2()
                    goto L5f
                L5e:
                    r0 = 0
                L5f:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L73
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L73
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L73:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$5.invoke2():void");
            }
        });
        TextView button3 = socialInteractionBinding.button3;
        Intrinsics.checkNotNullExpressionValue(button3, "button3");
        setOnClickListenerWithAnimAndDelay(button3, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
            
                r0 = r5.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r5 = this;
                    java.lang.String r0 = "кнопка_3"
                    java.lang.String r1 = "LOG_SOCIAL"
                    android.util.Log.v(r1, r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    r2 = 4
                    if (r0 != r2) goto L52
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getPlayerInOrganization$p(r0)
                    if (r0 != 0) goto L52
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    java.util.List r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisListWithCommunicationMain$p(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L35
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto Lcb
                    java.lang.String r1 = "В текущем типе взаимодействия отсутствуют доступные команды"
                    r0.sendMessageError(r1)
                    goto Lcb
                L35:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 3
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisType$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 0
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r1, r2)
                    goto Lcb
                L52:
                    com.blackhub.bronline.databinding.SocialInteractionBinding r0 = r2
                    android.widget.TextView r0 = r0.button3
                    java.lang.CharSequence r0 = r0.getText()
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    android.content.Context r2 = r2.getContext()
                    r3 = 0
                    if (r2 == 0) goto L6b
                    r4 = 2131887837(0x7f1206dd, float:1.9410292E38)
                    java.lang.CharSequence r2 = r2.getText(r4)
                    goto L6c
                L6b:
                    r2 = r3
                L6c:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r0 == 0) goto Lab
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r0)
                    int r2 = r2 + 1
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r3 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r3 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r3)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r2, r3)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r0)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "thisPage = "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    android.util.Log.v(r1, r0)
                    goto Lcb
                Lab:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto Lb7
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r3 = r0.getActionFromButton3()
                Lb7:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r3)
                    if (r3 == 0) goto Lcb
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto Lcb
                    int r1 = r3.getId()
                    r0.sendPressButton(r1)
                Lcb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$6.invoke2():void");
            }
        });
        TextView button4 = socialInteractionBinding.button4;
        Intrinsics.checkNotNullExpressionValue(button4, "button4");
        setOnClickListenerWithAnimAndDelay(button4, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
            
                r1 = r3.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r3 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_4"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    r1 = 4
                    if (r0 != r1) goto L51
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getPlayerInOrganization$p(r0)
                    r1 = 1
                    if (r0 != r1) goto L51
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    java.util.List r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisListWithSocialMain$p(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L35
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto L81
                    java.lang.String r1 = "В текущем типе взаимодействия отсутствуют доступные команды"
                    r0.sendMessageError(r1)
                    goto L81
                L35:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 2
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisType$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 0
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r1, r2)
                    goto L81
                L51:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.databinding.SocialInteractionBinding r1 = r2
                    android.widget.TextView r1 = r1.button4
                    java.lang.String r2 = "button4"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$updatePageOrBackToMain(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L6c
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton4()
                    goto L6d
                L6c:
                    r0 = 0
                L6d:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L81
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L81
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L81:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$7.invoke2():void");
            }
        });
        TextView button5 = socialInteractionBinding.button5;
        Intrinsics.checkNotNullExpressionValue(button5, "button5");
        setOnClickListenerWithAnimAndDelay(button5, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
            
                r1 = r3.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r3 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_5"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    r1 = 4
                    if (r0 != r1) goto L50
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getPlayerInOrganization$p(r0)
                    if (r0 != 0) goto L50
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    java.util.List r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisListWithSocialMain$p(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L34
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto L80
                    java.lang.String r1 = "В текущем типе взаимодействия отсутствуют доступные команды"
                    r0.sendMessageError(r1)
                    goto L80
                L34:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 2
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisType$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 0
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r1, r2)
                    goto L80
                L50:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.databinding.SocialInteractionBinding r1 = r2
                    android.widget.TextView r1 = r1.button5
                    java.lang.String r2 = "button5"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$updatePageOrBackToMain(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L6b
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton5()
                    goto L6c
                L6b:
                    r0 = 0
                L6c:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L80
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L80
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L80:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$8.invoke2():void");
            }
        });
        TextView button6 = socialInteractionBinding.button6;
        Intrinsics.checkNotNullExpressionValue(button6, "button6");
        setOnClickListenerWithAnimAndDelay(button6, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
            
                r1 = r3.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r3 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_6"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    r1 = 4
                    if (r0 != r1) goto L50
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getPlayerInOrganization$p(r0)
                    r1 = 1
                    if (r0 != r1) goto L50
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    java.util.List r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisListWithOrganizationMain$p(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L35
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r0)
                    if (r0 == 0) goto L72
                    java.lang.String r1 = "В текущем типе взаимодействия отсутствуют доступные команды"
                    r0.sendMessageError(r1)
                    goto L72
                L35:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisType$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    r1 = 0
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setThisPage$p(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisType$p(r0)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    int r2 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getThisPage$p(r2)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$setLogicForClick(r0, r1, r2)
                    goto L72
                L50:
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L5d
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton6()
                    goto L5e
                L5d:
                    r0 = 0
                L5e:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L72
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L72
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L72:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$9.invoke2():void");
            }
        });
        TextView button7 = socialInteractionBinding.button7;
        Intrinsics.checkNotNullExpressionValue(button7, "button7");
        setOnClickListenerWithAnimAndDelay(button7, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                r1 = r2.this$0.actionWithJson;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r2 = this;
                    java.lang.String r0 = "LOG_SOCIAL"
                    java.lang.String r1 = "кнопка_7"
                    android.util.Log.v(r0, r1)
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.SetViewByValueOfActions r0 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getLogicSetView$p(r0)
                    if (r0 == 0) goto L15
                    com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction r0 = r0.getActionFromButton7()
                    goto L16
                L15:
                    r0 = 0
                L16:
                    com.blackhub.bronline.game.gui.socialaction.SocialUtilsKt.logThisAction(r0)
                    if (r0 == 0) goto L2a
                    com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.this
                    com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON r1 = com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.access$getActionWithJson$p(r1)
                    if (r1 == 0) goto L2a
                    int r0 = r0.getId()
                    r1.sendPressButton(r0)
                L2a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$10.invoke2():void");
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$1$lambda$0(GUISocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeFragment();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public SocialInteractionBinding getViewBinding() {
        SocialInteractionBinding inflate = SocialInteractionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void initSocialInteractionsFromJson() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GUISocialInteraction$initSocialInteractionsFromJson$1(this, null), 3, null);
    }

    public final void setMultipleLists(List<SocialInteraction> allListWithActions) {
        this.thisListWithOrganizationMain.clear();
        this.thisListWithSocialMain.clear();
        this.thisListWithCommunicationMain.clear();
        for (SocialInteraction socialInteraction : allListWithActions) {
            int type = socialInteraction.getType();
            if (type == 1) {
                this.thisListWithOrganizationMain.add(socialInteraction);
            } else if (type == 2) {
                this.thisListWithSocialMain.add(socialInteraction);
            } else if (type == 3) {
                this.thisListWithCommunicationMain.add(socialInteraction);
            }
        }
    }

    public final void splitList(List<SocialInteraction> actionsList) {
        if (actionsList.size() > 6) {
            int size = actionsList.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 5; i3 < size; i3++) {
                actionsList.get(i3).setPage(1);
                i2++;
            }
            if (i2 > 6) {
                int size2 = actionsList.size();
                for (int i4 = 10; i4 < size2; i4++) {
                    actionsList.get(i4).setPage(2);
                    i++;
                }
                if (i > 6) {
                    int size3 = actionsList.size();
                    for (int i5 = 15; i5 < size3; i5++) {
                        actionsList.get(i5).setPage(3);
                    }
                }
            }
        }
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithOrganizationMain() {
        return this.thisListWithOrganizationMain;
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithSocialMain() {
        return this.thisListWithSocialMain;
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithCommunicationMain() {
        return this.thisListWithCommunicationMain;
    }

    public final void setLogicForClick(int type, int page) {
        SetViewByValueOfActions setViewByValueOfActions = this.logicSetView;
        if (setViewByValueOfActions != null) {
            setViewByValueOfActions.updateButtonsText(type, page);
        }
    }

    public final void updatePageOrBackToMain(TextView thisButton) {
        CharSequence text = thisButton.getText();
        Context context = getContext();
        if (Intrinsics.areEqual(text, context != null ? context.getText(R.string.common_back) : null)) {
            int i = this.thisPage;
            if (i > 0) {
                int i2 = i - 1;
                this.thisPage = i2;
                setLogicForClick(this.thisType, i2);
                Log.v(SocialConstants.LOG_TAG, "thisPage = " + this.thisPage);
                return;
            }
            this.thisType = 4;
            SetViewByValueOfActions setViewByValueOfActions = this.logicSetView;
            if (setViewByValueOfActions != null) {
                setViewByValueOfActions.setStartButtons(this.playersNick, this.playersId, this.playerInOrganization);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        JNILib.toggleDrawing2dStuff(false);
        ActionWithJSON actionWithJSON = this.actionWithJson;
        if (actionWithJSON != null) {
            actionWithJSON.sendIfCloseOrChangePlayer(1);
        }
        setNullableParameters();
        super.onDestroyView();
    }

    public final void getAllParameters(JSONObject json) {
        if (json != null) {
            String optString = json.optString("n");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            this.playersNick = optString;
            this.playersId = json.optInt("id");
            this.playerInOrganization = json.optInt("w");
            JSONArray optJSONArray = json.optJSONArray("ai");
            if (optJSONArray != null) {
                this.actualIdsArray.clear();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.actualIdsArray.add(Integer.valueOf(Integer.parseInt(optJSONArray.get(i).toString())));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setStartParameters() {
        getActualListWithAction();
        setMultipleLists(this.actualListWithActions);
        splitList(this.thisListWithOrganizationMain);
        splitList(this.thisListWithSocialMain);
        splitList(this.thisListWithCommunicationMain);
        SetViewByValueOfActions setViewByValueOfActions = new SetViewByValueOfActions(this, (SocialInteractionBinding) getBinding());
        this.logicSetView = setViewByValueOfActions;
        this.thisType = 4;
        setViewByValueOfActions.setStartButtons(this.playersNick, this.playersId, this.playerInOrganization);
    }

    public final void getActualListWithAction() {
        Iterator<Integer> it = this.actualIdsArray.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            Iterator<SocialInteraction> it2 = this.allListWithActions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    SocialInteraction next = it2.next();
                    if (intValue == next.getId()) {
                        this.actualListWithActions.add(next);
                        break;
                    }
                }
            }
        }
    }

    private final void setNullableParameters() {
        this.logicSetView = null;
        this.actionWithJson = null;
        this.thisListWithOrganizationMain.clear();
        this.thisListWithSocialMain.clear();
        this.thisListWithCommunicationMain.clear();
        this.actualListWithActions.clear();
    }

    public GUISocialInteraction() {
        final Function0 function0 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity requireActivity = GUISocialInteraction.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(requireActivity).get(JNIActivityViewModel.class);
            }
        });
    }
}
