package com.sls.interview;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo   {

	CompletableFuture<String> completableFuture	  = CompletableFuture.supplyAsync(() -> "Hello");

	CompletableFuture<String> future = completableFuture.thenApply(s -> s + " World");
	
	
}