#!/usr/bin/env bash

set -e

mvn versions:set -DremoveSnapshot=true --batch-mode
. "`dirname "$0"`/deploy.sh"