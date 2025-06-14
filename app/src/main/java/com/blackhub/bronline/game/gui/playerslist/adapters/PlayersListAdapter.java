package com.blackhub.bronline.game.gui.playerslist.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.PlayersListItemBinding;
import com.blackhub.bronline.game.gui.playerslist.data.PlayersData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlayersListAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001#B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u001c\u0010\u001b\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0016J\u0014\u0010\"\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000RJ\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder;", "Landroid/widget/Filterable;", "playersData", "", "Lcom/blackhub/bronline/game/gui/playerslist/data/PlayersData;", "(Ljava/util/List;)V", "clickedPosition", "", "lPlayersData", "lPlayersDataCopy", "onClickListenerPlayersList", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "playersName", "getPosition", "", "getOnClickListenerPlayersList", "()Lkotlin/jvm/functions/Function2;", "setOnClickListenerPlayersList", "(Lkotlin/jvm/functions/Function2;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataInAdapter", "PlayersListHolder", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayersListAdapter extends RecyclerView.Adapter<PlayersListHolder> implements Filterable {
    public static final int $stable = 8;
    public int clickedPosition;

    @NotNull
    public List<PlayersData> lPlayersData;

    @NotNull
    public List<PlayersData> lPlayersDataCopy;
    public Function2<? super String, ? super Integer, Unit> onClickListenerPlayersList;

    public PlayersListAdapter(@NotNull List<PlayersData> playersData) {
        Intrinsics.checkNotNullParameter(playersData, "playersData");
        this.clickedPosition = -1;
        this.lPlayersData = playersData;
        this.lPlayersDataCopy = playersData;
    }

    @NotNull
    public final Function2<String, Integer, Unit> getOnClickListenerPlayersList() {
        Function2 function2 = this.onClickListenerPlayersList;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onClickListenerPlayersList");
        return null;
    }

    public final void setOnClickListenerPlayersList(@NotNull Function2<? super String, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onClickListenerPlayersList = function2;
    }

    public final void setDataInAdapter(@NotNull List<PlayersData> playersData) {
        Intrinsics.checkNotNullParameter(playersData, "playersData");
        this.lPlayersData = playersData;
        this.lPlayersDataCopy = playersData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PlayersListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PlayersListItemBinding inflate = PlayersListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PlayersListHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PlayersListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.lPlayersData.size();
    }

    /* compiled from: PlayersListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/PlayersListItemBinding;", "(Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter;Lcom/blackhub/bronline/databinding/PlayersListItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/PlayersListItemBinding;", "bind", "", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlayersListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayersListAdapter.kt\ncom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n*S KotlinDebug\n*F\n+ 1 PlayersListAdapter.kt\ncom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter$PlayersListHolder\n*L\n63#1:131,2\n*E\n"})
    public final class PlayersListHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final PlayersListItemBinding binding;
        public final /* synthetic */ PlayersListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayersListHolder(@NotNull PlayersListAdapter playersListAdapter, PlayersListItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = playersListAdapter;
            this.binding = binding;
        }

        @NotNull
        public final PlayersListItemBinding getBinding() {
            return this.binding;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$PlayersListHolder$$ExternalSyntheticLambda0.<init>(com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter, com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$PlayersListHolder):void, class status: GENERATED_AND_UNLOADED
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
        public final void bind() {
            /*
                r7 = this;
                com.blackhub.bronline.databinding.PlayersListItemBinding r0 = r7.binding
                com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter r1 = r7.this$0
                androidx.constraintlayout.widget.ConstraintLayout r2 = r0.getRoot()
                android.content.Context r2 = r2.getContext()
                androidx.constraintlayout.widget.ConstraintLayout r3 = r0.getRoot()
                com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$PlayersListHolder$$ExternalSyntheticLambda0 r4 = new com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$PlayersListHolder$$ExternalSyntheticLambda0
                r4.<init>()
                r3.setOnClickListener(r4)
                java.util.List r1 = com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter.access$getLPlayersData$p(r1)
                int r3 = r7.getLayoutPosition()
                java.lang.Object r1 = r1.get(r3)
                com.blackhub.bronline.game.gui.playerslist.data.PlayersData r1 = (com.blackhub.bronline.game.gui.playerslist.data.PlayersData) r1
                int r3 = r1.getPlayerLevel()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                r4 = 2131886649(0x7f120239, float:1.9407883E38)
                java.lang.String r3 = r2.getString(r4, r3)
                java.lang.String r4 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                int r5 = r1.getPing()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                r6 = 2131887771(0x7f12069b, float:1.9410158E38)
                java.lang.String r5 = r2.getString(r6, r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
                android.widget.TextView r4 = r0.playerId
                int r6 = r1.getId()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r4.setText(r6)
                android.widget.TextView r4 = r0.playerName
                java.lang.String r6 = r1.getName()
                r4.setText(r6)
                android.widget.TextView r4 = r0.playerLevel
                r4.setText(r3)
                android.widget.TextView r3 = r0.playerPing
                r3.setText(r5)
                boolean r1 = r1.getIsClicked()
                if (r1 != 0) goto L89
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
                r1 = 2131232713(0x7f0807c9, float:1.8081543E38)
                android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r1)
                r0.setBackground(r1)
                goto L97
            L89:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getRoot()
                r1 = 2131232921(0x7f080899, float:1.8081965E38)
                android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r1)
                r0.setBackground(r1)
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter.PlayersListHolder.bind():void");
        }

        public static final void bind$lambda$2$lambda$1(PlayersListAdapter this$0, PlayersListHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            PlayersData playersData = (PlayersData) this$0.lPlayersData.get(this$1.getLayoutPosition());
            if (this$0.clickedPosition >= 0) {
                if (this$0.clickedPosition < this$0.lPlayersData.size()) {
                    ((PlayersData) this$0.lPlayersData.get(this$0.clickedPosition)).setClicked(false);
                    this$0.notifyItemChanged(this$0.clickedPosition);
                } else {
                    for (PlayersData playersData2 : this$0.lPlayersData) {
                        if (playersData2.getIsClicked()) {
                            playersData2.setClicked(false);
                        }
                    }
                    this$0.notifyDataSetChanged();
                }
            }
            this$0.clickedPosition = this$1.getLayoutPosition();
            playersData.setClicked(true);
            this$0.notifyItemChanged(this$1.getLayoutPosition());
            this$0.getOnClickListenerPlayersList().invoke(playersData.getName(), Integer.valueOf(this$1.getLayoutPosition()));
        }
    }

    @Override // android.widget.Filterable
    @NotNull
    public Filter getFilter() {
        return new Filter() { // from class: com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter$getFilter$1
            public PlayersListAdapter$getFilter$1() {
            }

            @Override // android.widget.Filter
            @NotNull
            public Filter.FilterResults performFiltering(@NotNull CharSequence charSequence) {
                List<PlayersData> list;
                List list2;
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                String obj = charSequence.toString();
                List arrayList = new ArrayList();
                if (obj.length() == 0) {
                    list2 = PlayersListAdapter.this.lPlayersDataCopy;
                    Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
                    arrayList = TypeIntrinsics.asMutableList(list2);
                } else {
                    list = PlayersListAdapter.this.lPlayersDataCopy;
                    for (PlayersData playersData : list) {
                        String name = playersData.getName();
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                        String lowerCase = name.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        Locale locale2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                        String lowerCase2 = obj.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                            arrayList.add(playersData);
                        }
                    }
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = arrayList;
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(@NotNull CharSequence charSequence, @NotNull Filter.FilterResults filterResults) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                Intrinsics.checkNotNullParameter(filterResults, "filterResults");
                PlayersListAdapter playersListAdapter = PlayersListAdapter.this;
                Object obj = filterResults.values;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.playerslist.data.PlayersData>");
                playersListAdapter.lPlayersData = (List) obj;
                PlayersListAdapter.this.notifyDataSetChanged();
            }
        };
    }
}
