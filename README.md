# Annuity Plan - Using Recursion and BigDecimal

- git clone https://github.com/palaec/Lendico.git

## Usage

- Directly using maven
```
mvn spring-boot:run
```

- From within your IDE right click run 
```
AnnuityplanApplication.java
```

- API to call (POST request) 
```
localhost:8080/generate-plan
```
- POST request body
```
{ "loanAmount": "5000", "nominalRate": "5.0", "duration": 24, "startDate": "2018-01-01T00:00:01Z" }

