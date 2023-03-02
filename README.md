spring.jpa.hibernate.ddl-auto=update    
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/{database name}
spring.datasource.username={user name}    
spring.datasource.password={user password}    
spring.datasource.driver-class-name =com.mysql.jdbc.Driver 

curl -X POST \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Venus",
        "description": "Earth\u0027s sister",
        "relativeEarthRadius": "0.949",
        "relativeEarthMass": "0.815",
        "relativeEarthGravity": "0.904",
        "orbitPosition": "1"
      }' \
  http://localhost:8080/planets/api/


curl -X PUT \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Venus",
        "description": "Earth\u0027s sister",
        "relativeEarthRadius": "0.949",
        "relativeEarthMass": "0.815",
        "relativeEarthGravity": "0.904",
        "orbitPosition": "2"
      }' \
  http://localhost:8080/planets/api/{id}

curl -X DELETE http://localhost:8080/planets/api/{id}

curl http://localhost:8080/planets/api/{id}
curl http://localhost:8080/planets/api/
