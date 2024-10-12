# 重构修能信息SISCO后台管理系统

一、了解老项目的结构

![image-20241011153435601](D:/%E7%AC%94%E8%AE%B0%E5%9B%BE%E5%83%8F/image-20241011153435601.png)

```txt
--bus 系统管理

--cms
--demo
--sisco
--xnms
```



二、记录老项目的数据库表结构

```yml
driver-class-name: com.mysql.cj.jdbc.Driver
url: jdbc:mysql://server.csxnxx.com:3308/xiunengms_kfdb?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&maxReconnects=15000&serverTimezone=Asia/Shanghai&useSSL=false
username: root
password: Xnxx89903719!
```

 [xnxx-sisco.sql](D:\xnxx\xnxx-sisco\sql\xnxx-sisco.sql) 

使用 SQL 脚本或数据库迁移工具（如 Flyway 或 Liquibase）将老项目的表结构导入新数据库。

三、理解老项目的业务流程和核心功能。





四、确定新的框架设计



五、创建新的模块

- 迁移控制层逻辑
- 迁移服务层逻辑
- 迁移数据访问层逻辑
- 迁移前端页面

六、功能验证

- 完成代码功能测试确保所有功能正常工作

七、完成项目文档更新



