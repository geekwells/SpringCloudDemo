package org.demo.springcloud.config;

//@Configuration
public class ZipkinConfig {

//    @Value("${zipkin.serviceName}")
//    private String serviceName;
//    @Value("${zipkin.url}")
//    private String url;
//    @Value("${zipkin.connectTimeout}")
//    private int connectTimeout;
//    @Value("${zipkin.readTimeout}")
//    private int readTimeout;
//    @Value("${zipkin.flushInterval}")
//    private int flushInterval;
//    @Value("${zipkin.compressionEnabled}")
//    private boolean compressionEnabled;
//
//
//
//    @Bean
//    public SpanCollector spanCollector() {
//        HttpSpanCollector.Config config = HttpSpanCollector.Config.builder().connectTimeout(connectTimeout).readTimeout(readTimeout)
//                .compressionEnabled(compressionEnabled).flushInterval(flushInterval).build();
//        return HttpSpanCollector.create(url, config, new EmptySpanCollectorMetricsHandler());
//    }
//
//
//    @Bean
//    public Brave brave(SpanCollector spanCollector){
//        Brave.Builder builder = new Brave.Builder(serviceName);  //指定state
//        builder.spanCollector(spanCollector);
//        builder.traceSampler(Sampler.ALWAYS_SAMPLE);
//        Brave brave = builder.build();
//        return brave;
//    }
//
//    @Bean
//    public BraveServletFilter braveServletFilter(Brave brave){
//        BraveServletFilter filter = new BraveServletFilter(brave.serverRequestInterceptor(),brave.serverResponseInterceptor(),new DefaultSpanNameProvider());
//        return filter;
//    }
//
//    @Bean
//    public OkHttpClient okHttpClient(Brave brave){
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new BraveOkHttpRequestResponseInterceptor(brave.clientRequestInterceptor(), brave.clientResponseInterceptor(), new DefaultSpanNameProvider()))
//                .build();
//        return client;
//    }
//
//    @Bean
//    public MySQLStatementInterceptorManagementBean mySQLStatementInterceptorManagementBean(Brave brave) {
//        return new MySQLStatementInterceptorManagementBean(brave.clientTracer());
//    }
}
