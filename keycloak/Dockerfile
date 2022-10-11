FROM quay.io/keycloak/keycloak:19.0.3
VOLUME /tmp

COPY Test_realm-realm.json /opt/keycloak/data/import/Test_realm-realm.json

ENTRYPOINT ["/opt/keycloak/bin/kc.sh", "start-dev", "--auto-build", "--import-realm"]

EXPOSE 8079

#1 ./gradlew build
#2 docker compose commands