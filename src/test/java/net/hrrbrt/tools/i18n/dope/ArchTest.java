package net.hrrbrt.tools.i18n.dope;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("net.hrrbrt.tools.i18n.dope");

        noClasses()
            .that()
            .resideInAnyPackage("net.hrrbrt.tools.i18n.dope.service..")
            .or()
            .resideInAnyPackage("net.hrrbrt.tools.i18n.dope.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..net.hrrbrt.tools.i18n.dope.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
