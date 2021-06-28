package com.taoji666.entities.FleetManagment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

//机队数据表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fleet implements Serializable {
    private Long xuHao;
    private String feiJiZhuCeHao;
    private String changJia;
    private String jiXing;
    private Date riQi;
}
