#!/bin/bash

docker-compose down --remove-orphans

##### Constants
declare -a Services=("config-server" "discovery-service" "gateway" "ui")

#####
#cd ui
#./gradlew clean build
#cd ..

##### Main
for i in "${Services[@]}"
do
    cd $i 
     ./gradlew bootJar
    cd ..
done

docker-compose up -d --build
#docker-compose up -d --build
docker-compose start
docker-compose logs -f

$SHELL