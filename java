#!/bin/sh -e
# -*- coding: utf-8; mode: sh -*-
CONTAINER=lynxtp/openjdk-jre
VERSION=8
CMD=$(basename $0)
docker run --rm -i -t -v $PWD:/mnt/workdir $CONTAINER:$VERSION $CMD "$@"
exit 0
