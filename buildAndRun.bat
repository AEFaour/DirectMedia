@echo off
call mvn clean package
call docker build -t com.directmedia.onlinestore/core .
call docker rm -f core
call docker run -d -p 9080:9080 -p 9443:9443 --name core com.directmedia.onlinestore/core