#!/bin/bash
#1.4



ant -buildfile build.xml run
if [ $? -eq 1]; then
echo "Failed on Build"
exit 1
fi 
