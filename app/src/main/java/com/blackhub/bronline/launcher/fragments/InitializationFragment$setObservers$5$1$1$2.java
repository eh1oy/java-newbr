package com.blackhub.bronline.launcher.fragments;

import androidx.fragment.app.FragmentActivity;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: InitializationFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationFragment$setObservers$5$1$1$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ InitializationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationFragment$setObservers$5$1$1$2(InitializationFragment initializationFragment) {
        super(0);
        this.this$0 = initializationFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UtilsKt.crashlyticsLog("LauncherMarketUpdateAvailableDialog onCancelButtonClickListener site");
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
