#!/bin/sh

cd ..
mvn clean package
cd DataStructures
java -jar target/DataStructures-1.0-SNAPSHOT.jar