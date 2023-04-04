## Micronaut 3.8.8 Documentation

- [User Guide](https://docs.micronaut.io/3.8.8/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.8/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.8/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Run Application
###Dockerising
1. Jump inside ./micronautdemo
2. docker build -t micronautdemo .
3. docker run -p 3333:8080 micronautdemo

###Success scenario: 

http://localhost:3333/employee/1

http://localhost:3333/employee/2

http://localhost:3333/employee/3

http://localhost:3333/employee/5

http://localhost:3333/employee/5

###Fail scenario
http://localhost:3333/employee/6