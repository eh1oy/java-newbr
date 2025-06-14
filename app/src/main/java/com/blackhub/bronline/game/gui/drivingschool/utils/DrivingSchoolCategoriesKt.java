package com.blackhub.bronline.game.gui.drivingschool.utils;

import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.drivingschool.data.SignObj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DrivingSchoolCategories.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"radialMenuInfoCategoriesABCD", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/SignObj;", "getRadialMenuInfoCategoriesABCD", "()Ljava/util/List;", "radialMenuInfoCategoriesShip", "getRadialMenuInfoCategoriesShip", "roadSignsCategoriesAB", "getRoadSignsCategoriesAB", "roadSignsCategoriesC", "getRoadSignsCategoriesC", "roadSignsCategoriesD", "getRoadSignsCategoriesD", "roadSignsCategoriesShip", "getRoadSignsCategoriesShip", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrivingSchoolCategoriesKt {

    @NotNull
    public static final List<SignObj> radialMenuInfoCategoriesABCD;

    @NotNull
    public static final List<SignObj> radialMenuInfoCategoriesShip;

    @NotNull
    public static final List<SignObj> roadSignsCategoriesAB;

    @NotNull
    public static final List<SignObj> roadSignsCategoriesC;

    @NotNull
    public static final List<SignObj> roadSignsCategoriesD;

    @NotNull
    public static final List<SignObj> roadSignsCategoriesShip;

    static {
        ArrayList arrayList = new ArrayList();
        Integer valueOf = Integer.valueOf(R.string.driving_school_sign_no_entry);
        Integer valueOf2 = Integer.valueOf(R.string.driving_school_sign_no_entry_description);
        Integer valueOf3 = Integer.valueOf(R.drawable.img_sign_no_entry);
        arrayList.add(new SignObj(null, R.string.driving_school_sign_main_road, R.string.driving_school_sign_main_road_description, R.drawable.img_sign_main_road, null, valueOf, valueOf2, valueOf3, true, 17, null));
        Integer valueOf4 = Integer.valueOf(R.string.driving_school_sign_stop);
        Integer valueOf5 = Integer.valueOf(R.string.driving_school_sign_stop_description);
        Integer valueOf6 = Integer.valueOf(R.drawable.img_sign_stop);
        arrayList.add(new SignObj(null, R.string.driving_school_sign_no_drive, R.string.driving_school_sign_no_drive_description, R.drawable.img_sign_no_drive, null, valueOf4, valueOf5, valueOf6, true, 17, null));
        Integer valueOf7 = Integer.valueOf(R.string.driving_school_sign_max_speed);
        Integer valueOf8 = Integer.valueOf(R.string.driving_school_sign_max_speed_description);
        Integer valueOf9 = Integer.valueOf(R.drawable.img_sign_max_speed);
        arrayList.add(new SignObj(null, R.string.driving_school_sign_control, R.string.driving_school_sign_control_description, R.drawable.img_sign_control, null, valueOf7, valueOf8, valueOf9, true, 17, null));
        Integer valueOf10 = Integer.valueOf(R.string.driving_school_sign_no_overtaking);
        Integer valueOf11 = Integer.valueOf(R.string.driving_school_sign_no_overtaking_description);
        Integer valueOf12 = Integer.valueOf(R.drawable.img_sign_no_overtaking);
        arrayList.add(new SignObj(null, R.string.driving_school_sign_max_hight, R.string.driving_school_sign_max_high_descriptiont, R.drawable.img_sign_max_hight, null, valueOf10, valueOf11, valueOf12, true, 17, null));
        Integer valueOf13 = Integer.valueOf(R.string.driving_school_sign_ring_drive);
        Integer valueOf14 = Integer.valueOf(R.string.driving_school_sign_ring_drive_description);
        Integer valueOf15 = Integer.valueOf(R.drawable.img_sign_ring_drive);
        arrayList.add(new SignObj(null, R.string.driving_school_sign_no_limitation, R.string.driving_school_sign_no_limitation_description, R.drawable.img_sign_no_limitation, null, valueOf13, valueOf14, valueOf15, true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_motorway, R.string.driving_school_sign_motorway_description, R.drawable.img_sign_motorway, null, Integer.valueOf(R.string.driving_school_sign_parking), Integer.valueOf(R.string.driving_school_sign_parking_description), Integer.valueOf(R.drawable.img_sign_parking), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_zone_max_speed, R.string.driving_school_sign_zone_max_speed_description, R.drawable.img_sign_zone_max_speed, null, Integer.valueOf(R.string.driving_school_sign_bus_stop), Integer.valueOf(R.string.driving_school_sign_bus_stop_description), Integer.valueOf(R.drawable.img_sign_bus_stop), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_crosswalk, R.string.driving_school_sign_crosswalk_description, R.drawable.img_sign_crosswalk, null, Integer.valueOf(R.string.driving_school_sign_start_city), Integer.valueOf(R.string.driving_school_sign_start_city_description), Integer.valueOf(R.drawable.img_sign_start_city), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_end_city, R.string.driving_school_sign_end_city_description, R.drawable.img_sign_end_city, null, Integer.valueOf(R.string.driving_school_sign_give_way), Integer.valueOf(R.string.driving_school_sign_give_way_description), Integer.valueOf(R.drawable.img_sign_give_way), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_no_stop, R.string.driving_school_sign_no_stop_description, R.drawable.img_sign_no_stop, null, Integer.valueOf(R.string.driving_school_sign_no_parking), Integer.valueOf(R.string.driving_school_sign_no_parking_description), Integer.valueOf(R.drawable.img_sign_no_parking), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_straight_ahead, R.string.driving_school_sign_straight_ahead_description, R.drawable.img_sign_straight_ahead, null, Integer.valueOf(R.string.driving_school_sign_no_turn), Integer.valueOf(R.string.driving_school_sign_no_turn_description), Integer.valueOf(R.drawable.img_sign_no_turn), true, 17, null));
        arrayList.add(new SignObj(null, R.string.driving_school_sign_photo_control, R.string.driving_school_sign_photo_control_description, R.drawable.img_sign_photo_control, null, null, null, null, false, 17, null));
        roadSignsCategoriesAB = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_main_road, R.string.driving_school_sign_main_road_description, R.drawable.img_sign_main_road, null, valueOf, valueOf2, valueOf3, true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_no_drive, R.string.driving_school_sign_no_drive_description, R.drawable.img_sign_no_drive, null, valueOf4, valueOf5, valueOf6, true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_control, R.string.driving_school_sign_control_description, R.drawable.img_sign_control, null, valueOf7, valueOf8, valueOf9, true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_max_hight, R.string.driving_school_sign_max_high_descriptiont, R.drawable.img_sign_max_hight, null, valueOf10, valueOf11, valueOf12, true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_no_limitation, R.string.driving_school_sign_no_limitation_description, R.drawable.img_sign_no_limitation, null, valueOf13, valueOf14, valueOf15, true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_motorway, R.string.driving_school_sign_motorway_description, R.drawable.img_sign_motorway, null, Integer.valueOf(R.string.driving_school_sign_parking), Integer.valueOf(R.string.driving_school_sign_parking_description), Integer.valueOf(R.drawable.img_sign_parking), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_zone_max_speed, R.string.driving_school_sign_zone_max_speed_description, R.drawable.img_sign_zone_max_speed, null, Integer.valueOf(R.string.driving_school_sign_bus_stop), Integer.valueOf(R.string.driving_school_sign_bus_stop_description), Integer.valueOf(R.drawable.img_sign_bus_stop), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_crosswalk, R.string.driving_school_sign_crosswalk_description, R.drawable.img_sign_crosswalk, null, Integer.valueOf(R.string.driving_school_sign_start_city), Integer.valueOf(R.string.driving_school_sign_start_city_description), Integer.valueOf(R.drawable.img_sign_start_city), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_end_city, R.string.driving_school_sign_end_city_description, R.drawable.img_sign_end_city, null, Integer.valueOf(R.string.driving_school_sign_give_way), Integer.valueOf(R.string.driving_school_sign_give_way_description), Integer.valueOf(R.drawable.img_sign_give_way), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_no_stop, R.string.driving_school_sign_no_stop_description, R.drawable.img_sign_no_stop, null, Integer.valueOf(R.string.driving_school_sign_no_parking), Integer.valueOf(R.string.driving_school_sign_no_parking_description), Integer.valueOf(R.drawable.img_sign_no_parking), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_straight_ahead, R.string.driving_school_sign_straight_ahead_description, R.drawable.img_sign_straight_ahead, null, Integer.valueOf(R.string.driving_school_sign_no_turn), Integer.valueOf(R.string.driving_school_sign_no_turn_description), Integer.valueOf(R.drawable.img_sign_no_turn), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_photo_control, R.string.driving_school_sign_photo_control_description, R.drawable.img_sign_photo_control, null, Integer.valueOf(R.string.driving_school_sign_way_for_cargo_car), Integer.valueOf(R.string.driving_school_sign_way_for_cargo_car_description), Integer.valueOf(R.drawable.img_way_for_cargo_car), true, 17, null));
        arrayList2.add(new SignObj(null, R.string.driving_school_sign_no_overtaking_cargo_car, R.string.driving_school_sign_no_overtaking_cargo_car_description, R.drawable.img_sign_no_overtaking_cargo_car, null, Integer.valueOf(R.string.driving_school_sign_no_driving_cargo_trunk), Integer.valueOf(R.string.driving_school_sign_no_driving_cargo_trunk_description), Integer.valueOf(R.drawable.img_no_driving_cargo_trunk), false, 17, null));
        roadSignsCategoriesC = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_main_road, R.string.driving_school_sign_main_road_description, R.drawable.img_sign_main_road, null, valueOf, valueOf2, valueOf3, true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_no_drive, R.string.driving_school_sign_no_drive_description, R.drawable.img_sign_no_drive, null, valueOf4, valueOf5, valueOf6, true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_control, R.string.driving_school_sign_control_description, R.drawable.img_sign_control, null, valueOf7, valueOf8, valueOf9, true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_max_hight, R.string.driving_school_sign_max_high_descriptiont, R.drawable.img_sign_max_hight, null, valueOf10, valueOf11, valueOf12, true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_no_limitation, R.string.driving_school_sign_no_limitation_description, R.drawable.img_sign_no_limitation, null, valueOf13, valueOf14, valueOf15, true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_motorway, R.string.driving_school_sign_motorway_description, R.drawable.img_sign_motorway, null, Integer.valueOf(R.string.driving_school_sign_parking), Integer.valueOf(R.string.driving_school_sign_parking_description), Integer.valueOf(R.drawable.img_sign_parking), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_zone_max_speed, R.string.driving_school_sign_zone_max_speed_description, R.drawable.img_sign_zone_max_speed, null, Integer.valueOf(R.string.driving_school_sign_bus_stop), Integer.valueOf(R.string.driving_school_sign_bus_stop_description), Integer.valueOf(R.drawable.img_sign_bus_stop), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_crosswalk, R.string.driving_school_sign_crosswalk_description, R.drawable.img_sign_crosswalk, null, Integer.valueOf(R.string.driving_school_sign_start_city), Integer.valueOf(R.string.driving_school_sign_start_city_description), Integer.valueOf(R.drawable.img_sign_start_city), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_end_city, R.string.driving_school_sign_end_city_description, R.drawable.img_sign_end_city, null, Integer.valueOf(R.string.driving_school_sign_give_way), Integer.valueOf(R.string.driving_school_sign_give_way_description), Integer.valueOf(R.drawable.img_sign_give_way), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_no_stop, R.string.driving_school_sign_no_stop_description, R.drawable.img_sign_no_stop, null, Integer.valueOf(R.string.driving_school_sign_no_parking), Integer.valueOf(R.string.driving_school_sign_no_parking_description), Integer.valueOf(R.drawable.img_sign_no_parking), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_straight_ahead, R.string.driving_school_sign_straight_ahead_description, R.drawable.img_sign_straight_ahead, null, Integer.valueOf(R.string.driving_school_sign_no_turn), Integer.valueOf(R.string.driving_school_sign_no_turn_description), Integer.valueOf(R.drawable.img_sign_no_turn), true, 17, null));
        arrayList3.add(new SignObj(null, R.string.driving_school_sign_photo_control, R.string.driving_school_sign_photo_control_description, R.drawable.img_sign_photo_control, null, Integer.valueOf(R.string.driving_school_sign_bus_road), Integer.valueOf(R.string.driving_school_sign_bus_road_description), Integer.valueOf(R.drawable.img_bus_road), false, 17, null));
        roadSignsCategoriesD = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new SignObj(null, R.string.driving_school_sign_44, R.string.driving_school_sign_44_description, R.drawable.ds_icon_44, null, Integer.valueOf(R.string.driving_school_sign_46), Integer.valueOf(R.string.driving_school_sign_46_description), Integer.valueOf(R.drawable.ds_icon_46), true, 17, null));
        arrayList4.add(new SignObj(null, R.string.driving_school_sign_45, R.string.driving_school_sign_45_description, R.drawable.ds_icon_45, null, Integer.valueOf(R.string.driving_school_sign_47), Integer.valueOf(R.string.driving_school_sign_47_description), Integer.valueOf(R.drawable.ds_icon_47), false, 17, null));
        roadSignsCategoriesShip = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new SignObj(1, R.string.driving_school_sign_7, R.string.driving_school_sign_7_description, R.drawable.ds_icon_7, 2, Integer.valueOf(R.string.driving_school_sign_6), Integer.valueOf(R.string.driving_school_sign_6_description), Integer.valueOf(R.drawable.ds_icon_6), true));
        arrayList5.add(new SignObj(3, R.string.driving_school_sign_4, R.string.driving_school_sign_4_description, R.drawable.ds_icon_4, 4, Integer.valueOf(R.string.driving_school_sign_8), Integer.valueOf(R.string.driving_school_sign_8_description), Integer.valueOf(R.drawable.ds_icon_8), true));
        arrayList5.add(new SignObj(5, R.string.driving_school_sign_5, R.string.driving_school_sign_5_description, R.drawable.ds_icon_5, 6, Integer.valueOf(R.string.driving_school_sign_9), Integer.valueOf(R.string.driving_school_sign_9_description), Integer.valueOf(R.drawable.ds_icon_9), false));
        radialMenuInfoCategoriesABCD = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new SignObj(1, R.string.driving_school_sign_7, R.string.driving_school_sign_7_description, R.drawable.ds_icon_7, 2, Integer.valueOf(R.string.driving_school_sign_6), Integer.valueOf(R.string.driving_school_sign_6_description), Integer.valueOf(R.drawable.ds_icon_6), true));
        arrayList6.add(new SignObj(3, R.string.driving_school_sign_4, R.string.driving_school_sign_4_description, R.drawable.ds_icon_4, 4, Integer.valueOf(R.string.driving_school_sign_8), Integer.valueOf(R.string.driving_school_sign_8_description), Integer.valueOf(R.drawable.ds_icon_8), false));
        radialMenuInfoCategoriesShip = arrayList6;
    }

    @NotNull
    public static final List<SignObj> getRoadSignsCategoriesAB() {
        return roadSignsCategoriesAB;
    }

    @NotNull
    public static final List<SignObj> getRoadSignsCategoriesC() {
        return roadSignsCategoriesC;
    }

    @NotNull
    public static final List<SignObj> getRoadSignsCategoriesD() {
        return roadSignsCategoriesD;
    }

    @NotNull
    public static final List<SignObj> getRoadSignsCategoriesShip() {
        return roadSignsCategoriesShip;
    }

    @NotNull
    public static final List<SignObj> getRadialMenuInfoCategoriesABCD() {
        return radialMenuInfoCategoriesABCD;
    }

    @NotNull
    public static final List<SignObj> getRadialMenuInfoCategoriesShip() {
        return radialMenuInfoCategoriesShip;
    }
}
