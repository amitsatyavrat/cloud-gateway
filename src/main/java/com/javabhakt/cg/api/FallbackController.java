package com.javabhakt.cg.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@RequestMapping("/orderFallback")
	public Mono<String> orderServiceFallback() {
		return Mono.just("Order service taking too much time to respond or is down. Please try again later");
	}
	
	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallback() {
		return Mono.just("Payment service taking too much time to respond or is down. Please try again later");
	}
}
