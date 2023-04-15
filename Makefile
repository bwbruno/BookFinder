include .env.example

build:
	./mvnw package -f pom.xml

run-client:
	java -jar client/target/client-0.0.1.jar

run-servers: library-1

library-1:
	@echo PORT=${PORT}
	java -jar server/target/server-0.0.1.jar