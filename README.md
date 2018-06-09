# graphql-api

UK Request: 
``` 
{
  "query" : "query { findIdentities( requestUk: { firstName: \"Luke\", postCode: \"123\" } ){ firstName lastName postCode } }"
} 
```
UK Reponse: 
```
{
    "data": {
        "findIdentities": [
            {
                "firstName": "Luke",
                "lastName": "Miller",
                "postCode": "123"
            }
        ]
    }
}
```
US Request: 
```
{
  "query" : "query { findIdentities( requestUs: { firstName: \"David\", zip: \"123\" } ){ firstName lastName zip } }"
}  
```
US Reponse:
```
{
    "data": {
        "findIdentities": [
            {
                "firstName": "David",
                "lastName": "Robinson",
                "zip": "123"
            }
        ]
    }
}
```

In order to switch API implementation from US to UK change api-us dependency in api-core/pom.xml to :

```
        <dependency>
            <groupId>poc</groupId>
            <artifactId>api-uk</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

