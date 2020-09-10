package top.takefly.user.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @description:
 * @author: lingfei_dai
 * @time: 2020/9/10 18:02
 * 不要用@Configuration声明
 */
public class AuthServiceConfiguration {

    /**
     * 最多重试两次
     * @return
     */
    @Bean
    public Retryer customRetry() {
        return new Retryer.Default(100, SECONDS.toMillis(1), 2);
    }
}
