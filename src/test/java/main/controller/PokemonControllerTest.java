//package main.controller;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpUriRequest;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.protocol.HTTP;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//
//import java.io.IOException;
//
//import static com.sun.javafx.fxml.expression.Expression.equalTo;
//import static org.junit.Assert.assertThat;
//
//public class PokemonControllerTest {
//    @Test
//    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
//            throws IOException {
//        // Given
//        HttpUriRequest request = new HttpGet("https://api.github.com/users/");
//
//        // When
//        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
//
//        // Then
//      //  assertThat(httpResponse.getStatusLine().getStatusCode(), 400);
//    }
//}
