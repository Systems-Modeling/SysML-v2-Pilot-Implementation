#!/usr/bin/env bash

set -e

mvn deploy --settings "`dirname "$0"`/settings.xml" --batch-mode