package com.taoji666.entities.FleetManagment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

//维修管理数据表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    private Long xuHao;
    private Date riQi;
    private String zhuCeHao;
    private String hangBanHao;
    private String weiXiuLeiBie;
    private String fuJia;
    private String feiLiXing;
    private String guZhang;
    private String hangCaiXiaoHao;
    private String shiHangZhuangtai;
    private String weiXiuDanWei;
    private Float gongShi;

}
