#!/usr/bin/env bash

mvn package
java -jar $(ls target/*fat.jar) \
    --redeploy="src/**/*.js,src/**/*.java,src/**/*.html" \
    --on-redeploy="./run.sh"