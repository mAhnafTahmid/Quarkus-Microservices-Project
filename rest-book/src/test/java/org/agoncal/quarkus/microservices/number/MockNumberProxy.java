package org.agoncal.quarkus.microservices.number;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.test.Mock;

@Mock
@RestClient
public class MockNumberProxy implements NumberProxy {

    @Override
    public IsbnThirteen generateIsbnNumbers() {
        IsbnThirteen isbn = new IsbnThirteen();
        isbn.isbn13 = "13-mock";
        return isbn;
    }

}
