package org.agoncal.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(info = @Info(title = "Number Microservice", description = "This microservice generates book numbers", version = "1.0.0", contact = @Contact(name = "Ahnaf", email = "ahnaf.tahmid0628@gmail.com")), externalDocs = @ExternalDocumentation(url = "https://github.com/mAhnafTahmid/Quarkus-Microservices-Project.git", description = "All the microservices codes"), tags = {
        @Tag(name = "Api", description = "Public API that can be used by anybody"),
        @Tag(name = "Numbers", description = "Anybody interested in numbers")
})

public class NumberMicroservice extends Application {

}
