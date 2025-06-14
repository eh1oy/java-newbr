package com.blackhub.bronline.game.gui.electric.ui;

import androidx.appcompat.widget.AppCompatImageView;
import com.blackhub.bronline.databinding.FragmentCollectSchemeBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: CollectSchemeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$setRandom$1", f = "CollectSchemeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCollectSchemeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment$setRandom$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1549#2:339\n1620#2,3:340\n*S KotlinDebug\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment$setRandom$1\n*L\n166#1:335\n166#1:336,3\n169#1:339\n169#1:340,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeFragment$setRandom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ CollectSchemeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectSchemeFragment$setRandom$1(CollectSchemeFragment collectSchemeFragment, Continuation<? super CollectSchemeFragment$setRandom$1> continuation) {
        super(2, continuation);
        this.this$0 = collectSchemeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CollectSchemeFragment$setRandom$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CollectSchemeFragment$setRandom$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FragmentCollectSchemeBinding binding;
        int mapIvToInt;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            binding = this.this$0.getBinding();
            CollectSchemeFragment collectSchemeFragment = this.this$0;
            int random = RangesKt___RangesKt.random(new IntRange(3, 6), Random.INSTANCE);
            List shuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt__CollectionsKt.mutableListOf(binding.ivCollectSchemeBulbColorSchemeOneOne, binding.ivCollectSchemeBulbColorSchemeOneTwo, binding.ivCollectSchemeBulbColorSchemeOneThree, binding.ivCollectSchemeBulbColorSchemeOneFour, binding.ivCollectSchemeBulbColorSchemeOneFive, binding.ivCollectSchemeBulbColorSchemeTwoOne, binding.ivCollectSchemeBulbColorSchemeTwoTwo, binding.ivCollectSchemeBulbColorSchemeTwoThree, binding.ivCollectSchemeBulbColorSchemeTwoFour, binding.ivCollectSchemeBulbColorSchemeTwoFive));
            Intrinsics.checkNotNull(shuffled, "null cannot be cast to non-null type kotlin.collections.MutableList<@[EnhancedNullability] androidx.appcompat.widget.AppCompatImageView>");
            List asMutableList = TypeIntrinsics.asMutableList(shuffled);
            for (int i = 0; i < random; i++) {
                CollectionsKt__MutableCollectionsKt.removeLast(asMutableList);
            }
            if (!asMutableList.contains(binding.ivCollectSchemeBulbColorSchemeOneOne)) {
                asMutableList.add(binding.ivCollectSchemeBulbColorSchemeOneOne);
            }
            List<AppCompatImageView> list = asMutableList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (AppCompatImageView appCompatImageView : list) {
                Intrinsics.checkNotNull(appCompatImageView);
                collectSchemeFragment.setBulbColorToggleOn(appCompatImageView);
                arrayList.add(Unit.INSTANCE);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mapIvToInt = collectSchemeFragment.mapIvToInt(((AppCompatImageView) it.next()).getId());
                arrayList2.add(Boxing.boxInt(mapIvToInt));
            }
            collectSchemeFragment.listElementScheme = CollectionsKt___CollectionsKt.sorted(arrayList2);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
