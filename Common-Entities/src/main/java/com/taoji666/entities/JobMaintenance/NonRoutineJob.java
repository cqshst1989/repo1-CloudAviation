package com.taoji666.entities.JobMaintenance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NonRoutineJob{
    private Long gongZuoBianHao;
    private String guZhangMiaoShu;
    private String ata;
    private String ziZhangJie;
    private String paiGuNeiRong;
    private String guZhangJiBie;
    private String hangCaiXiaoFei;
    private String guZhangZhuangTai;
}
