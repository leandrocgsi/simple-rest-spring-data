# Simple RESTFul Example with MySQL and Spring Data

[![Build Status](https://travis-ci.org/leandrocgsi/simple-rest-spring-data.svg?branch=master)](https://travis-ci.org/leandrocgsi/simple-rest-spring-data)
[![Build Status](https://circleci.com/gh/leandrocgsi/simple-rest-spring-data.svg?&style=shield)](https://circleci.com/gh/leandrocgsi/simple-rest-spring-data/)

# Em português

* [Entendendo HATEOAS](http://www.semeru.com.br/blog/entendendo_hateoas/)
* [Aplicações RESTful HATEOAS com SpringBoot](http://www.semeru.com.br/blog/aplicacoes-restfull-hateoas-com-springboot/)

# HATEOAS

[HATEOAS (Hypermedia as the Engine of Application State)](https://spring.io/understanding/HATEOAS) is a constraint of the REST application architecture. A hypermedia-driven site provides information to navigate the site's REST interfaces dynamically by including hypermedia links with the responses. This capability differs from that of SOA-based systems and WSDL-driven interfaces. With SOA, servers and clients usually must access a fixed specification that might be staged somewhere else on the website, on another website, or perhaps distributed by email. According with [Richardson maturity model](http://martinfowler.com/articles/richardsonMaturityModel.html) [HATEOAS](https://spring.io/understanding/HATEOAS) is final level of REST. One API is really [RESTful](https://en.wikipedia.org/wiki/Representational_state_transfer) when implements this standart. Access following address and see the magic.

```bash
	http://localhost:8081/erudio-restful-api/person/findAll
```

```json
[  
    {  
        "idPerson":1,
        "firstName":"Person Name 1",
        "lastName":"Last Name 1",
        "address":"Some Address in Brasil 1",
        "links":[  
            {  
                "rel":"self",
                "href":"http://localhost:8081/erudio-restful-api/person/1"
            }
        ]
    },
    {  
        "idPerson":2,
        "firstName":"Person Name 2",
        "lastName":"Last Name 2",
        "address":"Some Address in Brasil 2",
        "links":[  
            {  
                "rel":"self",
                "href":"http://localhost:8081/erudio-restful-api/person/2"
            }
        ]
    }
]
```

# Swagger API documentation 

By default you can see the documentation API in localhost adress "http://localhost:8080/sdoc.jsp" but as we changed the application context to "/erudio-restful-api" now we can access by follow URL:

```sh
http://localhost:8080/erudio-restful-api/sdoc.jsp
```

As you can see Swagger provide a simple way to document US API's.

![Example Page](https://github.com/leandrocgsi/simple-rest-spring-data/blob/master/img/api-documentation.png?raw=true)

