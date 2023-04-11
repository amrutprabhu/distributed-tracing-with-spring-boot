package com.amrut.prabhu;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtlpConfiguration {

    @Bean
    @ConditionalOnMissingBean
    OtlpHttpSpanExporter otlpHttpSpanExporter(@Value("${tracing.url}") String url) {
        OtlpHttpSpanExporterBuilder builder = OtlpHttpSpanExporter.builder()
                .setEndpoint(url);

        return builder.build();
    }
}
