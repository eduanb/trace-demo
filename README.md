Example project to show trace IDs not working.
Steps to reproduce:
1. Run Zipkin locally `docker run -d -p 9411:9411 openzipkin/zipkin`
2. Run in JVM `./gradlew bootRun` 
3. Call hello controller `curl localhost:8080/hello`
4. See trace in last line in logs
5. Run native `./gradlew nativeRun` 
6. Call hello controller `curl localhost:8080/hello`
7. No trace or span in logs