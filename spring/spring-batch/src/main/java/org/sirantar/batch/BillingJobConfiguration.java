package org.sirantar.batch;

import org.springframework.batch.core.Job;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillingJobConfiguration {

    @Bean
    public Job job() {
        return new BillingJob();
    }

}
