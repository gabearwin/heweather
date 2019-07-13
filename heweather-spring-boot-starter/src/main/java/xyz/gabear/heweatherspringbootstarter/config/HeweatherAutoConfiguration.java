package xyz.gabear.heweatherspringbootstarter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import xyz.gabear.heweather.client.HeweatherClient;
import xyz.gabear.heweather.client.HeweatherClientImpl;

import java.util.Arrays;
import java.util.Map;

@Configuration
@EnableConfigurationProperties(HeweatherProperties.class)
// 添加一些自动装配条件
// @ConditionalOnBean
// @ConditionalOnMissingBean
@ConditionalOnClass(HeweatherClient.class)
// @ConditionalOnMissingClass
@Conditional(HeweatherAutoConfiguration.HeweatherCondition.class)
public class HeweatherAutoConfiguration {

    private final HeweatherProperties heweatherProperties;

    public HeweatherAutoConfiguration(HeweatherProperties heweatherProperties) {
        this.heweatherProperties = heweatherProperties;
    }

    @Bean
    @ConditionalOnMissingBean(HeweatherClientImpl.class)
    public HeweatherClient heweatherService() {
        System.out.println("We can use properties on here. " + heweatherProperties);
        return new HeweatherClientImpl(heweatherProperties.getUrl(), heweatherProperties.getKey());
    }

    static class HeweatherCondition implements Condition {
        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            System.out.println("--------------1--------------");
            String[] defaultProfiles = context.getEnvironment().getDefaultProfiles();
            System.out.println(Arrays.toString(defaultProfiles));
            System.out.println("--------------2--------------");
            Map<String, Object> map = metadata.getAnnotationAttributes(Conditional.class.getName());
            System.out.println(map != null ? map.keySet() : null);

            return true;
        }
    }
}
