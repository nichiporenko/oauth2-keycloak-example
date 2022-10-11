#!/bin/bash

docker-compose up -d --build
#docker-compose up -d --build
docker-compose start
docker-compose logs -f

$SHELL