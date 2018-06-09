# graphql-api

UK Request: 
``` 
{
  "query" : "query { findIdentities(firstName: \"William\" ){ firstName zip  } }"
} 
```
UK Reponse: 
```
{
    "data": {
        "findIdentitiesUs": [
            {
                "firstName": "William",
                "zip": "456"
            }
        ]
    }
}
```
US Request: 
```
{
  "query" : "query { findIdentities(firstName: \"Luke\" ){ firstName postCode  } }"
} 
```
US Reponse:
```
{
    "data": {
        "findIdentities": [
            {
                "firstName": "Luke",
                "postCode": "123"
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

