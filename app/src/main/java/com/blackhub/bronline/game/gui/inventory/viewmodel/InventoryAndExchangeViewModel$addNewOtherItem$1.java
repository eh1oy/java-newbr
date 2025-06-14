package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel$addNewOtherItem$1", f = "InventoryAndExchangeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInventoryAndExchangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryAndExchangeViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel$addNewOtherItem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
/* loaded from: classes3.dex */
public final class InventoryAndExchangeViewModel$addNewOtherItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<InvItems> $allItemsFromJSON;
    public final /* synthetic */ int $newItemId;
    public final /* synthetic */ int $newItemValue;
    public final /* synthetic */ String $newPlateNumber;
    public int label;
    public final /* synthetic */ InventoryAndExchangeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryAndExchangeViewModel$addNewOtherItem$1(InventoryAndExchangeViewModel inventoryAndExchangeViewModel, String str, List<InvItems> list, int i, int i2, Continuation<? super InventoryAndExchangeViewModel$addNewOtherItem$1> continuation) {
        super(2, continuation);
        this.this$0 = inventoryAndExchangeViewModel;
        this.$newPlateNumber = str;
        this.$allItemsFromJSON = list;
        this.$newItemId = i;
        this.$newItemValue = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InventoryAndExchangeViewModel$addNewOtherItem$1(this.this$0, this.$newPlateNumber, this.$allItemsFromJSON, this.$newItemId, this.$newItemValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InventoryAndExchangeViewModel$addNewOtherItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        Object obj2;
        Object obj3;
        Object obj4;
        InvItems invItems;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        Object obj5;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableLiveData = this.this$0.mutableOtherExchangeItems;
                List list = (List) mutableLiveData.getValue();
                String str = this.$newPlateNumber;
                if (str == null) {
                    str = "";
                }
                List<InvItems> list2 = this.$allItemsFromJSON;
                int i = this.$newItemId;
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (((InvItems) obj3).getId() == i) {
                        break;
                    }
                }
                InvItems invItems2 = (InvItems) obj3;
                if (invItems2 != null) {
                    int i2 = this.$newItemId;
                    int i3 = this.$newItemValue;
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.this$0;
                    InvItems finalItem = InventoryUtilsKt.getFinalItem(invItems2, 0);
                    if (list != null) {
                        if (i2 == 58) {
                            finalItem.setTextIfException(String.valueOf(i3));
                            finalItem.setItemsValue(1);
                        } else {
                            if (i2 != 59) {
                                if (i2 == 134) {
                                    finalItem.setItemsValue(1);
                                    finalItem.setModelid(i3);
                                } else {
                                    switch (i2) {
                                        case 81:
                                        case 82:
                                        case 83:
                                            break;
                                        default:
                                            finalItem.setItemsValue(i3);
                                            finalItem.setTextIfException(str);
                                            break;
                                    }
                                }
                            }
                            finalItem.setItemsValue(1);
                            finalItem.setTextIfException(str);
                        }
                        finalItem.setWhoseItem(2);
                        if (finalItem.getFold() == 0) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj5 = it2.next();
                                    if (((InvItems) obj5).getId() == finalItem.getId()) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            invItems = (InvItems) obj5;
                        } else {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj4 = it3.next();
                                    if (((InvItems) obj4).getItemsValue() == 0) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            invItems = (InvItems) obj4;
                        }
                        if (invItems == null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next = it4.next();
                                    if (((InvItems) next).getItemsValue() == 0) {
                                        obj2 = next;
                                    }
                                }
                            }
                            invItems = (InvItems) obj2;
                        }
                        int indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends InvItems>) list, invItems);
                        if (indexOf != -1) {
                            list.set(indexOf, finalItem);
                            mutableLiveData3 = inventoryAndExchangeViewModel.mutableOtherExchangeItems;
                            mutableLiveData3.postValue(list);
                            mutableLiveData4 = inventoryAndExchangeViewModel.mutableOtherExchangeItemPos;
                            mutableLiveData4.postValue(Boxing.boxInt(indexOf));
                        }
                        mutableLiveData2 = inventoryAndExchangeViewModel.mutableNewMessage;
                        String str2 = (String) UtilsKt.buildTypeMerge(finalItem.get_name(), finalItem.get_nameStore());
                        mutableLiveData2.postValue(new InvMessageObj(false, 2, "", 1, str2 == null ? "" : str2, 0));
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
