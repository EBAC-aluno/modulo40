curl -X POST \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Mercury",
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
