package net.hrrbrt.tools.i18n.dope.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import net.hrrbrt.tools.i18n.dope.I18NDopeApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = I18NDopeApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
