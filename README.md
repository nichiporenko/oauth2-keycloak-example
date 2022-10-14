# Oauth2 + Keycloak setup based on Spring Boot in Docker
Minimal working example of Spring Boot web app with OAuth 2.0, Keycloak. All MicroServices run in Docker Compose.

## Running All Services in Docker Compose
1. Add the following line to file `/etc/hosts` (on Linux) or `C:/Windows/System32/drivers/etc/hosts` (on Windows):
`127.0.0.1 keycloak`
2. Run the `startAll.sh` or `restartAll.sh`
3. When all services are running, in the browser go to: `http://localhost:8072/ui`
4. Use default user: `test:test`

## To Export Keycloak's Realm With Users:
```
docker ps
docker exec -it [container with Keycloak] bash
cd /opt/keycloak
bin/kc.sh export --dir . --realm Test_realm --users realm_file

# View
ls -all
cat Test_realm-realm.json
```
