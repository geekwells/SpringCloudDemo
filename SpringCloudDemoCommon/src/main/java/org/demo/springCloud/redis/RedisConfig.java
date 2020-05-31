package org.demo.springCloud.redis;


import cn.hutool.core.date.DateUtil;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
//@AutoConfigureAfter(RedisConfig.class)

public class RedisConfig extends CachingConfigurerSupport {
    public RedisConfig() {
        System.out.println("RedisConfig======初始化！" + DateUtil.today());
    }


//    @Bean
//    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
//        StringRedisTemplate template = new StringRedisTemplate(factory);
//        @SuppressWarnings({"rawtypes", "unchecked"})
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }

//    @Resource
//    private LettuceConnectionFactory lettuceConnectionFactory;
//
//    @Bean
//    public KeyGenerator keyGenerator() {
//
//        return new KeyGenerator() {
//
//            @Override
//            public Object generate(Object target, Method method, Object... params) {
//
//                StringBuffer sb = new StringBuffer();
//
//                sb.append(target.getClass().getName());
//
//                sb.append(method.getName());
//
//                for (Object obj : params) {
//
//                    sb.append(obj.toString());
//
//                }
//
//                return sb.toString();
//
//            }
//
//        };
//
//    }
//
//    // 缓存管理器
//
//    @Bean
//    public CacheManager cacheManager() {
//
//        RedisCacheManager.RedisCacheManagerBuilder builder = RedisCacheManager.RedisCacheManagerBuilder
//
//                .fromConnectionFactory(lettuceConnectionFactory);
//        @SuppressWarnings("serial")
//        Set<String> cacheNames = new HashSet<String>() {
//            {
//                add("codeNameCache");
//            }
//        };
//        builder.initialCacheNames(cacheNames);
//        return builder.build();
//
//    }
//
//    @Bean
//    public RedisTemplate<String, Serializable> redisCacheTemplate(
//            redisConnectionFactory) {
//
//        RedisTemplate<String, Serializable> template = new RedisTemplate<String, Serializable>();
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        template.setHashKeySerializer(new StringRedisSerializer());// Hash key序列化
//        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());// Hash value序列化
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//    }

}
