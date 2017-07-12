package tech.washmore.games.easychat.common.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Washmore
 * @version V1.0
 * @summary TODO
 * @Copyright (c) 2017, Lianjia Group All Rights Reserved.
 * @since 2017/7/12
 */
@Configuration
@ConditionalOnWebApplication
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new FastJsonHttpMessageConverter4());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        CacheControl cacheControl = CacheControl.maxAge(8, TimeUnit.HOURS);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/pages/").setCacheControl(cacheControl);
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
