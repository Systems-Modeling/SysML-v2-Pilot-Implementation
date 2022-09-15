#!/usr/bin/env bash

set -e

./mvnw versions:set -Dxpect.tests.skip=true -DremoveSnapshot=true --batch-mode
. "`dirname "$0"`/deploy.sh"