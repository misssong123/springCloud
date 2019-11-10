package com.qust.springCloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor//配置全参构造器
@NoArgsConstructor//配置无参构造器
@Data//@Data注解中包含了get，set和toString
@Accessors(chain = true)
public class Dept implements Serializable {//用于和mysql中的表进行关联映射
        private long deptNo;//主键
        private String deptName;//部门名称
        private String db_source;//来自哪一个数据库因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库中
        public Dept(String deptName){
                this.deptName=deptName;
        }
}
