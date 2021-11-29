package inpt.ac.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	// @Bean
	// static configuration
	RouteLocator routeLocatorBuild(RouteLocatorBuilder build) {
		return build.routes().route(r -> r.path("/customers/**").uri("http://localhost:8081"))
				.route(r -> r.path("/books/**").uri("http://localhost:8082")).build();
	}

	// Dynamic configuration using DiscoveryClientRouteDefintionLocator Object
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc,
			DiscoveryLocatorProperties prp) {
		return new DiscoveryClientRouteDefinitionLocator(rdc, prp);
	}

}
