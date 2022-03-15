package com.qingzhu.common.component

import org.springframework.web.reactive.function.client.WebClient

abstract class BaseWebClient(webClientBuilder: WebClient.Builder, baseUrl: String) {
    protected val webClient by lazy { webClientBuilder.baseUrl(baseUrl).build() }
}
