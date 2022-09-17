package net.armanit.ecommerce.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(p -> p
//						.path("/arman/product/**")
//						.filters(f -> f.rewritePath("/arman/product/(?<segment>.*)","/${segment}")
//								.addResponseHeader("X-Response-Time",new Date().toString()))
//						.uri("lb://product")).build();
//	}
}
