# Distributed tracing with Spring cloud sleuth

In this project I have figured out how we can integrate distributed tracing using spring cloud sleuth. 

You can read about this on my website [https://refactorfirst.com](https://refactorfirst.com)

Once you build the application using `mvn clean verify`, You can start the application as two service instances. 

Service 1
```
java -jar \
target/Distributed-Service-0.0.1-SNAPSHOT.jar \
--spring.application.name=Service-1 \
--server.port=8080
```

Service 2
```
java -jar \
target/Distributed-Service-0.0.1-SNAPSHOT.jar \
--spring.application.name=Service-2 \
--server.port=8090
```


I further go to integrate the visual tool called ZipKin in order to visualize the traces.

![zipkin trace](../readme-images/zipkin-image.png)

Here are some trace details when a rest client sent out  request and then the second server receives it, processes the request, and returns the response.

![Zipkin trace details](../readme-images/zipkin-trace-details.png)