# 关于该项目
规则引擎Drools的使用Demo，包括两部分：cloud模式和Stream模式


## Cloud模式
运行入口为：**CloudRuleTest.java**。
规则文件为：**drink_consumer_rule.drl**。

## Stream模式
运行入口： **EventRuleStarter.java**。
规则文件为：**msg_context_detect.drl**和**msg_statistic_detect.drl**。

## 决策表使用
* 运行入口： **InsuredPlanTest.java**
* 决策表文件： **src/main/resources/com.threecube.cloud.xls/insured_plan1.xlsx**
实现了[2017年度参保居民住院起付标准和报销比例](https://baike.baidu.com/item/%E5%8C%BB%E4%BF%9D%E6%8A%A5%E9%94%80%E6%AF%94%E4%BE%8B/4277454?fr=aladdin)。

## 规则引擎初始化
参考**DroolsManageUtil.java**和**kmodule.xml**； 实现规则引擎的初始化，和规则文件的加载等。

## Others