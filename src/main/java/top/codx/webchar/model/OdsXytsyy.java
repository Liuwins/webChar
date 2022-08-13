package top.codx.webchar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 学院特色应用数据表
 * @author 刘城豪
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OdsXytsyy {
    /**
    * 主键数据唯一性标识
    */
    private String xxtsyyid;

    /**
    * 学校机构代码
    */
    private String xxjgdm;

    /**
    * 学校机构名称
    */
    private String xxjgmc;

    /**
    * 特色应用分类
    */
    private String tsyyfl;

    /**
    * 特色应用简称
    */
    private String tsyyjc;

    /**
    * 特色应用全称
    */
    private String tsyyqc;

    /**
    * 特色应用调用地址
    */
    private String tsyydydz;

    /**
    * 数据采集时间
    */
    private String sjcjsj;
}