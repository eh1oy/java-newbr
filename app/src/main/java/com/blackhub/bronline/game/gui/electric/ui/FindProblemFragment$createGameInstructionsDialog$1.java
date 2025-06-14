package com.blackhub.bronline.game.gui.electric.ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: FindProblemFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FindProblemFragment$createGameInstructionsDialog$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public FindProblemFragment$createGameInstructionsDialog$1(Object obj) {
        super(0, obj, FindProblemViewModel.class, "closeInstruction", "closeInstruction()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FindProblemViewModel) this.receiver).closeInstruction();
    }
}
