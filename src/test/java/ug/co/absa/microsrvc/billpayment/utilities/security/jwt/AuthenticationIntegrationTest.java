package ug.co.absa.microsrvc.billpayment.utilities.security.jwt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import tech.jhipster.config.JHipsterProperties;
import ug.co.absa.microsrvc.billpayment.utilities.config.SecurityConfiguration;
import ug.co.absa.microsrvc.billpayment.utilities.config.SecurityJwtConfiguration;
import ug.co.absa.microsrvc.billpayment.utilities.config.WebConfigurer;
import ug.co.absa.microsrvc.billpayment.utilities.management.SecurityMetersService;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class,
    }
)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface AuthenticationIntegrationTest {
}
