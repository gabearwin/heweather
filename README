heweather
---

- 个人学习 SpringBoot starter 的 Demo
- Spring-Boot-Starter主要做了两件事：引入 jar 和自动配置

### 开发自己的 starter
- 新建工程
- 引入需要开发的 jar 和`spring-boot-autoconfigure`(自动配置Bean)、`spring-boot-configuration-processor`(配置Properties)
- 编写配置Properties
- 编写自动配置类(核心)，可以添加一些配置条件
- 编写发现配置文件`META-INF/spring.factories`和配置元信息说明文件`META-INF/additional-spring-configuration-metadata.json`
- 打包发布

### 使用自己的 starter
- 引入依赖
    ```
    <dependency>
        <groupId>xyz.gabear</groupId>
        <artifactId>heweather-spring-boot-starter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
    ```
- 配置参数(可选，否则使用默认配置)
    ```
    heweather:
      key: "hello"
      url: "www.gabear.xyz"
    ```
- 使用
    ```
    @Autowired
    private HeweatherClient heweatherClient;
    
    public void testHeweather() {
        heweatherClient.getCommonWeather();
    }    
    ```






