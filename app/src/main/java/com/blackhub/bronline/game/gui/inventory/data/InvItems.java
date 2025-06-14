package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: InvItems.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0003\b\u009a\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010&J\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J°\u0002\u0010±\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010²\u0001J\u0015\u0010³\u0001\u001a\u00020\u001d2\t\u0010´\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010¶\u0001\u001a\u00020\u0005HÖ\u0001R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b7\u0010/\"\u0004\b8\u00101R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bL\u0010/\"\u0004\bM\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bN\u0010@\"\u0004\bO\u0010BR\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bR\u0010@\"\u0004\bS\u0010BR\"\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bT\u0010@\"\u0004\bU\u0010BR$\u0010W\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010+\"\u0004\bc\u0010-R$\u0010d\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010i\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR(\u0010l\u001a\u0004\u0018\u00010\u00052\b\u0010V\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010+\"\u0004\bn\u0010-R$\u0010o\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010f\"\u0004\bq\u0010hR$\u0010r\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010f\"\u0004\bt\u0010hR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\bu\u0010/R$\u0010v\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010{\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR%\u0010~\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010x\"\u0005\b\u0080\u0001\u0010zR'\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010+\"\u0005\b\u0083\u0001\u0010-R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u00102\u001a\u0005\b\u0084\u0001\u0010/R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u00102\u001a\u0005\b\u0085\u0001\u0010/R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u00102\u001a\u0005\b\u0086\u0001\u0010/R'\u0010\u0087\u0001\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010Y\"\u0005\b\u0089\u0001\u0010[R'\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010f\"\u0005\b\u008c\u0001\u0010hR'\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010x\"\u0005\b\u008f\u0001\u0010zR'\u0010\u0090\u0001\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0091\u0001\u0010x\"\u0005\b\u0092\u0001\u0010zR'\u0010\u0093\u0001\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010x\"\u0005\b\u0095\u0001\u0010zR'\u0010\u0096\u0001\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010x\"\u0005\b\u0098\u0001\u0010z¨\u0006·\u0001"}, d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "", "_id", "", "_name", "", "_nameStore", "_desc", "_imageName", "_modelid", "_weight", "", "_addw", "_fold", "_shiftX", "", "_shiftY", "_shiftZ", "_x", "_y", "_z", "_zoom", "type", "rarity", "tradeMaxPrice", "_itemsValue", "_textIfException", "_whoseItem", "_check", "", "timeLeftUntilItemDestroy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "get_addw", "()Ljava/lang/Double;", "set_addw", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "get_check", "()Ljava/lang/Boolean;", "set_check", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "get_desc", "()Ljava/lang/String;", "set_desc", "(Ljava/lang/String;)V", "get_fold", "()Ljava/lang/Integer;", "set_fold", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "get_id", "set_id", "get_imageName", "set_imageName", "get_itemsValue", "set_itemsValue", "get_modelid", "set_modelid", "get_name", "set_name", "get_nameStore", "set_nameStore", "get_shiftX", "()Ljava/lang/Float;", "set_shiftX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "get_shiftY", "set_shiftY", "get_shiftZ", "set_shiftZ", "get_textIfException", "set_textIfException", "get_weight", "set_weight", "get_whoseItem", "set_whoseItem", "get_x", "set_x", "get_y", "set_y", "get_z", "set_z", "get_zoom", "set_zoom", "value", "addw", "getAddw", "()D", "setAddw", "(D)V", "check", "getCheck", "()Z", "setCheck", "(Z)V", "desc", "getDesc", "setDesc", "fold", "getFold", "()I", "setFold", "(I)V", "id", "getId", "setId", "imageName", "getImageName", "setImageName", "itemsValue", "getItemsValue", "setItemsValue", "modelid", "getModelid", "setModelid", "getRarity", "shiftX", "getShiftX", "()F", "setShiftX", "(F)V", "shiftY", "getShiftY", "setShiftY", "shiftZ", "getShiftZ", "setShiftZ", "textIfException", "getTextIfException", "setTextIfException", "getTimeLeftUntilItemDestroy", "getTradeMaxPrice", "getType", "weight", "getWeight", "setWeight", "whoseItem", "getWhoseItem", "setWhoseItem", "x", "getX", "setX", "y", "getY", "setY", "z", "getZ", "setZ", "zoom", "getZoom", "setZoom", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "equals", "other", "hashCode", "toString", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InvItems {
    public static final int $stable = 8;

    @SerializedName("addw")
    @Nullable
    public Double _addw;

    @Nullable
    public Boolean _check;

    @SerializedName("desc")
    @Nullable
    public String _desc;

    @SerializedName("fold")
    @Nullable
    public Integer _fold;

    @SerializedName("id")
    @Nullable
    public Integer _id;

    @SerializedName("imageName")
    @Nullable
    public String _imageName;

    @Nullable
    public Integer _itemsValue;

    @SerializedName("modelid")
    @Nullable
    public Integer _modelid;

    @SerializedName("name")
    @Nullable
    public String _name;

    @SerializedName("name_store")
    @Nullable
    public String _nameStore;

    @SerializedName("shiftX")
    @Nullable
    public Float _shiftX;

    @SerializedName("shiftY")
    @Nullable
    public Float _shiftY;

    @SerializedName("shiftZ")
    @Nullable
    public Float _shiftZ;

    @Nullable
    public String _textIfException;

    @SerializedName("weight")
    @Nullable
    public Double _weight;

    @Nullable
    public Integer _whoseItem;

    @SerializedName("x")
    @Nullable
    public Float _x;

    @SerializedName("y")
    @Nullable
    public Float _y;

    @SerializedName("z")
    @Nullable
    public Float _z;

    @SerializedName("zoom")
    @Nullable
    public Float _zoom;

    @SerializedName("rarity")
    @Nullable
    public final Integer rarity;

    @Nullable
    public final Integer timeLeftUntilItemDestroy;

    @SerializedName("tradeMaxPrice")
    @Nullable
    public final Integer tradeMaxPrice;

    @SerializedName("itemType")
    @Nullable
    public final Integer type;

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer get_id() {
        return this._id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Float get_shiftX() {
        return this._shiftX;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Float get_shiftY() {
        return this._shiftY;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Float get_shiftZ() {
        return this._shiftZ;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float get_x() {
        return this._x;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float get_y() {
        return this._y;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Float get_z() {
        return this._z;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Float get_zoom() {
        return this._zoom;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getTradeMaxPrice() {
        return this.tradeMaxPrice;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String get_name() {
        return this._name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer get_itemsValue() {
        return this._itemsValue;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String get_textIfException() {
        return this._textIfException;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer get_whoseItem() {
        return this._whoseItem;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Boolean get_check() {
        return this._check;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getTimeLeftUntilItemDestroy() {
        return this.timeLeftUntilItemDestroy;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String get_nameStore() {
        return this._nameStore;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String get_desc() {
        return this._desc;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String get_imageName() {
        return this._imageName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer get_modelid() {
        return this._modelid;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double get_weight() {
        return this._weight;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double get_addw() {
        return this._addw;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer get_fold() {
        return this._fold;
    }

    @NotNull
    public final InvItems copy(@Nullable Integer _id, @Nullable String _name, @Nullable String _nameStore, @Nullable String _desc, @Nullable String _imageName, @Nullable Integer _modelid, @Nullable Double _weight, @Nullable Double _addw, @Nullable Integer _fold, @Nullable Float _shiftX, @Nullable Float _shiftY, @Nullable Float _shiftZ, @Nullable Float _x, @Nullable Float _y, @Nullable Float _z, @Nullable Float _zoom, @Nullable Integer type, @Nullable Integer rarity, @Nullable Integer tradeMaxPrice, @Nullable Integer _itemsValue, @Nullable String _textIfException, @Nullable Integer _whoseItem, @Nullable Boolean _check, @Nullable Integer timeLeftUntilItemDestroy) {
        return new InvItems(_id, _name, _nameStore, _desc, _imageName, _modelid, _weight, _addw, _fold, _shiftX, _shiftY, _shiftZ, _x, _y, _z, _zoom, type, rarity, tradeMaxPrice, _itemsValue, _textIfException, _whoseItem, _check, timeLeftUntilItemDestroy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvItems)) {
            return false;
        }
        InvItems invItems = (InvItems) other;
        return Intrinsics.areEqual(this._id, invItems._id) && Intrinsics.areEqual(this._name, invItems._name) && Intrinsics.areEqual(this._nameStore, invItems._nameStore) && Intrinsics.areEqual(this._desc, invItems._desc) && Intrinsics.areEqual(this._imageName, invItems._imageName) && Intrinsics.areEqual(this._modelid, invItems._modelid) && Intrinsics.areEqual((Object) this._weight, (Object) invItems._weight) && Intrinsics.areEqual((Object) this._addw, (Object) invItems._addw) && Intrinsics.areEqual(this._fold, invItems._fold) && Intrinsics.areEqual((Object) this._shiftX, (Object) invItems._shiftX) && Intrinsics.areEqual((Object) this._shiftY, (Object) invItems._shiftY) && Intrinsics.areEqual((Object) this._shiftZ, (Object) invItems._shiftZ) && Intrinsics.areEqual((Object) this._x, (Object) invItems._x) && Intrinsics.areEqual((Object) this._y, (Object) invItems._y) && Intrinsics.areEqual((Object) this._z, (Object) invItems._z) && Intrinsics.areEqual((Object) this._zoom, (Object) invItems._zoom) && Intrinsics.areEqual(this.type, invItems.type) && Intrinsics.areEqual(this.rarity, invItems.rarity) && Intrinsics.areEqual(this.tradeMaxPrice, invItems.tradeMaxPrice) && Intrinsics.areEqual(this._itemsValue, invItems._itemsValue) && Intrinsics.areEqual(this._textIfException, invItems._textIfException) && Intrinsics.areEqual(this._whoseItem, invItems._whoseItem) && Intrinsics.areEqual(this._check, invItems._check) && Intrinsics.areEqual(this.timeLeftUntilItemDestroy, invItems.timeLeftUntilItemDestroy);
    }

    public int hashCode() {
        Integer num = this._id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this._name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._nameStore;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._desc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._imageName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this._modelid;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this._weight;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this._addw;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num3 = this._fold;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this._shiftX;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this._shiftY;
        int hashCode11 = (hashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this._shiftZ;
        int hashCode12 = (hashCode11 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this._x;
        int hashCode13 = (hashCode12 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this._y;
        int hashCode14 = (hashCode13 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this._z;
        int hashCode15 = (hashCode14 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this._zoom;
        int hashCode16 = (hashCode15 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Integer num4 = this.type;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rarity;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.tradeMaxPrice;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this._itemsValue;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this._textIfException;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num8 = this._whoseItem;
        int hashCode22 = (hashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool = this._check;
        int hashCode23 = (hashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num9 = this.timeLeftUntilItemDestroy;
        return hashCode23 + (num9 != null ? num9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InvItems(_id=" + this._id + ", _name=" + this._name + ", _nameStore=" + this._nameStore + ", _desc=" + this._desc + ", _imageName=" + this._imageName + ", _modelid=" + this._modelid + ", _weight=" + this._weight + ", _addw=" + this._addw + ", _fold=" + this._fold + ", _shiftX=" + this._shiftX + ", _shiftY=" + this._shiftY + ", _shiftZ=" + this._shiftZ + ", _x=" + this._x + ", _y=" + this._y + ", _z=" + this._z + ", _zoom=" + this._zoom + ", type=" + this.type + ", rarity=" + this.rarity + ", tradeMaxPrice=" + this.tradeMaxPrice + ", _itemsValue=" + this._itemsValue + ", _textIfException=" + this._textIfException + ", _whoseItem=" + this._whoseItem + ", _check=" + this._check + ", timeLeftUntilItemDestroy=" + this.timeLeftUntilItemDestroy + ")";
    }

    public InvItems(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable Double d, @Nullable Double d2, @Nullable Integer num3, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str5, @Nullable Integer num8, @Nullable Boolean bool, @Nullable Integer num9) {
        this._id = num;
        this._name = str;
        this._nameStore = str2;
        this._desc = str3;
        this._imageName = str4;
        this._modelid = num2;
        this._weight = d;
        this._addw = d2;
        this._fold = num3;
        this._shiftX = f;
        this._shiftY = f2;
        this._shiftZ = f3;
        this._x = f4;
        this._y = f5;
        this._z = f6;
        this._zoom = f7;
        this.type = num4;
        this.rarity = num5;
        this.tradeMaxPrice = num6;
        this._itemsValue = num7;
        this._textIfException = str5;
        this._whoseItem = num8;
        this._check = bool;
        this.timeLeftUntilItemDestroy = num9;
    }

    @Nullable
    public final Integer get_id() {
        return this._id;
    }

    public final void set_id(@Nullable Integer num) {
        this._id = num;
    }

    @Nullable
    public final String get_name() {
        return this._name;
    }

    public final void set_name(@Nullable String str) {
        this._name = str;
    }

    @Nullable
    public final String get_nameStore() {
        return this._nameStore;
    }

    public final void set_nameStore(@Nullable String str) {
        this._nameStore = str;
    }

    @Nullable
    public final String get_desc() {
        return this._desc;
    }

    public final void set_desc(@Nullable String str) {
        this._desc = str;
    }

    @Nullable
    public final String get_imageName() {
        return this._imageName;
    }

    public final void set_imageName(@Nullable String str) {
        this._imageName = str;
    }

    @Nullable
    public final Integer get_modelid() {
        return this._modelid;
    }

    public final void set_modelid(@Nullable Integer num) {
        this._modelid = num;
    }

    @Nullable
    public final Double get_weight() {
        return this._weight;
    }

    public final void set_weight(@Nullable Double d) {
        this._weight = d;
    }

    @Nullable
    public final Double get_addw() {
        return this._addw;
    }

    public final void set_addw(@Nullable Double d) {
        this._addw = d;
    }

    @Nullable
    public final Integer get_fold() {
        return this._fold;
    }

    public final void set_fold(@Nullable Integer num) {
        this._fold = num;
    }

    @Nullable
    public final Float get_shiftX() {
        return this._shiftX;
    }

    public final void set_shiftX(@Nullable Float f) {
        this._shiftX = f;
    }

    @Nullable
    public final Float get_shiftY() {
        return this._shiftY;
    }

    public final void set_shiftY(@Nullable Float f) {
        this._shiftY = f;
    }

    @Nullable
    public final Float get_shiftZ() {
        return this._shiftZ;
    }

    public final void set_shiftZ(@Nullable Float f) {
        this._shiftZ = f;
    }

    @Nullable
    public final Float get_x() {
        return this._x;
    }

    public final void set_x(@Nullable Float f) {
        this._x = f;
    }

    @Nullable
    public final Float get_y() {
        return this._y;
    }

    public final void set_y(@Nullable Float f) {
        this._y = f;
    }

    @Nullable
    public final Float get_z() {
        return this._z;
    }

    public final void set_z(@Nullable Float f) {
        this._z = f;
    }

    @Nullable
    public final Float get_zoom() {
        return this._zoom;
    }

    public final void set_zoom(@Nullable Float f) {
        this._zoom = f;
    }

    public /* synthetic */ InvItems(Integer num, String str, String str2, String str3, String str4, Integer num2, Double d, Double d2, Integer num3, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Integer num4, Integer num5, Integer num6, Integer num7, String str5, Integer num8, Boolean bool, Integer num9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, str4, num2, d, d2, num3, f, f2, f3, f4, f5, f6, f7, (i & 65536) != 0 ? 1 : num4, (i & 131072) != 0 ? 1 : num5, (i & 262144) != 0 ? null : num6, (i & 524288) != 0 ? 0 : num7, (i & 1048576) != 0 ? "" : str5, (i & 2097152) != 0 ? 0 : num8, (i & 4194304) != 0 ? Boolean.FALSE : bool, (i & 8388608) != 0 ? null : num9);
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    public final Integer getTradeMaxPrice() {
        return this.tradeMaxPrice;
    }

    @Nullable
    public final Integer get_itemsValue() {
        return this._itemsValue;
    }

    public final void set_itemsValue(@Nullable Integer num) {
        this._itemsValue = num;
    }

    @Nullable
    public final String get_textIfException() {
        return this._textIfException;
    }

    public final void set_textIfException(@Nullable String str) {
        this._textIfException = str;
    }

    @Nullable
    public final Integer get_whoseItem() {
        return this._whoseItem;
    }

    public final void set_whoseItem(@Nullable Integer num) {
        this._whoseItem = num;
    }

    @Nullable
    public final Boolean get_check() {
        return this._check;
    }

    public final void set_check(@Nullable Boolean bool) {
        this._check = bool;
    }

    @Nullable
    public final Integer getTimeLeftUntilItemDestroy() {
        return this.timeLeftUntilItemDestroy;
    }

    public final int getId() {
        Integer num = this._id;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setId(int i) {
        this._id = Integer.valueOf(i);
    }

    @NotNull
    public final String getDesc() {
        String str = this._desc;
        return str == null ? "" : str;
    }

    public final void setDesc(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._desc = value;
    }

    @Nullable
    public final String getImageName() {
        return this._imageName;
    }

    public final void setImageName(@Nullable String str) {
        this._imageName = str;
    }

    public final int getModelid() {
        Integer num = this._modelid;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setModelid(int i) {
        this._modelid = Integer.valueOf(i);
    }

    public final double getWeight() {
        Double d = this._weight;
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public final void setWeight(double d) {
        this._weight = Double.valueOf(d);
    }

    public final double getAddw() {
        Double d = this._addw;
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public final void setAddw(double d) {
        this._addw = Double.valueOf(d);
    }

    public final int getFold() {
        Integer num = this._fold;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setFold(int i) {
        this._fold = Integer.valueOf(i);
    }

    public final float getShiftX() {
        Float f = this._shiftX;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setShiftX(float f) {
        this._shiftX = Float.valueOf(f);
    }

    public final float getShiftY() {
        Float f = this._shiftY;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setShiftY(float f) {
        this._shiftY = Float.valueOf(f);
    }

    public final float getShiftZ() {
        Float f = this._shiftZ;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setShiftZ(float f) {
        this._shiftZ = Float.valueOf(f);
    }

    public final float getX() {
        Float f = this._x;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setX(float f) {
        this._x = Float.valueOf(f);
    }

    public final float getY() {
        Float f = this._y;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setY(float f) {
        this._y = Float.valueOf(f);
    }

    public final float getZ() {
        Float f = this._z;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setZ(float f) {
        this._z = Float.valueOf(f);
    }

    public final float getZoom() {
        Float f = this._zoom;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final void setZoom(float f) {
        this._zoom = Float.valueOf(f);
    }

    public final int getItemsValue() {
        Integer num = this._itemsValue;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setItemsValue(int i) {
        this._itemsValue = Integer.valueOf(i);
    }

    @NotNull
    public final String getTextIfException() {
        String str = this._textIfException;
        return str == null ? "" : str;
    }

    public final void setTextIfException(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._textIfException = value;
    }

    public final int getWhoseItem() {
        Integer num = this._whoseItem;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setWhoseItem(int i) {
        this._whoseItem = Integer.valueOf(i);
    }

    public final boolean getCheck() {
        Boolean bool = this._check;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setCheck(boolean z) {
        this._check = Boolean.valueOf(z);
    }
}
