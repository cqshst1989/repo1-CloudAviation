package com.taoji666.entities.JobMaintenance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoutineJob {
    private Long xuHao;
    private String gongZuoMingChen;
    private String ata;
    private String ziZhangJie;
    private String gongJu;
    private String hangCaiXiaoFei;
    private Float biaoZhunGongshi;
    private String gongKa; //这里只是工卡号，工卡实体放在一个专用文件夹
}
