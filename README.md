# 基于Eureka和Gateway的微服务Demo

## 项目概述

本Demo旨在演示基于Eureka服务注册与发现以及Spring Cloud Gateway网关转发的微服务架构。项目包含Member用户服务和Order订单服务两个微服务，通过Spring Cloud Gateway进行API网关管理，并通过Feign进行服务间调用。

## 架构说明

- **Eureka**: 作为服务注册中心，用于服务发现和治理。
- **Gateway**: 担任API网关角色，负责请求的路由、过滤和转发。
- **Member服务**: 提供用户相关的功能，如用户注册、登录等。
- **Order服务**: 提供订单相关的功能，如创建订单、查询订单等。
- **Feign**: 在Member服务中作为声明式的Web服务客户端，用于简化调用Order服务的过程。

## 运行环境

- JDK 17
- Maven 3.6+
- Spring Boot 3.x
- Spring Cloud 2023.0.0

## 如何运行

1. **启动Eureka服务**
   执行Eureka服务的`main`方法，或者在IDE中直接运行Eureka服务。
2. **启动Gateway网关**
   执行Gateway服务的`main`方法，或者在IDE中直接运行Gateway服务。
3. **启动Member服务和Order服务**
   分别执行Member服务和Order服务的`main`方法，或者在IDE中直接运行这两个服务。
4. **测试**
   使用Postman或curl等工具，通过Gateway网关的API地址来调用Member服务的API，Member服务再通过Feign调用Order服务。

## 功能演示

### 1. 服务注册与发现

- Member服务和Order服务启动后，会自动注册到Eureka服务注册中心。
- 通过Eureka的Web界面可以查看服务注册状态。

### 2. 网关转发

- 通过配置Spring Cloud Gateway的路由规则，可以实现请求转发到对应的服务。
- 例如，将`/api/member/**`的请求转发到Member服务。

### 3. Feign调用

- 在Member服务中，通过Feign客户端可以直接调用Order服务的API。
- Feign会自动处理服务发现、负载均衡等细节。

## 注意事项

- 确保所有服务的端口号不冲突。
- 修改`application.yml`或`application.properties`中的配置以适应实际环境。
- 在生产环境中，建议将Eureka服务注册中心配置为高可用模式。

## 后续扩展

- 可以添加更多微服务，如Product服务、Payment服务等。
- 可以集成其他Spring Cloud组件，如Config、Sleuth、Zipkin等。
- 可以优化性能，如使用缓存、异步处理等。

## 联系方式

如有任何疑问或建议，请通过以下方式联系我们：

- Email: [your-email@example.com](mailto:your-email@example.com)
- GitHub: [your-github-username](https://github.com/your-github-username)

## 版权说明

本Demo仅用于学习和演示目的，未经授权不得用于商业用途。