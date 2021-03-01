#!/usr/bin/env bash

set -e

./mvnw versions:set -DremoveSnapshot=true --batch-mode
. "`dirname "$0"`/deploy.sh"