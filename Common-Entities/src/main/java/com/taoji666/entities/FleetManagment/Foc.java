package com.taoji666.entities.FleetManagment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;


//运控部门数据表（FOC）
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foc {
    private Long xuHao;
    private String zhuCeHao;
    private String hangBanHao;
    private Date riQi;
    private String jinChuGang;
    private String shiFaDi;
    private String muDiDi;
    private Timestamp jiHuaQiFei;
    private Timestamp shiJiQiFei;
    private Timestamp jiHuaDaoDa;
    private Timestamp shiJiDaoDa;
    private String yanWuYuanyin;
    private String tingJiWei;
}
