package com.blackhub.bronline;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.databinding.BrTaxiCommentBindingImpl;
import com.blackhub.bronline.databinding.FragmentChangeBulbBindingImpl;
import com.blackhub.bronline.databinding.FragmentCollectSchemeBindingImpl;
import com.blackhub.bronline.databinding.FragmentElectricGuiBindingImpl;
import com.blackhub.bronline.databinding.FragmentFindProblemBindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame10BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame1BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame2BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame3BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame3BindingSw600dpImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame3BindingSw600dpNotlongImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame4BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame5BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame6BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame7BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame8BindingImpl;
import com.blackhub.bronline.databinding.FragmentGasmanGame9BindingImpl;
import com.blackhub.bronline.databinding.FragmentMenuSettingWinterBindingImpl;
import com.blackhub.bronline.databinding.FragmentNotificationBindingImpl;
import com.blackhub.bronline.databinding.FragmentRaiseChargeBindingImpl;
import com.blackhub.bronline.databinding.FragmentSumContactsBindingImpl;
import com.blackhub.bronline.databinding.FragmentTaxiBindingImpl;
import com.blackhub.bronline.databinding.FragmentTaxiMapBindingImpl;
import com.blackhub.bronline.databinding.FragmentTutorialGuiBindingImpl;
import com.blackhub.bronline.databinding.SocialNetworkLinkLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    public static final int LAYOUT_BRTAXICOMMENT = 1;
    public static final int LAYOUT_FRAGMENTCHANGEBULB = 2;
    public static final int LAYOUT_FRAGMENTCOLLECTSCHEME = 3;
    public static final int LAYOUT_FRAGMENTELECTRICGUI = 4;
    public static final int LAYOUT_FRAGMENTFINDPROBLEM = 5;
    public static final int LAYOUT_FRAGMENTGASMANGAME1 = 6;
    public static final int LAYOUT_FRAGMENTGASMANGAME10 = 7;
    public static final int LAYOUT_FRAGMENTGASMANGAME2 = 8;
    public static final int LAYOUT_FRAGMENTGASMANGAME3 = 9;
    public static final int LAYOUT_FRAGMENTGASMANGAME4 = 10;
    public static final int LAYOUT_FRAGMENTGASMANGAME5 = 11;
    public static final int LAYOUT_FRAGMENTGASMANGAME6 = 12;
    public static final int LAYOUT_FRAGMENTGASMANGAME7 = 13;
    public static final int LAYOUT_FRAGMENTGASMANGAME8 = 14;
    public static final int LAYOUT_FRAGMENTGASMANGAME9 = 15;
    public static final int LAYOUT_FRAGMENTMENUSETTINGWINTER = 16;
    public static final int LAYOUT_FRAGMENTNOTIFICATION = 17;
    public static final int LAYOUT_FRAGMENTRAISECHARGE = 18;
    public static final int LAYOUT_FRAGMENTSUMCONTACTS = 19;
    public static final int LAYOUT_FRAGMENTTAXI = 20;
    public static final int LAYOUT_FRAGMENTTAXIMAP = 21;
    public static final int LAYOUT_FRAGMENTTUTORIALGUI = 22;
    public static final int LAYOUT_SOCIALNETWORKLINKLAYOUT = 23;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(23);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.br_taxi_comment, 1);
        sparseIntArray.put(R.layout.fragment_change_bulb, 2);
        sparseIntArray.put(R.layout.fragment_collect_scheme, 3);
        sparseIntArray.put(R.layout.fragment_electric_gui, 4);
        sparseIntArray.put(R.layout.fragment_find_problem, 5);
        sparseIntArray.put(R.layout.fragment_gasman_game_1, 6);
        sparseIntArray.put(R.layout.fragment_gasman_game_10, 7);
        sparseIntArray.put(R.layout.fragment_gasman_game_2, 8);
        sparseIntArray.put(R.layout.fragment_gasman_game_3, 9);
        sparseIntArray.put(R.layout.fragment_gasman_game_4, 10);
        sparseIntArray.put(R.layout.fragment_gasman_game_5, 11);
        sparseIntArray.put(R.layout.fragment_gasman_game_6, 12);
        sparseIntArray.put(R.layout.fragment_gasman_game_7, 13);
        sparseIntArray.put(R.layout.fragment_gasman_game_8, 14);
        sparseIntArray.put(R.layout.fragment_gasman_game_9, 15);
        sparseIntArray.put(R.layout.fragment_menu_setting_winter, 16);
        sparseIntArray.put(R.layout.fragment_notification, 17);
        sparseIntArray.put(R.layout.fragment_raise_charge, 18);
        sparseIntArray.put(R.layout.fragment_sum_contacts, 19);
        sparseIntArray.put(R.layout.fragment_taxi, 20);
        sparseIntArray.put(R.layout.fragment_taxi_map, 21);
        sparseIntArray.put(R.layout.fragment_tutorial_gui, 22);
        sparseIntArray.put(R.layout.social_network_link_layout, 23);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int i = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (i <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i) {
            case 1:
                if ("layout/br_taxi_comment_0".equals(tag)) {
                    return new BrTaxiCommentBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for br_taxi_comment is invalid. Received: " + tag);
            case 2:
                if ("layout/fragment_change_bulb_0".equals(tag)) {
                    return new FragmentChangeBulbBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_change_bulb is invalid. Received: " + tag);
            case 3:
                if ("layout/fragment_collect_scheme_0".equals(tag)) {
                    return new FragmentCollectSchemeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collect_scheme is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_electric_gui_0".equals(tag)) {
                    return new FragmentElectricGuiBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_electric_gui is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_find_problem_0".equals(tag)) {
                    return new FragmentFindProblemBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_find_problem is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_gasman_game_1_0".equals(tag)) {
                    return new FragmentGasmanGame1BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_1 is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_gasman_game_10_0".equals(tag)) {
                    return new FragmentGasmanGame10BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_10 is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_gasman_game_2_0".equals(tag)) {
                    return new FragmentGasmanGame2BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_2 is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_gasman_game_3_0".equals(tag)) {
                    return new FragmentGasmanGame3BindingImpl(component, view);
                }
                if ("layout-sw600dp-notlong/fragment_gasman_game_3_0".equals(tag)) {
                    return new FragmentGasmanGame3BindingSw600dpNotlongImpl(component, view);
                }
                if ("layout-sw600dp/fragment_gasman_game_3_0".equals(tag)) {
                    return new FragmentGasmanGame3BindingSw600dpImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_3 is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_gasman_game_4_0".equals(tag)) {
                    return new FragmentGasmanGame4BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_4 is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_gasman_game_5_0".equals(tag)) {
                    return new FragmentGasmanGame5BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_5 is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_gasman_game_6_0".equals(tag)) {
                    return new FragmentGasmanGame6BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_6 is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_gasman_game_7_0".equals(tag)) {
                    return new FragmentGasmanGame7BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_7 is invalid. Received: " + tag);
            case 14:
                if ("layout/fragment_gasman_game_8_0".equals(tag)) {
                    return new FragmentGasmanGame8BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_8 is invalid. Received: " + tag);
            case 15:
                if ("layout/fragment_gasman_game_9_0".equals(tag)) {
                    return new FragmentGasmanGame9BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gasman_game_9 is invalid. Received: " + tag);
            case 16:
                if ("layout/fragment_menu_setting_winter_0".equals(tag)) {
                    return new FragmentMenuSettingWinterBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_menu_setting_winter is invalid. Received: " + tag);
            case 17:
                if ("layout/fragment_notification_0".equals(tag)) {
                    return new FragmentNotificationBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_notification is invalid. Received: " + tag);
            case 18:
                if ("layout/fragment_raise_charge_0".equals(tag)) {
                    return new FragmentRaiseChargeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_raise_charge is invalid. Received: " + tag);
            case 19:
                if ("layout/fragment_sum_contacts_0".equals(tag)) {
                    return new FragmentSumContactsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sum_contacts is invalid. Received: " + tag);
            case 20:
                if ("layout/fragment_taxi_0".equals(tag)) {
                    return new FragmentTaxiBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_taxi is invalid. Received: " + tag);
            case 21:
                if ("layout/fragment_taxi_map_0".equals(tag)) {
                    return new FragmentTaxiMapBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_taxi_map is invalid. Received: " + tag);
            case 22:
                if ("layout/fragment_tutorial_gui_0".equals(tag)) {
                    return new FragmentTutorialGuiBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tutorial_gui is invalid. Received: " + tag);
            case 23:
                if ("layout/social_network_link_layout_0".equals(tag)) {
                    return new SocialNetworkLinkLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for social_network_link_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String tag) {
        Integer num;
        if (tag == null || (num = InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int localId) {
        return InnerBrLookup.sKeys.get(localId);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public static class InnerBrLookup {
        public static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "data");
            sparseArray.put(2, "vm");
        }
    }

    public static class InnerLayoutIdLookup {
        public static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(25);
            sKeys = hashMap;
            hashMap.put("layout/br_taxi_comment_0", Integer.valueOf(R.layout.br_taxi_comment));
            hashMap.put("layout/fragment_change_bulb_0", Integer.valueOf(R.layout.fragment_change_bulb));
            hashMap.put("layout/fragment_collect_scheme_0", Integer.valueOf(R.layout.fragment_collect_scheme));
            hashMap.put("layout/fragment_electric_gui_0", Integer.valueOf(R.layout.fragment_electric_gui));
            hashMap.put("layout/fragment_find_problem_0", Integer.valueOf(R.layout.fragment_find_problem));
            hashMap.put("layout/fragment_gasman_game_1_0", Integer.valueOf(R.layout.fragment_gasman_game_1));
            hashMap.put("layout/fragment_gasman_game_10_0", Integer.valueOf(R.layout.fragment_gasman_game_10));
            hashMap.put("layout/fragment_gasman_game_2_0", Integer.valueOf(R.layout.fragment_gasman_game_2));
            Integer valueOf = Integer.valueOf(R.layout.fragment_gasman_game_3);
            hashMap.put("layout/fragment_gasman_game_3_0", valueOf);
            hashMap.put("layout-sw600dp-notlong/fragment_gasman_game_3_0", valueOf);
            hashMap.put("layout-sw600dp/fragment_gasman_game_3_0", valueOf);
            hashMap.put("layout/fragment_gasman_game_4_0", Integer.valueOf(R.layout.fragment_gasman_game_4));
            hashMap.put("layout/fragment_gasman_game_5_0", Integer.valueOf(R.layout.fragment_gasman_game_5));
            hashMap.put("layout/fragment_gasman_game_6_0", Integer.valueOf(R.layout.fragment_gasman_game_6));
            hashMap.put("layout/fragment_gasman_game_7_0", Integer.valueOf(R.layout.fragment_gasman_game_7));
            hashMap.put("layout/fragment_gasman_game_8_0", Integer.valueOf(R.layout.fragment_gasman_game_8));
            hashMap.put("layout/fragment_gasman_game_9_0", Integer.valueOf(R.layout.fragment_gasman_game_9));
            hashMap.put("layout/fragment_menu_setting_winter_0", Integer.valueOf(R.layout.fragment_menu_setting_winter));
            hashMap.put("layout/fragment_notification_0", Integer.valueOf(R.layout.fragment_notification));
            hashMap.put("layout/fragment_raise_charge_0", Integer.valueOf(R.layout.fragment_raise_charge));
            hashMap.put("layout/fragment_sum_contacts_0", Integer.valueOf(R.layout.fragment_sum_contacts));
            hashMap.put("layout/fragment_taxi_0", Integer.valueOf(R.layout.fragment_taxi));
            hashMap.put("layout/fragment_taxi_map_0", Integer.valueOf(R.layout.fragment_taxi_map));
            hashMap.put("layout/fragment_tutorial_gui_0", Integer.valueOf(R.layout.fragment_tutorial_gui));
            hashMap.put("layout/social_network_link_layout_0", Integer.valueOf(R.layout.social_network_link_layout));
        }
    }
}
