# REST API Documentation Notes: REST Countries API

## Endpoints Studied
1. `GET /v3.1/all`
   - **Returns:** An array of JSON objects containing information on all global countries.
   - **HTTP Method:** GET, because it retrieves data without modifying resources.
2. `GET /v3.1/name/{name}`
   - **Returns:** Detailed information for a specific country matching the query name.
   - **HTTP Method:** GET, because it is an idempotent read request.
3. `GET /v3.1/alpha/{code}`
   - **Returns:** Information for a single country matching its 2-letter or 3-letter ISO code.
   - **HTTP Method:** GET, because it targets a specific resource for viewing.

## Handling Non-Existent Resources
When requesting a resource that does not exist (e.g., searching for an invalid country code), the API responds with an HTTP status code `404 Not Found` and a JSON response body containing an error payload such as `{"status": 404, "message": "Not Found"}`.
