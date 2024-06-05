# Spring Boot 3 Observability with Grafana Stack

This source code demontrates implementing Observability with the Grafana Stack

## Running the project

To run the project, you need to have Docker and Docker Compose installed. Then, run the following command:

```docker compose up -d```

### Run Loan Service Application

```cd loan-service```

```mvn spring-boot:run```

### Run Fraud Detection Service Application

```cd fraud-detection-service```

```mvn spring-boot:run```

### Run Random Name Generation Service Application

```cd random-name-service```

```mvn spring-boot:run```

To access the service, invoke http://localhost:8082/random-name

## Accessing the services
1. Grafana: http://localhost:3000
2. Prometheus: http://localhost:9090
3. Tempo: http://localhost:3110
4. Loki: http://localhost:3100

## Project Overview

![img.png](img.png)
