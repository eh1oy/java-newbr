package com.blackhub.bronline.game.gui.socialnetworklink.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SocialNetworkLinkButtonBinding;
import com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SocialButtonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u001c\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000RJ\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter$ViewHolder;", "()V", "allButtons", "", "Lcom/blackhub/bronline/game/gui/socialnetworklink/data/SocialButtonObj;", "onButtonClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "buttonId", "Landroid/view/View;", SVG.View.NODE_NAME, "", "getOnButtonClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnButtonClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemCount", "initButtons", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocialButtonAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public List<SocialButtonObj> allButtons = CollectionsKt__CollectionsKt.emptyList();
    public Function2<? super Integer, ? super View, Unit> onButtonClickListener;

    @NotNull
    public final Function2<Integer, View, Unit> getOnButtonClickListener() {
        Function2 function2 = this.onButtonClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onButtonClickListener");
        return null;
    }

    public final void setOnButtonClickListener(@NotNull Function2<? super Integer, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onButtonClickListener = function2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initButtons(@NotNull List<SocialButtonObj> allButtons) {
        Intrinsics.checkNotNullParameter(allButtons, "allButtons");
        if (this.allButtons.size() != allButtons.size()) {
            this.allButtons = allButtons;
            notifyDataSetChanged();
        }
    }

    /* compiled from: SocialButtonAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SocialNetworkLinkButtonBinding;", "(Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter;Lcom/blackhub/bronline/databinding/SocialNetworkLinkButtonBinding;)V", "bind", "", "buttonItem", "Lcom/blackhub/bronline/game/gui/socialnetworklink/data/SocialButtonObj;", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SocialNetworkLinkButtonBinding binding;
        public final /* synthetic */ SocialButtonAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SocialButtonAdapter socialButtonAdapter, SocialNetworkLinkButtonBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = socialButtonAdapter;
            this.binding = binding;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter$ViewHolder$$ExternalSyntheticLambda0.<init>(com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj, com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        public final void bind(@org.jetbrains.annotations.NotNull com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj r8) {
            /*
                r7 = this;
                java.lang.String r0 = "buttonItem"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                com.blackhub.bronline.databinding.SocialNetworkLinkButtonBinding r0 = r7.binding
                com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter r1 = r7.this$0
                androidx.constraintlayout.widget.ConstraintLayout r2 = r0.getRoot()
                android.content.Context r2 = r2.getContext()
                r3 = 2130771993(0x7f010019, float:1.7147092E38)
                android.view.animation.AnimationUtils.loadAnimation(r2, r3)
                int r3 = r8.isActive()
                r4 = 1
                r5 = 4
                r6 = 0
                if (r3 != r4) goto L61
                android.view.View r3 = r0.socialNetworkLinkButtonBorder
                r4 = 2131232947(0x7f0808b3, float:1.8082018E38)
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.view.View r3 = r0.socialNetworkLinkButtonAura
                r3.setVisibility(r6)
                android.widget.TextView r3 = r0.socialNetworkLinkButtonName
                r4 = 2131232932(0x7f0808a4, float:1.8081987E38)
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.view.View r3 = r0.socialNetworkLinkButtonIcon
                int r4 = r8.getButtonResIdIfActive()
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.widget.TextView r3 = r0.socialNetworkLinkButtonName
                r4 = 2131100877(0x7f0604cd, float:1.7814148E38)
                int r2 = androidx.core.content.ContextCompat.getColor(r2, r4)
                r3.setTextColor(r2)
                android.view.View r2 = r0.socialNetworkLinkButtonBgColorNotActive
                r2.setVisibility(r5)
                android.view.View r2 = r0.socialNetworkLinkButtonBgStyleNotActive
                r2.setVisibility(r5)
                goto La1
            L61:
                android.view.View r3 = r0.socialNetworkLinkButtonBorder
                r4 = 2131232948(0x7f0808b4, float:1.808202E38)
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.view.View r3 = r0.socialNetworkLinkButtonAura
                r3.setVisibility(r5)
                android.widget.TextView r3 = r0.socialNetworkLinkButtonName
                r4 = 2131232834(0x7f080842, float:1.8081788E38)
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.view.View r3 = r0.socialNetworkLinkButtonIcon
                int r4 = r8.getButtonResIdIfNotActive()
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r3.setBackground(r4)
                android.widget.TextView r3 = r0.socialNetworkLinkButtonName
                r4 = 2131099741(0x7f06005d, float:1.7811844E38)
                int r2 = androidx.core.content.ContextCompat.getColor(r2, r4)
                r3.setTextColor(r2)
                android.view.View r2 = r0.socialNetworkLinkButtonBgColorNotActive
                r2.setVisibility(r6)
                android.view.View r2 = r0.socialNetworkLinkButtonBgStyleNotActive
                r2.setVisibility(r6)
            La1:
                android.widget.TextView r2 = r0.socialNetworkLinkButtonName
                java.lang.String r3 = r8.getButtonName()
                r2.setText(r3)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
                com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter$ViewHolder$$ExternalSyntheticLambda0 r2 = new com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter$ViewHolder$$ExternalSyntheticLambda0
                r2.<init>()
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter.ViewHolder.bind(com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj):void");
        }

        public static final void bind$lambda$1$lambda$0(SocialButtonObj buttonItem, SocialButtonAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(buttonItem, "$buttonItem");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (buttonItem.isActive() == 1) {
                Function2<Integer, View, Unit> onButtonClickListener = this$0.getOnButtonClickListener();
                Integer valueOf = Integer.valueOf(buttonItem.getButtonId());
                Intrinsics.checkNotNull(view);
                onButtonClickListener.invoke(valueOf, view);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SocialNetworkLinkButtonBinding inflate = SocialNetworkLinkButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.allButtons.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.allButtons.size();
    }
}
