package th.in.nattawut.plancrop.utility;

import android.util.Log;

import th.in.nattawut.plancrop.R;

public class Myconstant {

    ///////////////
    public static final String UPLOAD_URL = "http://http://10.30.164.130/android/nn/upload.php";

    //ล็อคอิน
    private String urlGetUser = "http://192.168.1.118/android/php/memberlogin.php";

    //แปลงเพาะปลูก


    //วางแผนเพาะปลูก
    private String urladdPlan = "http://192.168.1.118/android/php/insertplan.php";
    public static String getUrlCrop ="http://192.168.1.118/android/php/selectspinnercrop.php";
    public static String getUrlmid = "http://192.168.1.118/android/php/selectmidspinner.php";
    private String urlDeletePlan = "http://192.168.1.118/android/php/deleteplan.php";
    //private String[] columnPlanString = new String[]{"No", "MID", "PDate", "CID", "Area"};
    //private String urlGetPlan = "http://192.168.1.130/android/php/getPlanView.php";
    private String urlselectPlan = "http://192.168.1.118/android/php/selectplan.php";
    private String[] columnPlanString = new String[]{"no","mid","name","crop","pdate","area"};
    private String urlEditPlan = "http://192.168.1.118/android/php/editplan.php";

    //เกษตรกร
    private String urlFarmer = "http://192.168.1.118/android/php/insertfarmer.php";
    private String urlselectFarmer = "http://192.168.1.118/android/php/selectfarmer.php";
    private String[] comlumFarmerString = new String[]{"mid","name","area","tel","email"};//ต้องแก้ไขยังไม่เสร็จ
    public String[] getComlumFarmerString() {
        return comlumFarmerString;
    }

    //สมาชิก
    private String urlRegister = "http://192.168.1.118/android/php/insertmember.php";
    //private String urlRegister = "http://10.30.164.54/android/php/addregister.php";
    private  String urlGetRegister = "http://192.168.1.118/android/php/getregister.php";
    private String[] comlumRegisterString = new String[]{"MID","UserID","PWD","Name","ID","Address","VID","SID","Tel","EMail"};
    private String urlDeleteFammer = "http://192.168.1.118/android/php/deletefammer.php";
    private String urlEditRegister = "http://192.168.1.118/android/php/editfarmer.php";
    //private  String urlGetRegister = "http://192.168.1.30/android/php/selectfarmer.php";
    //private String[] comlumRegisterString = new String[]{"mid","name","village","tel","email"};

    //spinner จังหวัด อำเภอ ตำบล
    public static String getUrlProvince = "http://192.168.1.118/android/php/selectprovince.php";
    public static String getUrlAmphur = "http://192.168.1.118/android/php/selectdistrict.php";
    public static String getUrlVid = "http://192.168.43.118/android/php/selectvillage.php";
    public static String getUrlSid = "http://192.168.1.118/android/php/selectsubdistrict.php";

    //พืช
    private String urlAddCrop = "http://192.168.1.118/android/php/insertcrop.php";
    //private String urlselectCrop = "http://10.30.164.80/android/php/selectcrop.php";
    //private String[] columnCropString = new String[]{"crop.cid","crop.crop","croptype.tid","croptype.croptype","crop.beginharvest","crop.harvestperiod","crop.yield"};
    private String[] columnCropString = new String[]{"cid","crop","tid","croptype","beginharvest","harvestperiod","yield"};
    private String urlselectCrop = "http://192.168.1.118/android/php/a.php";
    private String urlDeleteCrop = "http://192.168.1.118/android/php/deletecrop.php";
    private String urlEditCrop = "http://192.168.1.118/android/php/editcrop.php";


    //ประเภทพืช
    public static String getUrlCropType = "http://192.168.1.118/android/php/selectcroptype.php";
    private String urlAddCropType = "http://192.168.1.118/android/php/insertcroptype.php";
    private String urlselectcroptype = "http://192.168.1.118/android/php/selectcroptype.php";
    private String urlEditCropType = "http://192.168.1.118/android/php/editcroptype.php";
    private String urlDeleteCropType = "http://192.168.1.118/android/php/deletecroptype.php";
    private String[] columnCropTypeString = new String[]{"TID","croptype"};


    //กิจกรรม
    private String urlAddPlantPicture = " http://192.168.1.118/android/php/insertactivity.php";


    //drawerLayout
    private int[] iconInts = new int[]{
            R.drawable.ic_action_draweruser,
            R.drawable.ic_action_drawerplan,
            R.drawable.ic_action_date,
            R.drawable.ic_action_drawerpicture,
            R.drawable.ic_action_userregister,
            R.drawable.ic_action_exit};
    private String[] titleStrings = new String[]{
            "ข้อมูลส่วนตัว",
            "วางแผนเพาะปลูก",
            "ปฏิทินการเพาะปลูก",
            "บันทึกการเพาะปลูก",
            "admin",
            "Exit"};

    // drawerLayout
    public int[] getIconInts() {
        return iconInts;
    }
    public String[] getTitleStrings() {
        return titleStrings;
    }


    //ล็อคอิน
    public String getUrlGetUser() {
        return urlGetUser;
    }

    //เกษตรกร
    public String getUrlFarmer() {
        return urlFarmer;
    }
    public String getUrlselectFarmer() {
        return urlselectFarmer;
    }


    //สามชิก
    public String getUrlRegister() {
        return urlRegister;
    }
    public String[] getComlumRegisterString() {
        return comlumRegisterString;
    }
    public String getUrlGetRegister() {
        return urlGetRegister;
    }
    public String getUrlDeleteFammer() {
        return urlDeleteFammer;
    }
    public String getUrlEditRegister() {
        return urlEditRegister;
    }

    //วางแผนเพาะปลูก
    public String[] getColumnPlanString() {
        return columnPlanString;
    }
    /*public String getUrlGetPlan() {
        return urlGetPlan;
    }*/
    public String getUrlDeletePlan() {
        return urlDeletePlan;
    }
    public String getUrladdPlan() {
        return urladdPlan;
    }
    public String getUrlselectPlan() {
        return urlselectPlan;
    }
    public String getUrlEditPlan() {
        return urlEditPlan;
    }
    //เกษตรกร

    //พืช
    public String getUrlAddCrop() {
        return urlAddCrop;
    }
    public String getUrlselectCrop() {
        return urlselectCrop;
    }
    public String[] getColumnCropString() {
        return columnCropString;
    }
    public String getUrlDeleteCrop() {
        return urlDeleteCrop;
    }
    public String getUrlEditCrop() {
        return urlEditCrop;
    }

    //ประเภทพืช
    public String getUrlAddCropType() {
        return urlAddCropType;
    }
    public String[] getColumnCropTypeString() {
        return columnCropTypeString;
    }
    public String getUrlselectcroptype() {
        return urlselectcroptype;
    }
    public String getUrlEditCropType() {
        return urlEditCropType;
    }
    public String getUrlDeleteCropType() {
        return urlDeleteCropType;
    }

    //กิจกกรม
    public String getUrlAddPlantPicture() {
        return urlAddPlantPicture;
    }



}
