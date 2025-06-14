package com.blackhub.bronline.launcher.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blackhub.bronline.R;
import com.blackhub.bronline.databinding.LauncherDialogNotEnoughSpaceBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PhoneDoesntSupportGameDialog.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/blackhub/bronline/launcher/dialogs/PhoneDoesNotSupportGameDialog;", "Lcom/blackhub/bronline/game/common/DialogNoNavBarFullScreen;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/blackhub/bronline/databinding/LauncherDialogNotEnoughSpaceBinding;", "getContentView", "Landroid/view/View;", "initListeners", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneDoesntSupportGameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneDoesntSupportGameDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PhoneDoesNotSupportGameDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,36:1\n1#2:37\n41#3,2:38\n*S KotlinDebug\n*F\n+ 1 PhoneDoesntSupportGameDialog.kt\ncom/blackhub/bronline/launcher/dialogs/PhoneDoesNotSupportGameDialog\n*L\n23#1:38,2\n*E\n"})
/* loaded from: classes4.dex */
public final class PhoneDoesNotSupportGameDialog extends DialogNoNavBarFullScreen {
    public static final int $stable = 8;

    @NotNull
    public final Context _context;

    @NotNull
    public final LauncherDialogNotEnoughSpaceBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneDoesNotSupportGameDialog(@NotNull Context _context) {
        super(_context);
        Intrinsics.checkNotNullParameter(_context, "_context");
        this._context = _context;
        Object systemService = _context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LauncherDialogNotEnoughSpaceBinding inflate = LauncherDialogNotEnoughSpaceBinding.inflate((LayoutInflater) systemService);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
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
        setCancelable(false);
        Activity scanForActivity = UtilsKt.scanForActivity(this._context);
        if (scanForActivity != null) {
            setOwnerActivity(scanForActivity);
        }
        LauncherDialogNotEnoughSpaceBinding launcherDialogNotEnoughSpaceBinding = this.binding;
        launcherDialogNotEnoughSpaceBinding.textViewNotEnoughSpaceTitle.setText(getContext().getString(R.string.common_error));
        launcherDialogNotEnoughSpaceBinding.textViewNeedToFree.setText(getContext().getString(R.string.launcher_your_phone_is_low));
        launcherDialogNotEnoughSpaceBinding.buttonNo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.launcher.dialogs.PhoneDoesNotSupportGameDialog$$ExternalSyntheticLambda0
            public /* synthetic */ PhoneDoesNotSupportGameDialog$$ExternalSyntheticLambda0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneDoesNotSupportGameDialog.initListeners$lambda$2$lambda$1(PhoneDoesNotSupportGameDialog.this, view);
            }
        });
    }

    public static final void initListeners$lambda$2$lambda$1(PhoneDoesNotSupportGameDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.dialogs.PhoneDoesNotSupportGameDialog$initListeners$2$1$1
            public PhoneDoesNotSupportGameDialog$initListeners$2$1$1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                PhoneDoesNotSupportGameDialog.this.dismiss();
                Activity ownerActivity = PhoneDoesNotSupportGameDialog.this.getOwnerActivity();
                if (ownerActivity != null) {
                    ownerActivity.finish();
                }
            }
        });
        view.startAnimation(this$0.getAnim());
    }
}
