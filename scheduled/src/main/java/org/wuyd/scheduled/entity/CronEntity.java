package org.wuyd.scheduled.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wuyd
 * @version 1.0
 * @description TODO
 * @time 2019/4/10 10:44
 */
@Data
@TableName("cron")
public class CronEntity {
    @TableId(value = "cron_id", type = IdType.INPUT)
    private String cronId;
    @TableField("cron")
    private String cron;
}
