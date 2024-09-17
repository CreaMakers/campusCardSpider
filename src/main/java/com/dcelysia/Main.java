package com.dcelysia;

import InfoClass.electricityCharge;
import Methods.getElectricityCharge;

public class Main {

    public static void main(String[] args) {
        getElectricityCharge method = new getElectricityCharge();
        // 只能是 金盆岭校区 和 云塘校区
        String address = "金盆岭校区";
        // 必须是楼的全称，可以看getElectricityCharge中HashMap的键去看你的楼栋的全称
        String buildId = "西苑9栋";
        //必须是正确的宿舍号
        String Nod = "521";
        // 电费信息
        electricityCharge chargeInfo = method.getCharge(address, buildId, Nod);
        // 打印电费信息
        System.out.println(chargeInfo.getMsg());
    }
}
