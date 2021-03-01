#!/usr/bin/env bash

set -e

./mvnw deploy --settings "`dirname "$0"`/settings.xml" --batch-mode