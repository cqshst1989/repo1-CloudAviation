package com.taoji666.entities.HR;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Long yuanGongId;
    private String XingMing;
    private Date chuShengRiQi;
    private String suoShuBuMen;
    private String zhiWei;
    private String jiBie;
    private String miMa;
}
