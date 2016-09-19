/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import retrofit2.Retrofit;
import fixtures.http.HttpServerFailures;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpServerFailures.
 */
public final class HttpServerFailuresImpl implements HttpServerFailures {
    /** The Retrofit service to perform REST calls. */
    private HttpServerFailuresService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpServerFailures.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpServerFailuresImpl(Retrofit retrofit, AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = retrofit.create(HttpServerFailuresService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpServerFailures to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpServerFailuresService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/failure/server/501")
        Observable<Response<Void>> head501();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/failure/server/501")
        Observable<Response<ResponseBody>> get501();

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/failure/server/505")
        Observable<Response<ResponseBody>> post505(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/failure/server/505", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete505(@Body Boolean booleanValue);

    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the Error object if successful.
     */
    public Error head501() {
        return head501WithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> head501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(head501WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> head501Async() {
        return head501WithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> head501WithServiceResponseAsync() {
        return service.head501()
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Error> clientResponse = head501Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> head501Delegate(Response<Void> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Error, ErrorException>(this.client.mapperAdapter())
                .registerError(ErrorException.class)
                .buildEmpty(response);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the Error object if successful.
     */
    public Error get501() {
        return get501WithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> get501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(get501WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> get501Async() {
        return get501WithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> get501WithServiceResponseAsync() {
        return service.get501()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = get501Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> get501Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Error, ErrorException>(this.client.mapperAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the Error object if successful.
     */
    public Error post505() {
        return post505WithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> post505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(post505WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> post505Async() {
        return post505WithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> post505WithServiceResponseAsync() {
        final Boolean booleanValue = null;
        return service.post505(booleanValue)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = post505Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     */
    public Error post505(Boolean booleanValue) {
        return post505WithServiceResponseAsync(booleanValue).toBlocking().single().getBody();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(post505WithServiceResponseAsync(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the observable to the Error object
     */
    public Observable<Error> post505Async(Boolean booleanValue) {
        return post505WithServiceResponseAsync(booleanValue).map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> post505WithServiceResponseAsync(Boolean booleanValue) {
        return service.post505(booleanValue)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = post505Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> post505Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Error, ErrorException>(this.client.mapperAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the Error object if successful.
     */
    public Error delete505() {
        return delete505WithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> delete505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(delete505WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<Error> delete505Async() {
        return delete505WithServiceResponseAsync().map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> delete505WithServiceResponseAsync() {
        final Boolean booleanValue = null;
        return service.delete505(booleanValue)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = delete505Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     */
    public Error delete505(Boolean booleanValue) {
        return delete505WithServiceResponseAsync(booleanValue).toBlocking().single().getBody();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Error> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceCall.create(delete505WithServiceResponseAsync(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the observable to the Error object
     */
    public Observable<Error> delete505Async(Boolean booleanValue) {
        return delete505WithServiceResponseAsync(booleanValue).map(new Func1<ServiceResponse<Error>, Error>() {
            @Override
            public Error call(ServiceResponse<Error> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @return the observable to the Error object
     */
    public Observable<ServiceResponse<Error>> delete505WithServiceResponseAsync(Boolean booleanValue) {
        return service.delete505(booleanValue)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Error>>>() {
                @Override
                public Observable<ServiceResponse<Error>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Error> clientResponse = delete505Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Error> delete505Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Error, ErrorException>(this.client.mapperAdapter())
                .registerError(ErrorException.class)
                .build(response);
    }

}