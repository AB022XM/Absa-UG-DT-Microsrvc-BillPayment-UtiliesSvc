package ug.co.absa.microsrvc.billpayment.utilities;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import ug.co.absa.microsrvc.billpayment.utilities.AbsaUgdtMicroSvcApp;
import ug.co.absa.microsrvc.billpayment.utilities.config.AsyncSyncConfiguration;
import ug.co.absa.microsrvc.billpayment.utilities.config.EmbeddedElasticsearch;
import ug.co.absa.microsrvc.billpayment.utilities.config.EmbeddedKafka;
import ug.co.absa.microsrvc.billpayment.utilities.config.EmbeddedSQL;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AbsaUgdtMicroSvcApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
