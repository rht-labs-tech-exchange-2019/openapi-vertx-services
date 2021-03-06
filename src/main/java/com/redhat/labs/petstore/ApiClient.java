package com.redhat.labs.petstore;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.streams.ReadStream;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Base64;

import com.redhat.labs.petstore.models.*;

public class ApiClient {
    private WebClient client;
    private int port;
    private String host;


    private String petstoreAuth_token;
    
    private String apiKey_token;
    

    private MultiMap cookieParams;

    ApiClient(Vertx vertx, String host, int port) {
        client = WebClient.create(vertx, new WebClientOptions().setDefaultHost(host).setDefaultPort(port));
        this.port = port;
        this.host = host;

        cookieParams = MultiMap.caseInsensitiveMultiMap();
    }

    ApiClient(WebClient client) {
        this.client = client;

        cookieParams = MultiMap.caseInsensitiveMultiMap();
    }

    /**
     * Call updatePet with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call updatePet with Json body. 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithJson(
        Pet body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(body.toJson(), handler);
    }

    /**
     * Call updatePet with application/xml buffer body. 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call updatePet with application/xml stream body. 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call addPet with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void addPetWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call addPet with Json body. 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void addPetWithJson(
        Pet body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(body.toJson(), handler);
    }

    /**
     * Call addPet with application/xml buffer body. 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void addPetWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call addPet with application/xml stream body. 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void addPetWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/pet";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call findPetsByStatus with empty body. 
     * 
     * @param status Parameter status inside query
     * @param handler The handler for the asynchronous request
     */
    public void findPetsByStatus(
        List<String> status,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (status == null) throw new NullPointerException("Missing parameter status in query");
        

        // Generate the uri
        String uri = "/pet/findByStatus";

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        if (status != null) this.addQueryArrayFormExplode("status", (List)status, request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call findPetsByTags with empty body. 
     * 
     * @param tags Parameter tags inside query
     * @param handler The handler for the asynchronous request
     */
    public void findPetsByTags(
        List<String> tags,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (tags == null) throw new NullPointerException("Missing parameter tags in query");
        

        // Generate the uri
        String uri = "/pet/findByTags";

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        if (tags != null) this.addQueryArrayFormExplode("tags", (List)tags, request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call getPetById with empty body. 
     * 
     * @param petId Parameter petId inside path
     * @param handler The handler for the asynchronous request
     */
    public void getPetById(
        Long petId,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachApiKeySecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call updatePetWithForm with empty body. 
     * @param petId Parameter petId inside path
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithFormWithEmptyBody(
        Long petId,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call updatePetWithForm with form application/x-www-form-urlencoded body. 
     * @param petId Parameter petId inside path
     * @param form Form that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updatePetWithFormWithForm(
        Long petId,
        MultiMap form, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/x-www-form-urlencoded", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendForm(form, handler);
    }

    /**
     * Call deletePet with empty body. 
     * @param petId Parameter petId inside path
     * @param apiKey Parameter api_key inside header
     * @param handler The handler for the asynchronous request
     */
    public void deletePet(
        Long petId,
        String apiKey,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.delete(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        if (apiKey != null) this.addHeaderParam("api_key", apiKey, request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call uploadFile with empty body. 
     * @param petId Parameter petId inside path
     * @param handler The handler for the asynchronous request
     */
    public void uploadFileWithEmptyBody(
        Long petId,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}/uploadImage";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call uploadFile with form multipart/form-data body. 
     * @param petId Parameter petId inside path
     * @param form Form that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void uploadFileWithMultipartForm(
        Long petId,
        MultiMap form, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (petId == null) throw new NullPointerException("Missing parameter petId in path");
        

        // Generate the uri
        String uri = "/pet/{petId}/uploadImage";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{petId}", this.renderPathParam("petId", petId));
        

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "multipart/form-data", request);
        this.attachPetstoreAuthSecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendForm(form, handler);
    }

    /**
     * Call getInventory with empty body. 
     * 
     * @param handler The handler for the asynchronous request
     */
    public void getInventory(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/store/inventory";

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.attachApiKeySecurity(request, requestCookies);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call placeOrder with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void placeOrderWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/store/order";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call placeOrder with application/xml buffer body. 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void placeOrderWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/store/order";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call placeOrder with application/xml stream body. 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void placeOrderWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/store/order";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call placeOrder with Json body. 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void placeOrderWithJson(
        Order body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/store/order";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(body.toJson(), handler);
    }

    /**
     * Call getOrderById with empty body. 
     * 
     * @param orderId Parameter orderId inside path
     * @param handler The handler for the asynchronous request
     */
    public void getOrderById(
        Long orderId,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (orderId == null) throw new NullPointerException("Missing parameter orderId in path");
        

        // Generate the uri
        String uri = "/store/order/{orderId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{orderId}", this.renderPathParam("orderId", orderId));
        

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call deleteOrder with empty body. 
     * 
     * @param orderId Parameter orderId inside path
     * @param handler The handler for the asynchronous request
     */
    public void deleteOrder(
        Long orderId,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (orderId == null) throw new NullPointerException("Missing parameter orderId in path");
        

        // Generate the uri
        String uri = "/store/order/{orderId}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{orderId}", this.renderPathParam("orderId", orderId));
        

        HttpRequest request = client.delete(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call createUser with empty body. 
     * 
     * @param handler The handler for the asynchronous request
     */
    public void createUserWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call createUser with Json body. 
     * 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUserWithJson(
        User body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(body.toJson(), handler);
    }

    /**
     * Call createUser with application/xml buffer body. 
     * 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUserWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call createUser with application/xml stream body. 
     * 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUserWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call createUsersWithArrayInput with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithArrayInputWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithArray";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call createUsersWithArrayInput with Json body. 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithArrayInputWithJson(
        List<User> body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithArray";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(new JsonArray(body.stream().map(o -> o.toJson()).collect(Collectors.toList())), handler);
    }

    /**
     * Call createUsersWithArrayInput with application/xml buffer body. 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithArrayInputWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithArray";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call createUsersWithArrayInput with application/xml stream body. 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithArrayInputWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithArray";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call createUsersWithListInput with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithListInputWithEmptyBody(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithList";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call createUsersWithListInput with Json body. 
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithListInputWithJson(
        List<User> body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithList";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(new JsonArray(body.stream().map(o -> o.toJson()).collect(Collectors.toList())), handler);
    }

    /**
     * Call createUsersWithListInput with application/xml buffer body. 
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithListInputWithXmlBuffer(
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithList";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call createUsersWithListInput with application/xml stream body. 
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void createUsersWithListInputWithXmlStream(
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/createWithList";

        HttpRequest request = client.post(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call loginUser with empty body. 
     * @param username Parameter username inside query
     * @param password Parameter password inside query
     * @param handler The handler for the asynchronous request
     */
    public void loginUser(
        String username,
        String password,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in query");
        if (password == null) throw new NullPointerException("Missing parameter password in query");
        

        // Generate the uri
        String uri = "/user/login";

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        if (username != null) this.addQueryParam("username", username, request);
        if (password != null) this.addQueryParam("password", password, request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call logoutUser with empty body. 
     * @param handler The handler for the asynchronous request
     */
    public void logoutUser(
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        

        // Generate the uri
        String uri = "/user/logout";

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call getUserByName with empty body. 
     * @param username Parameter username inside path
     * @param handler The handler for the asynchronous request
     */
    public void getUserByName(
        String username,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.get(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call updateUser with empty body. 
     * 
     * @param username Parameter username inside path
     * @param handler The handler for the asynchronous request
     */
    public void updateUserWithEmptyBody(
        String username,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }

    /**
     * Call updateUser with Json body. 
     * 
     * @param username Parameter username inside path
     * @param body  that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updateUserWithJson(
        String username,
        User body, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/json", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendJson(body.toJson(), handler);
    }

    /**
     * Call updateUser with application/xml buffer body. 
     * 
     * @param username Parameter username inside path
     * @param buffer Buffer that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updateUserWithXmlBuffer(
        String username,
        Buffer buffer, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendBuffer(buffer, handler);
    }

    /**
     * Call updateUser with application/xml stream body. 
     * 
     * @param username Parameter username inside path
     * @param stream ReadStream that represents the body of the request
     * @param handler The handler for the asynchronous request
     */
    public void updateUserWithXmlStream(
        String username,
        ReadStream<Buffer> stream, Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.put(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        this.addHeaderParam("Content-Type", "application/xml", request);
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.sendStream(stream, handler);
    }

    /**
     * Call deleteUser with empty body. 
     * 
     * @param username Parameter username inside path
     * @param handler The handler for the asynchronous request
     */
    public void deleteUser(
        String username,
        Handler<AsyncResult<HttpResponse>> handler) {
        // Check required params
        if (username == null) throw new NullPointerException("Missing parameter username in path");
        

        // Generate the uri
        String uri = "/user/{username}";
        uri = uri.replaceAll("\\{{1}([.;?*+]*([^\\{\\}.;?*+]+)[^\\}]*)\\}{1}", "{$2}"); //Remove * . ; ? from url template
        uri = uri.replace("{username}", this.renderPathParam("username", username));
        

        HttpRequest request = client.delete(uri);

        MultiMap requestCookies = MultiMap.caseInsensitiveMultiMap();
        

        this.renderAndAttachCookieHeader(request, requestCookies);
        request.send(handler);
    }


    // Security requirements functions
    private void attachPetstoreAuthSecurity (HttpRequest request, MultiMap cookies) {
        this.addHeaderParam("Authorization", "Bearer " + petstoreAuth_token, request);

    }

    private void attachApiKeySecurity (HttpRequest request, MultiMap cookies) {
        this.addHeaderParam("api_key", this.apiKey_token, request);

    }

    // Security parsedParameters functions
    
    /**
     * Set access token for security scheme petstore_auth
     */
    public void setPetstoreAuthToken(String token) {
        this.petstoreAuth_token = token;
    }
    
    /**
     * Set access token for security scheme api_key
     */
    public void setApiKeyToken(String token) {
        this.apiKey_token = token;
    }
    

    // Parameters functions

    /**
     * Remove a cookie parameter from the cookie cache
     *
     * @param paramName name of cookie parameter
     */
    public void removeCookie(String paramName) {
        cookieParams.remove(paramName);
    }

    private void addQueryParam(String paramName, Object value, HttpRequest request) {
        request.addQueryParam(paramName, String.valueOf(value));
    }

    /**
     * Add a cookie param in cookie cache
     *
     * @param paramName name of cookie parameter
     * @param value value of cookie parameter
     */
    public void addCookieParam(String paramName, Object value) {
        renderCookieParam(paramName, value, cookieParams);
    }

    private void addHeaderParam(String headerName, Object value, HttpRequest request) {
        request.putHeader(headerName, String.valueOf(value));
    }

    private String renderPathParam(String paramName, Object value) {
        return String.valueOf(value);
    }

    private void renderCookieParam(String paramName, Object value, MultiMap map) {
        map.remove(paramName);
        map.add(paramName, String.valueOf(value));
    }

    /**
     * Following this table to implement parsedParameters serialization
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | style          | explode | in            | array                               | object                                 |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | false   | path          | ;color=blue,black,brown             | ;color=R,100,G,200,B,150               |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | true    | path          | ;color=blue;color=black;color=brown | ;R=100;G=200;B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | false   | path          | .blue.black.brown                   | .R.100.G.200.B.150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | true    | path          | .blue.black.brown                   | .R=100.G=200.B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | false   | query, cookie | color=blue,black,brown              | color=R,100,G,200,B,150                |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | true    | query, cookie | color=blue&color=black&color=brown  | R=100&G=200&B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | false   | path, header  | blue,black,brown                    | R,100,G,200,B,150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | true    | path, header  | blue,black,brown                    | R=100,G=200,B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | spaceDelimited | false   | query         | blue%20black%20brown                | R%20100%20G%20200%20B%20150            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | pipeDelimited  | false   | query         | blue|black|brown                    | R|100|G|200                            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | deepObject     | true    | query         | n/a                                 | color[R]=100&color[G]=200&color[B]=150 |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     */

    /**
     * Render path value with matrix style exploded/not exploded
     *
     * @param paramName
     * @param value
     * @return
     */
    private String renderPathMatrix(String paramName, Object value) {
        return ";" + paramName + "=" + String.valueOf(value);
    }

    /**
     * Render path array with matrix style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | false   | path          | ;color=blue,black,brown             | ;color=R,100,G,200,B,150               |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArrayMatrix(String paramName, List<Object> values) {
        String serialized = String.join(",", values.stream().map(object -> encode(String.valueOf(object))).collect(Collectors.toList()));
        return ";" + paramName + "=" + serialized;
    }

    /**
     * Render path object with matrix style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | false   | path          | ;color=blue,black,brown             | ;color=R,100,G,200,B,150               |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectMatrix(String paramName, Map<String, Object> values) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(encode(String.valueOf(entry.getValue())));
        }
        String serialized = String.join(",", listToSerialize);
        return ";" + paramName + "=" + serialized;
    }

    /**
     * Render path array with matrix style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | true    | path          | ;color=blue;color=black;color=brown | ;R=100;G=200;B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArrayMatrixExplode(String paramName, List<Object> values) {
        return String.join("", values.stream().map(object -> ";" + paramName + "=" + encode(String.valueOf(object))).collect(Collectors.toList()));
    }

    /**
     * Render path object with matrix style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | matrix         | true    | path          | ;color=blue;color=black;color=brown | ;R=100;G=200;B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectMatrixExplode(String paramName, Map<String, Object> values) {
      return String.join("", values.entrySet().stream().map(
        entry -> ";" + entry.getKey() + "=" + encode(String.valueOf(entry.getValue()))
      ).collect(Collectors.toList()));
    }

    /**
     * Render path value with label style exploded/not exploded
     *
     * @param paramName
     * @param value
     * @return
     */
    private String renderPathLabel(String paramName, Object value) {
        return "." + String.valueOf(value);
    }

    /**
     * Render path array with label style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | false   | path          | .blue.black.brown                   | .R.100.G.200.B.150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArrayLabel(String paramName, List<Object> values) {
        return "." + String.join(".", values.stream().map(object -> encode(String.valueOf(object))).collect(Collectors.toList()));
    }

    /**
     * Render path object with label style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | false   | path          | .blue.black.brown                   | .R.100.G.200.B.150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectLabel(String paramName, Map<String, Object> values) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(encode(String.valueOf(entry.getValue())));
        }
        return "." + String.join(".", listToSerialize);
    }

    /**
     * Render path array with label style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | true    | path          | .blue.black.brown                   | .R=100.G=200.B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArrayLabelExplode(String paramName, List<Object> values) {
        return renderPathArrayLabel(paramName, values);
    }

    /**
     * Render path object with label style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | label          | true    | path          | .blue.black.brown                   | .R=100.G=200.B=150                     |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectLabelExplode(String paramName, Map<String, Object> values) {
        String result = "";
        for (Map.Entry<String, Object> value : values.entrySet())
            result = result.concat("." + value.getKey() + "=" + encode(String.valueOf(value.getValue())));
        return result;
    }

    /**
     * Render path array with simple style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | false   | path, header  | blue,black,brown                    | R,100,G,200,B,150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArraySimple(String paramName, List<Object> values) {
        return String.join(",", values.stream().map(object -> encode(String.valueOf(object))).collect(Collectors.toList()));
    }

    /**
     * Render path object with simple style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | false   | path, header  | blue,black,brown                    | R,100,G,200,B,150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectSimple(String paramName, Map<String, Object> values) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(encode(String.valueOf(entry.getValue())));
        }
        return String.join(",", listToSerialize);
    }

    /**
     * Render path array with simple style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | true    | path, header  | blue,black,brown                    | R=100,G=200,B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathArraySimpleExplode(String paramName, List<Object> values) {
        return renderPathArraySimple(paramName, values);
    }

    /**
     * Render path object with simple style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | true    | path, header  | blue,black,brown                    | R=100,G=200,B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @return
     */
    private String renderPathObjectSimpleExplode(String paramName, Map<String, Object> values) {
        return String.join(",",
          values.entrySet().stream().map((entry) -> entry.getKey() + "=" + encode(String.valueOf(entry.getValue()))).collect(Collectors.toList()));
    }

    /**
     * Add query array with form style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | false   | query, cookie | color=blue,black,brown              | color=R,100,G,200,B,150                |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryArrayForm(String paramName, List<Object> values, HttpRequest request) {
        String serialized = String.join(",", values.stream().map(object -> String.valueOf(object)).collect(Collectors.toList()));
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add query object with form style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | false   | query, cookie | color=blue,black,brown              | color=R,100,G,200,B,150                |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryObjectForm(String paramName, Map<String, Object> values, HttpRequest request) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(String.valueOf(entry.getValue()));
        }
        String serialized = String.join(",", listToSerialize);
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add cookie array with form style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | false   | query, cookie | color=blue,black,brown              | color=R,100,G,200,B,150                |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     */
    private void renderCookieArrayForm(String paramName, List<Object> values, MultiMap map) {
        String value = String.join(",", values.stream().map(object -> String.valueOf(object)).collect(Collectors.toList()));
        map.remove(paramName);
        map.add(paramName, value);
    }

    /**
     * Add a cookie array parameter in cookie cache
     *
     * @param paramName name of cookie parameter
     * @param values list of values of cookie parameter
     */
    public void addCookieArrayForm(String paramName, List<Object> values) {
        renderCookieArrayForm(paramName, values, cookieParams);
    }

    /**
     * Add cookie object with form style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | false   | query, cookie | color=blue,black,brown              | color=R,100,G,200,B,150                |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     */
    private void renderCookieObjectForm(String paramName, Map<String, Object> values, MultiMap map) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(String.valueOf(entry.getValue()));
        }
        String value = String.join(",", listToSerialize);
        map.remove(paramName);
        map.add(paramName, value);
    }

    /**
     * Add a cookie object parameter in cookie cache
     *
     * @param paramName name of cookie parameter
     * @param values map of values of cookie parameter
     */
    public void addCookieObjectForm(String paramName, Map<String, Object> values) {
        renderCookieObjectForm(paramName, values, cookieParams);
    }

    /**
     * Add query array with form style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | true    | query, cookie | color=blue&color=black&color=brown  | R=100&G=200&B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryArrayFormExplode(String paramName, List<Object> values, HttpRequest request) {
        for (Object value : values)
            this.addQueryParam(paramName, String.valueOf(value), request);
    }

    /**
     * Add query object with form style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | true    | query, cookie | color=blue&color=black&color=brown  | R=100&G=200&B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryObjectFormExplode(String paramName, Map<String, Object> values, HttpRequest request) {
        for (Map.Entry<String, Object> value : values.entrySet())
            this.addQueryParam(value.getKey(), String.valueOf(value.getValue()), request);
    }

    /**
     * Add cookie array with form style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | true    | query, cookie | color=blue&color=black&color=brown  | R=100&G=200&B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     */
    private void renderCookieArrayFormExplode(String paramName, List<Object> values, MultiMap map) {
        map.remove(paramName);
        for (Object value : values)
            map.add(paramName, String.valueOf(value));
    }

    public void addCookieArrayFormExplode(String paramName, List<Object> values) {
        renderCookieArrayFormExplode(paramName, values, cookieParams);
    }

    /**
     * Add cookie object with form style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | form           | true    | query, cookie | color=blue&color=black&color=brown  | R=100&G=200&B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     */
    private void renderCookieObjectFormExplode(String paramName, Map<String, Object> values, MultiMap map) {
        for (Map.Entry<String, Object> value : values.entrySet()) {
            map.remove(value.getKey());
            map.add(value.getKey(), String.valueOf(value.getValue()));
        }
    }

    public void addCookieObjectFormExplode(String paramName, Map<String, Object> values) {
        renderCookieObjectFormExplode(paramName, values, cookieParams);
    }

    /**
     * Add header array with simple style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | false   | path, header  | blue,black,brown                    | R,100,G,200,B,150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param headerName
     * @param values
     * @param request
     */
    private void addHeaderArraySimple(String headerName, List<Object> values, HttpRequest request) {
        String serialized = String.join(",", values.stream().map(object -> String.valueOf(object)).collect(Collectors.toList()));
        this.addHeaderParam(headerName, serialized, request);
    }

    /**
     * Add header object with simple style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | false   | path, header  | blue,black,brown                    | R,100,G,200,B,150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param headerName
     * @param values
     * @param request
     */
    private void addHeaderObjectSimple(String headerName, Map<String, Object> values, HttpRequest request) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(String.valueOf(entry.getValue()));
        }
        String serialized = String.join(",", listToSerialize);
        this.addHeaderParam(headerName, serialized, request);
    }

    /**
     * Add header array with simple style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | true    | path, header  | blue,black,brown                    | R=100,G=200,B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param headerName
     * @param values
     * @param request
     */
    private void addHeaderArraySimpleExplode(String headerName, List<Object> values, HttpRequest request) {
        this.addHeaderArraySimple(headerName, values, request);
    }

    /**
     * Add header object with simple style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | simple         | true    | path, header  | blue,black,brown                    | R=100,G=200,B=150                      |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param headerName
     * @param values
     * @param request
     */
    private void addHeaderObjectSimpleExplode(String headerName, Map<String, Object> values, HttpRequest request) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey() + "=" + String.valueOf(entry.getValue()));
        }
        String serialized = String.join(",", listToSerialize);
        this.addHeaderParam(headerName, serialized, request);
    }

    /**
     * Add query array with spaceDelimited style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | spaceDelimited | false   | query         | blue%20black%20brown                | R%20100%20G%20200%20B%20150            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryArraySpaceDelimited(String paramName, List<Object> values, HttpRequest request) {
        String serialized = String.join(" ", values.stream().map(object -> String.valueOf(object)).collect(Collectors.toList()));
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add query object with spaceDelimited style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | spaceDelimited | false   | query         | blue%20black%20brown                | R%20100%20G%20200%20B%20150            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryObjectSpaceDelimited(String paramName, Map<String, Object> values, HttpRequest request) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(String.valueOf(entry.getValue()));
        }
        String serialized = String.join(" ", listToSerialize);
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add query array with pipeDelimited style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | pipeDelimited  | false   | query         | blue|black|brown                    | R|100|G|200                            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryArrayPipeDelimited(String paramName, List<Object> values, HttpRequest request) {
        String serialized = String.join("|", values.stream().map(object -> String.valueOf(object)).collect(Collectors.toList()));
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add query object with pipeDelimited style and not exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | pipeDelimited  | false   | query         | blue|black|brown                    | R|100|G|200                            |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryObjectPipeDelimited(String paramName, Map<String, Object> values, HttpRequest request) {
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            listToSerialize.add(entry.getKey());
            listToSerialize.add(String.valueOf(entry.getValue()));
        }
        String serialized = String.join("|", listToSerialize);
        this.addQueryParam(paramName, serialized, request); // Encoding is done by WebClient
    }

    /**
     * Add query object with deepObject style and exploded
     *
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     | deepObject     | true    | query         | n/a                                 | color[R]=100&color[G]=200&color[B]=150 |
     +----------------+---------+---------------+-------------------------------------+----------------------------------------+
     *
     * @param paramName
     * @param values
     * @param request
     */
    private void addQueryObjectDeepObjectExplode(String paramName, Map<String, Object> values, HttpRequest request) {
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            this.addQueryParam(paramName + "[" + entry.getKey() + "]", String.valueOf(entry.getValue()), request);
        }
    }


    private void renderAndAttachCookieHeader(HttpRequest request, MultiMap otherCookies) {
        if ((otherCookies == null || otherCookies.isEmpty()) && cookieParams.isEmpty())
            return;
        List<String> listToSerialize = new ArrayList<>();
        for (Map.Entry<String, String> e : cookieParams.entries()) {
            if (otherCookies!= null && !otherCookies.contains(e.getKey())) {
                try {
                    listToSerialize.add(URLEncoder.encode(e.getKey(), "UTF-8") + "=" + URLEncoder.encode(e.getValue(), "UTF-8"));
                } catch (UnsupportedEncodingException e1) {
                }
            }
        }
        if (otherCookies != null) {
            for (Map.Entry<String, String> e : otherCookies.entries()) {
                try {
                    listToSerialize.add(URLEncoder.encode(e.getKey(), "UTF-8") + "=" + URLEncoder.encode(e.getValue(), "UTF-8"));
                } catch (UnsupportedEncodingException e1) {
                }
            }
        }
        request.putHeader("Cookie", String.join("; ", listToSerialize));
    }

    // Other functions

    private String encode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Close the connection with server
     *
     */
    public void close() {
        client.close();
    }

}
