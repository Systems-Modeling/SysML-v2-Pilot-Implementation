#!/usr/bin/env bash

set -e

./mvnw deploy -Dxpect.tests.skip=true --settings "`dirname "$0"`/settings.xml" --batch-mode