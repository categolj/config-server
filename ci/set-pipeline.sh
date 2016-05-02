#!/bin/sh
echo y | fly -t do sp -p blog-config -c pipeline.yml -l ../../credentials.yml
