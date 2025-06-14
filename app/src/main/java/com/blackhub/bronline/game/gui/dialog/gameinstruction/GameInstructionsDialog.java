package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.databinding.DialogGameInstructionsBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GameInstructionsDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapterGameInstructions", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/AdapterGameInstructions;", "getAdapterGameInstructions", "()Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/AdapterGameInstructions;", "adapterGameInstructions$delegate", "Lkotlin/Lazy;", "binding", "Lcom/blackhub/bronline/databinding/DialogGameInstructionsBinding;", "listItem", "", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "resultDismissCallback", "Lkotlin/Function0;", "", "getContentView", "Landroid/view/View;", "initListeners", "Companion", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGameInstructionsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameInstructionsDialog.kt\ncom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public final class GameInstructionsDialog extends DialogNoNavBarFullScreen {

    /* renamed from: adapterGameInstructions$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapterGameInstructions;

    @NotNull
    public final DialogGameInstructionsBinding binding;

    @NotNull
    public List<GameInstructionsItem> listItem;

    @NotNull
    public Function0<Unit> resultDismissCallback;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameInstructionsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DialogGameInstructionsBinding inflate = DialogGameInstructionsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.listItem = CollectionsKt__CollectionsKt.emptyList();
        this.adapterGameInstructions = LazyKt__LazyJVMKt.lazy(new Function0<AdapterGameInstructions>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$adapterGameInstructions$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AdapterGameInstructions invoke() {
                List list;
                list = GameInstructionsDialog.this.listItem;
                return new AdapterGameInstructions(list);
            }
        });
        this.resultDismissCallback = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$resultDismissCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: GameInstructionsDialog.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog$Companion;", "", "()V", "create", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "context", "Landroid/content/Context;", "listItem", "", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "resultDismissCallback", "Lkotlin/Function0;", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GameInstructionsDialog create(@NotNull Context context, @NotNull List<GameInstructionsItem> listItem, @NotNull Function0<Unit> resultDismissCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            Intrinsics.checkNotNullParameter(resultDismissCallback, "resultDismissCallback");
            GameInstructionsDialog gameInstructionsDialog = new GameInstructionsDialog(context);
            gameInstructionsDialog.listItem = listItem;
            gameInstructionsDialog.resultDismissCallback = resultDismissCallback;
            return gameInstructionsDialog;
        }
    }

    public final AdapterGameInstructions getAdapterGameInstructions() {
        return (AdapterGameInstructions) this.adapterGameInstructions.getValue();
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        int size = this.listItem.size() > 1 ? this.listItem.size() : 0;
        Activity scanForActivity = UtilsKt.scanForActivity(getContext());
        if (scanForActivity != null) {
            setOwnerActivity(scanForActivity);
        }
        setCancelable(true);
        final DialogGameInstructionsBinding dialogGameInstructionsBinding = this.binding;
        ViewPager2 viewPager2 = dialogGameInstructionsBinding.vpGameInstructions;
        viewPager2.setAdapter(getAdapterGameInstructions());
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$initListeners$2$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                DialogGameInstructionsBinding.this.anyViewIndicator.setCurrentPosition(position);
            }
        });
        DotViewIndicator dotViewIndicator = dialogGameInstructionsBinding.anyViewIndicator;
        dotViewIndicator.setItemCount(size);
        dotViewIndicator.setCurrentPosition(0);
        dialogGameInstructionsBinding.btnClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameInstructionsDialog.initListeners$lambda$5$lambda$3(GameInstructionsDialog.this, view);
            }
        });
        dialogGameInstructionsBinding.imgGameHintBack.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameInstructionsDialog.initListeners$lambda$5$lambda$4(GameInstructionsDialog.this, view);
            }
        });
    }

    public static final void initListeners$lambda$5$lambda$3(final GameInstructionsDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(250L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$initListeners$2$3$1
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
                    Function0 function0;
                    function0 = GameInstructionsDialog.this.resultDismissCallback;
                    function0.invoke();
                    GameInstructionsDialog.this.dismiss();
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$5$lambda$4(GameInstructionsDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resultDismissCallback.invoke();
        this$0.dismiss();
    }
}
