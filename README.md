Cash Register Spring MVC Project
----------------------------------------


## Build dev environment

```
./gradlew jettyRun
```

and then visit http://localhost:8080/spring4


## Developer Step

### Gradle 创建项目

1. `gradle init` 来初始化gradle.
2. build.gradle中增加各种任务,如`create-dirs`任务来创建目录结构.

### Introduce Spring MVC

1.创建WeblcomeController以及HelloWorldService.
2.配置Spring MVC: web.xml和spring-core-config.xml和spring-mvc-config.xml文件.
3.配置logback.



### Introduce mybatis

1. 在mysql中插入数据和创建用户
```
create database mybatis;
use mybatis;
CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), age INT);
INSERT INTO users(NAME, age) VALUES('abc', 27);
INSERT INTO users(NAME, age) VALUES('abd', 27);
```

创建用户
```
CREATE USER 'wendll'@'localhost' IDENTIFIED BY '123456';
GRANT all privileges ON mybatis.* TO 'wendll'@'localhost' WITH GRANT OPTION;
```

2. 在spring-core-config.xml文件中配置mybatis的配置,注意不是在spring-mvc-config.xml文件中,原因是目前service的配置是在spring-core-config.xml文件中.
3. 增加User, UserMapper, UserService, UserController类.
4. 访问http://localhost:8080/spring4/user/abc


