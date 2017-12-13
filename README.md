### CXF WebService接口说明文档
CXF与Spring搭建WebService是目前最流行的方式。

#### 1. 文档说明
```
本文档主要讲述如何用Java创建一个简单的WebService接口，并构建客户端调用这个WebService接口。
```
##

#### 2. 开发环境
```
系统环境：
    * JDK: 1.7.0_80
    * Tomcat: 7.0.70
    
开发工具：
    * Eclipse 4.5.2
```
##

#### 3. 框架选择
```
Spring: 4.0.2.RELEASE
SpringMvC: 4.0.2.RELEASE
Mybatis: 3.2.6
Mysql: 5.1.30
CXF: 3.1.5
```
##

#### 4. WebService服务端

##### 4.1 工程目录结构
目录 | 描述
---|---
cxf-webservice/src/main/java/com/bigdata/cxf/ws | WebService 接口层
cxf-webservice/src/main/java/com/bigdata/cxf/service | WebService 服务层
cxf-webservice/src/main/java/com/bigdata/cxf/dao | WebService Dao层
cxf-webservice/src/main/java/com/bigdata/cxf/entity | WebService 实体层
cxf-webservice/src/main/resources/mybatis | Mapper文件
cxf-webservice/src/main/resources | 配置文件

##### 4.2 发布地址
http://localhost:8580/cxf-webservice/cxf-ws/ctWS?wsdl

##

#### 5. WebService客户端

##### 5.1 工程目录结构
目录 | 描述
--- | ---
cxf-webservice-client/src/main/java/com/bigdata/ws/client | WebService 调用层
cxf-webservice-client/src/main/resources | 配置文件

##### 5.2 调用主类
```
CustomerTrendsWebServicePortClient.java
```

