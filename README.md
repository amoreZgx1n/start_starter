Starter相当于模块，能将所需的依赖整合起来，Starter 提供了以下功能：
- 整合了模块需要的所有依赖，统一集合到 Starter 中。
- - 提供了默认配置，并允许我们调整这些默认配置。
- 提供了自动配置类对模块内的 Bean 进行自动装配，注入 Spring 容器中。
实现流程：
- 功能类：本实例功能是输出客户端（根据ip划分）的访问次数
- 自动配置类：把功能实例化，把它们引入到spring环境中来
- 测试工程：开发一个controller，调用自定义的controller
- 拦截器完善功能
- 增加配置项：根据配置文件决定显示的格式

自动配置类
IPAutoconfiguration类
resources ->META-INF->spring.factories  #SpringBoot 2.7废止，SpringBoot3全面移除
resources -> META-INF -> spring -> org.springframework。boot.autoconfigure.Autoconfiguration.imports

最后记得将starter安装到本地仓库
将jar包注册到中心仓库
