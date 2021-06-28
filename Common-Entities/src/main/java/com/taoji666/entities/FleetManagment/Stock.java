package com.taoji666.entities.FleetManagment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

//航材库存数据表

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private Long xuHao;
    private String mingChen;
    private String jianHao;
    private Long kuCunShu;
    private Long keYongShu;
    private Long xinZengCaiGouShu;
    private Date daoLiaoRiQi;
}
