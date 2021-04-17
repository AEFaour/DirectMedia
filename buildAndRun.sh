#!/bin/sh
mvn clean package && docker build -t com.directmedia.onlinestore/core .
docker rm -f core || true && docker run -d -p 9080:9080 -p 9443:9443 --name core com.directmedia.onlinestore/core