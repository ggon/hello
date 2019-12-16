.PHONY: compile build

compile:
	./gradlew build

build: compile
	docker build -t hello:latest .

run:
	docker run --network=hellonet -d -p 8080:8080 hello:latest
