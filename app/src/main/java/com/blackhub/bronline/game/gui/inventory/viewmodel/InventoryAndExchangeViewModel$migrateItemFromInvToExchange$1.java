package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InventoryAndExchangeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInventoryAndExchangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryAndExchangeViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $itemPos;
    public final /* synthetic */ int $itemValue;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, int i, int i2, Continuation<? super InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$itemPos = i;
        this.$itemValue = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1(this.this$0, this.$itemPos, this.$itemValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$migrateItemFromInvToExchange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        Object obj2;
        InvItems invItems;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        MutableLiveData mutableLiveData8;
        Object obj3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableInvItems;
                List list = (List) mutableLiveData.getValue();
                mutableLiveData2 = this.this$0.mutableMyExchangeItems;
                List list2 = (List) mutableLiveData2.getValue();
                mutableLiveData3 = this.this$0.mutableOldPosFromInv;
                List list3 = (List) mutableLiveData3.getValue();
                if (list != null) {
                    int i = this.$itemPos;
                    int i2 = this.$itemValue;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    if (list2 != null && list3 != null) {
                        Object obj4 = list.get(i);
                        Object obj5 = null;
                        if (((InvItems) obj4).getFold() == 0) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (((InvItems) obj3).getId() == ((InvItems) obj4).getId()) {
                                    break;
                                }
                            }
                            invItems = (InvItems) obj3;
                        } else {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (((InvItems) obj2).getItemsValue() == 0) {
                                    break;
                                }
                            }
                            invItems = (InvItems) obj2;
                        }
                        if (invItems == null) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                if (((InvItems) next).getItemsValue() == 0) {
                                    obj5 = next;
                                    break;
                                }
                            }
                            invItems = (InvItems) obj5;
                        }
                        int indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends InvItems>) list2, invItems);
                        InvItems finalItem = InventoryUtilsKt.getFinalItem((InvItems) obj4, (invItems != null ? invItems.getItemsValue() : 0) + i2);
                        finalItem.setWhoseItem(1);
                        InvItems invItems2 = (InvItems) obj4;
                        invItems2.setItemsValue(invItems2.getItemsValue() - i2);
                        int itemsValue = ((InvItems) obj4).getItemsValue();
                        Object obj6 = obj4;
                        if (itemsValue == 0) {
                            InvItems emptyItem = InventoryUtilsKt.emptyItem();
                            emptyItem.setWhoseItem(0);
                            obj6 = emptyItem;
                        }
                        if (indexOf != -1) {
                            list2.set(indexOf, finalItem);
                            list.set(i, obj6);
                            list3.set(indexOf, Boxing.boxInt(i));
                            mutableLiveData4 = inventoryAndExchangeViewModel.mutableMyExchangeItems;
                            mutableLiveData4.postValue(list2);
                            mutableLiveData5 = inventoryAndExchangeViewModel.mutableInvItems;
                            mutableLiveData5.postValue(list);
                            mutableLiveData6 = inventoryAndExchangeViewModel.mutableOldPosFromInv;
                            mutableLiveData6.postValue(list3);
                            mutableLiveData7 = inventoryAndExchangeViewModel.mutableMyExchangeItemPos;
                            mutableLiveData7.postValue(Boxing.boxInt(indexOf));
                            mutableLiveData8 = inventoryAndExchangeViewModel.mutableOldInvPosition;
                            mutableLiveData8.postValue(Boxing.boxInt(i));
                        }
                    }
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
