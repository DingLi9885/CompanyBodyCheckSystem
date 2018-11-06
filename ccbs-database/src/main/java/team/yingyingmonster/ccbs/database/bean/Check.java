package team.yingyingmonster.ccbs.database.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 体检项目表
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Check {
    private Long checkid;
    private Long deptid;
    private String checkname;
    private BigDecimal checkprice;

    private Dept deptByDeptid;
}
