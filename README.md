Example project to show trace IDs are not working in reactive, native application.
Steps to reproduce:
1. Run Zipkin locally `docker run -d -p 9411:9411 openzipkin/zipkin`
2. Run in JVM `./gradlew bootRun` 
3. Call hello controller `curl localhost:8080/hello`
4. See trace IDs in the last line in logs. Example:
`"traceId":"ad059514c330cf7d8bcafe1f8832f0a1","spanId":"a403bd6d1813b7b2"`
5. Run native `./gradlew nativeRun` 
6. Call hello controller `curl localhost:8080/hello`
7. No trace or span in logs. Example:
`"traceId":"","spanId":""`